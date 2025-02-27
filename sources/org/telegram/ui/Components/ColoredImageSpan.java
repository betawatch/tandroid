package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.Theme;

/* loaded from: classes3.dex */
public class ColoredImageSpan extends ReplacementSpan {
    private float alpha;
    private Runnable checkColorDelegate;
    int colorKey;
    public Drawable drawable;
    int drawableColor;
    private Paint.FontMetricsInt fontMetrics;
    private boolean isRelativeSize;
    private int overrideColor;
    public boolean recolorDrawable;
    private float rotate;
    private float scaleX;
    private float scaleY;
    private int size;
    private int sizeWidth;
    public float spaceScaleX;
    private int topOffset;
    private float translateX;
    private float translateY;
    public boolean useLinkPaintColor;
    boolean usePaintColor;
    private final int verticalAlignment;

    public ColoredImageSpan(int i) {
        this(i, 0);
    }

    public ColoredImageSpan(int i, int i2) {
        this(ContextCompat.getDrawable(ApplicationLoader.applicationContext, i).mutate(), i2);
    }

    public ColoredImageSpan(Drawable drawable) {
        this(drawable, 0);
    }

    public ColoredImageSpan(Drawable drawable, int i) {
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
        this.verticalAlignment = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        int i6;
        float alpha;
        float f2;
        Runnable runnable = this.checkColorDelegate;
        if (runnable != null) {
            runnable.run();
        } else if (this.recolorDrawable) {
            int i7 = this.overrideColor;
            if (i7 == 0) {
                if (this.useLinkPaintColor && (paint instanceof TextPaint)) {
                    i7 = ((TextPaint) paint).linkColor;
                } else {
                    if (this.usePaintColor) {
                        i7 = paint.getColor();
                        z = true;
                        if (this.drawableColor != i7) {
                            this.drawableColor = i7;
                            this.drawable.setColorFilter(new PorterDuffColorFilter(this.drawableColor, PorterDuff.Mode.SRC_IN));
                        }
                        canvas.save();
                        Drawable drawable = this.drawable;
                        int i8 = i5 - (drawable != null ? drawable.getBounds().bottom : i5);
                        i6 = this.verticalAlignment;
                        if (i6 != 1) {
                            if (i6 == 2) {
                                int i9 = i3 + ((i5 - i3) / 2);
                                Drawable drawable2 = this.drawable;
                                i8 = i9 - (drawable2 != null ? drawable2.getBounds().height() / 2 : 0);
                            } else if (i6 == 0) {
                                int i10 = i5 - i3;
                                int i11 = this.size;
                                if (i11 == 0) {
                                    i11 = this.drawable.getIntrinsicHeight();
                                }
                                i8 = AndroidUtilities.dp(this.topOffset) + i3 + ((i10 - i11) / 2);
                            }
                        }
                        canvas.translate(f + this.translateX, i8 + this.translateY);
                        if (this.drawable != null) {
                            float f3 = this.scaleX;
                            if (f3 != 1.0f || this.scaleY != 1.0f) {
                                canvas.scale(f3, this.scaleY, 0.0f, r5.getBounds().centerY());
                            }
                            float f4 = this.rotate;
                            if (f4 != 1.0f) {
                                canvas.rotate(f4, this.drawable.getBounds().centerX(), this.drawable.getBounds().centerY());
                            }
                            Drawable drawable3 = this.drawable;
                            if (z) {
                                alpha = this.alpha * 255.0f;
                                f2 = paint.getAlpha() / Color.alpha(this.drawableColor);
                            } else {
                                alpha = paint.getAlpha();
                                f2 = this.alpha;
                            }
                            drawable3.setAlpha((int) (alpha * f2));
                            this.drawable.draw(canvas);
                        }
                        canvas.restore();
                    }
                    i7 = Theme.getColor(this.colorKey);
                }
            }
            z = false;
            if (this.drawableColor != i7) {
            }
            canvas.save();
            Drawable drawable4 = this.drawable;
            int i82 = i5 - (drawable4 != null ? drawable4.getBounds().bottom : i5);
            i6 = this.verticalAlignment;
            if (i6 != 1) {
            }
            canvas.translate(f + this.translateX, i82 + this.translateY);
            if (this.drawable != null) {
            }
            canvas.restore();
        }
        z = false;
        canvas.save();
        Drawable drawable42 = this.drawable;
        int i822 = i5 - (drawable42 != null ? drawable42.getBounds().bottom : i5);
        i6 = this.verticalAlignment;
        if (i6 != 1) {
        }
        canvas.translate(f + this.translateX, i822 + this.translateY);
        if (this.drawable != null) {
        }
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float abs;
        int i3;
        if (this.isRelativeSize && this.fontMetrics != null) {
            if (fontMetricsInt == null) {
                fontMetricsInt = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt2 = this.fontMetrics;
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
            abs = Math.abs(this.scaleX) * Math.abs(this.spaceScaleX);
            i3 = this.size;
        } else if (this.sizeWidth != 0) {
            abs = Math.abs(this.scaleX);
            i3 = this.sizeWidth;
        } else {
            abs = Math.abs(this.scaleX) * Math.abs(this.spaceScaleX);
            i3 = this.size;
            if (i3 == 0) {
                i3 = this.drawable.getIntrinsicWidth();
            }
        }
        return (int) (abs * i3);
    }

    public void rotate(float f) {
        this.rotate = f;
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setColorKey(int i) {
        this.colorKey = i;
        this.usePaintColor = i < 0;
    }

    public void setOverrideColor(int i) {
        this.overrideColor = i;
    }

    public void setRelativeSize(Paint.FontMetricsInt fontMetricsInt) {
        this.isRelativeSize = true;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            setSize(Math.abs(fontMetricsInt.descent) + Math.abs(this.fontMetrics.ascent));
            if (this.size == 0) {
                setSize(AndroidUtilities.dp(20.0f));
            }
        }
    }

    public void setScale(float f) {
        this.scaleX = f;
    }

    public void setScale(float f, float f2) {
        this.scaleX = f;
        this.scaleY = f2;
    }

    public void setSize(int i) {
        this.size = i;
        this.drawable.setBounds(0, 0, i, i);
    }

    public void setTopOffset(int i) {
        this.topOffset = i;
    }

    public void setTranslateX(float f) {
        this.translateX = f;
    }

    public void setTranslateY(float f) {
        this.translateY = f;
    }

    public void setWidth(int i) {
        this.sizeWidth = i;
    }

    public void translate(float f, float f2) {
        this.translateX = f;
        this.translateY = f2;
    }
}
