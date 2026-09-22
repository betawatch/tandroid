package l;

import ai.u2;
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
import m.f2;
import m.g2;
import m.j2;
import m.r1;
import org.telegram.messenger.beta.R;
import r0.i0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class e extends s implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public View E;
    public int F;
    public boolean G;
    public boolean H;
    public int I;
    public int J;
    public boolean L;
    public w M;
    public ViewTreeObserver N;
    public PopupWindow.OnDismissListener O;
    public boolean P;
    public final Context b;
    public final int c;
    public final int d;
    public final boolean e;
    public final Handler f;
    public final androidx.mediarouter.app.j r;
    public final k2.u v;
    public View y;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final u2 s = new u2(this, 2);
    public int w = 0;
    public int x = 0;
    public boolean K = false;

    public e(Context context, View view, int i10, boolean z10) {
        this.r = new androidx.mediarouter.app.j(this, r1);
        this.v = new k2.u(this, r1);
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

    @Override // l.b0
    public final boolean a() {
        ArrayList arrayList = this.n;
        return arrayList.size() > 0 && ((d) arrayList.get(0)).a.O.isShowing();
    }

    @Override // l.x
    public final boolean c() {
        return false;
    }

    @Override // l.x
    public final void d() {
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
    public final void dismiss() {
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        if (size > 0) {
            d[] dVarArr = (d[]) arrayList.toArray(new d[size]);
            for (int i10 = size - 1; i10 >= 0; i10--) {
                d dVar = dVarArr[i10];
                if (dVar.a.O.isShowing()) {
                    dVar.a.dismiss();
                }
            }
        }
    }

    @Override // l.x
    public final void e(w wVar) {
        this.M = wVar;
    }

    @Override // l.b0
    public final r1 f() {
        ArrayList arrayList = this.n;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((d) hg.c.h(1, arrayList)).a.c;
    }

    @Override // l.x
    public final void g(k kVar, boolean z10) {
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
        j2 j2Var = dVar.a;
        m.x xVar = j2Var.O;
        kVar2.r(this);
        if (this.P) {
            if (Build.VERSION.SDK_INT >= 23) {
                f2.b(xVar, null);
            }
            xVar.setAnimationStyle(0);
        }
        j2Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.F = ((d) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.y;
            WeakHashMap weakHashMap = i0.a;
            this.F = view.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z10) {
                ((d) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        w wVar = this.M;
        if (wVar != null) {
            wVar.g(kVar, true);
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

    @Override // l.b0
    public final void h() {
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
        w wVar = this.M;
        if (wVar != null) {
            wVar.v(d0Var);
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
            WeakHashMap weakHashMap = i0.a;
            this.x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.s
    public final void o(boolean z10) {
        this.K = z10;
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
            if (!dVar.a.O.isShowing()) {
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
            WeakHashMap weakHashMap = i0.a;
            this.x = Gravity.getAbsoluteGravity(i10, view.getLayoutDirection());
        }
    }

    @Override // l.s
    public final void q(int i10) {
        this.G = true;
        this.I = i10;
    }

    @Override // l.s
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.O = onDismissListener;
    }

    @Override // l.s
    public final void s(boolean z10) {
        this.L = z10;
    }

    @Override // l.s
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
    public final void u(k kVar) {
        boolean z10;
        char c10;
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
        if (!a() && this.K) {
            hVar2.c = true;
        } else if (a()) {
            int size = kVar.f.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z10 = false;
                    break;
                }
                MenuItem item = kVar.getItem(i14);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i14++;
            }
            hVar2.c = z10;
        }
        int m10 = s.m(hVar2, context, this.c);
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
        j2Var.n(hVar2);
        j2Var.p(m10);
        j2Var.w = this.x;
        ArrayList arrayList = this.n;
        if (arrayList.size() > 0) {
            dVar = (d) hg.c.h(1, arrayList);
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
                c10 = 0;
            } else {
                r1 r1Var = dVar.a.c;
                ListAdapter adapter = r1Var.getAdapter();
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
                c10 = 0;
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
                view = (i16 != -1 && (firstVisiblePosition = (i16 + i13) - r1Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < r1Var.getChildCount()) ? r1Var.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c10 = 0;
            view = null;
            dVar = null;
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
            r1 r1Var2 = ((d) hg.c.h(1, arrayList)).a.c;
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
                    j2Var.j(i11);
                }
                width = i12 - m10;
                j2Var.f = width;
                j2Var.v = true;
                j2Var.s = true;
                j2Var.j(i11);
            } else if (z11) {
                width = i12 + m10;
                j2Var.f = width;
                j2Var.v = true;
                j2Var.s = true;
                j2Var.j(i11);
            } else {
                m10 = view.getWidth();
                width = i12 - m10;
                j2Var.f = width;
                j2Var.v = true;
                j2Var.s = true;
                j2Var.j(i11);
            }
        } else {
            if (this.G) {
                j2Var.f = this.I;
            }
            if (this.H) {
                j2Var.j(this.J);
            }
            Rect rect2 = this.a;
            j2Var.M = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new d(j2Var, kVar, this.F));
        j2Var.h();
        r1 r1Var3 = j2Var.c;
        r1Var3.setOnKeyListener(this);
        if (dVar == null && this.L && kVar.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) r1Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(kVar.m);
            r1Var3.addHeaderView(frameLayout, null, false);
            j2Var.h();
        }
    }
}
