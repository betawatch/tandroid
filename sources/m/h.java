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
import gi.v5;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h implements l.x {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public d J;
    public d K;
    public f L;
    public e M;
    public final Context a;
    public Context b;
    public l.k c;
    public final LayoutInflater d;
    public l.w e;
    public l.z n;
    public g r;
    public Drawable s;
    public boolean w;
    public boolean x;
    public boolean y;
    public final int f = R.layout.abc_action_menu_layout;
    public final int h = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray I = new SparseBooleanArray();
    public final v5 N = new v5(this, 11);

    public h(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.y] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.m mVar, View view, ViewGroup viewGroup) {
        View actionView = mVar.getActionView();
        if (actionView == null || mVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof l.y ? (l.y) view : (l.y) this.d.inflate(this.h, viewGroup, false);
            actionMenuItemView.b(mVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.n);
            if (this.M == null) {
                this.M = new e(this);
            }
            actionMenuItemView2.setPopupCallback(this.M);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(mVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof j)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // l.x
    public final void b(l.k kVar, boolean z10) {
        f();
        d dVar = this.K;
        if (dVar != null && dVar.b()) {
            dVar.i.dismiss();
        }
        l.w wVar = this.e;
        if (wVar != null) {
            wVar.b(kVar, z10);
        }
    }

    @Override // l.x
    public final boolean c(l.m mVar) {
        return false;
    }

    @Override // l.x
    public final boolean d() {
        int i3;
        ArrayList arrayList;
        int i10;
        boolean z10;
        h hVar = this;
        l.k kVar = hVar.c;
        if (kVar != null) {
            arrayList = kVar.l();
            i3 = arrayList.size();
        } else {
            i3 = 0;
            arrayList = null;
        }
        int i11 = hVar.G;
        int i12 = hVar.F;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) hVar.n;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z10 = true;
            if (i13 >= i3) {
                break;
            }
            l.m mVar = (l.m) arrayList.get(i13);
            int i16 = mVar.y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (hVar.H && mVar.C) {
                i11 = 0;
            }
            i13++;
        }
        if (hVar.x && (z11 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = hVar.I;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < i3) {
            l.m mVar2 = (l.m) arrayList.get(i18);
            int i20 = mVar2.y;
            boolean z12 = (i20 & 2) == i10 ? z10 : false;
            int i21 = mVar2.b;
            if (z12) {
                View a10 = hVar.a(mVar2, null, viewGroup);
                a10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a10.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z10);
                }
                mVar2.f(z10);
            } else if ((i20 & 1) == z10) {
                boolean z13 = sparseBooleanArray.get(i21);
                boolean z14 = ((i17 > 0 || z13) && i12 > 0) ? z10 : false;
                if (z14) {
                    View a11 = hVar.a(mVar2, null, viewGroup);
                    a11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a11.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z14 &= i12 + i19 > 0;
                }
                if (z14 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z13) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        l.m mVar3 = (l.m) arrayList.get(i22);
                        if (mVar3.b == i21) {
                            if ((mVar3.x & 32) == 32) {
                                i17++;
                            }
                            mVar3.f(false);
                        }
                    }
                }
                if (z14) {
                    i17--;
                }
                mVar2.f(z14);
            } else {
                mVar2.f(false);
                i18++;
                i10 = 2;
                hVar = this;
                z10 = true;
            }
            i18++;
            i10 = 2;
            hVar = this;
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.x
    public final void e() {
        int i3;
        ViewGroup viewGroup = (ViewGroup) this.n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.k kVar = this.c;
            if (kVar != null) {
                kVar.i();
                ArrayList l10 = this.c.l();
                int size = l10.size();
                i3 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    l.m mVar = (l.m) l10.get(i10);
                    if ((mVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i3);
                        l.m itemData = childAt instanceof l.y ? ((l.y) childAt).getItemData() : null;
                        View a10 = a(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
                            a10.setPressed(false);
                            a10.jumpDrawablesToCurrentState();
                        }
                        if (a10 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a10.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a10);
                            }
                            ((ViewGroup) this.n).addView(a10, i3);
                        }
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            while (i3 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i3) == this.r) {
                    i3++;
                } else {
                    viewGroup.removeViewAt(i3);
                }
            }
        }
        ((View) this.n).requestLayout();
        l.k kVar2 = this.c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.i;
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                l.n nVar = ((l.m) arrayList2.get(i11)).A;
            }
        }
        l.k kVar3 = this.c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.j;
        }
        if (this.x && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.m) arrayList.get(0)).C;
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
                j i12 = ActionMenuView.i();
                i12.a = true;
                actionMenuView.addView(gVar, i12);
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
        ((ActionMenuView) this.n).setOverflowReserved(this.x);
    }

    public final boolean f() {
        Object obj;
        f fVar = this.L;
        if (fVar != null && (obj = this.n) != null) {
            ((View) obj).removeCallbacks(fVar);
            this.L = null;
            return true;
        }
        d dVar = this.J;
        if (dVar == null) {
            return false;
        }
        if (dVar.b()) {
            dVar.i.dismiss();
        }
        return true;
    }

    public final boolean g() {
        d dVar = this.J;
        return dVar != null && dVar.b();
    }

    @Override // l.x
    public final void h(l.w wVar) {
        throw null;
    }

    @Override // l.x
    public final void i(Context context, l.k kVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = kVar;
        Resources resources = context.getResources();
        if (!this.y) {
            this.x = true;
        }
        int i3 = 2;
        this.E = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
            i3 = 5;
        } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
            i3 = 4;
        } else if (i10 >= 360) {
            i3 = 3;
        }
        this.G = i3;
        int i12 = this.E;
        if (this.x) {
            if (this.r == null) {
                g gVar = new g(this, this.a);
                this.r = gVar;
                if (this.w) {
                    gVar.setImageDrawable(this.s);
                    this.s = null;
                    this.w = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i12 -= this.r.getMeasuredWidth();
        } else {
            this.r = null;
        }
        this.F = i12;
        float f10 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.x
    public final boolean j(l.d0 d0Var) {
        boolean z10;
        if (d0Var.hasVisibleItems()) {
            l.d0 d0Var2 = d0Var;
            while (true) {
                l.k kVar = d0Var2.z;
                if (kVar == this.c) {
                    break;
                }
                d0Var2 = (l.d0) kVar;
            }
            l.m mVar = d0Var2.A;
            ViewGroup viewGroup = (ViewGroup) this.n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i3);
                    if ((childAt instanceof l.y) && ((l.y) childAt).getItemData() == mVar) {
                        view = childAt;
                        break;
                    }
                    i3++;
                }
            }
            if (view != null) {
                d0Var.A.getClass();
                int size = d0Var.f.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = d0Var.getItem(i10);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                d dVar = new d(this, this.b, d0Var, view);
                this.K = dVar;
                dVar.g = z10;
                l.s sVar = dVar.i;
                if (sVar != null) {
                    sVar.o(z10);
                }
                d dVar2 = this.K;
                if (!dVar2.b()) {
                    if (dVar2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    dVar2.d(0, 0, false, false);
                }
                l.w wVar = this.e;
                if (wVar != null) {
                    wVar.E(d0Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.x
    public final boolean k(l.m mVar) {
        return false;
    }

    public final boolean l() {
        l.k kVar;
        if (!this.x || g() || (kVar = this.c) == null || this.n == null || this.L != null) {
            return false;
        }
        kVar.i();
        if (kVar.j.isEmpty()) {
            return false;
        }
        f fVar = new f(this, new d(this, this.b, this.c, this.r));
        this.L = fVar;
        ((View) this.n).post(fVar);
        return true;
    }
}
