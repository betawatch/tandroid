package j7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.ProgressBar;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class z {
    public static ContextThemeWrapper a(Context context, boolean z4) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, g(context, !z4 ? R.attr.dialogTheme : R.attr.alertDialogTheme));
        return g(contextThemeWrapper, R.attr.mediaRouteTheme) != 0 ? new ContextThemeWrapper(contextThemeWrapper, e(contextThemeWrapper)) : contextThemeWrapper;
    }

    public static int b(Context context, int i10) {
        return i0.a.e(-1, f(context, i10, R.attr.colorPrimary)) >= 3.0d ? -1 : -570425344;
    }

    public static float c(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    public static Drawable d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        Drawable d = i8.d(r7.b(context, obtainStyledAttributes.getResourceId(0, 0)));
        if (h(context)) {
            d.setTint(f0.f.c(context, R.color.mr_dynamic_dialog_icon_light));
        }
        obtainStyledAttributes.recycle();
        return d;
    }

    public static int e(Context context) {
        return h(context) ? b(context, 0) == -570425344 ? R.style.Theme_MediaRouter_Light : R.style.Theme_MediaRouter_Light_DarkControlPanel : b(context, 0) == -570425344 ? R.style.Theme_MediaRouter_LightControlPanel : R.style.Theme_MediaRouter;
    }

    public static int f(Context context, int i10, int i11) {
        if (i10 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, new int[]{i11});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i11, typedValue, true);
        return typedValue.resourceId != 0 ? context.getResources().getColor(typedValue.resourceId) : typedValue.data;
    }

    public static int g(Context context, int i10) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
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
            progressBar.getIndeterminateDrawable().setColorFilter(f0.f.c(context, h(context) ? R.color.mr_cast_progressbar_progress_and_thumb_light : R.color.mr_cast_progressbar_progress_and_thumb_dark), PorterDuff.Mode.SRC_IN);
        }
    }
}
