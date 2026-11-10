package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class bc {
    public static bc w;
    public int a;
    public int b;
    public pa c;
    public r1.g d;
    public final fb e;
    public final ta f;
    public final org.telegram.ui.ActionBar.f2 g;
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

    public bc() {
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
        bc bcVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                bcVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i7);
            if (childAt instanceof fb) {
                bcVar = ((fb) childAt).bulletin;
                break;
            }
            i7++;
        }
        if (bcVar != null) {
            bcVar.c(0L, org.telegram.messenger.qp.e1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        bc bcVar = w;
        if (bcVar != null) {
            bcVar.b();
        }
    }

    public static bc f(FrameLayout frameLayout, fb fbVar, int i7) {
        return frameLayout == null ? new ab() : new bc(null, frameLayout, fbVar, i7);
    }

    public static bc g(org.telegram.ui.ActionBar.f2 f2Var, ya yaVar, int i7) {
        if (f2Var == null) {
            return new ab();
        }
        if (f2Var instanceof org.telegram.ui.cn) {
            fb.access$000(yaVar, -2, 1);
        } else if (f2Var instanceof org.telegram.ui.zw) {
            fb.access$000(yaVar, -1, 0);
        }
        return new bc(f2Var, f2Var.getBulletinLayoutContainer(), yaVar, i7);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.qp.e1().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z9) {
        fb fbVar = this.e;
        if (fbVar != null && this.l) {
            int i7 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (fbVar.isLaidOut() || this.t) {
                fbVar.removeCallbacks(this.i);
                if (z9) {
                    int i10 = 1;
                    fbVar.transitionRunningExit = true;
                    fbVar.delegate = this.p;
                    fbVar.invalidate();
                    if (j3 >= 0) {
                        f3.s sVar = new f3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (fbVar != null && this.q == null) {
                        this.q = fbVar.createTransition();
                    }
                    eb ebVar = this.q;
                    Objects.requireNonNull(fbVar);
                    ebVar.c(fbVar, new qa(fbVar, i7), new oa(this, i10), new ra(this, i7));
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

    public final void i(boolean z9) {
        fb fbVar;
        boolean z10 = z9 && this.n;
        if (this.m == z10 || (fbVar = this.e) == null) {
            return;
        }
        this.m = z10;
        Runnable runnable = this.i;
        if (!z10) {
            fbVar.removeCallbacks(runnable);
            return;
        }
        int i7 = this.j;
        if (i7 >= 0) {
            fbVar.postDelayed(runnable, i7);
        }
    }

    public bc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.pa] */
    public final void k(final boolean z9) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        fb fbVar = this.e;
        fbVar.setTop(z9);
        CharSequence accessibilityText = fbVar.getAccessibilityText();
        if (accessibilityText != null) {
            org.telegram.messenger.g0.i2(accessibilityText);
        }
        ViewParent parent = fbVar.getParent();
        ta taVar = this.f;
        if (parent != taVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        bc bcVar = w;
        if (bcVar != null) {
            bcVar.b();
        }
        w = this;
        fbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.pa
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                bc bcVar2 = bc.this;
                za zaVar = bcVar2.p;
                if ((zaVar == null || zaVar.a()) && !z9) {
                    za zaVar2 = bcVar2.p;
                    int f10 = zaVar2 != null ? zaVar2.f(bcVar2.a) : 0;
                    int i17 = bcVar2.o;
                    if (i17 != f10) {
                        r1.g gVar = bcVar2.d;
                        if (gVar == null || !gVar.f) {
                            r1.g gVar2 = new r1.g(new r1.f(i17));
                            r1.h hVar = new r1.h();
                            hVar.i = f10;
                            hVar.b(900.0f);
                            hVar.a(1.0f);
                            gVar2.m = hVar;
                            bcVar2.d = gVar2;
                            gVar2.b(new d7(bcVar2, 1));
                            bcVar2.d.a(new sa(bcVar2, 0));
                        } else {
                            gVar.m.i = f10;
                        }
                        bcVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        fbVar.addOnLayoutChangeListener(new ua(this, z9));
        if (!this.t) {
            fbVar.addOnAttachStateChangeListener(new bi.m6(this, 8));
        }
        frameLayout.addView(taVar);
    }

    public final void l() {
        fb fbVar = this.e;
        if (fbVar != null) {
            fbVar.updatePosition();
        }
    }

    public bc(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, fb fbVar, int i7) {
        this.i = new oa(this, 0);
        this.r = true;
        this.u = true;
        this.e = fbVar;
        this.n = true ^ (fbVar instanceof gb);
        this.f = new ta(this, fbVar, frameLayout);
        this.g = f2Var;
        this.h = frameLayout;
        this.j = i7;
    }
}
