package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class j0 extends FrameLayout {
    public final f6 a;
    public final org.telegram.ui.Components.d6 b;
    public final org.telegram.ui.Components.d6 c;
    public final i0 d;
    public final FrameLayout e;
    public final g0 f;
    public final wf.e h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] v;
    public final wf.f w;
    public o7 x;
    public boolean y;

    public j0(Context context, f6 f6Var) {
        super(context);
        this.r = 0.0f;
        this.s = new int[2];
        this.v = new int[2];
        this.w = new wf.f();
        this.a = f6Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        jr jrVar = jr.h;
        this.b = new org.telegram.ui.Components.d6(i0Var, 0L, 320L, jrVar);
        this.c = new org.telegram.ui.Components.d6(this, 0L, 360L, jrVar);
        g0 g0Var = new g0(this, context, 0);
        this.f = g0Var;
        g0Var.setListener(new ha.c(this, 28));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        wf.e eVar = new wf.e(context);
        this.h = eVar;
        eVar.setListener(new h0(0, this));
        frameLayout.addView(eVar, i7.f6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, i7.f6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        th.n(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.b.e(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, i7.f6.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: nh.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((ra) this.b).A.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        wf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        o7 o7Var = j0Var2.x;
                        if (o7Var != null) {
                            o7Var.m0 = new MediaController.CropState();
                            j0Var2.f.b(j0Var2.x.m0);
                            o7 o7Var2 = j0Var2.x;
                            o7Var2.m0.orientation = o7Var2.Q;
                        }
                        ((ra) j0Var2).A.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.b.e(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, i7.f6.e(-2, -1, 113));
        final int i11 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: nh.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((ra) this.b).A.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        wf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        o7 o7Var = j0Var2.x;
                        if (o7Var != null) {
                            o7Var.m0 = new MediaController.CropState();
                            j0Var2.f.b(j0Var2.x.m0);
                            o7 o7Var2 = j0Var2.x;
                            o7Var2.m0.orientation = o7Var2.Q;
                        }
                        ((ra) j0Var2).A.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.b.e(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, i7.f6.e(-2, -1, 117));
        final int i12 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: nh.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((ra) this.b).A.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        wf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        o7 o7Var = j0Var2.x;
                        if (o7Var != null) {
                            o7Var.m0 = new MediaController.CropState();
                            j0Var2.f.b(j0Var2.x.m0);
                            o7 o7Var2 = j0Var2.x;
                            o7Var2.m0.orientation = o7Var2.Q;
                        }
                        ((ra) j0Var2).A.l0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        o7 o7Var = this.x;
        if (o7Var == null) {
            return 1;
        }
        int i10 = o7Var.Q;
        f6 f6Var = this.a;
        return (i10 == 90 || i10 == 270) ? f6Var.getContentWidth() : f6Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        o7 o7Var = this.x;
        if (o7Var == null) {
            return 1;
        }
        int i10 = o7Var.Q;
        f6 f6Var = this.a;
        return (i10 == 90 || i10 == 270) ? f6Var.getContentHeight() : f6Var.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i10, i11, i12, i13);
    }

    public void setAppearProgress(float f9) {
        if (Math.abs(this.r - f9) < 0.001f) {
            return;
        }
        this.r = f9;
        i0 i0Var = this.d;
        i0Var.setAlpha(f9);
        i0Var.invalidate();
        g0 g0Var = this.f;
        CropAreaView cropAreaView = g0Var.a;
        CropAreaView cropAreaView2 = g0Var.a;
        cropAreaView.setDimAlpha(0.5f * f9);
        cropAreaView2.setFrameAlpha(f9);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(o7 o7Var) {
        if (o7Var == null) {
            return;
        }
        this.x = o7Var;
        this.y = false;
        g0 g0Var = this.f;
        g0Var.F = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.v;
        f6 f6Var = this.a;
        f6Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = o7Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(o7Var.Q, this.w, cropState);
        float rotation = g0Var.getRotation();
        wf.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.b;
        if (cropState != null) {
            eVar.b(cropState.cropRotate);
            eVar.setRotated(cropState.transformRotation != 0);
            eVar.setMirrored(cropState.mirrored);
            d6Var.f(cropState.mirrored, false);
        } else {
            eVar.b(0.0f);
            eVar.setRotated(false);
            eVar.setMirrored(false);
            d6Var.getClass();
            d6Var.d(0.0f, false);
        }
        g0Var.r(false);
        this.c.d(r5.i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        f6Var.setCropEditorDrawing(this);
    }
}
