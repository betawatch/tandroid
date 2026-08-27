package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class ec {
    public static ec w;
    public int a;
    public int b;
    public ta c;
    public o1.j d;
    public final jb e;
    public final xa f;
    public final org.telegram.ui.ActionBar.n2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public db p;
    public ib q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public ec() {
        this.i = new sa(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, db dbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, dbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        ec ecVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                ecVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof jb) {
                ecVar = ((jb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (ecVar != null) {
            ecVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        ec ecVar = w;
        if (ecVar != null) {
            ecVar.b();
        }
    }

    public static ec f(FrameLayout frameLayout, jb jbVar, int i10) {
        return frameLayout == null ? new eb() : new ec(null, frameLayout, jbVar, i10);
    }

    public static ec g(org.telegram.ui.ActionBar.n2 n2Var, cb cbVar, int i10) {
        if (n2Var == null) {
            return new eb();
        }
        if (n2Var instanceof org.telegram.ui.rn) {
            jb.access$000(cbVar, -2, 1);
        } else if (n2Var instanceof org.telegram.ui.gy) {
            jb.access$000(cbVar, -1, 0);
        }
        return new ec(n2Var, n2Var.getBulletinLayoutContainer(), cbVar, i10);
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
        jb jbVar = this.e;
        if (jbVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.j0.a;
            if (jbVar.isLaidOut() || this.t) {
                jbVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    jbVar.transitionRunningExit = true;
                    jbVar.delegate = this.p;
                    jbVar.invalidate();
                    if (j10 >= 0) {
                        m3.n nVar = new m3.n();
                        nVar.a = j10;
                        this.q = nVar;
                    } else if (jbVar != null && this.q == null) {
                        this.q = jbVar.createTransition();
                    }
                    ib ibVar = this.q;
                    Objects.requireNonNull(jbVar);
                    ibVar.c(jbVar, new ua(jbVar, i10), new sa(this, i11), new va(this, i10));
                    return;
                }
            }
            db dbVar = this.p;
            if (dbVar != null && !jbVar.top) {
                dbVar.c(0.0f);
                this.p.d(this);
            }
            jbVar.onExitTransitionStart();
            jbVar.onExitTransitionEnd();
            jbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new sa(this, 2));
            }
            jbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        jb jbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (jbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            jbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            jbVar.postDelayed(runnable, i10);
        }
    }

    public ec j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.ta] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        jb jbVar = this.e;
        jbVar.setTop(z10);
        CharSequence accessibilityText = jbVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = jbVar.getParent();
        xa xaVar = this.f;
        if (parent != xaVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        ec ecVar = w;
        if (ecVar != null) {
            ecVar.b();
        }
        w = this;
        jbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.ta
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                ec ecVar2 = ec.this;
                db dbVar = ecVar2.p;
                if ((dbVar == null || dbVar.a()) && !z10) {
                    db dbVar2 = ecVar2.p;
                    int f10 = dbVar2 != null ? dbVar2.f(ecVar2.a) : 0;
                    int i18 = ecVar2.o;
                    if (i18 != f10) {
                        o1.j jVar = ecVar2.d;
                        if (jVar == null || !jVar.f) {
                            o1.j jVar2 = new o1.j(new hb.a(i18));
                            o1.k kVar = new o1.k();
                            kVar.i = f10;
                            kVar.b(900.0f);
                            kVar.a(1.0f);
                            jVar2.u = kVar;
                            ecVar2.d = jVar2;
                            jVar2.b(new e7(ecVar2, 1));
                            ecVar2.d.a(new wa(ecVar2, 0));
                        } else {
                            jVar.u.i = f10;
                        }
                        ecVar2.d.f();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        jbVar.addOnLayoutChangeListener(new ya(this, z10));
        if (!this.t) {
            jbVar.addOnAttachStateChangeListener(new bf.b(this, 10));
        }
        frameLayout.addView(xaVar);
    }

    public final void l() {
        jb jbVar = this.e;
        if (jbVar != null) {
            jbVar.updatePosition();
        }
    }

    public ec(org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, jb jbVar, int i10) {
        this.i = new sa(this, 0);
        this.r = true;
        this.u = true;
        this.e = jbVar;
        this.n = true ^ (jbVar instanceof kb);
        this.f = new xa(this, jbVar, frameLayout);
        this.g = n2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
