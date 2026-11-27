// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fd1 extends p27 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public View F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean M;
    public y27 N;
    public ViewTreeObserver O;
    public q27 P;
    public boolean Q;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final vp r = new vp(this, 2);
    public final xc s = new xc(this, 5);
    public final zm9 w = new zm9((Object) this, (byte) 14);
    public int x = 0;
    public int y = 0;
    public boolean L = false;

    public fd1(Context context, View view, int i, boolean z) {
        this.b = context;
        this.E = view;
        this.d = i;
        this.e = z;
        WeakHashMap weakHashMap = ihc.a;
        this.G = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // oka
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((ed1) arrayList.get(0)).a.P.isShowing();
    }

    @Override // z27
    public final boolean b(zdb zdbVar) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ed1 ed1Var = (ed1) obj;
            if (zdbVar == ed1Var.b) {
                ed1Var.a.c.requestFocus();
                return true;
            }
        }
        if (!zdbVar.hasVisibleItems()) {
            return false;
        }
        l(zdbVar);
        y27 y27Var = this.N;
        if (y27Var != null) {
            y27Var.z0(zdbVar);
        }
        return true;
    }

    @Override // z27
    public final boolean c() {
        return false;
    }

    @Override // oka
    public final vr3 d() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ed1) c00.g(1, arrayList)).a.c;
    }

    @Override // oka
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            ed1[] ed1VarArr = (ed1[]) arrayList.toArray(new ed1[size]);
            for (int i = size - 1; i >= 0; i--) {
                ed1 ed1Var = ed1VarArr[i];
                if (ed1Var.a.P.isShowing()) {
                    ed1Var.a.dismiss();
                }
            }
        }
    }

    @Override // z27
    public final void f(f27 f27Var, boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (f27Var == ((ed1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                ((ed1) arrayList.get(i2)).b.c(false);
            }
            ed1 ed1Var = (ed1) arrayList.remove(i);
            f27 f27Var2 = ed1Var.b;
            x27 x27Var = ed1Var.a;
            op opVar = x27Var.P;
            f27Var2.r(this);
            if (this.Q) {
                t27.b(opVar, null);
                opVar.setAnimationStyle(0);
            }
            x27Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.G = ((ed1) arrayList.get(size2 - 1)).c;
            } else {
                View view = this.E;
                WeakHashMap weakHashMap = ihc.a;
                this.G = view.getLayoutDirection() == 1 ? 0 : 1;
            }
            if (size2 != 0) {
                if (z) {
                    ((ed1) arrayList.get(0)).b.c(false);
                    return;
                }
                return;
            }
            dismiss();
            y27 y27Var = this.N;
            if (y27Var != null) {
                y27Var.f(f27Var, true);
            }
            ViewTreeObserver viewTreeObserver = this.O;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.O.removeGlobalOnLayoutListener(this.r);
                }
                this.O = null;
            }
            this.F.removeOnAttachStateChangeListener(this.s);
            this.P.onDismiss();
        }
    }

    @Override // oka
    public final void g() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((f27) obj);
        }
        arrayList.clear();
        View view = this.E;
        this.F = view;
        if (view != null) {
            boolean z = this.O == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.O = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.r);
            }
            this.F.addOnAttachStateChangeListener(this.s);
        }
    }

    @Override // z27
    public final void h(y27 y27Var) {
        this.N = y27Var;
    }

    @Override // z27
    public final void j() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((ed1) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((c27) adapter).notifyDataSetChanged();
        }
    }

    @Override // p27
    public final void l(f27 f27Var) {
        f27Var.b(this, this.b);
        if (a()) {
            u(f27Var);
        } else {
            this.h.add(f27Var);
        }
    }

    @Override // p27
    public final void n(View view) {
        if (this.E != view) {
            this.E = view;
            int i = this.x;
            WeakHashMap weakHashMap = ihc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p27
    public final void o(boolean z) {
        this.L = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ed1 ed1Var;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ed1Var = null;
                break;
            }
            ed1Var = (ed1) arrayList.get(i);
            if (!ed1Var.a.P.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (ed1Var != null) {
            ed1Var.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p27
    public final void p(int i) {
        if (this.x != i) {
            this.x = i;
            View view = this.E;
            WeakHashMap weakHashMap = ihc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // p27
    public final void q(int i) {
        this.H = true;
        this.J = i;
    }

    @Override // p27
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.P = (q27) onDismissListener;
    }

    @Override // p27
    public final void s(boolean z) {
        this.M = z;
    }

    @Override // p27
    public final void t(int i) {
        this.I = true;
        this.K = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(f27 f27Var) {
        boolean z;
        boolean z2;
        View view;
        ed1 ed1Var;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        c27 c27Var;
        int i4;
        int firstVisiblePosition;
        Context context = this.b;
        ?? from = LayoutInflater.from(context);
        c27 c27Var2 = new c27(f27Var, from, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.L) {
            c27Var2.c = true;
        } else if (a()) {
            int size = f27Var.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = f27Var.getItem(i5);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            c27Var2.c = z;
        }
        int m = p27.m(c27Var2, context, this.c);
        x27 x27Var = new x27(context, null, this.d);
        x27Var.T = this.w;
        x27Var.G = this;
        op opVar = x27Var.P;
        opVar.setOnDismissListener(this);
        x27Var.F = this.E;
        x27Var.x = this.y;
        x27Var.O = true;
        opVar.setFocusable(true);
        opVar.setInputMethodMode(2);
        x27Var.n(c27Var2);
        x27Var.p(m);
        x27Var.x = this.y;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            ed1Var = (ed1) c00.g(1, arrayList);
            f27 f27Var2 = ed1Var.b;
            int size2 = f27Var2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = f27Var2.getItem(i6);
                if (menuItem.hasSubMenu() && f27Var == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                vr3 vr3Var = ed1Var.a.c;
                ListAdapter adapter = vr3Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    c27Var = (c27) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c27Var = (c27) adapter;
                    i4 = 0;
                }
                int count = c27Var.getCount();
                int i7 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == c27Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                view = (i7 == -1 || (firstVisiblePosition = (i7 + i4) - vr3Var.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= vr3Var.getChildCount()) ? null : vr3Var.getChildAt(firstVisiblePosition);
            }
        } else {
            z2 = 0;
            view = null;
            ed1Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = x27.U;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(opVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                u27.a(opVar, z2);
            }
            t27.a(opVar, null);
            vr3 vr3Var2 = ((ed1) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            vr3Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.F.getWindowVisibleDisplayFrame(rect);
            if (this.G == 1) {
                if (vr3Var2.getWidth() + iArr[0] + m > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.G = i;
                    if (Build.VERSION.SDK_INT < 26) {
                        x27Var.F = view;
                        i2 = 0;
                        i3 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.E.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.y & 7) == 5) {
                            iArr2[0] = this.E.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        int i8 = iArr3[0] - iArr2[0];
                        i2 = iArr3[1] - iArr2[1];
                        i3 = i8;
                    }
                    if ((this.y & 5) == 5) {
                        if (z3) {
                            width = i3 + view.getWidth();
                            x27Var.f = width;
                            x27Var.w = true;
                            x27Var.s = true;
                            x27Var.j(i2);
                        }
                        width = i3 - m;
                        x27Var.f = width;
                        x27Var.w = true;
                        x27Var.s = true;
                        x27Var.j(i2);
                    } else if (z3) {
                        width = i3 + m;
                        x27Var.f = width;
                        x27Var.w = true;
                        x27Var.s = true;
                        x27Var.j(i2);
                    } else {
                        m = view.getWidth();
                        width = i3 - m;
                        x27Var.f = width;
                        x27Var.w = true;
                        x27Var.s = true;
                        x27Var.j(i2);
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.G = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.y & 5) == 5) {
                }
            } else {
                if (iArr[0] - m >= 0) {
                    i = 0;
                    if (i != 1) {
                    }
                    this.G = i;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.y & 5) == 5) {
                    }
                }
                i = 1;
                if (i != 1) {
                }
                this.G = i;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.y & 5) == 5) {
                }
            }
        } else {
            if (this.H) {
                x27Var.f = this.J;
            }
            if (this.I) {
                x27Var.j(this.K);
            }
            Rect rect2 = this.a;
            x27Var.N = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new ed1(x27Var, f27Var, this.G));
        x27Var.g();
        vr3 vr3Var3 = x27Var.c;
        vr3Var3.setOnKeyListener(this);
        if (ed1Var == null && this.M && f27Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, vr3Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(f27Var.m);
            vr3Var3.addHeaderView(frameLayout, null, false);
            x27Var.g();
        }
    }
}
