// default package

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
