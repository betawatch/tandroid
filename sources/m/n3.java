package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static n3 w;
    public static n3 x;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final m3 d;
    public final m3 e;
    public int f;
    public int h;
    public o3 n;
    public boolean r;
    public boolean s;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.m3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.m3] */
    public n3(View view, CharSequence charSequence) {
        final int i3 = 0;
        this.d = new Runnable(this) { // from class: m.m3
            public final /* synthetic */ n3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        this.b.c(false);
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        };
        final int i10 = 1;
        this.e = new Runnable(this) { // from class: m.m3
            public final /* synthetic */ n3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.b.c(false);
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        };
        this.a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = r0.j0.a;
        this.c = Build.VERSION.SDK_INT >= 28 ? d1.f.o(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(n3 n3Var) {
        n3 n3Var2 = w;
        if (n3Var2 != null) {
            n3Var2.a.removeCallbacks(n3Var2.d);
        }
        w = n3Var;
        if (n3Var != null) {
            n3Var.a.postDelayed(n3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        n3 n3Var = x;
        View view = this.a;
        if (n3Var == this) {
            x = null;
            o3 o3Var = this.n;
            if (o3Var != null) {
                View view2 = (View) o3Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) o3Var.a).getSystemService("window")).removeView(view2);
                }
                this.n = null;
                this.s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (w == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z10) {
        int height;
        int i3;
        int i10;
        boolean z11;
        int i11;
        int i12;
        long longPressTimeout;
        long j10;
        long j11;
        WeakHashMap weakHashMap = r0.i0.a;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            n3 n3Var = x;
            if (n3Var != null) {
                n3Var.a();
            }
            x = this;
            this.r = z10;
            Context context = view.getContext();
            o3 o3Var = new o3();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            o3Var.d = layoutParams;
            o3Var.e = new Rect();
            o3Var.f = new int[2];
            o3Var.g = new int[2];
            o3Var.a = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            o3Var.b = inflate;
            o3Var.c = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(o3.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) o3Var.b;
            Context context2 = (Context) o3Var.a;
            this.n = o3Var;
            int i13 = this.f;
            int i14 = this.h;
            boolean z12 = this.r;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) o3Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) o3Var.c).setText(this.b);
            int[] iArr = (int[]) o3Var.g;
            int[] iArr2 = (int[]) o3Var.f;
            Rect rect = (Rect) o3Var.e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i13 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i3 = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i3 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z12 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i15 = i13;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                i12 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = i3;
                    z11 = z12;
                    i11 = 0;
                    i12 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i12 = 1;
                    i10 = i3;
                    z11 = z12;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i16 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i16;
                iArr2[i12] = iArr2[i12] - iArr[i12];
                layoutParams2.x = (i16 + i15) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i17 = iArr2[i12];
                int i18 = ((i17 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i19 = i17 + height + dimensionPixelOffset3;
                if (z11) {
                    if (i18 >= 0) {
                        layoutParams2.y = i18;
                    } else {
                        layoutParams2.y = i19;
                    }
                } else if (measuredHeight + i19 <= rect.height()) {
                    layoutParams2.y = i19;
                } else {
                    layoutParams2.y = i18;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.r) {
                j11 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i12) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            m3 m3Var = this.e;
            view.removeCallbacks(m3Var);
            view.postDelayed(m3Var, j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if (java.lang.Math.abs(r5 - r3.h) <= r2) goto L30;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.n == null || !this.r) {
            View view2 = this.a;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.s = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.n == null) {
                    int x10 = (int) motionEvent.getX();
                    int y9 = (int) motionEvent.getY();
                    if (!this.s) {
                        int abs = Math.abs(x10 - this.f);
                        int i3 = this.c;
                        if (abs <= i3) {
                        }
                    }
                    this.f = x10;
                    this.h = y9;
                    this.s = false;
                    b(this);
                }
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
