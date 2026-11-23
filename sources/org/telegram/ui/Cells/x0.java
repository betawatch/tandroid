package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.i70;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.s60;
import org.telegram.ui.Components.sz;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class x0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public boolean c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Context context, int i7) {
        super(context);
        this.a = i7;
        switch (i7) {
            case 3:
                super(context);
                this.c = true;
                setBackgroundColor(-15066598);
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                textView.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
                textView.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                textView.setText(hd.N0(2131752577, null).toUpperCase());
                textView.setTypeface(org.telegram.messenger.g0.o());
                addView(textView, c8.ma.e(-2, -1, 51));
                TextView textView2 = new TextView(context);
                this.b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(-1);
                textView2.setGravity(17);
                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
                textView2.setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), 0);
                textView2.setText(hd.N0(2131745444, null).toUpperCase());
                textView2.setTypeface(org.telegram.messenger.g0.o());
                addView(textView2, c8.ma.e(-2, -1, 53));
                TextView textView3 = new TextView(context);
                this.e = textView3;
                textView3.setTypeface(org.telegram.messenger.g0.o());
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(17);
                textView3.setBackgroundResource(R.drawable.photobadge);
                textView3.setMinWidth(org.telegram.messenger.g0.L(23.0f));
                textView3.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(1.0f));
                addView(textView3, c8.ma.d(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
                break;
            default:
                break;
        }
    }

    public void a(String str, boolean z10) {
        TextView[] textViewArr = (TextView[]) this.b;
        if (!z10) {
            textViewArr[0].setText(str);
            return;
        }
        textViewArr[1].setText(str);
        ((i70) this.e).B1 = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(nr.g);
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, 0.0f, -org.telegram.messenger.g0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, org.telegram.messenger.g0.L(10.0f), 0.0f));
        animatorSet.addListener(new s60(this, 1));
        animatorSet.start();
    }

    public void b() {
        boolean z10 = this.c;
        TextView textView = (TextView) this.e;
        TextView textView2 = (TextView) this.b;
        textView.setVisibility(8);
        textView2.setTextColor(z10 ? -1 : -15095832);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 4:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) this.e;
                org.telegram.ui.Wallet.p6 p6Var = s6Var.b;
                if (p6Var != null) {
                    float[] fArr = (float[]) s6Var.h.b;
                    float[] fArr2 = p6Var.k;
                    float[] fArr3 = p6Var.l;
                    Paint paint = p6Var.b;
                    Paint paint2 = p6Var.d;
                    Path path = p6Var.p;
                    if (p6Var.q != 0.0f && (Math.abs(Math.sin(Math.toRadians(p6Var.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(p6Var.T))) >= 0.009999999776482582d)) {
                        int a10 = org.telegram.ui.Wallet.f8.a(-16216082, fArr);
                        int a11 = org.telegram.ui.Wallet.f8.a(-15291399, fArr);
                        paint.setShader(null);
                        paint.setAlpha(ls.e4);
                        paint.setColor(org.telegram.ui.Wallet.p6.d(0.82500005f, 0.0f, 0.0f, a10, a11));
                        path.rewind();
                        path.moveTo(fArr3[0], fArr3[1]);
                        for (int i7 = 1; i7 < 76; i7++) {
                            int i10 = i7 * 2;
                            path.lineTo(fArr3[i10], fArr3[i10 + 1]);
                        }
                        path.close();
                        canvas.drawPath(path, paint);
                        paint2.setShader(null);
                        paint2.setAlpha(ls.e4);
                        float f10 = 0.6f;
                        paint2.setStrokeWidth(p6Var.q * 0.6f);
                        int[] iArr = p6Var.o;
                        int length = iArr.length;
                        int i11 = 0;
                        while (i11 < length) {
                            int i12 = iArr[i11];
                            int i13 = (i12 + 1) % 76;
                            int i14 = i12 * 2;
                            int i15 = i13 * 2;
                            float f11 = f10;
                            float[] fArr4 = p6Var.j;
                            float f12 = (fArr4[i14] + fArr4[i15]) * 0.5f;
                            int i16 = i14 + 1;
                            int i17 = i15 + 1;
                            float f13 = (fArr4[i16] + fArr4[i17]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i18 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(p5.c.e(f13, f13, f12 * f12, 0.0144f)));
                            float f14 = f12 * sqrt;
                            float f15 = f13 * sqrt;
                            float f16 = (p6Var.r ? -0.12f : 0.12f) * sqrt;
                            float c10 = org.telegram.ui.Wallet.p6.c((p6Var.Y * f16) + (p6Var.X * f15) + (p6Var.W * f14));
                            float c11 = org.telegram.ui.Wallet.p6.c((p6Var.b0 * f16) + (f15 * p6Var.a0) + (f14 * p6Var.Z));
                            int i19 = i11;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float pow = (float) Math.pow(c11, 24.0d);
                            float B = com.google.android.gms.internal.vision.e2.B(c10, 0.38f, 0.36f, 1.5f);
                            float f17 = pow * 0.1f * 1.5f;
                            int d = org.telegram.ui.Wallet.p6.d(B, 0.089999996f, f17, a10, a11);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i14], fArr5[i16]);
                            path.lineTo(fArr5[i15], fArr5[i17]);
                            path.lineTo(fArr6[i15], fArr6[i17]);
                            path.lineTo(fArr6[i14], fArr6[i16]);
                            path.close();
                            paint2.setStrokeWidth(p6Var.q * f11);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(org.telegram.ui.Wallet.p6.d(B * 0.75f, 0.067499995f, f17 * 0.75f, a10, a11));
                            paint2.setStrokeWidth(p6Var.q * 0.7f);
                            canvas.drawLine(fArr6[i14], fArr6[i16], fArr6[i15], fArr6[i17], paint2);
                            i11 = i19 + 1;
                            length = i18;
                            f10 = f11;
                            fArr2 = fArr5;
                            iArr = iArr2;
                            fArr3 = fArr6;
                        }
                    }
                }
                if (this.c) {
                    int save = canvas.save();
                    canvas.concat((Matrix) this.d);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float f10;
        int i7;
        boolean z10;
        Boolean bool;
        int i10 = 2;
        switch (this.a) {
            case 0:
                TextPaint textPaint = (TextPaint) this.e;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.M6, false);
                int red = Color.red(x02);
                int green = Color.green(x02);
                int blue = Color.blue(x02);
                w0 w0Var = (w0) this.d;
                w0Var.b(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.g7, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h7, false));
                RectF rectF = (RectF) this.b;
                rectF.set(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(73.0f));
                org.telegram.ui.ActionBar.m6.X1.setColor(Color.argb((int) (w0Var.getProgress() * 43.0f), red, green, blue));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.m6.X1);
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.g0.L(74.0f));
                org.telegram.ui.ActionBar.m6.t0.setColor(Color.argb((int) ((1.0f - w0Var.getProgress()) * 31.0f), red, green, blue));
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.ui.ActionBar.m6.t0);
                boolean z11 = this.c;
                String N0 = hd.N0(z11 ? 2131752211 : 2131752212, null);
                int ceil = (int) Math.ceil(textPaint.measureText(N0));
                textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
                canvas.drawText(N0, (getMeasuredWidth() - ceil) / 2, org.telegram.messenger.g0.L(96.0f), textPaint);
                int i11 = 0;
                while (i11 < i10) {
                    int L = org.telegram.messenger.g0.L(i11 == 0 ? 21.0f : 53.0f);
                    org.telegram.ui.ActionBar.m6.t0.setColor(Color.argb(i11 == 0 ? 204 : 90, red, green, blue));
                    canvas.drawCircle(org.telegram.messenger.g0.L(22.0f), L, org.telegram.messenger.g0.L(11.0f), org.telegram.ui.ActionBar.m6.t0);
                    int i12 = 0;
                    while (true) {
                        if (i12 < (z11 ? 3 : i10)) {
                            org.telegram.ui.ActionBar.m6.t0.setColor(Color.argb(i12 == 0 ? 204 : 90, red, green, blue));
                            if (z11) {
                                float f11 = i12 * 7;
                                rectF.set(org.telegram.messenger.g0.L(41.0f), L - org.telegram.messenger.g0.L(8.3f - f11), getMeasuredWidth() - org.telegram.messenger.g0.L(i12 != 0 ? 48.0f : 72.0f), L - org.telegram.messenger.g0.L(5.3f - f11));
                                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.N(1.5f), org.telegram.messenger.g0.N(1.5f), org.telegram.ui.ActionBar.m6.t0);
                            } else {
                                int i13 = i12 * 10;
                                rectF.set(org.telegram.messenger.g0.L(41.0f), L - org.telegram.messenger.g0.L(7 - i13), getMeasuredWidth() - org.telegram.messenger.g0.L(i12 != 0 ? 48.0f : 72.0f), L - org.telegram.messenger.g0.L(3 - i13));
                                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.t0);
                            }
                            i12++;
                            i10 = 2;
                        }
                    }
                    i11++;
                    i10 = 2;
                }
                break;
            case 1:
                RectF rectF2 = (RectF) this.b;
                sz szVar = (sz) this.e;
                int L2 = (szVar.s1 - szVar.t0) - org.telegram.messenger.g0.L(8.0f);
                getMeasuredHeight();
                org.telegram.messenger.g0.L(36.0f);
                int i14 = szVar.t0;
                int i15 = org.telegram.messenger.g0.m;
                int i16 = L2 + i15;
                if (this.c) {
                    if (i16 + i14 < i15 * 2) {
                        i16 -= Math.min(i15, ((i15 * 2) - i16) - i14);
                        f10 = 1.0f - Math.min(1.0f, (r6 * 2) / org.telegram.messenger.g0.m);
                    } else {
                        f10 = 1.0f;
                    }
                    int i17 = szVar.t0;
                    int i18 = i16 + i17;
                    int i19 = org.telegram.messenger.g0.m;
                    if (i18 < i19) {
                        i7 = Math.min(i19, (i19 - i16) - i17);
                        szVar.s0.setBounds(0, i16, getMeasuredWidth(), getMeasuredHeight());
                        szVar.s0.draw(canvas);
                        if (f10 != 1.0f) {
                            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
                            rectF2.set(szVar.u0, szVar.t0 + i16, getMeasuredWidth() - szVar.u0, org.telegram.messenger.g0.L(24.0f) + szVar.t0 + i16);
                            canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.m6.t0);
                        }
                        if (i7 > 0) {
                            org.telegram.ui.ActionBar.m6.t0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.h5, false));
                            canvas.drawRect(szVar.u0, org.telegram.messenger.g0.m - i7, getMeasuredWidth() - szVar.u0, org.telegram.messenger.g0.m, org.telegram.ui.ActionBar.m6.t0);
                        }
                        z10 = i7 <= org.telegram.messenger.g0.m / 2;
                        bool = (Boolean) this.d;
                        if (bool != null || bool.booleanValue() != z10) {
                            boolean z12 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, szVar.J0)) <= 0.721f;
                            boolean z13 = org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, szVar.J0), 855638016)) > 0.721f;
                            this.d = Boolean.valueOf(z10);
                            if (!z10) {
                                z12 = z13;
                            }
                            org.telegram.messenger.g0.r3(szVar.getWindow(), z12);
                            break;
                        }
                    }
                } else {
                    f10 = 1.0f;
                }
                i7 = 0;
                szVar.s0.setBounds(0, i16, getMeasuredWidth(), getMeasuredHeight());
                szVar.s0.draw(canvas);
                if (f10 != 1.0f) {
                }
                if (i7 > 0) {
                }
                if (i7 <= org.telegram.messenger.g0.m / 2) {
                }
                bool = (Boolean) this.d;
                if (bool != null) {
                }
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, szVar.J0)) <= 0.721f) {
                }
                if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.s8, szVar.J0), 855638016)) > 0.721f) {
                }
                this.d = Boolean.valueOf(z10);
                if (!z10) {
                }
                org.telegram.messenger.g0.r3(szVar.getWindow(), z12);
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((w0) this.d).f);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setContentDescription(hd.N0(this.c ? 2131752211 : 2131752212, null));
                break;
            case 1:
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                accessibilityNodeInfo.setClickable(true);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                sz szVar = (sz) this.e;
                if (motionEvent.getAction() != 0 || szVar.s1 == 0 || motionEvent.getY() >= szVar.s1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                szVar.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                sz.J0((sz) this.e);
                break;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i10);
                sz szVar = (sz) this.e;
                di.b1 b1Var = szVar.n1;
                szVar.t1 = true;
                int i11 = szVar.u0;
                setPadding(i11, org.telegram.messenger.g0.m, i11, 0);
                szVar.t1 = false;
                int b10 = (szVar.o1.b() * org.telegram.messenger.g0.L(48.0f)) + org.telegram.messenger.g0.L(48.0f);
                int i12 = szVar.t0;
                int i13 = b10 + i12 + org.telegram.messenger.g0.m;
                int i14 = size / 5;
                int i15 = ((double) i13) < ((double) i14) * 3.2d ? 0 : i14 * 2;
                if (i15 != 0 && i13 < size) {
                    i15 -= size - i13;
                }
                if (i15 != 0) {
                    i12 = i15;
                }
                if (b1Var.getPaddingTop() != i12) {
                    szVar.t1 = true;
                    b1Var.setPadding(org.telegram.messenger.g0.L(10.0f), i12, org.telegram.messenger.g0.L(10.0f), 0);
                    szVar.t1 = false;
                }
                this.c = i13 >= size;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(i13, size), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.c ? 80.0f : 50.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i7, i10, i11, i12);
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) this.e;
                s6Var.j0 = -1;
                s6Var.b(s6Var.d0, s6Var.g0);
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return !((sz) this.e).J && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 1:
                if (!((sz) this.e).t1) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(sz szVar, Activity activity) {
        super(activity);
        this.a = 1;
        this.e = szVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(i70 i70Var, Context context, boolean z10) {
        super(context);
        this.a = 2;
        this.e = i70Var;
        this.b = new TextView[2];
        this.c = !z10;
        setBackground(null);
        View view = new View(context);
        this.d = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
        }
        addView(view, c8.ma.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i7 = 0; i7 < 2; i7++) {
            ((TextView[]) this.b)[i7] = new TextView(context);
            ((TextView[]) this.b)[i7].setFocusable(false);
            ((TextView[]) this.b)[i7].setLines(1);
            ((TextView[]) this.b)[i7].setSingleLine(true);
            ((TextView[]) this.b)[i7].setGravity(1);
            ((TextView[]) this.b)[i7].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.b)[i7].setGravity(17);
            if (this.c) {
                org.telegram.ui.ActionBar.t6.U(((TextView[]) this.b)[i7], org.telegram.ui.ActionBar.m6.Ji, null);
                ((TextView[]) this.b)[i7].setTypeface(org.telegram.messenger.g0.o());
            } else {
                org.telegram.ui.ActionBar.t6.U(((TextView[]) this.b)[i7], org.telegram.ui.ActionBar.m6.Fi, null);
            }
            ((TextView[]) this.b)[i7].setImportantForAccessibility(2);
            ((TextView[]) this.b)[i7].setTextSize(1, 14.0f);
            ((TextView[]) this.b)[i7].setPadding(0, 0, 0, this.c ? 0 : org.telegram.messenger.g0.L(13.0f));
            addView(((TextView[]) this.b)[i7], c8.ma.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i7 == 1) {
                ((TextView[]) this.b)[i7].setAlpha(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(org.telegram.ui.Wallet.s6 s6Var, Context context) {
        super(context);
        this.a = 4;
        this.e = s6Var;
        this.d = new Matrix();
        this.b = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
