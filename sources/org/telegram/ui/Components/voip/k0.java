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
import c8.ma;
import hi.l5;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.u10;
import org.telegram.ui.b20;
import org.telegram.ui.f40;
import org.telegram.ui.nk;
import org.telegram.ui.x10;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class k0 extends FrameLayout {
    public boolean A0;
    public boolean B0;
    public ValueAnimator C0;
    public long D0;
    public y E;
    public boolean E0;
    public y F;
    public float F0;
    public final RecyclerView G;
    public float G0;
    public final x10 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final ai.l0 J;
    public float J0;
    public final e9 K;
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
    public oi.c2 Q0;
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
    public final kr d0;
    public u3 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final l5 g0;
    public long h;
    public boolean h0;
    public final ik i0;
    public t3 j0;
    public final f40 k0;
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

    public k0(Context context, RecyclerView recyclerView, x10 x10Var, ArrayList arrayList, t3 t3Var, f40 f40Var) {
        super(context);
        this.x = new LongSparseIntArray();
        this.y = new h2.f((int[]) null);
        this.P = 1.0f;
        final int i7 = 1;
        this.W = true;
        final b20 b20Var = (b20) this;
        this.i0 = new ik(b20Var, 22);
        this.z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = recyclerView;
        this.H = x10Var;
        this.I = arrayList;
        this.j0 = t3Var;
        this.k0 = f40Var;
        kg.k kVar = new kg.k(context, 3);
        this.l0 = kVar;
        final int i10 = 0;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.a(-1);
        kVar.setImageDrawable(x1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(m6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, ks.z1)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, ma.c(120.0f, -1));
        View view2 = new View(context);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, ks.z1)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((t3Var == null || !h()) ? 8 : 0);
        addView(view2, ma.e(ks.q2, -1, 5));
        addView(kVar, ma.e(56, -1, 51));
        kVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        b20Var.R0.onBackPressed();
                        break;
                    default:
                        b20 b20Var2 = b20Var;
                        if (b20Var2.b) {
                            boolean z10 = !b20Var2.f;
                            b20Var2.f = z10;
                            b20Var2.d0.a(z10, true);
                            b20Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(2, context, b20Var);
        this.m0 = f0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = m6.k0(L, L, L, L, 0, o4, o4);
        l5 l5Var = new l5(b20Var, context, k02, 9);
        this.g0 = l5Var;
        l5Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        b20Var.R0.onBackPressed();
                        break;
                    default:
                        b20 b20Var2 = b20Var;
                        if (b20Var2.b) {
                            boolean z10 = !b20Var2.f;
                            b20Var2.f = z10;
                            b20Var2.d0.a(z10, true);
                            b20Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        k02.setCallback(l5Var);
        addView(l5Var);
        kr krVar = new kr(context, R.drawable.msg_pin_filled, -1);
        this.d0 = krVar;
        float f10 = -org.telegram.messenger.g0.L(1.0f);
        float L2 = org.telegram.messenger.g0.L(2.0f);
        float L3 = org.telegram.messenger.g0.L(1.0f);
        krVar.i = f10;
        krVar.j = L2;
        krVar.k = L3;
        krVar.invalidateSelf();
        f0Var.setImageDrawable(krVar);
        f0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(f0Var, ma.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.e0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setText(gd.N0(2131752587, null));
        TextView textView2 = new TextView(context);
        this.f0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(gd.N0(2131752586, null));
        addView(textView, ma.e(-2, -2, 51));
        addView(textView2, ma.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(gd.N0(2131754807, null));
        int L4 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L4, L4, L4, L4);
        imageView.setBackground(m6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new q31(3, b20Var, f40Var));
        addView(imageView, ma.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        ai.l0 l0Var = new ai.l0(b20Var, context, m6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(m6.x0(null, m6.kh, false), ks.i3)), 20);
        this.J = l0Var;
        e9 e9Var = new e9(context, true);
        this.K = e9Var;
        e9Var.setStyle(10);
        l0Var.setClipChildren(false);
        l0Var.setClipToPadding(false);
        l0Var.addView(e9Var, ma.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        l0Var.addView(textView3, ma.e(-2, -2, 16));
        addView(l0Var, ma.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        while (i10 < 2) {
            this.L0[i10] = new nk(b20Var, context);
            this.L0[i10].setHideAnimationType(2);
            this.L0[i10].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.L0[i10], ma.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
            i10++;
        }
        this.g0.setVisibility(8);
        setIsTablet(f40.F5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            f40 f40Var = ((b20) this).R0;
            if (f40Var.Z3 != null) {
                f40Var.y5.a(!r1.W, true);
            }
            ik ikVar = this.i0;
            if (!z10 || !this.b) {
                this.h0 = false;
                org.telegram.messenger.g0.r(ikVar);
            } else if (!this.h0) {
                this.h0 = true;
                org.telegram.messenger.g0.h3(ikVar, 3000L);
            }
            y yVar = this.E;
            if (yVar != null) {
                yVar.requestLayout();
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
            ofFloat.addUpdateListener(new g0(this, i7));
            this.K0.addListener(new j0(this, i10));
            ValueAnimator valueAnimator = this.K0;
            nr nrVar = nr.f;
            valueAnimator.setInterpolator(nrVar);
            this.K0.setDuration(z10 ? 350L : 200L);
            this.K0.setInterpolator(nrVar);
            y yVar = this.E;
            if (yVar != null) {
                u uVar = yVar.a;
                ValueAnimator valueAnimator2 = this.K0;
                if (uVar.F) {
                    uVar.H.add(valueAnimator2);
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
        y yVar = this.E;
        if (yVar != null) {
            if (yVar.p0 || yVar.q0 != 0.0f) {
                yVar.p0 = false;
                yVar.q0 = 0.0f;
                yVar.a.invalidate();
                yVar.invalidate();
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
        y yVar;
        x10 x10Var;
        y yVar2;
        y yVar3;
        UndoView[] undoViewArr;
        if (f40.F5) {
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
            boolean z10 = f40.F5;
            if (!z10 && (yVar = this.E) != null && !yVar.Q && yVar.c != null) {
                float f11 = 1.0f - f10;
                canvas.clipRect(0.0f, y10 * f11, getMeasuredWidth(), (getMeasuredHeight() * f10) + (measuredHeight * f11));
            } else if (z10) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            y yVar4 = this.F;
            if (yVar4 != null && yVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.F.getX(), this.F.getY());
                this.F.draw(canvas);
                canvas.restore();
            }
            y yVar5 = this.E;
            if (yVar5 != null && yVar5.getParent() != null) {
                if (this.E.getAlpha() != 1.0f) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(this.E.getX(), this.E.getY(), this.E.getX() + this.E.getMeasuredWidth(), this.E.getY() + this.E.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.E.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z11 = this.H0 || this.K0 != null;
                if (z11 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((f40.E5 || f40.F5) ? 0 : org.telegram.messenger.g0.L(90.0f)));
                }
                canvas.translate(this.E.getX(), this.E.getY());
                y yVar6 = this.E;
                float f12 = this.J0;
                if (yVar6.p0 != z11 || yVar6.q0 != f12) {
                    yVar6.p0 = z11;
                    yVar6.q0 = f12;
                    yVar6.a.invalidate();
                    yVar6.invalidate();
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
                float f13 = f40.E5 ? 0.0f : (1.0f - this.a0) * (-org.telegram.messenger.g0.L(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (f40.E5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i7].getX() - org.telegram.messenger.g0.L(8.0f), undoViewArr2[i7].getY() - org.telegram.messenger.g0.L(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i7].getX() - org.telegram.messenger.g0.L(8.0f), ((undoViewArr2[i7].getY() - (f40.E5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(26.0f));
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
        if (valueAnimator == null || (yVar2 = this.F) == null || (yVar3 = this.E) == null) {
            y yVar7 = this.E;
            if (yVar7 != null) {
                float f15 = 255.0f * f14;
                gradientDrawable2.setAlpha((int) ((1.0f - yVar7.b0) * f15));
                gradientDrawable.setAlpha((int) ((1.0f - this.E.b0) * f15));
            } else {
                int i10 = (int) (255.0f * f14);
                gradientDrawable2.setAlpha(i10);
                gradientDrawable.setAlpha(i10);
            }
        } else {
            boolean z12 = yVar2.a0;
            boolean z13 = yVar3.a0;
            int alpha = (int) ((z12 != z13 ? (!z13 ? 1.0f - yVar3.getAlpha() : yVar3.getAlpha()) * f14 : !z13 ? 0.0f : f14) * 255.0f);
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
            if (f40.E5) {
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
        kr krVar = this.d0;
        float f16 = krVar.g;
        float z14 = (com.google.android.gms.internal.vision.e2.z(1.0f, f16, measuredWidth2, measuredWidth4 * f16) - org.telegram.messenger.g0.L(21.0f)) - (f40.F5 ? org.telegram.messenger.g0.L(328.0f) : f40.E5 ? org.telegram.messenger.g0.L(180.0f) : 0);
        textView.setTranslationX(z14);
        textView2.setTranslationX(z14);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        l5 l5Var = this.g0;
        l5Var.setTranslationX(z14 - org.telegram.messenger.g0.L(36.0f));
        l5Var.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - l5Var.getMeasuredHeight()) / 2.0f);
        f0Var.setTranslationX(z14 - org.telegram.messenger.g0.L(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            l5Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - krVar.g) * f14);
            textView2.setAlpha(krVar.g * f14);
            l5Var.setAlpha(f14);
        }
        float f17 = this.P;
        ai.l0 l0Var = this.J;
        if (f17 != 1.0f) {
            float f18 = f17 + 0.07272727f;
            this.P = f18;
            if (f18 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            l0Var.invalidate();
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
                if (f40.E5) {
                    l0Var.setTranslationY((org.telegram.messenger.g0.L(8.0f) * this.a0) + ((1.0f - this.a0) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(8.0f));
                } else {
                    l0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f));
                }
                l0Var.setAlpha(this.O * this.c);
                l0Var.setScaleX((this.O * 0.5f) + 0.5f);
                l0Var.setScaleY((this.O * 0.5f) + 0.5f);
                if (f40.F5) {
                    super.dispatchDraw(canvas);
                } else {
                    this.V = true;
                    super.dispatchDraw(canvas);
                    this.V = false;
                }
                x10Var = this.H;
                if (x10Var.getVisibility() != 0) {
                    for (int i11 = 0; i11 < x10Var.getChildCount(); i11++) {
                        u10 u10Var = (u10) x10Var.getChildAt(i11);
                        if (u10Var.getVisibility() == 0 && u10Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(x10Var.getX() + u10Var.getX(), x10Var.getY() + u10Var.getY());
                            canvas.scale(u10Var.getScaleX(), u10Var.getScaleY(), u10Var.getMeasuredWidth() / 2.0f, u10Var.getMeasuredHeight() / 2.0f);
                            u10Var.c(canvas);
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
        if (f40.E5) {
        }
        l0Var.setAlpha(this.O * this.c);
        l0Var.setScaleX((this.O * 0.5f) + 0.5f);
        l0Var.setScaleY((this.O * 0.5f) + 0.5f);
        if (f40.F5) {
        }
        x10Var = this.H;
        if (x10Var.getVisibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = this.U;
        RecyclerView recyclerView = this.G;
        if (!z10) {
            UndoView[] undoViewArr = this.L0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof y) {
                    y yVar = (y) view;
                    if (yVar != this.E && yVar != this.F && !this.V && !yVar.z0) {
                        if (yVar.c == null) {
                            if (!f40.F5) {
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
                } else if (!this.T) {
                    return super.drawChild(canvas, view, j3);
                }
            }
        } else if ((view instanceof y) && ((y) view).z0) {
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
        ik ikVar = this.i0;
        if (z10) {
            org.telegram.messenger.g0.r(ikVar);
        }
        org.telegram.messenger.g0.h3(ikVar, 3000L);
        this.h0 = true;
    }

    public final void f(y yVar) {
        this.I.remove(yVar);
        long B1 = fj.B1(yVar.x.a.peer);
        this.x.put(B1, r2.get(B1, 0) - 1);
    }

    public final void g() {
        k0 k0Var;
        if (this.A0) {
            this.A0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C0 = ofFloat;
            k0Var = this;
            ofFloat.addUpdateListener(new h0(k0Var, this.z0, this.s0, this.t0, 0));
            k0Var.C0.addListener(new j0(this, 2));
            k0Var.C0.setDuration(350L);
            k0Var.C0.setInterpolator(nr.f);
            k0Var.C0.start();
            k0Var.h = System.currentTimeMillis();
        } else {
            k0Var = this;
        }
        k0Var.B0 = false;
        k0Var.u0 = false;
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
        t3 t3Var = this.j0;
        return t3Var != null && t3Var.b.rtmp_stream;
    }

    public abstract void i(boolean z10);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(u3 u3Var) {
        y yVar;
        y yVar2;
        u uVar;
        r rVar;
        u10 u10Var;
        r rVar2;
        u3 u3Var2;
        if (u3Var == null && this.e == null) {
            return;
        }
        if (u3Var == null || !u3Var.equals(this.e)) {
            long B1 = u3Var == null ? 0L : fj.B1(u3Var.a.peer);
            y yVar3 = this.E;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (yVar3 != null) {
                ArrayList arrayList = yVar3.n0;
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
            if (sharedInstance != null && (u3Var2 = this.e) != null) {
                sharedInstance.requestFullScreen(u3Var2.a, false, u3Var2.b);
            }
            this.e = u3Var;
            int i10 = 1;
            if (sharedInstance != null && u3Var != null) {
                sharedInstance.requestFullScreen(u3Var.a, true, u3Var.b);
            }
            this.d = B1;
            boolean z10 = this.b;
            this.h = System.currentTimeMillis();
            int i11 = 2;
            kg.k kVar = this.l0;
            f40 f40Var = this.k0;
            if (u3Var == null) {
                if (this.b) {
                    ValueAnimator valueAnimator2 = this.r;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.b = false;
                    y yVar4 = this.E;
                    if (yVar4.c != null || yVar4.d != null || yVar4.e != null) {
                        u3 u3Var3 = yVar4.x;
                        if (t3.C(u3Var3.a, u3Var3.b, this.j0)) {
                            this.E.h(false, true);
                        }
                    }
                    this.E.b(true);
                    r rVar3 = this.E.c;
                    if (rVar3 != null) {
                        rVar3.setRenderer(null);
                    }
                    u10 u10Var2 = this.E.d;
                    if (u10Var2 != null) {
                        u10Var2.setRenderer(null);
                    }
                    r rVar4 = this.E.e;
                    if (rVar4 != null) {
                        rVar4.setRenderer(null);
                    }
                    y yVar5 = this.E;
                    yVar5.animate().alpha(0.0f).setListener(new i0(this, yVar5, i11)).setDuration(350L).start();
                }
                kVar.setEnabled(false);
                this.f = false;
            } else {
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.I;
                    if (i12 >= arrayList2.size()) {
                        yVar = null;
                        break;
                    } else {
                        if (((y) arrayList2.get(i12)).x.equals(u3Var)) {
                            yVar = (y) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                Property property = View.ALPHA;
                kr krVar = this.d0;
                if (yVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        krVar.a(false, false);
                        this.E.b(false);
                        yVar.b(false);
                        if (!this.N0) {
                            y yVar6 = this.E;
                            if (yVar6.c != null || yVar6.d != null || yVar6.e != null) {
                                yVar2 = new y(this, this.j0, f40Var);
                                y yVar7 = this.E;
                                r rVar5 = yVar7.c;
                                u10 u10Var3 = yVar7.d;
                                r rVar6 = yVar7.e;
                                yVar2.c = rVar5;
                                yVar2.d = u10Var3;
                                yVar2.e = rVar6;
                                yVar2.g(this.b, false);
                                yVar2.j(false);
                                r rVar7 = this.E.c;
                                if (rVar7 != null) {
                                    rVar7.setRenderer(yVar2);
                                }
                                u10 u10Var4 = this.E.d;
                                if (u10Var4 != null) {
                                    u10Var4.setRenderer(yVar2);
                                }
                                r rVar8 = this.E.e;
                                if (rVar8 != null) {
                                    rVar8.setRenderer(yVar2);
                                }
                                y yVar8 = new y(this, this.j0, f40Var);
                                yVar8.x = yVar.x;
                                r rVar9 = yVar.c;
                                u10 u10Var5 = yVar.d;
                                r rVar10 = yVar.e;
                                yVar8.c = rVar9;
                                yVar8.d = u10Var5;
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
                                u10Var = yVar.d;
                                if (u10Var != null) {
                                    u10Var.setRenderer(yVar8);
                                }
                                rVar2 = yVar.e;
                                if (rVar2 != null) {
                                    rVar2.setRenderer(yVar8);
                                }
                                yVar8.F = true;
                                yVar8.setAlpha(0.0f);
                                this.F = this.E;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(yVar8, (Property<y, Float>) property, 0.0f, 1.0f);
                                this.O0 = ofFloat;
                                int i13 = 9;
                                ofFloat.addListener(new fi.a3(this, yVar8, yVar, i13));
                                if (yVar2 != null) {
                                    yVar2.setAlpha(0.0f);
                                    yVar2.setScaleX(0.5f);
                                    yVar2.setScaleY(0.5f);
                                    yVar2.F = true;
                                }
                                es0 es0Var = new es0(this, yVar, yVar2, i13);
                                if (uVar.d.isFirstFrameRendered()) {
                                    org.telegram.messenger.g0.h3(es0Var, 250L);
                                    yVar8.n0.add(es0Var);
                                } else {
                                    es0Var.run();
                                }
                                d();
                                this.E = yVar8;
                                yVar8.h(true, false);
                                l();
                            }
                        }
                        yVar2 = null;
                        y yVar82 = new y(this, this.j0, f40Var);
                        yVar82.x = yVar.x;
                        r rVar92 = yVar.c;
                        u10 u10Var52 = yVar.d;
                        r rVar102 = yVar.e;
                        yVar82.c = rVar92;
                        yVar82.d = u10Var52;
                        yVar82.e = rVar102;
                        yVar82.g(this.b, false);
                        yVar82.j(false);
                        uVar = yVar82.a;
                        uVar.d.setAlpha(1.0f);
                        uVar.e.setAlpha(1.0f);
                        rVar = yVar.c;
                        if (rVar != null) {
                        }
                        u10Var = yVar.d;
                        if (u10Var != null) {
                        }
                        rVar2 = yVar.e;
                        if (rVar2 != null) {
                        }
                        yVar82.F = true;
                        yVar82.setAlpha(0.0f);
                        this.F = this.E;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yVar82, (Property<y, Float>) property, 0.0f, 1.0f);
                        this.O0 = ofFloat2;
                        int i132 = 9;
                        ofFloat2.addListener(new fi.a3(this, yVar82, yVar, i132));
                        if (yVar2 != null) {
                        }
                        es0 es0Var2 = new es0(this, yVar, yVar2, i132);
                        if (uVar.d.isFirstFrameRendered()) {
                        }
                        d();
                        this.E = yVar82;
                        yVar82.h(true, false);
                        l();
                    } else {
                        this.b = true;
                        d();
                        this.E = yVar;
                        yVar.h(true, true);
                        invalidate();
                        krVar.a(this.f, false);
                    }
                } else if (this.b) {
                    y yVar9 = this.E;
                    if (yVar9.c == null) {
                        if (!((yVar9.d != null) | (yVar9.e != null))) {
                            yVar9.b(true);
                            y yVar10 = new y(this, this.j0, f40Var);
                            yVar10.x = u3Var;
                            yVar10.g(this.b, false);
                            yVar10.h(true, false);
                            yVar10.F = true;
                            yVar10.setAlpha(0.0f);
                            this.F = this.E;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.O0 = ofFloat3;
                            ofFloat3.addUpdateListener(new ch.w(17, this, yVar10));
                            this.O0.addListener(new i0(this, yVar10, objArr2 == true ? 1 : 0));
                            this.O0.start();
                            d();
                            this.E = yVar10;
                            yVar10.h(true, false);
                            this.E.j(false);
                            l();
                        }
                    }
                    yVar9.b(false);
                    y yVar11 = new y(this, this.j0, f40Var);
                    y yVar12 = this.E;
                    r rVar11 = yVar12.c;
                    u10 u10Var6 = yVar12.d;
                    r rVar12 = yVar12.e;
                    yVar11.c = rVar11;
                    yVar11.d = u10Var6;
                    yVar11.e = rVar12;
                    yVar11.g(this.b, false);
                    yVar11.j(false);
                    r rVar13 = this.E.c;
                    if (rVar13 != null) {
                        rVar13.setRenderer(yVar11);
                    }
                    u10 u10Var7 = this.E.d;
                    if (u10Var7 != null) {
                        u10Var7.setRenderer(yVar11);
                    }
                    r rVar14 = this.E.e;
                    if (rVar14 != null) {
                        rVar14.setRenderer(yVar11);
                    }
                    yVar11.setAlpha(0.0f);
                    yVar11.setScaleX(0.5f);
                    yVar11.setScaleY(0.5f);
                    yVar11.F = true;
                    fm0 fm0Var = new fm0(28, this, yVar11);
                    if (yVar11.a.d.isFirstFrameRendered()) {
                        fm0Var.run();
                    } else {
                        org.telegram.messenger.g0.h3(fm0Var, 250L);
                        yVar11.n0.add(fm0Var);
                    }
                    y yVar102 = new y(this, this.j0, f40Var);
                    yVar102.x = u3Var;
                    yVar102.g(this.b, false);
                    yVar102.h(true, false);
                    yVar102.F = true;
                    yVar102.setAlpha(0.0f);
                    this.F = this.E;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.O0 = ofFloat32;
                    ofFloat32.addUpdateListener(new ch.w(17, this, yVar102));
                    this.O0.addListener(new i0(this, yVar102, objArr2 == true ? 1 : 0));
                    this.O0.start();
                    d();
                    this.E = yVar102;
                    yVar102.h(true, false);
                    this.E.j(false);
                    l();
                } else {
                    this.b = true;
                    d();
                    y yVar13 = new y(this, this.j0, f40Var);
                    this.E = yVar13;
                    yVar13.x = u3Var;
                    yVar13.g(this.b, false);
                    this.E.h(true, false);
                    this.E.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E, (Property<y, Float>) property, 0.0f, 1.0f);
                    this.O0 = ofFloat4;
                    ofFloat4.addListener(new j0(this, objArr == true ? 1 : 0));
                    this.O0.start();
                    invalidate();
                    krVar.a(this.f, false);
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
                ofFloat5.addUpdateListener(new g0(this, i10));
                y yVar14 = this.E;
                yVar14.r = true;
                f40Var.getClass();
                this.M0 = this.H0;
                this.y.d();
                this.r.addListener(new i0(this, yVar14, i10));
                this.r.setInterpolator(nr.f);
                this.r.setDuration(350L);
                u uVar2 = this.E.a;
                ValueAnimator valueAnimator4 = this.r;
                if (uVar2.F) {
                    uVar2.H.add(valueAnimator4);
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
            if (fj.B1(((y) arrayList.get(i7)).x.a.peer) == fj.B1(groupCallParticipant.peer)) {
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
        boolean z10 = f40.F5;
        View view = this.n0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (f40.E5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : org.telegram.messenger.g0.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.o0.setVisibility((!f40.E5 || f40.F5) ? 8 : 0);
        l5 l5Var = this.g0;
        l5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i10);
        l5Var.getLayoutParams().width = org.telegram.messenger.g0.L(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).rightMargin = f40.E5 ? org.telegram.messenger.g0.L(45.0f) : 0;
        for (int i11 = 0; i11 < 2; i11++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L0[i11].getLayoutParams();
            if (this.N0) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(344.0f);
            } else {
                marginLayoutParams.rightMargin = f40.E5 ? org.telegram.messenger.g0.L(180.0f) : 0;
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
        f40 f40Var = this.k0;
        if ((z11 || this.H0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.I0 = false;
            if (this.H0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.J0) <= org.telegram.messenger.g0.L(120.0f)) {
                    b(false);
                } else {
                    f40Var.i1(null);
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
        y yVar = this.E;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        org.telegram.ui.ActionBar.n2 n2Var = yVar.O;
        Rect rect = yVar.C0;
        n2Var.getHitRect(rect);
        if (!rect.contains((int) x10, (int) y10)) {
            if (motionEvent.getActionMasked() == 0 && !this.H0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.E.getMeasuredWidth() + ((f40.E5 && this.W) ? -org.telegram.messenger.g0.L(90.0f) : 0), this.E.getMeasuredHeight() + ((f40.E5 || !this.W) ? 0 : -org.telegram.messenger.g0.L(90.0f)));
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
                    ai.l0 l0Var = this.J;
                    rectF2.set(l0Var.getX(), l0Var.getY(), l0Var.getX() + l0Var.getWidth(), l0Var.getY() + l0Var.getHeight());
                    if (this.j0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z12 = false;
                        z10 = false;
                        for (int i7 = 0; i7 < this.j0.f.size(); i7++) {
                            if (this.N == fj.B1(((u3) this.j0.f.get(i7)).a.peer)) {
                                f40Var.i1((u3) this.j0.f.get(i7));
                                z12 = true;
                                z10 = true;
                            }
                        }
                        if (!z12) {
                            f40Var.i1(new u3((TLRPC.GroupCallParticipant) this.j0.d.f(this.N), false));
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
                        m2 m2Var = this.E.a.d;
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        rectF3.set(m2Var.getX(), m2Var.getY(), m2Var.getX() + m2Var.getMeasuredWidth(), m2Var.getY() + m2Var.getMeasuredHeight());
                        rectF3.inset(((m2Var.getMeasuredHeight() * this.E.a.U) - m2Var.getMeasuredHeight()) / 2.0f, ((m2Var.getMeasuredWidth() * this.E.a.U) - m2Var.getMeasuredWidth()) / 2.0f);
                        if (f40.E5) {
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

    public void setGroupCall(t3 t3Var) {
        this.j0 = t3Var;
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
            y yVar = this.E;
            if (yVar != null) {
                yVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        e9 e9Var;
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
                oi.c2 c2Var = new oi.c2(this, 17);
                this.Q0 = c2Var;
                org.telegram.messenger.g0.h3(c2Var, (System.currentTimeMillis() - this.P0) + 50);
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
            e9Var = this.K;
            if (i11 >= m10) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.j0.P.f(this.j0.P.j(i11));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you) {
                i7 = i11;
                j3 = j10;
            } else {
                j3 = j10;
                if (fj.B1(this.e.a.peer) == fj.B1(groupCallParticipant.peer)) {
                    i7 = i11;
                } else {
                    long B1 = fj.B1(groupCallParticipant.peer);
                    i7 = i11;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j3) {
                        continue;
                    } else {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i12 == 0) {
                            this.N = fj.B1(groupCallParticipant.peer);
                        }
                        if (i12 < 3) {
                            TLRPC.User c22 = B1 > 0 ? mp.u1(i10).c2(Long.valueOf(B1)) : null;
                            TLRPC.Chat O0 = B1 <= 0 ? mp.u1(i10).O0(Long.valueOf(B1)) : null;
                            if (c22 != null || O0 != null) {
                                e9Var.b(i12, i10, groupCallParticipant);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (c22 != null) {
                                    spannableStringBuilder.append(o10.k(c22, true), new l41(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(O0.title, new l41(org.telegram.messenger.g0.o()), 0);
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
                ai.l0 l0Var = this.J;
                this.Q = l0Var.getLeft();
                this.S = l0Var.getRight();
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
        String K0 = gd.K0(i12, "MembersAreSpeakingToast");
        int indexOf = K0.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(K0);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i12 != 0 ? i12 == 1 ? org.telegram.messenger.g0.L(40.0f) : i12 == 2 ? org.telegram.messenger.g0.L(64.0f) : org.telegram.messenger.g0.L(88.0f) : 0;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(16.0f);
        this.M = z12;
        invalidate();
        while (i12 < 3) {
            e9Var.b(i12, i10, null);
            i12++;
        }
        e9Var.a(z11);
    }
}
