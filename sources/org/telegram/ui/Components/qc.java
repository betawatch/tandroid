package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class qc {
    public static qc w;
    public int a;
    public int b;
    public eb c;
    public o1.k d;
    public final ub e;
    public final ib f;
    public final org.telegram.ui.ActionBar.n2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public ob p;
    public tb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public qc() {
        this.i = new db(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, ob obVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, obVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        qc qcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                qcVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof ub) {
                qcVar = ((ub) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (qcVar != null) {
            qcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        qc qcVar = w;
        if (qcVar != null) {
            qcVar.b();
        }
    }

    public static qc f(FrameLayout frameLayout, ub ubVar, int i10) {
        return frameLayout == null ? new pb() : new qc(null, frameLayout, ubVar, i10);
    }

    public static qc g(org.telegram.ui.ActionBar.n2 n2Var, nb nbVar, int i10) {
        if (n2Var == null) {
            return new pb();
        }
        if (n2Var instanceof org.telegram.ui.co) {
            ub.access$000(nbVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.uy) {
            ub.access$000(nbVar, -1, 0);
        }
        return new qc(n2Var, n2Var.getBulletinLayoutContainer(), nbVar, i10);
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
        ub ubVar = this.e;
        if (ubVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (ubVar.isLaidOut() || this.t) {
                ubVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    ubVar.transitionRunningExit = true;
                    ubVar.delegate = this.p;
                    ubVar.invalidate();
                    if (j3 >= 0) {
                        c3.s sVar = new c3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (ubVar != null && this.q == null) {
                        this.q = ubVar.createTransition();
                    }
                    tb tbVar = this.q;
                    Objects.requireNonNull(ubVar);
                    tbVar.e(ubVar, new fb(ubVar, i10), new db(this, i11), new gb(this, i10));
                    return;
                }
            }
            ob obVar = this.p;
            if (obVar != null && !ubVar.top) {
                obVar.c(0.0f);
                this.p.d(this);
            }
            ubVar.onExitTransitionStart();
            ubVar.onExitTransitionEnd();
            ubVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new db(this, 2));
            }
            ubVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        ub ubVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (ubVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            ubVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            ubVar.postDelayed(runnable, i10);
        }
    }

    public qc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.eb] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        ub ubVar = this.e;
        ubVar.setTop(z10);
        CharSequence accessibilityText = ubVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = ubVar.getParent();
        ib ibVar = this.f;
        if (parent != ibVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        qc qcVar = w;
        if (qcVar != null) {
            qcVar.b();
        }
        w = this;
        ubVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.eb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                qc qcVar2 = qc.this;
                ob obVar = qcVar2.p;
                if ((obVar == null || obVar.a()) && !z10) {
                    ob obVar2 = qcVar2.p;
                    int f7 = obVar2 != null ? obVar2.f(qcVar2.a) : 0;
                    int i18 = qcVar2.o;
                    if (i18 != f7) {
                        o1.k kVar = qcVar2.d;
                        if (kVar == null || !kVar.f) {
                            o1.k kVar2 = new o1.k(new o1.j(i18));
                            o1.l lVar = new o1.l();
                            lVar.i = f7;
                            lVar.b(900.0f);
                            lVar.a(1.0f);
                            kVar2.u = lVar;
                            qcVar2.d = kVar2;
                            kVar2.b(new l7(qcVar2, 1));
                            qcVar2.d.a(new hb(qcVar2, 0));
                        } else {
                            kVar.u.i = f7;
                        }
                        qcVar2.d.f();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        ubVar.addOnLayoutChangeListener(new jb(this, z10));
        if (!this.t) {
            ubVar.addOnAttachStateChangeListener(new bi.i2(this, 5));
        }
        frameLayout.addView(ibVar);
    }

    public final void l() {
        ub ubVar = this.e;
        if (ubVar != null) {
            ubVar.updatePosition();
        }
    }

    public qc(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, ub ubVar, int i10) {
        this.i = new db(this, 0);
        this.r = true;
        this.u = true;
        this.e = ubVar;
        this.n = true ^ (ubVar instanceof vb);
        this.f = new ib(this, ubVar, frameLayout);
        this.g = n2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
