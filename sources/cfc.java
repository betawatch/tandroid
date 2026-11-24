// default package

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class cfc {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static wzc b(View view, wzc wzcVar, Rect rect) {
        WindowInsets g = wzcVar.g();
        if (g != null) {
            return wzc.h(view, view.computeSystemWindowInsets(g, rect));
        }
        rect.setEmpty();
        return wzcVar;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static void f(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void g(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void h(View view, float f) {
        view.setElevation(f);
    }

    public static void i(View view, qq7 qq7Var) {
        bfc bfcVar = qq7Var != null ? new bfc(view, qq7Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, bfcVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (bfcVar != null) {
            view.setOnApplyWindowInsetsListener(bfcVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void j(View view) {
        view.stopNestedScroll();
    }
}
