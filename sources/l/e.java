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
import androidx.biometric.e0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kf.k0;
import m.g2;
import m.h2;
import m.k2;
import m.s1;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean I;
    public w J;
    public ViewTreeObserver K;
    public PopupWindow.OnDismissListener L;
    public boolean M;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public View y;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final androidx.mediarouter.app.k r = new androidx.mediarouter.app.k(this, 1);
    public final ef.b s = new ef.b(this, 4);
    public final e0 v = new e0(this, 15);
    public int w = 0;
    public int x = 0;
    public boolean H = false;

    public e(Context context, View view, int i10, boolean z4) {
        this.b = context;
        this.y = view;
        this.d = i10;
        this.e = z4;
        WeakHashMap weakHashMap = j0.a;
        this.C = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f = new Handler();
    }

    @Override // l.b0
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).a.L.isShowing();
    }

    @Override // l.x
    public final void c(k kVar, boolean z4) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((d) arrayList.get(i10)).b) {
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
            ((d) arrayList.get(i11)).b.c(false);
        }
        d dVar = (d) arrayList.remove(i10);
        k kVar2 = dVar.b;
        k2 k2Var = dVar.a;
        m.x xVar = k2Var.L;
        kVar2.r(this);
        if (this.M) {
            if (Build.VERSION.SDK_INT >= 23) {
                g2.b(xVar, null);
            }
            xVar.setAnimationStyle(0);
        }
        k2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.C = ((d) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.y;
            WeakHashMap weakHashMap = j0.a;
            this.C = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((d) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.J;
        if (wVar != null) {
            wVar.c(kVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.K;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.K.removeGlobalOnLayoutListener(this.r);
            }
            this.K = null;
        }
        this.B.removeOnAttachStateChangeListener(this.s);
        this.L.onDismiss();
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
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.a.L.isShowing()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // l.x
    public final void e() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ListAdapter adapter = ((d) obj).a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((h) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.b0
    public final s1 f() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) k0.i(1, arrayList)).a.c;
    }

    @Override // l.b0
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
            u((k) obj);
        }
        arrayList.clear();
        View view = this.y;
        this.B = view;
        if (view != null) {
            boolean z4 = this.K == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.K = viewTreeObserver;
            if (z4) {
                viewTreeObserver.addOnGlobalLayoutListener(this.r);
            }
            this.B.addOnAttachStateChangeListener(this.s);
        }
    }

    @Override // l.x
    public final void h(w wVar) {
        this.J = wVar;
    }

    @Override // l.x
    public final boolean j(d0 d0Var) {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
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
        w wVar = this.J;
        if (wVar != null) {
            wVar.p(d0Var);
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
        if (this.y != view) {
            this.y = view;
            int i10 = this.w;
            WeakHashMap weakHashMap = j0.a;
            this.x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.s
    public final void o(boolean z4) {
        this.H = z4;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) arrayList.get(i10);
            if (!dVar.a.L.isShowing()) {
                break;
            } else {
                i10++;
            }
        }
        if (dVar != null) {
            dVar.b.c(false);
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

    @Override // l.s
    public final void p(int i10) {
        if (this.w != i10) {
            this.w = i10;
            View view = this.y;
            WeakHashMap weakHashMap = j0.a;
            this.x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.s
    public final void q(int i10) {
        this.D = true;
        this.F = i10;
    }

    @Override // l.s
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.L = onDismissListener;
    }

    @Override // l.s
    public final void s(boolean z4) {
        this.I = z4;
    }

    @Override // l.s
    public final void t(int i10) {
        this.E = true;
        this.G = i10;
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
    public final void u(k kVar) {
        boolean z4;
        char c3;
        View view;
        d dVar;
        int i10;
        int i11;
        int i12;
        int width;
        MenuItem menuItem;
        h hVar;
        int i13;
        int firstVisiblePosition;
        Context context = this.b;
        LayoutInflater from = LayoutInflater.from(context);
        h hVar2 = new h(kVar, from, this.e, R.layout.abc_cascading_menu_item_layout);
        if (!a() && this.H) {
            hVar2.c = true;
        } else if (a()) {
            int size = kVar.f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = kVar.getItem(i14);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i14++;
            }
            hVar2.c = z4;
        }
        int m9 = s.m(hVar2, context, this.c);
        k2 k2Var = new k2(context, null, this.d);
        k2Var.P = this.v;
        k2Var.C = this;
        m.x xVar = k2Var.L;
        xVar.setOnDismissListener(this);
        k2Var.B = this.y;
        k2Var.w = this.x;
        k2Var.K = true;
        xVar.setFocusable(true);
        xVar.setInputMethodMode(2);
        k2Var.p(hVar2);
        k2Var.r(m9);
        k2Var.w = this.x;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            dVar = (d) k0.i(1, arrayList);
            k kVar2 = dVar.b;
            int size2 = kVar2.f.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    menuItem = null;
                    break;
                }
                menuItem = kVar2.getItem(i15);
                if (menuItem.hasSubMenu() && kVar == menuItem.getSubMenu()) {
                    break;
                } else {
                    i15++;
                }
            }
            if (menuItem == null) {
                view = null;
                c3 = 0;
            } else {
                s1 s1Var = dVar.a.c;
                ListAdapter adapter = s1Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i13 = headerViewListAdapter.getHeadersCount();
                    hVar = (h) headerViewListAdapter.getWrappedAdapter();
                } else {
                    hVar = (h) adapter;
                    i13 = 0;
                }
                int count = hVar.getCount();
                int i16 = 0;
                c3 = 0;
                while (true) {
                    if (i16 >= count) {
                        i16 = -1;
                        break;
                    } else if (menuItem == hVar.getItem(i16)) {
                        break;
                    } else {
                        i16++;
                    }
                }
                view = (i16 != -1 && (firstVisiblePosition = (i16 + i13) - s1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < s1Var.getChildCount()) ? s1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c3 = 0;
            view = null;
            dVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = k2.Q;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c3] = Boolean.FALSE;
                        method.invoke(xVar, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                h2.a(xVar, false);
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 23) {
                g2.a(xVar, null);
            }
            s1 s1Var2 = ((d) k0.i(1, arrayList)).a.c;
            int[] iArr = new int[2];
            s1Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.B.getWindowVisibleDisplayFrame(rect);
            if (this.C == 1) {
            }
            boolean z10 = i10 == 1;
            this.C = i10;
            if (i17 >= 26) {
                k2Var.B = view;
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
                if (z10) {
                    width = i12 + view.getWidth();
                    k2Var.f = width;
                    k2Var.v = true;
                    k2Var.s = true;
                    k2Var.k(i11);
                }
                width = i12 - m9;
                k2Var.f = width;
                k2Var.v = true;
                k2Var.s = true;
                k2Var.k(i11);
            } else if (z10) {
                width = i12 + m9;
                k2Var.f = width;
                k2Var.v = true;
                k2Var.s = true;
                k2Var.k(i11);
            } else {
                m9 = view.getWidth();
                width = i12 - m9;
                k2Var.f = width;
                k2Var.v = true;
                k2Var.s = true;
                k2Var.k(i11);
            }
        } else {
            if (this.D) {
                k2Var.f = this.F;
            }
            if (this.E) {
                k2Var.k(this.G);
            }
            Rect rect2 = this.a;
            k2Var.J = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new d(k2Var, kVar, this.C));
        k2Var.g();
        s1 s1Var3 = k2Var.c;
        s1Var3.setOnKeyListener(this);
        if (dVar == null && this.I && kVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) s1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(kVar.m);
            s1Var3.addHeaderView(frameLayout, null, false);
            k2Var.g();
        }
    }
}
