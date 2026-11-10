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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class e2 implements l.b0 {
    public static final Method P;
    public static final Method Q;
    public static final Method R;
    public c5.h D;
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
    public boolean w;
    public final int d = -2;
    public int e = -2;
    public final int n = 1002;
    public int x = 0;
    public final int y = ConnectionsManager.DEFAULT_DATACENTER_ID;
    public final b2 G = new b2(this, 1);
    public final c2 I = new c2(this);
    public final Rect L = new Rect();

    static {
        int i7 = Build.VERSION.SDK_INT;
        Class cls = Boolean.TYPE;
        if (i7 <= 28) {
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

    public e2(Context context, AttributeSet attributeSet, int i7) {
        int resourceId;
        int i10 = 0;
        this.H = new d2(this, i10);
        this.J = new b2(this, i10);
        this.a = context;
        this.K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.o, i7, 0);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.r = true;
        }
        obtainStyledAttributes.recycle();
        y yVar = new y(context, attributeSet, i7, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f.a.s, i7, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            yVar.setOverlapAnchor(obtainStyledAttributes2.getBoolean(2, false));
        }
        yVar.setBackgroundDrawable((!obtainStyledAttributes2.hasValue(0) || (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) == 0) ? obtainStyledAttributes2.getDrawable(0) : b5.a.b(context, resourceId));
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

    public final void c(int i7) {
        this.f = i7;
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
        int i7;
        int a10;
        int paddingBottom;
        s1 s1Var;
        s1 s1Var2 = this.c;
        Context context = this.a;
        y yVar = this.O;
        if (s1Var2 == null) {
            s1 o4 = o(context, !this.N);
            this.c = o4;
            o4.setAdapter(this.b);
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
            int i10 = rect.top;
            i7 = rect.bottom + i10;
            if (!this.r) {
                this.h = -i10;
            }
        } else {
            rect.setEmpty();
            i7 = 0;
        }
        boolean z9 = yVar.getInputMethodMode() == 2;
        View view = this.E;
        int i11 = this.h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = Q;
            if (method != null) {
                try {
                    a10 = ((Integer) method.invoke(yVar, view, Integer.valueOf(i11), Boolean.valueOf(z9))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a10 = yVar.getMaxAvailableHeight(view, i11);
        } else {
            a10 = z1.a(yVar, view, i11, z9);
        }
        int i12 = this.d;
        if (i12 == -1) {
            paddingBottom = a10 + i7;
        } else {
            int i13 = this.e;
            int a11 = this.c.a(i13 != -2 ? i13 != -1 ? View.MeasureSpec.makeMeasureSpec(i13, TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_30) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), TLObject.FLAG_31), a10);
            paddingBottom = a11 + (a11 > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i7 : 0);
        }
        boolean z10 = yVar.getInputMethodMode() == 2;
        yVar.setWindowLayoutType(this.n);
        if (yVar.isShowing()) {
            View view2 = this.E;
            WeakHashMap weakHashMap = r0.i0.a;
            if (view2.isAttachedToWindow()) {
                int i14 = this.e;
                if (i14 == -1) {
                    i14 = -1;
                } else if (i14 == -2) {
                    i14 = this.E.getWidth();
                }
                if (i12 == -1) {
                    i12 = z10 ? paddingBottom : -1;
                    if (z10) {
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
                View view3 = this.E;
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
            i19 = this.E.getWidth();
        }
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = paddingBottom;
        }
        yVar.setWidth(i19);
        yVar.setHeight(i12);
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
        if (this.w) {
            yVar.setOverlapAnchor(this.s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = R;
            if (method3 != null) {
                try {
                    method3.invoke(yVar, this.M);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            a2.a(yVar, this.M);
        }
        yVar.showAsDropDown(this.E, this.f, this.h, this.x);
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

    public final void j(int i7) {
        this.h = i7;
        this.r = true;
    }

    public final int m() {
        if (this.r) {
            return this.h;
        }
        return 0;
    }

    public void n(ListAdapter listAdapter) {
        c5.h hVar = this.D;
        if (hVar == null) {
            this.D = new c5.h(this, 2);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(hVar);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.D);
        }
        s1 s1Var = this.c;
        if (s1Var != null) {
            s1Var.setAdapter(this.b);
        }
    }

    public s1 o(Context context, boolean z9) {
        return new s1(context, z9);
    }

    public final void p(int i7) {
        Drawable background = this.O.getBackground();
        if (background == null) {
            this.e = i7;
            return;
        }
        Rect rect = this.L;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i7;
    }
}
