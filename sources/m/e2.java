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
import f7.t7;
import g7.q7;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e2 implements l.b0 {
    public static final Method L;
    public static final Method M;
    public static final Method N;
    public View A;
    public AdapterView.OnItemClickListener B;
    public final d2 D;
    public final b2 F;
    public final Handler G;
    public Rect I;
    public boolean J;
    public final y K;
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
    public final b2 C = new b2(this, 1);
    public final c2 E = new c2(this);
    public final Rect H = new Rect();

    static {
        int i9 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i9 <= 28) {
            try {
                L = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", cls);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                N = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                M = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, cls);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public e2(Context context, AttributeSet attributeSet, int i9) {
        int resourceId;
        int i10 = 0;
        this.D = new d2(this, i10);
        this.F = new b2(this, i10);
        this.a = context;
        this.G = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.o, i9, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r = true;
        }
        obtainStyledAttributes.recycle();
        y yVar = new y(context, attributeSet, i9, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.s, i9, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            q7.a(yVar, obtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : t7.b(context, resourceId));
        obtainStyledAttributes2.recycle();
        this.K = yVar;
        yVar.setInputMethodMode(1);
    }

    @Override // l.b0
    public final boolean a() {
        return this.K.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void c(int i9) {
        this.f = i9;
    }

    @Override // l.b0
    public final void dismiss() {
        y yVar = this.K;
        yVar.dismiss();
        yVar.setContentView(null);
        this.c = null;
        this.G.removeCallbacks(this.C);
    }

    public final Drawable e() {
        return this.K.getBackground();
    }

    @Override // l.b0
    public final s1 f() {
        return this.c;
    }

    @Override // l.b0
    public final void g() {
        int i9;
        int a2;
        int paddingBottom;
        s1 s1Var;
        s1 s1Var2 = this.c;
        Context context = this.a;
        y yVar = this.K;
        if (s1Var2 == null) {
            s1 p6 = p(context, !this.J);
            this.c = p6;
            p6.setAdapter(this.b);
            this.c.setOnItemClickListener(this.B);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new y1(this, 0));
            this.c.setOnScrollListener(this.E);
            yVar.setContentView(this.c);
        }
        Drawable background = yVar.getBackground();
        Rect rect = this.H;
        if (background != null) {
            background.getPadding(rect);
            int i10 = rect.top;
            i9 = rect.bottom + i10;
            if (!this.r) {
                this.h = -i10;
            }
        } else {
            rect.setEmpty();
            i9 = 0;
        }
        boolean z10 = yVar.getInputMethodMode() == 2;
        View view = this.A;
        int i11 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = M;
            if (method != null) {
                try {
                    a2 = ((Integer) method.invoke(yVar, view, Integer.valueOf(i11), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = yVar.getMaxAvailableHeight(view, i11);
        } else {
            a2 = z1.a(yVar, view, i11, z10);
        }
        int i12 = this.d;
        if (i12 == -1) {
            paddingBottom = a2 + i9;
        } else {
            int i13 = this.e;
            int a3 = this.c.a(i13 != -2 ? i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_31), a2);
            paddingBottom = a3 + (a3 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i9 : 0);
        }
        boolean z11 = yVar.getInputMethodMode() == 2;
        q7.b(yVar, this.n);
        if (yVar.isShowing()) {
            View view2 = this.A;
            WeakHashMap weakHashMap = r0.j0.a;
            if (view2.isAttachedToWindow()) {
                int i14 = this.e;
                if (i14 == -1) {
                    i14 = -1;
                } else if (i14 == -2) {
                    i14 = this.A.getWidth();
                }
                if (i12 == -1) {
                    i12 = z11 ? paddingBottom : -1;
                    if (z11) {
                        yVar.setWidth(this.e == -1 ? -1 : 0);
                        yVar.setHeight(0);
                    } else {
                        yVar.setWidth(this.e == -1 ? -1 : 0);
                        yVar.setHeight(-1);
                    }
                } else if (i12 == -2) {
                    i12 = paddingBottom;
                }
                yVar.setOutsideTouchable(true);
                View view3 = this.A;
                int i15 = i14;
                int i16 = this.f;
                int i17 = this.h;
                int i18 = i15 < 0 ? -1 : i15;
                if (i12 < 0) {
                    i12 = -1;
                }
                yVar.update(view3, i16, i17, i18, i12);
                return;
            }
            return;
        }
        int i19 = this.e;
        if (i19 == -1) {
            i19 = -1;
        } else if (i19 == -2) {
            i19 = this.A.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        yVar.setWidth(i19);
        yVar.setHeight(i12);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = L;
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
        yVar.setTouchInterceptor(this.D);
        if (this.v) {
            q7.a(yVar, this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = N;
            if (method3 != null) {
                try {
                    method3.invoke(yVar, this.I);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            a2.a(yVar, this.I);
        }
        yVar.showAsDropDown(this.A, this.f, this.h, this.w);
        this.c.setSelection(-1);
        if ((!this.J || this.c.isInTouchMode()) && (s1Var = this.c) != null) {
            s1Var.setListSelectionHidden(true);
            s1Var.requestLayout();
        }
        if (this.J) {
            return;
        }
        this.G.post(this.F);
    }

    public final void i(Drawable drawable) {
        this.K.setBackgroundDrawable(drawable);
    }

    public final void j(int i9) {
        this.h = i9;
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

    public final void q(int i9) {
        Drawable background = this.K.getBackground();
        if (background == null) {
            this.e = i9;
            return;
        }
        Rect rect = this.H;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i9;
    }
}
