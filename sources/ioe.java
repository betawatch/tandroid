// default package

import android.content.SharedPreferences;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
