package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class qc {
    public static qc x;
    public int a;
    public int b;
    public eb c;
    public o1.j d;
    public final ub e;
    public final ib f;
    public final org.telegram.ui.ActionBar.r2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public ob q;
    public tb r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public Runnable w;

    public qc() {
        this.i = new db(this, 0);
        this.o = true;
        this.s = true;
        this.v = true;
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
        qc qcVar = x;
        if (qcVar != null) {
            qcVar.b();
        }
    }

    public static qc f(FrameLayout frameLayout, ub ubVar, int i10) {
        return frameLayout == null ? new pb() : new qc(null, frameLayout, ubVar, i10);
    }

    public static qc g(org.telegram.ui.ActionBar.r2 r2Var, ub ubVar, int i10) {
        if (r2Var == null) {
            return new pb();
        }
        if (r2Var instanceof org.telegram.ui.wn) {
            ub.access$000(ubVar, -2, 1);
        } else if (r2Var instanceof org.telegram.ui.ey) {
            ub.access$000(ubVar, -1, 0);
        }
        return new qc(r2Var, r2Var.getBulletinLayoutContainer(), ubVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z10) {
        ub ubVar = this.e;
        if (ubVar != null && this.m) {
            int i10 = 0;
            this.m = false;
            if (x == this) {
                x = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (ubVar.isLaidOut() || this.u) {
                ubVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    ubVar.transitionRunningExit = true;
                    ubVar.delegate = this.q;
                    ubVar.invalidate();
                    if (j10 >= 0 && !this.l) {
                        c3.s sVar = new c3.s();
                        sVar.a = j10;
                        this.r = sVar;
                    } else if (ubVar != null && this.r == null) {
                        this.r = ubVar.createTransition();
                    }
                    tb tbVar = this.r;
                    Objects.requireNonNull(ubVar);
                    tbVar.o(ubVar, new fb(ubVar, i10), new db(this, i11), new gb(this, i10));
                    return;
                }
            }
            ob obVar = this.q;
            if (obVar != null && !ubVar.top) {
                obVar.c(0.0f);
                this.q.d(this);
            }
            ubVar.onExitTransitionStart();
            ubVar.onExitTransitionEnd();
            ubVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new db(this, 2));
            }
            ubVar.onDetach();
            Runnable runnable = this.w;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        ub ubVar;
        boolean z11 = z10 && this.o;
        if (this.n == z11 || (ubVar = this.e) == null) {
            return;
        }
        this.n = z11;
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
        if (this.m || (frameLayout = this.h) == 0) {
            return;
        }
        this.m = true;
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
        qc qcVar = x;
        if (qcVar != null) {
            qcVar.b();
        }
        x = this;
        ubVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.eb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                qc qcVar2 = qc.this;
                ob obVar = qcVar2.q;
                if ((obVar == null || obVar.a()) && !z10) {
                    ob obVar2 = qcVar2.q;
                    int f7 = obVar2 != null ? obVar2.f(qcVar2.a) : 0;
                    int i18 = qcVar2.p;
                    if (i18 != f7) {
                        o1.j jVar = qcVar2.d;
                        if (jVar == null || !jVar.f) {
                            o1.j jVar2 = new o1.j(new ac.a(i18));
                            o1.k kVar = new o1.k();
                            kVar.i = f7;
                            kVar.b(900.0f);
                            kVar.a(1.0f);
                            jVar2.u = kVar;
                            qcVar2.d = jVar2;
                            jVar2.b(new n7(qcVar2, 1));
                            qcVar2.d.a(new hb(qcVar2, 0));
                        } else {
                            jVar.u.i = f7;
                        }
                        qcVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        ubVar.addOnLayoutChangeListener(new jb(this, z10));
        if (!this.u) {
            ubVar.addOnAttachStateChangeListener(new bi.i6(this, 7));
        }
        frameLayout.addView(ibVar);
    }

    public final void l() {
        ub ubVar = this.e;
        if (ubVar != null) {
            ubVar.updatePosition();
        }
    }

    public qc(org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, ub ubVar, int i10) {
        this.i = new db(this, 0);
        this.s = true;
        this.v = true;
        this.e = ubVar;
        this.o = true ^ (ubVar instanceof vb);
        this.f = new ib(this, ubVar, frameLayout);
        this.g = r2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
