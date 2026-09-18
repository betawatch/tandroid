package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public class oc {
    public static oc w;
    public int a;
    public int b;
    public cb c;
    public o1.k d;
    public final sb e;
    public final gb f;
    public final org.telegram.ui.ActionBar.o2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public mb p;
    public rb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public oc() {
        this.i = new bb(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, mb mbVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, mbVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        oc ocVar;
        int childCount = frameLayout.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                ocVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i10);
            if (childAt instanceof sb) {
                ocVar = ((sb) childAt).bulletin;
                break;
            }
            i10++;
        }
        if (ocVar != null) {
            ocVar.c(0L, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        oc ocVar = w;
        if (ocVar != null) {
            ocVar.b();
        }
    }

    public static oc f(FrameLayout frameLayout, sb sbVar, int i10) {
        return frameLayout == null ? new nb() : new oc(null, frameLayout, sbVar, i10);
    }

    public static oc g(org.telegram.ui.ActionBar.o2 o2Var, lb lbVar, int i10) {
        if (o2Var == null) {
            return new nb();
        }
        if (o2Var instanceof org.telegram.ui.bo) {
            sb.access$000(lbVar, -2, 1);
        } else if (o2Var instanceof org.telegram.ui.wy) {
            sb.access$000(lbVar, -1, 0);
        }
        return new oc(o2Var, o2Var.getBulletinLayoutContainer(), lbVar, i10);
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
        sb sbVar = this.e;
        if (sbVar != null && this.l) {
            int i10 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (sbVar.isLaidOut() || this.t) {
                sbVar.removeCallbacks(this.i);
                if (z10) {
                    int i11 = 1;
                    sbVar.transitionRunningExit = true;
                    sbVar.delegate = this.p;
                    sbVar.invalidate();
                    if (j3 >= 0) {
                        c3.s sVar = new c3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (sbVar != null && this.q == null) {
                        this.q = sbVar.createTransition();
                    }
                    rb rbVar = this.q;
                    Objects.requireNonNull(sbVar);
                    rbVar.g(sbVar, new db(sbVar, i10), new bb(this, i11), new eb(this, i10));
                    return;
                }
            }
            mb mbVar = this.p;
            if (mbVar != null && !sbVar.top) {
                mbVar.c(0.0f);
                this.p.d(this);
            }
            sbVar.onExitTransitionStart();
            sbVar.onExitTransitionEnd();
            sbVar.onHide();
            if (this.h != null) {
                AndroidUtilities.runOnUIThread(new bb(this, 2));
            }
            sbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        sb sbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (sbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            sbVar.removeCallbacks(runnable);
            return;
        }
        int i10 = this.j;
        if (i10 >= 0) {
            sbVar.postDelayed(runnable, i10);
        }
    }

    public oc j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.cb] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        sb sbVar = this.e;
        sbVar.setTop(z10);
        CharSequence accessibilityText = sbVar.getAccessibilityText();
        if (accessibilityText != null) {
            AndroidUtilities.makeAccessibilityAnnouncement(accessibilityText);
        }
        ViewParent parent = sbVar.getParent();
        gb gbVar = this.f;
        if (parent != gbVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        oc ocVar = w;
        if (ocVar != null) {
            ocVar.b();
        }
        w = this;
        sbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.cb
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                oc ocVar2 = oc.this;
                mb mbVar = ocVar2.p;
                if ((mbVar == null || mbVar.a()) && !z10) {
                    mb mbVar2 = ocVar2.p;
                    int f7 = mbVar2 != null ? mbVar2.f(ocVar2.a) : 0;
                    int i18 = ocVar2.o;
                    if (i18 != f7) {
                        o1.k kVar = ocVar2.d;
                        if (kVar == null || !kVar.f) {
                            o1.k kVar2 = new o1.k(new o1.j(i18));
                            o1.l lVar = new o1.l();
                            lVar.i = f7;
                            lVar.b(900.0f);
                            lVar.a(1.0f);
                            kVar2.u = lVar;
                            ocVar2.d = kVar2;
                            kVar2.b(new i7(ocVar2, 1));
                            ocVar2.d.a(new fb(ocVar2, 0));
                        } else {
                            kVar.u.i = f7;
                        }
                        ocVar2.d.f();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        sbVar.addOnLayoutChangeListener(new hb(this, z10));
        if (!this.t) {
            sbVar.addOnAttachStateChangeListener(new ai.u2(this, 6));
        }
        frameLayout.addView(gbVar);
    }

    public final void l() {
        sb sbVar = this.e;
        if (sbVar != null) {
            sbVar.updatePosition();
        }
    }

    public oc(org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, sb sbVar, int i10) {
        this.i = new bb(this, 0);
        this.r = true;
        this.u = true;
        this.e = sbVar;
        this.n = true ^ (sbVar instanceof tb);
        this.f = new gb(this, sbVar, frameLayout);
        this.g = o2Var;
        this.h = frameLayout;
        this.j = i10;
    }
}
