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
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import v7.q7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class e2 implements l.b0 {
    public static final Method P;
    public static final Method Q;
    public static final Method R;
    public View E;
    public AdapterView.OnItemClickListener F;
    public final d2 H;
    public final b2 J;
    public final Handler K;
    public Rect M;
    public boolean N;
    public final y O;
    public final Context a;
    public ListAdapter b;
    public s1 c;
    public int f;
    public int h;
    public boolean r;
    public boolean s;
    public boolean v;
    public h1.a y;
    public final int d = -2;
    public int e = -2;
    public final int n = 1002;
    public int w = 0;
    public final int x = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public final b2 G = new b2(this, 1);
    public final c2 I = new c2(this);
    public final Rect L = new Rect();

    static {
        int i10 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i10 <= 28) {
            try {
                P = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                R = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                Q = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public e2(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        int i11 = 0;
        this.H = new d2(this, i11);
        this.J = new b2(this, i11);
        this.a = context;
        this.K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.o, i10, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r = true;
        }
        obtainStyledAttributes.recycle();
        y yVar = new y(context, attributeSet, i10, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.s, i10, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            yVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : q7.b(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.O = yVar;
        yVar.setInputMethodMode(1);
    }

    @Override // l.b0
    public final boolean a() {
        return this.O.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void c(int i10) {
        this.f = i10;
    }

    @Override // l.b0
    public final void dismiss() {
        y yVar = this.O;
        yVar.dismiss();
        yVar.setContentView(null);
        this.c = null;
        this.K.removeCallbacks(this.G);
    }

    public final Drawable e() {
        return this.O.getBackground();
    }

    @Override // l.b0
    public final s1 f() {
        return this.c;
    }

    @Override // l.b0
    public final void g() {
        int i10;
        int a2;
        int paddingBottom;
        s1 s1Var;
        s1 s1Var2 = this.c;
        Context context = this.a;
        y yVar = this.O;
        if (s1Var2 == null) {
            s1 p5 = p(context, !this.N);
            this.c = p5;
            p5.setAdapter(this.b);
            this.c.setOnItemClickListener(this.F);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new y1(this, 0));
            this.c.setOnScrollListener(this.I);
            yVar.setContentView(this.c);
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.L;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.r) {
                this.h = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        boolean z10 = yVar.getInputMethodMode() == 2;
        View view = this.E;
        int i12 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = Q;
            if (method != null) {
                try {
                    a2 = ((Integer) method.invoke(yVar, view, Integer.valueOf(i12), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = yVar.getMaxAvailableHeight(view, i12);
        } else {
            a2 = z1.a(yVar, view, i12, z10);
        }
        int i13 = this.d;
        if (i13 == -1) {
            paddingBottom = a2 + i10;
        } else {
            int i14 = this.e;
            int a10 = this.c.a(i14 != -2 ? i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_31), a2);
            paddingBottom = a10 + (a10 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i10 : 0);
        }
        boolean z11 = yVar.getInputMethodMode() == 2;
        yVar.setWindowLayoutType(this.n);
        if (yVar.isShowing()) {
            View view2 = this.E;
            WeakHashMap weakHashMap = r0.i0.a;
            if (view2.isAttachedToWindow()) {
                int i15 = this.e;
                if (i15 == -1) {
                    i15 = -1;
                } else if (i15 == -2) {
                    i15 = this.E.getWidth();
                }
                if (i13 == -1) {
                    i13 = z11 ? paddingBottom : -1;
                    if (z11) {
                        yVar.setWidth(this.e == -1 ? -1 : 0);
                        yVar.setHeight(0);
                    } else {
                        yVar.setWidth(this.e == -1 ? -1 : 0);
                        yVar.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = paddingBottom;
                }
                yVar.setOutsideTouchable(true);
                View view3 = this.E;
                int i16 = i15;
                int i17 = this.f;
                int i18 = this.h;
                int i19 = i16 < 0 ? -1 : i16;
                if (i13 < 0) {
                    i13 = -1;
                }
                yVar.update(view3, i17, i18, i19, i13);
                return;
            }
            return;
        }
        int i20 = this.e;
        if (i20 == -1) {
            i20 = -1;
        } else if (i20 == -2) {
            i20 = this.E.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = paddingBottom;
        }
        yVar.setWidth(i20);
        yVar.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = P;
            if (method2 != null) {
                try {
                    method2.invoke(yVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            a2.b(yVar, true);
        }
        yVar.setOutsideTouchable(true);
        yVar.setTouchInterceptor(this.H);
        if (this.v) {
            yVar.setOverlapAnchor(this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = R;
            if (method3 != null) {
                try {
                    method3.invoke(yVar, this.M);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            a2.a(yVar, this.M);
        }
        yVar.showAsDropDown(this.E, this.f, this.h, this.w);
        this.c.setSelection(-1);
        if ((!this.N || this.c.isInTouchMode()) && (s1Var = this.c) != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
        }
        if (this.N) {
            return;
        }
        this.K.post(this.J);
    }

    public final void i(Drawable drawable) {
        this.O.setBackgroundDrawable(drawable);
    }

    public final void j(int i10) {
        this.h = i10;
        this.r = true;
    }

    public final int n() {
        if (this.r) {
            return this.h;
        }
        return 0;
    }

    public void o(ListAdapter listAdapter) {
        h1.a aVar = this.y;
        if (aVar == null) {
            this.y = new h1.a(this, 1);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(aVar);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.y);
        }
        s1 s1Var = this.c;
        if (s1Var != null) {
            s1Var.setAdapter(this.b);
        }
    }

    public s1 p(Context context, boolean z10) {
        return new s1(context, z10);
    }

    public final void r(int i10) {
        Drawable background = this.O.getBackground();
        if (background == null) {
            this.e = i10;
            return;
        }
        Rect rect = this.L;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i10;
    }
}
