package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class ic {
    public static ic w;
    public int a;
    public int b;
    public va c;
    public o1.j d;
    public final nb e;
    public final za f;
    public final org.telegram.ui.ActionBar.p2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public fb p;
    public mb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public ic() {
        this.i = new ua(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, fb fbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, fbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        ic icVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                icVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof nb) {
                icVar = ((nb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (icVar != null) {
            icVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        ic icVar = w;
        if (icVar != null) {
            icVar.b();
        }
    }

    public static ic f(FrameLayout frameLayout, nb nbVar, int i10) {
        return frameLayout == null ? new gb() : new ic(null, frameLayout, nbVar, i10);
    }

    public static ic g(org.telegram.ui.ActionBar.p2 p2Var, eb ebVar, int i10) {
        if (p2Var == null) {
            return new gb();
        }
        if (p2Var instanceof org.telegram.ui.xn) {
            nb.access$000(ebVar, -2, 1);
        } else if (p2Var instanceof org.telegram.ui.py) {
            nb.access$000(ebVar, -1, 0);
        }
        return new ic(p2Var, p2Var.getBulletinLayoutContainer(), ebVar, i10);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z4) {
        nb nbVar = this.e;
        if (nbVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.j0.a;
            if (nbVar.isLaidOut() || this.t) {
                nbVar.removeCallbacks(this.i);
                if (z4) {
                    int i11 = 1;
                    nbVar.transitionRunningExit = true;
                    nbVar.delegate = this.p;
                    nbVar.invalidate();
                    if (j10 >= 0) {
                        jb jbVar = new jb();
                        jbVar.a = j10;
                        this.q = jbVar;
                    } else if (nbVar != null && this.q == null) {
                        this.q = nbVar.createTransition();
                    }
                    mb mbVar = this.q;
                    Objects.requireNonNull(nbVar);
                    mbVar.c(nbVar, new wa(nbVar, i10), new ua(this, i11), new xa(this, i10));
                    return;
                }
            }
            fb fbVar = this.p;
            if (fbVar != null && !nbVar.top) {
                fbVar.c(0.0f);
                this.p.d(this);
            }
            nbVar.onExitTransitionStart();
            nbVar.onExitTransitionEnd();
            nbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new ua(this, 2));
            }
            nbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z4) {
        nb nbVar;
        boolean z10 = z4 && this.n;
        if (this.m == z10 || (nbVar = this.e) == null) {
            return;
        }
        this.m = z10;
        Runnable runnable = this.i;
        if (!z10) {
            nbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            nbVar.postDelayed(runnable, i10);
        }
    }

    public ic j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.va] */
    public final void k(final boolean z4) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        nb nbVar = this.e;
        nbVar.setTop(z4);
        CharSequence accessibilityText = nbVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = nbVar.getParent();
        za zaVar = this.f;
        if (parent != zaVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        ic icVar = w;
        if (icVar != null) {
            icVar.b();
        }
        w = this;
        nbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.va
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                ic icVar2 = ic.this;
                fb fbVar = icVar2.p;
                if ((fbVar == null || fbVar.a()) && !z4) {
                    fb fbVar2 = icVar2.p;
                    int f10 = fbVar2 != null ? fbVar2.f(icVar2.a) : 0;
                    int i18 = icVar2.o;
                    if (i18 != f10) {
                        o1.j jVar = icVar2.d;
                        if (jVar == null || !jVar.f) {
                            o1.j jVar2 = new o1.j(new kb.a(i18));
                            o1.k kVar = new o1.k();
                            kVar.i = f10;
                            kVar.b(900.0f);
                            kVar.a(1.0f);
                            jVar2.u = kVar;
                            icVar2.d = jVar2;
                            jVar2.b(new f7(icVar2, 1));
                            icVar2.d.a(new ya(icVar2, 0));
                        } else {
                            jVar.u.i = f10;
                        }
                        icVar2.d.f();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        nbVar.addOnLayoutChangeListener(new ab(this, z4));
        if (!this.t) {
            nbVar.addOnAttachStateChangeListener(new ff.b(this, 10));
        }
        frameLayout.addView(zaVar);
    }

    public final void l() {
        nb nbVar = this.e;
        if (nbVar != null) {
            nbVar.updatePosition();
        }
    }

    public ic(org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, nb nbVar, int i10) {
        this.i = new ua(this, 0);
        this.r = true;
        this.u = true;
        this.e = nbVar;
        this.n = true ^ (nbVar instanceof ob);
        this.f = new za(this, nbVar, frameLayout);
        this.g = p2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
