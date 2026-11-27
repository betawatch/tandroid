package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class a0 extends FrameLayout {
    public LinearGradient E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final DecelerateInterpolator I;
    public final /* synthetic */ ThemeEditorView.EditorAlert J;
    public final LinearLayout a;
    public final int b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final Drawable f;
    public Bitmap h;
    public final EditTextBoldCursor[] n;
    public int r;
    public final float[] s;
    public float w;
    public final float[] x;
    public LinearGradient y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.J = editorAlert;
        this.b = hl.L(20.0f);
        this.n = new EditTextBoldCursor[4];
        this.s = new float[]{0.0f, 0.0f, 1.0f};
        this.w = 1.0f;
        this.x = new float[3];
        this.I = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.e = new Paint(1);
        this.f = c00.e(context, R.drawable.knob_shadow);
        Paint paint = new Paint();
        this.c = paint;
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.d = paint2;
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, tre.e(-2, -2, 49));
        int i = 0;
        while (i < 4) {
            this.n[i] = new EditTextBoldCursor(context);
            this.n[i].setInputType(2);
            this.n[i].setTextColor(-14606047);
            this.n[i].setCursorColor(-14606047);
            this.n[i].setCursorSize(hl.L(20.0f));
            this.n[i].setCursorWidth(1.5f);
            this.n[i].setTextSize(1, 18.0f);
            this.n[i].setBackground(null);
            yob.F(this.n[i], aob.u5, aob.v5, aob.q7, null);
            this.n[i].setMaxLines(1);
            this.n[i].setTag(Integer.valueOf(i));
            this.n[i].setGravity(17);
            if (i == 0) {
                this.n[i].setHint("red");
            } else if (i == 1) {
                this.n[i].setHint("green");
            } else if (i == 2) {
                this.n[i].setHint("blue");
            } else if (i == 3) {
                this.n[i].setHint("alpha");
            }
            byte b = 5;
            this.n[i].setImeOptions((i == 3 ? 6 : 5) | TLObject.FLAG_28);
            this.n[i].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            this.a.addView(this.n[i], tre.k(0.0f, 0.0f, i != 3 ? 16.0f : 0.0f, 0.0f, 55, 36));
            this.n[i].addTextChangedListener(new z(this, i));
            this.n[i].setOnEditorActionListener(new mh(b));
            i++;
        }
    }

    public final void a(Canvas canvas, int i, int i2, int i3) {
        int L = hl.L(13.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i - L, i2 - L, i + L, L + i2);
        drawable.draw(canvas);
        Paint paint = this.e;
        paint.setColor(-1);
        float f = i;
        float f2 = i2;
        canvas.drawCircle(f, f2, hl.L(11.0f), paint);
        paint.setColor(i3);
        canvas.drawCircle(f, f2, hl.L(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.s) & 16777215) | (((int) (this.w * 255.0f)) << 24);
    }

    public final void c(int i) {
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        int alpha = Color.alpha(i);
        ThemeEditorView.EditorAlert editorAlert = this.J;
        if (!editorAlert.E1) {
            editorAlert.E1 = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.n;
            editTextBoldCursorArr[0].setText(String.valueOf(red));
            editTextBoldCursorArr[1].setText(String.valueOf(green));
            editTextBoldCursorArr[2].setText(String.valueOf(blue));
            editTextBoldCursorArr[3].setText(String.valueOf(alpha));
            for (int i2 = 0; i2 < 4; i2++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i2];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            editorAlert.E1 = false;
        }
        this.E = null;
        this.y = null;
        this.w = alpha / 255.0f;
        Color.colorToHSV(i, this.s);
        invalidate();
    }

    public final void d(boolean z) {
        ThemeEditorView.EditorAlert editorAlert = this.J;
        if (editorAlert.D1 == z) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.C1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.D1 = z;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.C1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(editorAlert.Z, sn.d, z ? 0 : 51), ObjectAnimator.ofFloat(editorAlert.b, (Property<ViewGroup, Float>) View.ALPHA, z ? 0.2f : 1.0f));
        editorAlert.C1.setDuration(150L);
        editorAlert.C1.setInterpolator(this.I);
        editorAlert.C1.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        char c;
        int width = getWidth() / 2;
        int i = this.b;
        int i2 = width - (i << 1);
        int height = (getHeight() / 2) - hl.L(8.0f);
        Bitmap bitmap = this.h;
        int i3 = this.r;
        canvas.drawBitmap(bitmap, i2 - i3, height - i3, (Paint) null);
        float[] fArr = this.s;
        double radians = (float) Math.toRadians(fArr[0]);
        int i4 = ((int) ((-Math.cos(radians)) * fArr[1] * this.r)) + i2;
        double d = -Math.sin(radians);
        float f = fArr[1];
        float f2 = fArr[0];
        float[] fArr2 = this.x;
        fArr2[0] = f2;
        fArr2[1] = f;
        fArr2[2] = 1.0f;
        a(canvas, i4, ((int) (d * f * this.r)) + height, Color.HSVToColor(fArr2));
        int i5 = this.r;
        int i6 = i2 + i5 + i;
        int i7 = height - i5;
        int L = hl.L(9.0f);
        int i8 = this.r << 1;
        LinearGradient linearGradient = this.y;
        if (linearGradient == null) {
            c = 2;
            linearGradient = new LinearGradient(i6, i7, i6 + L, i7 + i8, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
            this.y = linearGradient;
        } else {
            c = 2;
        }
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f3 = i7;
        float f4 = i7 + i8;
        canvas.drawRect(i6, f3, i6 + L, f4, paint);
        int i9 = L / 2;
        float f5 = i8;
        a(canvas, i6 + i9, (int) ((fArr[c] * f5) + f3), Color.HSVToColor(fArr));
        int i10 = i6 + (i << 1);
        LinearGradient linearGradient2 = this.E;
        if (linearGradient2 == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            linearGradient2 = new LinearGradient(i10, f3, i10 + L, f4, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
            this.E = linearGradient2;
        }
        paint.setShader(linearGradient2);
        canvas.drawRect(i10, f3, L + i10, f4, paint);
        a(canvas, i10 + i9, (int) qd4.A(1.0f, this.w, f5, f3), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.w * 255.0f)) << 24));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int min = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        measureChild(this.a, i, i2);
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int d = c00.d(20.0f, (i / 2) - (this.b << 1), 1);
        this.r = d;
        int i5 = d << 1;
        int i6 = d << 1;
        Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i7 = 0; i7 < 13; i7++) {
            fArr[0] = ((i7 * 30) + jn7.J2) % 360;
            iArr[i7] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f = i5 / 2;
        float f2 = i6 / 2;
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f, f2, iArr, (float[]) null), new RadialGradient(f, f2, this.r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f, f2, this.r, paint);
        this.h = createBitmap;
        this.y = null;
        this.E = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r14 <= r21.r) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        if (r12 <= (r7 + r11)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r3 != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
    
        if (r12 <= (r7 + r11)) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ce  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        float f;
        boolean z3;
        boolean z4;
        int i3;
        float f2;
        ThemeEditorView.EditorAlert editorAlert = this.J;
        ThemeEditorView themeEditorView = ThemeEditorView.this;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.H = false;
                this.G = false;
                this.F = false;
                d(false);
            }
            return super.onTouchEvent(motionEvent);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int width = getWidth() / 2;
        int i4 = this.b;
        int i5 = i4 << 1;
        int i6 = width - i5;
        int height = (getHeight() / 2) - hl.L(8.0f);
        int i7 = x - i6;
        int i8 = y - height;
        double sqrt = Math.sqrt((i8 * i8) + (i7 * i7));
        boolean z5 = this.F;
        boolean z6 = false;
        float[] fArr = this.s;
        if (!z5) {
            if (this.H || this.G) {
                i = y;
            } else {
                i = y;
            }
            z = this.G;
            if (z) {
                if (!this.F && !this.H) {
                    int i9 = this.r;
                    int i10 = i6 + i9;
                    if (x >= i10 + i4 && x <= i10 + i5) {
                        i2 = i;
                        if (i2 >= height - i9) {
                        }
                        z2 = this.H;
                        if (!z2) {
                            if (!this.F && !z) {
                                int i11 = this.r;
                                int i12 = i6 + i11;
                                if (x >= (i4 * 3) + i12) {
                                    if (x <= i12 + (i4 << 2)) {
                                        if (i2 >= height - i11) {
                                        }
                                    }
                                }
                            }
                            z4 = z2;
                            z3 = true;
                            if (z4 && !z && !this.F) {
                                return z3;
                            }
                            d(z3);
                            int b = b();
                            i3 = 0;
                            while (i3 < themeEditorView.e.size()) {
                                int i13 = ((apb) themeEditorView.e.get(i3)).e;
                                if ((i3 == 0 && i13 == aob.Ee) || i13 == aob.Fe || i13 == aob.Ge || i13 == aob.He || i13 == aob.d6 || i13 == aob.a7) {
                                    b |= -16777216;
                                }
                                ((apb) themeEditorView.e.get(i3)).e(b, z6, true);
                                i3++;
                                z6 = false;
                            }
                            themeEditorView.c();
                            int red = Color.red(b);
                            int green = Color.green(b);
                            int blue = Color.blue(b);
                            int alpha = Color.alpha(b);
                            if (!editorAlert.E1) {
                                editorAlert.E1 = true;
                                EditTextBoldCursor[] editTextBoldCursorArr = this.n;
                                editTextBoldCursorArr[0].setText(String.valueOf(red));
                                editTextBoldCursorArr[1].setText(String.valueOf(green));
                                editTextBoldCursorArr[2].setText(String.valueOf(blue));
                                editTextBoldCursorArr[3].setText(String.valueOf(alpha));
                                for (int i14 = 0; i14 < 4; i14++) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i14];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                }
                                editorAlert.E1 = false;
                            }
                            invalidate();
                            return true;
                        }
                        f = 1.0f - ((i2 - (height - r3)) / (this.r * 2.0f));
                        this.w = f;
                        if (f >= 0.0f) {
                            this.w = 0.0f;
                        } else if (f > 1.0f) {
                            this.w = 1.0f;
                        }
                        z3 = true;
                        this.H = true;
                        z4 = true;
                        if (z4) {
                        }
                        d(z3);
                        int b2 = b();
                        i3 = 0;
                        while (i3 < themeEditorView.e.size()) {
                        }
                        themeEditorView.c();
                        int red2 = Color.red(b2);
                        int green2 = Color.green(b2);
                        int blue2 = Color.blue(b2);
                        int alpha2 = Color.alpha(b2);
                        if (!editorAlert.E1) {
                        }
                        invalidate();
                        return true;
                    }
                }
                i2 = i;
                z2 = this.H;
                if (!z2) {
                }
                f = 1.0f - ((i2 - (height - r3)) / (this.r * 2.0f));
                this.w = f;
                if (f >= 0.0f) {
                }
                z3 = true;
                this.H = true;
                z4 = true;
                if (z4) {
                }
                d(z3);
                int b22 = b();
                i3 = 0;
                while (i3 < themeEditorView.e.size()) {
                }
                themeEditorView.c();
                int red22 = Color.red(b22);
                int green22 = Color.green(b22);
                int blue22 = Color.blue(b22);
                int alpha22 = Color.alpha(b22);
                if (!editorAlert.E1) {
                }
                invalidate();
                return true;
            }
            i2 = i;
            f2 = (i2 - (height - r4)) / (this.r * 2.0f);
            if (f2 >= 0.0f) {
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            fArr[2] = f2;
            this.G = true;
            z = true;
            z2 = this.H;
            if (!z2) {
            }
            f = 1.0f - ((i2 - (height - r3)) / (this.r * 2.0f));
            this.w = f;
            if (f >= 0.0f) {
            }
            z3 = true;
            this.H = true;
            z4 = true;
            if (z4) {
            }
            d(z3);
            int b222 = b();
            i3 = 0;
            while (i3 < themeEditorView.e.size()) {
            }
            themeEditorView.c();
            int red222 = Color.red(b222);
            int green222 = Color.green(b222);
            int blue222 = Color.blue(b222);
            int alpha222 = Color.alpha(b222);
            if (!editorAlert.E1) {
            }
            invalidate();
            return true;
        }
        i = y;
        double d = this.r;
        if (sqrt > d) {
            sqrt = d;
        }
        this.F = true;
        fArr[0] = (float) (Math.toDegrees(Math.atan2(i8, i7)) + 180.0d);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, (float) (sqrt / this.r)));
        this.y = null;
        this.E = null;
        z = this.G;
        if (z) {
        }
        f2 = (i2 - (height - r4)) / (this.r * 2.0f);
        if (f2 >= 0.0f) {
        }
        fArr[2] = f2;
        this.G = true;
        z = true;
        z2 = this.H;
        if (!z2) {
        }
        f = 1.0f - ((i2 - (height - r3)) / (this.r * 2.0f));
        this.w = f;
        if (f >= 0.0f) {
        }
        z3 = true;
        this.H = true;
        z4 = true;
        if (z4) {
        }
        d(z3);
        int b2222 = b();
        i3 = 0;
        while (i3 < themeEditorView.e.size()) {
        }
        themeEditorView.c();
        int red2222 = Color.red(b2222);
        int green2222 = Color.green(b2222);
        int blue2222 = Color.blue(b2222);
        int alpha2222 = Color.alpha(b2222);
        if (!editorAlert.E1) {
        }
        invalidate();
        return true;
    }
}
