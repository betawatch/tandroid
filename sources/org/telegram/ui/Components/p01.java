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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p01 extends FrameLayout {
    public boolean A;
    public boolean B;
    public boolean C;
    public final DecelerateInterpolator D;
    public final /* synthetic */ ThemeEditorView.EditorAlert E;
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
    public float v;
    public final float[] w;
    public LinearGradient x;
    public LinearGradient y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.E = editorAlert;
        this.b = AndroidUtilities.dp(20.0f);
        this.n = new EditTextBoldCursor[4];
        this.s = new float[]{0.0f, 0.0f, 1.0f};
        this.v = 1.0f;
        this.w = new float[3];
        this.D = new DecelerateInterpolator();
        setWillNotDraw(false);
        this.e = new Paint(1);
        this.f = context.getResources().getDrawable(R.drawable.knob_shadow).mutate();
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
        addView(linearLayout, g7.e6.e(-2, -2, 49));
        int i9 = 0;
        while (i9 < 4) {
            this.n[i9] = new EditTextBoldCursor(context);
            this.n[i9].setInputType(2);
            this.n[i9].setTextColor(-14606047);
            this.n[i9].setCursorColor(-14606047);
            this.n[i9].setCursorSize(AndroidUtilities.dp(20.0f));
            this.n[i9].setCursorWidth(1.5f);
            this.n[i9].setTextSize(1, 18.0f);
            this.n[i9].setBackground(null);
            this.n[i9].setLineColors(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.u5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.v5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
            this.n[i9].setMaxLines(1);
            this.n[i9].setTag(Integer.valueOf(i9));
            this.n[i9].setGravity(17);
            if (i9 == 0) {
                this.n[i9].setHint("red");
            } else if (i9 == 1) {
                this.n[i9].setHint("green");
            } else if (i9 == 2) {
                this.n[i9].setHint("blue");
            } else if (i9 == 3) {
                this.n[i9].setHint("alpha");
            }
            this.n[i9].setImeOptions((i9 == 3 ? 6 : 5) | TLObject.FLAG_28);
            this.n[i9].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            this.a.addView(this.n[i9], g7.e6.k(0.0f, 0.0f, i9 != 3 ? 16.0f : 0.0f, 0.0f, 55, 36));
            this.n[i9].addTextChangedListener(new o01(this, i9));
            this.n[i9].setOnEditorActionListener(new o2(2));
            i9++;
        }
    }

    public final void a(Canvas canvas, int i9, int i10, int i11) {
        int dp = AndroidUtilities.dp(13.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i9 - dp, i10 - dp, i9 + dp, dp + i10);
        drawable.draw(canvas);
        Paint paint = this.e;
        paint.setColor(-1);
        float f10 = i9;
        float f11 = i10;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(11.0f), paint);
        paint.setColor(i11);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.s) & 16777215) | (((int) (this.v * 255.0f)) << 24);
    }

    public final void c(int i9) {
        int red = Color.red(i9);
        int green = Color.green(i9);
        int blue = Color.blue(i9);
        int alpha = Color.alpha(i9);
        ThemeEditorView.EditorAlert editorAlert = this.E;
        if (!editorAlert.G) {
            editorAlert.G = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.n;
            editTextBoldCursorArr[0].setText("" + red);
            editTextBoldCursorArr[1].setText("" + green);
            editTextBoldCursorArr[2].setText("" + blue);
            editTextBoldCursorArr[3].setText("" + alpha);
            for (int i10 = 0; i10 < 4; i10++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i10];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            editorAlert.G = false;
        }
        this.y = null;
        this.x = null;
        this.v = alpha / 255.0f;
        Color.colorToHSV(i9, this.s);
        invalidate();
    }

    public final void d(boolean z10) {
        org.telegram.ui.ActionBar.e3 e3Var;
        ViewGroup viewGroup;
        ThemeEditorView.EditorAlert editorAlert = this.E;
        if (editorAlert.F == z10) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.E;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.F = z10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.E = animatorSet2;
        e3Var = ((org.telegram.ui.ActionBar.f3) editorAlert).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(e3Var, m6.d, z10 ? 0 : 51);
        viewGroup = ((org.telegram.ui.ActionBar.f3) editorAlert).containerView;
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, z10 ? 0.2f : 1.0f));
        editorAlert.E.setDuration(150L);
        editorAlert.E.setInterpolator(this.D);
        editorAlert.E.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        char c10;
        int width = getWidth() / 2;
        int i9 = this.b;
        int i10 = width - (i9 * 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
        Bitmap bitmap = this.h;
        int i11 = this.r;
        canvas.drawBitmap(bitmap, i10 - i11, height - i11, (Paint) null);
        float[] fArr = this.s;
        double radians = (float) Math.toRadians(fArr[0]);
        int i12 = ((int) ((-Math.cos(radians)) * fArr[1] * this.r)) + i10;
        double d = -Math.sin(radians);
        float f10 = fArr[1];
        float f11 = fArr[0];
        float[] fArr2 = this.w;
        fArr2[0] = f11;
        fArr2[1] = f10;
        fArr2[2] = 1.0f;
        a(canvas, i12, ((int) (d * f10 * this.r)) + height, Color.HSVToColor(fArr2));
        int i13 = this.r;
        int i14 = i10 + i13 + i9;
        int i15 = height - i13;
        int dp = AndroidUtilities.dp(9.0f);
        int i16 = this.r * 2;
        if (this.x == null) {
            c10 = 2;
            this.x = new LinearGradient(i14, i15, i14 + dp, i15 + i16, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c10 = 2;
        }
        LinearGradient linearGradient = this.x;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f12 = i15;
        float f13 = i15 + i16;
        canvas.drawRect(i14, f12, i14 + dp, f13, paint);
        int i17 = dp / 2;
        float f14 = i16;
        a(canvas, i14 + i17, (int) ((fArr[c10] * f14) + f12), Color.HSVToColor(fArr));
        int i18 = (i9 * 2) + i14;
        if (this.y == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.y = new LinearGradient(i18, f12, i18 + dp, f13, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.y);
        canvas.drawRect(i18, f12, dp + i18, f13, paint);
        a(canvas, i18 + i17, (int) e2.c.z(1.0f, this.v, f14, f12), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.v * 255.0f)) << 24));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int min = Math.min(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        measureChild(this.a, i9, i10);
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int b10 = org.telegram.messenger.l0.b(20.0f, (i9 / 2) - (this.b * 2), 1);
        this.r = b10;
        int i13 = b10 * 2;
        int i14 = b10 * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i13, i14, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i15 = 0; i15 < 13; i15++) {
            fArr[0] = ((i15 * 30) + 180) % 360;
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
        this.x = null;
        this.y = null;
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
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010f, code lost:
    
        if (r10 <= (r4 + r11)) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9;
        int i10;
        float f10;
        boolean z10;
        int i11;
        float f11;
        ThemeEditorView.EditorAlert editorAlert = this.E;
        ThemeEditorView themeEditorView = ThemeEditorView.this;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.C = false;
                this.B = false;
                this.A = false;
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
        int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
        int i15 = x10 - i14;
        int i16 = y10 - height;
        double sqrt = Math.sqrt((i16 * i16) + (i15 * i15));
        boolean z11 = this.A;
        float[] fArr = this.s;
        if (!z11) {
            if (this.C || this.B) {
                i9 = y10;
            } else {
                i9 = y10;
            }
            if (this.B) {
                if (!this.A && !this.C) {
                    int i17 = this.r;
                    int i18 = i14 + i17;
                    if (x10 >= i18 + i12 && x10 <= i13 + i18) {
                        i10 = i9;
                        if (i10 >= height - i17) {
                        }
                        if (!this.C) {
                            if (!this.A && !this.B) {
                                int i19 = this.r;
                                int i20 = i14 + i19;
                                if (x10 >= (i12 * 3) + i20) {
                                    if (x10 <= (i12 * 4) + i20) {
                                        if (i10 >= height - i19) {
                                        }
                                    }
                                }
                            }
                            z10 = true;
                            if (this.C && !this.B && !this.A) {
                                return z10;
                            }
                            d(z10);
                            int b10 = b();
                            for (i11 = 0; i11 < themeEditorView.c.size(); i11++) {
                                int i21 = ((org.telegram.ui.ActionBar.h6) themeEditorView.c.get(i11)).f;
                                if ((i11 == 0 && i21 == org.telegram.ui.ActionBar.f6.Nd) || i21 == org.telegram.ui.ActionBar.f6.Od || i21 == org.telegram.ui.ActionBar.f6.Pd || i21 == org.telegram.ui.ActionBar.f6.Qd || i21 == org.telegram.ui.ActionBar.f6.d6 || i21 == org.telegram.ui.ActionBar.f6.a7) {
                                    b10 |= -16777216;
                                }
                                ((org.telegram.ui.ActionBar.h6) themeEditorView.c.get(i11)).d(b10, false, true);
                            }
                            int red = Color.red(b10);
                            int green = Color.green(b10);
                            int blue = Color.blue(b10);
                            int alpha = Color.alpha(b10);
                            if (!editorAlert.G) {
                                editorAlert.G = true;
                                EditTextBoldCursor[] editTextBoldCursorArr = this.n;
                                editTextBoldCursorArr[0].setText("" + red);
                                editTextBoldCursorArr[1].setText("" + green);
                                editTextBoldCursorArr[2].setText("" + blue);
                                editTextBoldCursorArr[3].setText("" + alpha);
                                for (int i22 = 0; i22 < 4; i22++) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i22];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                }
                                editorAlert.G = false;
                            }
                            invalidate();
                            return true;
                        }
                        f10 = 1.0f - ((i10 - (height - r3)) / (this.r * 2.0f));
                        this.v = f10;
                        if (f10 >= 0.0f) {
                            this.v = 0.0f;
                        } else if (f10 > 1.0f) {
                            this.v = 1.0f;
                        }
                        z10 = true;
                        this.C = true;
                        if (this.C) {
                        }
                        d(z10);
                        int b102 = b();
                        while (i11 < themeEditorView.c.size()) {
                        }
                        int red2 = Color.red(b102);
                        int green2 = Color.green(b102);
                        int blue2 = Color.blue(b102);
                        int alpha2 = Color.alpha(b102);
                        if (!editorAlert.G) {
                        }
                        invalidate();
                        return true;
                    }
                }
                i10 = i9;
                if (!this.C) {
                }
                f10 = 1.0f - ((i10 - (height - r3)) / (this.r * 2.0f));
                this.v = f10;
                if (f10 >= 0.0f) {
                }
                z10 = true;
                this.C = true;
                if (this.C) {
                }
                d(z10);
                int b1022 = b();
                while (i11 < themeEditorView.c.size()) {
                }
                int red22 = Color.red(b1022);
                int green22 = Color.green(b1022);
                int blue22 = Color.blue(b1022);
                int alpha22 = Color.alpha(b1022);
                if (!editorAlert.G) {
                }
                invalidate();
                return true;
            }
            i10 = i9;
            f11 = (i10 - (height - r4)) / (this.r * 2.0f);
            if (f11 >= 0.0f) {
                f11 = 0.0f;
            } else if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            fArr[2] = f11;
            this.B = true;
            if (!this.C) {
            }
            f10 = 1.0f - ((i10 - (height - r3)) / (this.r * 2.0f));
            this.v = f10;
            if (f10 >= 0.0f) {
            }
            z10 = true;
            this.C = true;
            if (this.C) {
            }
            d(z10);
            int b10222 = b();
            while (i11 < themeEditorView.c.size()) {
            }
            int red222 = Color.red(b10222);
            int green222 = Color.green(b10222);
            int blue222 = Color.blue(b10222);
            int alpha222 = Color.alpha(b10222);
            if (!editorAlert.G) {
            }
            invalidate();
            return true;
        }
        i9 = y10;
        double d = this.r;
        if (sqrt > d) {
            sqrt = d;
        }
        this.A = true;
        fArr[0] = (float) (Math.toDegrees(Math.atan2(i16, i15)) + 180.0d);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, (float) (sqrt / this.r)));
        this.x = null;
        this.y = null;
        if (this.B) {
        }
        f11 = (i10 - (height - r4)) / (this.r * 2.0f);
        if (f11 >= 0.0f) {
        }
        fArr[2] = f11;
        this.B = true;
        if (!this.C) {
        }
        f10 = 1.0f - ((i10 - (height - r3)) / (this.r * 2.0f));
        this.v = f10;
        if (f10 >= 0.0f) {
        }
        z10 = true;
        this.C = true;
        if (this.C) {
        }
        d(z10);
        int b102222 = b();
        while (i11 < themeEditorView.c.size()) {
        }
        int red2222 = Color.red(b102222);
        int green2222 = Color.green(b102222);
        int blue2222 = Color.blue(b102222);
        int alpha2222 = Color.alpha(b102222);
        if (!editorAlert.G) {
        }
        invalidate();
        return true;
    }
}
