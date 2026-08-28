package f7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class d0 {
    public static ContextThemeWrapper a(Context context, boolean z10) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, g(context, !z10 ? R.attr.dialogTheme : R.attr.alertDialogTheme));
        return g(contextThemeWrapper, R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, e(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int b(Context context, int i9) {
        return i0.a.e(-1, f(context, i9, R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static float c(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable d(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i9});
        Drawable d = q8.d(t7.b(context, obtainStyledAttributes.getResourceId(0, 0)));
        if (h(context)) {
            d.setTint(f0.e.c(context, R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return d;
    }

    public static int e(Context context) {
        return h(context) ? b(context, 0) == -570425344 ? R.style.Theme_MediaRouter_Light : R.style.Theme_MediaRouter_Light_DarkControlPanel : b(context, 0) == -570425344 ? R.style.Theme_MediaRouter_LightControlPanel : R.style.Theme_MediaRouter;
    }

    public static int f(Context context, int i9, int i10) {
        if (i9 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i9, new int[]{i10});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int g(Context context, int i9) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    public static boolean h(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public static void i(Context context, ProgressBar progressBar) {
        if (progressBar.isIndeterminate()) {
            progressBar.getIndeterminateDrawable().setColorFilter(f0.e.c(context, h(context) ? R.color.mr_cast_progressbar_progress_and_thumb_light : R.color.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }
}
