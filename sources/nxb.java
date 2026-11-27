// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class nxb implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static nxb w;
    public static nxb x;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final mxb d;
    public final mxb e;
    public int f;
    public int h;
    public oxb n;
    public boolean r;
    public boolean s;

    /* JADX WARN: Type inference failed for: r0v0, types: [mxb] */
    /* JADX WARN: Type inference failed for: r0v1, types: [mxb] */
    public nxb(View view, CharSequence charSequence) {
        final byte b = 0;
        this.d = new Runnable(this) { // from class: mxb
            public final /* synthetic */ nxb b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b2 = b;
                nxb nxbVar = this.b;
                switch (b2) {
                    case 0:
                        nxbVar.c(false);
                        break;
                    default:
                        nxbVar.a();
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.e = new Runnable(this) { // from class: mxb
            public final /* synthetic */ nxb b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                byte b22 = b2;
                nxb nxbVar = this.b;
                switch (b22) {
                    case 0:
                        nxbVar.c(false);
                        break;
                    default:
                        nxbVar.a();
                        break;
                }
            }
        };
        this.a = view;
        this.b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = jhc.a;
        this.c = Build.VERSION.SDK_INT >= 28 ? go.q(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.s = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(nxb nxbVar) {
        nxb nxbVar2 = w;
        if (nxbVar2 != null) {
            nxbVar2.a.removeCallbacks(nxbVar2.d);
        }
        w = nxbVar;
        if (nxbVar != null) {
            nxbVar.a.postDelayed(nxbVar.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        nxb nxbVar = x;
        View view = this.a;
        if (nxbVar == this) {
            x = null;
            oxb oxbVar = this.n;
            if (oxbVar != null) {
                View view2 = (View) oxbVar.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) oxbVar.a).getSystemService("window")).removeView(view2);
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

    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        WeakHashMap weakHashMap = ihc.a;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            b(null);
            nxb nxbVar = x;
            if (nxbVar != null) {
                nxbVar.a();
            }
            x = this;
            this.r = z;
            Context context = view.getContext();
            oxb oxbVar = new oxb();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            oxbVar.d = layoutParams;
            oxbVar.e = new Rect();
            oxbVar.f = new int[2];
            oxbVar.h = new int[2];
            oxbVar.a = context;
            View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            oxbVar.b = inflate;
            oxbVar.c = (TextView) inflate.findViewById(R.id.message);
            layoutParams.setTitle(oxb.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) oxbVar.b;
            Context context2 = (Context) oxbVar.a;
            this.n = oxbVar;
            int i5 = this.f;
            int i6 = this.h;
            boolean z3 = this.r;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) oxbVar.d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) oxbVar.c).setText(this.b);
            int[] iArr = (int[]) oxbVar.h;
            int[] iArr2 = (int[]) oxbVar.f;
            Rect rect = (Rect) oxbVar.e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i5 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i6 + dimensionPixelOffset2;
                i = i6 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i7 = i5;
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
                i4 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i2 = i;
                    z2 = z3;
                    i3 = 0;
                    i4 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i4 = 1;
                    i2 = i;
                    z2 = z3;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i8 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i8;
                iArr2[i4] = iArr2[i4] - iArr[i4];
                layoutParams2.x = (i8 + i7) - (rootView.getWidth() / 2);
                view2.measure(i3, i3);
                int measuredHeight = view2.getMeasuredHeight();
                int i9 = iArr2[i4];
                int i10 = ((i9 + i2) - dimensionPixelOffset3) - measuredHeight;
                int i11 = i9 + height + dimensionPixelOffset3;
                if (z2) {
                    if (i10 >= 0) {
                        layoutParams2.y = i10;
                    } else {
                        layoutParams2.y = i11;
                    }
                } else if (measuredHeight + i11 <= rect.height()) {
                    layoutParams2.y = i11;
                } else {
                    layoutParams2.y = i10;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.r) {
                j2 = 2500;
            } else {
                if ((view.getWindowSystemUiVisibility() & 1) == i4) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = 15000;
                }
                j2 = j - longPressTimeout;
            }
            mxb mxbVar = this.e;
            view.removeCallbacks(mxbVar);
            view.postDelayed(mxbVar, j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (java.lang.Math.abs(r5 - r3.h) <= r2) goto L27;
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
                    int x2 = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.s) {
                        int abs = Math.abs(x2 - this.f);
                        int i = this.c;
                        if (abs <= i) {
                        }
                    }
                    this.f = x2;
                    this.h = y;
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
