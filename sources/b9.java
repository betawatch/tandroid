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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class b9 implements s07 {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public y8 J;
    public y8 K;
    public tq4 L;
    public z8 M;
    public final Context a;
    public Context b;
    public yz6 c;
    public final LayoutInflater d;
    public r07 e;
    public v07 n;
    public a9 r;
    public Drawable s;
    public boolean w;
    public boolean x;
    public boolean y;
    public final int f = R.layout.abc_action_menu_layout;
    public final int h = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray I = new SparseBooleanArray();
    public final lj9 N = new lj9((Object) this, (byte) 3);

    public b9(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [u07] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(c07 c07Var, View view, ViewGroup viewGroup) {
        View actionView = c07Var.getActionView();
        if (actionView == null || c07Var.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof u07 ? (u07) view : (u07) this.d.inflate(this.h, viewGroup, false);
            actionMenuItemView.a(c07Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.n);
            z8 z8Var = this.M;
            if (z8Var == null) {
                z8Var = new z8(this);
                this.M = z8Var;
            }
            actionMenuItemView2.setPopupCallback(z8Var);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(c07Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof d9)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s07
    public final boolean b(bab babVar) {
        boolean z;
        if (babVar.hasVisibleItems()) {
            bab babVar2 = babVar;
            while (true) {
                yz6 yz6Var = babVar2.z;
                if (yz6Var == this.c) {
                    break;
                }
                babVar2 = (bab) yz6Var;
            }
            c07 c07Var = babVar2.A;
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
                    if ((childAt instanceof u07) && ((u07) childAt).getItemData() == c07Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                int size = babVar.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = babVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                y8 y8Var = new y8(this, this.b, babVar, view);
                this.K = y8Var;
                y8Var.g = z;
                i07 i07Var = y8Var.i;
                if (i07Var != null) {
                    i07Var.o(z);
                }
                y8 y8Var2 = this.K;
                if (!y8Var2.b()) {
                    if (y8Var2.e == null) {
                        sc8.j("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    y8Var2.d(0, 0, false, false);
                }
                r07 r07Var = this.e;
                if (r07Var != null) {
                    r07Var.J(babVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // s07
    public final boolean c() {
        ArrayList arrayList;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        yz6 yz6Var = this.c;
        View view = null;
        if (yz6Var != null) {
            arrayList = yz6Var.l();
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
            c07 c07Var = (c07) arrayList.get(i5);
            int i8 = c07Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z4 = true;
            }
            if (this.H && c07Var.C) {
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
            c07 c07Var2 = (c07) arrayList.get(i10);
            int i12 = c07Var2.y;
            boolean z5 = (i12 & 2) == i2 ? z : false;
            int i13 = c07Var2.b;
            if (z5) {
                View a = a(c07Var2, view, viewGroup);
                a.measure(0, 0);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                c07Var2.f(z);
                z2 = z;
            } else if ((i12 & 1) == z) {
                boolean z6 = sparseBooleanArray.get(i13);
                boolean z7 = ((i9 > 0 || z6) && i4 > 0) ? z : false;
                if (z7) {
                    View a2 = a(c07Var2, view, viewGroup);
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
                        c07 c07Var3 = (c07) arrayList.get(i14);
                        if (c07Var3.b == i13) {
                            z3 = z;
                            if ((c07Var3.x & 32) == 32) {
                                i9++;
                            }
                            c07Var3.f(false);
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
                c07Var2.f(z7);
            } else {
                z2 = z;
                c07Var2.f(false);
            }
            i10++;
            z = z2;
            view = null;
            i2 = 2;
        }
        return z;
    }

    @Override // s07
    public final void d(yz6 yz6Var, boolean z) {
        e();
        y8 y8Var = this.K;
        if (y8Var != null && y8Var.b()) {
            y8Var.i.dismiss();
        }
        r07 r07Var = this.e;
        if (r07Var != null) {
            r07Var.d(yz6Var, z);
        }
    }

    public final boolean e() {
        Object obj;
        tq4 tq4Var = this.L;
        if (tq4Var != null && (obj = this.n) != null) {
            ((View) obj).removeCallbacks(tq4Var);
            this.L = null;
            return true;
        }
        y8 y8Var = this.J;
        if (y8Var == null) {
            return false;
        }
        if (y8Var.b()) {
            y8Var.i.dismiss();
        }
        return true;
    }

    public final boolean f() {
        y8 y8Var = this.J;
        return y8Var != null && y8Var.b();
    }

    @Override // s07
    public final boolean g(c07 c07Var) {
        return false;
    }

    @Override // s07
    public final void h(r07 r07Var) {
        throw null;
    }

    @Override // s07
    public final boolean i(c07 c07Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s07
    public final void j() {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.n;
        ArrayList arrayList = null;
        boolean z = false;
        if (viewGroup != null) {
            yz6 yz6Var = this.c;
            if (yz6Var != null) {
                yz6Var.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    c07 c07Var = (c07) l.get(i2);
                    if ((c07Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        c07 itemData = childAt instanceof u07 ? ((u07) childAt).getItemData() : null;
                        View a = a(c07Var, childAt, viewGroup);
                        if (c07Var != itemData) {
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
        yz6 yz6Var2 = this.c;
        if (yz6Var2 != null) {
            yz6Var2.i();
            ArrayList arrayList2 = yz6Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                d07 d07Var = ((c07) arrayList2.get(i3)).A;
            }
        }
        yz6 yz6Var3 = this.c;
        if (yz6Var3 != null) {
            yz6Var3.i();
            arrayList = yz6Var3.j;
        }
        if (this.x && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z = !((c07) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z = true;
            }
        }
        a9 a9Var = this.r;
        if (z) {
            if (a9Var == null) {
                a9Var = new a9(this, this.a);
                this.r = a9Var;
            }
            ViewGroup viewGroup3 = (ViewGroup) a9Var.getParent();
            if (viewGroup3 != this.n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.n;
                a9 a9Var2 = this.r;
                actionMenuView.getClass();
                d9 i4 = ActionMenuView.i();
                i4.a = true;
                actionMenuView.addView(a9Var2, i4);
            }
        } else if (a9Var != null) {
            Object parent = a9Var.getParent();
            Object obj = this.n;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.r);
            }
        }
        ((ActionMenuView) this.n).setOverflowReserved(this.x);
    }

    @Override // s07
    public final void k(Context context, yz6 yz6Var) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = yz6Var;
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
                a9 a9Var = new a9(this, this.a);
                this.r = a9Var;
                if (this.w) {
                    a9Var.setImageDrawable(this.s);
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
        yz6 yz6Var;
        boolean z = false;
        if (this.x && !f() && (yz6Var = this.c) != null && this.n != null && this.L == null) {
            yz6Var.i();
            if (!yz6Var.j.isEmpty()) {
                tq4 tq4Var = new tq4(this, new y8(this, this.b, this.c, this.r), z, (byte) 1);
                this.L = tq4Var;
                ((View) this.n).post(tq4Var);
                return true;
            }
        }
        return false;
    }
}
