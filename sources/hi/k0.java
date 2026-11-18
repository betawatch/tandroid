package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.lr;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public abstract class k0 extends FrameLayout {
    public boolean E;
    public final w5 a;
    public final org.telegram.ui.Components.c6 b;
    public final org.telegram.ui.Components.c6 c;
    public final j0 d;
    public final FrameLayout e;
    public final h0 f;
    public final og.f h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final og.g x;
    public d7 y;

    public k0(Context context, w5 w5Var) {
        super(context);
        this.r = 0.0f;
        final int i7 = 2;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new og.g();
        this.a = w5Var;
        j0 j0Var = new j0(this, context);
        this.d = j0Var;
        lr lrVar = lr.h;
        this.b = new org.telegram.ui.Components.c6(j0Var, 0L, 320L, lrVar);
        this.c = new org.telegram.ui.Components.c6(this, 0L, 360L, lrVar);
        final int i10 = 0;
        h0 h0Var = new h0(this, context, i10);
        this.f = h0Var;
        h0Var.setListener(new ob.c(this, 28));
        addView(h0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -1, ks.E1));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new i0(i10, this));
        frameLayout.addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        final int i11 = 1;
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.M0(2131752578, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ma.e(-2, -1, ks.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((da) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        k0 k0Var = this.b;
                        k0Var.f.l(true);
                        og.f fVar2 = k0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        k0Var.d.invalidate();
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        d7 d7Var = k0Var2.y;
                        if (d7Var != null) {
                            d7Var.m0 = new we();
                            k0Var2.f.b(k0Var2.y.m0);
                            d7 d7Var2 = k0Var2.y;
                            d7Var2.m0.z = d7Var2.Q;
                        }
                        ((da) k0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.M0(2131751685, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ma.e(-2, -1, ks.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((da) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        k0 k0Var = this.b;
                        k0Var.f.l(true);
                        og.f fVar2 = k0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        k0Var.d.invalidate();
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        d7 d7Var = k0Var2.y;
                        if (d7Var != null) {
                            d7Var.m0 = new we();
                            k0Var2.f.b(k0Var2.y.m0);
                            d7 d7Var2 = k0Var2.y;
                            d7Var2.m0.z = d7Var2.Q;
                        }
                        ((da) k0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.M0(2131744453, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ma.e(-2, -1, ks.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ((da) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        k0 k0Var = this.b;
                        k0Var.f.l(true);
                        og.f fVar2 = k0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        k0Var.d.invalidate();
                        break;
                    default:
                        k0 k0Var2 = this.b;
                        d7 d7Var = k0Var2.y;
                        if (d7Var != null) {
                            d7Var.m0 = new we();
                            k0Var2.f.b(k0Var2.y.m0);
                            d7 d7Var2 = k0Var2.y;
                            d7Var2.m0.z = d7Var2.Q;
                        }
                        ((da) k0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        d7 d7Var = this.y;
        if (d7Var == null) {
            return 1;
        }
        int i7 = d7Var.Q;
        w5 w5Var = this.a;
        return (i7 == 90 || i7 == 270) ? w5Var.getContentWidth() : w5Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        d7 d7Var = this.y;
        if (d7Var == null) {
            return 1;
        }
        int i7 = d7Var.Q;
        w5 w5Var = this.a;
        return (i7 == 90 || i7 == 270) ? w5Var.getContentHeight() : w5Var.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z10, i7, i10, i11, i12);
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

    public void setEntry(d7 d7Var) {
        if (d7Var == null) {
            return;
        }
        this.y = d7Var;
        this.E = false;
        h0 h0Var = this.f;
        h0Var.K = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        w5 w5Var = this.a;
        w5Var.getLocationOnScreen(iArr);
        we weVar = d7Var.m0;
        if (weVar == null) {
            weVar = null;
        }
        h0Var.p(d7Var.Q, this.x, weVar);
        float rotation = h0Var.getRotation();
        og.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.c6 c6Var = this.b;
        if (weVar != null) {
            fVar.b(weVar.d);
            fVar.setRotated(weVar.k != 0);
            fVar.setMirrored(weVar.l);
            c6Var.f(weVar.l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            c6Var.getClass();
            c6Var.e(false, 0.0f);
        }
        h0Var.r(false);
        this.c.e(true, r5.i);
        j0 j0Var = this.d;
        j0Var.setVisibility(0);
        j0Var.invalidate();
        w5Var.setCropEditorDrawing(this);
    }
}
