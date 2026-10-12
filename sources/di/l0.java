package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.es;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public abstract class l0 extends FrameLayout {
    public boolean E;
    public final a7 a;
    public rg.z1 b;
    public final org.telegram.ui.Components.g6 c;
    public final org.telegram.ui.Components.g6 d;
    public final k0 e;
    public final FrameLayout f;
    public final g0 h;
    public final mg.f n;
    public final FrameLayout r;
    public float s;
    public final int[] v;
    public final int[] w;
    public final int[] x;
    public final mg.g y;

    public l0(Context context, a7 a7Var) {
        super(context);
        this.s = 0.0f;
        this.v = new int[2];
        this.w = new int[2];
        this.x = new int[2];
        this.y = new mg.g();
        this.a = a7Var;
        k0 k0Var = new k0(this, context);
        this.e = k0Var;
        es esVar = es.h;
        this.c = new org.telegram.ui.Components.g6(k0Var, 0L, 320L, esVar);
        this.d = new org.telegram.ui.Components.g6(k0Var, 0L, 320L, esVar);
        g0 g0Var = new g0(this, context, 1);
        this.h = g0Var;
        g0Var.setListener(new ya.c(this, 15));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        mg.f fVar = new mg.f(context);
        this.n = fVar;
        fVar.setListener(new a6.i(this, 14));
        frameLayout.addView(fVar, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.a6.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.g6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.d0.c(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.a6.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: di.j0
            public final /* synthetic */ l0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((vb) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        l0 l0Var = this.b;
                        l0Var.h.l(true);
                        mg.f fVar2 = l0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        l0 l0Var2 = this.b;
                        rg.z1 z1Var = l0Var2.b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            l0Var2.h.b(l0Var2.b.G0);
                            rg.z1 z1Var2 = l0Var2.b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            l0Var2.b.k();
                            l0Var2.b.requestLayout();
                            l0Var2.b.z0.requestLayout();
                            l0Var2.b.z0.invalidate();
                            l0Var2.b.z0.post(new bi.la(l0Var2, 17));
                        }
                        ((vb) l0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.g6.g0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.d0.c(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.a6.e(-2, -1, 113));
        final int i11 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: di.j0
            public final /* synthetic */ l0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((vb) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        l0 l0Var = this.b;
                        l0Var.h.l(true);
                        mg.f fVar2 = l0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        l0 l0Var2 = this.b;
                        rg.z1 z1Var = l0Var2.b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            l0Var2.h.b(l0Var2.b.G0);
                            rg.z1 z1Var2 = l0Var2.b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            l0Var2.b.k();
                            l0Var2.b.requestLayout();
                            l0Var2.b.z0.requestLayout();
                            l0Var2.b.z0.invalidate();
                            l0Var2.b.z0.post(new bi.la(l0Var2, 17));
                        }
                        ((vb) l0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.g6.g0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.d0.c(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.a6.e(-2, -1, 117));
        final int i12 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: di.j0
            public final /* synthetic */ l0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((vb) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        l0 l0Var = this.b;
                        l0Var.h.l(true);
                        mg.f fVar2 = l0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        l0 l0Var2 = this.b;
                        rg.z1 z1Var = l0Var2.b;
                        if (z1Var != null) {
                            z1Var.G0 = new MediaController.CropState();
                            l0Var2.h.b(l0Var2.b.G0);
                            rg.z1 z1Var2 = l0Var2.b;
                            z1Var2.G0.orientation = z1Var2.getOrientation();
                            l0Var2.b.k();
                            l0Var2.b.requestLayout();
                            l0Var2.b.z0.requestLayout();
                            l0Var2.b.z0.invalidate();
                            l0Var2.b.z0.post(new bi.la(l0Var2, 17));
                        }
                        ((vb) l0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        rg.z1 z1Var = this.b;
        if (z1Var == null) {
            return 1;
        }
        return (z1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        rg.z1 z1Var = this.b;
        if (z1Var == null) {
            return 1;
        }
        return (z1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentHeight() : this.b.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float dp = AndroidUtilities.dp(52.0f);
        g0 g0Var = this.h;
        g0Var.setTopPadding(dp);
        g0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(rg.z1 z1Var) {
        if (z1Var == null) {
            return;
        }
        this.b = z1Var;
        setVisibility(0);
        this.E = false;
        g0 g0Var = this.h;
        g0Var.J = true;
        getLocationOnScreen(this.v);
        this.a.getLocationOnScreen(this.w);
        z1Var.getLocationOnScreen(this.x);
        MediaController.CropState cropState = z1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(z1Var.getOrientation(), this.y, cropState);
        float rotation = g0Var.getRotation();
        mg.f fVar = this.n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.g6 g6Var = this.c;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            fVar.setRotated(cropState.transformRotation != 0);
            fVar.setMirrored(cropState.mirrored);
            g6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            g6Var.getClass();
            g6Var.d(0.0f, false);
        }
        g0Var.r(false);
        k0 k0Var = this.e;
        k0Var.setVisibility(0);
        k0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.s - f7) < 0.001f) {
            return;
        }
        this.s = f7;
        this.e.invalidate();
        g0 g0Var = this.h;
        CropAreaView cropAreaView = g0Var.a;
        CropAreaView cropAreaView2 = g0Var.a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}
