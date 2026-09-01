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
import j7.s7;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k7.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class d2 implements l.c0 {
    public static final Method M;
    public static final Method N;
    public static final Method O;
    public View B;
    public AdapterView.OnItemClickListener C;
    public final c2 E;
    public final a2 G;
    public final Handler H;
    public Rect J;
    public boolean K;
    public final x L;
    public final Context a;
    public ListAdapter b;
    public r1 c;
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
    public final a2 D = new a2(this, 1);
    public final b2 F = new b2(this);
    public final Rect I = new Rect();

    static {
        int i10 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i10 <= 28) {
            try {
                M = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                O = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                N = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public d2(Context context, AttributeSet attributeSet, int i10) {
        int resourceId;
        int i11 = 0;
        this.E = new c2(this, i11);
        this.G = new a2(this, i11);
        this.a = context;
        this.H = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.o, i10, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r = true;
        }
        obtainStyledAttributes.recycle();
        x xVar = new x(context, attributeSet, i10, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.s, i10, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            w7.a(xVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        xVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : s7.b(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.L = xVar;
        xVar.setInputMethodMode(1);
    }

    @Override // l.c0
    public final boolean a() {
        return this.L.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void c(int i10) {
        this.f = i10;
    }

    @Override // l.c0
    public final void dismiss() {
        x xVar = this.L;
        xVar.dismiss();
        xVar.setContentView(null);
        this.c = null;
        this.H.removeCallbacks(this.D);
    }

    public final Drawable e() {
        return this.L.getBackground();
    }

    @Override // l.c0
    public final r1 f() {
        return this.c;
    }

    @Override // l.c0
    public final void g() {
        int i10;
        int a2;
        int paddingBottom;
        r1 r1Var;
        r1 r1Var2 = this.c;
        Context context = this.a;
        x xVar = this.L;
        if (r1Var2 == null) {
            r1 p10 = p(context, !this.K);
            this.c = p10;
            p10.setAdapter(this.b);
            this.c.setOnItemClickListener(this.C);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new x1(this, 0));
            this.c.setOnScrollListener(this.F);
            xVar.setContentView(this.c);
        }
        Drawable background = xVar.getBackground();
        Rect rect = this.I;
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
        boolean z4 = xVar.getInputMethodMode() == 2;
        View view = this.B;
        int i12 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = N;
            if (method != null) {
                try {
                    a2 = ((Integer) method.invoke(xVar, view, Integer.valueOf(i12), Boolean.valueOf(z4))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = xVar.getMaxAvailableHeight(view, i12);
        } else {
            a2 = y1.a(xVar, view, i12, z4);
        }
        int i13 = this.d;
        if (i13 == -1) {
            paddingBottom = a2 + i10;
        } else {
            int i14 = this.e;
            int a10 = this.c.a(i14 != -2 ? i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_31), a2);
            paddingBottom = a10 + (a10 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i10 : 0);
        }
        boolean z10 = xVar.getInputMethodMode() == 2;
        w7.b(xVar, this.n);
        if (xVar.isShowing()) {
            View view2 = this.B;
            WeakHashMap weakHashMap = r0.j0.a;
            if (view2.isAttachedToWindow()) {
                int i15 = this.e;
                if (i15 == -1) {
                    i15 = -1;
                } else if (i15 == -2) {
                    i15 = this.B.getWidth();
                }
                if (i13 == -1) {
                    i13 = z10 ? paddingBottom : -1;
                    if (z10) {
                        xVar.setWidth(this.e == -1 ? -1 : 0);
                        xVar.setHeight(0);
                    } else {
                        xVar.setWidth(this.e == -1 ? -1 : 0);
                        xVar.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = paddingBottom;
                }
                xVar.setOutsideTouchable(true);
                View view3 = this.B;
                int i16 = i15;
                int i17 = this.f;
                int i18 = this.h;
                int i19 = i16 < 0 ? -1 : i16;
                if (i13 < 0) {
                    i13 = -1;
                }
                xVar.update(view3, i17, i18, i19, i13);
                return;
            }
            return;
        }
        int i20 = this.e;
        if (i20 == -1) {
            i20 = -1;
        } else if (i20 == -2) {
            i20 = this.B.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = paddingBottom;
        }
        xVar.setWidth(i20);
        xVar.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = M;
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
        xVar.setTouchInterceptor(this.E);
        if (this.v) {
            w7.a(xVar, this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = O;
            if (method3 != null) {
                try {
                    method3.invoke(xVar, this.J);
                } catch (Exception e6) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e6);
                }
            }
        } else {
            z1.a(xVar, this.J);
        }
        xVar.showAsDropDown(this.B, this.f, this.h, this.w);
        this.c.setSelection(-1);
        if ((!this.K || this.c.isInTouchMode()) && (r1Var = this.c) != null) {
            r1Var.setListSelectionHidden(true);
            r1Var.requestLayout();
        }
        if (this.K) {
            return;
        }
        this.H.post(this.G);
    }

    public final void j(Drawable drawable) {
        this.L.setBackgroundDrawable(drawable);
    }

    public final void k(int i10) {
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
        r1 r1Var = this.c;
        if (r1Var != null) {
            r1Var.setAdapter(this.b);
        }
    }

    public r1 p(Context context, boolean z4) {
        return new r1(context, z4);
    }

    public final void q(int i10) {
        Drawable background = this.L.getBackground();
        if (background == null) {
            this.e = i10;
            return;
        }
        Rect rect = this.I;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i10;
    }
}
