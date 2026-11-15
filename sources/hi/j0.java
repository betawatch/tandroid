package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class j0 extends FrameLayout {
    public boolean E;
    public final x5 a;
    public final org.telegram.ui.Components.u5 b;
    public final org.telegram.ui.Components.u5 c;
    public final i0 d;
    public final FrameLayout e;
    public final g0 f;
    public final og.f h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final og.g x;
    public d7 y;

    public j0(Context context, x5 x5Var) {
        super(context);
        this.r = 0.0f;
        final int i7 = 2;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new og.g();
        this.a = x5Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        er erVar = er.h;
        this.b = new org.telegram.ui.Components.u5(i0Var, 0L, 320L, erVar);
        this.c = new org.telegram.ui.Components.u5(this, 0L, 360L, erVar);
        final int i10 = 0;
        g0 g0Var = new g0(this, context, i10);
        this.f = g0Var;
        g0Var.setListener(new d6.i(this, 25));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, c8.ja.e(-1, -1, ns.E1));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new h0(i10, this));
        frameLayout.addView(fVar, c8.ja.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ja.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        final int i11 = 1;
        i5.c.v(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ja.e(-2, -1, ns.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((ca) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        og.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        d7 d7Var = j0Var2.y;
                        if (d7Var != null) {
                            d7Var.m0 = new xe();
                            j0Var2.f.b(j0Var2.y.m0);
                            d7 d7Var2 = j0Var2.y;
                            d7Var2.m0.z = d7Var2.Q;
                        }
                        ((ca) j0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(hd.M0(2131751696, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ja.e(-2, -1, ns.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((ca) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        og.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        d7 d7Var = j0Var2.y;
                        if (d7Var != null) {
                            d7Var.m0 = new xe();
                            j0Var2.f.b(j0Var2.y.m0);
                            d7 d7Var2 = j0Var2.y;
                            d7Var2.m0.z = d7Var2.Q;
                        }
                        ((ca) j0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.j6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(hd.M0(2131744688, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ja.e(-2, -1, ns.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ((ca) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        j0 j0Var = this.b;
                        j0Var.f.l(true);
                        og.f fVar2 = j0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        j0Var.d.invalidate();
                        break;
                    default:
                        j0 j0Var2 = this.b;
                        d7 d7Var = j0Var2.y;
                        if (d7Var != null) {
                            d7Var.m0 = new xe();
                            j0Var2.f.b(j0Var2.y.m0);
                            d7 d7Var2 = j0Var2.y;
                            d7Var2.m0.z = d7Var2.Q;
                        }
                        ((ca) j0Var2).F.k0(-1, false, true);
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
        x5 x5Var = this.a;
        return (i7 == 90 || i7 == 270) ? x5Var.getContentWidth() : x5Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        d7 d7Var = this.y;
        if (d7Var == null) {
            return 1;
        }
        int i7 = d7Var.Q;
        x5 x5Var = this.a;
        return (i7 == 90 || i7 == 270) ? x5Var.getContentHeight() : x5Var.getContentWidth();
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

    public void setEntry(d7 d7Var) {
        if (d7Var == null) {
            return;
        }
        this.y = d7Var;
        this.E = false;
        g0 g0Var = this.f;
        g0Var.K = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        x5 x5Var = this.a;
        x5Var.getLocationOnScreen(iArr);
        xe xeVar = d7Var.m0;
        if (xeVar == null) {
            xeVar = null;
        }
        g0Var.p(d7Var.Q, this.x, xeVar);
        float rotation = g0Var.getRotation();
        og.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.u5 u5Var = this.b;
        if (xeVar != null) {
            fVar.b(xeVar.d);
            fVar.setRotated(xeVar.k != 0);
            fVar.setMirrored(xeVar.l);
            u5Var.f(xeVar.l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            u5Var.getClass();
            u5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        this.c.e(true, r5.i);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        x5Var.setCropEditorDrawing(this);
    }
}
