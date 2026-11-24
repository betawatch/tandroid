// default package

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
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class azc implements c8 {
    public static final AccelerateInterpolator x = new AccelerateInterpolator();
    public static final DecelerateInterpolator y = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public sa3 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public zyc i;
    public zyc j;
    public lx6 k;
    public boolean l;
    public boolean p;
    public boolean q;
    public chc s;
    public boolean t;
    public final ArrayList m = new ArrayList();
    public int n = 0;
    public boolean o = true;
    public boolean r = true;
    public final yyc u = new yyc(this, 0);
    public final yyc v = new yyc(this, 1);
    public final et8 w = new et8((Object) this, (byte) 23);

    public azc(Activity activity, boolean z) {
        View decorView = activity.getWindow().getDecorView();
        b(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z) {
        ahc i;
        ahc ahcVar;
        boolean z2 = this.q;
        if (z) {
            if (!z2) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                d(false);
            }
        } else if (z2) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            d(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = kfc.a;
        boolean isLaidOut = actionBarContainer.isLaidOut();
        sa3 sa3Var = this.e;
        if (!isLaidOut) {
            if (z) {
                ((jvb) sa3Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((jvb) sa3Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            jvb jvbVar = (jvb) sa3Var;
            i = kfc.a(jvbVar.a);
            i.a(0.0f);
            i.c(100L);
            i.d(new ivb(jvbVar, 4));
            ahcVar = this.f.i(0, 200L);
        } else {
            jvb jvbVar2 = (jvb) sa3Var;
            ahc a = kfc.a(jvbVar2.a);
            a.a(1.0f);
            a.c(200L);
            a.d(new ivb(jvbVar2, 0));
            i = this.f.i(8, 100L);
            ahcVar = a;
        }
        chc chcVar = new chc();
        ArrayList arrayList = (ArrayList) chcVar.c;
        arrayList.add(i);
        View view = (View) i.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) ahcVar.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(ahcVar);
        chcVar.b();
    }

    public final void b(View view) {
        sa3 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(org.telegram.messenger.beta.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(org.telegram.messenger.beta.R.id.action_bar);
        if (findViewById instanceof sa3) {
            wrapper = (sa3) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(org.telegram.messenger.beta.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(org.telegram.messenger.beta.R.id.action_bar_container);
        this.d = actionBarContainer;
        sa3 sa3Var = this.e;
        if (sa3Var == null || this.f == null || actionBarContainer == null) {
            dq9.m(azc.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((jvb) sa3Var).a.getContext();
        this.a = context;
        if ((((jvb) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        if (context.getResources().getBoolean(org.telegram.messenger.beta.R.bool.abc_action_bar_embed_tabs)) {
            this.d.setTabContainer(null);
            ((jvb) this.e).getClass();
        } else {
            ((jvb) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((jvb) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, k09.a, org.telegram.messenger.beta.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.n) {
                dq9.m("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.t = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = kfc.a;
            cfc.h(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void c(boolean z) {
        if (this.h) {
            return;
        }
        int i = z ? 4 : 0;
        jvb jvbVar = (jvb) this.e;
        int i2 = jvbVar.b;
        this.h = true;
        jvbVar.a((i & 4) | (i2 & (-5)));
    }

    public final void d(boolean z) {
        boolean z2 = this.q || !this.p;
        boolean z3 = this.r;
        byte b = 29;
        et8 et8Var = this.w;
        View view = this.g;
        if (!z2) {
            if (z3) {
                this.r = false;
                chc chcVar = this.s;
                if (chcVar != null) {
                    chcVar.a();
                }
                int i = this.n;
                yyc yycVar = this.u;
                if (i != 0 || !z) {
                    yycVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                chc chcVar2 = new chc();
                ArrayList arrayList = (ArrayList) chcVar2.c;
                float f = -this.d.getHeight();
                if (z) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r13[1];
                }
                ahc a = kfc.a(this.d);
                a.e(f);
                View view2 = (View) a.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(et8Var != null ? new pl(et8Var, view2, b) : null);
                }
                if (!chcVar2.b) {
                    arrayList.add(a);
                }
                if (this.o && view != null) {
                    ahc a2 = kfc.a(view);
                    a2.e(f);
                    if (!chcVar2.b) {
                        arrayList.add(a2);
                    }
                }
                boolean z4 = chcVar2.b;
                if (!z4) {
                    chcVar2.d = x;
                }
                if (!z4) {
                    chcVar2.a = 250L;
                }
                if (!z4) {
                    chcVar2.e = yycVar;
                }
                this.s = chcVar2;
                chcVar2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.r = true;
        chc chcVar3 = this.s;
        if (chcVar3 != null) {
            chcVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        yyc yycVar2 = this.v;
        if (i2 == 0 && z) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z) {
                this.d.getLocationInWindow(new int[]{0, 0});
                f2 -= r13[1];
            }
            this.d.setTranslationY(f2);
            chc chcVar4 = new chc();
            ArrayList arrayList2 = (ArrayList) chcVar4.c;
            ahc a3 = kfc.a(this.d);
            a3.e(0.0f);
            View view3 = (View) a3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(et8Var != null ? new pl(et8Var, view3, b) : null);
            }
            if (!chcVar4.b) {
                arrayList2.add(a3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                ahc a4 = kfc.a(view);
                a4.e(0.0f);
                if (!chcVar4.b) {
                    arrayList2.add(a4);
                }
            }
            boolean z5 = chcVar4.b;
            if (!z5) {
                chcVar4.d = y;
            }
            if (!z5) {
                chcVar4.a = 250L;
            }
            if (!z5) {
                chcVar4.e = yycVar2;
            }
            this.s = chcVar4;
            chcVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            yycVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = kfc.a;
            afc.c(actionBarOverlayLayout);
        }
    }

    public azc(dq dqVar) {
        b(dqVar.getWindow().getDecorView());
    }
}
