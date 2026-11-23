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
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public abstract class s0 extends FrameLayout {
    public boolean E;
    public final f6 a;
    public final org.telegram.ui.Components.c6 b;
    public final org.telegram.ui.Components.c6 c;
    public final r0 d;
    public final FrameLayout e;
    public final p0 f;
    public final og.f h;
    public final FrameLayout n;
    public float r;
    public final int[] s;
    public final int[] w;
    public final og.g x;
    public x7 y;

    public s0(Context context, f6 f6Var) {
        super(context);
        this.r = 0.0f;
        final int i7 = 2;
        this.s = new int[2];
        this.w = new int[2];
        this.x = new og.g();
        this.a = f6Var;
        r0 r0Var = new r0(this, context);
        this.d = r0Var;
        kr krVar = kr.h;
        this.b = new org.telegram.ui.Components.c6(r0Var, 0L, 320L, krVar);
        this.c = new org.telegram.ui.Components.c6(this, 0L, 360L, krVar);
        final int i10 = 0;
        p0 p0Var = new p0(this, context, i10);
        this.f = p0Var;
        p0Var.setListener(new h6.o(this, i7));
        addView(p0Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(frameLayout, c8.na.e(-1, -1, ks.E1));
        og.f fVar = new og.f(context);
        this.h = fVar;
        fVar.setListener(new q0(i10, this));
        frameLayout.addView(fVar, c8.na.d(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 52.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.n = frameLayout2;
        frameLayout.addView(frameLayout2, c8.na.d(-1, 52.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        final int i11 = 1;
        i5.c.x(textView, 1, 14.0f);
        textView.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView.setTextColor(-1);
        textView.setText(gd.N0(2131752577, null));
        textView.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView, c8.na.e(-2, -1, ks.A1));
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: hi.o0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        ((xa) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        s0 s0Var = this.b;
                        s0Var.f.l(true);
                        og.f fVar2 = s0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        s0Var.d.invalidate();
                        break;
                    default:
                        s0 s0Var2 = this.b;
                        x7 x7Var = s0Var2.y;
                        if (x7Var != null) {
                            x7Var.m0 = new we();
                            s0Var2.f.b(s0Var2.y.m0);
                            x7 x7Var2 = s0Var2.y;
                            x7Var2.m0.z = x7Var2.Q;
                        }
                        ((xa) s0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView2.setTextColor(-1);
        textView2.setText(gd.N0(2131751684, null));
        textView2.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView2, c8.na.e(-2, -1, ks.y1));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: hi.o0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        ((xa) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        s0 s0Var = this.b;
                        s0Var.f.l(true);
                        og.f fVar2 = s0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        s0Var.d.invalidate();
                        break;
                    default:
                        s0 s0Var2 = this.b;
                        x7 x7Var = s0Var2.y;
                        if (x7Var != null) {
                            x7Var.m0 = new we();
                            s0Var2.f.b(s0Var2.y.m0);
                            x7 x7Var2 = s0Var2.y;
                            x7Var2.m0.z = x7Var2.Q;
                        }
                        ((xa) s0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setBackground(org.telegram.ui.ActionBar.n6.h0(-12763843, 0, -1));
        textView3.setTextColor(-15098625);
        textView3.setText(gd.N0(2131744444, null));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        frameLayout2.addView(textView3, c8.na.e(-2, -1, ks.C1));
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: hi.o0
            public final /* synthetic */ s0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        ((xa) this.b).F.k0(-1, false, true);
                        break;
                    case 1:
                        s0 s0Var = this.b;
                        s0Var.f.l(true);
                        og.f fVar2 = s0Var.h;
                        fVar2.setRotated(false);
                        fVar2.setMirrored(false);
                        fVar2.b(0.0f);
                        s0Var.d.invalidate();
                        break;
                    default:
                        s0 s0Var2 = this.b;
                        x7 x7Var = s0Var2.y;
                        if (x7Var != null) {
                            x7Var.m0 = new we();
                            s0Var2.f.b(s0Var2.y.m0);
                            x7 x7Var2 = s0Var2.y;
                            x7Var2.m0.z = x7Var2.Q;
                        }
                        ((xa) s0Var2).F.k0(-1, false, true);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentHeight() {
        x7 x7Var = this.y;
        if (x7Var == null) {
            return 1;
        }
        int i7 = x7Var.Q;
        f6 f6Var = this.a;
        return (i7 == 90 || i7 == 270) ? f6Var.getContentWidth() : f6Var.getContentHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCurrentWidth() {
        x7 x7Var = this.y;
        if (x7Var == null) {
            return 1;
        }
        int i7 = x7Var.Q;
        f6 f6Var = this.a;
        return (i7 == 90 || i7 == 270) ? f6Var.getContentHeight() : f6Var.getContentWidth();
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
        r0 r0Var = this.d;
        r0Var.setAlpha(f10);
        r0Var.invalidate();
        p0 p0Var = this.f;
        CropAreaView cropAreaView = p0Var.a;
        CropAreaView cropAreaView2 = p0Var.a;
        cropAreaView.setDimAlpha(0.5f * f10);
        cropAreaView2.setFrameAlpha(f10);
        cropAreaView2.invalidate();
        this.a.invalidate();
    }

    public void setEntry(x7 x7Var) {
        if (x7Var == null) {
            return;
        }
        this.y = x7Var;
        this.E = false;
        p0 p0Var = this.f;
        p0Var.K = true;
        getLocationOnScreen(this.s);
        int[] iArr = this.w;
        f6 f6Var = this.a;
        f6Var.getLocationOnScreen(iArr);
        we weVar = x7Var.m0;
        if (weVar == null) {
            weVar = null;
        }
        p0Var.p(x7Var.Q, this.x, weVar);
        float rotation = p0Var.getRotation();
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
        p0Var.r(false);
        this.c.e(true, r5.i);
        r0 r0Var = this.d;
        r0Var.setVisibility(0);
        r0Var.invalidate();
        f6Var.setCropEditorDrawing(this);
    }
}
