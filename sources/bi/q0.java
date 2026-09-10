package bi;

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
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class q0 extends FrameLayout {
    public boolean E;
    public final e8 a;
    public pg.x1 b;
    public final org.telegram.ui.Components.d6 c;
    public final org.telegram.ui.Components.d6 d;
    public final p0 e;
    public final FrameLayout f;
    public final l0 h;
    public final kg.f n;
    public final FrameLayout r;
    public float s;
    public final int[] v;
    public final int[] w;
    public final int[] x;
    public final kg.g y;

    public q0(Context context, e8 e8Var) {
        super(context);
        this.s = 0.0f;
        this.v = new int[2];
        this.w = new int[2];
        this.x = new int[2];
        this.y = new kg.g();
        this.a = e8Var;
        p0 p0Var = new p0(this, context);
        this.e = p0Var;
        wr wrVar = wr.h;
        this.c = new org.telegram.ui.Components.d6(p0Var, 0L, 320L, wrVar);
        this.d = new org.telegram.ui.Components.d6(p0Var, 0L, 320L, wrVar);
        l0 l0Var = new l0(this, context, 1);
        this.h = l0Var;
        l0Var.setListener(new xa.c(this, 9));
        addView(l0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        kg.f fVar = new kg.f(context);
        this.n = fVar;
        fVar.setListener(new a6.i(this, 8));
        frameLayout.addView(fVar, w7.a6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.r = frameLayout2;
        frameLayout.addView(frameLayout2, w7.a6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.r6.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.a6.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.o0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((jd) this.b).F.l0(-1, false, true);
                        break;
                    case 1:
                        q0 q0Var = this.b;
                        q0Var.h.l(true);
                        kg.f fVar2 = q0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        q0 q0Var2 = this.b;
                        pg.x1 x1Var = q0Var2.b;
                        if (x1Var != null) {
                            x1Var.G0 = new MediaController.CropState();
                            q0Var2.h.b(q0Var2.b.G0);
                            pg.x1 x1Var2 = q0Var2.b;
                            x1Var2.G0.orientation = x1Var2.getOrientation();
                            q0Var2.b.k();
                            q0Var2.b.requestLayout();
                            q0Var2.b.z0.requestLayout();
                            q0Var2.b.z0.invalidate();
                            q0Var2.b.z0.post(new a3.d(q0Var2, 14));
                        }
                        ((jd) q0Var2).F.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.r6.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.a6.e(-2, -1, 113));
        final int i11 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.o0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((jd) this.b).F.l0(-1, false, true);
                        break;
                    case 1:
                        q0 q0Var = this.b;
                        q0Var.h.l(true);
                        kg.f fVar2 = q0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        q0 q0Var2 = this.b;
                        pg.x1 x1Var = q0Var2.b;
                        if (x1Var != null) {
                            x1Var.G0 = new MediaController.CropState();
                            q0Var2.h.b(q0Var2.b.G0);
                            pg.x1 x1Var2 = q0Var2.b;
                            x1Var2.G0.orientation = x1Var2.getOrientation();
                            q0Var2.b.k();
                            q0Var2.b.requestLayout();
                            q0Var2.b.z0.requestLayout();
                            q0Var2.b.z0.invalidate();
                            q0Var2.b.z0.post(new a3.d(q0Var2, 14));
                        }
                        ((jd) q0Var2).F.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.r6.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.a6.e(-2, -1, 117));
        final int i12 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: bi.o0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((jd) this.b).F.l0(-1, false, true);
                        break;
                    case 1:
                        q0 q0Var = this.b;
                        q0Var.h.l(true);
                        kg.f fVar2 = q0Var.n;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        break;
                    default:
                        q0 q0Var2 = this.b;
                        pg.x1 x1Var = q0Var2.b;
                        if (x1Var != null) {
                            x1Var.G0 = new MediaController.CropState();
                            q0Var2.h.b(q0Var2.b.G0);
                            pg.x1 x1Var2 = q0Var2.b;
                            x1Var2.G0.orientation = x1Var2.getOrientation();
                            q0Var2.b.k();
                            q0Var2.b.requestLayout();
                            q0Var2.b.z0.requestLayout();
                            q0Var2.b.z0.invalidate();
                            q0Var2.b.z0.post(new a3.d(q0Var2, 14));
                        }
                        ((jd) q0Var2).F.l0(-1, false, true);
                        break;
                }
            }
        });
        new LinearLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        pg.x1 x1Var = this.b;
        if (x1Var == null) {
            return 1;
        }
        return (x1Var.getOrientation() == 90 || this.b.getOrientation() == 270) ? this.b.getContentWidth() : this.b.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        pg.x1 x1Var = this.b;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float dp = AndroidUtilities.dp(52.0f);
        l0 l0Var = this.h;
        l0Var.setTopPadding(dp);
        l0Var.setBottomPadding(AndroidUtilities.dp(116.0f) + this.f.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void set(pg.x1 x1Var) {
        if (x1Var == null) {
            return;
        }
        this.b = x1Var;
        setVisibility(0);
        this.E = false;
        l0 l0Var = this.h;
        l0Var.J = true;
        getLocationOnScreen(this.v);
        this.a.getLocationOnScreen(this.w);
        x1Var.getLocationOnScreen(this.x);
        MediaController.CropState cropState = x1Var.G0;
        if (cropState == null) {
            cropState = null;
        }
        l0Var.p(x1Var.getOrientation(), this.y, cropState);
        float rotation = l0Var.getRotation();
        kg.f fVar = this.n;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.c;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            fVar.setRotated(cropState.transformRotation != 0);
            fVar.setMirrored(cropState.mirrored);
            d6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            d6Var.getClass();
            d6Var.d(0.0f, false);
        }
        l0Var.r(false);
        p0 p0Var = this.e;
        p0Var.setVisibility(0);
        p0Var.invalidate();
    }

    public void setAppearProgress(float f7) {
        if (Math.abs(this.s - f7) < 0.001f) {
            return;
        }
        this.s = f7;
        this.e.invalidate();
        l0 l0Var = this.h;
        CropAreaView cropAreaView = l0Var.a;
        CropAreaView cropAreaView2 = l0Var.a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
    }
}
