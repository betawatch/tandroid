package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class tc {
    public static tc w;
    public int a;
    public int b;
    public hb c;
    public o1.k d;
    public final xb e;
    public final lb f;
    public final org.telegram.ui.ActionBar.n2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public rb p;
    public wb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public tc() {
        this.i = new gb(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, rb rbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, rbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        tc tcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                tcVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof xb) {
                tcVar = ((xb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (tcVar != null) {
            tcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        tc tcVar = w;
        if (tcVar != null) {
            tcVar.b();
        }
    }

    public static tc f(FrameLayout frameLayout, xb xbVar, int i10) {
        return frameLayout == null ? new sb() : new tc(null, frameLayout, xbVar, i10);
    }

    public static tc g(org.telegram.ui.ActionBar.n2 n2Var, qb qbVar, int i10) {
        if (n2Var == null) {
            return new sb();
        }
        if (n2Var instanceof org.telegram.ui.zn) {
            xb.access$000(qbVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.ty) {
            xb.access$000(qbVar, -1, 0);
        }
        return new tc(n2Var, n2Var.getBulletinLayoutContainer(), qbVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z10) {
        xb xbVar = this.e;
        if (xbVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (xbVar.isLaidOut() || this.t) {
                xbVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    xbVar.transitionRunningExit = true;
                    xbVar.delegate = this.p;
                    xbVar.invalidate();
                    if (j3 >= 0) {
                        c3.s sVar = new c3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (xbVar != null && this.q == null) {
                        this.q = xbVar.createTransition();
                    }
                    wb wbVar = this.q;
                    Objects.requireNonNull(xbVar);
                    wbVar.d(xbVar, new ib(xbVar, i10), new gb(this, i11), new jb(this, i10));
                    return;
                }
            }
            rb rbVar = this.p;
            if (rbVar != null && !xbVar.top) {
                rbVar.c(0.0f);
                this.p.d(this);
            }
            xbVar.onExitTransitionStart();
            xbVar.onExitTransitionEnd();
            xbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new gb(this, 2));
            }
            xbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        xb xbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (xbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            xbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            xbVar.postDelayed(runnable, i10);
        }
    }

    public tc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.hb] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        xb xbVar = this.e;
        xbVar.setTop(z10);
        CharSequence accessibilityText = xbVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = xbVar.getParent();
        lb lbVar = this.f;
        if (parent != lbVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        tc tcVar = w;
        if (tcVar != null) {
            tcVar.b();
        }
        w = this;
        xbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.hb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                tc tcVar2 = tc.this;
                rb rbVar = tcVar2.p;
                if ((rbVar == null || rbVar.a()) && !z10) {
                    rb rbVar2 = tcVar2.p;
                    int f7 = rbVar2 != null ? rbVar2.f(tcVar2.a) : 0;
                    int i18 = tcVar2.o;
                    if (i18 != f7) {
                        o1.k kVar = tcVar2.d;
                        if (kVar == null || !kVar.f) {
                            o1.k kVar2 = new o1.k(new o1.j(i18));
                            o1.l lVar = new o1.l();
                            lVar.i = f7;
                            lVar.b(900.0f);
                            lVar.a(1.0f);
                            kVar2.u = lVar;
                            tcVar2.d = kVar2;
                            kVar2.b(new m7(tcVar2, 1));
                            tcVar2.d.a(new kb(tcVar2, 0));
                        } else {
                            kVar.u.i = f7;
                        }
                        tcVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        xbVar.addOnLayoutChangeListener(new mb(this, z10));
        if (!this.t) {
            xbVar.addOnAttachStateChangeListener(new ai.v2(this, 6));
        }
        frameLayout.addView(lbVar);
    }

    public final void l() {
        xb xbVar = this.e;
        if (xbVar != null) {
            xbVar.updatePosition();
        }
    }

    public tc(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, xb xbVar, int i10) {
        this.i = new gb(this, 0);
        this.r = true;
        this.u = true;
        this.e = xbVar;
        this.n = true ^ (xbVar instanceof yb);
        this.f = new lb(this, xbVar, frameLayout);
        this.g = n2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
