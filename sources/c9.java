// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class c9 implements z27 {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public z8 J;
    public z8 K;
    public xs4 L;
    public a9 M;
    public final Context a;
    public Context b;
    public f27 c;
    public final LayoutInflater d;
    public y27 e;
    public c37 n;
    public b9 r;
    public Drawable s;
    public boolean w;
    public boolean x;
    public boolean y;
    public final int f = R.layout.abc_action_menu_layout;
    public final int h = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray I = new SparseBooleanArray();
    public final zm9 N = new zm9((Object) this, (byte) 3);

    public c9(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [b37] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(j27 j27Var, View view, ViewGroup viewGroup) {
        View actionView = j27Var.getActionView();
        if (actionView == null || j27Var.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof b37 ? (b37) view : (b37) this.d.inflate(this.h, viewGroup, false);
            actionMenuItemView.a(j27Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.n);
            a9 a9Var = this.M;
            if (a9Var == null) {
                a9Var = new a9(this);
                this.M = a9Var;
            }
            actionMenuItemView2.setPopupCallback(a9Var);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(j27Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof e9)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z27
    public final boolean b(zdb zdbVar) {
        boolean z;
        if (zdbVar.hasVisibleItems()) {
            zdb zdbVar2 = zdbVar;
            while (true) {
                f27 f27Var = zdbVar2.z;
                if (f27Var == this.c) {
                    break;
                }
                zdbVar2 = (zdb) f27Var;
            }
            j27 j27Var = zdbVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof b37) && ((b37) childAt).getItemData() == j27Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                int size = zdbVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = zdbVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                z8 z8Var = new z8(this, this.b, zdbVar, view);
                this.K = z8Var;
                z8Var.g = z;
                p27 p27Var = z8Var.i;
                if (p27Var != null) {
                    p27Var.o(z);
                }
                z8 z8Var2 = this.K;
                if (!z8Var2.b()) {
                    if (z8Var2.e == null) {
                        grb.i("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    z8Var2.d(0, 0, false, false);
                }
                y27 y27Var = this.e;
                if (y27Var != null) {
                    y27Var.z0(zdbVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // z27
    public final boolean c() {
        ArrayList arrayList;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        f27 f27Var = this.c;
        View view = null;
        if (f27Var != null) {
            arrayList = f27Var.l();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.G;
        int i4 = this.F;
        ViewGroup viewGroup = (ViewGroup) this.n;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            j27 j27Var = (j27) arrayList.get(i5);
            int i8 = j27Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z4 = true;
            }
            if (this.H && j27Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.x && (z4 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.I;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            j27 j27Var2 = (j27) arrayList.get(i10);
            int i12 = j27Var2.y;
            boolean z5 = (i12 & 2) == i2 ? z : false;
            int i13 = j27Var2.b;
            if (z5) {
                View a = a(j27Var2, view, viewGroup);
                a.measure(0, 0);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                j27Var2.f(z);
                z2 = z;
            } else if ((i12 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i13);
                boolean z7 = ((i9 > 0 || z6) && i4 > 0) ? z : false;
                if (z7) {
                    View a2 = a(j27Var2, view, viewGroup);
                    a2.measure(0, 0);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z7 &= i4 + i11 > 0 ? z : false;
                }
                if (z7 && i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                } else if (z6) {
                    sparseBooleanArray.put(i13, false);
                    int i14 = 0;
                    while (i14 < i10) {
                        j27 j27Var3 = (j27) arrayList.get(i14);
                        if (j27Var3.b == i13) {
                            z3 = z;
                            if ((j27Var3.x & 32) == 32) {
                                i9++;
                            }
                            j27Var3.f(false);
                        } else {
                            z3 = z;
                        }
                        i14++;
                        z = z3;
                    }
                }
                z2 = z;
                if (z7) {
                    i9--;
                }
                j27Var2.f(z7);
            } else {
                z2 = z;
                j27Var2.f(false);
            }
            i10++;
            z = z2;
            view = null;
            i2 = 2;
        }
        return z;
    }

    public final boolean d() {
        Object obj;
        xs4 xs4Var = this.L;
        if (xs4Var != null && (obj = this.n) != null) {
            ((View) obj).removeCallbacks(xs4Var);
            this.L = null;
            return true;
        }
        z8 z8Var = this.J;
        if (z8Var == null) {
            return false;
        }
        if (z8Var.b()) {
            z8Var.i.dismiss();
        }
        return true;
    }

    @Override // z27
    public final boolean e(j27 j27Var) {
        return false;
    }

    @Override // z27
    public final void f(f27 f27Var, boolean z) {
        d();
        z8 z8Var = this.K;
        if (z8Var != null && z8Var.b()) {
            z8Var.i.dismiss();
        }
        y27 y27Var = this.e;
        if (y27Var != null) {
            y27Var.f(f27Var, z);
        }
    }

    public final boolean g() {
        z8 z8Var = this.J;
        return z8Var != null && z8Var.b();
    }

    @Override // z27
    public final void h(y27 y27Var) {
        throw null;
    }

    @Override // z27
    public final boolean i(j27 j27Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // z27
    public final void j() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.n;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            f27 f27Var = this.c;
            if (f27Var != null) {
                f27Var.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    j27 j27Var = (j27) l.get(i2);
                    if ((j27Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        j27 itemData = childAt instanceof b37 ? ((b37) childAt).getItemData() : null;
                        View a = a(j27Var, childAt, viewGroup);
                        if (j27Var != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.n).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.r) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.n).requestLayout();
        f27 f27Var2 = this.c;
        if (f27Var2 != null) {
            f27Var2.i();
            ArrayList arrayList2 = f27Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                k27 k27Var = ((j27) arrayList2.get(i3)).A;
            }
        }
        f27 f27Var3 = this.c;
        if (f27Var3 != null) {
            f27Var3.i();
            arrayList = f27Var3.j;
        }
        if (this.x && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((j27) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        b9 b9Var = this.r;
        if (z) {
            if (b9Var == null) {
                b9Var = new b9(this, this.a);
                this.r = b9Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) b9Var.getParent();
            if (viewGroup3 != this.n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.n;
                b9 b9Var2 = this.r;
                actionMenuView.getClass();
                e9 i4 = ActionMenuView.i();
                i4.a = true;
                actionMenuView.addView(b9Var2, i4);
            }
        } else if (b9Var != null) {
            Object parent = b9Var.getParent();
            Object obj = this.n;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.r);
            }
        }
        ((ActionMenuView) this.n).setOverflowReserved(this.x);
    }

    @Override // z27
    public final void k(Context context, f27 f27Var) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = f27Var;
        Resources resources = context.getResources();
        if (!this.y) {
            this.x = true;
        }
        int i = 2;
        this.E = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.G = i;
        int i4 = this.E;
        if (this.x) {
            if (this.r == null) {
                b9 b9Var = new b9(this, this.a);
                this.r = b9Var;
                if (this.w) {
                    b9Var.setImageDrawable(this.s);
                    this.s = null;
                    this.w = false;
                }
                this.r.measure(0, 0);
            }
            i4 -= this.r.getMeasuredWidth();
        } else {
            this.r = null;
        }
        this.F = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean l() {
        f27 f27Var;
        boolean z = false;
        if (this.x && !g() && (f27Var = this.c) != null && this.n != null && this.L == null) {
            f27Var.i();
            if (!f27Var.j.isEmpty()) {
                xs4 xs4Var = new xs4(this, new z8(this, this.b, this.c, this.r), z, (byte) 1);
                this.L = xs4Var;
                ((View) this.n).post(xs4Var);
                return true;
            }
        }
        return false;
    }
}
