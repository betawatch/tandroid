package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.R$id;

/* loaded from: classes.dex */
public abstract class ViewGroupCompat {
    private static final WindowInsets CONSUMED = WindowInsetsCompat.CONSUMED.toWindowInsets();
    static boolean sCompatInsetsDispatchInstalled = false;

    public static boolean isTransitionGroup(ViewGroup viewGroup) {
        return Api21Impl.isTransitionGroup(viewGroup);
    }

    static WindowInsets dispatchApplyWindowInsets(View view, WindowInsets windowInsets) {
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        Object tag = view.getTag(R$id.tag_on_apply_window_listener);
        Object tag2 = view.getTag(R$id.tag_window_insets_animation_callback);
        if (tag instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag;
        } else {
            onApplyWindowInsetsListener = tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        }
        final WindowInsets[] windowInsetsArr = new WindowInsets[1];
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewGroupCompat$$ExternalSyntheticLambda0
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return ViewGroupCompat.$r8$lambda$Lnvt8czxDhWTdEYEcOIJD_YU-AE(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(R$id.tag_compat_insets_dispatch);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                dispatchApplyWindowInsets(viewGroup.getChildAt(i), windowInsetsArr[0]);
            }
        }
        return windowInsetsArr[0];
    }

    public static /* synthetic */ WindowInsets $r8$lambda$Lnvt8czxDhWTdEYEcOIJD_YU-AE(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets;
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        } else {
            onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        }
        windowInsetsArr[0] = onApplyWindowInsets;
        return CONSUMED;
    }

    static class Api21Impl {
        static boolean isTransitionGroup(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }
}
