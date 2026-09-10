package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public abstract class n0 extends FrameLayout {
    public final e8 a;
    public final org.telegram.ui.Components.d6 b;
    public final org.telegram.ui.Components.d6 c;
    public final m0 d;
    public final FrameLayout e;
    public final l0 f;
    public final kg.f h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] v;
    public final kg.g w;
    public r9 x;
    public boolean y;

    public n0(Context context, e8 e8Var) {
        super(context);
        this.r = 0.0f;
        this.s = new int[2];
        this.v = new int[2];
        this.w = new kg.g();
        this.a = e8Var;
        m0 m0Var = new m0(this, context);
        this.d = m0Var;
        wr wrVar = wr.h;
        this.b = new org.telegram.ui.Components.d6(m0Var, 0L, 320L, wrVar);
        this.c = new org.telegram.ui.Components.d6(this, 0L, 360L, wrVar);
        l0 l0Var = new l0(this, context, 0);
        this.f = l0Var;
        l0Var.setListener(new a4.m(this, 4));
        addView(l0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, w7.a6.e(-1, -1, 119));
        kg.f fVar = new kg.f(context);
        this.h = fVar;
        fVar.setListener(new pb.c(this, 6));
        frameLayout.addView(fVar, w7.a6.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, w7.a6.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        com.google.android.gms.internal.vision.e2.k(14.0f, 1, textView);
        textView.setBackground(org.telegram.ui.ActionBar.j6.f0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setPadding(org.telegram.ui.Cells.r6.b(12.0f, R.string.Cancel, textView), 0, AndroidUtilities.dp(12.0f), 0);
        frameLayout2.addView(textView, w7.a6.e(-2, -1, 115));
        final int i10 = 0;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.k0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((id) this.b).E.l0(-1, false, true);
                        break;
                    case 1:
                        n0 n0Var = this.b;
                        n0Var.f.l(true);
                        kg.f fVar2 = n0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        n0Var.d.invalidate();
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        r9 r9Var = n0Var2.x;
                        if (r9Var != null) {
                            r9Var.m0 = new MediaController.CropState();
                            n0Var2.f.b(n0Var2.x.m0);
                            r9 r9Var2 = n0Var2.x;
                            r9Var2.m0.orientation = r9Var2.Q;
                        }
                        ((id) n0Var2).E.l0(-1, false, true);
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
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.k0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((id) this.b).E.l0(-1, false, true);
                        break;
                    case 1:
                        n0 n0Var = this.b;
                        n0Var.f.l(true);
                        kg.f fVar2 = n0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        n0Var.d.invalidate();
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        r9 r9Var = n0Var2.x;
                        if (r9Var != null) {
                            r9Var.m0 = new MediaController.CropState();
                            n0Var2.f.b(n0Var2.x.m0);
                            r9 r9Var2 = n0Var2.x;
                            r9Var2.m0.orientation = r9Var2.Q;
                        }
                        ((id) n0Var2).E.l0(-1, false, true);
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
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: bi.k0
            public final /* synthetic */ n0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        ((id) this.b).E.l0(-1, false, true);
                        break;
                    case 1:
                        n0 n0Var = this.b;
                        n0Var.f.l(true);
                        kg.f fVar2 = n0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        n0Var.d.invalidate();
                        break;
                    default:
                        n0 n0Var2 = this.b;
                        r9 r9Var = n0Var2.x;
                        if (r9Var != null) {
                            r9Var.m0 = new MediaController.CropState();
                            n0Var2.f.b(n0Var2.x.m0);
                            r9 r9Var2 = n0Var2.x;
                            r9Var2.m0.orientation = r9Var2.Q;
                        }
                        ((id) n0Var2).E.l0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        r9 r9Var = this.x;
        if (r9Var == null) {
            return 1;
        }
        int i10 = r9Var.Q;
        e8 e8Var = this.a;
        return (i10 == 90 || i10 == 270) ? e8Var.getContentWidth() : e8Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        r9 r9Var = this.x;
        if (r9Var == null) {
            return 1;
        }
        int i10 = r9Var.Q;
        e8 e8Var = this.a;
        return (i10 == 90 || i10 == 270) ? e8Var.getContentHeight() : e8Var.getContentWidth();
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
        m0 m0Var = this.d;
        m0Var.setAlpha(f7);
        m0Var.invalidate();
        l0 l0Var = this.f;
        CropAreaView cropAreaView = l0Var.a;
        CropAreaView cropAreaView2 = l0Var.a;
        cropAreaView.setDimAlpha(0.5f * f7);
        cropAreaView2.setFrameAlpha(f7);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(r9 r9Var) {
        if (r9Var == null) {
            return;
        }
        this.x = r9Var;
        this.y = false;
        l0 l0Var = this.f;
        l0Var.J = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.v;
        e8 e8Var = this.a;
        e8Var.getLocationOnScreen(iArr);
        MediaController.CropState cropState = r9Var.m0;
        if (cropState == null) {
            cropState = null;
        }
        l0Var.p(r9Var.Q, this.w, cropState);
        float rotation = l0Var.getRotation();
        kg.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.b;
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
        this.c.d(r5.i, true);
        m0 m0Var = this.d;
        m0Var.setVisibility(0);
        m0Var.invalidate();
        e8Var.setCropEditorDrawing(this);
    }
}
