package a8;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class a7 {
    public static int a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z9 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z9 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i7 = typedValue.type;
        if (i7 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i7 != 6) {
                return -2;
            }
            int i10 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i10, i10);
        }
        return (int) fraction;
    }
}
