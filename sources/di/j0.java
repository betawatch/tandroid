package di;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.pr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public abstract class j0 extends FrameLayout {
    public final d7 a;
    public final org.telegram.ui.Components.e6 b;
    public final org.telegram.ui.Components.e6 c;
    public final i0 d;
    public final FrameLayout e;
    public final g0 f;
    public final mg.f h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] v;
    public final mg.g w;
    public o8 x;
    public boolean y;

    public j0(Context context, d7 d7Var) {
        super(context);
        this.r = 0.0f;
        this.s = new int[2];
        this.v = new int[2];
        this.w = new mg.g();
        this.a = d7Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        pr prVar = pr.h;
        this.b = new org.telegram.ui.Components.e6(i0Var, 0L, 320L, prVar);
        this.c = new org.telegram.ui.Components.e6(this, 0L, 360L, prVar);
        g0 g0Var = new g0(this, context, 0);
        this.f = g0Var;
        g0Var.setListener(new a4.m(this, 15));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.x5.e(-1, -1, 119));
        mg.f fVar = new mg.f(context);
        this.h = fVar;
        fVar.setListener(new h0(0, this));
        frameLayout.addView(fVar, w7.x5.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.x5.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.m(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.x5.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: di.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((zb) this.b).E.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        mg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        o8 o8Var = j0Var2.x;
                        if (o8Var != null) {
                            o8Var.m0 = new MediaController.CropState();
                            j0Var2.f.b(j0Var2.x.m0);
                            o8 o8Var2 = j0Var2.x;
                            o8Var2.m0.orientation = o8Var2.Q;
                        }
                        ((zb) j0Var2).E.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.CropReset, textView2), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView2, w7.x5.e(-2, -1, 113));
        final int i11 = 1;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: di.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((zb) this.b).E.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        mg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        o8 o8Var = j0Var2.x;
                        if (o8Var != null) {
                            o8Var.m0 = new MediaController.CropState();
                            j0Var2.f.b(j0Var2.x.m0);
                            o8 o8Var2 = j0Var2.x;
                            o8Var2.m0.orientation = o8Var2.Q;
                        }
                        ((zb) j0Var2).E.l0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setPadding(org.telegram.ui.Cells.p6.b(12.0f, R.string.StoryCrop, textView3), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView3, w7.x5.e(-2, -1, 117));
        final int i12 = 2;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: di.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((zb) this.b).E.l0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        mg.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        o8 o8Var = j0Var2.x;
                        if (o8Var != null) {
                            o8Var.m0 = new MediaController.CropState();
                            j0Var2.f.b(j0Var2.x.m0);
                            o8 o8Var2 = j0Var2.x;
                            o8Var2.m0.orientation = o8Var2.Q;
                        }
                        ((zb) j0Var2).E.l0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        o8 o8Var = this.x;
        if (o8Var == null) {
            return 1;
        }
        int i10 = o8Var.Q;
        d7 d7Var = this.a;
        return (i10 == 90 || i10 == 270) ? d7Var.getContentWidth() : d7Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        o8 o8Var = this.x;
        if (o8Var == null) {
            return 1;
        }
        int i10 = o8Var.Q;
        d7 d7Var = this.a;
        return (i10 == 90 || i10 == 270) ? d7Var.getContentHeight() : d7Var.getContentWidth();
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
        i0 i0Var = this.d;
        i0Var.setAlpha(f7);
        i0Var.invalidate();
        g0 g0Var = this.f;
        CropAreaView cropAreaView = g0Var.a;
        CropAreaView cropAreaView2 = g0Var.a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(o8 o8Var) {
        if (o8Var == null) {
            return;
        }
        this.x = o8Var;
        this.y = false;
        g0 g0Var = this.f;
        g0Var.J = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.v;
        d7 d7Var = this.a;
        d7Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = o8Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        g0Var.p(o8Var.Q, this.w, cropState);
        float rotation = g0Var.getRotation();
        mg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.e6 e6Var = this.b;
        if (cropState != null) {
            fVar.b(cropState.cropRotate);
            fVar.setRotated(cropState.transformRotation != 0);
            fVar.setMirrored(cropState.mirrored);
            e6Var.f(cropState.mirrored, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            e6Var.getClass();
            e6Var.d(0.0f, false);
        }
        g0Var.r(false);
        this.c.d(r5.i, true);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        d7Var.setCropEditorDrawing(this);
    }
}
