// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class dv3 extends EditTextBoldCursor {
    public final Canvas M1;
    public final TextPaint N1;
    public final Paint O1;
    public Bitmap P1;
    public boolean Q1;
    public int R1;
    public float S1;
    public int T1;
    public final zx2 U1;
    public RectF[] V1;
    public RectF W1;
    public boolean X1;
    public float Y1;
    public boolean Z1;
    public int[] a2;
    public long b2;
    public int c2;
    public Paint d2;
    public final Path e2;
    public final RectF f2;
    public final RectF g2;

    public dv3(Context context) {
        super(context);
        this.M1 = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.N1 = textPaint;
        this.O1 = new Paint(1);
        this.U1 = new zx2();
        this.c2 = TLObject.FLAG_31;
        this.e2 = new Path();
        this.f2 = new RectF();
        this.g2 = new RectF();
        this.R1 = 0;
        setInputType(getInputType() | 655360);
        this.Q1 = true;
        this.X1 = true;
        setFrameRoundRadius(gm.L(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f) {
        if (Math.abs(this.Y1 - f) > 0.1f) {
            this.Y1 = f;
            this.O1.setPathEffect(new CornerPathEffect(f));
        }
    }

    public final boolean A(long j) {
        this.b2 = j;
        if (this.a2 == null) {
            return false;
        }
        int B = B(j);
        if (B < 0) {
            B = -1;
        } else if (j - this.a2[(B << 2) + 2] < 240) {
            B = -2;
        }
        if (B == this.c2 && B != -2) {
            return false;
        }
        this.c2 = B;
        invalidate();
        return true;
    }

    public final int B(long j) {
        int i;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            i = i2;
            i2 = i4;
            if ((i2 << 2) + 3 >= this.a2.length || r4[r2 + 2] > j) {
                break;
            }
            i3 = i2 + 1;
        }
        return i;
    }

    public final boolean C(Layout layout, int i, RectF rectF) {
        int[] iArr = this.a2;
        int i2 = i << 2;
        int i3 = iArr[i2];
        int i4 = iArr[i2 + 1];
        if (i3 >= 0 && i3 < i4 && i4 <= layout.getText().length()) {
            Path path = this.e2;
            path.rewind();
            layout.getSelectionPath(i3, i4, path);
            path.computeBounds(rectF, false);
            if (!rectF.isEmpty()) {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                float lineBaseline = layout.getLineBaseline(layout.getLineForOffset(i3));
                float textSize = getTextSize() * 0.14f;
                rectF.set(rectF.left - textSize, ((fontMetrics.ascent * 0.86f) + lineBaseline) - textSize, rectF.right + textSize, ts2.i(fontMetrics.descent, 0.9f, lineBaseline, textSize));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0457  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int B;
        float f;
        float f2;
        Paint paint;
        boolean z;
        RectF rectF;
        int i = 0;
        if (this.P1 != null && this.R1 != 0) {
            boolean z2 = this.Q1;
            TextPaint textPaint = this.N1;
            if (z2) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                Editable text = getText();
                Bitmap bitmap = this.P1;
                Canvas canvas2 = this.M1;
                canvas2.setBitmap(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                float f3 = this.S1;
                if (f3 <= 0.0f) {
                    f3 = (float) Math.ceil(getTextSize() / 11.5f);
                }
                textPaint.setStrokeWidth(f3);
                textPaint.setColor(this.R1);
                textPaint.setTextSize(getTextSize());
                textPaint.setTypeface(getTypeface());
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                if (getLayout() != null) {
                    alignment = getLayout().getAlignment();
                }
                StaticLayout staticLayout = new StaticLayout(text, textPaint, measuredWidth, alignment, 1.0f, 0.0f, true);
                canvas2.save();
                canvas2.translate(getPaddingLeft(), ((((measuredHeight - getPaddingTop()) - getPaddingBottom()) - staticLayout.getHeight()) / 2.0f) + getPaddingTop());
                staticLayout.draw(canvas2);
                canvas2.restore();
                this.Q1 = false;
            }
            canvas.drawBitmap(this.P1, 0.0f, 0.0f, textPaint);
        }
        float f4 = 1.0f;
        if (this.T1 != 0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            int i2 = this.T1;
            Paint paint2 = this.O1;
            paint2.setColor(i2);
            Layout layout = getLayout();
            if (layout == null) {
                super.onDraw(canvas);
                return;
            }
            RectF[] rectFArr = this.V1;
            if (rectFArr == null || rectFArr.length != layout.getLineCount()) {
                this.V1 = new RectF[layout.getLineCount()];
                this.X1 = true;
            }
            if (this.X1) {
                this.X1 = false;
                for (int i3 = 0; i3 < layout.getLineCount(); i3++) {
                    RectF[] rectFArr2 = this.V1;
                    if (rectFArr2[i3] == null) {
                        rectFArr2[i3] = new RectF();
                    }
                    this.V1[i3].set(layout.getLineLeft(i3), layout.getLineTop(i3), layout.getLineRight(i3), layout.getLineBottom(i3));
                    float width = this.V1[i3].width();
                    float L = gm.L(1.0f);
                    RectF[] rectFArr3 = this.V1;
                    if (width > L) {
                        rectFArr3[i3].inset(this.Z1 ? (-getTextSize()) * 0.26f : (-getTextSize()) / 3.0f, 0.0f);
                        RectF rectF2 = this.V1[i3];
                        rectF2.top = gm.N(1.2f) + rectF2.top;
                        RectF rectF3 = this.V1[i3];
                        rectF3.bottom = gm.N(1.0f) + rectF3.bottom;
                        this.V1[i3].left = Math.max(getScrollX() - getPaddingLeft(), this.V1[i3].left);
                        this.V1[i3].right = Math.min((getWidth() + getScrollX()) - getPaddingLeft(), this.V1[i3].right);
                    } else {
                        RectF rectF4 = rectFArr3[i3];
                        rectF4.left = rectF4.right;
                    }
                    if (this.Z1 && this.V1[i3].width() > 0.0f) {
                        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                        float lineBaseline = layout.getLineBaseline(i3);
                        float textSize = getTextSize() * 0.26f;
                        this.V1[i3].top = Math.max(-getPaddingTop(), ((fontMetrics.ascent * 0.86f) + lineBaseline) - textSize);
                        this.V1[i3].bottom = Math.min(getHeight() - getPaddingTop(), (fontMetrics.descent * 0.9f) + lineBaseline + textSize);
                    }
                    if (i3 > 0) {
                        int i4 = i3 - 1;
                        if (this.V1[i4].width() > 0.0f) {
                            RectF[] rectFArr4 = this.V1;
                            rectFArr4[i4].bottom = rectFArr4[i3].top;
                        }
                    }
                }
                RectF rectF5 = this.W1;
                if (rectF5 == null) {
                    rectF5 = new RectF();
                    this.W1 = rectF5;
                }
                rectF5.left = getMeasuredWidth();
                this.W1.top = getMeasuredHeight();
                RectF rectF6 = this.W1;
                rectF6.bottom = 0.0f;
                rectF6.right = 0.0f;
                int i5 = 0;
                while (true) {
                    int length = this.V1.length;
                    rectF = this.W1;
                    if (i5 >= length) {
                        break;
                    }
                    rectF.left = Math.min(rectF.left, getPaddingLeft() + this.V1[i5].left);
                    RectF rectF7 = this.W1;
                    rectF7.top = Math.min(rectF7.top, getPaddingTop() + this.V1[i5].top);
                    RectF rectF8 = this.W1;
                    rectF8.right = Math.max(rectF8.right, getPaddingLeft() + this.V1[i5].right);
                    RectF rectF9 = this.W1;
                    rectF9.bottom = Math.max(rectF9.bottom, getPaddingTop() + this.V1[i5].bottom);
                    i5++;
                }
                float measuredWidth2 = getMeasuredWidth();
                RectF rectF10 = this.W1;
                rectF.right = measuredWidth2 - rectF10.right;
                rectF10.bottom = getMeasuredHeight() - this.W1.bottom;
            }
            zx2 zx2Var = this.U1;
            zx2Var.rewind();
            float textSize2 = getTextSize() / 3.0f;
            float f5 = 1.5f * textSize2;
            int i6 = 1;
            while (true) {
                RectF[] rectFArr5 = this.V1;
                if (i6 >= rectFArr5.length) {
                    break;
                }
                RectF rectF11 = rectFArr5[i6 - 1];
                RectF rectF12 = rectFArr5[i6];
                if (rectF11.width() >= gm.L(1.0f) && rectF12.width() >= gm.L(1.0f)) {
                    if (Math.abs(rectF11.left - rectF12.left) < f5) {
                        float min = Math.min(rectF12.left, rectF11.left);
                        rectF11.left = min;
                        rectF12.left = min;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Math.abs(rectF11.right - rectF12.right) < f5) {
                        float max = Math.max(rectF12.right, rectF11.right);
                        rectF11.right = max;
                        rectF12.right = max;
                        z = true;
                    }
                    if (z) {
                        for (int i7 = i6; i7 >= 1; i7--) {
                            RectF[] rectFArr6 = this.V1;
                            RectF rectF13 = rectFArr6[i7 - 1];
                            RectF rectF14 = rectFArr6[i7];
                            if (rectF13.width() >= gm.L(1.0f) && rectF14.width() >= gm.L(1.0f)) {
                                if (Math.abs(rectF13.left - rectF14.left) < f5) {
                                    float min2 = Math.min(rectF14.left, rectF13.left);
                                    rectF13.left = min2;
                                    rectF14.left = min2;
                                }
                                if (Math.abs(rectF13.right - rectF14.right) < f5) {
                                    float max2 = Math.max(rectF14.right, rectF13.right);
                                    rectF13.right = max2;
                                    rectF14.right = max2;
                                }
                            }
                        }
                    }
                }
                i6++;
            }
            while (true) {
                RectF[] rectFArr7 = this.V1;
                if (i >= rectFArr7.length) {
                    break;
                }
                if (rectFArr7[i].width() != 0.0f) {
                    zx2Var.addRect(this.V1[i], Path.Direction.CW);
                }
                i++;
            }
            zx2Var.a();
            setFrameRoundRadius(textSize2);
            canvas.drawPath(zx2Var, paint2);
            canvas.restore();
        } else {
            this.W1 = null;
        }
        Layout layout2 = getLayout();
        if (this.a2 != null && layout2 != null && (B = B(this.b2)) >= 0) {
            RectF rectF15 = this.f2;
            if (C(layout2, B, rectF15)) {
                long j = this.b2 - this.a2[(B << 2) + 2];
                if (B > 0) {
                    RectF rectF16 = this.g2;
                    if (C(layout2, B - 1, rectF16) && Math.abs(rectF16.centerY() - rectF15.centerY()) < 1.0f) {
                        if (j < 240) {
                            float interpolation = d53.h.getInterpolation(j / 240.0f);
                            rectF15.set(gm.R1(rectF16.left, rectF15.left, interpolation), gm.R1(rectF16.top, rectF15.top, interpolation), gm.R1(rectF16.right, rectF15.right, interpolation), gm.R1(rectF16.bottom, rectF15.bottom, interpolation));
                            f = 1.0f - (((float) Math.sin(interpolation * 3.141592653589793d)) * 0.2f);
                            float f6 = f4;
                            f4 = f;
                            f2 = f6;
                            paint = this.d2;
                            if (paint == null) {
                                paint = new Paint(1);
                                this.d2 = paint;
                            }
                            paint.setColor(cmb.p1(f2 * 0.3f, getCurrentTextColor()));
                            float textSize3 = getTextSize() * 0.25f;
                            canvas.save();
                            canvas.translate(getPaddingLeft(), getPaddingTop());
                            canvas.scale(f4, f4, rectF15.centerX(), rectF15.centerY());
                            canvas.drawRoundRect(rectF15, textSize3, textSize3, this.d2);
                            canvas.restore();
                        } else {
                            f2 = 1.0f;
                            paint = this.d2;
                            if (paint == null) {
                            }
                            paint.setColor(cmb.p1(f2 * 0.3f, getCurrentTextColor()));
                            float textSize32 = getTextSize() * 0.25f;
                            canvas.save();
                            canvas.translate(getPaddingLeft(), getPaddingTop());
                            canvas.scale(f4, f4, rectF15.centerX(), rectF15.centerY());
                            canvas.drawRoundRect(rectF15, textSize32, textSize32, this.d2);
                            canvas.restore();
                        }
                    }
                }
                f4 = d53.h.getInterpolation(Math.min(1.0f, j / 220.0f));
                f = 0.75f + (f4 * 0.25f);
                float f62 = f4;
                f4 = f;
                f2 = f62;
                paint = this.d2;
                if (paint == null) {
                }
                paint.setColor(cmb.p1(f2 * 0.3f, getCurrentTextColor()));
                float textSize322 = getTextSize() * 0.25f;
                canvas.save();
                canvas.translate(getPaddingLeft(), getPaddingTop());
                canvas.scale(f4, f4, rectF15.centerX(), rectF15.centerY());
                canvas.drawRoundRect(rectF15, textSize322, textSize322, this.d2);
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i != i3) {
            this.X1 = true;
            invalidate();
        }
    }

    @Override // vu3, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            this.P1 = null;
            return;
        }
        this.Q1 = true;
        this.X1 = true;
        Bitmap bitmap = this.P1;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.P1 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.Q1 = true;
        this.X1 = true;
    }

    public void setFrameColor(int i) {
        int i2 = this.T1;
        if (i2 == 0 && i != 0) {
            setPadding(gm.L(19.0f), gm.L(7.0f), gm.L(19.0f), gm.L(7.0f));
            setCursorColor(-1);
        } else if (i2 != 0 && i == 0) {
            setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
            setCursorColor(-1);
        }
        this.T1 = i;
        if (i != 0) {
            float B = gm.B(i);
            if (B == 0.0f) {
                B = Color.red(this.T1) / 255.0f;
            }
            if (B > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.X1 = true;
        }
        this.Q1 = true;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(i);
        this.Q1 = true;
        this.X1 = true;
        invalidate();
    }

    public void setSpokenWords(int[] iArr) {
        if (this.a2 == iArr) {
            return;
        }
        this.a2 = iArr;
        this.c2 = TLObject.FLAG_31;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.R1 = i;
        this.Q1 = true;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.S1 = f;
        this.Q1 = true;
        invalidate();
    }

    public void setTallFrame(boolean z) {
        if (this.Z1 == z) {
            return;
        }
        this.Z1 = z;
        this.X1 = true;
        invalidate();
    }
}
