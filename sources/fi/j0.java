package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class j0 extends FrameLayout {
    public boolean D;
    public final y5 a;
    public final org.telegram.ui.Components.w5 b;
    public final org.telegram.ui.Components.w5 c;
    public final i0 d;
    public final FrameLayout e;
    public final g0 f;
    public final og.f h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final og.g x;
    public e7 y;

    public j0(Context context, y5 y5Var) {
        super(context);
        this.r = 0.0f;
        final int i7 = 2;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new og.g();
        this.a = y5Var;
        i0 i0Var = new i0(this, context);
        this.d = i0Var;
        xq xqVar = xq.h;
        this.b = new org.telegram.ui.Components.w5(i0Var, 0L, 320L, xqVar);
        this.c = new org.telegram.ui.Components.w5(this, 0L, 360L, xqVar);
        final int i10 = 0;
        g0 g0Var = new g0(this, context, i10);
        this.f = g0Var;
        g0Var.setListener(new d6.i(this, 24));
        addView(g0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, c8.ha.e(-1, -1, qs.E1));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new h0(i10, this));
        frameLayout.addView(fVar, c8.ha.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ha.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        final int i11 = 1;
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131752589, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ha.e(-2, -1, qs.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: fi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((fa) this.b).E.k0(-1, false, true);
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
                        e7 e7Var = j0Var2.y;
                        if (e7Var != null) {
                            e7Var.m0 = new ye();
                            j0Var2.f.b(j0Var2.y.m0);
                            e7 e7Var2 = j0Var2.y;
                            e7Var2.m0.z = e7Var2.Q;
                        }
                        ((fa) j0Var2).E.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(hd.M0(2131751697, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ha.e(-2, -1, qs.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: fi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((fa) this.b).E.k0(-1, false, true);
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
                        e7 e7Var = j0Var2.y;
                        if (e7Var != null) {
                            e7Var.m0 = new ye();
                            j0Var2.f.b(j0Var2.y.m0);
                            e7 e7Var2 = j0Var2.y;
                            e7Var2.m0.z = e7Var2.Q;
                        }
                        ((fa) j0Var2).E.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.k6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(hd.M0(2131744689, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ha.e(-2, -1, qs.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: fi.f0
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ((fa) this.b).E.k0(-1, false, true);
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
                        e7 e7Var = j0Var2.y;
                        if (e7Var != null) {
                            e7Var.m0 = new ye();
                            j0Var2.f.b(j0Var2.y.m0);
                            e7 e7Var2 = j0Var2.y;
                            e7Var2.m0.z = e7Var2.Q;
                        }
                        ((fa) j0Var2).E.k0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        e7 e7Var = this.y;
        if (e7Var == null) {
            return 1;
        }
        int i7 = e7Var.Q;
        y5 y5Var = this.a;
        return (i7 == 90 || i7 == 270) ? y5Var.getContentWidth() : y5Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        e7 e7Var = this.y;
        if (e7Var == null) {
            return 1;
        }
        int i7 = e7Var.Q;
        y5 y5Var = this.a;
        return (i7 == 90 || i7 == 270) ? y5Var.getContentHeight() : y5Var.getContentWidth();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public float getAppearProgress() {
        return this.r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f.setBottomPadding(org.telegram.messenger.g0.L(116.0f) + this.e.getPaddingBottom());
        super.onLayout(z9, i7, i10, i11, i12);
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

    public void setEntry(e7 e7Var) {
        if (e7Var == null) {
            return;
        }
        this.y = e7Var;
        this.D = false;
        g0 g0Var = this.f;
        g0Var.J = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        y5 y5Var = this.a;
        y5Var.getLocationOnScreen(iArr);
        ye yeVar = e7Var.m0;
        if (yeVar == null) {
            yeVar = null;
        }
        g0Var.p(e7Var.Q, this.x, yeVar);
        float rotation = g0Var.getRotation();
        og.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.w5 w5Var = this.b;
        if (yeVar != null) {
            fVar.b(yeVar.d);
            fVar.setRotated(yeVar.k != 0);
            fVar.setMirrored(yeVar.l);
            w5Var.f(yeVar.l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            w5Var.getClass();
            w5Var.e(false, 0.0f);
        }
        g0Var.r(false);
        this.c.e(true, r5.i);
        i0 i0Var = this.d;
        i0Var.setVisibility(0);
        i0Var.invalidate();
        y5Var.setCropEditorDrawing(this);
    }
}
