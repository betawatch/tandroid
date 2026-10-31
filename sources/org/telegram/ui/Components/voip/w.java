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
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u3;
import org.telegram.messenger.v3;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.ew;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.x41;
import org.telegram.ui.Components.y10;
import org.telegram.ui.b50;
import org.telegram.ui.il;
import org.telegram.ui.u20;
import org.telegram.ui.y20;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class w extends FrameLayout {
    public boolean A0;
    public ValueAnimator B0;
    public long C0;
    public r D;
    public boolean D0;
    public r E;
    public float E0;
    public final RecyclerView F;
    public float F0;
    public final u20 G;
    public boolean G0;
    public final ArrayList H;
    public boolean H0;
    public final fg.i I;
    public float I0;
    public final u8 J;
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
    public w5 P0;
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
    public final dr c0;
    public long d;
    public final TextView d0;
    public v3 e;
    public final TextView e0;
    public boolean f;
    public final kg.f0 f0;
    public boolean g0;
    public long h;
    public final ew h0;
    public u3 i0;
    public final b50 j0;
    public final ag.r k0;
    public final org.telegram.ui.ActionBar.g0 l0;
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
    public final e2.f y;
    public float y0;
    public boolean z0;

    public w(Context context, RecyclerView recyclerView, u20 u20Var, ArrayList arrayList, u3 u3Var, b50 b50Var) {
        super(context);
        this.x = new LongSparseIntArray();
        this.y = new e2.f(null);
        this.O = 1.0f;
        final int i10 = 1;
        this.V = true;
        final y20 y20Var = (y20) this;
        this.h0 = new ew(y20Var, 16);
        this.y0 = 1.0f;
        this.K0 = new UndoView[2];
        this.F = recyclerView;
        this.G = u20Var;
        this.H = arrayList;
        this.i0 = u3Var;
        this.j0 = b50Var;
        ag.r rVar = new ag.r(context, 4);
        this.k0 = rVar;
        final int i11 = 0;
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
        c2Var.a(-1);
        rVar.setImageDrawable(c2Var);
        rVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        rVar.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        rVar.setBackground(t6.h0(i0.b.o(-1, 55), 1, -1));
        View view = new View(context);
        this.m0 = view;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{0, i0.b.o(-16777216, zs.z1)});
        this.a0 = gradientDrawable;
        view.setBackground(gradientDrawable);
        addView(view, b6.c(120.0f, -1));
        View view2 = new View(context);
        this.n0 = view2;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, i0.b.o(-16777216, zs.z1)});
        this.b0 = gradientDrawable2;
        view2.setBackground(gradientDrawable2);
        int i12 = 8;
        view2.setVisibility((u3Var == null || !h()) ? 8 : 0);
        addView(view2, b6.e(zs.q2, -1, 5));
        addView(rVar, b6.e(56, -1, 51));
        rVar.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i11) {
                    case 0:
                        y20Var.Q0.onBackPressed();
                        break;
                    default:
                        y20 y20Var2 = y20Var;
                        if (y20Var2.b) {
                            boolean z10 = !y20Var2.f;
                            y20Var2.f = z10;
                            y20Var2.c0.a(z10, true);
                            y20Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g0 g0Var = new org.telegram.ui.ActionBar.g0(y20Var, context, 2);
        this.l0 = g0Var;
        int L = org.telegram.messenger.i0.L(20.0f);
        int o10 = i0.b.o(-1, 100);
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, 0, o10, o10);
        kg.f0 f0Var = new kg.f0(y20Var, context, k02, i12);
        this.f0 = f0Var;
        f0Var.setOnClickListener(new View.OnClickListener() { // from class: org.telegram.ui.Components.voip.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i10) {
                    case 0:
                        y20Var.Q0.onBackPressed();
                        break;
                    default:
                        y20 y20Var2 = y20Var;
                        if (y20Var2.b) {
                            boolean z10 = !y20Var2.f;
                            y20Var2.f = z10;
                            y20Var2.c0.a(z10, true);
                            y20Var2.requestLayout();
                            break;
                        }
                        break;
                }
            }
        });
        k02.setCallback(f0Var);
        addView(f0Var);
        dr drVar = new dr(context, R.drawable.msg_pin_filled, -1);
        this.c0 = drVar;
        float f7 = -org.telegram.messenger.i0.L(1.0f);
        float L2 = org.telegram.messenger.i0.L(2.0f);
        float L3 = org.telegram.messenger.i0.L(1.0f);
        drVar.i = f7;
        drVar.j = L2;
        drVar.k = L3;
        drVar.invalidateSelf();
        g0Var.setImageDrawable(drVar);
        g0Var.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        addView(g0Var, b6.e(56, -1, 51));
        TextView textView = new TextView(context);
        this.d0 = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setText(cd.L0(2131752599, null));
        TextView textView2 = new TextView(context);
        this.e0 = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(cd.L0(2131752598, null));
        addView(textView, b6.e(-2, -2, 51));
        addView(textView2, b6.e(-2, -2, 51));
        ImageView imageView = new ImageView(context);
        this.w = imageView;
        imageView.setVisibility(4);
        imageView.setAlpha(0.0f);
        imageView.setImageResource(R.drawable.ic_goinline);
        imageView.setContentDescription(cd.L0(2131754808, null));
        int L4 = org.telegram.messenger.i0.L(4.0f);
        imageView.setPadding(L4, L4, L4, L4);
        imageView.setBackground(t6.h0(i0.b.o(-1, 55), 1, -1));
        imageView.setOnClickListener(new sr(24, y20Var, b50Var));
        addView(imageView, b6.d(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        fg.i iVar = new fg.i(y20Var, context, t6.d0(org.telegram.messenger.i0.L(18.0f), i0.b.o(t6.x0(null, t6.hh, false), zs.i3)), 15);
        this.I = iVar;
        u8 u8Var = new u8(context, true);
        this.J = u8Var;
        u8Var.setStyle(10);
        iVar.setClipChildren(false);
        iVar.setClipToPadding(false);
        iVar.addView(u8Var, b6.d(100, 32.0f, 16, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.K = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        iVar.addView(textView3, b6.e(-2, -2, 16));
        addView(iVar, b6.d(-2, 36.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
        this.a = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        while (i11 < 2) {
            this.K0[i11] = new il(y20Var, context);
            this.K0[i11].setHideAnimationType(2);
            this.K0[i11].setAdditionalTranslationY(org.telegram.messenger.i0.L(10.0f));
            addView(this.K0[i11], b6.d(-1, -2.0f, 80, 16.0f, 0.0f, 0.0f, 8.0f));
            i11++;
        }
        this.f0.setVisibility(8);
        setIsTablet(b50.x5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUiVisible(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            b50 b50Var = ((y20) this).Q0;
            if (b50Var.R3 != null) {
                b50Var.q5.a(!r1.V, true);
            }
            ew ewVar = this.h0;
            if (!z10 || !this.b) {
                this.g0 = false;
                org.telegram.messenger.i0.r(ewVar);
            } else if (!this.g0) {
                this.g0 = true;
                org.telegram.messenger.i0.h3(ewVar, 3000L);
            }
            r rVar = this.D;
            if (rVar != null) {
                rVar.requestLayout();
            }
        }
    }

    public final void b(boolean z10) {
        ValueAnimator ofFloat;
        int i10 = 0;
        if (this.G0) {
            this.G0 = false;
            int i11 = 1;
            float f7 = this.I0;
            float[] fArr = new float[2];
            if (z10) {
                fArr[0] = f7;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            } else {
                fArr[0] = f7;
                fArr[1] = 0.0f;
                ofFloat = ValueAnimator.ofFloat(fArr);
            }
            this.J0 = ofFloat;
            ofFloat.addUpdateListener(new t(this, i10));
            this.J0.addListener(new v(this, i11));
            ValueAnimator valueAnimator = this.J0;
            gr grVar = gr.f;
            valueAnimator.setInterpolator(grVar);
            this.J0.setDuration(z10 ? 350L : 200L);
            this.J0.setInterpolator(grVar);
            r rVar = this.D;
            if (rVar != null) {
                n nVar = rVar.a;
                ValueAnimator valueAnimator2 = this.J0;
                if (nVar.E) {
                    nVar.G.add(valueAnimator2);
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
        r rVar = this.D;
        if (rVar != null) {
            if (rVar.o0 || rVar.p0 != 0.0f) {
                rVar.o0 = false;
                rVar.p0 = 0.0f;
                rVar.a.invalidate();
                rVar.invalidate();
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
        r rVar;
        u20 u20Var;
        r rVar2;
        r rVar3;
        UndoView[] undoViewArr;
        if (b50.x5) {
            this.S = true;
            super.dispatchDraw(canvas);
            this.S = false;
        }
        this.T = true;
        super.dispatchDraw(canvas);
        this.T = false;
        if (this.E != null || this.D != null) {
            RecyclerView recyclerView = this.F;
            float y3 = recyclerView.getY() - getTop();
            float measuredHeight = (recyclerView.getMeasuredHeight() + y3) - recyclerView.getTranslationY();
            float f7 = this.c;
            canvas.save();
            boolean z10 = b50.x5;
            if (!z10 && (rVar = this.D) != null && !rVar.P && rVar.c != null) {
                float f10 = 1.0f - f7;
                canvas.clipRect(0.0f, y3 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
            } else if (z10) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            r rVar4 = this.E;
            if (rVar4 != null && rVar4.getParent() != null) {
                canvas.save();
                canvas.translate(this.E.getX(), this.E.getY());
                this.E.draw(canvas);
                canvas.restore();
            }
            r rVar5 = this.D;
            if (rVar5 != null && rVar5.getParent() != null) {
                if (this.D.getAlpha() != 1.0f) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(this.D.getX(), this.D.getY(), this.D.getX() + this.D.getMeasuredWidth(), this.D.getY() + this.D.getMeasuredHeight());
                    canvas.saveLayerAlpha(rectF, (int) (this.D.getAlpha() * 255.0f), 31);
                } else {
                    canvas.save();
                }
                boolean z11 = this.G0 || this.J0 != null;
                if (z11 && !h()) {
                    canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ((b50.w5 || b50.x5) ? 0 : org.telegram.messenger.i0.L(90.0f)));
                }
                canvas.translate(this.D.getX(), this.D.getY());
                r rVar6 = this.D;
                float f11 = this.I0;
                if (rVar6.o0 != z11 || rVar6.p0 != f11) {
                    rVar6.o0 = z11;
                    rVar6.p0 = f11;
                    rVar6.a.invalidate();
                    rVar6.invalidate();
                }
                this.D.i(this.y0, this.u0, this.v0, this.r0, this.s0, this.z0 || this.B0 != null);
                this.D.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
        }
        for (int i10 = 0; i10 < 2; i10++) {
            UndoView[] undoViewArr2 = this.K0;
            if (undoViewArr2[i10].getVisibility() == 0) {
                canvas.save();
                float f12 = b50.w5 ? 0.0f : (1.0f - this.W) * (-org.telegram.messenger.i0.L(90.0f));
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), ((getMeasuredHeight() - (b50.w5 ? 0 : org.telegram.messenger.i0.L(90.0f))) + f12) - org.telegram.messenger.i0.L(18.0f));
                if (this.M0) {
                    canvas.translate(undoViewArr2[i10].getX() - org.telegram.messenger.i0.L(8.0f), undoViewArr2[i10].getY() - org.telegram.messenger.i0.L(8.0f));
                } else {
                    canvas.translate(undoViewArr2[i10].getX() - org.telegram.messenger.i0.L(8.0f), ((undoViewArr2[i10].getY() - (b50.w5 ? 0 : org.telegram.messenger.i0.L(90.0f))) + f12) - org.telegram.messenger.i0.L(26.0f));
                }
                if (undoViewArr2[i10].getAlpha() != 1.0f) {
                    undoViewArr = undoViewArr2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, undoViewArr2[i10].getMeasuredWidth(), undoViewArr2[i10].getMeasuredHeight(), (int) (undoViewArr2[i10].getAlpha() * 255.0f), 31);
                } else {
                    undoViewArr = undoViewArr2;
                    canvas.save();
                }
                canvas.scale(undoViewArr[i10].getScaleX(), undoViewArr[i10].getScaleY(), undoViewArr[i10].getMeasuredWidth() / 2.0f, undoViewArr[i10].getMeasuredHeight() / 2.0f);
                undoViewArr[i10].draw(canvas);
                canvas.restore();
                canvas.restore();
            }
        }
        float f13 = (1.0f - this.W) * this.c;
        ValueAnimator valueAnimator = this.N0;
        GradientDrawable gradientDrawable = this.b0;
        GradientDrawable gradientDrawable2 = this.a0;
        if (valueAnimator == null || (rVar2 = this.E) == null || (rVar3 = this.D) == null) {
            r rVar7 = this.D;
            if (rVar7 != null) {
                float f14 = 255.0f * f13;
                gradientDrawable2.setAlpha((int) ((1.0f - rVar7.a0) * f14));
                gradientDrawable.setAlpha((int) ((1.0f - this.D.a0) * f14));
            } else {
                int i11 = (int) (255.0f * f13);
                gradientDrawable2.setAlpha(i11);
                gradientDrawable.setAlpha(i11);
            }
        } else {
            boolean z12 = rVar2.W;
            boolean z13 = rVar3.W;
            int alpha = (int) ((z12 != z13 ? (!z13 ? 1.0f - rVar3.getAlpha() : rVar3.getAlpha()) * f13 : !z13 ? 0.0f : f13) * 255.0f);
            gradientDrawable2.setAlpha(alpha);
            gradientDrawable.setAlpha(alpha);
        }
        this.k0.setAlpha(f13);
        boolean h = h();
        org.telegram.ui.ActionBar.g0 g0Var = this.l0;
        ImageView imageView = this.w;
        if (h) {
            g0Var.setAlpha(0.0f);
            g0Var.setVisibility(4);
            imageView.setAlpha(f13);
            imageView.setVisibility(0);
            if (b50.w5) {
                imageView.setTranslationX((1.0f - this.W) * (-org.telegram.messenger.i0.L(72.0f)));
            } else {
                imageView.setTranslationX(0.0f);
            }
        } else {
            g0Var.setAlpha(f13);
            g0Var.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.setVisibility(4);
        }
        int measuredWidth = getMeasuredWidth();
        TextView textView = this.d0;
        float measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        int measuredWidth3 = getMeasuredWidth();
        TextView textView2 = this.e0;
        float measuredWidth4 = measuredWidth3 - textView2.getMeasuredWidth();
        float currentActionBarHeight = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - textView.getMeasuredHeight()) / 2.0f) - org.telegram.messenger.i0.L(1.0f);
        dr drVar = this.c0;
        float f15 = drVar.g;
        float z14 = (c3.i0.z(1.0f, f15, measuredWidth2, measuredWidth4 * f15) - org.telegram.messenger.i0.L(21.0f)) - (b50.x5 ? org.telegram.messenger.i0.L(328.0f) : b50.w5 ? org.telegram.messenger.i0.L(180.0f) : 0);
        textView.setTranslationX(z14);
        textView2.setTranslationX(z14);
        textView.setTranslationY(currentActionBarHeight);
        textView2.setTranslationY(currentActionBarHeight);
        kg.f0 f0Var = this.f0;
        f0Var.setTranslationX(z14 - org.telegram.messenger.i0.L(36.0f));
        f0Var.setTranslationY((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - f0Var.getMeasuredHeight()) / 2.0f);
        g0Var.setTranslationX(z14 - org.telegram.messenger.i0.L(44.0f));
        if (h()) {
            textView.setAlpha(0.0f);
            textView2.setAlpha(0.0f);
            f0Var.setAlpha(0.0f);
        } else {
            textView.setAlpha((1.0f - drVar.g) * f13);
            textView2.setAlpha(drVar.g * f13);
            f0Var.setAlpha(f13);
        }
        float f16 = this.O;
        fg.i iVar = this.I;
        if (f16 != 1.0f) {
            float f17 = f16 + 0.07272727f;
            this.O = f17;
            if (f17 > 1.0f) {
                this.O = 1.0f;
            } else {
                invalidate();
            }
            iVar.invalidate();
        }
        boolean z15 = this.L;
        if (z15) {
            float f18 = this.N;
            if (f18 != 1.0f) {
                float f19 = f18 + 0.10666667f;
                this.N = f19;
                if (f19 > 1.0f) {
                    this.N = 1.0f;
                } else {
                    invalidate();
                }
                if (b50.w5) {
                    iVar.setTranslationY((org.telegram.messenger.i0.L(8.0f) * this.W) + ((1.0f - this.W) * org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) + org.telegram.messenger.i0.L(8.0f));
                } else {
                    iVar.setTranslationY(org.telegram.messenger.i0.L(16.0f));
                }
                iVar.setAlpha(this.N * this.c);
                iVar.setScaleX((this.N * 0.5f) + 0.5f);
                iVar.setScaleY((this.N * 0.5f) + 0.5f);
                if (b50.x5) {
                    super.dispatchDraw(canvas);
                } else {
                    this.U = true;
                    super.dispatchDraw(canvas);
                    this.U = false;
                }
                u20Var = this.G;
                if (u20Var.getVisibility() != 0) {
                    for (int i12 = 0; i12 < u20Var.getChildCount(); i12++) {
                        y10 y10Var = (y10) u20Var.getChildAt(i12);
                        if (y10Var.getVisibility() == 0 && y10Var.getAlpha() != 0.0f) {
                            canvas.save();
                            canvas.translate(u20Var.getX() + y10Var.getX(), u20Var.getY() + y10Var.getY());
                            canvas.scale(y10Var.getScaleX(), y10Var.getScaleY(), y10Var.getMeasuredWidth() / 2.0f, y10Var.getMeasuredHeight() / 2.0f);
                            y10Var.c(canvas);
                            canvas.restore();
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (!z15) {
            float f20 = this.N;
            if (f20 != 0.0f) {
                float f21 = f20 - 0.10666667f;
                this.N = f21;
                if (f21 < 0.0f) {
                    this.N = 0.0f;
                } else {
                    invalidate();
                }
            }
        }
        if (b50.w5) {
        }
        iVar.setAlpha(this.N * this.c);
        iVar.setScaleX((this.N * 0.5f) + 0.5f);
        iVar.setScaleY((this.N * 0.5f) + 0.5f);
        if (b50.x5) {
        }
        u20Var = this.G;
        if (u20Var.getVisibility() != 0) {
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = this.T;
        RecyclerView recyclerView = this.F;
        if (!z10) {
            UndoView[] undoViewArr = this.K0;
            if (view != undoViewArr[0] && view != undoViewArr[1]) {
                if (view instanceof r) {
                    r rVar = (r) view;
                    if (rVar != this.D && rVar != this.E && !this.U && !rVar.y0) {
                        if (rVar.c == null) {
                            if (!b50.x5) {
                                return super.drawChild(canvas, view, j10);
                            }
                            canvas.save();
                            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            boolean drawChild = super.drawChild(canvas, view, j10);
                            canvas.restore();
                            return drawChild;
                        }
                        float y3 = recyclerView.getY() - getTop();
                        float measuredHeight = (recyclerView.getMeasuredHeight() + y3) - recyclerView.getTranslationY();
                        float f7 = this.c;
                        if (rVar.d == null) {
                            f7 = 0.0f;
                        }
                        canvas.save();
                        float f10 = 1.0f - f7;
                        canvas.clipRect(0.0f, y3 * f10, getMeasuredWidth(), (getMeasuredHeight() * f7) + (measuredHeight * f10));
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                } else if (!this.S) {
                    return super.drawChild(canvas, view, j10);
                }
            }
        } else if ((view instanceof r) && ((r) view).y0) {
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
        boolean z10 = this.g0;
        ew ewVar = this.h0;
        if (z10) {
            org.telegram.messenger.i0.r(ewVar);
        }
        org.telegram.messenger.i0.h3(ewVar, 3000L);
        this.g0 = true;
    }

    public final void f(r rVar) {
        this.H.remove(rVar);
        long C1 = jj.C1(rVar.x.a.peer);
        this.x.put(C1, r2.get(C1, 0) - 1);
    }

    public final void g() {
        w wVar;
        if (this.z0) {
            this.z0 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.B0 = ofFloat;
            wVar = this;
            ofFloat.addUpdateListener(new lg.j(wVar, this.y0, this.r0, this.s0, 1));
            wVar.B0.addListener(new v(this, 2));
            wVar.B0.setDuration(350L);
            wVar.B0.setInterpolator(gr.f);
            wVar.B0.start();
            wVar.h = System.currentTimeMillis();
        } else {
            wVar = this;
        }
        wVar.A0 = false;
        wVar.t0 = false;
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
        u3 u3Var = this.i0;
        return u3Var != null && u3Var.b.rtmp_stream;
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
    public final void j(v3 v3Var) {
        r rVar;
        r rVar2;
        n nVar;
        k kVar;
        y10 y10Var;
        k kVar2;
        v3 v3Var2;
        if (v3Var == null && this.e == null) {
            return;
        }
        if (v3Var == null || !v3Var.equals(this.e)) {
            long C1 = v3Var == null ? 0L : jj.C1(v3Var.a.peer);
            r rVar3 = this.D;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            if (rVar3 != null) {
                ArrayList arrayList = rVar3.m0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((Runnable) arrayList.get(i10)).run();
                }
                arrayList.clear();
            }
            ValueAnimator valueAnimator = this.N0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance != null && (v3Var2 = this.e) != null) {
                sharedInstance.requestFullScreen(v3Var2.a, false, v3Var2.b);
            }
            this.e = v3Var;
            int i11 = 1;
            if (sharedInstance != null && v3Var != null) {
                sharedInstance.requestFullScreen(v3Var.a, true, v3Var.b);
            }
            this.d = C1;
            boolean z10 = this.b;
            this.h = System.currentTimeMillis();
            int i12 = 2;
            ag.r rVar4 = this.k0;
            b50 b50Var = this.j0;
            if (v3Var == null) {
                if (this.b) {
                    ValueAnimator valueAnimator2 = this.r;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    this.b = false;
                    r rVar5 = this.D;
                    if (rVar5.c != null || rVar5.d != null || rVar5.e != null) {
                        v3 v3Var3 = rVar5.x;
                        if (u3.C(v3Var3.a, v3Var3.b, this.i0)) {
                            this.D.h(false, true);
                        }
                    }
                    this.D.b(true);
                    k kVar3 = this.D.c;
                    if (kVar3 != null) {
                        kVar3.setRenderer(null);
                    }
                    y10 y10Var2 = this.D.d;
                    if (y10Var2 != null) {
                        y10Var2.setRenderer(null);
                    }
                    k kVar4 = this.D.e;
                    if (kVar4 != null) {
                        kVar4.setRenderer(null);
                    }
                    r rVar6 = this.D;
                    rVar6.animate().alpha(0.0f).setListener(new u(this, rVar6, i12)).setDuration(350L).start();
                }
                rVar4.setEnabled(false);
                this.f = false;
            } else {
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = this.H;
                    if (i13 >= arrayList2.size()) {
                        rVar = null;
                        break;
                    } else {
                        if (((r) arrayList2.get(i13)).x.equals(v3Var)) {
                            rVar = (r) arrayList2.get(i13);
                            break;
                        }
                        i13++;
                    }
                }
                Property property = View.ALPHA;
                dr drVar = this.c0;
                if (rVar != null) {
                    ValueAnimator valueAnimator3 = this.r;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    if (this.b) {
                        this.f = false;
                        drVar.a(false, false);
                        this.D.b(false);
                        rVar.b(false);
                        if (!this.M0) {
                            r rVar7 = this.D;
                            if (rVar7.c != null || rVar7.d != null || rVar7.e != null) {
                                rVar2 = new r(this, this.i0, b50Var);
                                r rVar8 = this.D;
                                k kVar5 = rVar8.c;
                                y10 y10Var3 = rVar8.d;
                                k kVar6 = rVar8.e;
                                rVar2.c = kVar5;
                                rVar2.d = y10Var3;
                                rVar2.e = kVar6;
                                rVar2.g(this.b, false);
                                rVar2.j(false);
                                k kVar7 = this.D.c;
                                if (kVar7 != null) {
                                    kVar7.setRenderer(rVar2);
                                }
                                y10 y10Var4 = this.D.d;
                                if (y10Var4 != null) {
                                    y10Var4.setRenderer(rVar2);
                                }
                                k kVar8 = this.D.e;
                                if (kVar8 != null) {
                                    kVar8.setRenderer(rVar2);
                                }
                                r rVar9 = new r(this, this.i0, b50Var);
                                rVar9.x = rVar.x;
                                k kVar9 = rVar.c;
                                y10 y10Var5 = rVar.d;
                                k kVar10 = rVar.e;
                                rVar9.c = kVar9;
                                rVar9.d = y10Var5;
                                rVar9.e = kVar10;
                                rVar9.g(this.b, false);
                                rVar9.j(false);
                                nVar = rVar9.a;
                                nVar.d.setAlpha(1.0f);
                                nVar.e.setAlpha(1.0f);
                                kVar = rVar.c;
                                if (kVar != null) {
                                    kVar.setRenderer(rVar9);
                                }
                                y10Var = rVar.d;
                                if (y10Var != null) {
                                    y10Var.setRenderer(rVar9);
                                }
                                kVar2 = rVar.e;
                                if (kVar2 != null) {
                                    kVar2.setRenderer(rVar9);
                                }
                                rVar9.E = true;
                                rVar9.setAlpha(0.0f);
                                this.E = this.D;
                                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rVar9, (Property<r, Float>) property, 0.0f, 1.0f);
                                this.N0 = ofFloat;
                                ofFloat.addListener(new org.telegram.ui.ActionBar.g1(this, rVar9, rVar, 8));
                                if (rVar2 != null) {
                                    rVar2.setAlpha(0.0f);
                                    rVar2.setScaleX(0.5f);
                                    rVar2.setScaleY(0.5f);
                                    rVar2.E = true;
                                }
                                u41 u41Var = new u41(this, rVar, rVar2, 3);
                                if (nVar.d.isFirstFrameRendered()) {
                                    org.telegram.messenger.i0.h3(u41Var, 250L);
                                    rVar9.m0.add(u41Var);
                                } else {
                                    u41Var.run();
                                }
                                d();
                                this.D = rVar9;
                                rVar9.h(true, false);
                                l();
                            }
                        }
                        rVar2 = null;
                        r rVar92 = new r(this, this.i0, b50Var);
                        rVar92.x = rVar.x;
                        k kVar92 = rVar.c;
                        y10 y10Var52 = rVar.d;
                        k kVar102 = rVar.e;
                        rVar92.c = kVar92;
                        rVar92.d = y10Var52;
                        rVar92.e = kVar102;
                        rVar92.g(this.b, false);
                        rVar92.j(false);
                        nVar = rVar92.a;
                        nVar.d.setAlpha(1.0f);
                        nVar.e.setAlpha(1.0f);
                        kVar = rVar.c;
                        if (kVar != null) {
                        }
                        y10Var = rVar.d;
                        if (y10Var != null) {
                        }
                        kVar2 = rVar.e;
                        if (kVar2 != null) {
                        }
                        rVar92.E = true;
                        rVar92.setAlpha(0.0f);
                        this.E = this.D;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rVar92, (Property<r, Float>) property, 0.0f, 1.0f);
                        this.N0 = ofFloat2;
                        ofFloat2.addListener(new org.telegram.ui.ActionBar.g1(this, rVar92, rVar, 8));
                        if (rVar2 != null) {
                        }
                        u41 u41Var2 = new u41(this, rVar, rVar2, 3);
                        if (nVar.d.isFirstFrameRendered()) {
                        }
                        d();
                        this.D = rVar92;
                        rVar92.h(true, false);
                        l();
                    } else {
                        this.b = true;
                        d();
                        this.D = rVar;
                        rVar.h(true, true);
                        invalidate();
                        drVar.a(this.f, false);
                    }
                } else if (this.b) {
                    r rVar10 = this.D;
                    if (rVar10.c == null) {
                        if (!((rVar10.d != null) | (rVar10.e != null))) {
                            rVar10.b(true);
                            r rVar11 = new r(this, this.i0, b50Var);
                            rVar11.x = v3Var;
                            rVar11.g(this.b, false);
                            rVar11.h(true, false);
                            rVar11.E = true;
                            rVar11.setAlpha(0.0f);
                            this.E = this.D;
                            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                            this.N0 = ofFloat3;
                            ofFloat3.addUpdateListener(new ag.p2(17, this, rVar11));
                            this.N0.addListener(new u(this, rVar11, objArr2 == true ? 1 : 0));
                            this.N0.start();
                            d();
                            this.D = rVar11;
                            rVar11.h(true, false);
                            this.D.j(false);
                            l();
                        }
                    }
                    rVar10.b(false);
                    r rVar12 = new r(this, this.i0, b50Var);
                    r rVar13 = this.D;
                    k kVar11 = rVar13.c;
                    y10 y10Var6 = rVar13.d;
                    k kVar12 = rVar13.e;
                    rVar12.c = kVar11;
                    rVar12.d = y10Var6;
                    rVar12.e = kVar12;
                    rVar12.g(this.b, false);
                    rVar12.j(false);
                    k kVar13 = this.D.c;
                    if (kVar13 != null) {
                        kVar13.setRenderer(rVar12);
                    }
                    y10 y10Var7 = this.D.d;
                    if (y10Var7 != null) {
                        y10Var7.setRenderer(rVar12);
                    }
                    k kVar14 = this.D.e;
                    if (kVar14 != null) {
                        kVar14.setRenderer(rVar12);
                    }
                    rVar12.setAlpha(0.0f);
                    rVar12.setScaleX(0.5f);
                    rVar12.setScaleY(0.5f);
                    rVar12.E = true;
                    gi0 gi0Var = new gi0(29, this, rVar12);
                    if (rVar12.a.d.isFirstFrameRendered()) {
                        gi0Var.run();
                    } else {
                        org.telegram.messenger.i0.h3(gi0Var, 250L);
                        rVar12.m0.add(gi0Var);
                    }
                    r rVar112 = new r(this, this.i0, b50Var);
                    rVar112.x = v3Var;
                    rVar112.g(this.b, false);
                    rVar112.h(true, false);
                    rVar112.E = true;
                    rVar112.setAlpha(0.0f);
                    this.E = this.D;
                    ValueAnimator ofFloat32 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.N0 = ofFloat32;
                    ofFloat32.addUpdateListener(new ag.p2(17, this, rVar112));
                    this.N0.addListener(new u(this, rVar112, objArr2 == true ? 1 : 0));
                    this.N0.start();
                    d();
                    this.D = rVar112;
                    rVar112.h(true, false);
                    this.D.j(false);
                    l();
                } else {
                    this.b = true;
                    d();
                    r rVar14 = new r(this, this.i0, b50Var);
                    this.D = rVar14;
                    rVar14.x = v3Var;
                    rVar14.g(this.b, false);
                    this.D.h(true, false);
                    this.D.h(true, false);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.D, (Property<r, Float>) property, 0.0f, 1.0f);
                    this.N0 = ofFloat4;
                    ofFloat4.addListener(new v(this, objArr == true ? 1 : 0));
                    this.N0.start();
                    invalidate();
                    drVar.a(this.f, false);
                }
                rVar4.setEnabled(true);
            }
            boolean z11 = this.b;
            if (z10 != z11) {
                if (z11) {
                    rVar4.setVisibility(0);
                    this.l0.setVisibility(0);
                    this.e0.setVisibility(0);
                    this.f0.setVisibility(0);
                } else {
                    setUiVisible(true);
                    if (this.g0) {
                        this.g0 = false;
                        org.telegram.messenger.i0.r(this.h0);
                    }
                }
                i(true);
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(this.c, this.b ? 1.0f : 0.0f);
                this.r = ofFloat5;
                ofFloat5.addUpdateListener(new t(this, i11));
                r rVar15 = this.D;
                rVar15.r = true;
                b50Var.getClass();
                this.L0 = this.G0;
                this.y.d();
                this.r.addListener(new u(this, rVar15, i11));
                this.r.setInterpolator(gr.f);
                this.r.setDuration(350L);
                n nVar2 = this.D.a;
                ValueAnimator valueAnimator4 = this.r;
                if (nVar2.E) {
                    nVar2.G.add(valueAnimator4);
                } else {
                    valueAnimator4.start();
                }
            }
            b(this.e == null);
        }
    }

    public final void k(TLRPC.GroupCallParticipant groupCallParticipant, float f7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (jj.C1(((r) arrayList.get(i10)).x.a.peer) == jj.C1(groupCallParticipant.peer)) {
                ((r) arrayList.get(i10)).setAmplitude(f7);
            }
            i10++;
        }
    }

    public abstract void l();

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = b50.x5;
        View view = this.m0;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(328.0f);
        } else if (b50.w5) {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = h() ? 0 : org.telegram.messenger.i0.L(90.0f);
        } else {
            ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin = 0;
        }
        this.n0.setVisibility((!b50.w5 || b50.x5) ? 8 : 0);
        kg.f0 f0Var = this.f0;
        f0Var.getLayoutParams().height = org.telegram.messenger.i0.L(40.0f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView = this.d0;
        textView.measure(makeMeasureSpec, i11);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0);
        TextView textView2 = this.e0;
        textView2.measure(makeMeasureSpec2, i11);
        f0Var.getLayoutParams().width = org.telegram.messenger.i0.L(46.0f) + (!this.f ? textView.getMeasuredWidth() : textView2.getMeasuredWidth());
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).rightMargin = b50.w5 ? org.telegram.messenger.i0.L(45.0f) : 0;
        for (int i12 = 0; i12 < 2; i12++) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.K0[i12].getLayoutParams();
            if (this.M0) {
                marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(344.0f);
            } else {
                marginLayoutParams.rightMargin = b50.w5 ? org.telegram.messenger.i0.L(180.0f) : 0;
            }
        }
        super.onMeasure(i10, i11);
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
        boolean z10;
        boolean z11 = this.H0;
        b50 b50Var = this.j0;
        if ((z11 || this.G0) && (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3)) {
            this.H0 = false;
            if (this.G0) {
                if (motionEvent.getActionMasked() != 1 || Math.abs(this.I0) <= org.telegram.messenger.i0.L(120.0f)) {
                    b(false);
                } else {
                    b50Var.g1(null);
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
        r rVar = this.D;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        org.telegram.ui.ActionBar.q2 q2Var = rVar.N;
        Rect rect = rVar.B0;
        q2Var.getHitRect(rect);
        if (!rect.contains((int) x10, (int) y3)) {
            if (motionEvent.getActionMasked() == 0 && !this.G0) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), this.D.getMeasuredWidth() + ((b50.w5 && this.V) ? -org.telegram.messenger.i0.L(90.0f) : 0), this.D.getMeasuredHeight() + ((b50.w5 || !this.V) ? 0 : -org.telegram.messenger.i0.L(90.0f)));
                if (rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.C0 = System.currentTimeMillis();
                    this.D0 = true;
                    this.H0 = true;
                    this.E0 = motionEvent.getX();
                    this.F0 = motionEvent.getY();
                }
            } else if ((this.H0 || this.G0 || this.D0) && motionEvent.getActionMasked() == 2) {
                float abs = Math.abs(this.E0 - motionEvent.getX());
                float f7 = this.a;
                if (abs > f7 || Math.abs(this.F0 - motionEvent.getY()) > f7) {
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
                    RectF rectF2 = org.telegram.messenger.i0.P;
                    fg.i iVar = this.I;
                    rectF2.set(iVar.getX(), iVar.getY(), iVar.getX() + iVar.getWidth(), iVar.getY() + iVar.getHeight());
                    if (this.i0 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                        boolean z12 = false;
                        z10 = false;
                        for (int i10 = 0; i10 < this.i0.f.size(); i10++) {
                            if (this.M == jj.C1(((v3) this.i0.f.get(i10)).a.peer)) {
                                b50Var.g1((v3) this.i0.f.get(i10));
                                z12 = true;
                                z10 = true;
                            }
                        }
                        if (!z12) {
                            b50Var.g1(new v3((TLRPC.GroupCallParticipant) this.i0.d.f(this.M), false));
                            z10 = true;
                        }
                        if (!z10) {
                            setUiVisible(!this.V);
                        }
                        this.I0 = 0.0f;
                        invalidate();
                    }
                }
                z10 = false;
                if (!z10) {
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
                        x1 x1Var = this.D.a.d;
                        RectF rectF3 = org.telegram.messenger.i0.P;
                        rectF3.set(x1Var.getX(), x1Var.getY(), x1Var.getX() + x1Var.getMeasuredWidth(), x1Var.getY() + x1Var.getMeasuredHeight());
                        rectF3.inset(((x1Var.getMeasuredHeight() * this.D.a.T) - x1Var.getMeasuredHeight()) / 2.0f, ((x1Var.getMeasuredWidth() * this.D.a.T) - x1Var.getMeasuredWidth()) / 2.0f);
                        if (b50.w5) {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                            rectF3.right = Math.min(rectF3.right, this.D.getMeasuredWidth() - org.telegram.messenger.i0.L(90.0f));
                        } else {
                            rectF3.top = Math.max(rectF3.top, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight());
                            rectF3.bottom = Math.min(rectF3.bottom, this.D.getMeasuredHeight() - org.telegram.messenger.i0.L(90.0f));
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
                        float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        this.v0 = y10;
                        this.p0 = y10;
                        this.y0 = 1.0f;
                        this.w0 = motionEvent.getPointerId(0);
                        this.x0 = motionEvent.getPointerId(1);
                        this.t0 = true;
                    }
                } else if (motionEvent.getActionMasked() == 2 && this.t0) {
                    int i11 = -1;
                    int i12 = -1;
                    for (int i13 = 0; i13 < motionEvent.getPointerCount(); i13++) {
                        if (this.w0 == motionEvent.getPointerId(i13)) {
                            i11 = i13;
                        }
                        if (this.x0 == motionEvent.getPointerId(i13)) {
                            i12 = i13;
                        }
                    }
                    if (i11 == -1 || i12 == -1) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        g();
                        return this.H0;
                    }
                    float hypot = ((float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11))) / this.q0;
                    this.y0 = hypot;
                    if (hypot > 1.005f && !this.z0) {
                        this.q0 = (float) Math.hypot(motionEvent.getX(i12) - motionEvent.getX(i11), motionEvent.getY(i12) - motionEvent.getY(i11));
                        float x12 = (motionEvent.getX(i12) + motionEvent.getX(i11)) / 2.0f;
                        this.u0 = x12;
                        this.o0 = x12;
                        float y11 = (motionEvent.getY(i12) + motionEvent.getY(i11)) / 2.0f;
                        this.v0 = y11;
                        this.p0 = y11;
                        this.y0 = 1.0f;
                        this.r0 = 0.0f;
                        this.s0 = 0.0f;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.z0 = true;
                        this.t0 = true;
                    }
                    float x13 = (motionEvent.getX(i12) + motionEvent.getX(i11)) / 2.0f;
                    float y12 = (motionEvent.getY(i12) + motionEvent.getY(i11)) / 2.0f;
                    float f10 = this.o0 - x13;
                    float f11 = this.p0 - y12;
                    float f12 = -f10;
                    float f13 = this.y0;
                    this.r0 = f12 / f13;
                    this.s0 = (-f11) / f13;
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

    public void setGroupCall(u3 u3Var) {
        this.i0 = u3Var;
    }

    public void setIsTablet(boolean z10) {
        if (this.M0 != z10) {
            this.M0 = z10;
            ag.r rVar = this.k0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rVar.getLayoutParams();
            layoutParams.gravity = z10 ? 85 : 51;
            layoutParams.rightMargin = z10 ? org.telegram.messenger.i0.L(328.0f) : 0;
            layoutParams.bottomMargin = z10 ? -org.telegram.messenger.i0.L(8.0f) : 0;
            if (this.M0) {
                rVar.setImageDrawable(getContext().getDrawable(R.drawable.msg_calls_minimize));
                return;
            }
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(false);
            c2Var.a(-1);
            rVar.setImageDrawable(c2Var);
        }
    }

    public void setProgressToHideUi(float f7) {
        if (this.W != f7) {
            this.W = f7;
            invalidate();
            r rVar = this.D;
            if (rVar != null) {
                rVar.invalidate();
            }
        }
    }

    public void setVisibleParticipant(boolean z10) {
        u8 u8Var;
        boolean z11;
        int i10;
        long j10;
        if (!this.b || this.M0 || this.e == null || this.r != null || this.i0 == null) {
            if (this.L) {
                this.L = false;
                this.N = 0.0f;
                return;
            }
            return;
        }
        int i11 = this.j0.a;
        long j11 = 500;
        if (System.currentTimeMillis() - this.O0 < 500) {
            if (this.P0 == null) {
                w5 w5Var = new w5(this, 3);
                this.P0 = w5Var;
                org.telegram.messenger.i0.h3(w5Var, (System.currentTimeMillis() - this.O0) + 50);
                return;
            }
            return;
        }
        this.O0 = System.currentTimeMillis();
        int i12 = 0;
        int i13 = 0;
        SpannableStringBuilder spannableStringBuilder = null;
        while (true) {
            int m10 = this.i0.P.m();
            u8Var = this.J;
            if (i12 >= m10) {
                break;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.i0.P.f(this.i0.P.j(i12));
            if (groupCallParticipant.self || groupCallParticipant.muted_by_you) {
                i10 = i12;
                j10 = j11;
            } else {
                j10 = j11;
                if (jj.C1(this.e.a.peer) == jj.C1(groupCallParticipant.peer)) {
                    i10 = i12;
                } else {
                    long C1 = jj.C1(groupCallParticipant.peer);
                    i10 = i12;
                    if (SystemClock.uptimeMillis() - groupCallParticipant.lastSpeakTime >= j10) {
                        continue;
                    } else {
                        if (spannableStringBuilder == null) {
                            spannableStringBuilder = new SpannableStringBuilder();
                        }
                        if (i13 == 0) {
                            this.M = jj.C1(groupCallParticipant.peer);
                        }
                        if (i13 < 3) {
                            TLRPC.User Z1 = C1 > 0 ? vp.r1(i11).Z1(Long.valueOf(C1)) : null;
                            TLRPC.Chat L0 = C1 <= 0 ? vp.r1(i11).L0(Long.valueOf(C1)) : null;
                            if (Z1 != null || L0 != null) {
                                u8Var.b(i13, i11, groupCallParticipant);
                                if (i13 != 0) {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                                if (Z1 != null) {
                                    spannableStringBuilder.append(h20.j(Z1, true), new x41(org.telegram.messenger.i0.o()), 0);
                                } else {
                                    spannableStringBuilder.append(L0.title, new x41(org.telegram.messenger.i0.o()), 0);
                                }
                            }
                        }
                        i13++;
                        if (i13 == 3) {
                            break;
                        }
                    }
                }
            }
            i12 = i10 + 1;
            j11 = j10;
        }
        boolean z12 = i13 != 0;
        boolean z13 = this.L;
        TextView textView = this.K;
        if (!z13 && z12) {
            z11 = false;
        } else {
            if (!z12 && z13) {
                this.L = z12;
                invalidate();
                return;
            }
            if (z13 && z12) {
                fg.i iVar = this.I;
                this.P = iVar.getLeft();
                this.R = iVar.getRight();
                this.Q = textView.getLeft();
                this.O = 0.0f;
            }
            z11 = z10;
        }
        if (!z12) {
            this.L = z12;
            invalidate();
            return;
        }
        String J0 = cd.J0(i13, "MembersAreSpeakingToast");
        int indexOf = J0.indexOf("un1");
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(J0);
        spannableStringBuilder2.replace(indexOf, indexOf + 3, (CharSequence) spannableStringBuilder);
        textView.setText(spannableStringBuilder2);
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).leftMargin = i13 != 0 ? i13 == 1 ? org.telegram.messenger.i0.L(40.0f) : i13 == 2 ? org.telegram.messenger.i0.L(64.0f) : org.telegram.messenger.i0.L(88.0f) : 0;
        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = org.telegram.messenger.i0.L(16.0f);
        this.L = z12;
        invalidate();
        while (i13 < 3) {
            u8Var.b(i13, i11, null);
            i13++;
        }
        u8Var.a(z11);
    }
}
