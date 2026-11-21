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
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public abstract class l0 extends FrameLayout {
    public boolean E;
    public final v5 a;
    public final org.telegram.ui.Components.d6 b;
    public final org.telegram.ui.Components.d6 c;
    public final k0 d;
    public final FrameLayout e;
    public final i0 f;
    public final og.f h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final og.g x;
    public c7 y;

    public l0(Context context, v5 v5Var) {
        super(context);
        this.r = 0.0f;
        final int i7 = 2;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new og.g();
        this.a = v5Var;
        k0 k0Var = new k0(this, context);
        this.d = k0Var;
        nr nrVar = nr.h;
        this.b = new org.telegram.ui.Components.d6(k0Var, 0L, 320L, nrVar);
        this.c = new org.telegram.ui.Components.d6(this, 0L, 360L, nrVar);
        final int i10 = 0;
        i0 i0Var = new i0(this, context, i10);
        this.f = i0Var;
        i0Var.setListener(new ob.c(this, 28));
        addView(i0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, c8.ma.e(-1, -1, ks.E1));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new j0(i10, this));
        frameLayout.addView(fVar, c8.ma.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.ma.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        final int i11 = 1;
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131752577, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.ma.e(-2, -1, ks.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.h0
            public final /* synthetic */ l0 b;

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
                        l0 l0Var = this.b;
                        l0Var.f.l(true);
                        og.f fVar2 = l0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        l0Var.d.invalidate();
                        break;
                    default:
                        l0 l0Var2 = this.b;
                        c7 c7Var = l0Var2.y;
                        if (c7Var != null) {
                            c7Var.m0 = new we();
                            l0Var2.f.b(l0Var2.y.m0);
                            c7 c7Var2 = l0Var2.y;
                            c7Var2.m0.z = c7Var2.Q;
                        }
                        ((ca) l0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131751684, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.ma.e(-2, -1, ks.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.h0
            public final /* synthetic */ l0 b;

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
                        l0 l0Var = this.b;
                        l0Var.f.l(true);
                        og.f fVar2 = l0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        l0Var.d.invalidate();
                        break;
                    default:
                        l0 l0Var2 = this.b;
                        c7 c7Var = l0Var2.y;
                        if (c7Var != null) {
                            c7Var.m0 = new we();
                            l0Var2.f.b(l0Var2.y.m0);
                            c7 c7Var2 = l0Var2.y;
                            c7Var2.m0.z = c7Var2.Q;
                        }
                        ((ca) l0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.m6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.N0(2131744447, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.ma.e(-2, -1, ks.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.h0
            public final /* synthetic */ l0 b;

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
                        l0 l0Var = this.b;
                        l0Var.f.l(true);
                        og.f fVar2 = l0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        l0Var.d.invalidate();
                        break;
                    default:
                        l0 l0Var2 = this.b;
                        c7 c7Var = l0Var2.y;
                        if (c7Var != null) {
                            c7Var.m0 = new we();
                            l0Var2.f.b(l0Var2.y.m0);
                            c7 c7Var2 = l0Var2.y;
                            c7Var2.m0.z = c7Var2.Q;
                        }
                        ((ca) l0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        c7 c7Var = this.y;
        if (c7Var == null) {
            return 1;
        }
        int i7 = c7Var.Q;
        v5 v5Var = this.a;
        return (i7 == 90 || i7 == 270) ? v5Var.getContentWidth() : v5Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        c7 c7Var = this.y;
        if (c7Var == null) {
            return 1;
        }
        int i7 = c7Var.Q;
        v5 v5Var = this.a;
        return (i7 == 90 || i7 == 270) ? v5Var.getContentHeight() : v5Var.getContentWidth();
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
        k0 k0Var = this.d;
        k0Var.setAlpha(f10);
        k0Var.invalidate();
        i0 i0Var = this.f;
        CropAreaView cropAreaView = i0Var.a;
        CropAreaView cropAreaView2 = i0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(c7 c7Var) {
        if (c7Var == null) {
            return;
        }
        this.y = c7Var;
        this.E = false;
        i0 i0Var = this.f;
        i0Var.K = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        v5 v5Var = this.a;
        v5Var.getLocationOnScreen(iArr);
        we weVar = c7Var.m0;
        if (weVar == null) {
            weVar = null;
        }
        i0Var.p(c7Var.Q, this.x, weVar);
        float rotation = i0Var.getRotation();
        og.f fVar = this.h;
        fVar.setRotation(rotation);
        org.telegram.ui.Components.d6 d6Var = this.b;
        if (weVar != null) {
            fVar.b(weVar.d);
            fVar.setRotated(weVar.k != 0);
            fVar.setMirrored(weVar.l);
            d6Var.f(weVar.l, false);
        } else {
            fVar.b(0.0f);
            fVar.setRotated(false);
            fVar.setMirrored(false);
            d6Var.getClass();
            d6Var.e(false, 0.0f);
        }
        i0Var.r(false);
        this.c.e(true, r5.i);
        k0 k0Var = this.d;
        k0Var.setVisibility(0);
        k0Var.invalidate();
        v5Var.setCropEditorDrawing(this);
    }
}
