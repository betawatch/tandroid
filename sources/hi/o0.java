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
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class o0 extends FrameLayout {
    public final og.g E;
    public boolean F;
    public final v5 a;
    public tg.p1 b;
    public final org.telegram.ui.Components.d6 c;
    public final org.telegram.ui.Components.d6 d;
    public final n0 e;
    public final FrameLayout f;
    public final i0 h;
    public final og.f n;
    public final FrameLayout r;
    public float s;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public o0(Context context, v5 v5Var) {
        super(context);
        this.s = 0.0f;
        final int i7 = 2;
        this.w = new int[2];
        this.x = new int[2];
        this.y = new int[2];
        this.E = new og.g();
        this.a = v5Var;
        n0 n0Var = new n0(this, context);
        this.e = n0Var;
        nr nrVar = nr.h;
        this.c = new org.telegram.ui.Components.d6(n0Var, 0L, 320L, nrVar);
        this.d = new org.telegram.ui.Components.d6(n0Var, 0L, 320L, nrVar);
        final int i10 = 1;
        i0 i0Var = new i0(this, context, i10);
        this.h = i0Var;
        i0Var.setListener(new h9.g1(this, i10));
        addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -1, ks.E1));
        og.f fVar = new og.f(context);
        this.n = fVar;
        fVar.setListener(new j0(i10, this));
        frameLayout.addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        final int i11 = 0;
        textView.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131752577, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ma.e(-2, -1, ks.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.m0
            public final /* synthetic */ o0 b;

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
                        o0 o0Var = this.b;
                        o0Var.h.l(true);
                        og.f fVar2 = o0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        o0 o0Var2 = this.b;
                        tg.p1 p1Var = o0Var2.b;
                        if (p1Var != null) {
                            p1Var.H0 = new we();
                            o0Var2.h.b(o0Var2.b.H0);
                            tg.p1 p1Var2 = o0Var2.b;
                            p1Var2.H0.z = p1Var2.getOrientation();
                            o0Var2.b.k();
                            o0Var2.b.requestLayout();
                            o0Var2.b.A0.requestLayout();
                            o0Var2.b.A0.invalidate();
                            o0Var2.b.A0.post(new l(o0Var2, 2));
                        }
                        ((da) o0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131751684, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ma.e(-2, -1, ks.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.m0
            public final /* synthetic */ o0 b;

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
                        o0 o0Var = this.b;
                        o0Var.h.l(true);
                        og.f fVar2 = o0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        o0 o0Var2 = this.b;
                        tg.p1 p1Var = o0Var2.b;
                        if (p1Var != null) {
                            p1Var.H0 = new we();
                            o0Var2.h.b(o0Var2.b.H0);
                            tg.p1 p1Var2 = o0Var2.b;
                            p1Var2.H0.z = p1Var2.getOrientation();
                            o0Var2.b.k();
                            o0Var2.b.requestLayout();
                            o0Var2.b.A0.requestLayout();
                            o0Var2.b.A0.invalidate();
                            o0Var2.b.A0.post(new l(o0Var2, 2));
                        }
                        ((da) o0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.N0(2131744447, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ma.e(-2, -1, ks.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.m0
            public final /* synthetic */ o0 b;

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
                        o0 o0Var = this.b;
                        o0Var.h.l(true);
                        og.f fVar2 = o0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        o0 o0Var2 = this.b;
                        tg.p1 p1Var = o0Var2.b;
                        if (p1Var != null) {
                            p1Var.H0 = new we();
                            o0Var2.h.b(o0Var2.b.H0);
                            tg.p1 p1Var2 = o0Var2.b;
                            p1Var2.H0.z = p1Var2.getOrientation();
                            o0Var2.b.k();
                            o0Var2.b.requestLayout();
                            o0Var2.b.A0.requestLayout();
                            o0Var2.b.A0.invalidate();
                            o0Var2.b.A0.post(new l(o0Var2, 2));
                        }
                        ((da) o0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        tg.p1 p1Var = this.b;
        if (p1Var == null) {
            return 1;
        }
        return (p1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        tg.p1 p1Var = this.b;
        if (p1Var == null) {
            return 1;
        }
        return (p1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentHeight() : this.b.getContentWidth();
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
        i0 i0Var = this.h;
        i0Var.setTopPadding(L);
        i0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void set(tg.p1 p1Var) {
        if (p1Var == null) {
            return;
        }
        this.b = p1Var;
        setVisibility(0);
        this.F = false;
        i0 i0Var = this.h;
        i0Var.K = true;
        getLocationOnScreen(this.w);
        this.a.getLocationOnScreen(this.x);
        p1Var.getLocationOnScreen(this.y);
        we weVar = p1Var.H0;
        if (weVar == null) {
            weVar = null;
        }
        i0Var.p(p1Var.getOrientation(), this.E, weVar);
        float rotation = i0Var.getRotation();
        og.f fVar = this.n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.c;
        if (weVar != null) {
            fVar.b(weVar.d);
            fVar.setRotated(weVar.k != 0);
            fVar.setMirrored(weVar.l);
            d6Var.f(weVar.l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            d6Var.getClass();
            d6Var.e(false, 0.0f);
        }
        i0Var.r(false);
        n0 n0Var = this.e;
        n0Var.setVisibility(0);
        n0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.s - f10) < 0.001f) {
            return;
        }
        this.s = f10;
        this.e.invalidate();
        i0 i0Var = this.h;
        CropAreaView cropAreaView = i0Var.a;
        CropAreaView cropAreaView2 = i0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
