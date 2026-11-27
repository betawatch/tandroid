// default package

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class bs2 {
    public static void A(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
    }

    public static void B(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
        sQLiteDatabase.executeFast(str3).stepThis().dispose();
        sQLiteDatabase.executeFast(str4).stepThis().dispose();
    }

    public static void C(jr3 jr3Var, jr3 jr3Var2) {
        if (jr3Var != jr3Var2) {
            if (jr3Var2 != null) {
                jr3Var2.d(null);
            }
            if (jr3Var != null) {
                jr3Var.c(null);
            }
        }
    }

    public static boolean a(int i, int i2, int i3) {
        switch (i) {
            case 1:
                if (((i2 + i3) & 1) != 0) {
                }
                break;
            case 2:
                if ((i2 & 1) != 0) {
                }
                break;
            case 3:
                if (i3 % 3 == 0) {
                }
                break;
            case 4:
                if ((i2 + i3) % 3 == 0) {
                }
                break;
            case 5:
                if ((((i3 / 3) + (i2 / 2)) & 1) != 0) {
                }
                break;
            case 6:
                if ((i2 * i3) % 6 == 0) {
                }
                break;
            case 7:
                if ((i2 * i3) % 6 < 3) {
                }
                break;
            default:
                if (((((i2 * i3) % 3) + i2 + i3) & 1) != 0) {
                }
                break;
        }
        return true;
    }

    public static cs2 b() {
        cs2 cs2Var = new cs2();
        cs2Var.f = TLObject.FLAG_31;
        cs2Var.g = ConnectionsManager.DEFAULT_DATACENTER_ID;
        return cs2Var;
    }

    public static fs2 c() {
        fs2 fs2Var = new fs2();
        fs2Var.e = Long.MIN_VALUE;
        fs2Var.f = Long.MAX_VALUE;
        return fs2Var;
    }

    public static hs2 d() {
        hs2 hs2Var = new hs2();
        hs2Var.d = Collections.EMPTY_SET;
        return hs2Var;
    }

    public static ns2 e() {
        return new ns2();
    }

    public static hs2 f() {
        return new hs2();
    }

    public static hs2 g() {
        hs2 hs2Var = new hs2();
        hs2Var.d = Collections.EMPTY_SET;
        return hs2Var;
    }

    public static /* synthetic */ byte h(int i) {
        byte b = 1;
        if (i != 1) {
            b = 2;
            if (i != 2) {
                b = 3;
                if (i != 3) {
                    if (i == 4) {
                        return (byte) 4;
                    }
                    throw null;
                }
            }
        }
        return b;
    }

    public static float i(float f, float f2, float f3, float f4) {
        return (f * f2) + f3 + f4;
    }

    public static int j(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int k(int i, int i2, ArrayList arrayList) {
        return i2 - (arrayList.size() + i);
    }

    public static Bundle l(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        return bundle;
    }

    public static LinearLayout m(Activity activity, int i) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(i);
        return linearLayout;
    }

    public static String n(int i, int i2, String str) {
        return str.substring(i2, str.length() - i);
    }

    public static String o(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static StringBuilder p(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void q() {
    }

    public static void r(float f, int i, int i2, TextView textView, String str) {
        textView.setTextSize(i, f);
        textView.setText(ob6.M0(i2, str));
    }

    public static void s(gk3 gk3Var, int i, ArrayList arrayList) {
        arrayList.add(new ek3(gk3Var, i));
    }

    public static void t(TextView textView, int i, float f) {
        textView.setTextSize(i, f);
        textView.setTypeface(hl.o());
    }

    public static /* synthetic */ void u(Object obj) {
        if (obj == null) {
            return;
        }
        grb.o();
    }

    public static void v(String str, int i, d31 d31Var, int i2, int i3) {
        d31Var.Q(i2, i3, ob6.M0(i, str)).j();
    }

    public static void w(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void x(StringBuilder sb, String str, String str2) {
        sb.append(str);
        Log.d(str2, sb.toString());
    }

    public static void y(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
    }

    public static void z(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        sQLiteDatabase.executeFast(str).stepThis().dispose();
        sQLiteDatabase.executeFast(str2).stepThis().dispose();
    }
}
