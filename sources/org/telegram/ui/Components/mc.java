package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class mc {
    public static mc w;
    public int a;
    public int b;
    public ab c;
    public o1.k d;
    public final rb e;
    public final eb f;
    public final org.telegram.ui.ActionBar.o2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public kb p;
    public qb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public mc() {
        this.i = new za(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, kb kbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, kbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        mc mcVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                mcVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof rb) {
                mcVar = ((rb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (mcVar != null) {
            mcVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        mc mcVar = w;
        if (mcVar != null) {
            mcVar.b();
        }
    }

    public static mc f(FrameLayout frameLayout, rb rbVar, int i10) {
        return frameLayout == null ? new lb() : new mc(null, frameLayout, rbVar, i10);
    }

    public static mc g(org.telegram.ui.ActionBar.o2 o2Var, jb jbVar, int i10) {
        if (o2Var == null) {
            return new lb();
        }
        if (o2Var instanceof org.telegram.ui.tn) {
            rb.access$000(jbVar, -2, 1);
        } else if (o2Var instanceof org.telegram.ui.fy) {
            rb.access$000(jbVar, -1, 0);
        }
        return new mc(o2Var, o2Var.getBulletinLayoutContainer(), jbVar, i10);
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
        rb rbVar = this.e;
        if (rbVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.j0.a;
            if (rbVar.isLaidOut() || this.t) {
                rbVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    rbVar.transitionRunningExit = true;
                    rbVar.delegate = this.p;
                    rbVar.invalidate();
                    if (j10 >= 0) {
                        o3.n nVar = new o3.n();
                        nVar.a = j10;
                        this.q = nVar;
                    } else if (rbVar != null && this.q == null) {
                        this.q = rbVar.createTransition();
                    }
                    qb qbVar = this.q;
                    Objects.requireNonNull(rbVar);
                    qbVar.e(rbVar, new bb(rbVar, i10), new za(this, i11), new cb(this, i10));
                    return;
                }
            }
            kb kbVar = this.p;
            if (kbVar != null && !rbVar.top) {
                kbVar.c(0.0f);
                this.p.d(this);
            }
            rbVar.onExitTransitionStart();
            rbVar.onExitTransitionEnd();
            rbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new za(this, 2));
            }
            rbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        rb rbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (rbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            rbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            rbVar.postDelayed(runnable, i10);
        }
    }

    public mc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.ab] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        rb rbVar = this.e;
        rbVar.setTop(z10);
        CharSequence accessibilityText = rbVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = rbVar.getParent();
        eb ebVar = this.f;
        if (parent != ebVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        mc mcVar = w;
        if (mcVar != null) {
            mcVar.b();
        }
        w = this;
        rbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.ab
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                mc mcVar2 = mc.this;
                kb kbVar = mcVar2.p;
                if ((kbVar == null || kbVar.a()) && !z10) {
                    kb kbVar2 = mcVar2.p;
                    int f9 = kbVar2 != null ? kbVar2.f(mcVar2.a) : 0;
                    int i18 = mcVar2.o;
                    if (i18 != f9) {
                        o1.k kVar = mcVar2.d;
                        if (kVar == null || !kVar.f) {
                            o1.k kVar2 = new o1.k(new ib.a(i18));
                            o1.l lVar = new o1.l();
                            lVar.i = f9;
                            lVar.b(900.0f);
                            lVar.a(1.0f);
                            kVar2.u = lVar;
                            mcVar2.d = kVar2;
                            kVar2.b(new j7(mcVar2, 1));
                            mcVar2.d.a(new db(mcVar2, 0));
                        } else {
                            kVar.u.i = f9;
                        }
                        mcVar2.d.f();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        rbVar.addOnLayoutChangeListener(new fb(this, z10));
        if (!this.t) {
            rbVar.addOnAttachStateChangeListener(new df.b(this, 10));
        }
        frameLayout.addView(ebVar);
    }

    public final void l() {
        rb rbVar = this.e;
        if (rbVar != null) {
            rbVar.updatePosition();
        }
    }

    public mc(org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, rb rbVar, int i10) {
        this.i = new za(this, 0);
        this.r = true;
        this.u = true;
        this.e = rbVar;
        this.n = true ^ (rbVar instanceof sb);
        this.f = new eb(this, rbVar, frameLayout);
        this.g = o2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
