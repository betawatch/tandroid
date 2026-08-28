package kh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class k0 extends FrameLayout {
    public final r6 a;
    public final org.telegram.ui.Components.y5 b;
    public final org.telegram.ui.Components.y5 c;
    public final j0 d;
    public final FrameLayout e;
    public final h0 f;
    public final tf.e h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] v;
    public final tf.f w;
    public a8 x;
    public boolean y;

    public k0(Context context, r6 r6Var) {
        super(context);
        this.r = 0.0f;
        this.s = new int[2];
        this.v = new int[2];
        this.w = new tf.f();
        this.a = r6Var;
        j0 j0Var = new j0(this, context);
        this.d = j0Var;
        gr grVar = gr.h;
        this.b = new org.telegram.ui.Components.y5(j0Var, 0L, 320L, grVar);
        this.c = new org.telegram.ui.Components.y5(this, 0L, 360L, grVar);
        h0 h0Var = new h0(this, context, 0);
        this.f = h0Var;
        h0Var.setListener(new xa.c(this, 23));
        addView(h0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        tf.e eVar = new tf.e(context);
        this.h = eVar;
        eVar.setListener(new i0(0, this));
        frameLayout.addView(eVar, g7.e6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, g7.e6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        j3.r0.u(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.f6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.j2.c(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, g7.e6.e(-2, -1, 115));
        final int i9 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: kh.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        ((gb) this.b).A.l0(-1, false, true);
                        break;
                    case 1:
                        k0 k0Var = this.b;
                        k0Var.f.l(true);
                        tf.e eVar2 = k0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        k0Var.d.invalidate();
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        a8 a8Var = k0Var2.x;
                        if (a8Var != null) {
                            a8Var.m0 = new MediaController.CropState();
                            k0Var2.f.b(k0Var2.x.m0);
                            a8 a8Var2 = k0Var2.x;
                            a8Var2.m0.orientation = a8Var2.Q;
                        }
                        ((gb) k0Var2).A.l0(-1, false, true);
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
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: kh.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((gb) this.b).A.l0(-1, false, true);
                        break;
                    case 1:
                        k0 k0Var = this.b;
                        k0Var.f.l(true);
                        tf.e eVar2 = k0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        k0Var.d.invalidate();
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        a8 a8Var = k0Var2.x;
                        if (a8Var != null) {
                            a8Var.m0 = new MediaController.CropState();
                            k0Var2.f.b(k0Var2.x.m0);
                            a8 a8Var2 = k0Var2.x;
                            a8Var2.m0.orientation = a8Var2.Q;
                        }
                        ((gb) k0Var2).A.l0(-1, false, true);
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
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: kh.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((gb) this.b).A.l0(-1, false, true);
                        break;
                    case 1:
                        k0 k0Var = this.b;
                        k0Var.f.l(true);
                        tf.e eVar2 = k0Var.h;
                        eVar2.setRotated(false);
                        eVar2.setMirrored(false);
                        eVar2.b(0.0f);
                        k0Var.d.invalidate();
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        a8 a8Var = k0Var2.x;
                        if (a8Var != null) {
                            a8Var.m0 = new MediaController.CropState();
                            k0Var2.f.b(k0Var2.x.m0);
                            a8 a8Var2 = k0Var2.x;
                            a8Var2.m0.orientation = a8Var2.Q;
                        }
                        ((gb) k0Var2).A.l0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        a8 a8Var = this.x;
        if (a8Var == null) {
            return 1;
        }
        int i9 = a8Var.Q;
        r6 r6Var = this.a;
        return (i9 == 90 || i9 == 270) ? r6Var.getContentWidth() : r6Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        a8 a8Var = this.x;
        if (a8Var == null) {
            return 1;
        }
        int i9 = a8Var.Q;
        r6 r6Var = this.a;
        return (i9 == 90 || i9 == 270) ? r6Var.getContentHeight() : r6Var.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.f.setBottomPadding(AndroidUtilities.dp(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i9, i10, i11, i12);
    }

    public void setAppearProgress(float f10) {
        if (Math.abs(this.r - f10) < 0.001f) {
            return;
        }
        this.r = f10;
        j0 j0Var = this.d;
        j0Var.setAlpha(f10);
        j0Var.invalidate();
        h0 h0Var = this.f;
        CropAreaView cropAreaView = h0Var.a;
        CropAreaView cropAreaView2 = h0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(a8 a8Var) {
        if (a8Var == null) {
            return;
        }
        this.x = a8Var;
        this.y = false;
        h0 h0Var = this.f;
        h0Var.F = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.v;
        r6 r6Var = this.a;
        r6Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = a8Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        h0Var.p(a8Var.Q, this.w, cropState);
        float rotation = h0Var.getRotation();
        tf.e eVar = this.h;
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
        h0Var.r(false);
        this.c.d(r5.i, true);
        j0 j0Var = this.d;
        j0Var.setVisibility(0);
        j0Var.invalidate();
        r6Var.setCropEditorDrawing(this);
    }
}
