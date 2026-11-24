// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class j43 extends FrameLayout {
    public final n43 E;
    public boolean F;
    public final k9b a;
    public g88 b;
    public final ln c;
    public final ln d;
    public final i43 e;
    public final FrameLayout f;
    public final b43 h;
    public final m43 n;
    public final FrameLayout r;
    public float s;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public j43(Context context, k9b k9bVar) {
        super(context);
        this.s = 0.0f;
        final byte b = 2;
        this.w = new int[2];
        this.x = new int[2];
        this.y = new int[2];
        this.E = new n43();
        this.a = k9bVar;
        i43 i43Var = new i43(this, context);
        this.e = i43Var;
        d53 d53Var = d53.h;
        this.c = new ln(i43Var, 0L, 320L, d53Var);
        this.d = new ln(i43Var, 0L, 320L, d53Var);
        final byte b2 = 1;
        b43 b43Var = new b43(this, context, b2);
        this.h = b43Var;
        b43Var.setListener(new nl9((Object) this, (byte) 24));
        addView(b43Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, qoe.e(-1, -1, nm7.D1));
        m43 m43Var = new m43(context);
        this.n = m43Var;
        m43Var.setListener(new c43(this, b2));
        frameLayout.addView(m43Var, qoe.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, qoe.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        ts2.s(textView, 1, 14.0f);
        final byte b3 = 0;
        textView.setBackground(cmb.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(jb6.M0(2131752542, null));
        textView.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        frameLayout2.addView(textView, qoe.e(-2, -1, nm7.z1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: h43
            public final /* synthetic */ j43 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                j43 j43Var = this.b;
                switch (b4) {
                    case 0:
                        ((h9b) j43Var).G.k0(-1, false, true);
                        break;
                    case 1:
                        j43Var.h.l(true);
                        m43 m43Var2 = j43Var.n;
                        m43Var2.setRotated(false);
                        m43Var2.setMirrored(false);
                        m43Var2.b(0.0f);
                        break;
                    default:
                        g88 g88Var = j43Var.b;
                        if (g88Var != null) {
                            g88Var.I0 = new ao6();
                            j43Var.h.a(j43Var.b.I0);
                            g88 g88Var2 = j43Var.b;
                            g88Var2.I0.z = g88Var2.getOrientation();
                            j43Var.b.k();
                            j43Var.b.requestLayout();
                            j43Var.b.B0.requestLayout();
                            j43Var.b.B0.invalidate();
                            j43Var.b.B0.post(new xf2(j43Var, (byte) 20));
                        }
                        ((h9b) j43Var).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gm.o());
        textView2.setBackground(cmb.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(jb6.M0(2131751633, null));
        textView2.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        frameLayout2.addView(textView2, qoe.e(-2, -1, nm7.x1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: h43
            public final /* synthetic */ j43 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b2;
                j43 j43Var = this.b;
                switch (b4) {
                    case 0:
                        ((h9b) j43Var).G.k0(-1, false, true);
                        break;
                    case 1:
                        j43Var.h.l(true);
                        m43 m43Var2 = j43Var.n;
                        m43Var2.setRotated(false);
                        m43Var2.setMirrored(false);
                        m43Var2.b(0.0f);
                        break;
                    default:
                        g88 g88Var = j43Var.b;
                        if (g88Var != null) {
                            g88Var.I0 = new ao6();
                            j43Var.h.a(j43Var.b.I0);
                            g88 g88Var2 = j43Var.b;
                            g88Var2.I0.z = g88Var2.getOrientation();
                            j43Var.b.k();
                            j43Var.b.requestLayout();
                            j43Var.b.B0.requestLayout();
                            j43Var.b.B0.invalidate();
                            j43Var.b.B0.post(new xf2(j43Var, (byte) 20));
                        }
                        ((h9b) j43Var).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gm.o());
        textView3.setBackground(cmb.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(jb6.M0(2131744374, null));
        textView3.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        frameLayout2.addView(textView3, qoe.e(-2, -1, nm7.B1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: h43
            public final /* synthetic */ j43 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b;
                j43 j43Var = this.b;
                switch (b4) {
                    case 0:
                        ((h9b) j43Var).G.k0(-1, false, true);
                        break;
                    case 1:
                        j43Var.h.l(true);
                        m43 m43Var2 = j43Var.n;
                        m43Var2.setRotated(false);
                        m43Var2.setMirrored(false);
                        m43Var2.b(0.0f);
                        break;
                    default:
                        g88 g88Var = j43Var.b;
                        if (g88Var != null) {
                            g88Var.I0 = new ao6();
                            j43Var.h.a(j43Var.b.I0);
                            g88 g88Var2 = j43Var.b;
                            g88Var2.I0.z = g88Var2.getOrientation();
                            j43Var.b.k();
                            j43Var.b.requestLayout();
                            j43Var.b.B0.requestLayout();
                            j43Var.b.B0.invalidate();
                            j43Var.b.B0.post(new xf2(j43Var, (byte) 20));
                        }
                        ((h9b) j43Var).G.k0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        g88 g88Var = this.b;
        if (g88Var == null) {
            return 1;
        }
        return (g88Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        g88 g88Var = this.b;
        if (g88Var == null) {
            return 1;
        }
        return (g88Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentHeight() : this.b.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float L = gm.L(52.0f);
        b43 b43Var = this.h;
        b43Var.setTopPadding(L);
        b43Var.setBottomPadding(gm.L(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z, i, i2, i3, i4);
    }

    public void set(g88 g88Var) {
        if (g88Var == null) {
            return;
        }
        this.b = g88Var;
        setVisibility(0);
        this.F = false;
        b43 b43Var = this.h;
        b43Var.K = true;
        getLocationOnScreen(this.w);
        this.a.getLocationOnScreen(this.x);
        g88Var.getLocationOnScreen(this.y);
        ao6 ao6Var = g88Var.I0;
        if (ao6Var == null) {
            ao6Var = null;
        }
        b43Var.p(g88Var.getOrientation(), this.E, ao6Var);
        float rotation = b43Var.getRotation();
        m43 m43Var = this.n;
        m43Var.setRotation(rotation);
        ln lnVar = this.c;
        if (ao6Var != null) {
            m43Var.b(ao6Var.d);
            m43Var.setRotated(ao6Var.k != 0);
            m43Var.setMirrored(ao6Var.l);
            lnVar.f(ao6Var.l, false);
        } else {
            m43Var.b(0.0f);
            m43Var.setRotated(false);
            m43Var.setMirrored(false);
            lnVar.getClass();
            lnVar.e(false, 0.0f);
        }
        b43Var.r(false);
        i43 i43Var = this.e;
        i43Var.setVisibility(0);
        i43Var.invalidate();
    }

    public void setAppearProgress(float f) {
        if (Math.abs(this.s - f) < 0.001f) {
            return;
        }
        this.s = f;
        this.e.invalidate();
        b43 b43Var = this.h;
        CropAreaView cropAreaView = b43Var.a;
        CropAreaView cropAreaView2 = b43Var.a;
        cropAreaView.setDimAlpha(0.5f * f);
        cropAreaView2.setFrameAlpha(f);
        cropAreaView2.invalidate();
    }
}
