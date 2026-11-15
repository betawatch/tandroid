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
import c8.ja;
import hi.n5;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.r3;
import org.telegram.messenger.s3;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.lv0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zj;
import org.telegram.ui.c40;
import org.telegram.ui.mk;
import org.telegram.ui.u10;
import org.telegram.ui.y10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class l0 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public z E;
    public boolean E0;
    public z F;
    public float F0;
    public final RecyclerView G;
    public float G0;
    public final u10 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final ai.k0 J;
    public float J0;
    public final w8 K;
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
    public org.telegram.ui.ActionBar.r0 Q0;
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
    public final br d0;
    public s3 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final n5 g0;
    public long h;
    public boolean h0;
    public final zj i0;
    public r3 j0;
    public final c40 k0;
    public final kg.k l0;
    public final org.telegram.ui.ActionBar.f0 m0;
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
    public final h2.f y;
    public int y0;
    public float z0;

    public l0(Context context, RecyclerView recyclerView, u10 u10Var, ArrayList arrayList, r3 r3Var, c40 c40Var) {
        super(context);
        this.x = new LongSparseIntArray();
        this.y = new h2.f((int[]) null);
        this.P = 1.0f;
        final int i7 = 1;
        this.W = true;
        final y10 y10Var = (y10) this;
        this.i0 = new zj(y10Var, 22);
        this.z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = recyclerView;
        this.H = u10Var;
        this.I = arrayList;
        this.j0 = r3Var;
        this.k0 = c40Var;
        kg.k kVar = new kg.k(context, 3);
        this.l0 = kVar;
        final int i10 = 0;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.a(-1);
        kVar.setImageDrawable(x1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(j6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, ns.z1)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ja.c(120.0f, -1));
        View view2 = new View(context);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, ns.z1)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((r3Var == null || !h()) ? 8 : 0);
        addView(view2, ja.e(ns.q2, -1, 5));
        addView(kVar, ja.e(56, -1, 51));
        kVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        y10Var.R0.onBackPressed();
                        break;
                    default:
                        y10 y10Var2 = y10Var;
                        if (y10Var2.b) {
                            boolean z10 = !y10Var2.f;
                            y10Var2.f = z10;
                            y10Var2.d0.a(z10, true);
                            y10Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(2, context, y10Var);
        this.m0 = f0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = j6.k0(L, L, L, L, 0, o4, o4);
        int i11 = 9;
        n5 n5Var = new n5(y10Var, context, k02, i11);
        this.g0 = n5Var;
        n5Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        y10Var.R0.onBackPressed();
                        break;
                    default:
                        y10 y10Var2 = y10Var;
                        if (y10Var2.b) {
                            boolean z10 = !y10Var2.f;
                            y10Var2.f = z10;
                            y10Var2.d0.a(z10, true);
                            y10Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        k02.setCallback(n5Var);
        addView(n5Var);
        br brVar = new br(context, R.drawable.msg_pin_filled, -1);
        this.d0 = brVar;
        float f10 = -org.telegram.messenger.g0.L(1.0f);
        float L2 = org.telegram.messenger.g0.L(2.0f);
        float L3 = org.telegram.messenger.g0.L(1.0f);
        brVar.i = f10;
        brVar.j = L2;
        brVar.k = L3;
        brVar.invalidateSelf();
        f0Var.setImageDrawable(brVar);
        f0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(f0Var, ja.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(hd.M0(2131752599, null));
        TextView textView2 = new TextView(context);
        this.f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(hd.M0(2131752598, null));
        addView(textView, ja.e(-2, -2, 51));
        addView(textView2, ja.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(hd.M0(2131754808, null));
        int L4 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L4, L4, L4, L4);
        imageView.setBackground(j6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new vv0(i11, y10Var, c40Var));
        addView(imageView, ja.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        ai.k0 k0Var = new ai.k0(y10Var, context, j6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(j6.x0(null, j6.kh, false), ns.i3)), 19);
        this.J = k0Var;
        w8 w8Var = new w8(context, true);
        this.K = w8Var;
        w8Var.setStyle(10);
        k0Var.setClipChildren(false);
        k0Var.setClipToPadding(false);
        k0Var.addView(w8Var, ja.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        k0Var.addView(textView3, ja.e(-2, -2, 16));
        addView(k0Var, ja.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        while (i10 < 2) {
            this.L0[i10] = new mk(y10Var, context);
            this.L0[i10].setHideAnimationType(2);
            this.L0[i10].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.L0[i10], ja.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
            i10++;
        }
        this.g0.setVisibility(8);
        setIsTablet(c40.F5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            c40 c40Var = ((y10) this).R0;
            if (c40Var.Z3 != null) {
                c40Var.y5.a(!r1.W, true);
            }
            zj zjVar = this.i0;
            if (!z10 || !this.b) {
                this.h0 = false;
                org.telegram.messenger.g0.r(zjVar);
            } else if (!this.h0) {
                this.h0 = true;
                org.telegram.messenger.g0.i3(zjVar, 3000L);
            }
            z zVar = this.E;
            if (zVar != null) {
                zVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        int i7 = 0;
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
            ofFloat.addUpdateListener(new h0(this, i7));
            this.K0.addListener(new k0(this, i10));
            ValueAnimator valueAnimator = this.K0;
            er erVar = er.f;
            valueAnimator.setInterpolator(erVar);
            this.K0.setDuration(z10 ? 350L : 200L);
            this.K0.setInterpolator(erVar);
            z zVar = this.E;
            if (zVar != null) {
                v vVar = zVar.a;
                ValueAnimator valueAnimator2 = this.K0;
                if (vVar.F) {
                    vVar.H.add(valueAnimator2);
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
        z zVar = this.E;
        if (zVar != null) {
            if (zVar.p0 || zVar.q0 != 0.0f) {
                zVar.p0 = false;
                zVar.q0 = 0.0f;
                zVar.a.invalidate();
                zVar.invalidate();
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
        z zVar;
        u10 u10Var;
        z zVar2;
        z zVar3;
        UndoView[] undoViewArr;
        if (c40.F5) {
            this.T = true;
            super.dispatchDraw(canvas);
            this.T = false;
        }
        this.U = true;
        super.dispatchDraw(canvas);
        this.U = false;
        if (this.F != null || this.E != null) {
            RecyclerView recyclerView = this.G;
            float y10 = recyclerView.getY() - getTop();
            float measuredHeight = (recyclerView.getMeasuredHeight() + y10) - recyclerView.getTranslationY();
            float f10 = this.c;
            canvas.save();
            boolean z10 = c40.F5;
            if (!z10 && (zVar = this.E) != null && !zVar.Q && zVar.c != null) {
                float f11 = 1.0f - f10;
                canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            } else if (z10) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z zVar4 = this.F;
            if (zVar4 != null && zVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.F.getX(), this.F.getY());
                this.F.draw(canvas);
                canvas.restore();
            }
            z zVar5 = this.E;
            if (zVar5 != null && zVar5.getParent() != null) {
                if (this.E.getAlpha() != 1.0f) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(this.E.getX(), this.E.getY(), this.E.getX() + this.E.getMeasuredWidth(), this.E.getY() + this.E.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.E.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z11 = this.H0 || this.K0 != null;
                if (z11 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((c40.E5 || c40.F5) ? 0 : org.telegram.messenger.g0.L(90.0f)));
                }
                canvas.translate(this.E.getX(), this.E.getY());
                z zVar6 = this.E;
                float f12 = this.J0;
                if (zVar6.p0 != z11 || zVar6.q0 != f12) {
                    zVar6.p0 = z11;
                    zVar6.q0 = f12;
                    zVar6.a.invalidate();
                    zVar6.invalidate();
                }
                this.E.i(this.z0, this.v0, this.w0, this.s0, this.t0, this.A0 || this.C0 != null);
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i7 = 0; i7 < 2; i7++) {
            UndoView[] undoViewArr2 = this.L0;
            if (undoViewArr2[i7].getVisibility() == 0) {
                canvas.save();
                float f13 = c40.E5 ? 0.0f : (1.0f - this.a0) * (-org.telegram.messenger.g0.L(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (c40.E5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i7].getX() - org.telegram.messenger.g0.L(8.0f), undoViewArr2[i7].getY() - org.telegram.messenger.g0.L(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i7].getX() - org.telegram.messenger.g0.L(8.0f), ((undoViewArr2[i7].getY() - (c40.E5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(26.0f));
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
        float f14 = (1.0f - this.a0) * this.c;
        ValueAnimator valueAnimator = this.O0;
        GradientDrawable gradientDrawable = this.c0;
        GradientDrawable gradientDrawable2 = this.b0;
        if (valueAnimator == null || (zVar2 = this.F) == null || (zVar3 = this.E) == null) {
            z zVar7 = this.E;
            if (zVar7 != null) {
                float f15 = 255.0f * f14;
                gradientDrawable2.setAlpha((int) ((1.0f - zVar7.b0) * f15));
                gradientDrawable.setAlpha((int) ((1.0f - this.E.b0) * f15));
            } else {
                int i10 = (int) (255.0f * f14);
                gradientDrawable2.setAlpha(i10);
                gradientDrawable.setAlpha(i10);
            }
        } else {
            boolean z12 = zVar2.a0;
            boolean z13 = zVar3.a0;
            int alpha = (int) ((z12 != z13 ? (!z13 ? 1.0f - zVar3.getAlpha() : zVar3.getAlpha()) * f14 : !z13 ? 0.0f : f14) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.l0.setAlpha(f14);
        boolean h = h();
        org.telegram.ui.ActionBar.f0 f0Var = this.m0;
        ImageView imageView = this.w;
        if (h) {
            f0Var.setAlpha(0.0f);
            f0Var.setVisibility(4);
            imageView.setAlpha(f14);
            imageView.setVisibility(0);
            if (c40.E5) {
                imageView.setTranslationX((1.0f - this.a0) * (-org.telegram.messenger.g0.L(72.0f)));
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
        TextView textView = this.e0;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.f0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - org.telegram.messenger.g0.L(1.0f);
        br brVar = this.d0;
        float f16 = brVar.g;
        float z14 = (com.google.android.gms.internal.vision.e2.z(1.0f, f16, measuredWidth2, measuredWidth4 * f16) - org.telegram.messenger.g0.L(21.0f)) - (c40.F5 ? org.telegram.messenger.g0.L(328.0f) : c40.E5 ? org.telegram.messenger.g0.L(180.0f) : 0);
        textView.setTranslationX(z14);
        textView2.setTranslationX(z14);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        n5 n5Var = this.g0;
        n5Var.setTranslationX(z14 - org.telegram.messenger.g0.L(36.0f));
        n5Var.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - n5Var.getMeasuredHeight()) / 2.0f);
        f0Var.setTranslationX(z14 - org.telegram.messenger.g0.L(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            n5Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - brVar.g) * f14);
            textView2.setAlpha(brVar.g * f14);
            n5Var.setAlpha(f14);
        }
        float f17 = this.P;
        ai.k0 k0Var = this.J;
        if (f17 != 1.0f) {
            float f18 = f17 + 0.07272727f;
            this.P = f18;
            if (f18 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            k0Var.invalidate();
        }
        boolean z15 = this.M;
        if (z15) {
            float f19 = this.O;
            if (f19 != 1.0f) {
                float f20 = f19 + 0.10666667f;
                this.O = f20;
                if (f20 > 1.0f) {
                    this.O = 1.0f;
                } else {
                    invalidate();
                }
                if (c40.E5) {
                    k0Var.setTranslationY((org.telegram.messenger.g0.L(8.0f) * this.a0) + ((1.0f - this.a0) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(8.0f));
                } else {
                    k0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f));
                }
                k0Var.setAlpha(this.O * this.c);
                k0Var.setScaleX((this.O * 0.5f) + 0.5f);
                k0Var.setScaleY((this.O * 0.5f) + 0.5f);
                if (c40.F5) {
                    super.dispatchDraw(canvas);
                } else {
                    this.V = true;
                    super.dispatchDraw(canvas);
                    this.V = false;
                }
                u10Var = this.H;
                if (u10Var.getVisibility() != 0) {
                    for (int i11 = 0; i11 < u10Var.getChildCount(); i11++) {
                        k10 k10Var = (k10) u10Var.getChildAt(i11);
                        if (k10Var.getVisibility() == 0 && k10Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(u10Var.getX() + k10Var.getX(), u10Var.getY() + k10Var.getY());
                            canvas.scale(k10Var.getScaleX(), k10Var.getScaleY(), k10Var.getMeasuredWidth() / 2.0f, k10Var.getMeasuredHeight() / 2.0f);
                            k10Var.c(canvas);
                            canvas.restore();
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (!z15) {
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
        if (c40.E5) {
        }
        k0Var.setAlpha(this.O * this.c);
        k0Var.setScaleX((this.O * 0.5f) + 0.5f);
        k0Var.setScaleY((this.O * 0.5f) + 0.5f);
        if (c40.F5) {
        }
        u10Var = this.H;
        if (u10Var.getVisibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = this.U;
        RecyclerView recyclerView = this.G;
        if (!z10) {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof z) {
                    z zVar = (z) view;
                    if (zVar != this.E && zVar != this.F && !this.V && !zVar.z0) {
                        if (zVar.c == null) {
                            if (!c40.F5) {
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
                        if (zVar.d == null) {
                            f10 = 0.0f;
                        }
                        canvas.save();
                        float f11 = 1.0f - f10;
                        canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                } else if (!this.T) {
                    return super.drawChild(canvas, view, j3);
                }
            }
        } else if ((view instanceof z) && ((z) view).z0) {
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
        boolean z10 = this.h0;
        zj zjVar = this.i0;
        if (z10) {
            org.telegram.messenger.g0.r(zjVar);
        }
        org.telegram.messenger.g0.i3(zjVar, 3000L);
        this.h0 = true;
    }

    public final void f(z zVar) {
        this.I.remove(zVar);
        long B1 = gj.B1(zVar.x.a.peer);
        this.x.put(B1, r2.get(B1, 0) - 1);
    }

    public final void g() {
        l0 l0Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            l0Var = this;
            ofFloat.addUpdateListener(new i0(l0Var, this.z0, this.s0, this.t0, 0));
            l0Var.C0.addListener(new k0(this, 2));
            l0Var.C0.setDuration(350L);
            l0Var.C0.setInterpolator(er.f);
            l0Var.C0.start();
            l0Var.h = System.currentTimeMillis();
        } else {
            l0Var = this;
        }
        l0Var.B0 = false;
        l0Var.u0 = false;
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
        z zVar;
        z zVar2;
        v vVar;
        r rVar;
        k10 k10Var;
        r rVar2;
        s3 s3Var2;
        if (s3Var == null && this.e == null) {
            return;
        }
        if (s3Var == null || !s3Var.equals(this.e)) {
            long B1 = s3Var == null ? 0L : gj.B1(s3Var.a.peer);
            z zVar3 = this.E;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (zVar3 != null) {
                ArrayList arrayList = zVar3.n0;
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((Runnable) arrayList.get(i7)).run();
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
            this.d = B1;
            boolean z10 = this.b;
            this.h = System.currentTimeMillis();
            int i11 = 2;
            kg.k kVar = this.l0;
            c40 c40Var = this.k0;
            if (s3Var == null) {
                if (this.b) {
                    ValueAnimator valueAnimator2 = this.r;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.b = false;
                    z zVar4 = this.E;
                    if (zVar4.c != null || zVar4.d != null || zVar4.e != null) {
                        s3 s3Var3 = zVar4.x;
                        if (r3.C(s3Var3.a, s3Var3.b, this.j0)) {
                            this.E.h(false, true);
                        }
                    }
                    this.E.b(true);
                    r rVar3 = this.E.c;
                    if (rVar3 != null) {
                        rVar3.setRenderer(null);
                    }
                    k10 k10Var2 = this.E.d;
                    if (k10Var2 != null) {
                        k10Var2.setRenderer(null);
                    }
                    r rVar4 = this.E.e;
                    if (rVar4 != null) {
                        rVar4.setRenderer(null);
                    }
                    z zVar5 = this.E;
                    zVar5.animate().alpha(0.0f).setListener(new j0(this, zVar5, i11)).setDuration(350L).start();
                }
                kVar.setEnabled(false);
                this.f = false;
            } else {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.I;
                    if (i12 >= arrayList2.size()) {
                        zVar = null;
                        break;
                    } else {
                        if (((z) arrayList2.get(i12)).x.equals(s3Var)) {
                            zVar = (z) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                Property property = View.ALPHA;
                br brVar = this.d0;
                if (zVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        brVar.a(false, false);
                        this.E.b(false);
                        zVar.b(false);
                        if (!this.N0) {
                            z zVar6 = this.E;
                            if (zVar6.c != null || zVar6.d != null || zVar6.e != null) {
                                zVar2 = new z(this, this.j0, c40Var);
                                z zVar7 = this.E;
                                r rVar5 = zVar7.c;
                                k10 k10Var3 = zVar7.d;
                                r rVar6 = zVar7.e;
                                zVar2.c = rVar5;
                                zVar2.d = k10Var3;
                                zVar2.e = rVar6;
                                zVar2.g(this.b, false);
                                zVar2.j(false);
                                r rVar7 = this.E.c;
                                if (rVar7 != null) {
                                    rVar7.setRenderer(zVar2);
                                }
                                k10 k10Var4 = this.E.d;
                                if (k10Var4 != null) {
                                    k10Var4.setRenderer(zVar2);
                                }
                                r rVar8 = this.E.e;
                                if (rVar8 != null) {
                                    rVar8.setRenderer(zVar2);
                                }
                                z zVar8 = new z(this, this.j0, c40Var);
                                zVar8.x = zVar.x;
                                r rVar9 = zVar.c;
                                k10 k10Var5 = zVar.d;
                                r rVar10 = zVar.e;
                                zVar8.c = rVar9;
                                zVar8.d = k10Var5;
                                zVar8.e = rVar10;
                                zVar8.g(this.b, false);
                                zVar8.j(false);
                                vVar = zVar8.a;
                                vVar.d.setAlpha(1.0f);
                                vVar.e.setAlpha(1.0f);
                                rVar = zVar.c;
                                if (rVar != null) {
                                    rVar.setRenderer(zVar8);
                                }
                                k10Var = zVar.d;
                                if (k10Var != null) {
                                    k10Var.setRenderer(zVar8);
                                }
                                rVar2 = zVar.e;
                                if (rVar2 != null) {
                                    rVar2.setRenderer(zVar8);
                                }
                                zVar8.F = true;
                                zVar8.setAlpha(0.0f);
                                this.F = this.E;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zVar8, (Property<z, Float>) property, 0.0f, 1.0f);
                                this.O0 = ofFloat;
                                ofFloat.addListener(new fi.c3(this, zVar8, zVar, 9));
                                if (zVar2 != null) {
                                    zVar2.setAlpha(0.0f);
                                    zVar2.setScaleX(0.5f);
                                    zVar2.setScaleY(0.5f);
                                    zVar2.F = true;
                                }
                                lv0 lv0Var = new lv0(this, zVar, zVar2, 5);
                                if (vVar.d.isFirstFrameRendered()) {
                                    org.telegram.messenger.g0.i3(lv0Var, 250L);
                                    zVar8.n0.add(lv0Var);
                                } else {
                                    lv0Var.run();
                                }
                                d();
                                this.E = zVar8;
                                zVar8.h(true, false);
                                l();
                            }
                        }
                        zVar2 = null;
                        z zVar82 = new z(this, this.j0, c40Var);
                        zVar82.x = zVar.x;
                        r rVar92 = zVar.c;
                        k10 k10Var52 = zVar.d;
                        r rVar102 = zVar.e;
                        zVar82.c = rVar92;
                        zVar82.d = k10Var52;
                        zVar82.e = rVar102;
                        zVar82.g(this.b, false);
                        zVar82.j(false);
                        vVar = zVar82.a;
                        vVar.d.setAlpha(1.0f);
                        vVar.e.setAlpha(1.0f);
                        rVar = zVar.c;
                        if (rVar != null) {
                        }
                        k10Var = zVar.d;
                        if (k10Var != null) {
                        }
                        rVar2 = zVar.e;
                        if (rVar2 != null) {
                        }
                        zVar82.F = true;
                        zVar82.setAlpha(0.0f);
                        this.F = this.E;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zVar82, (Property<z, Float>) property, 0.0f, 1.0f);
                        this.O0 = ofFloat2;
                        ofFloat2.addListener(new fi.c3(this, zVar82, zVar, 9));
                        if (zVar2 != null) {
                        }
                        lv0 lv0Var2 = new lv0(this, zVar, zVar2, 5);
                        if (vVar.d.isFirstFrameRendered()) {
                        }
                        d();
                        this.E = zVar82;
                        zVar82.h(true, false);
                        l();
                    } else {
                        this.b = true;
                        d();
                        this.E = zVar;
                        zVar.h(true, true);
                        invalidate();
                        brVar.a(this.f, false);
                    }
                } else if (this.b) {
                    z zVar9 = this.E;
                    if (zVar9.c == null) {
                        if (!((zVar9.d != null) | (zVar9.e != null))) {
                            zVar9.b(true);
                            z zVar10 = new z(this, this.j0, c40Var);
                            zVar10.x = s3Var;
                            zVar10.g(this.b, false);
                            zVar10.h(true, false);
                            zVar10.F = true;
                            zVar10.setAlpha(0.0f);
                            this.F = this.E;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.O0 = ofFloat3;
                            ofFloat3.addUpdateListener(new ch.v(17, this, zVar10));
                            this.O0.addListener(new j0(this, zVar10, objArr2 == true ? 1 : 0));
                            this.O0.start();
                            d();
                            this.E = zVar10;
                            zVar10.h(true, false);
                            this.E.j(false);
                            l();
                        }
                    }
                    zVar9.b(false);
                    z zVar11 = new z(this, this.j0, c40Var);
                    z zVar12 = this.E;
                    r rVar11 = zVar12.c;
                    k10 k10Var6 = zVar12.d;
                    r rVar12 = zVar12.e;
                    zVar11.c = rVar11;
                    zVar11.d = k10Var6;
                    zVar11.e = rVar12;
                    zVar11.g(this.b, false);
                    zVar11.j(false);
                    r rVar13 = this.E.c;
                    if (rVar13 != null) {
                        rVar13.setRenderer(zVar11);
                    }
                    k10 k10Var7 = this.E.d;
                    if (k10Var7 != null) {
                        k10Var7.setRenderer(zVar11);
                    }
                    r rVar14 = this.E.e;
                    if (rVar14 != null) {
                        rVar14.setRenderer(zVar11);
                    }
                    zVar11.setAlpha(0.0f);
                    zVar11.setScaleX(0.5f);
                    zVar11.setScaleY(0.5f);
                    zVar11.F = true;
                    u uVar = new u(this, zVar11);
                    if (zVar11.a.d.isFirstFrameRendered()) {
                        uVar.run();
                    } else {
                        org.telegram.messenger.g0.i3(uVar, 250L);
                        zVar11.n0.add(uVar);
                    }
                    z zVar102 = new z(this, this.j0, c40Var);
                    zVar102.x = s3Var;
                    zVar102.g(this.b, false);
                    zVar102.h(true, false);
                    zVar102.F = true;
                    zVar102.setAlpha(0.0f);
                    this.F = this.E;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.O0 = ofFloat32;
                    ofFloat32.addUpdateListener(new ch.v(17, this, zVar102));
                    this.O0.addListener(new j0(this, zVar102, objArr2 == true ? 1 : 0));
                    this.O0.start();
                    d();
                    this.E = zVar102;
                    zVar102.h(true, false);
                    this.E.j(false);
                    l();
                } else {
                    this.b = true;
                    d();
                    z zVar13 = new z(this, this.j0, c40Var);
                    this.E = zVar13;
                    zVar13.x = s3Var;
                    zVar13.g(this.b, false);
                    this.E.h(true, false);
                    this.E.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E, (Property<z, Float>) property, 0.0f, 1.0f);
                    this.O0 = ofFloat4;
                    ofFloat4.addListener(new k0(this, objArr == true ? 1 : 0));
                    this.O0.start();
                    invalidate();
                    brVar.a(this.f, false);
                }
                kVar.setEnabled(true);
            }
            boolean z11 = this.b;
            if (z10 != z11) {
                if (z11) {
                    kVar.setVisibility(0);
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
                ofFloat5.addUpdateListener(new h0(this, i10));
                z zVar14 = this.E;
                zVar14.r = true;
                c40Var.getClass();
                this.M0 = this.H0;
                this.y.d();
                this.r.addListener(new j0(this, zVar14, i10));
                this.r.setInterpolator(er.f);
                this.r.setDuration(350L);
                v vVar2 = this.E.a;
                ValueAnimator valueAnimator4 = this.r;
                if (vVar2.F) {
                    vVar2.H.add(valueAnimator4);
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
            ArrayList arrayList = this.I;
            if (i7 >= arrayList.size()) {
                return;
            }
            if (gj.B1(((z) arrayList.get(i7)).x.a.peer) == gj.B1(groupCallParticipant.peer)) {
                ((z) arrayList.get(i7)).setAmplitude(f10);
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
        boolean z10 = c40.F5;
        View view = this.n0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (c40.E5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : org.telegram.messenger.g0.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.o0.setVisibility((!c40.E5 || c40.F5) ? 8 : 0);
        n5 n5Var = this.g0;
        n5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i10);
        n5Var.getLayoutParams().width = org.telegram.messenger.g0.L(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).rightMargin = c40.E5 ? org.telegram.messenger.g0.L(45.0f) : 0;
        for (int i11 = 0; i11 < 2; i11++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L0[i11].getLayoutParams();
            if (this.N0) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(344.0f);
            } else {
                marginLayoutParams.rightMargin = c40.E5 ? org.telegram.messenger.g0.L(180.0f) : 0;
            }
        }
        super.onMeasure(i7, i10);
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
        c40 c40Var = this.k0;
        if ((z11 || this.H0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.I0 = false;
            if (this.H0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.J0) <= org.telegram.messenger.g0.L(120.0f)) {
                    b(false);
                } else {
                    c40Var.h1(null);
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
        z zVar = this.E;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.ActionBar.l2 l2Var = zVar.O;
        Rect rect = zVar.C0;
        l2Var.getHitRect(rect);
        if (!rect.contains((int) x10, (int) y10)) {
            if (motionEvent.getActionMasked() == 0 && !this.H0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.E.getMeasuredWidth() + ((c40.E5 && this.W) ? -org.telegram.messenger.g0.L(90.0f) : 0), this.E.getMeasuredHeight() + ((c40.E5 || !this.W) ? 0 : -org.telegram.messenger.g0.L(90.0f)));
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
                    ai.k0 k0Var = this.J;
                    rectF2.set(k0Var.getX(), k0Var.getY(), k0Var.getX() + k0Var.getWidth(), k0Var.getY() + k0Var.getHeight());
                    if (this.j0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z12 = false;
                        z10 = false;
                        for (int i7 = 0; i7 < this.j0.f.size(); i7++) {
                            if (this.N == gj.B1(((s3) this.j0.f.get(i7)).a.peer)) {
                                c40Var.h1((s3) this.j0.f.get(i7));
                                z12 = true;
                                z10 = true;
                            }
                        }
                        if (!z12) {
                            c40Var.h1(new s3((TLRPC.GroupCallParticipant) this.j0.d.f(this.N), false));
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
                        n2 n2Var = this.E.a.d;
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        rectF3.set(n2Var.getX(), n2Var.getY(), n2Var.getX() + n2Var.getMeasuredWidth(), n2Var.getY() + n2Var.getMeasuredHeight());
                        rectF3.inset(((n2Var.getMeasuredHeight() * this.E.a.U) - n2Var.getMeasuredHeight()) / 2.0f, ((n2Var.getMeasuredWidth() * this.E.a.U) - n2Var.getMeasuredWidth()) / 2.0f);
                        if (c40.E5) {
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
                        float y11 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.w0 = y11;
                        this.q0 = y11;
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
                        float y12 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                        this.w0 = y12;
                        this.q0 = y12;
                        this.z0 = 1.0f;
                        this.s0 = 0.0f;
                        this.t0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.A0 = true;
                        this.u0 = true;
                    }
                    float x13 = (motionEvent.getX(i11) + motionEvent.getX(i10)) / 2.0f;
                    float y13 = (motionEvent.getY(i11) + motionEvent.getY(i10)) / 2.0f;
                    float f11 = this.p0 - x13;
                    float f12 = this.q0 - y13;
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
            kg.k kVar = this.l0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kVar.getLayoutParams();
            layoutParams.gravity = z10 ? 85 : 51;
            layoutParams.rightMargin = z10 ? org.telegram.messenger.g0.L(328.0f) : 0;
            layoutParams.bottomMargin = z10 ? -org.telegram.messenger.g0.L(8.0f) : 0;
            if (this.N0) {
                kVar.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
            x1Var.a(-1);
            kVar.setImageDrawable(x1Var);
        }
    }

    public void setProgressToHideUi(float f10) {
        if (this.a0 != f10) {
            this.a0 = f10;
            invalidate();
            z zVar = this.E;
            if (zVar != null) {
                zVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        w8 w8Var;
        boolean z11;
        int i7;
        long j3;
        if (!this.b || this.N0 || this.e == null || this.r != null || this.j0 == null) {
            if (this.M) {
                this.M = false;
                this.O = 0.0f;
                return;
            }
            return;
        }
        int i10 = this.k0.a;
        long j10 = 500;
        if (System.currentTimeMillis() - this.P0 < 500) {
            if (this.Q0 == null) {
                org.telegram.ui.ActionBar.r0 r0Var = new org.telegram.ui.ActionBar.r0(this, 14);
                this.Q0 = r0Var;
                org.telegram.messenger.g0.i3(r0Var, (System.currentTimeMillis() - this.P0) + 50);
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
            w8Var = this.K;
            if (i11 >= m10) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.j0.P.f(this.j0.P.j(i11));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you) {
                i7 = i11;
                j3 = j10;
            } else {
                j3 = j10;
                if (gj.B1(this.e.a.peer) == gj.B1(groupCallParticipant.peer)) {
                    i7 = i11;
                } else {
                    long B1 = gj.B1(groupCallParticipant.peer);
                    i7 = i11;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j3) {
                        continue;
                    } else {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i12 == 0) {
                            this.N = gj.B1(groupCallParticipant.peer);
                        }
                        if (i12 < 3) {
                            TLRPC.User a22 = B1 > 0 ? np.s1(i10).a2(Long.valueOf(B1)) : null;
                            TLRPC.Chat M0 = B1 <= 0 ? np.s1(i10).M0(Long.valueOf(B1)) : null;
                            if (a22 != null || M0 != null) {
                                w8Var.b(i12, i10, groupCallParticipant);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (a22 != null) {
                                    spannableStringBuilder.append(q10.j(a22, true), new y31(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(M0.title, new y31(org.telegram.messenger.g0.o()), 0);
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
                ai.k0 k0Var = this.J;
                this.Q = k0Var.getLeft();
                this.S = k0Var.getRight();
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
        String K0 = hd.K0(i12, "MembersAreSpeakingToast");
        int indexOf = K0.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i12 != 0 ? i12 == 1 ? org.telegram.messenger.g0.L(40.0f) : i12 == 2 ? org.telegram.messenger.g0.L(64.0f) : org.telegram.messenger.g0.L(88.0f) : 0;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
        this.M = z12;
        invalidate();
        while (i12 < 3) {
            w8Var.b(i12, i10, null);
            i12++;
        }
        w8Var.a(z11);
    }
}
