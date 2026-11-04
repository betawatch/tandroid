package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.re;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class m0 extends FrameLayout {
    public final pg.f E;
    public boolean F;
    public final y5 a;
    public ug.n1 b;
    public final org.telegram.ui.Components.u5 c;
    public final org.telegram.ui.Components.u5 d;
    public final l0 e;
    public final FrameLayout f;
    public final g0 h;
    public final pg.e n;
    public final FrameLayout r;
    public float s;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public m0(Context context, y5 y5Var) {
        super(context);
        this.s = 0.0f;
        final int i3 = 2;
        this.w = new int[2];
        this.x = new int[2];
        this.y = new int[2];
        this.E = new pg.f();
        this.a = y5Var;
        l0 l0Var = new l0(this, context);
        this.e = l0Var;
        xq xqVar = xq.h;
        this.c = new org.telegram.ui.Components.u5(l0Var, 0L, 320L, xqVar);
        this.d = new org.telegram.ui.Components.u5(l0Var, 0L, 320L, xqVar);
        final int i10 = 1;
        g0 g0Var = new g0(this, context, i10);
        this.h = g0Var;
        g0Var.setListener(new bb.c(this, 28));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, mf.e(-1, -1, hs.E1));
        pg.e eVar = new pg.e(context);
        this.n = eVar;
        eVar.setListener(new h0(i10, this));
        frameLayout.addView(eVar, mf.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, mf.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        k2.p1.t(textView, 1, 14.0f);
        final int i11 = 0;
        textView.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, mf.e(-2, -1, hs.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: gi.k0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((ga) this.b).G.k0(-1, false, true);
                        break;
                    case 1:
                        m0 m0Var = this.b;
                        m0Var.h.l(true);
                        pg.e eVar2 = m0Var.n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        m0 m0Var2 = this.b;
                        ug.n1 n1Var = m0Var2.b;
                        if (n1Var != null) {
                            n1Var.H0 = new re();
                            m0Var2.h.b(m0Var2.b.H0);
                            ug.n1 n1Var2 = m0Var2.b;
                            n1Var2.H0.z = n1Var2.getOrientation();
                            m0Var2.b.k();
                            m0Var2.b.requestLayout();
                            m0Var2.b.A0.requestLayout();
                            m0Var2.b.A0.invalidate();
                            m0Var2.b.A0.post(new ei.z5(m0Var2, 19));
                        }
                        ((ga) m0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(bd.M0(2131751697, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, mf.e(-2, -1, hs.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: gi.k0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((ga) this.b).G.k0(-1, false, true);
                        break;
                    case 1:
                        m0 m0Var = this.b;
                        m0Var.h.l(true);
                        pg.e eVar2 = m0Var.n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        m0 m0Var2 = this.b;
                        ug.n1 n1Var = m0Var2.b;
                        if (n1Var != null) {
                            n1Var.H0 = new re();
                            m0Var2.h.b(m0Var2.b.H0);
                            ug.n1 n1Var2 = m0Var2.b;
                            n1Var2.H0.z = n1Var2.getOrientation();
                            m0Var2.b.k();
                            m0Var2.b.requestLayout();
                            m0Var2.b.A0.requestLayout();
                            m0Var2.b.A0.invalidate();
                            m0Var2.b.A0.post(new ei.z5(m0Var2, 19));
                        }
                        ((ga) m0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(bd.M0(2131744698, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, mf.e(-2, -1, hs.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: gi.k0
            public final /* synthetic */ m0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ((ga) this.b).G.k0(-1, false, true);
                        break;
                    case 1:
                        m0 m0Var = this.b;
                        m0Var.h.l(true);
                        pg.e eVar2 = m0Var.n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        m0 m0Var2 = this.b;
                        ug.n1 n1Var = m0Var2.b;
                        if (n1Var != null) {
                            n1Var.H0 = new re();
                            m0Var2.h.b(m0Var2.b.H0);
                            ug.n1 n1Var2 = m0Var2.b;
                            n1Var2.H0.z = n1Var2.getOrientation();
                            m0Var2.b.k();
                            m0Var2.b.requestLayout();
                            m0Var2.b.A0.requestLayout();
                            m0Var2.b.A0.invalidate();
                            m0Var2.b.A0.post(new ei.z5(m0Var2, 19));
                        }
                        ((ga) m0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        ug.n1 n1Var = this.b;
        if (n1Var == null) {
            return 1;
        }
        return (n1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        ug.n1 n1Var = this.b;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        float L = org.telegram.messenger.g0.L(52.0f);
        g0 g0Var = this.h;
        g0Var.setTopPadding(L);
        g0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z10, i3, i10, i11, i12);
    }

    public void set(ug.n1 n1Var) {
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
        re reVar = n1Var.H0;
        if (reVar == null) {
            reVar = null;
        }
        g0Var.p(n1Var.getOrientation(), this.E, reVar);
        float rotation = g0Var.getRotation();
        pg.e eVar = this.n;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.u5 u5Var = this.c;
        if (reVar != null) {
            eVar.b(reVar.d);
            eVar.setRotated(reVar.k != 0);
            eVar.setMirrored(reVar.l);
            u5Var.f(reVar.l, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            u5Var.getClass();
            u5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        l0 l0Var = this.e;
        l0Var.setVisibility(0);
        l0Var.invalidate();
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
