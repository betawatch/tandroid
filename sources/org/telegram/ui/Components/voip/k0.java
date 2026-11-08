package org.telegram.ui.Components.voip;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.de;
import bi.x5;
import c8.ha;
import di.h3;
import fi.p5;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z8;
import org.telegram.ui.c40;
import org.telegram.ui.mk;
import org.telegram.ui.v10;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class k0 extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public y D;
    public boolean D0;
    public y E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final v10 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final x5 I;
    public float I0;
    public final z8 J;
    public ValueAnimator J0;
    public final TextView K;
    public final UndoView[] K0;
    public boolean L;
    public boolean L0;
    public long M;
    public boolean M0;
    public float N;
    public ValueAnimator N0;
    public float O;
    public long O0;
    public float P;
    public m5 P0;
    public float Q;
    public float R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public final int a;
    public final GradientDrawable a0;
    public boolean b;
    public final GradientDrawable b0;
    public float c;
    public final uq c0;
    public long d;
    public final TextView d0;
    public s3 e;
    public final TextView e0;
    public boolean f;
    public final p5 f0;
    public boolean g0;
    public long h;
    public final et h0;
    public r3 i0;
    public final c40 j0;
    public final kg.k k0;
    public final org.telegram.ui.ActionBar.f0 l0;
    public final View m0;
    public float n;
    public final View n0;
    public float o0;
    public float p0;
    public float q0;
    public ValueAnimator r;
    public float r0;
    public boolean s;
    public float s0;
    public boolean t0;
    public float u0;
    public float v0;
    public final ImageView w;
    public int w0;
    public final LongSparseIntArray x;
    public int x0;
    public final h2.f y;
    public float y0;
    public boolean z0;

    public k0(Context context, RecyclerView recyclerView, v10 v10Var, ArrayList arrayList, r3 r3Var, c40 c40Var) {
        super(context);
        this.x = new LongSparseIntArray();
        this.y = new h2.f((int[]) null);
        this.O = 1.0f;
        final int i7 = 1;
        this.V = true;
        final z10 z10Var = (z10) this;
        this.h0 = new et(z10Var, 19);
        this.y0 = 1.0f;
        int i10 = 2;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = v10Var;
        this.H = arrayList;
        this.i0 = r3Var;
        this.j0 = c40Var;
        kg.k kVar = new kg.k(context, 4);
        this.k0 = kVar;
        final int i11 = 0;
        org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
        y1Var.a(-1);
        kVar.setImageDrawable(y1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(k6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, qs.z1)});
        this.a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ha.c(120.0f, -1));
        View view2 = new View(context);
        this.n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, qs.z1)});
        this.b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((r3Var == null || !h()) ? 8 : 0);
        addView(view2, ha.e(qs.q2, -1, 5));
        addView(kVar, ha.e(56, -1, 51));
        kVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        z10Var.Q0.onBackPressed();
                        break;
                    default:
                        z10 z10Var2 = z10Var;
                        if (z10Var2.b) {
                            boolean z9 = !z10Var2.f;
                            z10Var2.f = z9;
                            z10Var2.c0.a(z9, true);
                            z10Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(i10, context, z10Var);
        this.l0 = f0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, 0, o4, o4);
        p5 p5Var = new p5(z10Var, context, k02, 9);
        this.f0 = p5Var;
        p5Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        z10Var.Q0.onBackPressed();
                        break;
                    default:
                        z10 z10Var2 = z10Var;
                        if (z10Var2.b) {
                            boolean z9 = !z10Var2.f;
                            z10Var2.f = z9;
                            z10Var2.c0.a(z9, true);
                            z10Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        k02.setCallback(p5Var);
        addView(p5Var);
        uq uqVar = new uq(context, R.drawable.msg_pin_filled, -1);
        this.c0 = uqVar;
        float f10 = -org.telegram.messenger.g0.L(1.0f);
        float L2 = org.telegram.messenger.g0.L(2.0f);
        float L3 = org.telegram.messenger.g0.L(1.0f);
        uqVar.i = f10;
        uqVar.j = L2;
        uqVar.k = L3;
        uqVar.invalidateSelf();
        f0Var.setImageDrawable(uqVar);
        f0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(f0Var, ha.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.d0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(id.M0(2131752599, null));
        TextView textView2 = new TextView(context);
        this.e0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(id.M0(2131752598, null));
        addView(textView, ha.e(-2, -2, 51));
        addView(textView2, ha.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(id.M0(2131754808, null));
        int L4 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L4, L4, L4, L4);
        imageView.setBackground(k6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new t41(i7, z10Var, c40Var));
        addView(imageView, ha.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        x5 x5Var = new x5(z10Var, context, k6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(k6.x0(null, k6.hh, false), qs.i3)), 17);
        this.I = x5Var;
        z8 z8Var = new z8(context, true);
        this.J = z8Var;
        z8Var.setStyle(10);
        x5Var.setClipChildren(false);
        x5Var.setClipToPadding(false);
        x5Var.addView(z8Var, ha.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        x5Var.addView(textView3, ha.e(-2, -2, 16));
        addView(x5Var, ha.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        while (i11 < 2) {
            this.K0[i11] = new mk(z10Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.K0[i11], ha.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
            i11++;
        }
        this.f0.setVisibility(8);
        setIsTablet(c40.x5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z9) {
        if (this.V != z9) {
            this.V = z9;
            c40 c40Var = ((z10) this).Q0;
            if (c40Var.R3 != null) {
                c40Var.q5.a(!r1.V, true);
            }
            et etVar = this.h0;
            if (!z9 || !this.b) {
                this.g0 = false;
                org.telegram.messenger.g0.r(etVar);
            } else if (!this.g0) {
                this.g0 = true;
                org.telegram.messenger.g0.i3(etVar, 3000L);
            }
            y yVar = this.D;
            if (yVar != null) {
                yVar.requestLayout();
            }
        }
    }

    public final void b(boolean z9) {
        ValueAnimator ofFloat;
        int i7 = 0;
        if (this.G0) {
            this.G0 = false;
            int i10 = 1;
            float f10 = this.I0;
            float[] fArr = new float[2];
            if (z9) {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.J0 = ofFloat;
            ofFloat.addUpdateListener(new g0(this, i7));
            this.J0.addListener(new j0(this, i10));
            ValueAnimator valueAnimator = this.J0;
            xq xqVar = xq.f;
            valueAnimator.setInterpolator(xqVar);
            this.J0.setDuration(z9 ? 350L : 200L);
            this.J0.setInterpolator(xqVar);
            y yVar = this.D;
            if (yVar != null) {
                u uVar = yVar.a;
                ValueAnimator valueAnimator2 = this.J0;
                if (uVar.E) {
                    uVar.G.add(valueAnimator2);
                } else {
                    valueAnimator2.start();
                }
            } else {
                this.J0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.H0 = false;
    }

    public final boolean c() {
        return (this.f || System.currentTimeMillis() - this.h <= 2000 || this.G0 || this.t0) ? false : true;
    }

    public final void d() {
        y yVar = this.D;
        if (yVar != null) {
            if (yVar.o0 || yVar.p0 != 0.0f) {
                yVar.o0 = false;
                yVar.p0 = 0.0f;
                yVar.a.invalidate();
                yVar.invalidate();
            }
            this.D.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x044c A[LOOP:1: B:84:0x044c->B:92:0x049b, LOOP_START, PHI: r9
      0x044c: PHI (r9v1 int) = (r9v0 int), (r9v2 int) binds: [B:83:0x044a, B:92:0x049b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x049e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0441  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        y yVar;
        v10 v10Var;
        y yVar2;
        y yVar3;
        UndoView[] undoViewArr;
        if (c40.x5) {
            this.S = true;
            super.dispatchDraw(canvas);
            this.S = false;
        }
        this.T = true;
        super.dispatchDraw(canvas);
        this.T = false;
        if (this.E != null || this.D != null) {
            RecyclerView recyclerView = this.F;
            float y10 = recyclerView.getY() - getTop();
            float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
            float f10 = this.c;
            canvas.save();
            boolean z9 = c40.x5;
            if (!z9 && (yVar = this.D) != null && !yVar.P && yVar.c != null) {
                float f11 = 1.0f - f10;
                canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            } else if (z9) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            y yVar4 = this.E;
            if (yVar4 != null && yVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.E.getX(), this.E.getY());
                this.E.draw(canvas);
                canvas.restore();
            }
            y yVar5 = this.D;
            if (yVar5 != null && yVar5.getParent() != null) {
                if (this.D.getAlpha() != 1.0f) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(this.D.getX(), this.D.getY(), this.D.getX() + this.D.getMeasuredWidth(), this.D.getY() + this.D.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.D.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z10 = this.G0 || this.J0 != null;
                if (z10 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((c40.w5 || c40.x5) ? 0 : org.telegram.messenger.g0.L(90.0f)));
                }
                canvas.translate(this.D.getX(), this.D.getY());
                y yVar6 = this.D;
                float f12 = this.I0;
                if (yVar6.o0 != z10 || yVar6.p0 != f12) {
                    yVar6.o0 = z10;
                    yVar6.p0 = f12;
                    yVar6.a.invalidate();
                    yVar6.invalidate();
                }
                this.D.i(this.y0, this.u0, this.v0, this.r0, this.s0, this.z0 || this.B0 != null);
                this.D.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i7 = 0; i7 < 2; i7++) {
            UndoView[] undoViewArr2 = this.K0;
            if (undoViewArr2[i7].getVisibility() == 0) {
                canvas.save();
                float f13 = c40.w5 ? 0.0f : (1.0f - this.W) * (-org.telegram.messenger.g0.L(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (c40.w5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(18.0f));
                if (this.M0) {
                    canvas.translate(undoViewArr2[i7].getX() - org.telegram.messenger.g0.L(8.0f), undoViewArr2[i7].getY() - org.telegram.messenger.g0.L(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i7].getX() - org.telegram.messenger.g0.L(8.0f), ((undoViewArr2[i7].getY() - (c40.w5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(26.0f));
                }
                if (undoViewArr2[i7].getAlpha() != 1.0f) {
                    undoViewArr = undoViewArr2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, undoViewArr2[i7].getMeasuredWidth(), undoViewArr2[i7].getMeasuredHeight(), (int) (undoViewArr2[i7].getAlpha() * 255.0f), 31);
                } else {
                    undoViewArr = undoViewArr2;
                    canvas.save();
                }
                canvas.scale(undoViewArr[i7].getScaleX(), undoViewArr[i7].getScaleY(), undoViewArr[i7].getMeasuredWidth() / 2.0f, undoViewArr[i7].getMeasuredHeight() / 2.0f);
                undoViewArr[i7].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f14 = (1.0f - this.W) * this.c;
        ValueAnimator valueAnimator = this.N0;
        GradientDrawable gradientDrawable = this.b0;
        GradientDrawable gradientDrawable2 = this.a0;
        if (valueAnimator == null || (yVar2 = this.E) == null || (yVar3 = this.D) == null) {
            y yVar7 = this.D;
            if (yVar7 != null) {
                float f15 = 255.0f * f14;
                gradientDrawable2.setAlpha((int) ((1.0f - yVar7.a0) * f15));
                gradientDrawable.setAlpha((int) ((1.0f - this.D.a0) * f15));
            } else {
                int i10 = (int) (255.0f * f14);
                gradientDrawable2.setAlpha(i10);
                gradientDrawable.setAlpha(i10);
            }
        } else {
            boolean z11 = yVar2.W;
            boolean z12 = yVar3.W;
            int alpha = (int) ((z11 != z12 ? (!z12 ? 1.0f - yVar3.getAlpha() : yVar3.getAlpha()) * f14 : !z12 ? 0.0f : f14) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.k0.setAlpha(f14);
        boolean h = h();
        org.telegram.ui.ActionBar.f0 f0Var = this.l0;
        ImageView imageView = this.w;
        if (h) {
            f0Var.setAlpha(0.0f);
            f0Var.setVisibility(4);
            imageView.setAlpha(f14);
            imageView.setVisibility(0);
            if (c40.w5) {
                imageView.setTranslationX((1.0f - this.W) * (-org.telegram.messenger.g0.L(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        } else {
            f0Var.setAlpha(f14);
            f0Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        }
        int measuredWidth = getMeasuredWidth();
        TextView textView = this.d0;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.e0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        uq uqVar = this.c0;
        float f16 = uqVar.g;
        float z13 = (com.google.android.recaptcha.internal.a.z(1.0f, f16, measuredWidth2, measuredWidth4 * f16) - org.telegram.messenger.g0.L(21.0f)) - (c40.x5 ? org.telegram.messenger.g0.L(328.0f) : c40.w5 ? org.telegram.messenger.g0.L(180.0f) : 0);
        textView.setTranslationX(z13);
        textView2.setTranslationX(z13);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        p5 p5Var = this.f0;
        p5Var.setTranslationX(z13 - org.telegram.messenger.g0.L(36.0f));
        p5Var.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - p5Var.getMeasuredHeight()) / 2.0f);
        f0Var.setTranslationX(z13 - org.telegram.messenger.g0.L(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            p5Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - uqVar.g) * f14);
            textView2.setAlpha(uqVar.g * f14);
            p5Var.setAlpha(f14);
        }
        float f17 = this.O;
        x5 x5Var = this.I;
        if (f17 != 1.0f) {
            float f18 = f17 + 0.07272727f;
            this.O = f18;
            if (f18 > 1.0f) {
                this.O = 1.0f;
            } else {
                invalidate();
            }
            x5Var.invalidate();
        }
        boolean z14 = this.L;
        if (z14) {
            float f19 = this.N;
            if (f19 != 1.0f) {
                float f20 = f19 + 0.10666667f;
                this.N = f20;
                if (f20 > 1.0f) {
                    this.N = 1.0f;
                } else {
                    invalidate();
                }
                if (c40.w5) {
                    x5Var.setTranslationY((org.telegram.messenger.g0.L(8.0f) * this.W) + ((1.0f - this.W) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(8.0f));
                } else {
                    x5Var.setTranslationY(org.telegram.messenger.g0.L(16.0f));
                }
                x5Var.setAlpha(this.N * this.c);
                x5Var.setScaleX((this.N * 0.5f) + 0.5f);
                x5Var.setScaleY((this.N * 0.5f) + 0.5f);
                if (c40.x5) {
                    super.dispatchDraw(canvas);
                } else {
                    this.U = true;
                    super.dispatchDraw(canvas);
                    this.U = false;
                }
                v10Var = this.G;
                if (v10Var.getVisibility() != 0) {
                    for (int i11 = 0; i11 < v10Var.getChildCount(); i11++) {
                        h10 h10Var = (h10) v10Var.getChildAt(i11);
                        if (h10Var.getVisibility() == 0 && h10Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(v10Var.getX() + h10Var.getX(), v10Var.getY() + h10Var.getY());
                            canvas.scale(h10Var.getScaleX(), h10Var.getScaleY(), h10Var.getMeasuredWidth() / 2.0f, h10Var.getMeasuredHeight() / 2.0f);
                            h10Var.c(canvas);
                            canvas.restore();
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (!z14) {
            float f21 = this.N;
            if (f21 != 0.0f) {
                float f22 = f21 - 0.10666667f;
                this.N = f22;
                if (f22 < 0.0f) {
                    this.N = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        if (c40.w5) {
        }
        x5Var.setAlpha(this.N * this.c);
        x5Var.setScaleX((this.N * 0.5f) + 0.5f);
        x5Var.setScaleY((this.N * 0.5f) + 0.5f);
        if (c40.x5) {
        }
        v10Var = this.G;
        if (v10Var.getVisibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9 = this.T;
        RecyclerView recyclerView = this.F;
        if (!z9) {
            UndoView[] undoViewArr = this.K0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof y) {
                    y yVar = (y) view;
                    if (yVar != this.D && yVar != this.E && !this.U && !yVar.y0) {
                        if (yVar.c == null) {
                            if (!c40.x5) {
                                return super.drawChild(canvas, view, j3);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild = super.drawChild(canvas, view, j3);
                            canvas.restore();
                            return drawChild;
                        }
                        float y10 = recyclerView.getY() - getTop();
                        float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
                        float f10 = this.c;
                        if (yVar.d == null) {
                            f10 = 0.0f;
                        }
                        canvas.save();
                        float f11 = 1.0f - f10;
                        canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                } else if (!this.S) {
                    return super.drawChild(canvas, view, j3);
                }
            }
        } else if ((view instanceof y) && ((y) view).y0) {
            float y11 = recyclerView.getY() - getTop();
            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y11) - recyclerView.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y11, getMeasuredWidth(), measuredHeight2);
            boolean drawChild3 = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild3;
        }
        return true;
    }

    public final void e() {
        boolean z9 = this.g0;
        et etVar = this.h0;
        if (z9) {
            org.telegram.messenger.g0.r(etVar);
        }
        org.telegram.messenger.g0.i3(etVar, 3000L);
        this.g0 = true;
    }

    public final void f(y yVar) {
        this.H.remove(yVar);
        long C1 = ij.C1(yVar.x.a.peer);
        this.x.put(C1, r2.get(C1, 0) - 1);
    }

    public final void g() {
        k0 k0Var;
        if (this.z0) {
            this.z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            k0Var = this;
            ofFloat.addUpdateListener(new h0(k0Var, this.y0, this.r0, this.s0, 0));
            k0Var.B0.addListener(new j0(this, 2));
            k0Var.B0.setDuration(350L);
            k0Var.B0.setInterpolator(xq.f);
            k0Var.B0.start();
            k0Var.h = System.currentTimeMillis();
        } else {
            k0Var = this;
        }
        k0Var.A0 = false;
        k0Var.t0 = false;
    }

    public UndoView getUndoView() {
        UndoView[] undoViewArr = this.K0;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.d(2, true);
            removeView(undoViewArr[0]);
            addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    public final boolean h() {
        r3 r3Var = this.i0;
        return r3Var != null && r3Var.b.rtmp_stream;
    }

    public abstract void i(boolean z9);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(s3 s3Var) {
        y yVar;
        y yVar2;
        u uVar;
        r rVar;
        h10 h10Var;
        r rVar2;
        s3 s3Var2;
        if (s3Var == null && this.e == null) {
            return;
        }
        if (s3Var == null || !s3Var.equals(this.e)) {
            long C1 = s3Var == null ? 0L : ij.C1(s3Var.a.peer);
            y yVar3 = this.D;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (yVar3 != null) {
                ArrayList arrayList = yVar3.m0;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((Runnable) arrayList.get(i7)).run();
                }
                arrayList.clear();
            }
            ValueAnimator valueAnimator = this.N0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (s3Var2 = this.e) != null) {
                sharedInstance.requestFullScreen(s3Var2.a, false, s3Var2.b);
            }
            this.e = s3Var;
            int i10 = 1;
            if (sharedInstance != null && s3Var != null) {
                sharedInstance.requestFullScreen(s3Var.a, true, s3Var.b);
            }
            this.d = C1;
            boolean z9 = this.b;
            this.h = System.currentTimeMillis();
            int i11 = 2;
            kg.k kVar = this.k0;
            c40 c40Var = this.j0;
            if (s3Var == null) {
                if (this.b) {
                    ValueAnimator valueAnimator2 = this.r;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.b = false;
                    y yVar4 = this.D;
                    if (yVar4.c != null || yVar4.d != null || yVar4.e != null) {
                        s3 s3Var3 = yVar4.x;
                        if (r3.C(s3Var3.a, s3Var3.b, this.i0)) {
                            this.D.h(false, true);
                        }
                    }
                    this.D.b(true);
                    r rVar3 = this.D.c;
                    if (rVar3 != null) {
                        rVar3.setRenderer(null);
                    }
                    h10 h10Var2 = this.D.d;
                    if (h10Var2 != null) {
                        h10Var2.setRenderer(null);
                    }
                    r rVar4 = this.D.e;
                    if (rVar4 != null) {
                        rVar4.setRenderer(null);
                    }
                    y yVar5 = this.D;
                    yVar5.animate().alpha(0.0f).setListener(new i0(this, yVar5, i11)).setDuration(350L).start();
                }
                kVar.setEnabled(false);
                this.f = false;
            } else {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.H;
                    if (i12 >= arrayList2.size()) {
                        yVar = null;
                        break;
                    } else {
                        if (((y) arrayList2.get(i12)).x.equals(s3Var)) {
                            yVar = (y) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                Property property = View.ALPHA;
                uq uqVar = this.c0;
                if (yVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        uqVar.a(false, false);
                        this.D.b(false);
                        yVar.b(false);
                        if (!this.M0) {
                            y yVar6 = this.D;
                            if (yVar6.c != null || yVar6.d != null || yVar6.e != null) {
                                yVar2 = new y(this, this.i0, c40Var);
                                y yVar7 = this.D;
                                r rVar5 = yVar7.c;
                                h10 h10Var3 = yVar7.d;
                                r rVar6 = yVar7.e;
                                yVar2.c = rVar5;
                                yVar2.d = h10Var3;
                                yVar2.e = rVar6;
                                yVar2.g(this.b, false);
                                yVar2.j(false);
                                r rVar7 = this.D.c;
                                if (rVar7 != null) {
                                    rVar7.setRenderer(yVar2);
                                }
                                h10 h10Var4 = this.D.d;
                                if (h10Var4 != null) {
                                    h10Var4.setRenderer(yVar2);
                                }
                                r rVar8 = this.D.e;
                                if (rVar8 != null) {
                                    rVar8.setRenderer(yVar2);
                                }
                                y yVar8 = new y(this, this.i0, c40Var);
                                yVar8.x = yVar.x;
                                r rVar9 = yVar.c;
                                h10 h10Var5 = yVar.d;
                                r rVar10 = yVar.e;
                                yVar8.c = rVar9;
                                yVar8.d = h10Var5;
                                yVar8.e = rVar10;
                                yVar8.g(this.b, false);
                                yVar8.j(false);
                                uVar = yVar8.a;
                                uVar.d.setAlpha(1.0f);
                                uVar.e.setAlpha(1.0f);
                                rVar = yVar.c;
                                if (rVar != null) {
                                    rVar.setRenderer(yVar8);
                                }
                                h10Var = yVar.d;
                                if (h10Var != null) {
                                    h10Var.setRenderer(yVar8);
                                }
                                rVar2 = yVar.e;
                                if (rVar2 != null) {
                                    rVar2.setRenderer(yVar8);
                                }
                                yVar8.E = true;
                                yVar8.setAlpha(0.0f);
                                this.E = this.D;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yVar8, (Property<y, Float>) property, 0.0f, 1.0f);
                                this.N0 = ofFloat;
                                ofFloat.addListener(new h3(this, yVar8, yVar, 9));
                                if (yVar2 != null) {
                                    yVar2.setAlpha(0.0f);
                                    yVar2.setScaleX(0.5f);
                                    yVar2.setScaleY(0.5f);
                                    yVar2.E = true;
                                }
                                r31 r31Var = new r31(this, yVar, yVar2, 3);
                                if (uVar.d.isFirstFrameRendered()) {
                                    org.telegram.messenger.g0.i3(r31Var, 250L);
                                    yVar8.m0.add(r31Var);
                                } else {
                                    r31Var.run();
                                }
                                d();
                                this.D = yVar8;
                                yVar8.h(true, false);
                                l();
                            }
                        }
                        yVar2 = null;
                        y yVar82 = new y(this, this.i0, c40Var);
                        yVar82.x = yVar.x;
                        r rVar92 = yVar.c;
                        h10 h10Var52 = yVar.d;
                        r rVar102 = yVar.e;
                        yVar82.c = rVar92;
                        yVar82.d = h10Var52;
                        yVar82.e = rVar102;
                        yVar82.g(this.b, false);
                        yVar82.j(false);
                        uVar = yVar82.a;
                        uVar.d.setAlpha(1.0f);
                        uVar.e.setAlpha(1.0f);
                        rVar = yVar.c;
                        if (rVar != null) {
                        }
                        h10Var = yVar.d;
                        if (h10Var != null) {
                        }
                        rVar2 = yVar.e;
                        if (rVar2 != null) {
                        }
                        yVar82.E = true;
                        yVar82.setAlpha(0.0f);
                        this.E = this.D;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yVar82, (Property<y, Float>) property, 0.0f, 1.0f);
                        this.N0 = ofFloat2;
                        ofFloat2.addListener(new h3(this, yVar82, yVar, 9));
                        if (yVar2 != null) {
                        }
                        r31 r31Var2 = new r31(this, yVar, yVar2, 3);
                        if (uVar.d.isFirstFrameRendered()) {
                        }
                        d();
                        this.D = yVar82;
                        yVar82.h(true, false);
                        l();
                    } else {
                        this.b = true;
                        d();
                        this.D = yVar;
                        yVar.h(true, true);
                        invalidate();
                        uqVar.a(this.f, false);
                    }
                } else if (this.b) {
                    y yVar9 = this.D;
                    if (yVar9.c == null) {
                        if (!((yVar9.d != null) | (yVar9.e != null))) {
                            yVar9.b(true);
                            y yVar10 = new y(this, this.i0, c40Var);
                            yVar10.x = s3Var;
                            yVar10.g(this.b, false);
                            yVar10.h(true, false);
                            yVar10.E = true;
                            yVar10.setAlpha(0.0f);
                            this.E = this.D;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.N0 = ofFloat3;
                            ofFloat3.addUpdateListener(new de(18, this, yVar10));
                            this.N0.addListener(new i0(this, yVar10, objArr2 == true ? 1 : 0));
                            this.N0.start();
                            d();
                            this.D = yVar10;
                            yVar10.h(true, false);
                            this.D.j(false);
                            l();
                        }
                    }
                    yVar9.b(false);
                    y yVar11 = new y(this, this.i0, c40Var);
                    y yVar12 = this.D;
                    r rVar11 = yVar12.c;
                    h10 h10Var6 = yVar12.d;
                    r rVar12 = yVar12.e;
                    yVar11.c = rVar11;
                    yVar11.d = h10Var6;
                    yVar11.e = rVar12;
                    yVar11.g(this.b, false);
                    yVar11.j(false);
                    r rVar13 = this.D.c;
                    if (rVar13 != null) {
                        rVar13.setRenderer(yVar11);
                    }
                    h10 h10Var7 = this.D.d;
                    if (h10Var7 != null) {
                        h10Var7.setRenderer(yVar11);
                    }
                    r rVar14 = this.D.e;
                    if (rVar14 != null) {
                        rVar14.setRenderer(yVar11);
                    }
                    yVar11.setAlpha(0.0f);
                    yVar11.setScaleX(0.5f);
                    yVar11.setScaleY(0.5f);
                    yVar11.E = true;
                    l51 l51Var = new l51(6, this, yVar11);
                    if (yVar11.a.d.isFirstFrameRendered()) {
                        l51Var.run();
                    } else {
                        org.telegram.messenger.g0.i3(l51Var, 250L);
                        yVar11.m0.add(l51Var);
                    }
                    y yVar102 = new y(this, this.i0, c40Var);
                    yVar102.x = s3Var;
                    yVar102.g(this.b, false);
                    yVar102.h(true, false);
                    yVar102.E = true;
                    yVar102.setAlpha(0.0f);
                    this.E = this.D;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.N0 = ofFloat32;
                    ofFloat32.addUpdateListener(new de(18, this, yVar102));
                    this.N0.addListener(new i0(this, yVar102, objArr2 == true ? 1 : 0));
                    this.N0.start();
                    d();
                    this.D = yVar102;
                    yVar102.h(true, false);
                    this.D.j(false);
                    l();
                } else {
                    this.b = true;
                    d();
                    y yVar13 = new y(this, this.i0, c40Var);
                    this.D = yVar13;
                    yVar13.x = s3Var;
                    yVar13.g(this.b, false);
                    this.D.h(true, false);
                    this.D.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.D, (Property<y, Float>) property, 0.0f, 1.0f);
                    this.N0 = ofFloat4;
                    ofFloat4.addListener(new j0(this, objArr == true ? 1 : 0));
                    this.N0.start();
                    invalidate();
                    uqVar.a(this.f, false);
                }
                kVar.setEnabled(true);
            }
            boolean z10 = this.b;
            if (z9 != z10) {
                if (z10) {
                    kVar.setVisibility(0);
                    this.l0.setVisibility(0);
                    this.e0.setVisibility(0);
                    this.f0.setVisibility(0);
                } else {
                    setUiVisible(true);
                    if (this.g0) {
                        this.g0 = false;
                        org.telegram.messenger.g0.r(this.h0);
                    }
                }
                i(true);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.c, this.b ? 1.0f : 0.0f);
                this.r = ofFloat5;
                ofFloat5.addUpdateListener(new g0(this, i10));
                y yVar14 = this.D;
                yVar14.r = true;
                c40Var.getClass();
                this.L0 = this.G0;
                this.y.d();
                this.r.addListener(new i0(this, yVar14, i10));
                this.r.setInterpolator(xq.f);
                this.r.setDuration(350L);
                u uVar2 = this.D.a;
                ValueAnimator valueAnimator4 = this.r;
                if (uVar2.E) {
                    uVar2.G.add(valueAnimator4);
                } else {
                    valueAnimator4.start();
                }
            }
            b(this.e == null);
        }
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (ij.C1(((y) arrayList.get(i7)).x.a.peer) == ij.C1(groupCallParticipant.peer)) {
                ((y) arrayList.get(i7)).setAmplitude(f10);
            }
            i7++;
        }
    }

    public abstract void l();

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        boolean z9 = c40.x5;
        View view = this.m0;
        if (z9) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (c40.w5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : org.telegram.messenger.g0.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.n0.setVisibility((!c40.w5 || c40.x5) ? 8 : 0);
        p5 p5Var = this.f0;
        p5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView = this.d0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView2 = this.e0;
        textView2.measure(makeMeasureSpec2, i10);
        p5Var.getLayoutParams().width = org.telegram.messenger.g0.L(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).rightMargin = c40.w5 ? org.telegram.messenger.g0.L(45.0f) : 0;
        for (int i11 = 0; i11 < 2; i11++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.K0[i11].getLayoutParams();
            if (this.M0) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(344.0f);
            } else {
                marginLayoutParams.rightMargin = c40.w5 ? org.telegram.messenger.g0.L(180.0f) : 0;
            }
        }
        super.onMeasure(i7, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x038a, code lost:
    
        if ((r15.getPointerCount() >= 2 && ((r14.w0 == r15.getPointerId(0) && r14.x0 == r15.getPointerId(1)) || (r14.w0 == r15.getPointerId(1) && r14.x0 == r15.getPointerId(0)))) == false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0390, code lost:
    
        if (r15.getActionMasked() == 3) goto L180;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x04c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0252  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10 = this.H0;
        c40 c40Var = this.j0;
        if ((z10 || this.G0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.H0 = false;
            if (this.G0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.I0) <= org.telegram.messenger.g0.L(120.0f)) {
                    b(false);
                } else {
                    c40Var.h1(null);
                }
            }
            invalidate();
        }
        if (!this.b || (!(this.H0 || this.G0 || this.D0 || this.A0 || this.t0 || this.z0 || motionEvent.getActionMasked() == 0) || this.D == null)) {
            g();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.H0 = false;
            this.G0 = false;
            this.A0 = false;
            this.t0 = false;
            this.z0 = false;
        }
        if (motionEvent.getActionMasked() == 0 && this.J0 != null) {
            this.H0 = false;
            this.G0 = true;
            this.F0 = motionEvent.getY() - this.I0;
            this.J0.removeAllListeners();
            this.J0.cancel();
            this.J0 = null;
        } else if (this.J0 != null) {
            g();
            return false;
        }
        y yVar = this.D;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.ActionBar.m2 m2Var = yVar.N;
        Rect rect = yVar.B0;
        m2Var.getHitRect(rect);
        if (!rect.contains((int) x10, (int) y10)) {
            if (motionEvent.getActionMasked() == 0 && !this.G0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.D.getMeasuredWidth() + ((c40.w5 && this.V) ? -org.telegram.messenger.g0.L(90.0f) : 0), this.D.getMeasuredHeight() + ((c40.w5 || !this.V) ? 0 : -org.telegram.messenger.g0.L(90.0f)));
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C0 = System.currentTimeMillis();
                    this.D0 = true;
                    this.H0 = true;
                    this.E0 = motionEvent.getX();
                    this.F0 = motionEvent.getY();
                }
            } else if ((this.H0 || this.G0 || this.D0) && motionEvent.getActionMasked() == 2) {
                float abs = Math.abs(this.E0 - motionEvent.getX());
                float f10 = this.a;
                if (abs > f10 || Math.abs(this.F0 - motionEvent.getY()) > f10) {
                    this.D0 = false;
                }
                if (this.H0 && !this.z0 && Math.abs(this.F0 - motionEvent.getY()) > r8 * 2) {
                    this.F0 = motionEvent.getY();
                    this.H0 = false;
                    this.G0 = true;
                } else if (this.G0) {
                    this.I0 = motionEvent.getY() - this.F0;
                    invalidate();
                }
                if (this.H0 && Math.abs(this.E0 - motionEvent.getX()) > r8 * 4) {
                    this.H0 = false;
                }
            }
            if (this.D0 && motionEvent.getActionMasked() == 1 && System.currentTimeMillis() - this.C0 < 200) {
                this.D0 = false;
                if (this.L) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    x5 x5Var = this.I;
                    rectF2.set(x5Var.getX(), x5Var.getY(), x5Var.getX() + x5Var.getWidth(), x5Var.getY() + x5Var.getHeight());
                    if (this.i0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z11 = false;
                        z9 = false;
                        for (int i7 = 0; i7 < this.i0.f.size(); i7++) {
                            if (this.M == ij.C1(((s3) this.i0.f.get(i7)).a.peer)) {
                                c40Var.h1((s3) this.i0.f.get(i7));
                                z11 = true;
                                z9 = true;
                            }
                        }
                        if (!z11) {
                            c40Var.h1(new s3((TLRPC.GroupCallParticipant) this.i0.d.f(this.M), false));
                            z9 = true;
                        }
                        if (!z9) {
                            setUiVisible(!this.V);
                        }
                        this.I0 = 0.0f;
                        invalidate();
                    }
                }
                z9 = false;
                if (!z9) {
                }
                this.I0 = 0.0f;
                invalidate();
            }
            if (!this.D.W || this.G0) {
                g();
                if (this.D0 || this.G0 || this.H0) {
                    return true;
                }
            } else {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        j2 j2Var = this.D.a.d;
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        rectF3.set(j2Var.getX(), j2Var.getY(), j2Var.getX() + j2Var.getMeasuredWidth(), j2Var.getY() + j2Var.getMeasuredHeight());
                        rectF3.inset(((j2Var.getMeasuredHeight() * this.D.a.T) - j2Var.getMeasuredHeight()) / 2.0f, ((j2Var.getMeasuredWidth() * this.D.a.T) - j2Var.getMeasuredWidth()) / 2.0f);
                        if (c40.w5) {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.D.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                        } else {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.D.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                        }
                        boolean contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                        this.A0 = contains;
                        if (!contains) {
                            g();
                            return this.H0;
                        }
                    }
                    if (!this.t0 && motionEvent.getPointerCount() == 2) {
                        this.q0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        float x11 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.u0 = x11;
                        this.o0 = x11;
                        float y11 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.v0 = y11;
                        this.p0 = y11;
                        this.y0 = 1.0f;
                        this.w0 = motionEvent.getPointerId(0);
                        this.x0 = motionEvent.getPointerId(1);
                        this.t0 = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.t0) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                        if (this.w0 == motionEvent.getPointerId(i12)) {
                            i10 = i12;
                        }
                        if (this.x0 == motionEvent.getPointerId(i12)) {
                            i11 = i12;
                        }
                    }
                    if (i10 == -1 || i11 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                        return this.H0;
                    }
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.q0;
                    this.y0 = hypot;
                    if (hypot > 1.005f && !this.z0) {
                        this.q0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        this.u0 = x12;
                        this.o0 = x12;
                        float y12 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        this.v0 = y12;
                        this.p0 = y12;
                        this.y0 = 1.0f;
                        this.r0 = 0.0f;
                        this.s0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.z0 = true;
                        this.t0 = true;
                    }
                    float x13 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    float y13 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    float f11 = this.o0 - x13;
                    float f12 = this.p0 - y13;
                    float f13 = -f11;
                    float f14 = this.y0;
                    this.r0 = f13 / f14;
                    this.s0 = (-f12) / f14;
                    invalidate();
                } else {
                    if (motionEvent.getActionMasked() != 1) {
                        if (motionEvent.getActionMasked() == 6) {
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                    g();
                }
                if (this.A0 || this.D0 || this.H0) {
                }
            }
        }
        return false;
    }

    public void setGroupCall(r3 r3Var) {
        this.i0 = r3Var;
    }

    public void setIsTablet(boolean z9) {
        if (this.M0 != z9) {
            this.M0 = z9;
            kg.k kVar = this.k0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.getLayoutParams();
            layoutParams.gravity = z9 ? 85 : 51;
            layoutParams.rightMargin = z9 ? org.telegram.messenger.g0.L(328.0f) : 0;
            layoutParams.bottomMargin = z9 ? -org.telegram.messenger.g0.L(8.0f) : 0;
            if (this.M0) {
                kVar.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.y1 y1Var = new org.telegram.ui.ActionBar.y1(false);
            y1Var.a(-1);
            kVar.setImageDrawable(y1Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.W != f10) {
            this.W = f10;
            invalidate();
            y yVar = this.D;
            if (yVar != null) {
                yVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z9) {
        z8 z8Var;
        boolean z10;
        int i7;
        long j3;
        if (!this.b || this.M0 || this.e == null || this.r != null || this.i0 == null) {
            if (this.L) {
                this.L = false;
                this.N = 0.0f;
                return;
            }
            return;
        }
        int i10 = this.j0.a;
        long j10 = 500;
        if (System.currentTimeMillis() - this.O0 < 500) {
            if (this.P0 == null) {
                m5 m5Var = new m5(this, 4);
                this.P0 = m5Var;
                org.telegram.messenger.g0.i3(m5Var, (System.currentTimeMillis() - this.O0) + 50);
                return;
            }
            return;
        }
        this.O0 = System.currentTimeMillis();
        int i11 = 0;
        int i12 = 0;
        SpannableStringBuilder spannableStringBuilder = null;
        while (true) {
            int m10 = this.i0.P.m();
            z8Var = this.J;
            if (i11 >= m10) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.i0.P.f(this.i0.P.j(i11));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you) {
                i7 = i11;
                j3 = j10;
            } else {
                j3 = j10;
                if (ij.C1(this.e.a.peer) == ij.C1(groupCallParticipant.peer)) {
                    i7 = i11;
                } else {
                    long C1 = ij.C1(groupCallParticipant.peer);
                    i7 = i11;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j3) {
                        continue;
                    } else {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i12 == 0) {
                            this.M = ij.C1(groupCallParticipant.peer);
                        }
                        if (i12 < 3) {
                            TLRPC.User a22 = C1 > 0 ? qp.s1(i10).a2(Long.valueOf(C1)) : null;
                            TLRPC.Chat M0 = C1 <= 0 ? qp.s1(i10).M0(Long.valueOf(C1)) : null;
                            if (a22 != null || M0 != null) {
                                z8Var.b(i12, i10, groupCallParticipant);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (a22 != null) {
                                    spannableStringBuilder.append(t10.j(a22, true), new u31(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(M0.title, new u31(org.telegram.messenger.g0.o()), 0);
                                }
                            }
                        }
                        i12++;
                        if (i12 == 3) {
                            break;
                        }
                    }
                }
            }
            i11 = i7 + 1;
            j10 = j3;
        }
        boolean z11 = i12 != 0;
        boolean z12 = this.L;
        TextView textView = this.K;
        if (!z12 && z11) {
            z10 = false;
        } else {
            if (!z11 && z12) {
                this.L = z11;
                invalidate();
                return;
            }
            if (z12 && z11) {
                x5 x5Var = this.I;
                this.P = x5Var.getLeft();
                this.R = x5Var.getRight();
                this.Q = textView.getLeft();
                this.O = 0.0f;
            }
            z10 = z9;
        }
        if (!z11) {
            this.L = z11;
            invalidate();
            return;
        }
        String K0 = id.K0(i12, "MembersAreSpeakingToast");
        int indexOf = K0.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i12 != 0 ? i12 == 1 ? org.telegram.messenger.g0.L(40.0f) : i12 == 2 ? org.telegram.messenger.g0.L(64.0f) : org.telegram.messenger.g0.L(88.0f) : 0;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
        this.L = z11;
        invalidate();
        while (i12 < 3) {
            z8Var.b(i12, i10, null);
            i12++;
        }
        z8Var.a(z10);
    }
}
