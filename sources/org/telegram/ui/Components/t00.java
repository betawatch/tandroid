package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class t00 extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final Object c;
    public Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t00(v00 v00Var, Activity activity) {
        super(activity);
        this.e = v00Var;
        this.c = new RectF();
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.d;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((r80) this.e).E = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(bs.g);
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, 0.0f, -AndroidUtilities.dp(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, AndroidUtilities.dp(10.0f), 0.0f));
        animatorSet.addListener(new c80(this, 1));
        animatorSet.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 3:
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) this.e;
                org.telegram.ui.Wallet.p5 p5Var = s5Var.b;
                if (p5Var != null) {
                    float[] fArr = (float[]) s5Var.h.b;
                    float[] fArr2 = p5Var.k;
                    float[] fArr3 = p5Var.l;
                    Paint paint = p5Var.b;
                    Paint paint2 = p5Var.d;
                    Path path = p5Var.p;
                    if (p5Var.q != 0.0f && (Math.abs(Math.sin(Math.toRadians(p5Var.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(p5Var.T))) >= 0.009999999776482582d)) {
                        int a2 = org.telegram.ui.Wallet.h7.a(fArr, -16216082);
                        int a10 = org.telegram.ui.Wallet.h7.a(fArr, -15291399);
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(org.telegram.ui.Wallet.p5.d(0.82500005f, 0.0f, 0.0f, a2, a10));
                        path.rewind();
                        path.moveTo(fArr3[0], fArr3[1]);
                        for (int i10 = 1; i10 < 76; i10++) {
                            int i11 = i10 * 2;
                            path.lineTo(fArr3[i11], fArr3[i11 + 1]);
                        }
                        path.close();
                        canvas.drawPath(path, paint);
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        float f7 = 0.6f;
                        paint2.setStrokeWidth(p5Var.q * 0.6f);
                        int[] iArr = p5Var.o;
                        int length = iArr.length;
                        int i12 = 0;
                        while (i12 < length) {
                            int i13 = iArr[i12];
                            int i14 = (i13 + 1) % 76;
                            int i15 = i13 * 2;
                            int i16 = i14 * 2;
                            float f10 = f7;
                            float[] fArr4 = p5Var.j;
                            float f11 = (fArr4[i15] + fArr4[i16]) * 0.5f;
                            int i17 = i15 + 1;
                            int i18 = i16 + 1;
                            float f12 = (fArr4[i17] + fArr4[i18]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i19 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(r4.c.c(f12, f12, f11 * f11, 0.0144f)));
                            float f13 = f11 * sqrt;
                            float f14 = f12 * sqrt;
                            float f15 = (p5Var.r ? -0.12f : 0.12f) * sqrt;
                            float c10 = org.telegram.ui.Wallet.p5.c((p5Var.Y * f15) + (p5Var.X * f14) + (p5Var.W * f13));
                            float c11 = org.telegram.ui.Wallet.p5.c((p5Var.b0 * f15) + (f14 * p5Var.a0) + (f13 * p5Var.Z));
                            int i20 = i12;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float pow = (float) Math.pow(c11, 24.0d);
                            float A = com.google.android.gms.internal.play_billing.k3.A(c10, 0.38f, 0.36f, 1.5f);
                            float f16 = pow * 0.1f * 1.5f;
                            int d = org.telegram.ui.Wallet.p5.d(A, 0.089999996f, f16, a2, a10);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i15], fArr5[i17]);
                            path.lineTo(fArr5[i16], fArr5[i18]);
                            path.lineTo(fArr6[i16], fArr6[i18]);
                            path.lineTo(fArr6[i15], fArr6[i17]);
                            path.close();
                            paint2.setStrokeWidth(p5Var.q * f10);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(org.telegram.ui.Wallet.p5.d(A * 0.75f, 0.067499995f, f16 * 0.75f, a2, a10));
                            paint2.setStrokeWidth(p5Var.q * 0.7f);
                            canvas.drawLine(fArr6[i15], fArr6[i17], fArr6[i16], fArr6[i18], paint2);
                            i12 = i20 + 1;
                            length = i19;
                            f7 = f10;
                            fArr2 = fArr5;
                            iArr = iArr2;
                            fArr3 = fArr6;
                        }
                    }
                }
                if (this.b) {
                    int save = canvas.save();
                    canvas.concat((Matrix) this.c);
                    super.dispatchDraw(canvas);
                    canvas.restoreToCount(save);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        Drawable drawable;
        Drawable drawable2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        switch (this.a) {
            case 0:
                RectF rectF = (RectF) this.c;
                v00 v00Var = (v00) this.e;
                int i22 = v00Var.h;
                i10 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingTop;
                int dp = (i22 - i10) - AndroidUtilities.dp(8.0f);
                getMeasuredHeight();
                AndroidUtilities.dp(36.0f);
                int i23 = dp + AndroidUtilities.statusBarHeight;
                if (this.b) {
                    i18 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingTop;
                    int i24 = i18 + i23;
                    int i25 = AndroidUtilities.statusBarHeight;
                    int i26 = i25 * 2;
                    if (i24 < i26) {
                        i21 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingTop;
                        i23 -= Math.min(i25, (i26 - i23) - i21);
                        f7 = 1.0f - Math.min(1.0f, (r3 * 2) / AndroidUtilities.statusBarHeight);
                    } else {
                        f7 = 1.0f;
                    }
                    i19 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingTop;
                    int i27 = i19 + i23;
                    int i28 = AndroidUtilities.statusBarHeight;
                    if (i27 < i28) {
                        i20 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingTop;
                        i11 = Math.min(i28, (i28 - i23) - i20);
                    } else {
                        i11 = 0;
                    }
                } else {
                    i11 = 0;
                    f7 = 1.0f;
                }
                drawable = ((org.telegram.ui.ActionBar.f3) v00Var).shadowDrawable;
                drawable.setBounds(0, i23, getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) v00Var).shadowDrawable;
                drawable2.draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
                    i14 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingLeft;
                    i15 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingTop;
                    int measuredWidth = getMeasuredWidth();
                    i16 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingLeft;
                    float f10 = measuredWidth - i16;
                    i17 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingTop;
                    rectF.set(i14, i15 + i23, f10, AndroidUtilities.dp(24.0f) + i17 + i23);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.t0);
                }
                if (i11 > 0) {
                    org.telegram.ui.ActionBar.h6.t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.h5, false));
                    i12 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingLeft;
                    float f11 = i12;
                    float f12 = AndroidUtilities.statusBarHeight - i11;
                    int measuredWidth2 = getMeasuredWidth();
                    i13 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingLeft;
                    canvas.drawRect(f11, f12, measuredWidth2 - i13, AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.h6.t0);
                }
                boolean z10 = i11 > AndroidUtilities.statusBarHeight / 2;
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z10) {
                    boolean z11 = AndroidUtilities.computePerceivedBrightness(v00Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5)) > 0.721f;
                    boolean z12 = AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v(v00Var.getThemedColor(org.telegram.ui.ActionBar.h6.s8), 855638016)) > 0.721f;
                    this.d = Boolean.valueOf(z10);
                    if (!z10) {
                        z11 = z12;
                    }
                    AndroidUtilities.setLightStatusBar(v00Var.getWindow(), z11);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                v00 v00Var = (v00) this.e;
                if (motionEvent.getAction() != 0 || v00Var.h == 0 || motionEvent.getY() >= v00Var.h) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                v00Var.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                v00.G((v00) this.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                v00 v00Var = (v00) this.e;
                ai.u1 u1Var = v00Var.b;
                v00Var.n = true;
                i12 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingLeft;
                int i15 = AndroidUtilities.statusBarHeight;
                i13 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingLeft;
                setPadding(i12, i15, i13, 0);
                v00Var.n = false;
                int h = (v00Var.c.h() * AndroidUtilities.dp(48.0f)) + AndroidUtilities.dp(48.0f);
                i14 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingTop;
                int i16 = i14 + h + AndroidUtilities.statusBarHeight;
                int i17 = size / 5;
                int i18 = ((double) i16) < ((double) i17) * 3.2d ? 0 : i17 * 2;
                if (i18 != 0 && i16 < size) {
                    i18 -= size - i16;
                }
                if (i18 == 0) {
                    i18 = ((org.telegram.ui.ActionBar.f3) v00Var).backgroundPaddingTop;
                }
                if (u1Var.getPaddingTop() != i18) {
                    v00Var.n = true;
                    u1Var.setPadding(AndroidUtilities.dp(10.0f), i18, AndroidUtilities.dp(10.0f), 0);
                    v00Var.n = false;
                }
                this.b = i16 >= size;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i16, size), TLObject.FLAG_30));
                break;
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.b ? 80.0f : 50.0f), TLObject.FLAG_30));
                break;
            case 2:
                org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) this.c;
                View view = (View) getParent();
                if (view != null && view.getWidth() > 0) {
                    i10 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
                }
                this.b = true;
                j5Var.setVisibility(8);
                super.onMeasure(i10, i11);
                j5Var.setVisibility(0);
                j5Var.getLayoutParams().width = getMeasuredWidth();
                this.b = false;
                ((org.telegram.ui.v70) this.e).f();
                super.onMeasure(i10, i11);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Wallet.s5 s5Var = (org.telegram.ui.Wallet.s5) this.e;
                s5Var.i0 = -1;
                s5Var.b(s5Var.c0, s5Var.f0);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return !((v00) this.e).isDismissed() && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 0:
                if (!((v00) this.e).n) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
            default:
                super.requestLayout();
                break;
            case 2:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t00(r80 r80Var, Context context, boolean z10) {
        super(context);
        this.e = r80Var;
        this.d = new TextView[2];
        this.b = !z10;
        setBackground(null);
        View view = new View(context);
        this.c = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.x5.f(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.Oh));
        }
        addView(view, w7.z5.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.d)[i10] = new TextView(context);
            ((TextView[]) this.d)[i10].setFocusable(false);
            ((TextView[]) this.d)[i10].setLines(1);
            ((TextView[]) this.d)[i10].setSingleLine(true);
            ((TextView[]) this.d)[i10].setGravity(1);
            ((TextView[]) this.d)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.d)[i10].setGravity(17);
            if (this.b) {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false));
                ((TextView[]) this.d)[i10].setTypeface(AndroidUtilities.bold());
            } else {
                ((TextView[]) this.d)[i10].setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false));
            }
            ((TextView[]) this.d)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.d)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.d)[i10].setPadding(0, 0, 0, this.b ? 0 : AndroidUtilities.dp(13.0f));
            addView(((TextView[]) this.d)[i10], w7.z5.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.d)[i10].setAlpha(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t00(org.telegram.ui.v70 v70Var, Context context) {
        super(context);
        this.e = v70Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(true);
        j5Var.setRightPadding(AndroidUtilities.dp(68.0f));
        j5Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.j5, false));
        addView(j5Var, w7.z5.d(0, -2.0f, 19, 19.0f, 0.0f, 19.0f, 0.0f));
        k9 k9Var = new k9(context, false);
        this.d = k9Var;
        k9Var.a.a = true;
        k9Var.setStyle(11);
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(22.0f));
        addView(k9Var, w7.z5.d(56, -1.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), 0, 4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t00(org.telegram.ui.Wallet.s5 s5Var, Context context) {
        super(context);
        this.e = s5Var;
        this.c = new Matrix();
        this.d = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
