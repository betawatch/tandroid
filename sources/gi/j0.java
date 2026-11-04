package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.re;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class j0 extends FrameLayout {
    public boolean E;
    public final y5 a;
    public final org.telegram.ui.Components.u5 b;
    public final org.telegram.ui.Components.u5 c;
    public final i0 d;
    public final FrameLayout e;
    public final g0 f;
    public final pg.e h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final pg.f x;
    public f7 y;

    public j0(Context context, y5 y5Var) {
        super(context);
        this.r = 0.0f;
        final int i3 = 2;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new pg.f();
        this.a = y5Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        xq xqVar = xq.h;
        this.b = new org.telegram.ui.Components.u5(i0Var, 0L, 320L, xqVar);
        this.c = new org.telegram.ui.Components.u5(this, 0L, 360L, xqVar);
        final int i10 = 0;
        g0 g0Var = new g0(this, context, i10);
        this.f = g0Var;
        g0Var.setListener(new android.support.v4.media.c(this, 26));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, mf.e(-1, -1, hs.E1));
        pg.e eVar = new pg.e(context);
        this.h = eVar;
        eVar.setListener(new h0(i10, this));
        frameLayout.addView(eVar, mf.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, mf.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        final int i11 = 1;
        k2.p1.t(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(bd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, mf.e(-2, -1, hs.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: gi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((fa) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        pg.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        f7 f7Var = j0Var2.y;
                        if (f7Var != null) {
                            f7Var.m0 = new re();
                            j0Var2.f.b(j0Var2.y.m0);
                            f7 f7Var2 = j0Var2.y;
                            f7Var2.m0.z = f7Var2.Q;
                        }
                        ((fa) j0Var2).F.k0(-1, false, true);
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
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: gi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((fa) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        pg.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        f7 f7Var = j0Var2.y;
                        if (f7Var != null) {
                            f7Var.m0 = new re();
                            j0Var2.f.b(j0Var2.y.m0);
                            f7 f7Var2 = j0Var2.y;
                            f7Var2.m0.z = f7Var2.Q;
                        }
                        ((fa) j0Var2).F.k0(-1, false, true);
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
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: gi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ((fa) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        pg.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        f7 f7Var = j0Var2.y;
                        if (f7Var != null) {
                            f7Var.m0 = new re();
                            j0Var2.f.b(j0Var2.y.m0);
                            f7 f7Var2 = j0Var2.y;
                            f7Var2.m0.z = f7Var2.Q;
                        }
                        ((fa) j0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        f7 f7Var = this.y;
        if (f7Var == null) {
            return 1;
        }
        int i3 = f7Var.Q;
        y5 y5Var = this.a;
        return (i3 == 90 || i3 == 270) ? y5Var.getContentWidth() : y5Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        f7 f7Var = this.y;
        if (f7Var == null) {
            return 1;
        }
        int i3 = f7Var.Q;
        y5 y5Var = this.a;
        return (i3 == 90 || i3 == 270) ? y5Var.getContentHeight() : y5Var.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        this.f.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i3, i10, i11, i12);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.r - f10) < 0.001f) {
            return;
        }
        this.r = f10;
        i0 i0Var = this.d;
        i0Var.setAlpha(f10);
        i0Var.invalidate();
        g0 g0Var = this.f;
        CropAreaView cropAreaView = g0Var.a;
        CropAreaView cropAreaView2 = g0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(f7 f7Var) {
        if (f7Var == null) {
            return;
        }
        this.y = f7Var;
        this.E = false;
        g0 g0Var = this.f;
        g0Var.K = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        y5 y5Var = this.a;
        y5Var.getLocationOnScreen(iArr);
        re reVar = f7Var.m0;
        if (reVar == null) {
            reVar = null;
        }
        g0Var.p(f7Var.Q, this.x, reVar);
        float rotation = g0Var.getRotation();
        pg.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.u5 u5Var = this.b;
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
        this.c.e(true, r5.i);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        y5Var.setCropEditorDrawing(this);
    }
}
