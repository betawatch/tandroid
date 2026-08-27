package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public abstract class j0 extends FrameLayout {
    public final q6 a;
    public final org.telegram.ui.Components.y5 b;
    public final org.telegram.ui.Components.y5 c;
    public final i0 d;
    public final FrameLayout e;
    public final g0 f;
    public final uf.e h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] v;
    public final uf.f w;
    public z7 x;
    public boolean y;

    public j0(Context context, q6 q6Var) {
        super(context);
        this.r = 0.0f;
        this.s = new int[2];
        this.v = new int[2];
        this.w = new uf.f();
        this.a = q6Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        er erVar = er.h;
        this.b = new org.telegram.ui.Components.y5(i0Var, 0L, 320L, erVar);
        this.c = new org.telegram.ui.Components.y5(this, 0L, 360L, erVar);
        g0 g0Var = new g0(this, context, 0);
        this.f = g0Var;
        g0Var.setListener(new ae.b(this, 24));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, h7.z5.e(-1, -1, 119));
        uf.e eVar = new uf.e(context);
        this.h = eVar;
        eVar.setListener(new h0(0, this));
        frameLayout.addView(eVar, h7.z5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, h7.z5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        org.telegram.ui.Cells.pa.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, h7.z5.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: lh.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((db) this.b).A.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        uf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        z7 z7Var = j0Var2.x;
                        if (z7Var != null) {
                            z7Var.m0 = new MediaController.CropState();
                            j0Var2.f.b(j0Var2.x.m0);
                            z7 z7Var2 = j0Var2.x;
                            z7Var2.m0.orientation = z7Var2.Q;
                        }
                        ((db) j0Var2).A.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, h7.z5.e(-2, -1, 113));
        final int i11 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: lh.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((db) this.b).A.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        uf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        z7 z7Var = j0Var2.x;
                        if (z7Var != null) {
                            z7Var.m0 = new MediaController.CropState();
                            j0Var2.f.b(j0Var2.x.m0);
                            z7 z7Var2 = j0Var2.x;
                            z7Var2.m0.orientation = z7Var2.Q;
                        }
                        ((db) j0Var2).A.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.g6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.pa.c(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, h7.z5.e(-2, -1, 117));
        final int i12 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: lh.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((db) this.b).A.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        uf.e eVar2 = j0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        z7 z7Var = j0Var2.x;
                        if (z7Var != null) {
                            z7Var.m0 = new MediaController.CropState();
                            j0Var2.f.b(j0Var2.x.m0);
                            z7 z7Var2 = j0Var2.x;
                            z7Var2.m0.orientation = z7Var2.Q;
                        }
                        ((db) j0Var2).A.l0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        z7 z7Var = this.x;
        if (z7Var == null) {
            return 1;
        }
        int i10 = z7Var.Q;
        q6 q6Var = this.a;
        return (i10 == 90 || i10 == 270) ? q6Var.getContentWidth() : q6Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        z7 z7Var = this.x;
        if (z7Var == null) {
            return 1;
        }
        int i10 = z7Var.Q;
        q6 q6Var = this.a;
        return (i10 == 90 || i10 == 270) ? q6Var.getContentHeight() : q6Var.getContentWidth();
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

    public void setEntry(z7 z7Var) {
        if (z7Var == null) {
            return;
        }
        this.x = z7Var;
        this.y = false;
        g0 g0Var = this.f;
        g0Var.F = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.v;
        q6 q6Var = this.a;
        q6Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = z7Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(z7Var.Q, this.w, cropState);
        float rotation = g0Var.getRotation();
        uf.e eVar = this.h;
        eVar.setRotation(rotation);
        org.telegram.ui.Components.y5 y5Var = this.b;
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
        g0Var.r(false);
        this.c.d(r5.i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        q6Var.setCropEditorDrawing(this);
    }
}
