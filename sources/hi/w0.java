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
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class w0 extends FrameLayout {
    public final og.g E;
    public boolean F;
    public final f6 a;
    public tg.s1 b;
    public final org.telegram.ui.Components.c6 c;
    public final org.telegram.ui.Components.c6 d;
    public final v0 e;
    public final FrameLayout f;
    public final p0 h;
    public final og.f n;
    public final FrameLayout r;
    public float s;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public w0(Context context, f6 f6Var) {
        super(context);
        this.s = 0.0f;
        final int i7 = 2;
        this.w = new int[2];
        this.x = new int[2];
        this.y = new int[2];
        this.E = new og.g();
        this.a = f6Var;
        v0 v0Var = new v0(this, context);
        this.e = v0Var;
        kr krVar = kr.h;
        this.c = new org.telegram.ui.Components.c6(v0Var, 0L, 320L, krVar);
        this.d = new org.telegram.ui.Components.c6(v0Var, 0L, 320L, krVar);
        final int i10 = 1;
        p0 p0Var = new p0(this, context, i10);
        this.h = p0Var;
        final int i11 = 0;
        p0Var.setListener(new u0(this, i11));
        addView(p0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, c8.na.e(-1, -1, ks.E1));
        og.f fVar = new og.f(context);
        this.n = fVar;
        fVar.setListener(new q0(i10, this));
        frameLayout.addView(fVar, c8.na.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, c8.na.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131752577, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.na.e(-2, -1, ks.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.t0
            public final /* synthetic */ w0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((ya) this.b).G.k0(-1, false, true);
                        break;
                    case 1:
                        w0 w0Var = this.b;
                        w0Var.h.l(true);
                        og.f fVar2 = w0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        w0 w0Var2 = this.b;
                        tg.s1 s1Var = w0Var2.b;
                        if (s1Var != null) {
                            s1Var.I0 = new we();
                            w0Var2.h.b(w0Var2.b.I0);
                            tg.s1 s1Var2 = w0Var2.b;
                            s1Var2.I0.z = s1Var2.getOrientation();
                            w0Var2.b.k();
                            w0Var2.b.requestLayout();
                            w0Var2.b.B0.requestLayout();
                            w0Var2.b.B0.invalidate();
                            w0Var2.b.B0.post(new w(w0Var2, 3));
                        }
                        ((ya) w0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131751684, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.na.e(-2, -1, ks.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.t0
            public final /* synthetic */ w0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((ya) this.b).G.k0(-1, false, true);
                        break;
                    case 1:
                        w0 w0Var = this.b;
                        w0Var.h.l(true);
                        og.f fVar2 = w0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        w0 w0Var2 = this.b;
                        tg.s1 s1Var = w0Var2.b;
                        if (s1Var != null) {
                            s1Var.I0 = new we();
                            w0Var2.h.b(w0Var2.b.I0);
                            tg.s1 s1Var2 = w0Var2.b;
                            s1Var2.I0.z = s1Var2.getOrientation();
                            w0Var2.b.k();
                            w0Var2.b.requestLayout();
                            w0Var2.b.B0.requestLayout();
                            w0Var2.b.B0.invalidate();
                            w0Var2.b.B0.post(new w(w0Var2, 3));
                        }
                        ((ya) w0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.N0(2131744444, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.na.e(-2, -1, ks.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.t0
            public final /* synthetic */ w0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ((ya) this.b).G.k0(-1, false, true);
                        break;
                    case 1:
                        w0 w0Var = this.b;
                        w0Var.h.l(true);
                        og.f fVar2 = w0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        w0 w0Var2 = this.b;
                        tg.s1 s1Var = w0Var2.b;
                        if (s1Var != null) {
                            s1Var.I0 = new we();
                            w0Var2.h.b(w0Var2.b.I0);
                            tg.s1 s1Var2 = w0Var2.b;
                            s1Var2.I0.z = s1Var2.getOrientation();
                            w0Var2.b.k();
                            w0Var2.b.requestLayout();
                            w0Var2.b.B0.requestLayout();
                            w0Var2.b.B0.invalidate();
                            w0Var2.b.B0.post(new w(w0Var2, 3));
                        }
                        ((ya) w0Var2).G.k0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        tg.s1 s1Var = this.b;
        if (s1Var == null) {
            return 1;
        }
        return (s1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        tg.s1 s1Var = this.b;
        if (s1Var == null) {
            return 1;
        }
        return (s1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentHeight() : this.b.getContentWidth();
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
        p0 p0Var = this.h;
        p0Var.setTopPadding(L);
        p0Var.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
    }

    public void set(tg.s1 s1Var) {
        if (s1Var == null) {
            return;
        }
        this.b = s1Var;
        setVisibility(0);
        this.F = false;
        p0 p0Var = this.h;
        p0Var.K = true;
        getLocationOnScreen(this.w);
        this.a.getLocationOnScreen(this.x);
        s1Var.getLocationOnScreen(this.y);
        we weVar = s1Var.I0;
        if (weVar == null) {
            weVar = null;
        }
        p0Var.p(s1Var.getOrientation(), this.E, weVar);
        float rotation = p0Var.getRotation();
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
        p0Var.r(false);
        v0 v0Var = this.e;
        v0Var.setVisibility(0);
        v0Var.invalidate();
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.s - f10) < 0.001f) {
            return;
        }
        this.s = f10;
        this.e.invalidate();
        p0 p0Var = this.h;
        CropAreaView cropAreaView = p0Var.a;
        CropAreaView cropAreaView2 = p0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
    }
}
