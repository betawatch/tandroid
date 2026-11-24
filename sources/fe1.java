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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fe1 extends i27 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public View F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean M;
    public r27 N;
    public ViewTreeObserver O;
    public j27 P;
    public boolean Q;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final uq r = new uq(this, 2);
    public final wd s = new wd(this, 5);
    public final nl9 w = new nl9((Object) this, (byte) 14);
    public int x = 0;
    public int y = 0;
    public boolean L = false;

    public fe1(Context context, View view, int i, boolean z) {
        this.b = context;
        this.E = view;
        this.d = i;
        this.e = z;
        WeakHashMap weakHashMap = kfc.a;
        this.G = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // xia
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((ee1) arrayList.get(0)).a.P.isShowing();
    }

    @Override // s27
    public final boolean b(dcb dcbVar) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ee1 ee1Var = (ee1) obj;
            if (dcbVar == ee1Var.b) {
                ee1Var.a.c.requestFocus();
                return true;
            }
        }
        if (!dcbVar.hasVisibleItems()) {
            return false;
        }
        l(dcbVar);
        r27 r27Var = this.N;
        if (r27Var != null) {
            r27Var.w0(dcbVar);
        }
        return true;
    }

    @Override // s27
    public final boolean c() {
        return false;
    }

    @Override // s27
    public final void d(y17 y17Var, boolean z) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (y17Var == ((ee1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < arrayList.size()) {
                ((ee1) arrayList.get(i2)).b.c(false);
            }
            ee1 ee1Var = (ee1) arrayList.remove(i);
            y17 y17Var2 = ee1Var.b;
            q27 q27Var = ee1Var.a;
            nq nqVar = q27Var.P;
            y17Var2.r(this);
            if (this.Q) {
                m27.b(nqVar, null);
                nqVar.setAnimationStyle(0);
            }
            q27Var.dismiss();
            int size2 = arrayList.size();
            if (size2 > 0) {
                this.G = ((ee1) arrayList.get(size2 - 1)).c;
            } else {
                View view = this.E;
                WeakHashMap weakHashMap = kfc.a;
                this.G = view.getLayoutDirection() == 1 ? 0 : 1;
            }
            if (size2 != 0) {
                if (z) {
                    ((ee1) arrayList.get(0)).b.c(false);
                    return;
                }
                return;
            }
            dismiss();
            r27 r27Var = this.N;
            if (r27Var != null) {
                r27Var.d(y17Var, true);
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

    @Override // xia
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            ee1[] ee1VarArr = (ee1[]) arrayList.toArray(new ee1[size]);
            for (int i = size - 1; i >= 0; i--) {
                ee1 ee1Var = ee1VarArr[i];
                if (ee1Var.a.P.isShowing()) {
                    ee1Var.a.dismiss();
                }
            }
        }
    }

    @Override // xia
    public final os3 e() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ee1) b10.f(1, arrayList)).a.c;
    }

    @Override // xia
    public final void f() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u((y17) obj);
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

    @Override // s27
    public final void h(r27 r27Var) {
        this.N = r27Var;
    }

    @Override // s27
    public final void j() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((ee1) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((v17) adapter).notifyDataSetChanged();
        }
    }

    @Override // i27
    public final void l(y17 y17Var) {
        y17Var.b(this, this.b);
        if (a()) {
            u(y17Var);
        } else {
            this.h.add(y17Var);
        }
    }

    @Override // i27
    public final void n(View view) {
        if (this.E != view) {
            this.E = view;
            int i = this.x;
            WeakHashMap weakHashMap = kfc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // i27
    public final void o(boolean z) {
        this.L = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ee1 ee1Var;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ee1Var = null;
                break;
            }
            ee1Var = (ee1) arrayList.get(i);
            if (!ee1Var.a.P.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (ee1Var != null) {
            ee1Var.b.c(false);
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

    @Override // i27
    public final void p(int i) {
        if (this.x != i) {
            this.x = i;
            View view = this.E;
            WeakHashMap weakHashMap = kfc.a;
            this.y = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // i27
    public final void q(int i) {
        this.H = true;
        this.J = i;
    }

    @Override // i27
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.P = (j27) onDismissListener;
    }

    @Override // i27
    public final void s(boolean z) {
        this.M = z;
    }

    @Override // i27
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
    public final void u(y17 y17Var) {
        boolean z;
        boolean z2;
        View view;
        ee1 ee1Var;
        int i;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        v17 v17Var;
        int i4;
        int firstVisiblePosition;
        Context context = this.b;
        ?? from = LayoutInflater.from(context);
        v17 v17Var2 = new v17(y17Var, from, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.L) {
            v17Var2.c = true;
        } else if (a()) {
            int size = y17Var.f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = y17Var.getItem(i5);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i5++;
            }
            v17Var2.c = z;
        }
        int m = i27.m(v17Var2, context, this.c);
        q27 q27Var = new q27(context, null, this.d);
        q27Var.T = this.w;
        q27Var.G = this;
        nq nqVar = q27Var.P;
        nqVar.setOnDismissListener(this);
        q27Var.F = this.E;
        q27Var.x = this.y;
        q27Var.O = true;
        nqVar.setFocusable(true);
        nqVar.setInputMethodMode(2);
        q27Var.n(v17Var2);
        q27Var.p(m);
        q27Var.x = this.y;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            ee1Var = (ee1) b10.f(1, arrayList);
            y17 y17Var2 = ee1Var.b;
            int size2 = y17Var2.f.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = y17Var2.getItem(i6);
                if (menuItem.hasSubMenu() && y17Var == menuItem.getSubMenu()) {
                    break;
                } else {
                    i6++;
                }
            }
            if (menuItem == null) {
                view = null;
                z2 = 0;
            } else {
                os3 os3Var = ee1Var.a.c;
                ListAdapter adapter = os3Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    v17Var = (v17) headerViewListAdapter.getWrappedAdapter();
                } else {
                    v17Var = (v17) adapter;
                    i4 = 0;
                }
                int count = v17Var.getCount();
                int i7 = 0;
                z2 = 0;
                z2 = 0;
                while (true) {
                    if (i7 >= count) {
                        i7 = -1;
                        break;
                    } else if (menuItem == v17Var.getItem(i7)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                view = (i7 == -1 || (firstVisiblePosition = (i7 + i4) - os3Var.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= os3Var.getChildCount()) ? null : os3Var.getChildAt(firstVisiblePosition);
            }
        } else {
            z2 = 0;
            view = null;
            ee1Var = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = q27.U;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z2] = Boolean.FALSE;
                        method.invoke(nqVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                n27.a(nqVar, z2);
            }
            m27.a(nqVar, null);
            os3 os3Var2 = ((ee1) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            os3Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.F.getWindowVisibleDisplayFrame(rect);
            if (this.G == 1) {
                if (os3Var2.getWidth() + iArr[0] + m > rect.right) {
                    i = 0;
                    boolean z3 = i != 1;
                    this.G = i;
                    if (Build.VERSION.SDK_INT < 26) {
                        q27Var.F = view;
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
                            q27Var.f = width;
                            q27Var.w = true;
                            q27Var.s = true;
                            q27Var.j(i2);
                        }
                        width = i3 - m;
                        q27Var.f = width;
                        q27Var.w = true;
                        q27Var.s = true;
                        q27Var.j(i2);
                    } else if (z3) {
                        width = i3 + m;
                        q27Var.f = width;
                        q27Var.w = true;
                        q27Var.s = true;
                        q27Var.j(i2);
                    } else {
                        m = view.getWidth();
                        width = i3 - m;
                        q27Var.f = width;
                        q27Var.w = true;
                        q27Var.s = true;
                        q27Var.j(i2);
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
                q27Var.f = this.J;
            }
            if (this.I) {
                q27Var.j(this.K);
            }
            Rect rect2 = this.a;
            q27Var.N = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new ee1(q27Var, y17Var, this.G));
        q27Var.f();
        os3 os3Var3 = q27Var.c;
        os3Var3.setOnKeyListener(this);
        if (ee1Var == null && this.M && y17Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, os3Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(y17Var.m);
            os3Var3.addHeaderView(frameLayout, null, false);
            q27Var.f();
        }
    }
}
