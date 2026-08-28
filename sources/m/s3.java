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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static s3 v;
    public static s3 w;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final r3 d;
    public final r3 e;
    public int f;
    public int h;
    public t3 n;
    public boolean r;
    public boolean s;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.r3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.r3] */
    public s3(View view, CharSequence charSequence) {
        final int i9 = 0;
        this.d = new Runnable(this) { // from class: m.r3
            public final /* synthetic */ s3 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
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
        this.e = new Runnable(this) { // from class: m.r3
            public final /* synthetic */ s3 b;

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
        Method method = r0.k0.a;
        this.c = Build.VERSION.SDK_INT >= 28 ? d1.f.o(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(s3 s3Var) {
        s3 s3Var2 = v;
        if (s3Var2 != null) {
            s3Var2.a.removeCallbacks(s3Var2.d);
        }
        v = s3Var;
        if (s3Var != null) {
            s3Var.a.postDelayed(s3Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        s3 s3Var = w;
        View view = this.a;
        if (s3Var == this) {
            w = null;
            t3 t3Var = this.n;
            if (t3Var != null) {
                View view2 = (View) t3Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) t3Var.a).getSystemService("window")).removeView(view2);
                }
                this.n = null;
                this.s = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (v == this) {
            b(null);
        }
        view.removeCallbacks(this.e);
    }

    public final void c(boolean z10) {
        int height;
        int i9;
        int i10;
        boolean z11;
        int i11;
        char c10;
        long longPressTimeout;
        long j10;
        long j11;
        WeakHashMap weakHashMap = r0.j0.a;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            s3 s3Var = w;
            if (s3Var != null) {
                s3Var.a();
            }
            w = this;
            this.r = z10;
            Context context = view.getContext();
            t3 t3Var = new t3();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            t3Var.d = layoutParams;
            t3Var.e = new Rect();
            t3Var.f = new int[2];
            t3Var.h = new int[2];
            t3Var.a = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            t3Var.b = inflate;
            t3Var.c = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(t3.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) t3Var.b;
            Context context2 = (Context) t3Var.a;
            this.n = t3Var;
            int i12 = this.f;
            int i13 = this.h;
            boolean z12 = this.r;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) t3Var.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) t3Var.c).setText(this.b);
            int[] iArr = (int[]) t3Var.h;
            int[] iArr2 = (int[]) t3Var.f;
            Rect rect = (Rect) t3Var.e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i12 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i13 + dimensionPixelOffset2;
                i9 = i13 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i9 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z12 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i14 = i12;
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
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i10 = i9;
                    z11 = z12;
                    i11 = 0;
                    c10 = 1;
                } else {
                    Resources resources = context2.getResources();
                    c10 = 1;
                    i10 = i9;
                    z11 = z12;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i11 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i15 = iArr2[i11] - iArr[i11];
                iArr2[i11] = i15;
                iArr2[c10] = iArr2[c10] - iArr[c10];
                layoutParams2.x = (i15 + i14) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, i11);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i16 = iArr2[c10];
                int i17 = ((i16 + i10) - dimensionPixelOffset3) - measuredHeight;
                int i18 = i16 + height + dimensionPixelOffset3;
                if (z11) {
                    if (i17 >= 0) {
                        layoutParams2.y = i17;
                    } else {
                        layoutParams2.y = i18;
                    }
                } else if (measuredHeight + i18 <= rect.height()) {
                    layoutParams2.y = i18;
                } else {
                    layoutParams2.y = i17;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.r) {
                j11 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            r3 r3Var = this.e;
            view.removeCallbacks(r3Var);
            view.postDelayed(r3Var, j11);
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
                        int i9 = this.c;
                        if (abs <= i9) {
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
