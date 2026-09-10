package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class pc {
    public static pc w;
    public int a;
    public int b;
    public db c;
    public o1.k d;
    public final tb e;
    public final hb f;
    public final org.telegram.ui.ActionBar.p2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public nb p;
    public sb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public pc() {
        this.i = new cb(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, nb nbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, nbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        pc pcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                pcVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof tb) {
                pcVar = ((tb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (pcVar != null) {
            pcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        pc pcVar = w;
        if (pcVar != null) {
            pcVar.b();
        }
    }

    public static pc f(FrameLayout frameLayout, tb tbVar, int i10) {
        return frameLayout == null ? new ob() : new pc(null, frameLayout, tbVar, i10);
    }

    public static pc g(org.telegram.ui.ActionBar.p2 p2Var, mb mbVar, int i10) {
        if (p2Var == null) {
            return new ob();
        }
        if (p2Var instanceof org.telegram.ui.eo) {
            tb.access$000(mbVar, -2, 1);
        } else if (p2Var instanceof org.telegram.ui.wy) {
            tb.access$000(mbVar, -1, 0);
        }
        return new pc(p2Var, p2Var.getBulletinLayoutContainer(), mbVar, i10);
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
        tb tbVar = this.e;
        if (tbVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (tbVar.isLaidOut() || this.t) {
                tbVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    tbVar.transitionRunningExit = true;
                    tbVar.delegate = this.p;
                    tbVar.invalidate();
                    if (j3 >= 0) {
                        c3.s sVar = new c3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (tbVar != null && this.q == null) {
                        this.q = tbVar.createTransition();
                    }
                    sb sbVar = this.q;
                    Objects.requireNonNull(tbVar);
                    sbVar.k(tbVar, new eb(tbVar, i10), new cb(this, i11), new fb(this, i10));
                    return;
                }
            }
            nb nbVar = this.p;
            if (nbVar != null && !tbVar.top) {
                nbVar.c(0.0f);
                this.p.d(this);
            }
            tbVar.onExitTransitionStart();
            tbVar.onExitTransitionEnd();
            tbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new cb(this, 2));
            }
            tbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        tb tbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (tbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            tbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            tbVar.postDelayed(runnable, i10);
        }
    }

    public pc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.db] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        tb tbVar = this.e;
        tbVar.setTop(z10);
        CharSequence accessibilityText = tbVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = tbVar.getParent();
        hb hbVar = this.f;
        if (parent != hbVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        pc pcVar = w;
        if (pcVar != null) {
            pcVar.b();
        }
        w = this;
        tbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.db
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                pc pcVar2 = pc.this;
                nb nbVar = pcVar2.p;
                if ((nbVar == null || nbVar.a()) && !z10) {
                    nb nbVar2 = pcVar2.p;
                    int f7 = nbVar2 != null ? nbVar2.f(pcVar2.a) : 0;
                    int i18 = pcVar2.o;
                    if (i18 != f7) {
                        o1.k kVar = pcVar2.d;
                        if (kVar == null || !kVar.f) {
                            o1.k kVar2 = new o1.k(new o1.j(i18));
                            o1.l lVar = new o1.l();
                            lVar.i = f7;
                            lVar.b(900.0f);
                            lVar.a(1.0f);
                            kVar2.u = lVar;
                            pcVar2.d = kVar2;
                            kVar2.b(new k7(pcVar2, 1));
                            pcVar2.d.a(new gb(pcVar2, 0));
                        } else {
                            kVar.u.i = f7;
                        }
                        pcVar2.d.f();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        tbVar.addOnLayoutChangeListener(new ib(this, z10));
        if (!this.t) {
            tbVar.addOnAttachStateChangeListener(new l.d(this, 4));
        }
        frameLayout.addView(hbVar);
    }

    public final void l() {
        tb tbVar = this.e;
        if (tbVar != null) {
            tbVar.updatePosition();
        }
    }

    public pc(org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, tb tbVar, int i10) {
        this.i = new cb(this, 0);
        this.r = true;
        this.u = true;
        this.e = tbVar;
        this.n = true ^ (tbVar instanceof ub);
        this.f = new hb(this, tbVar, frameLayout);
        this.g = p2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
