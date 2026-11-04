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
import b8.mf;
import ci.uc;
import ei.k3;
import gi.n5;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.l10;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.x8;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ik;
import org.telegram.ui.q10;
import org.telegram.ui.u10;
import org.telegram.ui.x30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class x extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public r E;
    public boolean E0;
    public r F;
    public float F0;
    public final RecyclerView G;
    public float G0;
    public final q10 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final ai.c0 J;
    public float J0;
    public final x8 K;
    public ValueAnimator K0;
    public final TextView L;
    public final UndoView[] L0;
    public boolean M;
    public boolean M0;
    public long N;
    public boolean N0;
    public float O;
    public ValueAnimator O0;
    public float P;
    public long P0;
    public float Q;
    public d4 Q0;
    public float R;
    public float S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final int a;
    public float a0;
    public boolean b;
    public final GradientDrawable b0;
    public float c;
    public final GradientDrawable c0;
    public long d;
    public final uq d0;
    public s3 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final n5 g0;
    public long h;
    public boolean h0;
    public final lt i0;
    public r3 j0;
    public final x30 k0;
    public final lg.k l0;
    public final org.telegram.ui.ActionBar.e0 m0;
    public float n;
    public final View n0;
    public final View o0;
    public float p0;
    public float q0;
    public ValueAnimator r;
    public float r0;
    public boolean s;
    public float s0;
    public float t0;
    public boolean u0;
    public float v0;
    public final ImageView w;
    public float w0;
    public final LongSparseIntArray x;
    public int x0;
    public final g2.g y;
    public int y0;
    public float z0;

    public x(Context context, RecyclerView recyclerView, q10 q10Var, ArrayList arrayList, r3 r3Var, x30 x30Var) {
        super(context);
        this.x = new LongSparseIntArray();
        this.y = new g2.g((int[]) null);
        this.P = 1.0f;
        final int i3 = 1;
        this.W = true;
        final u10 u10Var = (u10) this;
        this.i0 = new lt(u10Var, 17);
        this.z0 = 1.0f;
        int i10 = 2;
        this.L0 = new UndoView[2];
        this.G = recyclerView;
        this.H = q10Var;
        this.I = arrayList;
        this.j0 = r3Var;
        this.k0 = x30Var;
        lg.k kVar = new lg.k(context, 4);
        this.l0 = kVar;
        final int i11 = 0;
        org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
        w1Var.a(-1);
        kVar.setImageDrawable(w1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(k6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, hs.z1)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, mf.c(120.0f, -1));
        View view2 = new View(context);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, hs.z1)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((r3Var == null || !h()) ? 8 : 0);
        addView(view2, mf.e(hs.q2, -1, 5));
        addView(kVar, mf.e(56, -1, 51));
        kVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        u10Var.R0.onBackPressed();
                        break;
                    default:
                        u10 u10Var2 = u10Var;
                        if (u10Var2.b) {
                            boolean z10 = !u10Var2.f;
                            u10Var2.f = z10;
                            u10Var2.d0.a(z10, true);
                            u10Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.e0 e0Var = new org.telegram.ui.ActionBar.e0(i10, context, u10Var);
        this.m0 = e0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o10 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, 0, o10, o10);
        n5 n5Var = new n5(u10Var, context, k02, 9);
        this.g0 = n5Var;
        n5Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i3) {
                    case 0:
                        u10Var.R0.onBackPressed();
                        break;
                    default:
                        u10 u10Var2 = u10Var;
                        if (u10Var2.b) {
                            boolean z10 = !u10Var2.f;
                            u10Var2.f = z10;
                            u10Var2.d0.a(z10, true);
                            u10Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        k02.setCallback(n5Var);
        addView(n5Var);
        uq uqVar = new uq(context, R.drawable.msg_pin_filled, -1);
        this.d0 = uqVar;
        float f10 = -org.telegram.messenger.g0.L(1.0f);
        float L2 = org.telegram.messenger.g0.L(2.0f);
        float L3 = org.telegram.messenger.g0.L(1.0f);
        uqVar.i = f10;
        uqVar.j = L2;
        uqVar.k = L3;
        uqVar.invalidateSelf();
        e0Var.setImageDrawable(uqVar);
        e0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(e0Var, mf.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(bd.M0(2131752599, null));
        TextView textView2 = new TextView(context);
        this.f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(bd.M0(2131752598, null));
        addView(textView, mf.e(-2, -2, 51));
        addView(textView2, mf.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(bd.M0(2131754808, null));
        int L4 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L4, L4, L4, L4);
        imageView.setBackground(k6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new ux0(7, (Object) u10Var, (Object) x30Var));
        addView(imageView, mf.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        ai.c0 c0Var = new ai.c0(u10Var, context, k6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(k6.x0(null, k6.hh, false), hs.i3)), 18);
        this.J = c0Var;
        x8 x8Var = new x8(context, true);
        this.K = x8Var;
        x8Var.setStyle(10);
        c0Var.setClipChildren(false);
        c0Var.setClipToPadding(false);
        c0Var.addView(x8Var, mf.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        c0Var.addView(textView3, mf.e(-2, -2, 16));
        addView(c0Var, mf.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        while (i11 < 2) {
            this.L0[i11] = new ik(u10Var, context);
            this.L0[i11].setHideAnimationType(2);
            this.L0[i11].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.L0[i11], mf.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
            i11++;
        }
        this.g0.setVisibility(8);
        setIsTablet(x30.y5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            x30 x30Var = ((u10) this).R0;
            if (x30Var.S3 != null) {
                x30Var.r5.a(!r1.W, true);
            }
            lt ltVar = this.i0;
            if (!z10 || !this.b) {
                this.h0 = false;
                org.telegram.messenger.g0.r(ltVar);
            } else if (!this.h0) {
                this.h0 = true;
                org.telegram.messenger.g0.i3(ltVar, 3000L);
            }
            r rVar = this.E;
            if (rVar != null) {
                rVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        int i3 = 0;
        if (this.H0) {
            this.H0 = false;
            int i10 = 1;
            float f10 = this.J0;
            float[] fArr = new float[2];
            if (z10) {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f10;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.K0 = ofFloat;
            ofFloat.addUpdateListener(new t(this, i3));
            this.K0.addListener(new w(this, i10));
            ValueAnimator valueAnimator = this.K0;
            xq xqVar = xq.f;
            valueAnimator.setInterpolator(xqVar);
            this.K0.setDuration(z10 ? 350L : 200L);
            this.K0.setInterpolator(xqVar);
            r rVar = this.E;
            if (rVar != null) {
                n nVar = rVar.a;
                ValueAnimator valueAnimator2 = this.K0;
                if (nVar.F) {
                    nVar.H.add(valueAnimator2);
                } else {
                    valueAnimator2.start();
                }
            } else {
                this.K0.start();
            }
            this.h = System.currentTimeMillis();
        }
        this.I0 = false;
    }

    public final boolean c() {
        return (this.f || System.currentTimeMillis() - this.h <= 2000 || this.H0 || this.u0) ? false : true;
    }

    public final void d() {
        r rVar = this.E;
        if (rVar != null) {
            if (rVar.p0 || rVar.q0 != 0.0f) {
                rVar.p0 = false;
                rVar.q0 = 0.0f;
                rVar.a.invalidate();
                rVar.invalidate();
            }
            this.E.i(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, false);
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
        r rVar;
        q10 q10Var;
        r rVar2;
        r rVar3;
        UndoView[] undoViewArr;
        if (x30.y5) {
            this.T = true;
            super.dispatchDraw(canvas);
            this.T = false;
        }
        this.U = true;
        super.dispatchDraw(canvas);
        this.U = false;
        if (this.F != null || this.E != null) {
            RecyclerView recyclerView = this.G;
            float y9 = recyclerView.getY() - getTop();
            float measuredHeight = (recyclerView.getMeasuredHeight() + y9) - recyclerView.getTranslationY();
            float f10 = this.c;
            canvas.save();
            boolean z10 = x30.y5;
            if (!z10 && (rVar = this.E) != null && !rVar.Q && rVar.c != null) {
                float f11 = 1.0f - f10;
                canvas.clipRect(0.0f, y9 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            } else if (z10) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            r rVar4 = this.F;
            if (rVar4 != null && rVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.F.getX(), this.F.getY());
                this.F.draw(canvas);
                canvas.restore();
            }
            r rVar5 = this.E;
            if (rVar5 != null && rVar5.getParent() != null) {
                if (this.E.getAlpha() != 1.0f) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(this.E.getX(), this.E.getY(), this.E.getX() + this.E.getMeasuredWidth(), this.E.getY() + this.E.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.E.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z11 = this.H0 || this.K0 != null;
                if (z11 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((x30.x5 || x30.y5) ? 0 : org.telegram.messenger.g0.L(90.0f)));
                }
                canvas.translate(this.E.getX(), this.E.getY());
                r rVar6 = this.E;
                float f12 = this.J0;
                if (rVar6.p0 != z11 || rVar6.q0 != f12) {
                    rVar6.p0 = z11;
                    rVar6.q0 = f12;
                    rVar6.a.invalidate();
                    rVar6.invalidate();
                }
                this.E.i(this.z0, this.v0, this.w0, this.s0, this.t0, this.A0 || this.C0 != null);
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i3 = 0; i3 < 2; i3++) {
            UndoView[] undoViewArr2 = this.L0;
            if (undoViewArr2[i3].getVisibility() == 0) {
                canvas.save();
                float f13 = x30.x5 ? 0.0f : (1.0f - this.a0) * (-org.telegram.messenger.g0.L(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (x30.x5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i3].getX() - org.telegram.messenger.g0.L(8.0f), undoViewArr2[i3].getY() - org.telegram.messenger.g0.L(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i3].getX() - org.telegram.messenger.g0.L(8.0f), ((undoViewArr2[i3].getY() - (x30.x5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(26.0f));
                }
                if (undoViewArr2[i3].getAlpha() != 1.0f) {
                    undoViewArr = undoViewArr2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, undoViewArr2[i3].getMeasuredWidth(), undoViewArr2[i3].getMeasuredHeight(), (int) (undoViewArr2[i3].getAlpha() * 255.0f), 31);
                } else {
                    undoViewArr = undoViewArr2;
                    canvas.save();
                }
                canvas.scale(undoViewArr[i3].getScaleX(), undoViewArr[i3].getScaleY(), undoViewArr[i3].getMeasuredWidth() / 2.0f, undoViewArr[i3].getMeasuredHeight() / 2.0f);
                undoViewArr[i3].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f14 = (1.0f - this.a0) * this.c;
        ValueAnimator valueAnimator = this.O0;
        GradientDrawable gradientDrawable = this.c0;
        GradientDrawable gradientDrawable2 = this.b0;
        if (valueAnimator == null || (rVar2 = this.F) == null || (rVar3 = this.E) == null) {
            r rVar7 = this.E;
            if (rVar7 != null) {
                float f15 = 255.0f * f14;
                gradientDrawable2.setAlpha((int) ((1.0f - rVar7.b0) * f15));
                gradientDrawable.setAlpha((int) ((1.0f - this.E.b0) * f15));
            } else {
                int i10 = (int) (255.0f * f14);
                gradientDrawable2.setAlpha(i10);
                gradientDrawable.setAlpha(i10);
            }
        } else {
            boolean z12 = rVar2.a0;
            boolean z13 = rVar3.a0;
            int alpha = (int) ((z12 != z13 ? (!z13 ? 1.0f - rVar3.getAlpha() : rVar3.getAlpha()) * f14 : !z13 ? 0.0f : f14) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.l0.setAlpha(f14);
        boolean h = h();
        org.telegram.ui.ActionBar.e0 e0Var = this.m0;
        ImageView imageView = this.w;
        if (h) {
            e0Var.setAlpha(0.0f);
            e0Var.setVisibility(4);
            imageView.setAlpha(f14);
            imageView.setVisibility(0);
            if (x30.x5) {
                imageView.setTranslationX((1.0f - this.a0) * (-org.telegram.messenger.g0.L(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        } else {
            e0Var.setAlpha(f14);
            e0Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        }
        int measuredWidth = getMeasuredWidth();
        TextView textView = this.e0;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.f0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        uq uqVar = this.d0;
        float f16 = uqVar.g;
        float y10 = (com.google.android.recaptcha.internal.a.y(1.0f, f16, measuredWidth2, measuredWidth4 * f16) - org.telegram.messenger.g0.L(21.0f)) - (x30.y5 ? org.telegram.messenger.g0.L(328.0f) : x30.x5 ? org.telegram.messenger.g0.L(180.0f) : 0);
        textView.setTranslationX(y10);
        textView2.setTranslationX(y10);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        n5 n5Var = this.g0;
        n5Var.setTranslationX(y10 - org.telegram.messenger.g0.L(36.0f));
        n5Var.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - n5Var.getMeasuredHeight()) / 2.0f);
        e0Var.setTranslationX(y10 - org.telegram.messenger.g0.L(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            n5Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - uqVar.g) * f14);
            textView2.setAlpha(uqVar.g * f14);
            n5Var.setAlpha(f14);
        }
        float f17 = this.P;
        ai.c0 c0Var = this.J;
        if (f17 != 1.0f) {
            float f18 = f17 + 0.07272727f;
            this.P = f18;
            if (f18 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            c0Var.invalidate();
        }
        boolean z14 = this.M;
        if (z14) {
            float f19 = this.O;
            if (f19 != 1.0f) {
                float f20 = f19 + 0.10666667f;
                this.O = f20;
                if (f20 > 1.0f) {
                    this.O = 1.0f;
                } else {
                    invalidate();
                }
                if (x30.x5) {
                    c0Var.setTranslationY((org.telegram.messenger.g0.L(8.0f) * this.a0) + ((1.0f - this.a0) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(8.0f));
                } else {
                    c0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f));
                }
                c0Var.setAlpha(this.O * this.c);
                c0Var.setScaleX((this.O * 0.5f) + 0.5f);
                c0Var.setScaleY((this.O * 0.5f) + 0.5f);
                if (x30.y5) {
                    super.dispatchDraw(canvas);
                } else {
                    this.V = true;
                    super.dispatchDraw(canvas);
                    this.V = false;
                }
                q10Var = this.H;
                if (q10Var.getVisibility() != 0) {
                    for (int i11 = 0; i11 < q10Var.getChildCount(); i11++) {
                        d10 d10Var = (d10) q10Var.getChildAt(i11);
                        if (d10Var.getVisibility() == 0 && d10Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(q10Var.getX() + d10Var.getX(), q10Var.getY() + d10Var.getY());
                            canvas.scale(d10Var.getScaleX(), d10Var.getScaleY(), d10Var.getMeasuredWidth() / 2.0f, d10Var.getMeasuredHeight() / 2.0f);
                            d10Var.c(canvas);
                            canvas.restore();
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (!z14) {
            float f21 = this.O;
            if (f21 != 0.0f) {
                float f22 = f21 - 0.10666667f;
                this.O = f22;
                if (f22 < 0.0f) {
                    this.O = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        if (x30.x5) {
        }
        c0Var.setAlpha(this.O * this.c);
        c0Var.setScaleX((this.O * 0.5f) + 0.5f);
        c0Var.setScaleY((this.O * 0.5f) + 0.5f);
        if (x30.y5) {
        }
        q10Var = this.H;
        if (q10Var.getVisibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.U;
        RecyclerView recyclerView = this.G;
        if (!z10) {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof r) {
                    r rVar = (r) view;
                    if (rVar != this.E && rVar != this.F && !this.V && !rVar.z0) {
                        if (rVar.c == null) {
                            if (!x30.y5) {
                                return super.drawChild(canvas, view, j10);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild;
                        }
                        float y9 = recyclerView.getY() - getTop();
                        float measuredHeight = (recyclerView.getMeasuredHeight() + y9) - recyclerView.getTranslationY();
                        float f10 = this.c;
                        if (rVar.d == null) {
                            f10 = 0.0f;
                        }
                        canvas.save();
                        float f11 = 1.0f - f10;
                        canvas.clipRect(0.0f, y9 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                } else if (!this.T) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        } else if ((view instanceof r) && ((r) view).z0) {
            float y10 = recyclerView.getY() - getTop();
            float measuredHeight2 = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
            canvas.save();
            canvas.clipRect(0.0f, y10, getMeasuredWidth(), measuredHeight2);
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        return true;
    }

    public final void e() {
        boolean z10 = this.h0;
        lt ltVar = this.i0;
        if (z10) {
            org.telegram.messenger.g0.r(ltVar);
        }
        org.telegram.messenger.g0.i3(ltVar, 3000L);
        this.h0 = true;
    }

    public final void f(r rVar) {
        this.I.remove(rVar);
        long C1 = zi.C1(rVar.x.a.peer);
        this.x.put(C1, r2.get(C1, 0) - 1);
    }

    public final void g() {
        x xVar;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            xVar = this;
            ofFloat.addUpdateListener(new u(xVar, this.z0, this.s0, this.t0, 0));
            xVar.C0.addListener(new w(this, 2));
            xVar.C0.setDuration(350L);
            xVar.C0.setInterpolator(xq.f);
            xVar.C0.start();
            xVar.h = System.currentTimeMillis();
        } else {
            xVar = this;
        }
        xVar.B0 = false;
        xVar.u0 = false;
    }

    public UndoView getUndoView() {
        UndoView[] undoViewArr = this.L0;
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
        r3 r3Var = this.j0;
        return r3Var != null && r3Var.b.rtmp_stream;
    }

    public abstract void i(boolean z10);

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
        r rVar;
        r rVar2;
        n nVar;
        k kVar;
        d10 d10Var;
        k kVar2;
        s3 s3Var2;
        if (s3Var == null && this.e == null) {
            return;
        }
        if (s3Var == null || !s3Var.equals(this.e)) {
            long C1 = s3Var == null ? 0L : zi.C1(s3Var.a.peer);
            r rVar3 = this.E;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (rVar3 != null) {
                ArrayList arrayList = rVar3.n0;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((Runnable) arrayList.get(i3)).run();
                }
                arrayList.clear();
            }
            ValueAnimator valueAnimator = this.O0;
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
            boolean z10 = this.b;
            this.h = System.currentTimeMillis();
            int i11 = 2;
            lg.k kVar3 = this.l0;
            x30 x30Var = this.k0;
            if (s3Var == null) {
                if (this.b) {
                    ValueAnimator valueAnimator2 = this.r;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.b = false;
                    r rVar4 = this.E;
                    if (rVar4.c != null || rVar4.d != null || rVar4.e != null) {
                        s3 s3Var3 = rVar4.x;
                        if (r3.C(s3Var3.a, s3Var3.b, this.j0)) {
                            this.E.h(false, true);
                        }
                    }
                    this.E.b(true);
                    k kVar4 = this.E.c;
                    if (kVar4 != null) {
                        kVar4.setRenderer(null);
                    }
                    d10 d10Var2 = this.E.d;
                    if (d10Var2 != null) {
                        d10Var2.setRenderer(null);
                    }
                    k kVar5 = this.E.e;
                    if (kVar5 != null) {
                        kVar5.setRenderer(null);
                    }
                    r rVar5 = this.E;
                    rVar5.animate().alpha(0.0f).setListener(new v(this, rVar5, i11)).setDuration(350L).start();
                }
                kVar3.setEnabled(false);
                this.f = false;
            } else {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.I;
                    if (i12 >= arrayList2.size()) {
                        rVar = null;
                        break;
                    } else {
                        if (((r) arrayList2.get(i12)).x.equals(s3Var)) {
                            rVar = (r) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                Property property = View.ALPHA;
                uq uqVar = this.d0;
                if (rVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        uqVar.a(false, false);
                        this.E.b(false);
                        rVar.b(false);
                        if (!this.N0) {
                            r rVar6 = this.E;
                            if (rVar6.c != null || rVar6.d != null || rVar6.e != null) {
                                rVar2 = new r(this, this.j0, x30Var);
                                r rVar7 = this.E;
                                k kVar6 = rVar7.c;
                                d10 d10Var3 = rVar7.d;
                                k kVar7 = rVar7.e;
                                rVar2.c = kVar6;
                                rVar2.d = d10Var3;
                                rVar2.e = kVar7;
                                rVar2.g(this.b, false);
                                rVar2.j(false);
                                k kVar8 = this.E.c;
                                if (kVar8 != null) {
                                    kVar8.setRenderer(rVar2);
                                }
                                d10 d10Var4 = this.E.d;
                                if (d10Var4 != null) {
                                    d10Var4.setRenderer(rVar2);
                                }
                                k kVar9 = this.E.e;
                                if (kVar9 != null) {
                                    kVar9.setRenderer(rVar2);
                                }
                                r rVar8 = new r(this, this.j0, x30Var);
                                rVar8.x = rVar.x;
                                k kVar10 = rVar.c;
                                d10 d10Var5 = rVar.d;
                                k kVar11 = rVar.e;
                                rVar8.c = kVar10;
                                rVar8.d = d10Var5;
                                rVar8.e = kVar11;
                                rVar8.g(this.b, false);
                                rVar8.j(false);
                                nVar = rVar8.a;
                                nVar.d.setAlpha(1.0f);
                                nVar.e.setAlpha(1.0f);
                                kVar = rVar.c;
                                if (kVar != null) {
                                    kVar.setRenderer(rVar8);
                                }
                                d10Var = rVar.d;
                                if (d10Var != null) {
                                    d10Var.setRenderer(rVar8);
                                }
                                kVar2 = rVar.e;
                                if (kVar2 != null) {
                                    kVar2.setRenderer(rVar8);
                                }
                                rVar8.F = true;
                                rVar8.setAlpha(0.0f);
                                this.F = this.E;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rVar8, (Property<r, Float>) property, 0.0f, 1.0f);
                                this.O0 = ofFloat;
                                ofFloat.addListener(new k3(this, rVar8, rVar, 9));
                                if (rVar2 != null) {
                                    rVar2.setAlpha(0.0f);
                                    rVar2.setScaleX(0.5f);
                                    rVar2.setScaleY(0.5f);
                                    rVar2.F = true;
                                }
                                iv0 iv0Var = new iv0(this, rVar, rVar2, 7);
                                if (nVar.d.isFirstFrameRendered()) {
                                    org.telegram.messenger.g0.i3(iv0Var, 250L);
                                    rVar8.n0.add(iv0Var);
                                } else {
                                    iv0Var.run();
                                }
                                d();
                                this.E = rVar8;
                                rVar8.h(true, false);
                                l();
                            }
                        }
                        rVar2 = null;
                        r rVar82 = new r(this, this.j0, x30Var);
                        rVar82.x = rVar.x;
                        k kVar102 = rVar.c;
                        d10 d10Var52 = rVar.d;
                        k kVar112 = rVar.e;
                        rVar82.c = kVar102;
                        rVar82.d = d10Var52;
                        rVar82.e = kVar112;
                        rVar82.g(this.b, false);
                        rVar82.j(false);
                        nVar = rVar82.a;
                        nVar.d.setAlpha(1.0f);
                        nVar.e.setAlpha(1.0f);
                        kVar = rVar.c;
                        if (kVar != null) {
                        }
                        d10Var = rVar.d;
                        if (d10Var != null) {
                        }
                        kVar2 = rVar.e;
                        if (kVar2 != null) {
                        }
                        rVar82.F = true;
                        rVar82.setAlpha(0.0f);
                        this.F = this.E;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rVar82, (Property<r, Float>) property, 0.0f, 1.0f);
                        this.O0 = ofFloat2;
                        ofFloat2.addListener(new k3(this, rVar82, rVar, 9));
                        if (rVar2 != null) {
                        }
                        iv0 iv0Var2 = new iv0(this, rVar, rVar2, 7);
                        if (nVar.d.isFirstFrameRendered()) {
                        }
                        d();
                        this.E = rVar82;
                        rVar82.h(true, false);
                        l();
                    } else {
                        this.b = true;
                        d();
                        this.E = rVar;
                        rVar.h(true, true);
                        invalidate();
                        uqVar.a(this.f, false);
                    }
                } else if (this.b) {
                    r rVar9 = this.E;
                    if (rVar9.c == null) {
                        if (!((rVar9.d != null) | (rVar9.e != null))) {
                            rVar9.b(true);
                            r rVar10 = new r(this, this.j0, x30Var);
                            rVar10.x = s3Var;
                            rVar10.g(this.b, false);
                            rVar10.h(true, false);
                            rVar10.F = true;
                            rVar10.setAlpha(0.0f);
                            this.F = this.E;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.O0 = ofFloat3;
                            ofFloat3.addUpdateListener(new uc(18, this, rVar10));
                            this.O0.addListener(new v(this, rVar10, objArr2 == true ? 1 : 0));
                            this.O0.start();
                            d();
                            this.E = rVar10;
                            rVar10.h(true, false);
                            this.E.j(false);
                            l();
                        }
                    }
                    rVar9.b(false);
                    r rVar11 = new r(this, this.j0, x30Var);
                    r rVar12 = this.E;
                    k kVar12 = rVar12.c;
                    d10 d10Var6 = rVar12.d;
                    k kVar13 = rVar12.e;
                    rVar11.c = kVar12;
                    rVar11.d = d10Var6;
                    rVar11.e = kVar13;
                    rVar11.g(this.b, false);
                    rVar11.j(false);
                    k kVar14 = this.E.c;
                    if (kVar14 != null) {
                        kVar14.setRenderer(rVar11);
                    }
                    d10 d10Var7 = this.E.d;
                    if (d10Var7 != null) {
                        d10Var7.setRenderer(rVar11);
                    }
                    k kVar15 = this.E.e;
                    if (kVar15 != null) {
                        kVar15.setRenderer(rVar11);
                    }
                    rVar11.setAlpha(0.0f);
                    rVar11.setScaleX(0.5f);
                    rVar11.setScaleY(0.5f);
                    rVar11.F = true;
                    p11 p11Var = new p11(11, this, rVar11);
                    if (rVar11.a.d.isFirstFrameRendered()) {
                        p11Var.run();
                    } else {
                        org.telegram.messenger.g0.i3(p11Var, 250L);
                        rVar11.n0.add(p11Var);
                    }
                    r rVar102 = new r(this, this.j0, x30Var);
                    rVar102.x = s3Var;
                    rVar102.g(this.b, false);
                    rVar102.h(true, false);
                    rVar102.F = true;
                    rVar102.setAlpha(0.0f);
                    this.F = this.E;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.O0 = ofFloat32;
                    ofFloat32.addUpdateListener(new uc(18, this, rVar102));
                    this.O0.addListener(new v(this, rVar102, objArr2 == true ? 1 : 0));
                    this.O0.start();
                    d();
                    this.E = rVar102;
                    rVar102.h(true, false);
                    this.E.j(false);
                    l();
                } else {
                    this.b = true;
                    d();
                    r rVar13 = new r(this, this.j0, x30Var);
                    this.E = rVar13;
                    rVar13.x = s3Var;
                    rVar13.g(this.b, false);
                    this.E.h(true, false);
                    this.E.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E, (Property<r, Float>) property, 0.0f, 1.0f);
                    this.O0 = ofFloat4;
                    ofFloat4.addListener(new w(this, objArr == true ? 1 : 0));
                    this.O0.start();
                    invalidate();
                    uqVar.a(this.f, false);
                }
                kVar3.setEnabled(true);
            }
            boolean z11 = this.b;
            if (z10 != z11) {
                if (z11) {
                    kVar3.setVisibility(0);
                    this.m0.setVisibility(0);
                    this.f0.setVisibility(0);
                    this.g0.setVisibility(0);
                } else {
                    setUiVisible(true);
                    if (this.h0) {
                        this.h0 = false;
                        org.telegram.messenger.g0.r(this.i0);
                    }
                }
                i(true);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.c, this.b ? 1.0f : 0.0f);
                this.r = ofFloat5;
                ofFloat5.addUpdateListener(new t(this, i10));
                r rVar14 = this.E;
                rVar14.r = true;
                x30Var.getClass();
                this.M0 = this.H0;
                this.y.d();
                this.r.addListener(new v(this, rVar14, i10));
                this.r.setInterpolator(xq.f);
                this.r.setDuration(350L);
                n nVar2 = this.E.a;
                ValueAnimator valueAnimator4 = this.r;
                if (nVar2.F) {
                    nVar2.H.add(valueAnimator4);
                } else {
                    valueAnimator4.start();
                }
            }
            b(this.e == null);
        }
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.I;
            if (i3 >= arrayList.size()) {
                return;
            }
            if (zi.C1(((r) arrayList.get(i3)).x.a.peer) == zi.C1(groupCallParticipant.peer)) {
                ((r) arrayList.get(i3)).setAmplitude(f10);
            }
            i3++;
        }
    }

    public abstract void l();

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        boolean z10 = x30.y5;
        View view = this.n0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (x30.x5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : org.telegram.messenger.g0.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.o0.setVisibility((!x30.x5 || x30.y5) ? 8 : 0);
        n5 n5Var = this.g0;
        n5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i10);
        n5Var.getLayoutParams().width = org.telegram.messenger.g0.L(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).rightMargin = x30.x5 ? org.telegram.messenger.g0.L(45.0f) : 0;
        for (int i11 = 0; i11 < 2; i11++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L0[i11].getLayoutParams();
            if (this.N0) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(344.0f);
            } else {
                marginLayoutParams.rightMargin = x30.x5 ? org.telegram.messenger.g0.L(180.0f) : 0;
            }
        }
        super.onMeasure(i3, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x038a, code lost:
    
        if ((r15.getPointerCount() >= 2 && ((r14.x0 == r15.getPointerId(0) && r14.y0 == r15.getPointerId(1)) || (r14.x0 == r15.getPointerId(1) && r14.y0 == r15.getPointerId(0)))) == false) goto L178;
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
        boolean z10;
        boolean z11 = this.I0;
        x30 x30Var = this.k0;
        if ((z11 || this.H0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.I0 = false;
            if (this.H0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.J0) <= org.telegram.messenger.g0.L(120.0f)) {
                    b(false);
                } else {
                    x30Var.g1(null);
                }
            }
            invalidate();
        }
        if (!this.b || (!(this.I0 || this.H0 || this.E0 || this.B0 || this.u0 || this.A0 || motionEvent.getActionMasked() == 0) || this.E == null)) {
            g();
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.I0 = false;
            this.H0 = false;
            this.B0 = false;
            this.u0 = false;
            this.A0 = false;
        }
        if (motionEvent.getActionMasked() == 0 && this.K0 != null) {
            this.I0 = false;
            this.H0 = true;
            this.G0 = motionEvent.getY() - this.J0;
            this.K0.removeAllListeners();
            this.K0.cancel();
            this.K0 = null;
        } else if (this.K0 != null) {
            g();
            return false;
        }
        r rVar = this.E;
        float x10 = motionEvent.getX();
        float y9 = motionEvent.getY();
        org.telegram.ui.ActionBar.k2 k2Var = rVar.O;
        Rect rect = rVar.C0;
        k2Var.getHitRect(rect);
        if (!rect.contains((int) x10, (int) y9)) {
            if (motionEvent.getActionMasked() == 0 && !this.H0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.E.getMeasuredWidth() + ((x30.x5 && this.W) ? -org.telegram.messenger.g0.L(90.0f) : 0), this.E.getMeasuredHeight() + ((x30.x5 || !this.W) ? 0 : -org.telegram.messenger.g0.L(90.0f)));
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.D0 = System.currentTimeMillis();
                    this.E0 = true;
                    this.I0 = true;
                    this.F0 = motionEvent.getX();
                    this.G0 = motionEvent.getY();
                }
            } else if ((this.I0 || this.H0 || this.E0) && motionEvent.getActionMasked() == 2) {
                float abs = Math.abs(this.F0 - motionEvent.getX());
                float f10 = this.a;
                if (abs > f10 || Math.abs(this.G0 - motionEvent.getY()) > f10) {
                    this.E0 = false;
                }
                if (this.I0 && !this.A0 && Math.abs(this.G0 - motionEvent.getY()) > r8 * 2) {
                    this.G0 = motionEvent.getY();
                    this.I0 = false;
                    this.H0 = true;
                } else if (this.H0) {
                    this.J0 = motionEvent.getY() - this.G0;
                    invalidate();
                }
                if (this.I0 && Math.abs(this.F0 - motionEvent.getX()) > r8 * 4) {
                    this.I0 = false;
                }
            }
            if (this.E0 && motionEvent.getActionMasked() == 1 && System.currentTimeMillis() - this.D0 < 200) {
                this.E0 = false;
                if (this.M) {
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    ai.c0 c0Var = this.J;
                    rectF2.set(c0Var.getX(), c0Var.getY(), c0Var.getX() + c0Var.getWidth(), c0Var.getY() + c0Var.getHeight());
                    if (this.j0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z12 = false;
                        z10 = false;
                        for (int i3 = 0; i3 < this.j0.f.size(); i3++) {
                            if (this.N == zi.C1(((s3) this.j0.f.get(i3)).a.peer)) {
                                x30Var.g1((s3) this.j0.f.get(i3));
                                z12 = true;
                                z10 = true;
                            }
                        }
                        if (!z12) {
                            x30Var.g1(new s3((TLRPC.GroupCallParticipant) this.j0.d.f(this.N), false));
                            z10 = true;
                        }
                        if (!z10) {
                            setUiVisible(!this.W);
                        }
                        this.J0 = 0.0f;
                        invalidate();
                    }
                }
                z10 = false;
                if (!z10) {
                }
                this.J0 = 0.0f;
                invalidate();
            }
            if (!this.E.a0 || this.H0) {
                g();
                if (this.E0 || this.H0 || this.I0) {
                    return true;
                }
            } else {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (motionEvent.getActionMasked() == 0) {
                        y1 y1Var = this.E.a.d;
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        rectF3.set(y1Var.getX(), y1Var.getY(), y1Var.getX() + y1Var.getMeasuredWidth(), y1Var.getY() + y1Var.getMeasuredHeight());
                        rectF3.inset(((y1Var.getMeasuredHeight() * this.E.a.U) - y1Var.getMeasuredHeight()) / 2.0f, ((y1Var.getMeasuredWidth() * this.E.a.U) - y1Var.getMeasuredWidth()) / 2.0f);
                        if (x30.x5) {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.E.getMeasuredWidth() - org.telegram.messenger.g0.L(90.0f));
                        } else {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.E.getMeasuredHeight() - org.telegram.messenger.g0.L(90.0f));
                        }
                        boolean contains = rectF3.contains(motionEvent.getX(), motionEvent.getY());
                        this.B0 = contains;
                        if (!contains) {
                            g();
                            return this.I0;
                        }
                    }
                    if (!this.u0 && motionEvent.getPointerCount() == 2) {
                        this.r0 = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        float x11 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.v0 = x11;
                        this.p0 = x11;
                        float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.w0 = y10;
                        this.q0 = y10;
                        this.z0 = 1.0f;
                        this.x0 = motionEvent.getPointerId(0);
                        this.y0 = motionEvent.getPointerId(1);
                        this.u0 = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.u0) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < motionEvent.getPointerCount(); i12++) {
                        if (this.x0 == motionEvent.getPointerId(i12)) {
                            i10 = i12;
                        }
                        if (this.y0 == motionEvent.getPointerId(i12)) {
                            i11 = i12;
                        }
                    }
                    if (i10 == -1 || i11 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                        return this.I0;
                    }
                    float hypot = ((float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10))) / this.r0;
                    this.z0 = hypot;
                    if (hypot > 1.005f && !this.A0) {
                        this.r0 = (float) Math.hypot(motionEvent.getX(i11) - motionEvent.getX(i10), motionEvent.getY(i11) - motionEvent.getY(i10));
                        float x12 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                        this.v0 = x12;
                        this.p0 = x12;
                        float y11 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        this.w0 = y11;
                        this.q0 = y11;
                        this.z0 = 1.0f;
                        this.s0 = 0.0f;
                        this.t0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.A0 = true;
                        this.u0 = true;
                    }
                    float x13 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    float y12 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    float f11 = this.p0 - x13;
                    float f12 = this.q0 - y12;
                    float f13 = -f11;
                    float f14 = this.z0;
                    this.s0 = f13 / f14;
                    this.t0 = (-f12) / f14;
                    invalidate();
                } else {
                    if (motionEvent.getActionMasked() != 1) {
                        if (motionEvent.getActionMasked() == 6) {
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                    g();
                }
                if (this.B0 || this.E0 || this.I0) {
                }
            }
        }
        return false;
    }

    public void setGroupCall(r3 r3Var) {
        this.j0 = r3Var;
    }

    public void setIsTablet(boolean z10) {
        if (this.N0 != z10) {
            this.N0 = z10;
            lg.k kVar = this.l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.getLayoutParams();
            layoutParams.gravity = z10 ? 85 : 51;
            layoutParams.rightMargin = z10 ? org.telegram.messenger.g0.L(328.0f) : 0;
            layoutParams.bottomMargin = z10 ? -org.telegram.messenger.g0.L(8.0f) : 0;
            if (this.N0) {
                kVar.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.w1 w1Var = new org.telegram.ui.ActionBar.w1(false);
            w1Var.a(-1);
            kVar.setImageDrawable(w1Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.a0 != f10) {
            this.a0 = f10;
            invalidate();
            r rVar = this.E;
            if (rVar != null) {
                rVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        x8 x8Var;
        boolean z11;
        int i3;
        long j10;
        if (!this.b || this.N0 || this.e == null || this.r != null || this.j0 == null) {
            if (this.M) {
                this.M = false;
                this.O = 0.0f;
                return;
            }
            return;
        }
        int i10 = this.k0.a;
        long j11 = 500;
        if (System.currentTimeMillis() - this.P0 < 500) {
            if (this.Q0 == null) {
                d4 d4Var = new d4(this, 7);
                this.Q0 = d4Var;
                org.telegram.messenger.g0.i3(d4Var, (System.currentTimeMillis() - this.P0) + 50);
                return;
            }
            return;
        }
        this.P0 = System.currentTimeMillis();
        int i11 = 0;
        int i12 = 0;
        SpannableStringBuilder spannableStringBuilder = null;
        while (true) {
            int m10 = this.j0.P.m();
            x8Var = this.K;
            if (i11 >= m10) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.j0.P.f(this.j0.P.j(i11));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you) {
                i3 = i11;
                j10 = j11;
            } else {
                j10 = j11;
                if (zi.C1(this.e.a.peer) == zi.C1(groupCallParticipant.peer)) {
                    i3 = i11;
                } else {
                    long C1 = zi.C1(groupCallParticipant.peer);
                    i3 = i11;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j10) {
                        continue;
                    } else {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i12 == 0) {
                            this.N = zi.C1(groupCallParticipant.peer);
                        }
                        if (i12 < 3) {
                            TLRPC.User a22 = C1 > 0 ? hp.s1(i10).a2(Long.valueOf(C1)) : null;
                            TLRPC.Chat M0 = C1 <= 0 ? hp.s1(i10).M0(Long.valueOf(C1)) : null;
                            if (a22 != null || M0 != null) {
                                x8Var.b(i12, i10, groupCallParticipant);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (a22 != null) {
                                    spannableStringBuilder.append(l10.j(a22, true), new o31(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(M0.title, new o31(org.telegram.messenger.g0.o()), 0);
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
            i11 = i3 + 1;
            j11 = j10;
        }
        boolean z12 = i12 != 0;
        boolean z13 = this.M;
        TextView textView = this.L;
        if (!z13 && z12) {
            z11 = false;
        } else {
            if (!z12 && z13) {
                this.M = z12;
                invalidate();
                return;
            }
            if (z13 && z12) {
                ai.c0 c0Var = this.J;
                this.Q = c0Var.getLeft();
                this.S = c0Var.getRight();
                this.R = textView.getLeft();
                this.P = 0.0f;
            }
            z11 = z10;
        }
        if (!z12) {
            this.M = z12;
            invalidate();
            return;
        }
        String K0 = bd.K0(i12, "MembersAreSpeakingToast");
        int indexOf = K0.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i12 != 0 ? i12 == 1 ? org.telegram.messenger.g0.L(40.0f) : i12 == 2 ? org.telegram.messenger.g0.L(64.0f) : org.telegram.messenger.g0.L(88.0f) : 0;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
        this.M = z12;
        invalidate();
        while (i12 < 3) {
            x8Var.b(i12, i10, null);
            i12++;
        }
        x8Var.a(z11);
    }
}
