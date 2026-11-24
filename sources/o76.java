// default package

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
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class o76 implements xia {
    public static final Method Q;
    public static final Method R;
    public static final Method S;
    public n53 E;
    public View F;
    public AdapterView.OnItemClickListener G;
    public final Handler L;
    public Rect N;
    public boolean O;
    public final nq P;
    public final Context a;
    public ListAdapter b;
    public os3 c;
    public int f;
    public int h;
    public boolean r;
    public boolean s;
    public boolean w;
    public final int d = -2;
    public int e = -2;
    public final short n = 1002;
    public int x = 0;
    public final int y = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public final m76 H = new m76(this, 1);
    public final a24 I = new a24(this, 3);
    public final n76 J = new n76(this);
    public final m76 K = new m76(this, 0);
    public final Rect M = new Rect();

    static {
        int i = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i <= 28) {
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

    public o76(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.a = context;
        this.L = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k09.o, i, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r = true;
        }
        obtainStyledAttributes.recycle();
        nq nqVar = new nq(context, attributeSet, i, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, k09.s, i, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            nqVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        nqVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : kod.a(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.P = nqVar;
        nqVar.setInputMethodMode(1);
    }

    @Override // xia
    public final boolean a() {
        return this.P.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void c(int i) {
        this.f = i;
    }

    @Override // xia
    public final void dismiss() {
        nq nqVar = this.P;
        nqVar.dismiss();
        nqVar.setContentView(null);
        this.c = null;
        this.L.removeCallbacks(this.H);
    }

    @Override // xia
    public final os3 e() {
        return this.c;
    }

    @Override // xia
    public final void f() {
        int i;
        int a;
        int paddingBottom;
        os3 os3Var;
        os3 os3Var2 = this.c;
        Context context = this.a;
        nq nqVar = this.P;
        if (os3Var2 == null) {
            os3 o = o(context, !this.O);
            this.c = o;
            o.setAdapter(this.b);
            this.c.setOnItemClickListener(this.G);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new j76(this, (byte) 0));
            this.c.setOnScrollListener(this.J);
            nqVar.setContentView(this.c);
        }
        Drawable background = nqVar.getBackground();
        Rect rect = this.M;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.r) {
                this.h = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        boolean z = nqVar.getInputMethodMode() == 2;
        View view = this.F;
        int i3 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = R;
            if (method != null) {
                try {
                    a = ((Integer) method.invoke(nqVar, view, Integer.valueOf(i3), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a = nqVar.getMaxAvailableHeight(view, i3);
        } else {
            a = k76.a(nqVar, view, i3, z);
        }
        int i4 = this.d;
        if (i4 == -1) {
            paddingBottom = a + i;
        } else {
            int i5 = this.e;
            int a2 = this.c.a(i5 != -2 ? i5 != -1 ? View.MeasureSpec.makeMeasureSpec(i5, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_31), a);
            paddingBottom = a2 + (a2 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z2 = nqVar.getInputMethodMode() == 2;
        nqVar.setWindowLayoutType(this.n);
        if (nqVar.isShowing()) {
            View view2 = this.F;
            WeakHashMap weakHashMap = kfc.a;
            if (view2.isAttachedToWindow()) {
                int i6 = this.e;
                if (i6 == -1) {
                    i6 = -1;
                } else if (i6 == -2) {
                    i6 = this.F.getWidth();
                }
                if (i4 == -1) {
                    i4 = z2 ? paddingBottom : -1;
                    int i7 = this.e;
                    if (z2) {
                        nqVar.setWidth(i7 == -1 ? -1 : 0);
                        nqVar.setHeight(0);
                    } else {
                        nqVar.setWidth(i7 == -1 ? -1 : 0);
                        nqVar.setHeight(-1);
                    }
                } else if (i4 == -2) {
                    i4 = paddingBottom;
                }
                nqVar.setOutsideTouchable(true);
                View view3 = this.F;
                int i8 = i6;
                int i9 = this.f;
                int i10 = this.h;
                int i11 = i8 < 0 ? -1 : i8;
                if (i4 < 0) {
                    i4 = -1;
                }
                nqVar.update(view3, i9, i10, i11, i4);
                return;
            }
            return;
        }
        int i12 = this.e;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.F.getWidth();
        }
        if (i4 == -1) {
            i4 = -1;
        } else if (i4 == -2) {
            i4 = paddingBottom;
        }
        nqVar.setWidth(i12);
        nqVar.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = Q;
            if (method2 != null) {
                try {
                    method2.invoke(nqVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            l76.b(nqVar, true);
        }
        nqVar.setOutsideTouchable(true);
        nqVar.setTouchInterceptor(this.I);
        if (this.w) {
            nqVar.setOverlapAnchor(this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = S;
            if (method3 != null) {
                try {
                    method3.invoke(nqVar, this.N);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            l76.a(nqVar, this.N);
        }
        nqVar.showAsDropDown(this.F, this.f, this.h, this.x);
        this.c.setSelection(-1);
        if ((!this.O || this.c.isInTouchMode()) && (os3Var = this.c) != null) {
            os3Var.setListSelectionHidden(true);
            os3Var.requestLayout();
        }
        if (this.O) {
            return;
        }
        this.L.post(this.K);
    }

    public final Drawable g() {
        return this.P.getBackground();
    }

    public final void i(Drawable drawable) {
        this.P.setBackgroundDrawable(drawable);
    }

    public final void j(int i) {
        this.h = i;
        this.r = true;
    }

    public final int m() {
        if (this.r) {
            return this.h;
        }
        return 0;
    }

    public void n(ListAdapter listAdapter) {
        n53 n53Var = this.E;
        if (n53Var == null) {
            this.E = new n53(this, (byte) 1);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(n53Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.E);
        }
        os3 os3Var = this.c;
        if (os3Var != null) {
            os3Var.setAdapter(this.b);
        }
    }

    public os3 o(Context context, boolean z) {
        return new os3(context, z);
    }

    public final void p(int i) {
        Drawable background = this.P.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.M;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
