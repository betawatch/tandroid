package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class n0 extends FrameLayout {
    public final og.g E;
    public boolean F;
    public final x5 a;
    public tg.n1 b;
    public final org.telegram.ui.Components.u5 c;
    public final org.telegram.ui.Components.u5 d;
    public final m0 e;
    public final FrameLayout f;
    public final g0 h;
    public final og.f n;
    public final FrameLayout r;
    public float s;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public n0(Context context, x5 x5Var) {
        super(context);
        this.s = 0.0f;
        final int i7 = 2;
        this.w = new int[2];
        this.x = new int[2];
        this.y = new int[2];
        this.E = new og.g();
        this.a = x5Var;
        m0 m0Var = new m0(this, context);
        this.e = m0Var;
        er erVar = er.h;
        this.c = new org.telegram.ui.Components.u5(m0Var, 0L, 320L, erVar);
        this.d = new org.telegram.ui.Components.u5(m0Var, 0L, 320L, erVar);
        final int i10 = 1;
        g0 g0Var = new g0(this, context, i10);
        this.h = g0Var;
        final int i11 = 0;
        g0Var.setListener(new l0(this, i11));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, c8.ja.e(-1, -1, ns.E1));
        og.f fVar = new og.f(context);
        this.n = fVar;
        fVar.setListener(new h0(i10, this));
        frameLayout.addView(fVar, c8.ja.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ja.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.v(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ja.e(-2, -1, ns.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.k0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((da) this.b).G.k0(-1, false, true);
                        break;
                    case 1:
                        n0 n0Var = this.b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        tg.n1 n1Var = n0Var2.b;
                        if (n1Var != null) {
                            n1Var.H0 = new xe();
                            n0Var2.h.b(n0Var2.b.H0);
                            tg.n1 n1Var2 = n0Var2.b;
                            n1Var2.H0.z = n1Var2.getOrientation();
                            n0Var2.b.k();
                            n0Var2.b.requestLayout();
                            n0Var2.b.A0.requestLayout();
                            n0Var2.b.A0.invalidate();
                            n0Var2.b.A0.post(new fi.c1(n0Var2, 28));
                        }
                        ((da) n0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(hd.M0(2131751696, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ja.e(-2, -1, ns.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.k0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((da) this.b).G.k0(-1, false, true);
                        break;
                    case 1:
                        n0 n0Var = this.b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        tg.n1 n1Var = n0Var2.b;
                        if (n1Var != null) {
                            n1Var.H0 = new xe();
                            n0Var2.h.b(n0Var2.b.H0);
                            tg.n1 n1Var2 = n0Var2.b;
                            n1Var2.H0.z = n1Var2.getOrientation();
                            n0Var2.b.k();
                            n0Var2.b.requestLayout();
                            n0Var2.b.A0.requestLayout();
                            n0Var2.b.A0.invalidate();
                            n0Var2.b.A0.post(new fi.c1(n0Var2, 28));
                        }
                        ((da) n0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(hd.M0(2131744688, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ja.e(-2, -1, ns.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.k0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ((da) this.b).G.k0(-1, false, true);
                        break;
                    case 1:
                        n0 n0Var = this.b;
                        n0Var.h.l(true);
                        og.f fVar2 = n0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        tg.n1 n1Var = n0Var2.b;
                        if (n1Var != null) {
                            n1Var.H0 = new xe();
                            n0Var2.h.b(n0Var2.b.H0);
                            tg.n1 n1Var2 = n0Var2.b;
                            n1Var2.H0.z = n1Var2.getOrientation();
                            n0Var2.b.k();
                            n0Var2.b.requestLayout();
                            n0Var2.b.A0.requestLayout();
                            n0Var2.b.A0.invalidate();
                            n0Var2.b.A0.post(new fi.c1(n0Var2, 28));
                        }
                        ((da) n0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        tg.n1 n1Var = this.b;
        if (n1Var == null) {
            return 1;
        }
        return (n1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        tg.n1 n1Var = this.b;
        if (n1Var == null) {
            return 1;
        }
        return (n1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentHeight() : this.b.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        float L = org.telegram.messenger.g0.L(52.0f);
        g0 g0Var = this.h;
        g0Var.setTopPadding(L);
        g0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void set(tg.n1 n1Var) {
        if (n1Var == null) {
            return;
        }
        this.b = n1Var;
        setVisibility(0);
        this.F = false;
        g0 g0Var = this.h;
        g0Var.K = true;
        getLocationOnScreen(this.w);
        this.a.getLocationOnScreen(this.x);
        n1Var.getLocationOnScreen(this.y);
        xe xeVar = n1Var.H0;
        if (xeVar == null) {
            xeVar = null;
        }
        g0Var.p(n1Var.getOrientation(), this.E, xeVar);
        float rotation = g0Var.getRotation();
        og.f fVar = this.n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.u5 u5Var = this.c;
        if (xeVar != null) {
            fVar.b(xeVar.d);
            fVar.setRotated(xeVar.k != 0);
            fVar.setMirrored(xeVar.l);
            u5Var.f(xeVar.l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            u5Var.getClass();
            u5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        m0 m0Var = this.e;
        m0Var.setVisibility(0);
        m0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.s - f10) < 0.001f) {
            return;
        }
        this.s = f10;
        this.e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.a;
        CropAreaView cropAreaView2 = g0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
