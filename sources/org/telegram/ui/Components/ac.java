package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ac {
    public static ac w;
    public int a;
    public int b;
    public pa c;
    public q1.g d;
    public final fb e;
    public final ta f;
    public final org.telegram.ui.ActionBar.d2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public za p;
    public eb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public ac() {
        this.i = new oa(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, za zaVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, zaVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        ac acVar;
        int childCount = frameLayout.getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                acVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i3);
            if (childAt instanceof fb) {
                acVar = ((fb) childAt).bulletin;
                break;
            }
            i3++;
        }
        if (acVar != null) {
            acVar.c(0L, org.telegram.messenger.hp.e1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        ac acVar = w;
        if (acVar != null) {
            acVar.b();
        }
    }

    public static ac f(FrameLayout frameLayout, fb fbVar, int i3) {
        return frameLayout == null ? new ab() : new ac(null, frameLayout, fbVar, i3);
    }

    public static ac g(org.telegram.ui.ActionBar.d2 d2Var, ya yaVar, int i3) {
        if (d2Var == null) {
            return new ab();
        }
        if (d2Var instanceof org.telegram.ui.wm) {
            fb.access$000(yaVar, -2, 1);
        } else if (d2Var instanceof org.telegram.ui.uw) {
            fb.access$000(yaVar, -1, 0);
        }
        return new ac(d2Var, d2Var.getBulletinLayoutContainer(), yaVar, i3);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.hp.e1().getBoolean("view_animations", true));
    }

    public final void c(long j10, boolean z10) {
        fb fbVar = this.e;
        if (fbVar != null && this.l) {
            int i3 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (fbVar.isLaidOut() || this.t) {
                fbVar.removeCallbacks(this.i);
                if (z10) {
                    int i10 = 1;
                    fbVar.transitionRunningExit = true;
                    fbVar.delegate = this.p;
                    fbVar.invalidate();
                    if (j10 >= 0) {
                        e3.s sVar = new e3.s();
                        sVar.a = j10;
                        this.q = sVar;
                    } else if (fbVar != null && this.q == null) {
                        this.q = fbVar.createTransition();
                    }
                    eb ebVar = this.q;
                    Objects.requireNonNull(fbVar);
                    ebVar.e(fbVar, new qa(fbVar, i3), new oa(this, i10), new ra(this, i3));
                    return;
                }
            }
            za zaVar = this.p;
            if (zaVar != null && !fbVar.top) {
                zaVar.c(0.0f);
                this.p.d(this);
            }
            fbVar.onExitTransitionStart();
            fbVar.onExitTransitionEnd();
            fbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.h3(new oa(this, 2));
            }
            fbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        fb fbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (fbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            fbVar.removeCallbacks(runnable);
            return;
        }
        int i3 = this.j;
        if (i3 >= 0) {
            fbVar.postDelayed(runnable, i3);
        }
    }

    public ac j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.pa] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        fb fbVar = this.e;
        fbVar.setTop(z10);
        CharSequence accessibilityText = fbVar.getAccessibilityText();
        if (accessibilityText != null) {
            org.telegram.messenger.g0.i2(accessibilityText);
        }
        ViewParent parent = fbVar.getParent();
        ta taVar = this.f;
        if (parent != taVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        ac acVar = w;
        if (acVar != null) {
            acVar.b();
        }
        w = this;
        fbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.pa
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                ac acVar2 = ac.this;
                za zaVar = acVar2.p;
                if ((zaVar == null || zaVar.a()) && !z10) {
                    za zaVar2 = acVar2.p;
                    int f10 = zaVar2 != null ? zaVar2.f(acVar2.a) : 0;
                    int i17 = acVar2.o;
                    if (i17 != f10) {
                        q1.g gVar = acVar2.d;
                        if (gVar == null || !gVar.f) {
                            q1.g gVar2 = new q1.g(new q1.f(i17));
                            q1.h hVar = new q1.h();
                            hVar.i = f10;
                            hVar.b(900.0f);
                            hVar.a(1.0f);
                            gVar2.m = hVar;
                            acVar2.d = gVar2;
                            gVar2.b(new c7(acVar2, 1));
                            acVar2.d.a(new sa(acVar2, 0));
                        } else {
                            gVar.m.i = f10;
                        }
                        acVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        fbVar.addOnLayoutChangeListener(new ua(this, z10));
        if (!this.t) {
            fbVar.addOnAttachStateChangeListener(new ai.f2(this, 12));
        }
        frameLayout.addView(taVar);
    }

    public final void l() {
        fb fbVar = this.e;
        if (fbVar != null) {
            fbVar.updatePosition();
        }
    }

    public ac(org.telegram.ui.ActionBar.d2 d2Var, FrameLayout frameLayout, fb fbVar, int i3) {
        this.i = new oa(this, 0);
        this.r = true;
        this.u = true;
        this.e = fbVar;
        this.n = true ^ (fbVar instanceof gb);
        this.f = new ta(this, fbVar, frameLayout);
        this.g = d2Var;
        this.h = frameLayout;
        this.j = i3;
    }
}
