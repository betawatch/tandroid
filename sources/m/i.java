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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i implements l.x {
    public int A;
    public int B;
    public boolean C;
    public e E;
    public e F;
    public g G;
    public f H;
    public final Context a;
    public Context b;
    public l.k c;
    public final LayoutInflater d;
    public l.w e;
    public l.z n;
    public h r;
    public Drawable s;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public final int f = R.layout.abc_action_menu_layout;
    public final int h = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray D = new SparseBooleanArray();
    public final m5.i I = new m5.i(this, 23);

    public i(Context context) {
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
            if (this.H == null) {
                this.H = new f(this);
            }
            actionMenuItemView2.setPopupCallback(this.H);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(mVar.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof k)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // l.x
    public final void b(l.k kVar, boolean z10) {
        f();
        e eVar = this.F;
        if (eVar != null && eVar.b()) {
            eVar.i.dismiss();
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
        ArrayList arrayList;
        int i10;
        int i11;
        boolean z10;
        i iVar = this;
        l.k kVar = iVar.c;
        if (kVar != null) {
            arrayList = kVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = iVar.B;
        int i13 = iVar.A;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) iVar.n;
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
            l.m mVar = (l.m) arrayList.get(i14);
            int i17 = mVar.y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z11 = true;
            }
            if (iVar.C && mVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (iVar.w && (z11 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = iVar.D;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            l.m mVar2 = (l.m) arrayList.get(i19);
            int i21 = mVar2.y;
            boolean z12 = (i21 & 2) == i11;
            int i22 = mVar2.b;
            if (z12) {
                View a2 = iVar.a(mVar2, null, viewGroup);
                a2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a2.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                mVar2.f(z10);
            } else if ((i21 & 1) == z10) {
                boolean z13 = sparseBooleanArray.get(i22);
                boolean z14 = (i18 > 0 || z13) && i13 > 0;
                if (z14) {
                    View a10 = iVar.a(mVar2, null, viewGroup);
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
                        l.m mVar3 = (l.m) arrayList.get(i23);
                        if (mVar3.b == i22) {
                            if ((mVar3.x & 32) == 32) {
                                i18++;
                            }
                            mVar3.f(false);
                        }
                    }
                }
                if (z14) {
                    i18--;
                }
                mVar2.f(z14);
            } else {
                mVar2.f(false);
                i19++;
                i11 = 2;
                iVar = this;
                z10 = true;
            }
            i19++;
            i11 = 2;
            iVar = this;
            z10 = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.x
    public final void e() {
        int i10;
        ViewGroup viewGroup = (ViewGroup) this.n;
        ArrayList arrayList = null;
        boolean z10 = false;
        if (viewGroup != null) {
            l.k kVar = this.c;
            if (kVar != null) {
                kVar.i();
                ArrayList l10 = this.c.l();
                int size = l10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.m mVar = (l.m) l10.get(i11);
                    if ((mVar.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i10);
                        l.m itemData = childAt instanceof l.y ? ((l.y) childAt).getItemData() : null;
                        View a2 = a(mVar, childAt, viewGroup);
                        if (mVar != itemData) {
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
        l.k kVar2 = this.c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                l.n nVar = ((l.m) arrayList2.get(i12)).A;
            }
        }
        l.k kVar3 = this.c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.j;
        }
        if (this.w && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z10 = !((l.m) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z10 = true;
            }
        }
        if (z10) {
            if (this.r == null) {
                this.r = new h(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.r.getParent();
            if (viewGroup3 != this.n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.n;
                h hVar = this.r;
                actionMenuView.getClass();
                k i13 = ActionMenuView.i();
                i13.a = true;
                actionMenuView.addView(hVar, i13);
            }
        } else {
            h hVar2 = this.r;
            if (hVar2 != null) {
                Object parent = hVar2.getParent();
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
        g gVar = this.G;
        if (gVar != null && (obj = this.n) != null) {
            ((View) obj).removeCallbacks(gVar);
            this.G = null;
            return true;
        }
        e eVar = this.E;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.i.dismiss();
        }
        return true;
    }

    @Override // l.x
    public final void g(l.w wVar) {
        throw null;
    }

    public final boolean h() {
        e eVar = this.E;
        return eVar != null && eVar.b();
    }

    @Override // l.x
    public final void i(Context context, l.k kVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = kVar;
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
        this.B = i10;
        int i13 = this.y;
        if (this.w) {
            if (this.r == null) {
                h hVar = new h(this, this.a);
                this.r = hVar;
                if (this.v) {
                    hVar.setImageDrawable(this.s);
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
        this.A = i13;
        float f9 = resources.getDisplayMetrics().density;
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
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof l.y) && ((l.y) childAt).getItemData() == mVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                d0Var.A.getClass();
                int size = d0Var.f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z10 = false;
                        break;
                    }
                    MenuItem item = d0Var.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                e eVar = new e(this, this.b, d0Var, view);
                this.F = eVar;
                eVar.g = z10;
                l.s sVar = eVar.i;
                if (sVar != null) {
                    sVar.o(z10);
                }
                e eVar2 = this.F;
                if (!eVar2.b()) {
                    if (eVar2.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    eVar2.d(0, 0, false, false);
                }
                l.w wVar = this.e;
                if (wVar != null) {
                    wVar.h(d0Var);
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
        if (!this.w || h() || (kVar = this.c) == null || this.n == null || this.G != null) {
            return false;
        }
        kVar.i();
        if (kVar.j.isEmpty()) {
            return false;
        }
        g gVar = new g(this, new e(this, this.b, this.c, this.r));
        this.G = gVar;
        ((View) this.n).post(gVar);
        return true;
    }
}
