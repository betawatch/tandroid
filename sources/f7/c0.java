package f7;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class c0 {
    public static int a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z10 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i9 = typedValue.type;
        if (i9 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i9 != 6) {
                return -2;
            }
            int i10 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i10, i10);
        }
        return (int) fraction;
    }
}
