package kh;

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
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class n0 extends FrameLayout {
    public boolean A;
    public final r6 a;
    public yf.x1 b;
    public final org.telegram.ui.Components.y5 c;
    public final org.telegram.ui.Components.y5 d;
    public final m0 e;
    public final FrameLayout f;
    public final h0 h;
    public final tf.e n;
    public final FrameLayout r;
    public float s;
    public final int[] v;
    public final int[] w;
    public final int[] x;
    public final tf.f y;

    public n0(Context context, r6 r6Var) {
        super(context);
        this.s = 0.0f;
        this.v = new int[2];
        this.w = new int[2];
        this.x = new int[2];
        this.y = new tf.f();
        this.a = r6Var;
        m0 m0Var = new m0(this, context);
        this.e = m0Var;
        gr grVar = gr.h;
        this.c = new org.telegram.ui.Components.y5(m0Var, 0L, 320L, grVar);
        this.d = new org.telegram.ui.Components.y5(m0Var, 0L, 320L, grVar);
        h0 h0Var = new h0(this, context, 1);
        this.h = h0Var;
        h0Var.setListener(new fa.c(this, 24));
        addView(h0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        tf.e eVar = new tf.e(context);
        this.n = eVar;
        eVar.setListener(new i0(1, this));
        frameLayout.addView(eVar, g7.e6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, g7.e6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        j3.r0.u(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.f6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, g7.e6.e(-2, -1, 115));
        final int i9 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: kh.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        ((hb) this.b).B.l0(-1, false, true);
                        break;
                    case 1:
                        n0 n0Var = this.b;
                        n0Var.h.l(true);
                        tf.e eVar2 = n0Var.n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        yf.x1 x1Var = n0Var2.b;
                        if (x1Var != null) {
                            x1Var.C0 = new MediaController.CropState();
                            n0Var2.h.b(n0Var2.b.C0);
                            yf.x1 x1Var2 = n0Var2.b;
                            x1Var2.C0.orientation = x1Var2.getOrientation();
                            n0Var2.b.k();
                            n0Var2.b.requestLayout();
                            n0Var2.b.v0.requestLayout();
                            n0Var2.b.v0.invalidate();
                            n0Var2.b.v0.post(new ih.g(n0Var2, 28));
                        }
                        ((hb) n0Var2).B.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.f6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, g7.e6.e(-2, -1, 113));
        final int i10 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: kh.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((hb) this.b).B.l0(-1, false, true);
                        break;
                    case 1:
                        n0 n0Var = this.b;
                        n0Var.h.l(true);
                        tf.e eVar2 = n0Var.n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        yf.x1 x1Var = n0Var2.b;
                        if (x1Var != null) {
                            x1Var.C0 = new MediaController.CropState();
                            n0Var2.h.b(n0Var2.b.C0);
                            yf.x1 x1Var2 = n0Var2.b;
                            x1Var2.C0.orientation = x1Var2.getOrientation();
                            n0Var2.b.k();
                            n0Var2.b.requestLayout();
                            n0Var2.b.v0.requestLayout();
                            n0Var2.b.v0.invalidate();
                            n0Var2.b.v0.post(new ih.g(n0Var2, 28));
                        }
                        ((hb) n0Var2).B.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.f6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, g7.e6.e(-2, -1, 117));
        final int i11 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: kh.l0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((hb) this.b).B.l0(-1, false, true);
                        break;
                    case 1:
                        n0 n0Var = this.b;
                        n0Var.h.l(true);
                        tf.e eVar2 = n0Var.n;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        yf.x1 x1Var = n0Var2.b;
                        if (x1Var != null) {
                            x1Var.C0 = new MediaController.CropState();
                            n0Var2.h.b(n0Var2.b.C0);
                            yf.x1 x1Var2 = n0Var2.b;
                            x1Var2.C0.orientation = x1Var2.getOrientation();
                            n0Var2.b.k();
                            n0Var2.b.requestLayout();
                            n0Var2.b.v0.requestLayout();
                            n0Var2.b.v0.invalidate();
                            n0Var2.b.v0.post(new ih.g(n0Var2, 28));
                        }
                        ((hb) n0Var2).B.l0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        yf.x1 x1Var = this.b;
        if (x1Var == null) {
            return 1;
        }
        return (x1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        yf.x1 x1Var = this.b;
        if (x1Var == null) {
            return 1;
        }
        return (x1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentHeight() : this.b.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.s;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        float dp = AndroidUtilities.dp(52.0f);
        h0 h0Var = this.h;
        h0Var.setTopPadding(dp);
        h0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z10, i9, i10, i11, i12);
    }

    public void set(yf.x1 x1Var) {
        if (x1Var == null) {
            return;
        }
        this.b = x1Var;
        setVisibility(0);
        this.A = false;
        h0 h0Var = this.h;
        h0Var.F = true;
        getLocationOnScreen(this.v);
        this.a.getLocationOnScreen(this.w);
        x1Var.getLocationOnScreen(this.x);
        MediaController.CropState cropState = x1Var.C0;
        if (cropState == null) {
            cropState = null;
        }
        h0Var.p(x1Var.getOrientation(), this.y, cropState);
        float rotation = h0Var.getRotation();
        tf.e eVar = this.n;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.y5 y5Var = this.c;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            eVar.setRotated(cropState.transformRotation != 0);
            eVar.setMirrored(cropState.mirrored);
            y5Var.f(cropState.mirrored, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            y5Var.getClass();
            y5Var.d(0.0f, false);
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
