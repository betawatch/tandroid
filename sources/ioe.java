// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class ioe {
    public static void a() {
        SharedPreferences.Editor edit = uc7.e1().edit();
        for (mg5 mg5Var : mg5.values()) {
            edit.remove(mg5Var.a);
        }
        edit.apply();
    }
}
