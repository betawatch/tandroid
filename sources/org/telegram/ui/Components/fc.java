package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public class fc {
    public static fc w;
    public int a;
    public int b;
    public ua c;
    public r1.g d;
    public final kb e;
    public final ya f;
    public final org.telegram.ui.ActionBar.g2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public eb p;
    public jb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public fc() {
        this.i = new ta(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, eb ebVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, ebVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        fc fcVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                fcVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i7);
            if (childAt instanceof kb) {
                fcVar = ((kb) childAt).bulletin;
                break;
            }
            i7++;
        }
        if (fcVar != null) {
            fcVar.c(0L, org.telegram.messenger.mp.g1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        fc fcVar = w;
        if (fcVar != null) {
            fcVar.b();
        }
    }

    public static fc f(FrameLayout frameLayout, kb kbVar, int i7) {
        return frameLayout == null ? new fb() : new fc(null, frameLayout, kbVar, i7);
    }

    public static fc g(org.telegram.ui.ActionBar.g2 g2Var, db dbVar, int i7) {
        if (g2Var == null) {
            return new fb();
        }
        if (g2Var instanceof org.telegram.ui.bn) {
            kb.access$000(dbVar, -2, 1);
        } else if (g2Var instanceof org.telegram.ui.bx) {
            kb.access$000(dbVar, -1, 0);
        }
        return new fc(g2Var, g2Var.getBulletinLayoutContainer(), dbVar, i7);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.mp.g1().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z10) {
        kb kbVar = this.e;
        if (kbVar != null && this.l) {
            int i7 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (kbVar.isLaidOut() || this.t) {
                kbVar.removeCallbacks(this.i);
                if (z10) {
                    int i10 = 1;
                    kbVar.transitionRunningExit = true;
                    kbVar.delegate = this.p;
                    kbVar.invalidate();
                    if (j3 >= 0) {
                        f3.s sVar = new f3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (kbVar != null && this.q == null) {
                        this.q = kbVar.createTransition();
                    }
                    jb jbVar = this.q;
                    Objects.requireNonNull(kbVar);
                    jbVar.b(kbVar, new va(kbVar, i7), new ta(this, i10), new wa(this, i7));
                    return;
                }
            }
            eb ebVar = this.p;
            if (ebVar != null && !kbVar.top) {
                ebVar.c(0.0f);
                this.p.d(this);
            }
            kbVar.onExitTransitionStart();
            kbVar.onExitTransitionEnd();
            kbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.g3(new ta(this, 2));
            }
            kbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        kb kbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (kbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            kbVar.removeCallbacks(runnable);
            return;
        }
        int i7 = this.j;
        if (i7 >= 0) {
            kbVar.postDelayed(runnable, i7);
        }
    }

    public fc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.ua] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        kb kbVar = this.e;
        kbVar.setTop(z10);
        CharSequence accessibilityText = kbVar.getAccessibilityText();
        if (accessibilityText != null) {
            org.telegram.messenger.g0.i2(accessibilityText);
        }
        ViewParent parent = kbVar.getParent();
        ya yaVar = this.f;
        if (parent != yaVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        fc fcVar = w;
        if (fcVar != null) {
            fcVar.b();
        }
        w = this;
        kbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.ua
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                fc fcVar2 = fc.this;
                eb ebVar = fcVar2.p;
                if ((ebVar == null || ebVar.a()) && !z10) {
                    eb ebVar2 = fcVar2.p;
                    int f10 = ebVar2 != null ? ebVar2.f(fcVar2.a) : 0;
                    int i17 = fcVar2.o;
                    if (i17 != f10) {
                        r1.g gVar = fcVar2.d;
                        if (gVar == null || !gVar.f) {
                            r1.g gVar2 = new r1.g(new r1.f(i17));
                            r1.h hVar = new r1.h();
                            hVar.i = f10;
                            hVar.b(900.0f);
                            hVar.a(1.0f);
                            gVar2.m = hVar;
                            fcVar2.d = gVar2;
                            gVar2.b(new i7(fcVar2, 1));
                            fcVar2.d.a(new xa(fcVar2, 0));
                        } else {
                            gVar.m.i = f10;
                        }
                        fcVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        kbVar.addOnLayoutChangeListener(new za(this, z10));
        if (!this.t) {
            kbVar.addOnAttachStateChangeListener(new bi.x2(this, 12));
        }
        frameLayout.addView(yaVar);
    }

    public final void l() {
        kb kbVar = this.e;
        if (kbVar != null) {
            kbVar.updatePosition();
        }
    }

    public fc(org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, kb kbVar, int i7) {
        this.i = new ta(this, 0);
        this.r = true;
        this.u = true;
        this.e = kbVar;
        this.n = true ^ (kbVar instanceof lb);
        this.f = new ya(this, kbVar, frameLayout);
        this.g = g2Var;
        this.h = frameLayout;
        this.j = i7;
    }
}
