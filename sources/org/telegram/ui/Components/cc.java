package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class cc {
    public static cc w;
    public int a;
    public int b;
    public qa c;
    public r1.g d;
    public final gb e;
    public final ua f;
    public final org.telegram.ui.ActionBar.f2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public ab p;
    public fb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public cc() {
        this.i = new pa(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, ab abVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, abVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        cc ccVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                ccVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i7);
            if (childAt instanceof gb) {
                ccVar = ((gb) childAt).bulletin;
                break;
            }
            i7++;
        }
        if (ccVar != null) {
            ccVar.c(0L, org.telegram.messenger.qp.e1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        cc ccVar = w;
        if (ccVar != null) {
            ccVar.b();
        }
    }

    public static cc f(FrameLayout frameLayout, gb gbVar, int i7) {
        return frameLayout == null ? new bb() : new cc(null, frameLayout, gbVar, i7);
    }

    public static cc g(org.telegram.ui.ActionBar.f2 f2Var, za zaVar, int i7) {
        if (f2Var == null) {
            return new bb();
        }
        if (f2Var instanceof org.telegram.ui.an) {
            gb.access$000(zaVar, -2, 1);
        } else if (f2Var instanceof org.telegram.ui.ww) {
            gb.access$000(zaVar, -1, 0);
        }
        return new cc(f2Var, f2Var.getBulletinLayoutContainer(), zaVar, i7);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.qp.e1().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z9) {
        gb gbVar = this.e;
        if (gbVar != null && this.l) {
            int i7 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (gbVar.isLaidOut() || this.t) {
                gbVar.removeCallbacks(this.i);
                if (z9) {
                    int i10 = 1;
                    gbVar.transitionRunningExit = true;
                    gbVar.delegate = this.p;
                    gbVar.invalidate();
                    if (j3 >= 0) {
                        f3.s sVar = new f3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (gbVar != null && this.q == null) {
                        this.q = gbVar.createTransition();
                    }
                    fb fbVar = this.q;
                    Objects.requireNonNull(gbVar);
                    fbVar.c(gbVar, new ra(gbVar, i7), new pa(this, i10), new sa(this, i7));
                    return;
                }
            }
            ab abVar = this.p;
            if (abVar != null && !gbVar.top) {
                abVar.c(0.0f);
                this.p.d(this);
            }
            gbVar.onExitTransitionStart();
            gbVar.onExitTransitionEnd();
            gbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.h3(new pa(this, 2));
            }
            gbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z9) {
        gb gbVar;
        boolean z10 = z9 && this.n;
        if (this.m == z10 || (gbVar = this.e) == null) {
            return;
        }
        this.m = z10;
        Runnable runnable = this.i;
        if (!z10) {
            gbVar.removeCallbacks(runnable);
            return;
        }
        int i7 = this.j;
        if (i7 >= 0) {
            gbVar.postDelayed(runnable, i7);
        }
    }

    public cc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.qa] */
    public final void k(final boolean z9) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        gb gbVar = this.e;
        gbVar.setTop(z9);
        CharSequence accessibilityText = gbVar.getAccessibilityText();
        if (accessibilityText != null) {
            org.telegram.messenger.g0.i2(accessibilityText);
        }
        ViewParent parent = gbVar.getParent();
        ua uaVar = this.f;
        if (parent != uaVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        cc ccVar = w;
        if (ccVar != null) {
            ccVar.b();
        }
        w = this;
        gbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.qa
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                cc ccVar2 = cc.this;
                ab abVar = ccVar2.p;
                if ((abVar == null || abVar.a()) && !z9) {
                    ab abVar2 = ccVar2.p;
                    int f10 = abVar2 != null ? abVar2.f(ccVar2.a) : 0;
                    int i17 = ccVar2.o;
                    if (i17 != f10) {
                        r1.g gVar = ccVar2.d;
                        if (gVar == null || !gVar.f) {
                            r1.g gVar2 = new r1.g(new r1.f(i17));
                            r1.h hVar = new r1.h();
                            hVar.i = f10;
                            hVar.b(900.0f);
                            hVar.a(1.0f);
                            gVar2.m = hVar;
                            ccVar2.d = gVar2;
                            gVar2.b(new e7(ccVar2, 1));
                            ccVar2.d.a(new ta(ccVar2, 0));
                        } else {
                            gVar.m.i = f10;
                        }
                        ccVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        gbVar.addOnLayoutChangeListener(new va(this, z9));
        if (!this.t) {
            gbVar.addOnAttachStateChangeListener(new bi.m6(this, 8));
        }
        frameLayout.addView(uaVar);
    }

    public final void l() {
        gb gbVar = this.e;
        if (gbVar != null) {
            gbVar.updatePosition();
        }
    }

    public cc(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, gb gbVar, int i7) {
        this.i = new pa(this, 0);
        this.r = true;
        this.u = true;
        this.e = gbVar;
        this.n = true ^ (gbVar instanceof hb);
        this.f = new ua(this, gbVar, frameLayout);
        this.g = f2Var;
        this.h = frameLayout;
        this.j = i7;
    }
}
