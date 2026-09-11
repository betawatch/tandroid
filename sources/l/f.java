package l;

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
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import bi.i2;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.f2;
import m.g2;
import m.j2;
import m.r1;
import org.telegram.messenger.beta.R;
import r0.i0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean L;
    public x M;
    public ViewTreeObserver N;
    public PopupWindow.OnDismissListener O;
    public boolean P;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final androidx.mediarouter.app.j r;
    public final i2 s;
    public View y;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final d v = new d(this, 0);
    public int w = 0;
    public int x = 0;
    public boolean K = false;

    public f(Context context, View view, int i10, boolean z10) {
        this.r = new androidx.mediarouter.app.j(this, r1);
        this.s = new i2(this, r1);
        this.b = context;
        this.y = view;
        this.d = i10;
        this.e = z10;
        WeakHashMap weakHashMap = i0.a;
        this.F = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // l.c0
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).a.O.isShowing();
    }

    @Override // l.y
    public final boolean c() {
        return false;
    }

    @Override // l.y
    public final void d(l lVar, boolean z10) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((e) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            return;
        }
        int i11 = i10 + 1;
        if (i11 < arrayList.size()) {
            ((e) arrayList.get(i11)).b.c(false);
        }
        e eVar = (e) arrayList.remove(i10);
        l lVar2 = eVar.b;
        j2 j2Var = eVar.a;
        m.x xVar = j2Var.O;
        lVar2.r(this);
        if (this.P) {
            if (Build.VERSION.SDK_INT >= 23) {
                f2.b(xVar, null);
            }
            xVar.setAnimationStyle(0);
        }
        j2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.F = ((e) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.y;
            WeakHashMap weakHashMap = i0.a;
            this.F = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((e) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar2 = this.M;
        if (xVar2 != null) {
            xVar2.d(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.N;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.N.removeGlobalOnLayoutListener(this.r);
            }
            this.N = null;
        }
        this.E.removeOnAttachStateChangeListener(this.s);
        this.O.onDismiss();
    }

    @Override // l.c0
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                e eVar = eVarArr[i10];
                if (eVar.a.O.isShowing()) {
                    eVar.a.dismiss();
                }
            }
        }
    }

    @Override // l.y
    public final void e() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((e) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((i) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.c0
    public final r1 f() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) i2.g.h(1, arrayList)).a.c;
    }

    @Override // l.c0
    public final void g() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u((l) obj);
        }
        arrayList.clear();
        View view = this.y;
        this.E = view;
        if (view != null) {
            boolean z10 = this.N == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.N = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.r);
            }
            this.E.addOnAttachStateChangeListener(this.s);
        }
    }

    @Override // l.y
    public final void h(x xVar) {
        this.M = xVar;
    }

    @Override // l.y
    public final boolean j(e0 e0Var) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e eVar = (e) obj;
            if (e0Var == eVar.b) {
                eVar.a.c.requestFocus();
                return true;
            }
        }
        if (!e0Var.hasVisibleItems()) {
            return false;
        }
        l(e0Var);
        x xVar = this.M;
        if (xVar != null) {
            xVar.q(e0Var);
        }
        return true;
    }

    @Override // l.t
    public final void l(l lVar) {
        lVar.b(this, this.b);
        if (a()) {
            u(lVar);
        } else {
            this.h.add(lVar);
        }
    }

    @Override // l.t
    public final void n(View view) {
        if (this.y != view) {
            this.y = view;
            int i10 = this.w;
            WeakHashMap weakHashMap = i0.a;
            this.x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.t
    public final void o(boolean z10) {
        this.K = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        e eVar;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                eVar = null;
                break;
            }
            eVar = (e) arrayList.get(i10);
            if (!eVar.a.O.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (eVar != null) {
            eVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.t
    public final void p(int i10) {
        if (this.w != i10) {
            this.w = i10;
            View view = this.y;
            WeakHashMap weakHashMap = i0.a;
            this.x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.t
    public final void q(int i10) {
        this.G = true;
        this.I = i10;
    }

    @Override // l.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.O = onDismissListener;
    }

    @Override // l.t
    public final void s(boolean z10) {
        this.L = z10;
    }

    @Override // l.t
    public final void t(int i10) {
        this.H = true;
        this.J = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0158, code lost:
    
        if (((r2.getWidth() + r12[0]) + r5) > r10.right) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015a, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0164, code lost:
    
        if ((r12[0] - r5) < 0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(l lVar) {
        boolean z10;
        char c10;
        View view;
        e eVar;
        int i10;
        int i11;
        int i12;
        int width;
        MenuItem menuItem;
        i iVar;
        int i13;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater from = LayoutInflater.from(context);
        i iVar2 = new i(lVar, from, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.K) {
            iVar2.c = true;
        } else if (a()) {
            int size = lVar.f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = lVar.getItem(i14);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i14++;
            }
            iVar2.c = z10;
        }
        int m10 = t.m(iVar2, context, this.c);
        j2 j2Var = new j2(context, null, this.d);
        j2Var.S = this.v;
        j2Var.F = this;
        m.x xVar = j2Var.O;
        xVar.setOnDismissListener(this);
        j2Var.E = this.y;
        j2Var.w = this.x;
        j2Var.N = true;
        xVar.setFocusable(true);
        xVar.setInputMethodMode(2);
        j2Var.p(iVar2);
        j2Var.r(m10);
        j2Var.w = this.x;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            eVar = (e) i2.g.h(1, arrayList);
            l lVar2 = eVar.b;
            int size2 = lVar2.f.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = lVar2.getItem(i15);
                if (menuItem.hasSubMenu() && lVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (menuItem == null) {
                view = null;
                c10 = 0;
            } else {
                r1 r1Var = eVar.a.c;
                ListAdapter adapter = r1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i13 = headerViewListAdapter.getHeadersCount();
                    iVar = (i) headerViewListAdapter.getWrappedAdapter();
                } else {
                    iVar = (i) adapter;
                    i13 = 0;
                }
                int count = iVar.getCount();
                int i16 = 0;
                c10 = 0;
                while (true) {
                    if (i16 >= count) {
                        i16 = -1;
                        break;
                    } else if (menuItem == iVar.getItem(i16)) {
                        break;
                    } else {
                        i16++;
                    }
                }
                view = (i16 != -1 && (firstVisiblePosition = (i16 + i13) - r1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r1Var.getChildCount()) ? r1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c10 = 0;
            view = null;
            eVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = j2.T;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c10] = Boolean.FALSE;
                        method.invoke(xVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                g2.a(xVar, false);
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 23) {
                f2.a(xVar, null);
            }
            r1 r1Var2 = ((e) i2.g.h(1, arrayList)).a.c;
            int[] iArr = new int[2];
            r1Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.E.getWindowVisibleDisplayFrame(rect);
            if (this.F == 1) {
            }
            boolean z11 = i10 == 1;
            this.F = i10;
            if (i17 >= 26) {
                j2Var.E = view;
                i11 = 0;
                i12 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.y.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.x & 7) == 5) {
                    iArr2[0] = this.y.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                }
                int i18 = iArr3[0] - iArr2[0];
                i11 = iArr3[1] - iArr2[1];
                i12 = i18;
            }
            if ((this.x & 5) != 5) {
                if (z11) {
                    width = i12 + view.getWidth();
                    j2Var.f = width;
                    j2Var.v = true;
                    j2Var.s = true;
                    j2Var.k(i11);
                }
                width = i12 - m10;
                j2Var.f = width;
                j2Var.v = true;
                j2Var.s = true;
                j2Var.k(i11);
            } else if (z11) {
                width = i12 + m10;
                j2Var.f = width;
                j2Var.v = true;
                j2Var.s = true;
                j2Var.k(i11);
            } else {
                m10 = view.getWidth();
                width = i12 - m10;
                j2Var.f = width;
                j2Var.v = true;
                j2Var.s = true;
                j2Var.k(i11);
            }
        } else {
            if (this.G) {
                j2Var.f = this.I;
            }
            if (this.H) {
                j2Var.k(this.J);
            }
            Rect rect2 = this.a;
            j2Var.M = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new e(j2Var, lVar, this.F));
        j2Var.g();
        r1 r1Var3 = j2Var.c;
        r1Var3.setOnKeyListener(this);
        if (eVar == null && this.L && lVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.m);
            r1Var3.addHeaderView(frameLayout, null, false);
            j2Var.g();
        }
    }
}
