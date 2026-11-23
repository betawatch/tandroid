package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public class gc {
    public static gc w;
    public int a;
    public int b;
    public va c;
    public r1.g d;
    public final lb e;
    public final za f;
    public final org.telegram.ui.ActionBar.g2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public fb p;
    public kb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public gc() {
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
        gc gcVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                gcVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i7);
            if (childAt instanceof lb) {
                gcVar = ((lb) childAt).bulletin;
                break;
            }
            i7++;
        }
        if (gcVar != null) {
            gcVar.c(0L, org.telegram.messenger.np.g1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        gc gcVar = w;
        if (gcVar != null) {
            gcVar.b();
        }
    }

    public static gc f(FrameLayout frameLayout, lb lbVar, int i7) {
        return frameLayout == null ? new gb() : new gc(null, frameLayout, lbVar, i7);
    }

    public static gc g(org.telegram.ui.ActionBar.g2 g2Var, eb ebVar, int i7) {
        if (g2Var == null) {
            return new gb();
        }
        if (g2Var instanceof org.telegram.ui.bn) {
            lb.access$000(ebVar, -2, 1);
        } else if (g2Var instanceof org.telegram.ui.cx) {
            lb.access$000(ebVar, -1, 0);
        }
        return new gc(g2Var, g2Var.getBulletinLayoutContainer(), ebVar, i7);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.np.g1().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z10) {
        lb lbVar = this.e;
        if (lbVar != null && this.l) {
            int i7 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (lbVar.isLaidOut() || this.t) {
                lbVar.removeCallbacks(this.i);
                if (z10) {
                    int i10 = 1;
                    lbVar.transitionRunningExit = true;
                    lbVar.delegate = this.p;
                    lbVar.invalidate();
                    if (j3 >= 0) {
                        f3.s sVar = new f3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (lbVar != null && this.q == null) {
                        this.q = lbVar.createTransition();
                    }
                    kb kbVar = this.q;
                    Objects.requireNonNull(lbVar);
                    kbVar.j(lbVar, new wa(lbVar, i7), new ua(this, i10), new xa(this, i7));
                    return;
                }
            }
            fb fbVar = this.p;
            if (fbVar != null && !lbVar.top) {
                fbVar.c(0.0f);
                this.p.d(this);
            }
            lbVar.onExitTransitionStart();
            lbVar.onExitTransitionEnd();
            lbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.g3(new ua(this, 2));
            }
            lbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        lb lbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (lbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            lbVar.removeCallbacks(runnable);
            return;
        }
        int i7 = this.j;
        if (i7 >= 0) {
            lbVar.postDelayed(runnable, i7);
        }
    }

    public gc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.va] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        lb lbVar = this.e;
        lbVar.setTop(z10);
        CharSequence accessibilityText = lbVar.getAccessibilityText();
        if (accessibilityText != null) {
            org.telegram.messenger.g0.i2(accessibilityText);
        }
        ViewParent parent = lbVar.getParent();
        za zaVar = this.f;
        if (parent != zaVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        gc gcVar = w;
        if (gcVar != null) {
            gcVar.b();
        }
        w = this;
        lbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.va
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                gc gcVar2 = gc.this;
                fb fbVar = gcVar2.p;
                if ((fbVar == null || fbVar.a()) && !z10) {
                    fb fbVar2 = gcVar2.p;
                    int f10 = fbVar2 != null ? fbVar2.f(gcVar2.a) : 0;
                    int i17 = gcVar2.o;
                    if (i17 != f10) {
                        r1.g gVar = gcVar2.d;
                        if (gVar == null || !gVar.f) {
                            r1.g gVar2 = new r1.g(new r1.f(i17));
                            r1.h hVar = new r1.h();
                            hVar.i = f10;
                            hVar.b(900.0f);
                            hVar.a(1.0f);
                            gVar2.m = hVar;
                            gcVar2.d = gVar2;
                            gVar2.b(new j7(gcVar2, 1));
                            gcVar2.d.a(new ya(gcVar2, 0));
                        } else {
                            gVar.m.i = f10;
                        }
                        gcVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        lbVar.addOnLayoutChangeListener(new ab(this, z10));
        if (!this.t) {
            lbVar.addOnAttachStateChangeListener(new bi.v2(this, 12));
        }
        frameLayout.addView(zaVar);
    }

    public final void l() {
        lb lbVar = this.e;
        if (lbVar != null) {
            lbVar.updatePosition();
        }
    }

    public gc(org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, lb lbVar, int i7) {
        this.i = new ua(this, 0);
        this.r = true;
        this.u = true;
        this.e = lbVar;
        this.n = true ^ (lbVar instanceof mb);
        this.f = new za(this, lbVar, frameLayout);
        this.g = g2Var;
        this.h = frameLayout;
        this.j = i7;
    }
}
