package g;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import f7.n7;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kh.g4;
import m.l1;
import m.p3;
import org.telegram.messenger.BuildConfig;
import r0.b0;
import r0.j0;
import r0.m0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a0 extends n7 implements m.c {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public l1 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public z i;
    public z j;
    public we.b k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public jb.d s;
    public boolean t;
    public final y u;
    public final y v;
    public final fa.c w;

    public a0(Activity activity, boolean z10) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new y(this, 0);
        this.v = new y(this, 1);
        this.w = new fa.c(this, 18);
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z10) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z10) {
        m0 i9;
        m0 m0Var;
        if (z10) {
            if (!this.q) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (this.q) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = j0.a;
        if (!actionBarContainer.isLaidOut()) {
            if (z10) {
                ((p3) this.e).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((p3) this.e).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z10) {
            p3 p3Var = (p3) this.e;
            i9 = j0.a(p3Var.a);
            i9.a(0.0f);
            i9.c(100L);
            i9.d(new k.i(p3Var, 4));
            m0Var = this.f.i(0, 200L);
        } else {
            p3 p3Var2 = (p3) this.e;
            m0 a2 = j0.a(p3Var2.a);
            a2.a(1.0f);
            a2.c(200L);
            a2.d(new k.i(p3Var2, 0));
            i9 = this.f.i(8, 100L);
            m0Var = a2;
        }
        jb.d dVar = new jb.d();
        ArrayList arrayList = (ArrayList) dVar.c;
        arrayList.add(i9);
        View view = (View) i9.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) m0Var.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(m0Var);
        dVar.b();
    }

    public final void b(View view) {
        l1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(org.telegram.messenger.beta.R.id.action_bar);
        if (findViewById instanceof l1) {
            wrapper = (l1) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : BuildConfig.BETA_URL));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(org.telegram.messenger.beta.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(org.telegram.messenger.beta.R.id.action_bar_container);
        this.d = actionBarContainer;
        l1 l1Var = this.e;
        if (l1Var == null || this.f == null || actionBarContainer == null) {
            throw new IllegalStateException(a0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((p3) l1Var).a.getContext();
        this.a = context;
        if ((((p3) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i9 = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(org.telegram.messenger.beta.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((p3) this.e).getClass();
        } else {
            ((p3) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((p3) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, f.a.a, org.telegram.messenger.beta.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.n) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.t = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = j0.a;
            b0.i(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z10) {
        if (this.h) {
            return;
        }
        int i9 = z10 ? 4 : 0;
        p3 p3Var = (p3) this.e;
        int i10 = p3Var.b;
        this.h = true;
        p3Var.a((i9 & 4) | (i10 & (-5)));
    }

    public final void d(boolean z10) {
        boolean z11 = this.p;
        boolean z12 = this.q;
        fa.c cVar = this.w;
        View view = this.g;
        if (!z12 && z11) {
            if (this.r) {
                this.r = false;
                jb.d dVar = this.s;
                if (dVar != null) {
                    dVar.a();
                }
                int i9 = this.n;
                y yVar = this.u;
                if (i9 != 0 || !z10) {
                    yVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                jb.d dVar2 = new jb.d();
                ArrayList arrayList = (ArrayList) dVar2.c;
                float f10 = -this.d.getHeight();
                if (z10) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f10 -= r12[1];
                }
                m0 a2 = j0.a(this.d);
                a2.e(f10);
                View view2 = (View) a2.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new g4(cVar, view2) : null);
                }
                if (!dVar2.b) {
                    arrayList.add(a2);
                }
                if (this.o && view != null) {
                    m0 a3 = j0.a(view);
                    a3.e(f10);
                    if (!dVar2.b) {
                        arrayList.add(a3);
                    }
                }
                boolean z13 = dVar2.b;
                if (!z13) {
                    dVar2.d = x;
                }
                if (!z13) {
                    dVar2.a = 250L;
                }
                if (!z13) {
                    dVar2.e = yVar;
                }
                this.s = dVar2;
                dVar2.b();
                return;
            }
            return;
        }
        if (this.r) {
            return;
        }
        this.r = true;
        jb.d dVar3 = this.s;
        if (dVar3 != null) {
            dVar3.a();
        }
        this.d.setVisibility(0);
        int i10 = this.n;
        y yVar2 = this.v;
        if (i10 == 0 && z10) {
            this.d.setTranslationY(0.0f);
            float f11 = -this.d.getHeight();
            if (z10) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f11 -= r12[1];
            }
            this.d.setTranslationY(f11);
            jb.d dVar4 = new jb.d();
            ArrayList arrayList2 = (ArrayList) dVar4.c;
            m0 a10 = j0.a(this.d);
            a10.e(0.0f);
            View view3 = (View) a10.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new g4(cVar, view3) : null);
            }
            if (!dVar4.b) {
                arrayList2.add(a10);
            }
            if (this.o && view != null) {
                view.setTranslationY(f11);
                m0 a11 = j0.a(view);
                a11.e(0.0f);
                if (!dVar4.b) {
                    arrayList2.add(a11);
                }
            }
            boolean z14 = dVar4.b;
            if (!z14) {
                dVar4.d = y;
            }
            if (!z14) {
                dVar4.a = 250L;
            }
            if (!z14) {
                dVar4.e = yVar2;
            }
            this.s = dVar4;
            dVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            yVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = j0.a;
            r0.z.c(actionBarOverlayLayout);
        }
    }

    public a0(s sVar) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.u = new y(this, 0);
        this.v = new y(this, 1);
        this.w = new fa.c(this, 18);
        b(sVar.getWindow().getDecorView());
    }
}
