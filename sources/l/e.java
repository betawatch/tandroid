package l;

import ai.f2;
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
import gi.v5;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k2.p1;
import m.g2;
import m.j2;
import m.r1;
import org.telegram.messenger.beta.R;
import r0.i0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public View F;
    public int G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public boolean M;
    public w N;
    public ViewTreeObserver O;
    public PopupWindow.OnDismissListener P;
    public boolean Q;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final androidx.mediarouter.app.i r = new androidx.mediarouter.app.i(this, 1);
    public final f2 s = new f2(this, 7);
    public final v5 w = new v5(this, 8);
    public int x = 0;
    public int y = 0;
    public boolean L = false;

    public e(Context context, View view, int i3, boolean z10) {
        this.b = context;
        this.E = view;
        this.d = i3;
        this.e = z10;
        WeakHashMap weakHashMap = i0.a;
        this.G = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // l.b0
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).a.P.isShowing();
    }

    @Override // l.x
    public final void b(k kVar, boolean z10) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (kVar == ((d) arrayList.get(i3)).b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            return;
        }
        int i10 = i3 + 1;
        if (i10 < arrayList.size()) {
            ((d) arrayList.get(i10)).b.c(false);
        }
        d dVar = (d) arrayList.remove(i3);
        k kVar2 = dVar.b;
        j2 j2Var = dVar.a;
        m.x xVar = j2Var.P;
        kVar2.r(this);
        if (this.Q) {
            m.f2.b(xVar, null);
            xVar.setAnimationStyle(0);
        }
        j2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.G = ((d) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.E;
            WeakHashMap weakHashMap = i0.a;
            this.G = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.N;
        if (wVar != null) {
            wVar.b(kVar, true);
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

    @Override // l.x
    public final boolean d() {
        return false;
    }

    @Override // l.b0
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                d dVar = dVarArr[i3];
                if (dVar.a.P.isShowing()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // l.x
    public final void e() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ListAdapter adapter = ((d) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.b0
    public final r1 f() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) p1.h(1, arrayList)).a.c;
    }

    @Override // l.b0
    public final void g() {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            u((k) obj);
        }
        arrayList.clear();
        View view = this.E;
        this.F = view;
        if (view != null) {
            boolean z10 = this.O == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.O = viewTreeObserver;
            if (z10) {
                viewTreeObserver.addOnGlobalLayoutListener(this.r);
            }
            this.F.addOnAttachStateChangeListener(this.s);
        }
    }

    @Override // l.x
    public final void h(w wVar) {
        this.N = wVar;
    }

    @Override // l.x
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            d dVar = (d) obj;
            if (d0Var == dVar.b) {
                dVar.a.c.requestFocus();
                return true;
            }
        }
        if (!d0Var.hasVisibleItems()) {
            return false;
        }
        l(d0Var);
        w wVar = this.N;
        if (wVar != null) {
            wVar.E(d0Var);
        }
        return true;
    }

    @Override // l.s
    public final void l(k kVar) {
        kVar.b(this, this.b);
        if (a()) {
            u(kVar);
        } else {
            this.h.add(kVar);
        }
    }

    @Override // l.s
    public final void n(View view) {
        if (this.E != view) {
            this.E = view;
            int i3 = this.x;
            WeakHashMap weakHashMap = i0.a;
            this.y = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // l.s
    public final void o(boolean z10) {
        this.L = z10;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i3);
            if (!dVar.a.P.isShowing()) {
                break;
            } else {
                i3++;
            }
        }
        if (dVar != null) {
            dVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.s
    public final void p(int i3) {
        if (this.x != i3) {
            this.x = i3;
            View view = this.E;
            WeakHashMap weakHashMap = i0.a;
            this.y = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection());
        }
    }

    @Override // l.s
    public final void q(int i3) {
        this.H = true;
        this.J = i3;
    }

    @Override // l.s
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.P = onDismissListener;
    }

    @Override // l.s
    public final void s(boolean z10) {
        this.M = z10;
    }

    @Override // l.s
    public final void t(int i3) {
        this.I = true;
        this.K = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(k kVar) {
        boolean z10;
        boolean z11;
        View view;
        d dVar;
        int i3;
        int i10;
        int i11;
        int width;
        MenuItem menuItem;
        h hVar;
        int i12;
        int firstVisiblePosition;
        Context context = this.b;
        ?? from = LayoutInflater.from(context);
        h hVar2 = new h(kVar, from, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.L) {
            hVar2.c = true;
        } else if (a()) {
            int size = kVar.f.size();
            int i13 = 0;
            while (true) {
                if (i13 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = kVar.getItem(i13);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i13++;
            }
            hVar2.c = z10;
        }
        int m10 = s.m(hVar2, context, this.c);
        j2 j2Var = new j2(context, null, this.d);
        j2Var.T = this.w;
        j2Var.G = this;
        m.x xVar = j2Var.P;
        xVar.setOnDismissListener(this);
        j2Var.F = this.E;
        j2Var.x = this.y;
        j2Var.O = true;
        xVar.setFocusable(true);
        xVar.setInputMethodMode(2);
        j2Var.o(hVar2);
        j2Var.q(m10);
        j2Var.x = this.y;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            dVar = (d) p1.h(1, arrayList);
            k kVar2 = dVar.b;
            int size2 = kVar2.f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = kVar2.getItem(i14);
                if (menuItem.hasSubMenu() && kVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (menuItem == null) {
                view = null;
                z11 = 0;
            } else {
                r1 r1Var = dVar.a.c;
                ListAdapter adapter = r1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i12 = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    i12 = 0;
                }
                int count = hVar.getCount();
                int i15 = 0;
                z11 = 0;
                z11 = 0;
                while (true) {
                    if (i15 >= count) {
                        i15 = -1;
                        break;
                    } else if (menuItem == hVar.getItem(i15)) {
                        break;
                    } else {
                        i15++;
                    }
                }
                view = (i15 != -1 && (firstVisiblePosition = (i15 + i12) - r1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r1Var.getChildCount()) ? r1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            z11 = 0;
            view = null;
            dVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = j2.U;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[z11] = Boolean.FALSE;
                        method.invoke(xVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                g2.a(xVar, z11);
            }
            m.f2.a(xVar, null);
            r1 r1Var2 = ((d) arrayList.get(arrayList.size() - 1)).a.c;
            int[] iArr = new int[2];
            r1Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.F.getWindowVisibleDisplayFrame(rect);
            if (this.G == 1) {
                if (r1Var2.getWidth() + iArr[0] + m10 > rect.right) {
                    i3 = 0;
                    boolean z12 = i3 != 1;
                    this.G = i3;
                    if (Build.VERSION.SDK_INT < 26) {
                        j2Var.F = view;
                        i10 = 0;
                        i11 = 0;
                    } else {
                        int[] iArr2 = new int[2];
                        this.E.getLocationOnScreen(iArr2);
                        int[] iArr3 = new int[2];
                        view.getLocationOnScreen(iArr3);
                        if ((this.y & 7) == 5) {
                            iArr2[0] = this.E.getWidth() + iArr2[0];
                            iArr3[0] = view.getWidth() + iArr3[0];
                        }
                        int i16 = iArr3[0] - iArr2[0];
                        i10 = iArr3[1] - iArr2[1];
                        i11 = i16;
                    }
                    if ((this.y & 5) == 5) {
                        if (z12) {
                            width = i11 + view.getWidth();
                            j2Var.f = width;
                            j2Var.w = true;
                            j2Var.s = true;
                            j2Var.k(i10);
                        }
                        width = i11 - m10;
                        j2Var.f = width;
                        j2Var.w = true;
                        j2Var.s = true;
                        j2Var.k(i10);
                    } else if (z12) {
                        width = i11 + m10;
                        j2Var.f = width;
                        j2Var.w = true;
                        j2Var.s = true;
                        j2Var.k(i10);
                    } else {
                        m10 = view.getWidth();
                        width = i11 - m10;
                        j2Var.f = width;
                        j2Var.w = true;
                        j2Var.s = true;
                        j2Var.k(i10);
                    }
                }
                i3 = 1;
                if (i3 != 1) {
                }
                this.G = i3;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.y & 5) == 5) {
                }
            } else {
                if (iArr[0] - m10 >= 0) {
                    i3 = 0;
                    if (i3 != 1) {
                    }
                    this.G = i3;
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    if ((this.y & 5) == 5) {
                    }
                }
                i3 = 1;
                if (i3 != 1) {
                }
                this.G = i3;
                if (Build.VERSION.SDK_INT < 26) {
                }
                if ((this.y & 5) == 5) {
                }
            }
        } else {
            if (this.H) {
                j2Var.f = this.J;
            }
            if (this.I) {
                j2Var.k(this.K);
            }
            Rect rect2 = this.a;
            j2Var.N = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new d(j2Var, kVar, this.G));
        j2Var.g();
        r1 r1Var3 = j2Var.c;
        r1Var3.setOnKeyListener(this);
        if (dVar == null && this.M && kVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, r1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(kVar.m);
            r1Var3.addHeaderView(frameLayout, null, false);
            j2Var.g();
        }
    }
}
