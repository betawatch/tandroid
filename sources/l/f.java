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
import androidx.biometric.f0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.f2;
import m.g2;
import m.j2;
import m.r1;
import org.telegram.messenger.beta.R;
import r0.j0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f extends t implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public boolean I;
    public x J;
    public ViewTreeObserver K;
    public PopupWindow.OnDismissListener L;
    public boolean M;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final androidx.mediarouter.app.k r;
    public final ff.b s;
    public View y;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final f0 v = new f0(this, 16);
    public int w = 0;
    public int x = 0;
    public boolean H = false;

    public f(Context context, View view, int i10, boolean z4) {
        this.r = new androidx.mediarouter.app.k(this, r1);
        this.s = new ff.b(this, r1);
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

    @Override // l.c0
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((e) arrayList.get(0)).a.L.isShowing();
    }

    @Override // l.y
    public final void c(l lVar, boolean z4) {
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
        m.x xVar = j2Var.L;
        lVar2.r(this);
        if (this.M) {
            if (Build.VERSION.SDK_INT >= 23) {
                f2.b(xVar, null);
            }
            xVar.setAnimationStyle(0);
        }
        j2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.C = ((e) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.y;
            WeakHashMap weakHashMap = j0.a;
            this.C = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z4) {
                ((e) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        x xVar2 = this.J;
        if (xVar2 != null) {
            xVar2.c(lVar, true);
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
                if (eVar.a.L.isShowing()) {
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
        return ((e) d.i(1, arrayList)).a.c;
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

    @Override // l.y
    public final void h(x xVar) {
        this.J = xVar;
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
        x xVar = this.J;
        if (xVar != null) {
            xVar.d0(e0Var);
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
    public final void o(boolean z4) {
        this.H = z4;
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
            if (!eVar.a.L.isShowing()) {
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
        this.D = true;
        this.F = i10;
    }

    @Override // l.t
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.L = onDismissListener;
    }

    @Override // l.t
    public final void s(boolean z4) {
        this.I = z4;
    }

    @Override // l.t
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
    public final void u(l lVar) {
        boolean z4;
        char c3;
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
        if (!a() && this.H) {
            iVar2.c = true;
        } else if (a()) {
            int size = lVar.f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z4 = false;
                    break;
                }
                MenuItem item = lVar.getItem(i14);
                if (item.isVisible() && item.getIcon() != null) {
                    z4 = true;
                    break;
                }
                i14++;
            }
            iVar2.c = z4;
        }
        int m9 = t.m(iVar2, context, this.c);
        j2 j2Var = new j2(context, null, this.d);
        j2Var.P = this.v;
        j2Var.C = this;
        m.x xVar = j2Var.L;
        xVar.setOnDismissListener(this);
        j2Var.B = this.y;
        j2Var.w = this.x;
        j2Var.K = true;
        xVar.setFocusable(true);
        xVar.setInputMethodMode(2);
        j2Var.o(iVar2);
        j2Var.q(m9);
        j2Var.w = this.x;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            eVar = (e) d.i(1, arrayList);
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
                c3 = 0;
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
                c3 = 0;
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
            c3 = 0;
            view = null;
            eVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = j2.Q;
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
                g2.a(xVar, false);
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 23) {
                f2.a(xVar, null);
            }
            r1 r1Var2 = ((e) d.i(1, arrayList)).a.c;
            int[] iArr = new int[2];
            r1Var2.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.B.getWindowVisibleDisplayFrame(rect);
            if (this.C == 1) {
            }
            boolean z10 = i10 == 1;
            this.C = i10;
            if (i17 >= 26) {
                j2Var.B = view;
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
                    j2Var.f = width;
                    j2Var.v = true;
                    j2Var.s = true;
                    j2Var.k(i11);
                }
                width = i12 - m9;
                j2Var.f = width;
                j2Var.v = true;
                j2Var.s = true;
                j2Var.k(i11);
            } else if (z10) {
                width = i12 + m9;
                j2Var.f = width;
                j2Var.v = true;
                j2Var.s = true;
                j2Var.k(i11);
            } else {
                m9 = view.getWidth();
                width = i12 - m9;
                j2Var.f = width;
                j2Var.v = true;
                j2Var.s = true;
                j2Var.k(i11);
            }
        } else {
            if (this.D) {
                j2Var.f = this.F;
            }
            if (this.E) {
                j2Var.k(this.G);
            }
            Rect rect2 = this.a;
            j2Var.J = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new e(j2Var, lVar, this.C));
        j2Var.g();
        r1 r1Var3 = j2Var.c;
        r1Var3.setOnKeyListener(this);
        if (eVar == null && this.I && lVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(lVar.m);
            r1Var3.addHeaderView(frameLayout, null, false);
            j2Var.g();
        }
    }
}
