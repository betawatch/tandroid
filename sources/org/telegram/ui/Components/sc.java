package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public class sc {
    public static sc w;
    public int a;
    public int b;
    public gb c;
    public o1.k d;
    public final wb e;
    public final kb f;
    public final org.telegram.ui.ActionBar.m2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public qb p;
    public vb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public sc() {
        this.i = new fb(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, qb qbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, qbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        sc scVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                scVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof wb) {
                scVar = ((wb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (scVar != null) {
            scVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        sc scVar = w;
        if (scVar != null) {
            scVar.b();
        }
    }

    public static sc f(FrameLayout frameLayout, wb wbVar, int i10) {
        return frameLayout == null ? new rb() : new sc(null, frameLayout, wbVar, i10);
    }

    public static sc g(org.telegram.ui.ActionBar.m2 m2Var, pb pbVar, int i10) {
        if (m2Var == null) {
            return new rb();
        }
        if (m2Var instanceof org.telegram.ui.fo) {
            wb.access$000(pbVar, -2, 1);
        } else if (m2Var instanceof org.telegram.ui.yy) {
            wb.access$000(pbVar, -1, 0);
        }
        return new sc(m2Var, m2Var.getBulletinLayoutContainer(), pbVar, i10);
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
        wb wbVar = this.e;
        if (wbVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (wbVar.isLaidOut() || this.t) {
                wbVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    wbVar.transitionRunningExit = true;
                    wbVar.delegate = this.p;
                    wbVar.invalidate();
                    if (j10 >= 0) {
                        c3.s sVar = new c3.s();
                        sVar.a = j10;
                        this.q = sVar;
                    } else if (wbVar != null && this.q == null) {
                        this.q = wbVar.createTransition();
                    }
                    vb vbVar = this.q;
                    Objects.requireNonNull(wbVar);
                    vbVar.d(wbVar, new hb(wbVar, i10), new fb(this, i11), new ib(this, i10));
                    return;
                }
            }
            qb qbVar = this.p;
            if (qbVar != null && !wbVar.top) {
                qbVar.c(0.0f);
                this.p.d(this);
            }
            wbVar.onExitTransitionStart();
            wbVar.onExitTransitionEnd();
            wbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new fb(this, 2));
            }
            wbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        wb wbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (wbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            wbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            wbVar.postDelayed(runnable, i10);
        }
    }

    public sc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.gb] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        wb wbVar = this.e;
        wbVar.setTop(z10);
        CharSequence accessibilityText = wbVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = wbVar.getParent();
        kb kbVar = this.f;
        if (parent != kbVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        sc scVar = w;
        if (scVar != null) {
            scVar.b();
        }
        w = this;
        wbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.gb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                sc scVar2 = sc.this;
                qb qbVar = scVar2.p;
                if ((qbVar == null || qbVar.a()) && !z10) {
                    qb qbVar2 = scVar2.p;
                    int f7 = qbVar2 != null ? qbVar2.f(scVar2.a) : 0;
                    int i18 = scVar2.o;
                    if (i18 != f7) {
                        o1.k kVar = scVar2.d;
                        if (kVar == null || !kVar.f) {
                            o1.k kVar2 = new o1.k(new o1.j(i18));
                            o1.l lVar = new o1.l();
                            lVar.i = f7;
                            lVar.b(900.0f);
                            lVar.a(1.0f);
                            kVar2.u = lVar;
                            scVar2.d = kVar2;
                            kVar2.b(new n7(scVar2, 1));
                            scVar2.d.a(new jb(scVar2, 0));
                        } else {
                            kVar.u.i = f7;
                        }
                        scVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        wbVar.addOnLayoutChangeListener(new lb(this, z10));
        if (!this.t) {
            wbVar.addOnAttachStateChangeListener(new bi.j2(this, 6));
        }
        frameLayout.addView(kbVar);
    }

    public final void l() {
        wb wbVar = this.e;
        if (wbVar != null) {
            wbVar.updatePosition();
        }
    }

    public sc(org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, wb wbVar, int i10) {
        this.i = new fb(this, 0);
        this.r = true;
        this.u = true;
        this.e = wbVar;
        this.n = true ^ (wbVar instanceof xb);
        this.f = new kb(this, wbVar, frameLayout);
        this.g = m2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
