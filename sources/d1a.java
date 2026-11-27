// default package

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class d1a extends PopupWindow {
    public static final Field c;
    public static final f8 d = new f8();
    public final ViewTreeObserver.OnScrollChangedListener a;
    public ViewTreeObserver b;

    static {
        Field field = null;
        try {
            field = PopupWindow.class.getDeclaredField("mOnScrollChangedListener");
            field.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        c = field;
    }

    public d1a(n1a n1aVar) {
        super(n1aVar, -2, -2);
        setFocusable(true);
        setAnimationStyle(0);
        setOutsideTouchable(true);
        setClippingEnabled(true);
        setInputMethodMode(0);
        setSoftInputMode(4);
        Field field = c;
        if (field != null) {
            try {
                this.a = (ViewTreeObserver.OnScrollChangedListener) field.get(this);
                field.set(this, d);
            } catch (Exception unused) {
                this.a = null;
            }
        }
    }

    public final void a() {
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        layoutParams.flags |= 2;
        layoutParams.dimAmount = 0.2f;
        windowManager.updateViewLayout(rootView, layoutParams);
    }

    public final /* synthetic */ void b() {
        super.dismiss();
    }

    public final void c(View view) {
        if (getContentView() instanceof n1a) {
            ((n1a) getContentView()).r(new c1a(this, (byte) 0));
        }
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.a;
        if (onScrollChangedListener != null) {
            ViewTreeObserver viewTreeObserver = view.getWindowToken() != null ? view.getViewTreeObserver() : null;
            ViewTreeObserver viewTreeObserver2 = this.b;
            if (viewTreeObserver != viewTreeObserver2) {
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    this.b.removeOnScrollChangedListener(onScrollChangedListener);
                }
                this.b = viewTreeObserver;
                if (viewTreeObserver != null) {
                    viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
                }
            }
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (!(getContentView() instanceof n1a)) {
            super.dismiss();
            return;
        }
        n1a n1aVar = (n1a) getContentView();
        byte b = 1;
        c1a c1aVar = new c1a(this, (byte) 1);
        Integer num = n1aVar.a2;
        if (num != null) {
            n1a.e2.put(num, n1aVar.s0.d0());
        }
        ValueAnimator valueAnimator = n1aVar.X1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            n1aVar.X1 = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        n1aVar.X1 = ofFloat;
        ofFloat.addUpdateListener(new pz9(n1aVar, b));
        n1aVar.X1.addListener(new wd8(n1aVar, c1aVar, (byte) 14));
        n1aVar.X1.setDuration(200L);
        n1aVar.X1.setInterpolator(k43.h);
        n1aVar.X1.start();
        e0a e0aVar = n1aVar.g0;
        if (e0aVar != null) {
            hl.t1(e0aVar.h);
        }
        View rootView = getContentView().getRootView();
        WindowManager windowManager = (WindowManager) getContentView().getContext().getSystemService("window");
        if (rootView.getLayoutParams() == null || !(rootView.getLayoutParams() instanceof WindowManager.LayoutParams)) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) rootView.getLayoutParams();
        try {
            int i = layoutParams.flags;
            if ((i & 2) != 0) {
                layoutParams.flags = i & (-3);
                layoutParams.dimAmount = 0.0f;
                windowManager.updateViewLayout(rootView, layoutParams);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view) {
        super.showAsDropDown(view);
        c(view);
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        super.showAtLocation(view, i, i2, i3);
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.a;
        if (onScrollChangedListener == null || (viewTreeObserver = this.b) == null) {
            return;
        }
        if (viewTreeObserver.isAlive()) {
            this.b.removeOnScrollChangedListener(onScrollChangedListener);
        }
        this.b = null;
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
        c(view);
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
        c(view);
    }
}
