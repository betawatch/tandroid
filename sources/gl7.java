// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class gl7 {
    public static final SparseArray a;
    public static final /* synthetic */ gl7[] b;

    /* JADX INFO: Fake field, exist only in values array */
    gl7 EF0;

    static {
        gl7 gl7Var = new gl7("MOBILE", 0);
        gl7 gl7Var2 = new gl7("WIFI", 1);
        gl7 gl7Var3 = new gl7("MOBILE_MMS", 2);
        gl7 gl7Var4 = new gl7("MOBILE_SUPL", 3);
        gl7 gl7Var5 = new gl7("MOBILE_DUN", 4);
        gl7 gl7Var6 = new gl7("MOBILE_HIPRI", 5);
        gl7 gl7Var7 = new gl7("WIMAX", 6);
        gl7 gl7Var8 = new gl7("BLUETOOTH", 7);
        gl7 gl7Var9 = new gl7("DUMMY", 8);
        gl7 gl7Var10 = new gl7("ETHERNET", 9);
        gl7 gl7Var11 = new gl7("MOBILE_FOTA", 10);
        gl7 gl7Var12 = new gl7("MOBILE_IMS", 11);
        gl7 gl7Var13 = new gl7("MOBILE_CBS", 12);
        gl7 gl7Var14 = new gl7("WIFI_P2P", 13);
        gl7 gl7Var15 = new gl7("MOBILE_IA", 14);
        gl7 gl7Var16 = new gl7("MOBILE_EMERGENCY", 15);
        gl7 gl7Var17 = new gl7("PROXY", 16);
        gl7 gl7Var18 = new gl7("VPN", 17);
        gl7 gl7Var19 = new gl7("NONE", 18);
        b = new gl7[]{gl7Var, gl7Var2, gl7Var3, gl7Var4, gl7Var5, gl7Var6, gl7Var7, gl7Var8, gl7Var9, gl7Var10, gl7Var11, gl7Var12, gl7Var13, gl7Var14, gl7Var15, gl7Var16, gl7Var17, gl7Var18, gl7Var19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, gl7Var);
        sparseArray.put(1, gl7Var2);
        sparseArray.put(2, gl7Var3);
        sparseArray.put(3, gl7Var4);
        sparseArray.put(4, gl7Var5);
        sparseArray.put(5, gl7Var6);
        sparseArray.put(6, gl7Var7);
        sparseArray.put(7, gl7Var8);
        sparseArray.put(8, gl7Var9);
        sparseArray.put(9, gl7Var10);
        sparseArray.put(10, gl7Var11);
        sparseArray.put(11, gl7Var12);
        sparseArray.put(12, gl7Var13);
        sparseArray.put(13, gl7Var14);
        sparseArray.put(14, gl7Var15);
        sparseArray.put(15, gl7Var16);
        sparseArray.put(16, gl7Var17);
        sparseArray.put(17, gl7Var18);
        sparseArray.put(-1, gl7Var19);
    }

    public static gl7 valueOf(String str) {
        return (gl7) Enum.valueOf(gl7.class, str);
    }

    public static gl7[] values() {
        return (gl7[]) b.clone();
    }
}
