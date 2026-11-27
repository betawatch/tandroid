// default package

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class nte {
    public static ContextThemeWrapper a(Context context, boolean z) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, g(context, !z ? R.attr.dialogTheme : R.attr.alertDialogTheme));
        return g(contextThemeWrapper, R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, e(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int b(Context context) {
        return vm2.g(-1, f(context, R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static float c(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable a = yqd.a(context, obtainStyledAttributes.getResourceId(0, 0));
        if (h(context)) {
            a.setTint(context.getColor(R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return a;
    }

    public static int e(Context context) {
        return h(context) ? b(context) == -570425344 ? R.style.Theme_MediaRouter_Light : R.style.Theme_MediaRouter_Light_DarkControlPanel : b(context) == -570425344 ? R.style.Theme_MediaRouter_LightControlPanel : R.style.Theme_MediaRouter;
    }

    public static int f(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int g(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
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
            progressBar.getIndeterminateDrawable().setColorFilter(context.getColor(h(context) ? R.color.mr_cast_progressbar_progress_and_thumb_light : R.color.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }
}
