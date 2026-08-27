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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.g2;
import m.h2;
import m.k2;
import m.s1;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public boolean H;
    public x I;
    public ViewTreeObserver J;
    public PopupWindow.OnDismissListener K;
    public boolean L;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public View y;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final d r = new d(this, 0);
    public final bf.b s = new bf.b(this, 6);
    public final a9.i v = new a9.i(this, 23);
    public int w = 0;
    public int x = 0;
    public boolean G = false;

    public f(Context context, View view, int i10, boolean z10) {
        this.b = context;
        this.y = view;
        this.d = i10;
        this.e = z10;
        WeakHashMap weakHashMap = j0.a;
        this.B = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // l.c0
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).a.K.isShowing();
    }

    @Override // l.y
    public final void b(l lVar, boolean z10) {
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
        k2 k2Var = eVar.a;
        m.y yVar = k2Var.K;
        lVar2.r(this);
        if (this.L) {
            if (Build.VERSION.SDK_INT >= 23) {
                g2.b(yVar, null);
            }
            yVar.setAnimationStyle(0);
        }
        k2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.B = ((e) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.y;
            WeakHashMap weakHashMap = j0.a;
            this.B = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((e) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar = this.I;
        if (xVar != null) {
            xVar.b(lVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.J;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.J.removeGlobalOnLayoutListener(this.r);
            }
            this.J = null;
        }
        this.A.removeOnAttachStateChangeListener(this.s);
        this.K.onDismiss();
    }

    @Override // l.y
    public final boolean d() {
        return false;
    }

    @Override // l.c0
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            e[] eVarArr = (e[]) arrayList.toArray(new e[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                e eVar = eVarArr[i10];
                if (eVar.a.K.isShowing()) {
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
    public final s1 f() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((e) i0.a.i(1, arrayList)).a.c;
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
        this.A = view;
        if (view != null) {
            boolean z10 = this.J == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.J = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.r);
            }
            this.A.addOnAttachStateChangeListener(this.s);
        }
    }

    @Override // l.y
    public final void h(x xVar) {
        this.I = xVar;
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
        x xVar = this.I;
        if (xVar != null) {
            xVar.l(e0Var);
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
            WeakHashMap weakHashMap = j0.a;
            this.x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.t
    public final void o(boolean z10) {
        this.G = z10;
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
            if (!eVar.a.K.isShowing()) {
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
            WeakHashMap weakHashMap = j0.a;
            this.x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.t
    public final void q(int i10) {
        this.C = true;
        this.E = i10;
    }

    @Override // l.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.K = onDismissListener;
    }

    @Override // l.t
    public final void s(boolean z10) {
        this.H = z10;
    }

    @Override // l.t
    public final void t(int i10) {
        this.D = true;
        this.F = i10;
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
        if (!a() && this.G) {
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
        k2 k2Var = new k2(context, null, this.d);
        k2Var.O = this.v;
        k2Var.B = this;
        m.y yVar = k2Var.K;
        yVar.setOnDismissListener(this);
        k2Var.A = this.y;
        k2Var.w = this.x;
        k2Var.J = true;
        yVar.setFocusable(true);
        yVar.setInputMethodMode(2);
        k2Var.o(iVar2);
        k2Var.q(m10);
        k2Var.w = this.x;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            eVar = (e) i0.a.i(1, arrayList);
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
                s1 s1Var = eVar.a.c;
                ListAdapter adapter = s1Var.getAdapter();
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
                view = (i16 != -1 && (firstVisiblePosition = (i16 + i13) - s1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < s1Var.getChildCount()) ? s1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c10 = 0;
            view = null;
            eVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = k2.P;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c10] = Boolean.FALSE;
                        method.invoke(yVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                h2.a(yVar, false);
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 23) {
                g2.a(yVar, null);
            }
            s1 s1Var2 = ((e) i0.a.i(1, arrayList)).a.c;
            int[] iArr = new int[2];
            s1Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.A.getWindowVisibleDisplayFrame(rect);
            if (this.B == 1) {
            }
            boolean z11 = i10 == 1;
            this.B = i10;
            if (i17 >= 26) {
                k2Var.A = view;
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
                    k2Var.f = width;
                    k2Var.v = true;
                    k2Var.s = true;
                    k2Var.k(i11);
                }
                width = i12 - m10;
                k2Var.f = width;
                k2Var.v = true;
                k2Var.s = true;
                k2Var.k(i11);
            } else if (z11) {
                width = i12 + m10;
                k2Var.f = width;
                k2Var.v = true;
                k2Var.s = true;
                k2Var.k(i11);
            } else {
                m10 = view.getWidth();
                width = i12 - m10;
                k2Var.f = width;
                k2Var.v = true;
                k2Var.s = true;
                k2Var.k(i11);
            }
        } else {
            if (this.C) {
                k2Var.f = this.E;
            }
            if (this.D) {
                k2Var.k(this.F);
            }
            Rect rect2 = this.a;
            k2Var.I = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new e(k2Var, lVar, this.B));
        k2Var.g();
        s1 s1Var3 = k2Var.c;
        s1Var3.setOnKeyListener(this);
        if (eVar == null && this.H && lVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) s1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.m);
            s1Var3.addHeaderView(frameLayout, null, false);
            k2Var.g();
        }
    }
}
