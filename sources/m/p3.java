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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static p3 w;
    public static p3 x;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final o3 d;
    public final o3 e;
    public int f;
    public int h;
    public q3 n;
    public boolean r;
    public boolean s;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.o3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.o3] */
    public p3(View view, CharSequence charSequence) {
        final int i7 = 0;
        this.d = new Runnable(this) { // from class: m.o3
            public final /* synthetic */ p3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
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
        this.e = new Runnable(this) { // from class: m.o3
            public final /* synthetic */ p3 b;

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

    public static void b(p3 p3Var) {
        p3 p3Var2 = w;
        if (p3Var2 != null) {
            p3Var2.a.removeCallbacks(p3Var2.d);
        }
        w = p3Var;
        if (p3Var != null) {
            p3Var.a.postDelayed(p3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p3 p3Var = x;
        View view = this.a;
        if (p3Var == this) {
            x = null;
            q3 q3Var = this.n;
            if (q3Var != null) {
                View view2 = (View) q3Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) q3Var.a).getSystemService("window")).removeView(view2);
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

    public final void c(boolean z9) {
        int height;
        int i7;
        int i10;
        boolean z10;
        int i11;
        int i12;
        long longPressTimeout;
        long j3;
        long j10;
        WeakHashMap weakHashMap = r0.i0.a;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            p3 p3Var = x;
            if (p3Var != null) {
                p3Var.a();
            }
            x = this;
            this.r = z9;
            Context context = view.getContext();
            q3 q3Var = new q3();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            q3Var.d = layoutParams;
            q3Var.e = new Rect();
            q3Var.f = new int[2];
            q3Var.g = new int[2];
            q3Var.a = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            q3Var.b = inflate;
            q3Var.c = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(q3.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) q3Var.b;
            Context context2 = (Context) q3Var.a;
            this.n = q3Var;
            int i13 = this.f;
            int i14 = this.h;
            boolean z11 = this.r;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) q3Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) q3Var.c).setText(this.b);
            int[] iArr = (int[]) q3Var.g;
            int[] iArr2 = (int[]) q3Var.f;
            Rect rect = (Rect) q3Var.e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i13 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i7 = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i7 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
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
                    i10 = i7;
                    z10 = z11;
                    i11 = 0;
                    i12 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i12 = 1;
                    i10 = i7;
                    z10 = z11;
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
                if (z10) {
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
                j10 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i12) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j10 = j3 - longPressTimeout;
            }
            o3 o3Var = this.e;
            view.removeCallbacks(o3Var);
            view.postDelayed(o3Var, j10);
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
                    int y10 = (int) motionEvent.getY();
                    if (!this.s) {
                        int abs = Math.abs(x10 - this.f);
                        int i7 = this.c;
                        if (abs <= i7) {
                        }
                    }
                    this.f = x10;
                    this.h = y10;
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
