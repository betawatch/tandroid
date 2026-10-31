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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t01 extends FrameLayout {
    public LinearGradient D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final DecelerateInterpolator H;
    public final /* synthetic */ ThemeEditorView.EditorAlert I;
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
    public t01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.I = editorAlert;
        this.b = org.telegram.messenger.i0.L(20.0f);
        int i10 = 4;
        this.n = new EditTextBoldCursor[4];
        this.s = new float[]{0.0f, 0.0f, 1.0f};
        this.w = 1.0f;
        this.x = new float[3];
        this.H = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.e = new Paint(1);
        this.f = i0.a.f(context, R.drawable.knob_shadow);
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
        addView(linearLayout, w7.b6.e(-2, -2, 49));
        int i11 = 0;
        while (i11 < 4) {
            this.n[i11] = new EditTextBoldCursor(context);
            this.n[i11].setInputType(2);
            this.n[i11].setTextColor(-14606047);
            this.n[i11].setCursorColor(-14606047);
            this.n[i11].setCursorSize(org.telegram.messenger.i0.L(20.0f));
            this.n[i11].setCursorWidth(1.5f);
            this.n[i11].setTextSize(1, 18.0f);
            this.n[i11].setBackground(null);
            org.telegram.ui.ActionBar.a7.G(this.n[i11], org.telegram.ui.ActionBar.t6.u5, org.telegram.ui.ActionBar.t6.v5, org.telegram.ui.ActionBar.t6.q7, null);
            this.n[i11].setMaxLines(1);
            this.n[i11].setTag(Integer.valueOf(i11));
            this.n[i11].setGravity(17);
            if (i11 == 0) {
                this.n[i11].setHint("red");
            } else if (i11 == 1) {
                this.n[i11].setHint("green");
            } else if (i11 == 2) {
                this.n[i11].setHint("blue");
            } else if (i11 == 3) {
                this.n[i11].setHint("alpha");
            }
            this.n[i11].setImeOptions((i11 == 3 ? 6 : 5) | TLObject.FLAG_28);
            this.n[i11].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            this.a.addView(this.n[i11], w7.b6.k(0.0f, 0.0f, i11 != 3 ? 16.0f : 0.0f, 0.0f, 55, 36));
            this.n[i11].addTextChangedListener(new s01(this, i11));
            this.n[i11].setOnEditorActionListener(new ig.r(i10));
            i11++;
        }
    }

    public final void a(Canvas canvas, int i10, int i11, int i12) {
        int L = org.telegram.messenger.i0.L(13.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i10 - L, i11 - L, i10 + L, L + i11);
        drawable.draw(canvas);
        Paint paint = this.e;
        paint.setColor(-1);
        float f7 = i10;
        float f10 = i11;
        canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(11.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f7, f10, org.telegram.messenger.i0.L(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.s) & 16777215) | (((int) (this.w * 255.0f)) << 24);
    }

    public final void c(int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int alpha = Color.alpha(i10);
        ThemeEditorView.EditorAlert editorAlert = this.I;
        if (!editorAlert.B1) {
            editorAlert.B1 = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.n;
            editTextBoldCursorArr[0].setText("" + red);
            editTextBoldCursorArr[1].setText("" + green);
            editTextBoldCursorArr[2].setText("" + blue);
            editTextBoldCursorArr[3].setText("" + alpha);
            for (int i11 = 0; i11 < 4; i11++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            editorAlert.B1 = false;
        }
        this.D = null;
        this.y = null;
        this.w = alpha / 255.0f;
        Color.colorToHSV(i10, this.s);
        invalidate();
    }

    public final void d(boolean z10) {
        ThemeEditorView.EditorAlert editorAlert = this.I;
        if (editorAlert.A1 == z10) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.z1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.A1 = z10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.z1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(editorAlert.Y, i6.d, z10 ? 0 : 51), ObjectAnimator.ofFloat(editorAlert.b, (Property<ViewGroup, Float>) View.ALPHA, z10 ? 0.2f : 1.0f));
        editorAlert.z1.setDuration(150L);
        editorAlert.z1.setInterpolator(this.H);
        editorAlert.z1.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        char c10;
        int width = getWidth() / 2;
        int i10 = this.b;
        int i11 = width - (i10 * 2);
        int height = (getHeight() / 2) - org.telegram.messenger.i0.L(8.0f);
        Bitmap bitmap = this.h;
        int i12 = this.r;
        canvas.drawBitmap(bitmap, i11 - i12, height - i12, (Paint) null);
        float[] fArr = this.s;
        double radians = (float) Math.toRadians(fArr[0]);
        int i13 = ((int) ((-Math.cos(radians)) * fArr[1] * this.r)) + i11;
        double d = -Math.sin(radians);
        float f7 = fArr[1];
        float f10 = fArr[0];
        float[] fArr2 = this.x;
        fArr2[0] = f10;
        fArr2[1] = f7;
        fArr2[2] = 1.0f;
        a(canvas, i13, ((int) (d * f7 * this.r)) + height, Color.HSVToColor(fArr2));
        int i14 = this.r;
        int i15 = i11 + i14 + i10;
        int i16 = height - i14;
        int L = org.telegram.messenger.i0.L(9.0f);
        int i17 = this.r * 2;
        if (this.y == null) {
            c10 = 2;
            this.y = new LinearGradient(i15, i16, i15 + L, i16 + i17, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c10 = 2;
        }
        LinearGradient linearGradient = this.y;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f11 = i16;
        float f12 = i16 + i17;
        canvas.drawRect(i15, f11, i15 + L, f12, paint);
        int i18 = L / 2;
        float f13 = i17;
        a(canvas, i15 + i18, (int) ((fArr[c10] * f13) + f11), Color.HSVToColor(fArr));
        int i19 = (i10 * 2) + i15;
        if (this.D == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.D = new LinearGradient(i19, f11, i19 + L, f12, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.D);
        canvas.drawRect(i19, f11, L + i19, f12, paint);
        a(canvas, i19 + i18, (int) c3.i0.z(1.0f, this.w, f13, f11), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.w * 255.0f)) << 24));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        measureChild(this.a, i10, i11);
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int d = i0.a.d(20.0f, (i10 / 2) - (this.b * 2), 1);
        this.r = d;
        int i14 = d * 2;
        int i15 = d * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i16 = 0; i16 < 13; i16++) {
            fArr[0] = ((i16 * 30) + org.telegram.messenger.zs.K2) % 360;
            iArr[i16] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f7 = i14 / 2;
        float f10 = i15 / 2;
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f7, f10, iArr, (float[]) null), new RadialGradient(f7, f10, this.r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f7, f10, this.r, paint);
        this.h = createBitmap;
        this.y = null;
        this.D = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        if (r14 <= r21.r) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        if (r10 <= (r4 + r11)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r3 != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010d, code lost:
    
        if (r10 <= (r4 + r11)) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        int i11;
        float f7;
        boolean z10;
        int i12;
        float f10;
        ThemeEditorView.EditorAlert editorAlert = this.I;
        ThemeEditorView themeEditorView = ThemeEditorView.this;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.G = false;
                this.F = false;
                this.E = false;
                d(false);
            }
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int width = getWidth() / 2;
        int i13 = this.b;
        int i14 = i13 * 2;
        int i15 = width - i14;
        int height = (getHeight() / 2) - org.telegram.messenger.i0.L(8.0f);
        int i16 = x10 - i15;
        int i17 = y3 - height;
        double sqrt = Math.sqrt((i17 * i17) + (i16 * i16));
        boolean z11 = this.E;
        boolean z12 = false;
        float[] fArr = this.s;
        if (!z11) {
            if (this.G || this.F) {
                i10 = y3;
            } else {
                i10 = y3;
            }
            if (this.F) {
                if (!this.E && !this.G) {
                    int i18 = this.r;
                    int i19 = i15 + i18;
                    if (x10 >= i19 + i13 && x10 <= i14 + i19) {
                        i11 = i10;
                        if (i11 >= height - i18) {
                        }
                        if (!this.G) {
                            if (!this.E && !this.F) {
                                int i20 = this.r;
                                int i21 = i15 + i20;
                                if (x10 >= (i13 * 3) + i21) {
                                    if (x10 <= (i13 * 4) + i21) {
                                        if (i11 >= height - i20) {
                                        }
                                    }
                                }
                            }
                            z10 = true;
                            if (this.G && !this.F && !this.E) {
                                return z10;
                            }
                            d(z10);
                            int b10 = b();
                            i12 = 0;
                            while (i12 < themeEditorView.e.size()) {
                                int i22 = ((org.telegram.ui.ActionBar.c7) themeEditorView.e.get(i12)).e;
                                if ((i12 == 0 && i22 == org.telegram.ui.ActionBar.t6.Be) || i22 == org.telegram.ui.ActionBar.t6.Ce || i22 == org.telegram.ui.ActionBar.t6.De || i22 == org.telegram.ui.ActionBar.t6.Ee || i22 == org.telegram.ui.ActionBar.t6.d6 || i22 == org.telegram.ui.ActionBar.t6.a7) {
                                    b10 |= -16777216;
                                }
                                ((org.telegram.ui.ActionBar.c7) themeEditorView.e.get(i12)).e(b10, z12, true);
                                i12++;
                                z12 = false;
                            }
                            ThemeEditorView.a(themeEditorView);
                            int red = Color.red(b10);
                            int green = Color.green(b10);
                            int blue = Color.blue(b10);
                            int alpha = Color.alpha(b10);
                            if (!editorAlert.B1) {
                                editorAlert.B1 = true;
                                EditTextBoldCursor[] editTextBoldCursorArr = this.n;
                                editTextBoldCursorArr[0].setText("" + red);
                                editTextBoldCursorArr[1].setText("" + green);
                                editTextBoldCursorArr[2].setText("" + blue);
                                editTextBoldCursorArr[3].setText("" + alpha);
                                for (int i23 = 0; i23 < 4; i23++) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i23];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                }
                                editorAlert.B1 = false;
                            }
                            invalidate();
                            return true;
                        }
                        f7 = 1.0f - ((i11 - (height - r3)) / (this.r * 2.0f));
                        this.w = f7;
                        if (f7 >= 0.0f) {
                            this.w = 0.0f;
                        } else if (f7 > 1.0f) {
                            this.w = 1.0f;
                        }
                        z10 = true;
                        this.G = true;
                        if (this.G) {
                        }
                        d(z10);
                        int b102 = b();
                        i12 = 0;
                        while (i12 < themeEditorView.e.size()) {
                        }
                        ThemeEditorView.a(themeEditorView);
                        int red2 = Color.red(b102);
                        int green2 = Color.green(b102);
                        int blue2 = Color.blue(b102);
                        int alpha2 = Color.alpha(b102);
                        if (!editorAlert.B1) {
                        }
                        invalidate();
                        return true;
                    }
                }
                i11 = i10;
                if (!this.G) {
                }
                f7 = 1.0f - ((i11 - (height - r3)) / (this.r * 2.0f));
                this.w = f7;
                if (f7 >= 0.0f) {
                }
                z10 = true;
                this.G = true;
                if (this.G) {
                }
                d(z10);
                int b1022 = b();
                i12 = 0;
                while (i12 < themeEditorView.e.size()) {
                }
                ThemeEditorView.a(themeEditorView);
                int red22 = Color.red(b1022);
                int green22 = Color.green(b1022);
                int blue22 = Color.blue(b1022);
                int alpha22 = Color.alpha(b1022);
                if (!editorAlert.B1) {
                }
                invalidate();
                return true;
            }
            i11 = i10;
            f10 = (i11 - (height - r4)) / (this.r * 2.0f);
            if (f10 >= 0.0f) {
                f10 = 0.0f;
            } else if (f10 > 1.0f) {
                f10 = 1.0f;
            }
            fArr[2] = f10;
            this.F = true;
            if (!this.G) {
            }
            f7 = 1.0f - ((i11 - (height - r3)) / (this.r * 2.0f));
            this.w = f7;
            if (f7 >= 0.0f) {
            }
            z10 = true;
            this.G = true;
            if (this.G) {
            }
            d(z10);
            int b10222 = b();
            i12 = 0;
            while (i12 < themeEditorView.e.size()) {
            }
            ThemeEditorView.a(themeEditorView);
            int red222 = Color.red(b10222);
            int green222 = Color.green(b10222);
            int blue222 = Color.blue(b10222);
            int alpha222 = Color.alpha(b10222);
            if (!editorAlert.B1) {
            }
            invalidate();
            return true;
        }
        i10 = y3;
        double d = this.r;
        if (sqrt > d) {
            sqrt = d;
        }
        this.E = true;
        fArr[0] = (float) (Math.toDegrees(Math.atan2(i17, i16)) + 180.0d);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, (float) (sqrt / this.r)));
        this.y = null;
        this.D = null;
        if (this.F) {
        }
        f10 = (i11 - (height - r4)) / (this.r * 2.0f);
        if (f10 >= 0.0f) {
        }
        fArr[2] = f10;
        this.F = true;
        if (!this.G) {
        }
        f7 = 1.0f - ((i11 - (height - r3)) / (this.r * 2.0f));
        this.w = f7;
        if (f7 >= 0.0f) {
        }
        z10 = true;
        this.G = true;
        if (this.G) {
        }
        d(z10);
        int b102222 = b();
        i12 = 0;
        while (i12 < themeEditorView.e.size()) {
        }
        ThemeEditorView.a(themeEditorView);
        int red2222 = Color.red(b102222);
        int green2222 = Color.green(b102222);
        int blue2222 = Color.blue(b102222);
        int alpha2222 = Color.alpha(b102222);
        if (!editorAlert.B1) {
        }
        invalidate();
        return true;
    }
}
