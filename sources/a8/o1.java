package a8;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class o1 {
    public static int a(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z10 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i10 = typedValue.type;
        if (i10 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i10 != 6) {
                return -2;
            }
            int i11 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i11, i11);
        }
        return (int) fraction;
    }
}
