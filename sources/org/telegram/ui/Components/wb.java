package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class wb {
    public static wb w;
    public int a;
    public int b;
    public ka c;
    public o1.j d;
    public final bb e;
    public final oa f;
    public final org.telegram.ui.ActionBar.k2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public ua p;
    public ab q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public wb() {
        this.i = new ja(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, ua uaVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, uaVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        wb wbVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                wbVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof bb) {
                wbVar = ((bb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (wbVar != null) {
            wbVar.c(0L, org.telegram.messenger.vp.d1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        wb wbVar = w;
        if (wbVar != null) {
            wbVar.b();
        }
    }

    public static wb f(FrameLayout frameLayout, bb bbVar, int i10) {
        return frameLayout == null ? new va() : new wb(null, frameLayout, bbVar, i10);
    }

    public static wb g(org.telegram.ui.ActionBar.k2 k2Var, ta taVar, int i10) {
        if (k2Var == null) {
            return new va();
        }
        if (k2Var instanceof org.telegram.ui.un) {
            bb.access$000(taVar, -2, 1);
        } else if (k2Var instanceof org.telegram.ui.ay) {
            bb.access$000(taVar, -1, 0);
        }
        return new wb(k2Var, k2Var.getBulletinLayoutContainer(), taVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.vp.d1().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z10) {
        bb bbVar = this.e;
        if (bbVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.h0.a;
            if (bbVar.isLaidOut() || this.t) {
                bbVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    bbVar.transitionRunningExit = true;
                    bbVar.delegate = this.p;
                    bbVar.invalidate();
                    if (j10 >= 0) {
                        c3.s sVar = new c3.s();
                        sVar.a = j10;
                        this.q = sVar;
                    } else if (bbVar != null && this.q == null) {
                        this.q = bbVar.createTransition();
                    }
                    ab abVar = this.q;
                    Objects.requireNonNull(bbVar);
                    abVar.m(bbVar, new la(bbVar, i10), new ja(this, i11), new ma(this, i10));
                    return;
                }
            }
            ua uaVar = this.p;
            if (uaVar != null && !bbVar.top) {
                uaVar.c(0.0f);
                this.p.d(this);
            }
            bbVar.onExitTransitionStart();
            bbVar.onExitTransitionEnd();
            bbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.i0.g3(new ja(this, 2));
            }
            bbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        bb bbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (bbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            bbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            bbVar.postDelayed(runnable, i10);
        }
    }

    public wb j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.ka] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        bb bbVar = this.e;
        bbVar.setTop(z10);
        CharSequence accessibilityText = bbVar.getAccessibilityText();
        if (accessibilityText != null) {
            org.telegram.messenger.i0.i2(accessibilityText);
        }
        ViewParent parent = bbVar.getParent();
        oa oaVar = this.f;
        if (parent != oaVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        wb wbVar = w;
        if (wbVar != null) {
            wbVar.b();
        }
        w = this;
        bbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.ka
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                wb wbVar2 = wb.this;
                ua uaVar = wbVar2.p;
                if ((uaVar == null || uaVar.a()) && !z10) {
                    ua uaVar2 = wbVar2.p;
                    int f7 = uaVar2 != null ? uaVar2.f(wbVar2.a) : 0;
                    int i18 = wbVar2.o;
                    if (i18 != f7) {
                        o1.j jVar = wbVar2.d;
                        if (jVar == null || !jVar.f) {
                            o1.j jVar2 = new o1.j(new o1.i(i18));
                            o1.k kVar = new o1.k();
                            kVar.i = f7;
                            kVar.b(900.0f);
                            kVar.a(1.0f);
                            jVar2.m = kVar;
                            wbVar2.d = jVar2;
                            jVar2.b(new a7(wbVar2, 1));
                            wbVar2.d.a(new na(wbVar2, 0));
                        } else {
                            jVar.m.i = f7;
                        }
                        wbVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        bbVar.addOnLayoutChangeListener(new pa(this, z10));
        if (!this.t) {
            bbVar.addOnAttachStateChangeListener(new l.d(this, 6));
        }
        frameLayout.addView(oaVar);
    }

    public final void l() {
        bb bbVar = this.e;
        if (bbVar != null) {
            bbVar.updatePosition();
        }
    }

    public wb(org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, bb bbVar, int i10) {
        this.i = new ja(this, 0);
        this.r = true;
        this.u = true;
        this.e = bbVar;
        this.n = true ^ (bbVar instanceof cb);
        this.f = new oa(this, bbVar, frameLayout);
        this.g = k2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
