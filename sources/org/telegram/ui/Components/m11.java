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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m11 extends FrameLayout {
    public boolean B;
    public boolean C;
    public boolean D;
    public final DecelerateInterpolator E;
    public final /* synthetic */ ThemeEditorView.EditorAlert F;
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
    public m11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context);
        this.F = editorAlert;
        this.b = AndroidUtilities.dp(20.0f);
        this.n = new EditTextBoldCursor[4];
        this.s = new float[]{0.0f, 0.0f, 1.0f};
        this.v = 1.0f;
        this.w = new float[3];
        this.E = new DecelerateInterpolator();
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
        addView(linearLayout, k7.c6.e(-2, -2, 49));
        int i10 = 0;
        while (i10 < 4) {
            this.n[i10] = new EditTextBoldCursor(context);
            this.n[i10].setInputType(2);
            this.n[i10].setTextColor(-14606047);
            this.n[i10].setCursorColor(-14606047);
            this.n[i10].setCursorSize(AndroidUtilities.dp(20.0f));
            this.n[i10].setCursorWidth(1.5f);
            this.n[i10].setTextSize(1, 18.0f);
            this.n[i10].setBackground(null);
            this.n[i10].setLineColors(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.u5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.v5, false), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
            this.n[i10].setMaxLines(1);
            this.n[i10].setTag(Integer.valueOf(i10));
            this.n[i10].setGravity(17);
            if (i10 == 0) {
                this.n[i10].setHint("red");
            } else if (i10 == 1) {
                this.n[i10].setHint("green");
            } else if (i10 == 2) {
                this.n[i10].setHint("blue");
            } else if (i10 == 3) {
                this.n[i10].setHint("alpha");
            }
            this.n[i10].setImeOptions((i10 == 3 ? 6 : 5) | TLObject.FLAG_28);
            this.n[i10].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            this.a.addView(this.n[i10], k7.c6.k(0.0f, 0.0f, i10 != 3 ? 16.0f : 0.0f, 0.0f, 55, 36));
            this.n[i10].addTextChangedListener(new l11(this, i10));
            this.n[i10].setOnEditorActionListener(new dg.a0(4));
            i10++;
        }
    }

    public final void a(Canvas canvas, int i10, int i11, int i12) {
        int dp = AndroidUtilities.dp(13.0f);
        Drawable drawable = this.f;
        drawable.setBounds(i10 - dp, i11 - dp, i10 + dp, dp + i11);
        drawable.draw(canvas);
        Paint paint = this.e;
        paint.setColor(-1);
        float f10 = i10;
        float f11 = i11;
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(11.0f), paint);
        paint.setColor(i12);
        canvas.drawCircle(f10, f11, AndroidUtilities.dp(9.0f), paint);
    }

    public final int b() {
        return (Color.HSVToColor(this.s) & 16777215) | (((int) (this.v * 255.0f)) << 24);
    }

    public final void c(int i10) {
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        int alpha = Color.alpha(i10);
        ThemeEditorView.EditorAlert editorAlert = this.F;
        if (!editorAlert.H) {
            editorAlert.H = true;
            EditTextBoldCursor[] editTextBoldCursorArr = this.n;
            editTextBoldCursorArr[0].setText("" + red);
            editTextBoldCursorArr[1].setText("" + green);
            editTextBoldCursorArr[2].setText("" + blue);
            editTextBoldCursorArr[3].setText("" + alpha);
            for (int i11 = 0; i11 < 4; i11++) {
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i11];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
            }
            editorAlert.H = false;
        }
        this.y = null;
        this.x = null;
        this.v = alpha / 255.0f;
        Color.colorToHSV(i10, this.s);
        invalidate();
    }

    public final void d(boolean z4) {
        org.telegram.ui.ActionBar.g3 g3Var;
        ViewGroup viewGroup;
        ThemeEditorView.EditorAlert editorAlert = this.F;
        if (editorAlert.G == z4) {
            return;
        }
        AnimatorSet animatorSet = editorAlert.F;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        editorAlert.G = z4;
        AnimatorSet animatorSet2 = new AnimatorSet();
        editorAlert.F = animatorSet2;
        g3Var = ((org.telegram.ui.ActionBar.h3) editorAlert).backDrawable;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(g3Var, n6.d, z4 ? 0 : 51);
        viewGroup = ((org.telegram.ui.ActionBar.h3) editorAlert).containerView;
        animatorSet2.playTogether(ofInt, ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, z4 ? 0.2f : 1.0f));
        editorAlert.F.setDuration(150L);
        editorAlert.F.setInterpolator(this.E);
        editorAlert.F.start();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        char c3;
        int width = getWidth() / 2;
        int i10 = this.b;
        int i11 = width - (i10 * 2);
        int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
        Bitmap bitmap = this.h;
        int i12 = this.r;
        canvas.drawBitmap(bitmap, i11 - i12, height - i12, (Paint) null);
        float[] fArr = this.s;
        double radians = (float) Math.toRadians(fArr[0]);
        int i13 = ((int) ((-Math.cos(radians)) * fArr[1] * this.r)) + i11;
        double d = -Math.sin(radians);
        float f10 = fArr[1];
        float f11 = fArr[0];
        float[] fArr2 = this.w;
        fArr2[0] = f11;
        fArr2[1] = f10;
        fArr2[2] = 1.0f;
        a(canvas, i13, ((int) (d * f10 * this.r)) + height, Color.HSVToColor(fArr2));
        int i14 = this.r;
        int i15 = i11 + i14 + i10;
        int i16 = height - i14;
        int dp = AndroidUtilities.dp(9.0f);
        int i17 = this.r * 2;
        if (this.x == null) {
            c3 = 2;
            this.x = new LinearGradient(i15, i16, i15 + dp, i16 + i17, new int[]{-16777216, Color.HSVToColor(fArr2)}, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            c3 = 2;
        }
        LinearGradient linearGradient = this.x;
        Paint paint = this.d;
        paint.setShader(linearGradient);
        float f12 = i16;
        float f13 = i16 + i17;
        canvas.drawRect(i15, f12, i15 + dp, f13, paint);
        int i18 = dp / 2;
        float f14 = i17;
        a(canvas, i15 + i18, (int) ((fArr[c3] * f14) + f12), Color.HSVToColor(fArr));
        int i19 = (i10 * 2) + i15;
        if (this.y == null) {
            int HSVToColor = Color.HSVToColor(fArr2);
            this.y = new LinearGradient(i19, f12, i19 + dp, f13, new int[]{HSVToColor, HSVToColor & 16777215}, (float[]) null, Shader.TileMode.CLAMP);
        }
        paint.setShader(this.y);
        canvas.drawRect(i19, f12, dp + i19, f13, paint);
        a(canvas, i19 + i18, (int) e2.c.w(1.0f, this.v, f14, f12), (Color.HSVToColor(fArr) & 16777215) | (((int) (this.v * 255.0f)) << 24));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        measureChild(this.a, i10, i11);
        setMeasuredDimension(min, min);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int c3 = l.d.c(20.0f, (i10 / 2) - (this.b * 2), 1);
        this.r = c3;
        int i14 = c3 * 2;
        int i15 = c3 * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[13];
        float[] fArr = {0.0f, 1.0f, 1.0f};
        for (int i16 = 0; i16 < 13; i16++) {
            fArr[0] = ((i16 * 30) + 180) % 360;
            iArr[i16] = Color.HSVToColor(fArr);
        }
        iArr[12] = iArr[0];
        float f10 = i14 / 2;
        float f11 = i15 / 2;
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
        int i10;
        int i11;
        float f10;
        boolean z4;
        int i12;
        float f11;
        ThemeEditorView.EditorAlert editorAlert = this.F;
        ThemeEditorView themeEditorView = ThemeEditorView.this;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.D = false;
                this.C = false;
                this.B = false;
                d(false);
            }
            return super.onTouchEvent(motionEvent);
        }
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int width = getWidth() / 2;
        int i13 = this.b;
        int i14 = i13 * 2;
        int i15 = width - i14;
        int height = (getHeight() / 2) - AndroidUtilities.dp(8.0f);
        int i16 = x10 - i15;
        int i17 = y10 - height;
        double sqrt = Math.sqrt((i17 * i17) + (i16 * i16));
        boolean z10 = this.B;
        float[] fArr = this.s;
        if (!z10) {
            if (this.D || this.C) {
                i10 = y10;
            } else {
                i10 = y10;
            }
            if (this.C) {
                if (!this.B && !this.D) {
                    int i18 = this.r;
                    int i19 = i15 + i18;
                    if (x10 >= i19 + i13 && x10 <= i14 + i19) {
                        i11 = i10;
                        if (i11 >= height - i18) {
                        }
                        if (!this.D) {
                            if (!this.B && !this.C) {
                                int i20 = this.r;
                                int i21 = i15 + i20;
                                if (x10 >= (i13 * 3) + i21) {
                                    if (x10 <= (i13 * 4) + i21) {
                                        if (i11 >= height - i20) {
                                        }
                                    }
                                }
                            }
                            z4 = true;
                            if (this.D && !this.C && !this.B) {
                                return z4;
                            }
                            d(z4);
                            int b10 = b();
                            for (i12 = 0; i12 < themeEditorView.c.size(); i12++) {
                                int i22 = ((org.telegram.ui.ActionBar.m6) themeEditorView.c.get(i12)).f;
                                if ((i12 == 0 && i22 == org.telegram.ui.ActionBar.k6.Nd) || i22 == org.telegram.ui.ActionBar.k6.Od || i22 == org.telegram.ui.ActionBar.k6.Pd || i22 == org.telegram.ui.ActionBar.k6.Qd || i22 == org.telegram.ui.ActionBar.k6.d6 || i22 == org.telegram.ui.ActionBar.k6.a7) {
                                    b10 |= -16777216;
                                }
                                ((org.telegram.ui.ActionBar.m6) themeEditorView.c.get(i12)).d(b10, false, true);
                            }
                            int red = Color.red(b10);
                            int green = Color.green(b10);
                            int blue = Color.blue(b10);
                            int alpha = Color.alpha(b10);
                            if (!editorAlert.H) {
                                editorAlert.H = true;
                                EditTextBoldCursor[] editTextBoldCursorArr = this.n;
                                editTextBoldCursorArr[0].setText("" + red);
                                editTextBoldCursorArr[1].setText("" + green);
                                editTextBoldCursorArr[2].setText("" + blue);
                                editTextBoldCursorArr[3].setText("" + alpha);
                                for (int i23 = 0; i23 < 4; i23++) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i23];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                }
                                editorAlert.H = false;
                            }
                            invalidate();
                            return true;
                        }
                        f10 = 1.0f - ((i11 - (height - r3)) / (this.r * 2.0f));
                        this.v = f10;
                        if (f10 >= 0.0f) {
                            this.v = 0.0f;
                        } else if (f10 > 1.0f) {
                            this.v = 1.0f;
                        }
                        z4 = true;
                        this.D = true;
                        if (this.D) {
                        }
                        d(z4);
                        int b102 = b();
                        while (i12 < themeEditorView.c.size()) {
                        }
                        int red2 = Color.red(b102);
                        int green2 = Color.green(b102);
                        int blue2 = Color.blue(b102);
                        int alpha2 = Color.alpha(b102);
                        if (!editorAlert.H) {
                        }
                        invalidate();
                        return true;
                    }
                }
                i11 = i10;
                if (!this.D) {
                }
                f10 = 1.0f - ((i11 - (height - r3)) / (this.r * 2.0f));
                this.v = f10;
                if (f10 >= 0.0f) {
                }
                z4 = true;
                this.D = true;
                if (this.D) {
                }
                d(z4);
                int b1022 = b();
                while (i12 < themeEditorView.c.size()) {
                }
                int red22 = Color.red(b1022);
                int green22 = Color.green(b1022);
                int blue22 = Color.blue(b1022);
                int alpha22 = Color.alpha(b1022);
                if (!editorAlert.H) {
                }
                invalidate();
                return true;
            }
            i11 = i10;
            f11 = (i11 - (height - r4)) / (this.r * 2.0f);
            if (f11 >= 0.0f) {
                f11 = 0.0f;
            } else if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            fArr[2] = f11;
            this.C = true;
            if (!this.D) {
            }
            f10 = 1.0f - ((i11 - (height - r3)) / (this.r * 2.0f));
            this.v = f10;
            if (f10 >= 0.0f) {
            }
            z4 = true;
            this.D = true;
            if (this.D) {
            }
            d(z4);
            int b10222 = b();
            while (i12 < themeEditorView.c.size()) {
            }
            int red222 = Color.red(b10222);
            int green222 = Color.green(b10222);
            int blue222 = Color.blue(b10222);
            int alpha222 = Color.alpha(b10222);
            if (!editorAlert.H) {
            }
            invalidate();
            return true;
        }
        i10 = y10;
        double d = this.r;
        if (sqrt > d) {
            sqrt = d;
        }
        this.B = true;
        fArr[0] = (float) (Math.toDegrees(Math.atan2(i17, i16)) + 180.0d);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, (float) (sqrt / this.r)));
        this.x = null;
        this.y = null;
        if (this.C) {
        }
        f11 = (i11 - (height - r4)) / (this.r * 2.0f);
        if (f11 >= 0.0f) {
        }
        fArr[2] = f11;
        this.C = true;
        if (!this.D) {
        }
        f10 = 1.0f - ((i11 - (height - r3)) / (this.r * 2.0f));
        this.v = f10;
        if (f10 >= 0.0f) {
        }
        z4 = true;
        this.D = true;
        if (this.D) {
        }
        d(z4);
        int b102222 = b();
        while (i12 < themeEditorView.c.size()) {
        }
        int red2222 = Color.red(b102222);
        int green2222 = Color.green(b102222);
        int blue2222 = Color.blue(b102222);
        int alpha2222 = Color.alpha(b102222);
        if (!editorAlert.H) {
        }
        invalidate();
        return true;
    }
}
