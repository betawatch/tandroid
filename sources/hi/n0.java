package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public abstract class n0 extends FrameLayout {
    public final og.g E;
    public boolean F;
    public final w5 a;
    public tg.n1 b;
    public final org.telegram.ui.Components.c6 c;
    public final org.telegram.ui.Components.c6 d;
    public final m0 e;
    public final FrameLayout f;
    public final h0 h;
    public final og.f n;
    public final FrameLayout r;
    public float s;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public n0(Context context, w5 w5Var) {
        super(context);
        this.s = 0.0f;
        final int i7 = 2;
        this.w = new int[2];
        this.x = new int[2];
        this.y = new int[2];
        this.E = new og.g();
        this.a = w5Var;
        m0 m0Var = new m0(this, context);
        this.e = m0Var;
        lr lrVar = lr.h;
        this.c = new org.telegram.ui.Components.c6(m0Var, 0L, 320L, lrVar);
        this.d = new org.telegram.ui.Components.c6(m0Var, 0L, 320L, lrVar);
        final int i10 = 1;
        h0 h0Var = new h0(this, context, i10);
        this.h = h0Var;
        h0Var.setListener(new h9.g1(this, i10));
        addView(h0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -1, ks.E1));
        og.f fVar = new og.f(context);
        this.n = fVar;
        fVar.setListener(new i0(i10, this));
        frameLayout.addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        final int i11 = 0;
        textView.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.M0(2131752578, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ma.e(-2, -1, ks.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((ea) this.b).G.k0(-1, false, true);
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
                            n1Var.H0 = new we();
                            n0Var2.h.b(n0Var2.b.H0);
                            tg.n1 n1Var2 = n0Var2.b;
                            n1Var2.H0.z = n1Var2.getOrientation();
                            n0Var2.b.k();
                            n0Var2.b.requestLayout();
                            n0Var2.b.A0.requestLayout();
                            n0Var2.b.A0.invalidate();
                            n0Var2.b.A0.post(new k(n0Var2, 2));
                        }
                        ((ea) n0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.M0(2131751685, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ma.e(-2, -1, ks.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((ea) this.b).G.k0(-1, false, true);
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
                            n1Var.H0 = new we();
                            n0Var2.h.b(n0Var2.b.H0);
                            tg.n1 n1Var2 = n0Var2.b;
                            n1Var2.H0.z = n1Var2.getOrientation();
                            n0Var2.b.k();
                            n0Var2.b.requestLayout();
                            n0Var2.b.A0.requestLayout();
                            n0Var2.b.A0.invalidate();
                            n0Var2.b.A0.post(new k(n0Var2, 2));
                        }
                        ((ea) n0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.M0(2131744453, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ma.e(-2, -1, ks.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ((ea) this.b).G.k0(-1, false, true);
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
                            n1Var.H0 = new we();
                            n0Var2.h.b(n0Var2.b.H0);
                            tg.n1 n1Var2 = n0Var2.b;
                            n1Var2.H0.z = n1Var2.getOrientation();
                            n0Var2.b.k();
                            n0Var2.b.requestLayout();
                            n0Var2.b.A0.requestLayout();
                            n0Var2.b.A0.invalidate();
                            n0Var2.b.A0.post(new k(n0Var2, 2));
                        }
                        ((ea) n0Var2).G.k0(-1, false, true);
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
        h0 h0Var = this.h;
        h0Var.setTopPadding(L);
        h0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void set(tg.n1 n1Var) {
        if (n1Var == null) {
            return;
        }
        this.b = n1Var;
        setVisibility(0);
        this.F = false;
        h0 h0Var = this.h;
        h0Var.K = true;
        getLocationOnScreen(this.w);
        this.a.getLocationOnScreen(this.x);
        n1Var.getLocationOnScreen(this.y);
        we weVar = n1Var.H0;
        if (weVar == null) {
            weVar = null;
        }
        h0Var.p(n1Var.getOrientation(), this.E, weVar);
        float rotation = h0Var.getRotation();
        og.f fVar = this.n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.c6 c6Var = this.c;
        if (weVar != null) {
            fVar.b(weVar.d);
            fVar.setRotated(weVar.k != 0);
            fVar.setMirrored(weVar.l);
            c6Var.f(weVar.l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            c6Var.getClass();
            c6Var.e(false, 0.0f);
        }
        h0Var.r(false);
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
        h0 h0Var = this.h;
        CropAreaView cropAreaView = h0Var.a;
        CropAreaView cropAreaView2 = h0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
