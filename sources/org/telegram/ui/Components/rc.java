package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public class rc {
    public static rc w;
    public int a;
    public int b;
    public fb c;
    public o1.k d;
    public final vb e;
    public final jb f;
    public final org.telegram.ui.ActionBar.n2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public pb p;
    public ub q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public rc() {
        this.i = new eb(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, pb pbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, pbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        rc rcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                rcVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof vb) {
                rcVar = ((vb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (rcVar != null) {
            rcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        rc rcVar = w;
        if (rcVar != null) {
            rcVar.b();
        }
    }

    public static rc f(FrameLayout frameLayout, vb vbVar, int i10) {
        return frameLayout == null ? new qb() : new rc(null, frameLayout, vbVar, i10);
    }

    public static rc g(org.telegram.ui.ActionBar.n2 n2Var, ob obVar, int i10) {
        if (n2Var == null) {
            return new qb();
        }
        if (n2Var instanceof org.telegram.ui.yn) {
            vb.access$000(obVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.uy) {
            vb.access$000(obVar, -1, 0);
        }
        return new rc(n2Var, n2Var.getBulletinLayoutContainer(), obVar, i10);
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
        vb vbVar = this.e;
        if (vbVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (vbVar.isLaidOut() || this.t) {
                vbVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    vbVar.transitionRunningExit = true;
                    vbVar.delegate = this.p;
                    vbVar.invalidate();
                    if (j3 >= 0) {
                        c3.s sVar = new c3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (vbVar != null && this.q == null) {
                        this.q = vbVar.createTransition();
                    }
                    ub ubVar = this.q;
                    Objects.requireNonNull(vbVar);
                    ubVar.c(vbVar, new gb(vbVar, i10), new eb(this, i11), new hb(this, i10));
                    return;
                }
            }
            pb pbVar = this.p;
            if (pbVar != null && !vbVar.top) {
                pbVar.c(0.0f);
                this.p.d(this);
            }
            vbVar.onExitTransitionStart();
            vbVar.onExitTransitionEnd();
            vbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new eb(this, 2));
            }
            vbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        vb vbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (vbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            vbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            vbVar.postDelayed(runnable, i10);
        }
    }

    public rc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.fb] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        vb vbVar = this.e;
        vbVar.setTop(z10);
        CharSequence accessibilityText = vbVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = vbVar.getParent();
        jb jbVar = this.f;
        if (parent != jbVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        rc rcVar = w;
        if (rcVar != null) {
            rcVar.b();
        }
        w = this;
        vbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.fb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                rc rcVar2 = rc.this;
                pb pbVar = rcVar2.p;
                if ((pbVar == null || pbVar.a()) && !z10) {
                    pb pbVar2 = rcVar2.p;
                    int f7 = pbVar2 != null ? pbVar2.f(rcVar2.a) : 0;
                    int i18 = rcVar2.o;
                    if (i18 != f7) {
                        o1.k kVar = rcVar2.d;
                        if (kVar == null || !kVar.f) {
                            o1.k kVar2 = new o1.k(new o1.j(i18));
                            o1.l lVar = new o1.l();
                            lVar.i = f7;
                            lVar.b(900.0f);
                            lVar.a(1.0f);
                            kVar2.u = lVar;
                            rcVar2.d = kVar2;
                            kVar2.b(new k7(rcVar2, 1));
                            rcVar2.d.a(new ib(rcVar2, 0));
                        } else {
                            kVar.u.i = f7;
                        }
                        rcVar2.d.f();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        vbVar.addOnLayoutChangeListener(new kb(this, z10));
        if (!this.t) {
            vbVar.addOnAttachStateChangeListener(new ai.u2(this, 6));
        }
        frameLayout.addView(jbVar);
    }

    public final void l() {
        vb vbVar = this.e;
        if (vbVar != null) {
            vbVar.updatePosition();
        }
    }

    public rc(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, vb vbVar, int i10) {
        this.i = new eb(this, 0);
        this.r = true;
        this.u = true;
        this.e = vbVar;
        this.n = true ^ (vbVar instanceof wb);
        this.f = new jb(this, vbVar, frameLayout);
        this.g = n2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
