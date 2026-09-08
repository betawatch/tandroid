package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class h implements l.y {
    public int E;
    public int F;
    public boolean G;
    public d I;
    public d J;
    public f K;
    public e L;
    public final Context a;
    public Context b;
    public l.l c;
    public final LayoutInflater d;
    public l.x e;
    public l.a0 n;
    public g r;
    public Drawable s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public final int f = R.layout.abc_action_menu_layout;
    public final int h = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray H = new SparseBooleanArray();
    public final xa.c M = new xa.c(this, 28);

    public h(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.z] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.n nVar, View view, ViewGroup viewGroup) {
        View actionView = nVar.getActionView();
        if (actionView == null || nVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof l.z ? (l.z) view : (l.z) this.d.inflate(this.h, viewGroup, false);
            actionMenuItemView.b(nVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.n);
            if (this.L == null) {
                this.L = new e(this);
            }
            actionMenuItemView2.setPopupCallback(this.L);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(nVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof j)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // l.y
    public final boolean b(l.n nVar) {
        return false;
    }

    @Override // l.y
    public final boolean c() {
        ArrayList arrayList;
        int i10;
        int i11;
        boolean z10;
        h hVar = this;
        l.l lVar = hVar.c;
        if (lVar != null) {
            arrayList = lVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = hVar.F;
        int i13 = hVar.E;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) hVar.n;
        int i14 = 0;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            l.n nVar = (l.n) arrayList.get(i14);
            int i17 = nVar.y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z11 = true;
            }
            if (hVar.G && nVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (hVar.w && (z11 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = hVar.H;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.n nVar2 = (l.n) arrayList.get(i19);
            int i21 = nVar2.y;
            boolean z12 = (i21 & 2) == i11;
            int i22 = nVar2.b;
            if (z12) {
                View a2 = hVar.a(nVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                nVar2.f(z10);
            } else if ((i21 & 1) == z10) {
                boolean z13 = sparseBooleanArray.get(i22);
                boolean z14 = (i18 > 0 || z13) && i13 > 0;
                if (z14) {
                    View a10 = hVar.a(nVar2, null, viewGroup);
                    a10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a10.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z14 &= i13 + i20 > 0;
                }
                if (z14 && i22 != 0) {
                    sparseBooleanArray.put(i22, true);
                } else if (z13) {
                    sparseBooleanArray.put(i22, false);
                    for (int i23 = 0; i23 < i19; i23++) {
                        l.n nVar3 = (l.n) arrayList.get(i23);
                        if (nVar3.b == i22) {
                            if ((nVar3.x & 32) == 32) {
                                i18++;
                            }
                            nVar3.f(false);
                        }
                    }
                }
                if (z14) {
                    i18--;
                }
                nVar2.f(z14);
            } else {
                nVar2.f(false);
                i19++;
                i11 = 2;
                hVar = this;
                z10 = true;
            }
            i19++;
            i11 = 2;
            hVar = this;
            z10 = true;
        }
        return true;
    }

    @Override // l.y
    public final void d(l.l lVar, boolean z10) {
        f();
        d dVar = this.J;
        if (dVar != null && dVar.b()) {
            dVar.i.dismiss();
        }
        l.x xVar = this.e;
        if (xVar != null) {
            xVar.d(lVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final void e() {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.l lVar = this.c;
            if (lVar != null) {
                lVar.i();
                ArrayList l4 = this.c.l();
                int size = l4.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.n nVar = (l.n) l4.get(i11);
                    if ((nVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        l.n itemData = childAt instanceof l.z ? ((l.z) childAt).getItemData() : null;
                        View a2 = a(nVar, childAt, viewGroup);
                        if (nVar != itemData) {
                            a2.setPressed(false);
                            a2.jumpDrawablesToCurrentState();
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.n).addView(a2, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.r) {
                    i10++;
                } else {
                    viewGroup.removeViewAt(i10);
                }
            }
        }
        ((View) this.n).requestLayout();
        l.l lVar2 = this.c;
        if (lVar2 != null) {
            lVar2.i();
            ArrayList arrayList2 = lVar2.i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l.o oVar = ((l.n) arrayList2.get(i12)).A;
            }
        }
        l.l lVar3 = this.c;
        if (lVar3 != null) {
            lVar3.i();
            arrayList = lVar3.j;
        }
        if (this.w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.n) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.r == null) {
                this.r = new g(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.r.getParent();
            if (viewGroup3 != this.n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.n;
                g gVar = this.r;
                actionMenuView.getClass();
                j i13 = ActionMenuView.i();
                i13.a = true;
                actionMenuView.addView(gVar, i13);
            }
        } else {
            g gVar2 = this.r;
            if (gVar2 != null) {
                Object parent = gVar2.getParent();
                Object obj = this.n;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.r);
                }
            }
        }
        ((ActionMenuView) this.n).setOverflowReserved(this.w);
    }

    public final boolean f() {
        Object obj;
        f fVar = this.K;
        if (fVar != null && (obj = this.n) != null) {
            ((View) obj).removeCallbacks(fVar);
            this.K = null;
            return true;
        }
        d dVar = this.I;
        if (dVar == null) {
            return false;
        }
        if (dVar.b()) {
            dVar.i.dismiss();
        }
        return true;
    }

    public final boolean g() {
        d dVar = this.I;
        return dVar != null && dVar.b();
    }

    @Override // l.y
    public final void h(l.x xVar) {
        throw null;
    }

    @Override // l.y
    public final void i(Context context, l.l lVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = lVar;
        Resources resources = context.getResources();
        if (!this.x) {
            this.w = true;
        }
        int i10 = 2;
        this.y = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.F = i10;
        int i13 = this.y;
        if (this.w) {
            if (this.r == null) {
                g gVar = new g(this, this.a);
                this.r = gVar;
                if (this.v) {
                    gVar.setImageDrawable(this.s);
                    this.s = null;
                    this.v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.r.getMeasuredWidth();
        } else {
            this.r = null;
        }
        this.E = i13;
        float f7 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.y
    public final boolean j(l.e0 e0Var) {
        boolean z10;
        if (e0Var.hasVisibleItems()) {
            l.e0 e0Var2 = e0Var;
            while (true) {
                l.l lVar = e0Var2.z;
                if (lVar == this.c) {
                    break;
                }
                e0Var2 = (l.e0) lVar;
            }
            l.n nVar = e0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof l.z) && ((l.z) childAt).getItemData() == nVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                e0Var.A.getClass();
                int size = e0Var.f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = e0Var.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                d dVar = new d(this, this.b, e0Var, view);
                this.J = dVar;
                dVar.g = z10;
                l.t tVar = dVar.i;
                if (tVar != null) {
                    tVar.o(z10);
                }
                d dVar2 = this.J;
                if (!dVar2.b()) {
                    if (dVar2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    dVar2.d(0, 0, false, false);
                }
                l.x xVar = this.e;
                if (xVar != null) {
                    xVar.q(e0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.y
    public final boolean k(l.n nVar) {
        return false;
    }

    public final boolean l() {
        l.l lVar;
        if (!this.w || g() || (lVar = this.c) == null || this.n == null || this.K != null) {
            return false;
        }
        lVar.i();
        if (lVar.j.isEmpty()) {
            return false;
        }
        f fVar = new f(this, new d(this, this.b, this.c, this.r));
        this.K = fVar;
        ((View) this.n).post(fVar);
        return true;
    }
}
