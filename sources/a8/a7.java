package a8;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
