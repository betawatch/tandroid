// default package

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class j6f {
    public static SharedPreferences a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            sharedPreferences = a;
            if (sharedPreferences == null) {
                sharedPreferences = (SharedPreferences) v5f.a(new tg7(context, (byte) 4));
                a = sharedPreferences;
            }
        }
        return sharedPreferences;
    }
}
