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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.uz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public boolean c;
    public Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 3:
                super(context);
                this.c = true;
                setBackgroundColor(-15066598);
                TextView textView = new TextView(context);
                this.d = textView;
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                textView.setBackground(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
                textView.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
                textView.setText(cd.L0(2131752589, null).toUpperCase());
                textView.setTypeface(org.telegram.messenger.i0.o());
                addView(textView, w7.b6.e(-2, -1, 51));
                TextView textView2 = new TextView(context);
                this.b = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(-1);
                textView2.setGravity(17);
                textView2.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.h0(-12763843, 0, -1));
                textView2.setPadding(org.telegram.messenger.i0.L(20.0f), 0, org.telegram.messenger.i0.L(20.0f), 0);
                textView2.setText(cd.L0(2131745657, null).toUpperCase());
                textView2.setTypeface(org.telegram.messenger.i0.o());
                addView(textView2, w7.b6.e(-2, -1, 53));
                TextView textView3 = new TextView(context);
                this.e = textView3;
                textView3.setTypeface(org.telegram.messenger.i0.o());
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(17);
                textView3.setBackgroundResource(R.drawable.photobadge);
                textView3.setMinWidth(org.telegram.messenger.i0.L(23.0f));
                textView3.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(1.0f));
                addView(textView3, w7.b6.d(-2, 23.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
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
        ((k70) this.e).x1 = true;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(180L);
        animatorSet.setInterpolator(gr.g);
        Property property = View.ALPHA;
        Property property2 = View.TRANSLATION_Y;
        animatorSet.playTogether(ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 1.0f, 0.0f), ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, 0.0f, -org.telegram.messenger.i0.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 0.0f, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, org.telegram.messenger.i0.L(10.0f), 0.0f));
        animatorSet.addListener(new t60(this, 1));
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
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) this.e;
                org.telegram.ui.Wallet.c6 c6Var = g6Var.b;
                if (c6Var != null) {
                    float[] fArr = (float[]) g6Var.h.b;
                    float[] fArr2 = c6Var.k;
                    float[] fArr3 = c6Var.l;
                    Paint paint = c6Var.b;
                    Paint paint2 = c6Var.d;
                    Path path = c6Var.p;
                    if (c6Var.q != 0.0f && (Math.abs(Math.sin(Math.toRadians(c6Var.S))) >= 0.009999999776482582d || Math.abs(Math.sin(Math.toRadians(c6Var.T))) >= 0.009999999776482582d)) {
                        int a2 = org.telegram.ui.Wallet.v7.a(-16216082, fArr);
                        int a10 = org.telegram.ui.Wallet.v7.a(-15291399, fArr);
                        paint.setShader(null);
                        paint.setAlpha(zs.e4);
                        paint.setColor(org.telegram.ui.Wallet.c6.d(0.82500005f, 0.0f, 0.0f, a2, a10));
                        path.rewind();
                        path.moveTo(fArr3[0], fArr3[1]);
                        for (int i10 = 1; i10 < 76; i10++) {
                            int i11 = i10 * 2;
                            path.lineTo(fArr3[i11], fArr3[i11 + 1]);
                        }
                        path.close();
                        canvas.drawPath(path, paint);
                        paint2.setShader(null);
                        paint2.setAlpha(zs.e4);
                        float f7 = 0.6f;
                        paint2.setStrokeWidth(c6Var.q * 0.6f);
                        int[] iArr = c6Var.o;
                        int length = iArr.length;
                        int i12 = 0;
                        while (i12 < length) {
                            int i13 = iArr[i12];
                            int i14 = (i13 + 1) % 76;
                            int i15 = i13 * 2;
                            int i16 = i14 * 2;
                            float f10 = f7;
                            float[] fArr4 = c6Var.j;
                            float f11 = (fArr4[i15] + fArr4[i16]) * 0.5f;
                            int i17 = i15 + 1;
                            int i18 = i16 + 1;
                            float f12 = (fArr4[i17] + fArr4[i18]) * 0.5f;
                            int[] iArr2 = iArr;
                            int i19 = length;
                            float sqrt = 1.0f / ((float) Math.sqrt(sc.e.d(f12, f12, f11 * f11, 0.0144f)));
                            float f13 = f11 * sqrt;
                            float f14 = f12 * sqrt;
                            float f15 = (c6Var.r ? -0.12f : 0.12f) * sqrt;
                            float c10 = org.telegram.ui.Wallet.c6.c((c6Var.Y * f15) + (c6Var.X * f14) + (c6Var.W * f13));
                            float c11 = org.telegram.ui.Wallet.c6.c((c6Var.b0 * f15) + (f14 * c6Var.a0) + (f13 * c6Var.Z));
                            int i20 = i12;
                            float[] fArr5 = fArr2;
                            float[] fArr6 = fArr3;
                            float pow = (float) Math.pow(c11, 24.0d);
                            float C = c3.i0.C(c10, 0.38f, 0.36f, 1.5f);
                            float f16 = pow * 0.1f * 1.5f;
                            int d = org.telegram.ui.Wallet.c6.d(C, 0.089999996f, f16, a2, a10);
                            paint.setColor(d);
                            paint2.setColor(d);
                            path.rewind();
                            path.moveTo(fArr5[i15], fArr5[i17]);
                            path.lineTo(fArr5[i16], fArr5[i18]);
                            path.lineTo(fArr6[i16], fArr6[i18]);
                            path.lineTo(fArr6[i15], fArr6[i17]);
                            path.close();
                            paint2.setStrokeWidth(c6Var.q * f10);
                            canvas.drawPath(path, paint);
                            canvas.drawPath(path, paint2);
                            paint2.setColor(org.telegram.ui.Wallet.c6.d(C * 0.75f, 0.067499995f, f16 * 0.75f, a2, a10));
                            paint2.setStrokeWidth(c6Var.q * 0.7f);
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
        float f7;
        int i10;
        boolean z10;
        Boolean bool;
        int i11 = 2;
        switch (this.a) {
            case 0:
                TextPaint textPaint = (TextPaint) this.e;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.M6, false);
                int red = Color.red(x02);
                int green = Color.green(x02);
                int blue = Color.blue(x02);
                t0 t0Var = (t0) this.d;
                t0Var.b(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.g7, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h7, false));
                RectF rectF = (RectF) this.b;
                rectF.set(org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(73.0f));
                org.telegram.ui.ActionBar.t6.X1.setColor(Color.argb((int) (t0Var.getProgress() * 43.0f), red, green, blue));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.X1);
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), org.telegram.messenger.i0.L(74.0f));
                org.telegram.ui.ActionBar.t6.t0.setColor(Color.argb((int) ((1.0f - t0Var.getProgress()) * 31.0f), red, green, blue));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), org.telegram.ui.ActionBar.t6.t0);
                boolean z11 = this.c;
                String L0 = cd.L0(z11 ? 2131752223 : 2131752224, null);
                int ceil = (int) Math.ceil(textPaint.measureText(L0));
                textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G6, false));
                canvas.drawText(L0, (getMeasuredWidth() - ceil) / 2, org.telegram.messenger.i0.L(96.0f), textPaint);
                int i12 = 0;
                while (i12 < i11) {
                    int L = org.telegram.messenger.i0.L(i12 == 0 ? 21.0f : 53.0f);
                    org.telegram.ui.ActionBar.t6.t0.setColor(Color.argb(i12 == 0 ? 204 : 90, red, green, blue));
                    canvas.drawCircle(org.telegram.messenger.i0.L(22.0f), L, org.telegram.messenger.i0.L(11.0f), org.telegram.ui.ActionBar.t6.t0);
                    int i13 = 0;
                    while (true) {
                        if (i13 < (z11 ? 3 : i11)) {
                            org.telegram.ui.ActionBar.t6.t0.setColor(Color.argb(i13 == 0 ? 204 : 90, red, green, blue));
                            if (z11) {
                                float f10 = i13 * 7;
                                rectF.set(org.telegram.messenger.i0.L(41.0f), L - org.telegram.messenger.i0.L(8.3f - f10), getMeasuredWidth() - org.telegram.messenger.i0.L(i13 != 0 ? 48.0f : 72.0f), L - org.telegram.messenger.i0.L(5.3f - f10));
                                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.N(1.5f), org.telegram.messenger.i0.N(1.5f), org.telegram.ui.ActionBar.t6.t0);
                            } else {
                                int i14 = i13 * 10;
                                rectF.set(org.telegram.messenger.i0.L(41.0f), L - org.telegram.messenger.i0.L(7 - i14), getMeasuredWidth() - org.telegram.messenger.i0.L(i13 != 0 ? 48.0f : 72.0f), L - org.telegram.messenger.i0.L(3 - i14));
                                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.t0);
                            }
                            i13++;
                            i11 = 2;
                        }
                    }
                    i12++;
                    i11 = 2;
                }
                break;
            case 1:
                RectF rectF2 = (RectF) this.b;
                uz uzVar = (uz) this.e;
                int L2 = (uzVar.o1 - uzVar.s0) - org.telegram.messenger.i0.L(8.0f);
                getMeasuredHeight();
                org.telegram.messenger.i0.L(36.0f);
                int i15 = uzVar.s0;
                int i16 = org.telegram.messenger.i0.m;
                int i17 = L2 + i16;
                if (this.c) {
                    if (i17 + i15 < i16 * 2) {
                        i17 -= Math.min(i16, ((i16 * 2) - i17) - i15);
                        f7 = 1.0f - Math.min(1.0f, (r6 * 2) / org.telegram.messenger.i0.m);
                    } else {
                        f7 = 1.0f;
                    }
                    int i18 = uzVar.s0;
                    int i19 = i17 + i18;
                    int i20 = org.telegram.messenger.i0.m;
                    if (i19 < i20) {
                        i10 = Math.min(i20, (i20 - i17) - i18);
                        uzVar.r0.setBounds(0, i17, getMeasuredWidth(), getMeasuredHeight());
                        uzVar.r0.draw(canvas);
                        if (f7 != 1.0f) {
                            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
                            rectF2.set(uzVar.t0, uzVar.s0 + i17, getMeasuredWidth() - uzVar.t0, org.telegram.messenger.i0.L(24.0f) + uzVar.s0 + i17);
                            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.t0);
                        }
                        if (i10 > 0) {
                            org.telegram.ui.ActionBar.t6.t0.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.h5, false));
                            canvas.drawRect(uzVar.t0, org.telegram.messenger.i0.m - i10, getMeasuredWidth() - uzVar.t0, org.telegram.messenger.i0.m, org.telegram.ui.ActionBar.t6.t0);
                        }
                        z10 = i10 <= org.telegram.messenger.i0.m / 2;
                        bool = (Boolean) this.d;
                        if (bool != null || bool.booleanValue() != z10) {
                            boolean z12 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, uzVar.I0)) <= 0.721f;
                            boolean z13 = org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, uzVar.I0), 855638016)) > 0.721f;
                            this.d = Boolean.valueOf(z10);
                            if (!z10) {
                                z12 = z13;
                            }
                            org.telegram.messenger.i0.r3(uzVar.getWindow(), z12);
                            break;
                        }
                    }
                } else {
                    f7 = 1.0f;
                }
                i10 = 0;
                uzVar.r0.setBounds(0, i17, getMeasuredWidth(), getMeasuredHeight());
                uzVar.r0.draw(canvas);
                if (f7 != 1.0f) {
                }
                if (i10 > 0) {
                }
                if (i10 <= org.telegram.messenger.i0.m / 2) {
                }
                bool = (Boolean) this.d;
                if (bool != null) {
                }
                if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, uzVar.I0)) <= 0.721f) {
                }
                if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.s8, uzVar.I0), 855638016)) > 0.721f) {
                }
                this.d = Boolean.valueOf(z10);
                if (!z10) {
                }
                org.telegram.messenger.i0.r3(uzVar.getWindow(), z12);
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
                accessibilityNodeInfo.setChecked(((t0) this.d).f);
                accessibilityNodeInfo.setCheckable(true);
                accessibilityNodeInfo.setContentDescription(cd.L0(this.c ? 2131752223 : 2131752224, null));
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
                uz uzVar = (uz) this.e;
                if (motionEvent.getAction() != 0 || uzVar.o1 == 0 || motionEvent.getY() >= uzVar.o1) {
                    return super.onInterceptTouchEvent(motionEvent);
                }
                uzVar.dismiss();
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                uz.I0((uz) this.e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                int size = View.MeasureSpec.getSize(i11);
                uz uzVar = (uz) this.e;
                ag.b1 b1Var = uzVar.j1;
                uzVar.p1 = true;
                int i12 = uzVar.t0;
                setPadding(i12, org.telegram.messenger.i0.m, i12, 0);
                uzVar.p1 = false;
                int b10 = (uzVar.k1.b() * org.telegram.messenger.i0.L(48.0f)) + org.telegram.messenger.i0.L(48.0f);
                int i13 = uzVar.s0;
                int i14 = b10 + i13 + org.telegram.messenger.i0.m;
                int i15 = size / 5;
                int i16 = ((double) i14) < ((double) i15) * 3.2d ? 0 : i15 * 2;
                if (i16 != 0 && i14 < size) {
                    i16 -= size - i14;
                }
                if (i16 != 0) {
                    i13 = i16;
                }
                if (b1Var.getPaddingTop() != i13) {
                    uzVar.p1 = true;
                    b1Var.setPadding(org.telegram.messenger.i0.L(10.0f), i13, org.telegram.messenger.i0.L(10.0f), 0);
                    uzVar.p1 = false;
                }
                this.c = i14 >= size;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i14, size), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.c ? 80.0f : 50.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) this.e;
                g6Var.i0 = -1;
                g6Var.b(g6Var.c0, g6Var.f0);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return !((uz) this.e).I && super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.a) {
            case 1:
                if (!((uz) this.e).p1) {
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
    public u0(uz uzVar, Activity activity) {
        super(activity);
        this.a = 1;
        this.e = uzVar;
        this.b = new RectF();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(k70 k70Var, Context context, boolean z10) {
        super(context);
        this.a = 2;
        this.e = k70Var;
        this.b = new TextView[2];
        this.c = !z10;
        setBackground(null);
        View view = new View(context);
        this.d = view;
        if (!z10) {
            view.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
        }
        addView(view, w7.b6.d(-1, -1.0f, 0, 16.0f, z10 ? 0.0f : 16.0f, 16.0f, 16.0f));
        for (int i10 = 0; i10 < 2; i10++) {
            ((TextView[]) this.b)[i10] = new TextView(context);
            ((TextView[]) this.b)[i10].setFocusable(false);
            ((TextView[]) this.b)[i10].setLines(1);
            ((TextView[]) this.b)[i10].setSingleLine(true);
            ((TextView[]) this.b)[i10].setGravity(1);
            ((TextView[]) this.b)[i10].setEllipsize(TextUtils.TruncateAt.END);
            ((TextView[]) this.b)[i10].setGravity(17);
            if (this.c) {
                org.telegram.ui.ActionBar.a7.V(((TextView[]) this.b)[i10], org.telegram.ui.ActionBar.t6.Gi, null);
                ((TextView[]) this.b)[i10].setTypeface(org.telegram.messenger.i0.o());
            } else {
                org.telegram.ui.ActionBar.a7.V(((TextView[]) this.b)[i10], org.telegram.ui.ActionBar.t6.Ci, null);
            }
            ((TextView[]) this.b)[i10].setImportantForAccessibility(2);
            ((TextView[]) this.b)[i10].setTextSize(1, 14.0f);
            ((TextView[]) this.b)[i10].setPadding(0, 0, 0, this.c ? 0 : org.telegram.messenger.i0.L(13.0f));
            addView(((TextView[]) this.b)[i10], w7.b6.d(-2, -2.0f, 17, 24.0f, 0.0f, 24.0f, 0.0f));
            if (i10 == 1) {
                ((TextView[]) this.b)[i10].setAlpha(0.0f);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(org.telegram.ui.Wallet.g6 g6Var, Context context) {
        super(context);
        this.a = 4;
        this.e = g6Var;
        this.d = new Matrix();
        this.b = new float[8];
        setClipChildren(false);
        setClipToPadding(false);
    }
}
