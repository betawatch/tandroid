package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class cq extends ReplacementSpan {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_DEFAULT = 0;
    private float alpha;
    private Runnable checkColorDelegate;
    int colorKey;
    public boolean draw;
    public Drawable drawable;
    int drawableColor;
    private Paint.FontMetricsInt fontMetrics;
    private boolean isRelativeSize;
    private int overrideColor;
    public boolean recolorDrawable;
    public float rotate;
    private float scaleX;
    private float scaleY;
    private int size;
    private int sizeWidth;
    public float spaceScaleX;
    private int topOffset;
    public float translateX;
    public float translateY;
    public boolean useLinkPaintColor;
    boolean usePaintColor;
    private final int verticalAlignment;

    public cq(int i10) {
        this(i10, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003d  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        boolean z10;
        int i15;
        if (this.draw) {
            Runnable runnable = this.checkColorDelegate;
            if (runnable != null) {
                runnable.run();
            } else if (this.recolorDrawable) {
                int i16 = this.overrideColor;
                if (i16 == 0) {
                    if (this.useLinkPaintColor && (paint instanceof TextPaint)) {
                        i16 = ((TextPaint) paint).linkColor;
                    } else {
                        if (this.usePaintColor) {
                            i16 = paint.getColor();
                            z10 = true;
                            if (this.drawableColor != i16) {
                                this.drawableColor = i16;
                                this.drawable.setColorFilter(new PorterDuffColorFilter(this.drawableColor, PorterDuff.Mode.SRC_IN));
                            }
                            canvas.save();
                            Drawable drawable = this.drawable;
                            int i17 = i14 - (drawable != null ? drawable.getBounds().bottom : i14);
                            i15 = this.verticalAlignment;
                            if (i15 != 1) {
                                if (i15 == 2) {
                                    int B = i0.a.B(i14, i12, 2, i12);
                                    Drawable drawable2 = this.drawable;
                                    i17 = B - (drawable2 != null ? drawable2.getBounds().height() / 2 : 0);
                                } else if (i15 == 0) {
                                    int i18 = i14 - i12;
                                    int i19 = this.size;
                                    if (i19 == 0) {
                                        i19 = this.drawable.getIntrinsicHeight();
                                    }
                                    i17 = i0.a.B(i18, i19, 2, i12) + AndroidUtilities.dp(this.topOffset);
                                }
                            }
                            canvas.translate(f10 + this.translateX, i17 + this.translateY);
                            if (this.drawable != null) {
                                float f11 = this.scaleX;
                                if (f11 != 1.0f || this.scaleY != 1.0f) {
                                    canvas.scale(f11, this.scaleY, 0.0f, r5.getBounds().centerY());
                                }
                                float f12 = this.rotate;
                                if (f12 != 1.0f) {
                                    canvas.rotate(f12, this.drawable.getBounds().centerX(), this.drawable.getBounds().centerY());
                                }
                                if (z10) {
                                    this.drawable.setAlpha((int) ((paint.getAlpha() / Color.alpha(this.drawableColor)) * this.alpha * 255.0f));
                                } else {
                                    this.drawable.setAlpha((int) (paint.getAlpha() * this.alpha));
                                }
                                this.drawable.draw(canvas);
                            }
                            canvas.restore();
                        }
                        i16 = org.telegram.ui.ActionBar.g6.w0(null, this.colorKey, false);
                    }
                }
                z10 = false;
                if (this.drawableColor != i16) {
                }
                canvas.save();
                Drawable drawable3 = this.drawable;
                int i172 = i14 - (drawable3 != null ? drawable3.getBounds().bottom : i14);
                i15 = this.verticalAlignment;
                if (i15 != 1) {
                }
                canvas.translate(f10 + this.translateX, i172 + this.translateY);
                if (this.drawable != null) {
                }
                canvas.restore();
            }
            z10 = false;
            canvas.save();
            Drawable drawable32 = this.drawable;
            int i1722 = i14 - (drawable32 != null ? drawable32.getBounds().bottom : i14);
            i15 = this.verticalAlignment;
            if (i15 != 1) {
            }
            canvas.translate(f10 + this.translateX, i1722 + this.translateY);
            if (this.drawable != null) {
            }
            canvas.restore();
        }
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (!this.isRelativeSize || this.fontMetrics == null) {
            if (this.sizeWidth != 0) {
                return (int) (Math.abs(this.scaleX) * this.sizeWidth);
            }
            float abs = Math.abs(this.spaceScaleX) * Math.abs(this.scaleX);
            int i12 = this.size;
            if (i12 == 0) {
                i12 = this.drawable.getIntrinsicWidth();
            }
            return (int) (abs * i12);
        }
        if (fontMetricsInt == null) {
            fontMetricsInt = new Paint.FontMetricsInt();
        }
        Paint.FontMetricsInt fontMetricsInt2 = this.fontMetrics;
        fontMetricsInt.ascent = fontMetricsInt2.ascent;
        fontMetricsInt.descent = fontMetricsInt2.descent;
        fontMetricsInt.top = fontMetricsInt2.top;
        fontMetricsInt.bottom = fontMetricsInt2.bottom;
        return (int) (Math.abs(this.spaceScaleX) * Math.abs(this.scaleX) * this.size);
    }

    public void rotate(float f10) {
        this.rotate = f10;
    }

    public void setAlpha(float f10) {
        this.alpha = f10;
    }

    public void setCheckColorDelegate(Runnable runnable) {
        this.checkColorDelegate = runnable;
    }

    public void setColorKey(int i10) {
        this.colorKey = i10;
        this.usePaintColor = i10 < 0;
    }

    public void setOverrideColor(int i10) {
        this.overrideColor = i10;
    }

    public void setRelativeSize(Paint.FontMetricsInt fontMetricsInt) {
        this.isRelativeSize = true;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            setSize(Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent));
            if (this.size == 0) {
                setSize(AndroidUtilities.dp(20.0f));
            }
        }
    }

    public void setScale(float f10) {
        this.scaleX = f10;
    }

    public void setSize(int i10) {
        this.size = i10;
        this.drawable.setBounds(0, 0, i10, i10);
    }

    public void setTopOffset(int i10) {
        this.topOffset = i10;
    }

    public void setTranslateX(float f10) {
        this.translateX = f10;
    }

    public void setTranslateY(float f10) {
        this.translateY = f10;
    }

    public void setWidth(int i10) {
        this.sizeWidth = i10;
    }

    public void translate(float f10, float f11) {
        this.translateX = f10;
        this.translateY = f11;
    }

    public cq(Drawable drawable) {
        this(0, drawable);
    }

    public void setScale(float f10, float f11) {
        this.scaleX = f10;
        this.scaleY = f11;
    }

    public cq(int i10, int i11) {
        this(i11, ApplicationLoader.applicationContext.getDrawable(i10).mutate());
    }

    public cq(int i10, Drawable drawable) {
        this.draw = true;
        this.recolorDrawable = true;
        this.usePaintColor = true;
        this.useLinkPaintColor = false;
        this.topOffset = 0;
        this.alpha = 1.0f;
        this.spaceScaleX = 1.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.drawable = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        this.verticalAlignment = i10;
    }
}
