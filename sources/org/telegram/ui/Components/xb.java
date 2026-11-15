package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import j$.util.Objects;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class xb {
    public static xb w;
    public int a;
    public int b;
    public ma c;
    public r1.g d;
    public final cb e;
    public final qa f;
    public final org.telegram.ui.ActionBar.e2 g;
    public final FrameLayout h;
    public final Runnable i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public wa p;
    public bb q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public Runnable v;

    public xb() {
        this.i = new la(this, 0);
        this.n = true;
        this.r = true;
        this.u = true;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public static void a(FrameLayout frameLayout, wa waVar) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, waVar);
        }
    }

    public static void d(FrameLayout frameLayout) {
        xb xbVar;
        int childCount = frameLayout.getChildCount();
        int i7 = 0;
        while (true) {
            if (i7 >= childCount) {
                xbVar = null;
                break;
            }
            View childAt = frameLayout.getChildAt(i7);
            if (childAt instanceof cb) {
                xbVar = ((cb) childAt).bulletin;
                break;
            }
            i7++;
        }
        if (xbVar != null) {
            xbVar.c(0L, org.telegram.messenger.np.e1().getBoolean("view_animations", true));
        }
    }

    public static void e() {
        xb xbVar = w;
        if (xbVar != null) {
            xbVar.b();
        }
    }

    public static xb f(FrameLayout frameLayout, cb cbVar, int i7) {
        return frameLayout == null ? new xa() : new xb(null, frameLayout, cbVar, i7);
    }

    public static xb g(org.telegram.ui.ActionBar.e2 e2Var, va vaVar, int i7) {
        if (e2Var == null) {
            return new xa();
        }
        if (e2Var instanceof org.telegram.ui.an) {
            cb.access$000(vaVar, -2, 1);
        } else if (e2Var instanceof org.telegram.ui.yw) {
            cb.access$000(vaVar, -1, 0);
        }
        return new xb(e2Var, e2Var.getBulletinLayoutContainer(), vaVar, i7);
    }

    public static void h(FrameLayout frameLayout) {
        if (frameLayout != null) {
            frameLayout.setTag(R.id.bulletin_delegate_tag, null);
        }
    }

    public final void b() {
        c(0L, org.telegram.messenger.np.e1().getBoolean("view_animations", true));
    }

    public final void c(long j3, boolean z10) {
        cb cbVar = this.e;
        if (cbVar != null && this.l) {
            int i7 = 0;
            this.l = false;
            if (w == this) {
                w = null;
            }
            WeakHashMap weakHashMap = r0.i0.a;
            if (cbVar.isLaidOut() || this.t) {
                cbVar.removeCallbacks(this.i);
                if (z10) {
                    int i10 = 1;
                    cbVar.transitionRunningExit = true;
                    cbVar.delegate = this.p;
                    cbVar.invalidate();
                    if (j3 >= 0) {
                        f3.s sVar = new f3.s();
                        sVar.a = j3;
                        this.q = sVar;
                    } else if (cbVar != null && this.q == null) {
                        this.q = cbVar.createTransition();
                    }
                    bb bbVar = this.q;
                    Objects.requireNonNull(cbVar);
                    bbVar.b(cbVar, new na(cbVar, i7), new la(this, i10), new oa(this, i7));
                    return;
                }
            }
            wa waVar = this.p;
            if (waVar != null && !cbVar.top) {
                waVar.c(0.0f);
                this.p.d(this);
            }
            cbVar.onExitTransitionStart();
            cbVar.onExitTransitionEnd();
            cbVar.onHide();
            if (this.h != null) {
                org.telegram.messenger.g0.h3(new la(this, 2));
            }
            cbVar.onDetach();
            Runnable runnable = this.v;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void i(boolean z10) {
        cb cbVar;
        boolean z11 = z10 && this.n;
        if (this.m == z11 || (cbVar = this.e) == null) {
            return;
        }
        this.m = z11;
        Runnable runnable = this.i;
        if (!z11) {
            cbVar.removeCallbacks(runnable);
            return;
        }
        int i7 = this.j;
        if (i7 >= 0) {
            cbVar.postDelayed(runnable, i7);
        }
    }

    public xb j() {
        k(false);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View$OnLayoutChangeListener, org.telegram.ui.Components.ma] */
    public final void k(final boolean z10) {
        FrameLayout frameLayout;
        if (this.l || (frameLayout = this.h) == 0) {
            return;
        }
        this.l = true;
        cb cbVar = this.e;
        cbVar.setTop(z10);
        CharSequence accessibilityText = cbVar.getAccessibilityText();
        if (accessibilityText != null) {
            org.telegram.messenger.g0.i2(accessibilityText);
        }
        ViewParent parent = cbVar.getParent();
        qa qaVar = this.f;
        if (parent != qaVar) {
            throw new IllegalStateException("Layout has incorrect parent");
        }
        xb xbVar = w;
        if (xbVar != null) {
            xbVar.b();
        }
        w = this;
        cbVar.onAttach(this);
        ?? r22 = new View.OnLayoutChangeListener() { // from class: org.telegram.ui.Components.ma
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
                xb xbVar2 = xb.this;
                wa waVar = xbVar2.p;
                if ((waVar == null || waVar.a()) && !z10) {
                    wa waVar2 = xbVar2.p;
                    int f10 = waVar2 != null ? waVar2.f(xbVar2.a) : 0;
                    int i17 = xbVar2.o;
                    if (i17 != f10) {
                        r1.g gVar = xbVar2.d;
                        if (gVar == null || !gVar.f) {
                            r1.g gVar2 = new r1.g(new r1.f(i17));
                            r1.h hVar = new r1.h();
                            hVar.i = f10;
                            hVar.b(900.0f);
                            hVar.a(1.0f);
                            gVar2.m = hVar;
                            xbVar2.d = gVar2;
                            gVar2.b(new c7(xbVar2, 1));
                            xbVar2.d.a(new pa(xbVar2, 0));
                        } else {
                            gVar.m.i = f10;
                        }
                        xbVar2.d.h();
                    }
                }
            }
        };
        this.c = r22;
        frameLayout.addOnLayoutChangeListener(r22);
        cbVar.addOnLayoutChangeListener(new ra(this, z10));
        if (!this.t) {
            cbVar.addOnAttachStateChangeListener(new bi.x1(this, 12));
        }
        frameLayout.addView(qaVar);
    }

    public final void l() {
        cb cbVar = this.e;
        if (cbVar != null) {
            cbVar.updatePosition();
        }
    }

    public xb(org.telegram.ui.ActionBar.e2 e2Var, FrameLayout frameLayout, cb cbVar, int i7) {
        this.i = new la(this, 0);
        this.r = true;
        this.u = true;
        this.e = cbVar;
        this.n = true ^ (cbVar instanceof db);
        this.f = new qa(this, cbVar, frameLayout);
        this.g = e2Var;
        this.h = frameLayout;
        this.j = i7;
    }
}
