package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public abstract class i0 extends FrameLayout {
    public final b7 a;
    public final org.telegram.ui.Components.g6 b;
    public final org.telegram.ui.Components.g6 c;
    public final h0 d;
    public final FrameLayout e;
    public final g0 f;
    public final lg.f h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] v;
    public final lg.g w;
    public l8 x;
    public boolean y;

    public i0(Context context, b7 b7Var) {
        super(context);
        this.r = 0.0f;
        this.s = new int[2];
        this.v = new int[2];
        this.w = new lg.g();
        this.a = b7Var;
        h0 h0Var = new h0(this, context);
        this.d = h0Var;
        hs hsVar = hs.h;
        this.b = new org.telegram.ui.Components.g6(h0Var, 0L, 320L, hsVar);
        this.c = new org.telegram.ui.Components.g6(this, 0L, 360L, hsVar);
        g0 g0Var = new g0(this, context, 0);
        this.f = g0Var;
        g0Var.setListener(new a6.i(this, 11));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        lg.f fVar = new lg.f(context);
        this.h = fVar;
        fVar.setListener(new a4.l(this, 8));
        frameLayout.addView(fVar, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 52.0f, -1, 81));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.i6.g0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.x5.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: ci.f0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((vb) this.b).E.k0(-1, false, true);
                        break;
                    case 1:
                        i0 i0Var = this.b;
                        i0Var.f.l(true);
                        lg.f fVar2 = i0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        i0Var.d.invalidate();
                        break;
                    default:
                        i0 i0Var2 = this.b;
                        l8 l8Var = i0Var2.x;
                        if (l8Var != null) {
                            l8Var.m0 = new MediaController.CropState();
                            i0Var2.f.b(i0Var2.x.m0);
                            l8 l8Var2 = i0Var2.x;
                            l8Var2.m0.orientation = l8Var2.Q;
                        }
                        ((vb) i0Var2).E.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.i6.g0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.x5.e(-2, -1, 113));
        final int i11 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: ci.f0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((vb) this.b).E.k0(-1, false, true);
                        break;
                    case 1:
                        i0 i0Var = this.b;
                        i0Var.f.l(true);
                        lg.f fVar2 = i0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        i0Var.d.invalidate();
                        break;
                    default:
                        i0 i0Var2 = this.b;
                        l8 l8Var = i0Var2.x;
                        if (l8Var != null) {
                            l8Var.m0 = new MediaController.CropState();
                            i0Var2.f.b(i0Var2.x.m0);
                            l8 l8Var2 = i0Var2.x;
                            l8Var2.m0.orientation = l8Var2.Q;
                        }
                        ((vb) i0Var2).E.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.i6.g0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.c1.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.x5.e(-2, -1, 117));
        final int i12 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: ci.f0
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((vb) this.b).E.k0(-1, false, true);
                        break;
                    case 1:
                        i0 i0Var = this.b;
                        i0Var.f.l(true);
                        lg.f fVar2 = i0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        i0Var.d.invalidate();
                        break;
                    default:
                        i0 i0Var2 = this.b;
                        l8 l8Var = i0Var2.x;
                        if (l8Var != null) {
                            l8Var.m0 = new MediaController.CropState();
                            i0Var2.f.b(i0Var2.x.m0);
                            l8 l8Var2 = i0Var2.x;
                            l8Var2.m0.orientation = l8Var2.Q;
                        }
                        ((vb) i0Var2).E.k0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        l8 l8Var = this.x;
        if (l8Var == null) {
            return 1;
        }
        int i10 = l8Var.Q;
        b7 b7Var = this.a;
        return (i10 == 90 || i10 == 270) ? b7Var.getContentWidth() : b7Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        l8 l8Var = this.x;
        if (l8Var == null) {
            return 1;
        }
        int i10 = l8Var.Q;
        b7 b7Var = this.a;
        return (i10 == 90 || i10 == 270) ? b7Var.getContentHeight() : b7Var.getContentWidth();
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

    public void setAppearProgress(float f7) {
        if (Math.abs(this.r - f7) < 0.001f) {
            return;
        }
        this.r = f7;
        h0 h0Var = this.d;
        h0Var.setAlpha(f7);
        h0Var.invalidate();
        g0 g0Var = this.f;
        CropAreaView cropAreaView = g0Var.a;
        CropAreaView cropAreaView2 = g0Var.a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(l8 l8Var) {
        if (l8Var == null) {
            return;
        }
        this.x = l8Var;
        this.y = false;
        g0 g0Var = this.f;
        g0Var.J = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.v;
        b7 b7Var = this.a;
        b7Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = l8Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(l8Var.Q, this.w, cropState);
        float rotation = g0Var.getRotation();
        lg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.g6 g6Var = this.b;
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
        this.c.d(r5.i, true);
        h0 h0Var = this.d;
        h0Var.setVisibility(0);
        h0Var.invalidate();
        b7Var.setCropEditorDrawing(this);
    }
}
