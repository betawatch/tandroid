package m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import b8.oc;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d2 implements l.b0 {
    public static final Method Q;
    public static final Method R;
    public static final Method S;
    public b5.i E;
    public View F;
    public AdapterView.OnItemClickListener G;
    public final c2 I;
    public final a2 K;
    public final Handler L;
    public Rect N;
    public boolean O;
    public final x P;
    public final Context a;
    public ListAdapter b;
    public r1 c;
    public int f;
    public int h;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int d = -2;
    public int e = -2;
    public final int n = 1002;
    public int x = 0;
    public final int y = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public final a2 H = new a2(this, 1);
    public final b2 J = new b2(this);
    public final Rect M = new Rect();

    static {
        int i3 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i3 <= 28) {
            try {
                Q = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                S = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                R = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public d2(Context context, AttributeSet attributeSet, int i3) {
        int resourceId;
        int i10 = 0;
        this.I = new c2(this, i10);
        this.K = new a2(this, i10);
        this.a = context;
        this.L = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.o, i3, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r = true;
        }
        obtainStyledAttributes.recycle();
        x xVar = new x(context, attributeSet, i3, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.s, i3, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            xVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        xVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : oc.b(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.P = xVar;
        xVar.setInputMethodMode(1);
    }

    @Override // l.b0
    public final boolean a() {
        return this.P.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void c(int i3) {
        this.f = i3;
    }

    @Override // l.b0
    public final void dismiss() {
        x xVar = this.P;
        xVar.dismiss();
        xVar.setContentView(null);
        this.c = null;
        this.L.removeCallbacks(this.H);
    }

    @Override // l.b0
    public final r1 f() {
        return this.c;
    }

    @Override // l.b0
    public final void g() {
        int i3;
        int a10;
        int paddingBottom;
        r1 r1Var;
        r1 r1Var2 = this.c;
        Context context = this.a;
        x xVar = this.P;
        if (r1Var2 == null) {
            r1 p10 = p(context, !this.O);
            this.c = p10;
            p10.setAdapter(this.b);
            this.c.setOnItemClickListener(this.G);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new x1(this, 0));
            this.c.setOnScrollListener(this.J);
            xVar.setContentView(this.c);
        }
        Drawable background = xVar.getBackground();
        Rect rect = this.M;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i3 = rect.bottom + i10;
            if (!this.r) {
                this.h = -i10;
            }
        } else {
            rect.setEmpty();
            i3 = 0;
        }
        boolean z10 = xVar.getInputMethodMode() == 2;
        View view = this.F;
        int i11 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = R;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(xVar, view, Integer.valueOf(i11), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = xVar.getMaxAvailableHeight(view, i11);
        } else {
            a10 = y1.a(xVar, view, i11, z10);
        }
        int i12 = this.d;
        if (i12 == -1) {
            paddingBottom = a10 + i3;
        } else {
            int i13 = this.e;
            int a11 = this.c.a(i13 != -2 ? i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_31), a10);
            paddingBottom = a11 + (a11 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i3 : 0);
        }
        boolean z11 = xVar.getInputMethodMode() == 2;
        xVar.setWindowLayoutType(this.n);
        if (xVar.isShowing()) {
            View view2 = this.F;
            WeakHashMap weakHashMap = r0.i0.a;
            if (view2.isAttachedToWindow()) {
                int i14 = this.e;
                if (i14 == -1) {
                    i14 = -1;
                } else if (i14 == -2) {
                    i14 = this.F.getWidth();
                }
                if (i12 == -1) {
                    i12 = z11 ? paddingBottom : -1;
                    if (z11) {
                        xVar.setWidth(this.e == -1 ? -1 : 0);
                        xVar.setHeight(0);
                    } else {
                        xVar.setWidth(this.e == -1 ? -1 : 0);
                        xVar.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                xVar.setOutsideTouchable(true);
                View view3 = this.F;
                int i15 = i14;
                int i16 = this.f;
                int i17 = this.h;
                int i18 = i15 < 0 ? -1 : i15;
                if (i12 < 0) {
                    i12 = -1;
                }
                xVar.update(view3, i16, i17, i18, i12);
                return;
            }
            return;
        }
        int i19 = this.e;
        if (i19 == -1) {
            i19 = -1;
        } else if (i19 == -2) {
            i19 = this.F.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        xVar.setWidth(i19);
        xVar.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Q;
            if (method2 != null) {
                try {
                    method2.invoke(xVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            z1.b(xVar, true);
        }
        xVar.setOutsideTouchable(true);
        xVar.setTouchInterceptor(this.I);
        if (this.w) {
            xVar.setOverlapAnchor(this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = S;
            if (method3 != null) {
                try {
                    method3.invoke(xVar, this.N);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            z1.a(xVar, this.N);
        }
        xVar.showAsDropDown(this.F, this.f, this.h, this.x);
        this.c.setSelection(-1);
        if ((!this.O || this.c.isInTouchMode()) && (r1Var = this.c) != null) {
            r1Var.setListSelectionHidden(true);
            r1Var.requestLayout();
        }
        if (this.O) {
            return;
        }
        this.L.post(this.K);
    }

    public final Drawable h() {
        return this.P.getBackground();
    }

    public final void j(Drawable drawable) {
        this.P.setBackgroundDrawable(drawable);
    }

    public final void k(int i3) {
        this.h = i3;
        this.r = true;
    }

    public final int n() {
        if (this.r) {
            return this.h;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        b5.i iVar = this.E;
        if (iVar == null) {
            this.E = new b5.i(this, 2);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(iVar);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
        r1 r1Var = this.c;
        if (r1Var != null) {
            r1Var.setAdapter(this.b);
        }
    }

    public r1 p(Context context, boolean z10) {
        return new r1(context, z10);
    }

    public final void q(int i3) {
        Drawable background = this.P.getBackground();
        if (background == null) {
            this.e = i3;
            return;
        }
        Rect rect = this.M;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i3;
    }
}
