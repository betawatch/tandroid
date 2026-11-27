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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class ju3 extends EditTextBoldCursor {
    public final Canvas N1;
    public final TextPaint O1;
    public final Paint P1;
    public Bitmap Q1;
    public boolean R1;
    public int S1;
    public float T1;
    public int U1;
    public final jx2 V1;
    public RectF[] W1;
    public RectF X1;
    public boolean Y1;
    public float Z1;
    public boolean a2;
    public int[] b2;
    public long c2;
    public int d2;
    public Paint e2;
    public final Path f2;
    public final RectF g2;
    public final RectF h2;

    public ju3(Context context) {
        super(context);
        this.N1 = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.O1 = textPaint;
        this.P1 = new Paint(1);
        this.V1 = new jx2();
        this.d2 = TLObject.FLAG_31;
        this.f2 = new Path();
        this.g2 = new RectF();
        this.h2 = new RectF();
        this.S1 = 0;
        setInputType(getInputType() | 655360);
        this.R1 = true;
        this.Y1 = true;
        setFrameRoundRadius(hl.L(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f) {
        if (Math.abs(this.Z1 - f) > 0.1f) {
            this.Z1 = f;
            this.P1.setPathEffect(new CornerPathEffect(f));
        }
    }

    public final boolean A(long j) {
        this.c2 = j;
        if (this.b2 == null) {
            return false;
        }
        int B = B(j);
        if (B < 0) {
            B = -1;
        } else if (j - this.b2[(B << 2) + 2] < 240) {
            B = -2;
        }
        if (B == this.d2 && B != -2) {
            return false;
        }
        this.d2 = B;
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
            if ((i2 << 2) + 3 >= this.b2.length || r4[r2 + 2] > j) {
                break;
            }
            i3 = i2 + 1;
        }
        return i;
    }

    public final boolean C(Layout layout, int i, RectF rectF) {
        int[] iArr = this.b2;
        int i2 = i << 2;
        int i3 = iArr[i2];
        int i4 = iArr[i2 + 1];
        if (i3 >= 0 && i3 < i4 && i4 <= layout.getText().length()) {
            Path path = this.f2;
            path.rewind();
            layout.getSelectionPath(i3, i4, path);
            path.computeBounds(rectF, false);
            if (!rectF.isEmpty()) {
                Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                float lineBaseline = layout.getLineBaseline(layout.getLineForOffset(i3));
                float textSize = getTextSize() * 0.14f;
                rectF.set(rectF.left - textSize, ((fontMetrics.ascent * 0.86f) + lineBaseline) - textSize, rectF.right + textSize, bs2.i(fontMetrics.descent, 0.9f, lineBaseline, textSize));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0457  */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
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
        if (this.Q1 != null && this.S1 != 0) {
            boolean z2 = this.R1;
            TextPaint textPaint = this.O1;
            if (z2) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                Editable text = getText();
                Bitmap bitmap = this.Q1;
                Canvas canvas2 = this.N1;
                canvas2.setBitmap(bitmap);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                float f3 = this.T1;
                if (f3 <= 0.0f) {
                    f3 = (float) Math.ceil(getTextSize() / 11.5f);
                }
                textPaint.setStrokeWidth(f3);
                textPaint.setColor(this.S1);
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
                this.R1 = false;
            }
            canvas.drawBitmap(this.Q1, 0.0f, 0.0f, textPaint);
        }
        float f4 = 1.0f;
        if (this.U1 != 0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            int i2 = this.U1;
            Paint paint2 = this.P1;
            paint2.setColor(i2);
            Layout layout = getLayout();
            if (layout == null) {
                super.onDraw(canvas);
                return;
            }
            RectF[] rectFArr = this.W1;
            if (rectFArr == null || rectFArr.length != layout.getLineCount()) {
                this.W1 = new RectF[layout.getLineCount()];
                this.Y1 = true;
            }
            if (this.Y1) {
                this.Y1 = false;
                for (int i3 = 0; i3 < layout.getLineCount(); i3++) {
                    RectF[] rectFArr2 = this.W1;
                    if (rectFArr2[i3] == null) {
                        rectFArr2[i3] = new RectF();
                    }
                    this.W1[i3].set(layout.getLineLeft(i3), layout.getLineTop(i3), layout.getLineRight(i3), layout.getLineBottom(i3));
                    float width = this.W1[i3].width();
                    float L = hl.L(1.0f);
                    RectF[] rectFArr3 = this.W1;
                    if (width > L) {
                        rectFArr3[i3].inset(this.a2 ? (-getTextSize()) * 0.26f : (-getTextSize()) / 3.0f, 0.0f);
                        RectF rectF2 = this.W1[i3];
                        rectF2.top = hl.N(1.2f) + rectF2.top;
                        RectF rectF3 = this.W1[i3];
                        rectF3.bottom = hl.N(1.0f) + rectF3.bottom;
                        this.W1[i3].left = Math.max(getScrollX() - getPaddingLeft(), this.W1[i3].left);
                        this.W1[i3].right = Math.min((getWidth() + getScrollX()) - getPaddingLeft(), this.W1[i3].right);
                    } else {
                        RectF rectF4 = rectFArr3[i3];
                        rectF4.left = rectF4.right;
                    }
                    if (this.a2 && this.W1[i3].width() > 0.0f) {
                        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
                        float lineBaseline = layout.getLineBaseline(i3);
                        float textSize = getTextSize() * 0.26f;
                        this.W1[i3].top = Math.max(-getPaddingTop(), ((fontMetrics.ascent * 0.86f) + lineBaseline) - textSize);
                        this.W1[i3].bottom = Math.min(getHeight() - getPaddingTop(), (fontMetrics.descent * 0.9f) + lineBaseline + textSize);
                    }
                    if (i3 > 0) {
                        int i4 = i3 - 1;
                        if (this.W1[i4].width() > 0.0f) {
                            RectF[] rectFArr4 = this.W1;
                            rectFArr4[i4].bottom = rectFArr4[i3].top;
                        }
                    }
                }
                RectF rectF5 = this.X1;
                if (rectF5 == null) {
                    rectF5 = new RectF();
                    this.X1 = rectF5;
                }
                rectF5.left = getMeasuredWidth();
                this.X1.top = getMeasuredHeight();
                RectF rectF6 = this.X1;
                rectF6.bottom = 0.0f;
                rectF6.right = 0.0f;
                int i5 = 0;
                while (true) {
                    int length = this.W1.length;
                    rectF = this.X1;
                    if (i5 >= length) {
                        break;
                    }
                    rectF.left = Math.min(rectF.left, getPaddingLeft() + this.W1[i5].left);
                    RectF rectF7 = this.X1;
                    rectF7.top = Math.min(rectF7.top, getPaddingTop() + this.W1[i5].top);
                    RectF rectF8 = this.X1;
                    rectF8.right = Math.max(rectF8.right, getPaddingLeft() + this.W1[i5].right);
                    RectF rectF9 = this.X1;
                    rectF9.bottom = Math.max(rectF9.bottom, getPaddingTop() + this.W1[i5].bottom);
                    i5++;
                }
                float measuredWidth2 = getMeasuredWidth();
                RectF rectF10 = this.X1;
                rectF.right = measuredWidth2 - rectF10.right;
                rectF10.bottom = getMeasuredHeight() - this.X1.bottom;
            }
            jx2 jx2Var = this.V1;
            jx2Var.rewind();
            float textSize2 = getTextSize() / 3.0f;
            float f5 = 1.5f * textSize2;
            int i6 = 1;
            while (true) {
                RectF[] rectFArr5 = this.W1;
                if (i6 >= rectFArr5.length) {
                    break;
                }
                RectF rectF11 = rectFArr5[i6 - 1];
                RectF rectF12 = rectFArr5[i6];
                if (rectF11.width() >= hl.L(1.0f) && rectF12.width() >= hl.L(1.0f)) {
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
                            RectF[] rectFArr6 = this.W1;
                            RectF rectF13 = rectFArr6[i7 - 1];
                            RectF rectF14 = rectFArr6[i7];
                            if (rectF13.width() >= hl.L(1.0f) && rectF14.width() >= hl.L(1.0f)) {
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
                RectF[] rectFArr7 = this.W1;
                if (i >= rectFArr7.length) {
                    break;
                }
                if (rectFArr7[i].width() != 0.0f) {
                    jx2Var.addRect(this.W1[i], Path.Direction.CW);
                }
                i++;
            }
            jx2Var.a();
            setFrameRoundRadius(textSize2);
            canvas.drawPath(jx2Var, paint2);
            canvas.restore();
        } else {
            this.X1 = null;
        }
        Layout layout2 = getLayout();
        if (this.b2 != null && layout2 != null && (B = B(this.c2)) >= 0) {
            RectF rectF15 = this.g2;
            if (C(layout2, B, rectF15)) {
                long j = this.c2 - this.b2[(B << 2) + 2];
                if (B > 0) {
                    RectF rectF16 = this.h2;
                    if (C(layout2, B - 1, rectF16) && Math.abs(rectF16.centerY() - rectF15.centerY()) < 1.0f) {
                        if (j < 240) {
                            float interpolation = k43.h.getInterpolation(j / 240.0f);
                            rectF15.set(hl.R1(rectF16.left, rectF15.left, interpolation), hl.R1(rectF16.top, rectF15.top, interpolation), hl.R1(rectF16.right, rectF15.right, interpolation), hl.R1(rectF16.bottom, rectF15.bottom, interpolation));
                            f = 1.0f - (((float) Math.sin(interpolation * 3.141592653589793d)) * 0.2f);
                            float f6 = f4;
                            f4 = f;
                            f2 = f6;
                            paint = this.e2;
                            if (paint == null) {
                                paint = new Paint(1);
                                this.e2 = paint;
                            }
                            paint.setColor(aob.p1(f2 * 0.3f, getCurrentTextColor()));
                            float textSize3 = getTextSize() * 0.25f;
                            canvas.save();
                            canvas.translate(getPaddingLeft(), getPaddingTop());
                            canvas.scale(f4, f4, rectF15.centerX(), rectF15.centerY());
                            canvas.drawRoundRect(rectF15, textSize3, textSize3, this.e2);
                            canvas.restore();
                        } else {
                            f2 = 1.0f;
                            paint = this.e2;
                            if (paint == null) {
                            }
                            paint.setColor(aob.p1(f2 * 0.3f, getCurrentTextColor()));
                            float textSize32 = getTextSize() * 0.25f;
                            canvas.save();
                            canvas.translate(getPaddingLeft(), getPaddingTop());
                            canvas.scale(f4, f4, rectF15.centerX(), rectF15.centerY());
                            canvas.drawRoundRect(rectF15, textSize32, textSize32, this.e2);
                            canvas.restore();
                        }
                    }
                }
                f4 = k43.h.getInterpolation(Math.min(1.0f, j / 220.0f));
                f = 0.75f + (f4 * 0.25f);
                float f62 = f4;
                f4 = f;
                f2 = f62;
                paint = this.e2;
                if (paint == null) {
                }
                paint.setColor(aob.p1(f2 * 0.3f, getCurrentTextColor()));
                float textSize322 = getTextSize() * 0.25f;
                canvas.save();
                canvas.translate(getPaddingLeft(), getPaddingTop());
                canvas.scale(f4, f4, rectF15.centerX(), rectF15.centerY());
                canvas.drawRoundRect(rectF15, textSize322, textSize322, this.e2);
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i != i3) {
            this.Y1 = true;
            invalidate();
        }
    }

    @Override // cu3, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            this.Q1 = null;
            return;
        }
        this.R1 = true;
        this.Y1 = true;
        Bitmap bitmap = this.Q1;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.Q1 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.R1 = true;
        this.Y1 = true;
    }

    public void setFrameColor(int i) {
        int i2 = this.U1;
        if (i2 == 0 && i != 0) {
            setPadding(hl.L(19.0f), hl.L(7.0f), hl.L(19.0f), hl.L(7.0f));
            setCursorColor(-1);
        } else if (i2 != 0 && i == 0) {
            setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
            setCursorColor(-1);
        }
        this.U1 = i;
        if (i != 0) {
            float B = hl.B(i);
            if (B == 0.0f) {
                B = Color.red(this.U1) / 255.0f;
            }
            if (B > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.Y1 = true;
        }
        this.R1 = true;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        super.setGravity(i);
        this.R1 = true;
        this.Y1 = true;
        invalidate();
    }

    public void setSpokenWords(int[] iArr) {
        if (this.b2 == iArr) {
            return;
        }
        this.b2 = iArr;
        this.d2 = TLObject.FLAG_31;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.S1 = i;
        this.R1 = true;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.T1 = f;
        this.R1 = true;
        invalidate();
    }

    public void setTallFrame(boolean z) {
        if (this.a2 == z) {
            return;
        }
        this.a2 = z;
        this.Y1 = true;
        invalidate();
    }
}
