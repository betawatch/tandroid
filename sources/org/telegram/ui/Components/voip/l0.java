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
import c8.na;
import hi.w5;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.t3;
import org.telegram.messenger.u3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.s10;
import org.telegram.ui.a20;
import org.telegram.ui.e40;
import org.telegram.ui.nk;
import org.telegram.ui.w10;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
    public final w10 H;
    public boolean H0;
    public final ArrayList I;
    public boolean I0;
    public final ai.h0 J;
    public float J0;
    public final d9 K;
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
    public final hr d0;
    public u3 e;
    public final TextView e0;
    public boolean f;
    public final TextView f0;
    public final w5 g0;
    public long h;
    public boolean h0;
    public final rc i0;
    public t3 j0;
    public final e40 k0;
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

    public l0(Context context, RecyclerView recyclerView, w10 w10Var, ArrayList arrayList, t3 t3Var, e40 e40Var) {
        super(context);
        this.x = new LongSparseIntArray();
        this.y = new h2.f((int[]) null);
        this.P = 1.0f;
        final int i7 = 1;
        this.W = true;
        final a20 a20Var = (a20) this;
        this.i0 = new rc(a20Var, 25);
        this.z0 = 1.0f;
        this.L0 = new UndoView[2];
        this.G = recyclerView;
        this.H = w10Var;
        this.I = arrayList;
        this.j0 = t3Var;
        this.k0 = e40Var;
        kg.k kVar = new kg.k(context, 3);
        this.l0 = kVar;
        final int i10 = 0;
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(false);
        x1Var.a(-1);
        kVar.setImageDrawable(x1Var);
        kVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        kVar.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        kVar.setBackground(n6.h0(i0.a.o(-1, 55), 1, -1));
        View view = new View(context);
        this.n0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.a.o(-16777216, ks.z1)});
        this.b0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, na.c(120.0f, -1));
        View view2 = new View(context);
        this.o0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.a.o(-16777216, ks.z1)});
        this.c0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        view2.setVisibility((t3Var == null || !h()) ? 8 : 0);
        addView(view2, na.e(ks.q2, -1, 5));
        addView(kVar, na.e(56, -1, 51));
        kVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        a20Var.R0.onBackPressed();
                        break;
                    default:
                        a20 a20Var2 = a20Var;
                        if (a20Var2.b) {
                            boolean z10 = !a20Var2.f;
                            a20Var2.f = z10;
                            a20Var2.d0.a(z10, true);
                            a20Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f0 f0Var = new org.telegram.ui.ActionBar.f0(2, context, a20Var);
        this.m0 = f0Var;
        int L = org.telegram.messenger.g0.L(20.0f);
        int o4 = i0.a.o(-1, 100);
        org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, 0, o4, o4);
        w5 w5Var = new w5(a20Var, context, k02, 9);
        this.g0 = w5Var;
        w5Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i7) {
                    case 0:
                        a20Var.R0.onBackPressed();
                        break;
                    default:
                        a20 a20Var2 = a20Var;
                        if (a20Var2.b) {
                            boolean z10 = !a20Var2.f;
                            a20Var2.f = z10;
                            a20Var2.d0.a(z10, true);
                            a20Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        k02.setCallback(w5Var);
        addView(w5Var);
        hr hrVar = new hr(context, R.drawable.msg_pin_filled, -1);
        this.d0 = hrVar;
        float f10 = -org.telegram.messenger.g0.L(1.0f);
        float L2 = org.telegram.messenger.g0.L(2.0f);
        float L3 = org.telegram.messenger.g0.L(1.0f);
        hrVar.i = f10;
        hrVar.j = L2;
        hrVar.k = L3;
        hrVar.invalidateSelf();
        f0Var.setImageDrawable(hrVar);
        f0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        addView(f0Var, na.e(56, -1, 51));
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
        addView(textView, na.e(-2, -2, 51));
        addView(textView2, na.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(gd.N0(2131754807, null));
        int L4 = org.telegram.messenger.g0.L(4.0f);
        imageView.setPadding(L4, L4, L4, L4);
        imageView.setBackground(n6.h0(i0.a.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new p31(3, a20Var, e40Var));
        addView(imageView, na.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        ai.h0 h0Var = new ai.h0(a20Var, context, n6.d0(org.telegram.messenger.g0.L(18.0f), i0.a.o(n6.x0(null, n6.kh, false), ks.i3)), 20);
        this.J = h0Var;
        d9 d9Var = new d9(context, true);
        this.K = d9Var;
        d9Var.setStyle(10);
        h0Var.setClipChildren(false);
        h0Var.setClipToPadding(false);
        h0Var.addView(d9Var, na.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.L = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        h0Var.addView(textView3, na.e(-2, -2, 16));
        addView(h0Var, na.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        while (i10 < 2) {
            this.L0[i10] = new nk(a20Var, context);
            this.L0[i10].setHideAnimationType(2);
            this.L0[i10].setAdditionalTranslationY(org.telegram.messenger.g0.L(10.0f));
            addView(this.L0[i10], na.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
            i10++;
        }
        this.g0.setVisibility(8);
        setIsTablet(e40.F5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z10) {
        if (this.W != z10) {
            this.W = z10;
            e40 e40Var = ((a20) this).R0;
            if (e40Var.Z3 != null) {
                e40Var.y5.a(!r1.W, true);
            }
            rc rcVar = this.i0;
            if (!z10 || !this.b) {
                this.h0 = false;
                org.telegram.messenger.g0.r(rcVar);
            } else if (!this.h0) {
                this.h0 = true;
                org.telegram.messenger.g0.h3(rcVar, 3000L);
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
            kr krVar = kr.f;
            valueAnimator.setInterpolator(krVar);
            this.K0.setDuration(z10 ? 350L : 200L);
            this.K0.setInterpolator(krVar);
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
        w10 w10Var;
        z zVar2;
        z zVar3;
        UndoView[] undoViewArr;
        if (e40.F5) {
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
            boolean z10 = e40.F5;
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
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((e40.E5 || e40.F5) ? 0 : org.telegram.messenger.g0.L(90.0f)));
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
                float f13 = e40.E5 ? 0.0f : (1.0f - this.a0) * (-org.telegram.messenger.g0.L(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (e40.E5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(18.0f));
                if (this.N0) {
                    canvas.translate(undoViewArr2[i7].getX() - org.telegram.messenger.g0.L(8.0f), undoViewArr2[i7].getY() - org.telegram.messenger.g0.L(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i7].getX() - org.telegram.messenger.g0.L(8.0f), ((undoViewArr2[i7].getY() - (e40.E5 ? 0 : org.telegram.messenger.g0.L(90.0f))) + f13) - org.telegram.messenger.g0.L(26.0f));
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
            if (e40.E5) {
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
        hr hrVar = this.d0;
        float f16 = hrVar.g;
        float z14 = (com.google.android.gms.internal.vision.e2.z(1.0f, f16, measuredWidth2, measuredWidth4 * f16) - org.telegram.messenger.g0.L(21.0f)) - (e40.F5 ? org.telegram.messenger.g0.L(328.0f) : e40.E5 ? org.telegram.messenger.g0.L(180.0f) : 0);
        textView.setTranslationX(z14);
        textView2.setTranslationX(z14);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        w5 w5Var = this.g0;
        w5Var.setTranslationX(z14 - org.telegram.messenger.g0.L(36.0f));
        w5Var.setTranslationY((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w5Var.getMeasuredHeight()) / 2.0f);
        f0Var.setTranslationX(z14 - org.telegram.messenger.g0.L(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            w5Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - hrVar.g) * f14);
            textView2.setAlpha(hrVar.g * f14);
            w5Var.setAlpha(f14);
        }
        float f17 = this.P;
        ai.h0 h0Var = this.J;
        if (f17 != 1.0f) {
            float f18 = f17 + 0.07272727f;
            this.P = f18;
            if (f18 > 1.0f) {
                this.P = 1.0f;
            } else {
                invalidate();
            }
            h0Var.invalidate();
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
                if (e40.E5) {
                    h0Var.setTranslationY((org.telegram.messenger.g0.L(8.0f) * this.a0) + ((1.0f - this.a0) * org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) + org.telegram.messenger.g0.L(8.0f));
                } else {
                    h0Var.setTranslationY(org.telegram.messenger.g0.L(16.0f));
                }
                h0Var.setAlpha(this.O * this.c);
                h0Var.setScaleX((this.O * 0.5f) + 0.5f);
                h0Var.setScaleY((this.O * 0.5f) + 0.5f);
                if (e40.F5) {
                    super.dispatchDraw(canvas);
                } else {
                    this.V = true;
                    super.dispatchDraw(canvas);
                    this.V = false;
                }
                w10Var = this.H;
                if (w10Var.getVisibility() != 0) {
                    for (int i11 = 0; i11 < w10Var.getChildCount(); i11++) {
                        s10 s10Var = (s10) w10Var.getChildAt(i11);
                        if (s10Var.getVisibility() == 0 && s10Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(w10Var.getX() + s10Var.getX(), w10Var.getY() + s10Var.getY());
                            canvas.scale(s10Var.getScaleX(), s10Var.getScaleY(), s10Var.getMeasuredWidth() / 2.0f, s10Var.getMeasuredHeight() / 2.0f);
                            s10Var.c(canvas);
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
        if (e40.E5) {
        }
        h0Var.setAlpha(this.O * this.c);
        h0Var.setScaleX((this.O * 0.5f) + 0.5f);
        h0Var.setScaleY((this.O * 0.5f) + 0.5f);
        if (e40.F5) {
        }
        w10Var = this.H;
        if (w10Var.getVisibility() != 0) {
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
                            if (!e40.F5) {
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
        rc rcVar = this.i0;
        if (z10) {
            org.telegram.messenger.g0.r(rcVar);
        }
        org.telegram.messenger.g0.h3(rcVar, 3000L);
        this.h0 = true;
    }

    public final void f(z zVar) {
        this.I.remove(zVar);
        long B1 = fj.B1(zVar.x.a.peer);
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
            l0Var.C0.setInterpolator(kr.f);
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
        t3 t3Var = this.j0;
        return t3Var != null && t3Var.b.rtmp_stream;
    }

    public abstract void i(boolean z10);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(u3 u3Var) {
        z zVar;
        z zVar2;
        v vVar;
        s sVar;
        s10 s10Var;
        s sVar2;
        u3 u3Var2;
        if (u3Var == null && this.e == null) {
            return;
        }
        if (u3Var == null || !u3Var.equals(this.e)) {
            long B1 = u3Var == null ? 0L : fj.B1(u3Var.a.peer);
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
            e40 e40Var = this.k0;
            if (u3Var == null) {
                if (this.b) {
                    ValueAnimator valueAnimator2 = this.r;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.b = false;
                    z zVar4 = this.E;
                    if (zVar4.c != null || zVar4.d != null || zVar4.e != null) {
                        u3 u3Var3 = zVar4.x;
                        if (t3.C(u3Var3.a, u3Var3.b, this.j0)) {
                            this.E.h(false, true);
                        }
                    }
                    this.E.b(true);
                    s sVar3 = this.E.c;
                    if (sVar3 != null) {
                        sVar3.setRenderer(null);
                    }
                    s10 s10Var2 = this.E.d;
                    if (s10Var2 != null) {
                        s10Var2.setRenderer(null);
                    }
                    s sVar4 = this.E.e;
                    if (sVar4 != null) {
                        sVar4.setRenderer(null);
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
                        if (((z) arrayList2.get(i12)).x.equals(u3Var)) {
                            zVar = (z) arrayList2.get(i12);
                            break;
                        }
                        i12++;
                    }
                }
                Property property = View.ALPHA;
                hr hrVar = this.d0;
                if (zVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        hrVar.a(false, false);
                        this.E.b(false);
                        zVar.b(false);
                        if (!this.N0) {
                            z zVar6 = this.E;
                            if (zVar6.c != null || zVar6.d != null || zVar6.e != null) {
                                zVar2 = new z(this, this.j0, e40Var);
                                z zVar7 = this.E;
                                s sVar5 = zVar7.c;
                                s10 s10Var3 = zVar7.d;
                                s sVar6 = zVar7.e;
                                zVar2.c = sVar5;
                                zVar2.d = s10Var3;
                                zVar2.e = sVar6;
                                zVar2.g(this.b, false);
                                zVar2.j(false);
                                s sVar7 = this.E.c;
                                if (sVar7 != null) {
                                    sVar7.setRenderer(zVar2);
                                }
                                s10 s10Var4 = this.E.d;
                                if (s10Var4 != null) {
                                    s10Var4.setRenderer(zVar2);
                                }
                                s sVar8 = this.E.e;
                                if (sVar8 != null) {
                                    sVar8.setRenderer(zVar2);
                                }
                                z zVar8 = new z(this, this.j0, e40Var);
                                zVar8.x = zVar.x;
                                s sVar9 = zVar.c;
                                s10 s10Var5 = zVar.d;
                                s sVar10 = zVar.e;
                                zVar8.c = sVar9;
                                zVar8.d = s10Var5;
                                zVar8.e = sVar10;
                                zVar8.g(this.b, false);
                                zVar8.j(false);
                                vVar = zVar8.a;
                                vVar.d.setAlpha(1.0f);
                                vVar.e.setAlpha(1.0f);
                                sVar = zVar.c;
                                if (sVar != null) {
                                    sVar.setRenderer(zVar8);
                                }
                                s10Var = zVar.d;
                                if (s10Var != null) {
                                    s10Var.setRenderer(zVar8);
                                }
                                sVar2 = zVar.e;
                                if (sVar2 != null) {
                                    sVar2.setRenderer(zVar8);
                                }
                                zVar8.F = true;
                                zVar8.setAlpha(0.0f);
                                this.F = this.E;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zVar8, (Property<z, Float>) property, 0.0f, 1.0f);
                                this.O0 = ofFloat;
                                ofFloat.addListener(new fi.a3(this, zVar8, zVar, 9));
                                if (zVar2 != null) {
                                    zVar2.setAlpha(0.0f);
                                    zVar2.setScaleX(0.5f);
                                    zVar2.setScaleY(0.5f);
                                    zVar2.F = true;
                                }
                                as0 as0Var = new as0(this, zVar, zVar2, 10);
                                if (vVar.d.isFirstFrameRendered()) {
                                    org.telegram.messenger.g0.h3(as0Var, 250L);
                                    zVar8.n0.add(as0Var);
                                } else {
                                    as0Var.run();
                                }
                                d();
                                this.E = zVar8;
                                zVar8.h(true, false);
                                l();
                            }
                        }
                        zVar2 = null;
                        z zVar82 = new z(this, this.j0, e40Var);
                        zVar82.x = zVar.x;
                        s sVar92 = zVar.c;
                        s10 s10Var52 = zVar.d;
                        s sVar102 = zVar.e;
                        zVar82.c = sVar92;
                        zVar82.d = s10Var52;
                        zVar82.e = sVar102;
                        zVar82.g(this.b, false);
                        zVar82.j(false);
                        vVar = zVar82.a;
                        vVar.d.setAlpha(1.0f);
                        vVar.e.setAlpha(1.0f);
                        sVar = zVar.c;
                        if (sVar != null) {
                        }
                        s10Var = zVar.d;
                        if (s10Var != null) {
                        }
                        sVar2 = zVar.e;
                        if (sVar2 != null) {
                        }
                        zVar82.F = true;
                        zVar82.setAlpha(0.0f);
                        this.F = this.E;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(zVar82, (Property<z, Float>) property, 0.0f, 1.0f);
                        this.O0 = ofFloat2;
                        ofFloat2.addListener(new fi.a3(this, zVar82, zVar, 9));
                        if (zVar2 != null) {
                        }
                        as0 as0Var2 = new as0(this, zVar, zVar2, 10);
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
                        hrVar.a(this.f, false);
                    }
                } else if (this.b) {
                    z zVar9 = this.E;
                    if (zVar9.c == null) {
                        if (!((zVar9.d != null) | (zVar9.e != null))) {
                            zVar9.b(true);
                            z zVar10 = new z(this, this.j0, e40Var);
                            zVar10.x = u3Var;
                            zVar10.g(this.b, false);
                            zVar10.h(true, false);
                            zVar10.F = true;
                            zVar10.setAlpha(0.0f);
                            this.F = this.E;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.O0 = ofFloat3;
                            ofFloat3.addUpdateListener(new ch.w(17, this, zVar10));
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
                    z zVar11 = new z(this, this.j0, e40Var);
                    z zVar12 = this.E;
                    s sVar11 = zVar12.c;
                    s10 s10Var6 = zVar12.d;
                    s sVar12 = zVar12.e;
                    zVar11.c = sVar11;
                    zVar11.d = s10Var6;
                    zVar11.e = sVar12;
                    zVar11.g(this.b, false);
                    zVar11.j(false);
                    s sVar13 = this.E.c;
                    if (sVar13 != null) {
                        sVar13.setRenderer(zVar11);
                    }
                    s10 s10Var7 = this.E.d;
                    if (s10Var7 != null) {
                        s10Var7.setRenderer(zVar11);
                    }
                    s sVar14 = this.E.e;
                    if (sVar14 != null) {
                        sVar14.setRenderer(zVar11);
                    }
                    zVar11.setAlpha(0.0f);
                    zVar11.setScaleX(0.5f);
                    zVar11.setScaleY(0.5f);
                    zVar11.F = true;
                    o oVar = new o(i11, this, zVar11);
                    if (zVar11.a.d.isFirstFrameRendered()) {
                        oVar.run();
                    } else {
                        org.telegram.messenger.g0.h3(oVar, 250L);
                        zVar11.n0.add(oVar);
                    }
                    z zVar102 = new z(this, this.j0, e40Var);
                    zVar102.x = u3Var;
                    zVar102.g(this.b, false);
                    zVar102.h(true, false);
                    zVar102.F = true;
                    zVar102.setAlpha(0.0f);
                    this.F = this.E;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.O0 = ofFloat32;
                    ofFloat32.addUpdateListener(new ch.w(17, this, zVar102));
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
                    z zVar13 = new z(this, this.j0, e40Var);
                    this.E = zVar13;
                    zVar13.x = u3Var;
                    zVar13.g(this.b, false);
                    this.E.h(true, false);
                    this.E.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.E, (Property<z, Float>) property, 0.0f, 1.0f);
                    this.O0 = ofFloat4;
                    ofFloat4.addListener(new k0(this, objArr == true ? 1 : 0));
                    this.O0.start();
                    invalidate();
                    hrVar.a(this.f, false);
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
                e40Var.getClass();
                this.M0 = this.H0;
                this.y.d();
                this.r.addListener(new j0(this, zVar14, i10));
                this.r.setInterpolator(kr.f);
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
            if (fj.B1(((z) arrayList.get(i7)).x.a.peer) == fj.B1(groupCallParticipant.peer)) {
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
        boolean z10 = e40.F5;
        View view = this.n0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.g0.L(328.0f);
        } else if (e40.E5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : org.telegram.messenger.g0.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.o0.setVisibility((!e40.E5 || e40.F5) ? 8 : 0);
        w5 w5Var = this.g0;
        w5Var.getLayoutParams().height = org.telegram.messenger.g0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView = this.e0;
        textView.measure(makeMeasureSpec, i10);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0);
        TextView textView2 = this.f0;
        textView2.measure(makeMeasureSpec2, i10);
        w5Var.getLayoutParams().width = org.telegram.messenger.g0.L(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.J.getLayoutParams()).rightMargin = e40.E5 ? org.telegram.messenger.g0.L(45.0f) : 0;
        for (int i11 = 0; i11 < 2; i11++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.L0[i11].getLayoutParams();
            if (this.N0) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(344.0f);
            } else {
                marginLayoutParams.rightMargin = e40.E5 ? org.telegram.messenger.g0.L(180.0f) : 0;
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
        e40 e40Var = this.k0;
        if ((z11 || this.H0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.I0 = false;
            if (this.H0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.J0) <= org.telegram.messenger.g0.L(120.0f)) {
                    b(false);
                } else {
                    e40Var.i1(null);
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
        org.telegram.ui.ActionBar.n2 n2Var = zVar.O;
        Rect rect = zVar.C0;
        n2Var.getHitRect(rect);
        if (!rect.contains((int) x10, (int) y10)) {
            if (motionEvent.getActionMasked() == 0 && !this.H0) {
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), this.E.getMeasuredWidth() + ((e40.E5 && this.W) ? -org.telegram.messenger.g0.L(90.0f) : 0), this.E.getMeasuredHeight() + ((e40.E5 || !this.W) ? 0 : -org.telegram.messenger.g0.L(90.0f)));
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
                    ai.h0 h0Var = this.J;
                    rectF2.set(h0Var.getX(), h0Var.getY(), h0Var.getX() + h0Var.getWidth(), h0Var.getY() + h0Var.getHeight());
                    if (this.j0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z12 = false;
                        z10 = false;
                        for (int i7 = 0; i7 < this.j0.f.size(); i7++) {
                            if (this.N == fj.B1(((u3) this.j0.f.get(i7)).a.peer)) {
                                e40Var.i1((u3) this.j0.f.get(i7));
                                z12 = true;
                                z10 = true;
                            }
                        }
                        if (!z12) {
                            e40Var.i1(new u3((TLRPC.GroupCallParticipant) this.j0.d.f(this.N), false));
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
                        n2 n2Var2 = this.E.a.d;
                        RectF rectF3 = org.telegram.messenger.g0.P;
                        rectF3.set(n2Var2.getX(), n2Var2.getY(), n2Var2.getX() + n2Var2.getMeasuredWidth(), n2Var2.getY() + n2Var2.getMeasuredHeight());
                        rectF3.inset(((n2Var2.getMeasuredHeight() * this.E.a.U) - n2Var2.getMeasuredHeight()) / 2.0f, ((n2Var2.getMeasuredWidth() * this.E.a.U) - n2Var2.getMeasuredWidth()) / 2.0f);
                        if (e40.E5) {
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
            z zVar = this.E;
            if (zVar != null) {
                zVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        d9 d9Var;
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
            d9Var = this.K;
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
                                d9Var.b(i12, i10, groupCallParticipant);
                                if (i12 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (c22 != null) {
                                    spannableStringBuilder.append(n10.k(c22, true), new k41(org.telegram.messenger.g0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(O0.title, new k41(org.telegram.messenger.g0.o()), 0);
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
                ai.h0 h0Var = this.J;
                this.Q = h0Var.getLeft();
                this.S = h0Var.getRight();
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
            d9Var.b(i12, i10, null);
            i12++;
        }
        d9Var.a(z11);
    }
}
