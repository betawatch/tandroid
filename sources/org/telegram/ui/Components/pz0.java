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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class pz0 extends FrameLayout {
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
    public pz0(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.I = editorAlert;
        this.b = org.telegram.messenger.g0.L(20.0f);
        this.n = new EditTextBoldCursor[4];
        this.s = new float[]{0.0f, 0.0f, 1.0f};
        this.w = 1.0f;
        this.x = new float[3];
        this.H = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.e = new Paint(1);
        this.f = jg.g.h(context, R.drawable.knob_shadow);
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
        addView(linearLayout, c8.ha.e(-2, -2, 49));
        int i7 = 0;
        while (i7 < 4) {
            this.n[i7] = new EditTextBoldCursor(context);
            int i10 = 2;
            this.n[i7].setInputType(2);
            this.n[i7].setTextColor(-14606047);
            this.n[i7].setCursorColor(-14606047);
            this.n[i7].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.n[i7].setCursorWidth(1.5f);
            this.n[i7].setTextSize(1, 18.0f);
            this.n[i7].setBackground(null);
            org.telegram.ui.ActionBar.r6.G(this.n[i7], org.telegram.ui.ActionBar.k6.u5, org.telegram.ui.ActionBar.k6.v5, org.telegram.ui.ActionBar.k6.q7, null);
            this.n[i7].setMaxLines(1);
            this.n[i7].setTag(Integer.valueOf(i7));
            this.n[i7].setGravity(17);
            if (i7 == 0) {
                this.n[i7].setHint("red");
            } else if (i7 == 1) {
                this.n[i7].setHint("green");
            } else if (i7 == 2) {
                this.n[i7].setHint("blue");
            } else if (i7 == 3) {
                this.n[i7].setHint("alpha");
            }
            this.n[i7].setImeOptions((i7 == 3 ? 6 : 5) | TLObject.FLAG_28);
            this.n[i7].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            this.a.addView(this.n[i7], c8.ha.k(0.0f, 0.0f, i7 != 3 ? 16.0f : 0.0f, 0.0f, 55, 36));
            this.n[i7].addTextChangedListener(new oz0(this, i7));
            this.n[i7].setOnEditorActionListener(new l2(i10));
            i7++;
        }
    }

    public final void a(Canvas canvas, int i7, int i10, int i11) {
        int L = org.telegram.messenger.g0.L(13.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i7 - L, i10 - L, i7 + L, L + i10);
        drawable.draw(canvas);
        Paint paint = this.e;
        paint.setColor(-1);
        float f10 = i7;
        float f11 = i10;
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(11.0f), paint);
        paint.setColor(i11);
        canvas.drawCircle(f10, f11, org.telegram.messenger.g0.L(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.s) & 16777215) | (((int) (this.w * 255.0f)) << 24);
    }

    public final void c(int i7) {
        int red = Color.red(i7);
        int green = Color.green(i7);
        int blue = Color.blue(i7);
        int alpha = Color.alpha(i7);
        ThemeEditorView.EditorAlert editorAlert = this.I;
        if (!editorAlert.B1) {
            editorAlert.B1 = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.n;
            editTextBoldCursorArr[0].setText("" + red);
            editTextBoldCursorArr[1].setText("" + green);
            editTextBoldCursorArr[2].setText("" + blue);
            editTextBoldCursorArr[3].setText("" + alpha);
            for (int i10 = 0; i10 < 4; i10++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            editorAlert.B1 = false;
        }
        this.D = null;
        this.y = null;
        this.w = alpha / 255.0f;
        Color.colorToHSV(i7, this.s);
        invalidate();
    }

    public final void d(boolean z9) {
        ThemeEditorView.EditorAlert editorAlert = this.I;
        if (editorAlert.A1 == z9) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.z1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.A1 = z9;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.z1 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofInt(editorAlert.Y, m6.d, z9 ? 0 : 51), ObjectAnimator.ofFloat(editorAlert.b, (Property<ViewGroup, Float>) View.ALPHA, z9 ? 0.2f : 1.0f));
        editorAlert.z1.setDuration(150L);
        editorAlert.z1.setInterpolator(this.H);
        editorAlert.z1.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        char c10;
        int width = getWidth() / 2;
        int i7 = this.b;
        int i10 = width - (i7 * 2);
        int height = (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f);
        Bitmap bitmap = this.h;
        int i11 = this.r;
        canvas.drawBitmap(bitmap, i10 - i11, height - i11, (Paint) null);
        float[] fArr = this.s;
        double radians = (float) Math.toRadians(fArr[0]);
        int i12 = ((int) ((-Math.cos(radians)) * fArr[1] * this.r)) + i10;
        double d = -Math.sin(radians);
        float f10 = fArr[1];
        float f11 = fArr[0];
        float[] fArr2 = this.x;
        fArr2[0] = f11;
        fArr2[1] = f10;
        fArr2[2] = 1.0f;
        a(canvas, i12, ((int) (d * f10 * this.r)) + height, Color.HSVToColor(fArr2));
        int i13 = this.r;
        int i14 = i10 + i13 + i7;
        int i15 = height - i13;
        int L = org.telegram.messenger.g0.L(9.0f);
        int i16 = this.r * 2;
        if (this.y == null) {
            c10 = 2;
            this.y = new LinearGradient(i14, i15, i14 + L, i15 + i16, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c10 = 2;
        }
        LinearGradient linearGradient = this.y;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f12 = i15;
        float f13 = i15 + i16;
        canvas.drawRect(i14, f12, i14 + L, f13, paint);
        int i17 = L / 2;
        float f14 = i16;
        a(canvas, i14 + i17, (int) ((fArr[c10] * f14) + f12), Color.HSVToColor(fArr));
        int i18 = (i7 * 2) + i14;
        if (this.D == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.D = new LinearGradient(i18, f12, i18 + L, f13, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.D);
        canvas.drawRect(i18, f12, L + i18, f13, paint);
        a(canvas, i18 + i17, (int) com.google.android.recaptcha.internal.a.z(1.0f, this.w, f14, f12), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.w * 255.0f)) << 24));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        measureChild(this.a, i7, i10);
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int e10 = jg.g.e(20.0f, (i7 / 2) - (this.b * 2), 1);
        this.r = e10;
        int i13 = e10 * 2;
        int i14 = e10 * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i15 = 0; i15 < 13; i15++) {
            fArr[0] = ((i15 * 30) + org.telegram.messenger.qs.K2) % 360;
            iArr[i15] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f10 = i13 / 2;
        float f11 = i14 / 2;
        ComposeShader composeShader = new ComposeShader(new SweepGradient(f10, f11, iArr, (float[]) null), new RadialGradient(f10, f11, this.r, -1, 16777215, Shader.TileMode.CLAMP), PorterDuff.Mode.SRC_OVER);
        Paint paint = this.c;
        paint.setShader(composeShader);
        new Canvas(createBitmap).drawCircle(f10, f11, this.r, paint);
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
        int i7;
        int i10;
        float f10;
        boolean z9;
        int i11;
        float f11;
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
        int y10 = (int) motionEvent.getY();
        int width = getWidth() / 2;
        int i12 = this.b;
        int i13 = i12 * 2;
        int i14 = width - i13;
        int height = (getHeight() / 2) - org.telegram.messenger.g0.L(8.0f);
        int i15 = x10 - i14;
        int i16 = y10 - height;
        double sqrt = Math.sqrt((i16 * i16) + (i15 * i15));
        boolean z10 = this.E;
        boolean z11 = false;
        float[] fArr = this.s;
        if (!z10) {
            if (this.G || this.F) {
                i7 = y10;
            } else {
                i7 = y10;
            }
            if (this.F) {
                if (!this.E && !this.G) {
                    int i17 = this.r;
                    int i18 = i14 + i17;
                    if (x10 >= i18 + i12 && x10 <= i13 + i18) {
                        i10 = i7;
                        if (i10 >= height - i17) {
                        }
                        if (!this.G) {
                            if (!this.E && !this.F) {
                                int i19 = this.r;
                                int i20 = i14 + i19;
                                if (x10 >= (i12 * 3) + i20) {
                                    if (x10 <= (i12 * 4) + i20) {
                                        if (i10 >= height - i19) {
                                        }
                                    }
                                }
                            }
                            z9 = true;
                            if (this.G && !this.F && !this.E) {
                                return z9;
                            }
                            d(z9);
                            int b10 = b();
                            i11 = 0;
                            while (i11 < themeEditorView.e.size()) {
                                int i21 = ((org.telegram.ui.ActionBar.t6) themeEditorView.e.get(i11)).e;
                                if ((i11 == 0 && i21 == org.telegram.ui.ActionBar.k6.Be) || i21 == org.telegram.ui.ActionBar.k6.Ce || i21 == org.telegram.ui.ActionBar.k6.De || i21 == org.telegram.ui.ActionBar.k6.Ee || i21 == org.telegram.ui.ActionBar.k6.d6 || i21 == org.telegram.ui.ActionBar.k6.a7) {
                                    b10 |= -16777216;
                                }
                                ((org.telegram.ui.ActionBar.t6) themeEditorView.e.get(i11)).e(b10, z11, true);
                                i11++;
                                z11 = false;
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
                                for (int i22 = 0; i22 < 4; i22++) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i22];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                }
                                editorAlert.B1 = false;
                            }
                            invalidate();
                            return true;
                        }
                        f10 = 1.0f - ((i10 - (height - r3)) / (this.r * 2.0f));
                        this.w = f10;
                        if (f10 >= 0.0f) {
                            this.w = 0.0f;
                        } else if (f10 > 1.0f) {
                            this.w = 1.0f;
                        }
                        z9 = true;
                        this.G = true;
                        if (this.G) {
                        }
                        d(z9);
                        int b102 = b();
                        i11 = 0;
                        while (i11 < themeEditorView.e.size()) {
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
                i10 = i7;
                if (!this.G) {
                }
                f10 = 1.0f - ((i10 - (height - r3)) / (this.r * 2.0f));
                this.w = f10;
                if (f10 >= 0.0f) {
                }
                z9 = true;
                this.G = true;
                if (this.G) {
                }
                d(z9);
                int b1022 = b();
                i11 = 0;
                while (i11 < themeEditorView.e.size()) {
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
            i10 = i7;
            f11 = (i10 - (height - r4)) / (this.r * 2.0f);
            if (f11 >= 0.0f) {
                f11 = 0.0f;
            } else if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            fArr[2] = f11;
            this.F = true;
            if (!this.G) {
            }
            f10 = 1.0f - ((i10 - (height - r3)) / (this.r * 2.0f));
            this.w = f10;
            if (f10 >= 0.0f) {
            }
            z9 = true;
            this.G = true;
            if (this.G) {
            }
            d(z9);
            int b10222 = b();
            i11 = 0;
            while (i11 < themeEditorView.e.size()) {
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
        i7 = y10;
        double d = this.r;
        if (sqrt > d) {
            sqrt = d;
        }
        this.E = true;
        fArr[0] = (float) (Math.toDegrees(Math.atan2(i16, i15)) + 180.0d);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, (float) (sqrt / this.r)));
        this.y = null;
        this.D = null;
        if (this.F) {
        }
        f11 = (i10 - (height - r4)) / (this.r * 2.0f);
        if (f11 >= 0.0f) {
        }
        fArr[2] = f11;
        this.F = true;
        if (!this.G) {
        }
        f10 = 1.0f - ((i10 - (height - r3)) / (this.r * 2.0f));
        this.w = f10;
        if (f10 >= 0.0f) {
        }
        z9 = true;
        this.G = true;
        if (this.G) {
        }
        d(z9);
        int b102222 = b();
        i11 = 0;
        while (i11 < themeEditorView.e.size()) {
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
