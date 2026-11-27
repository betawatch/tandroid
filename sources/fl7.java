// default package

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class fl7 {
    public static final SparseArray a;
    public static final /* synthetic */ fl7[] b;

    /* JADX INFO: Fake field, exist only in values array */
    fl7 EF0;

    static {
        fl7 fl7Var = new fl7("MOBILE", 0);
        fl7 fl7Var2 = new fl7("WIFI", 1);
        fl7 fl7Var3 = new fl7("MOBILE_MMS", 2);
        fl7 fl7Var4 = new fl7("MOBILE_SUPL", 3);
        fl7 fl7Var5 = new fl7("MOBILE_DUN", 4);
        fl7 fl7Var6 = new fl7("MOBILE_HIPRI", 5);
        fl7 fl7Var7 = new fl7("WIMAX", 6);
        fl7 fl7Var8 = new fl7("BLUETOOTH", 7);
        fl7 fl7Var9 = new fl7("DUMMY", 8);
        fl7 fl7Var10 = new fl7("ETHERNET", 9);
        fl7 fl7Var11 = new fl7("MOBILE_FOTA", 10);
        fl7 fl7Var12 = new fl7("MOBILE_IMS", 11);
        fl7 fl7Var13 = new fl7("MOBILE_CBS", 12);
        fl7 fl7Var14 = new fl7("WIFI_P2P", 13);
        fl7 fl7Var15 = new fl7("MOBILE_IA", 14);
        fl7 fl7Var16 = new fl7("MOBILE_EMERGENCY", 15);
        fl7 fl7Var17 = new fl7("PROXY", 16);
        fl7 fl7Var18 = new fl7("VPN", 17);
        fl7 fl7Var19 = new fl7("NONE", 18);
        b = new fl7[]{fl7Var, fl7Var2, fl7Var3, fl7Var4, fl7Var5, fl7Var6, fl7Var7, fl7Var8, fl7Var9, fl7Var10, fl7Var11, fl7Var12, fl7Var13, fl7Var14, fl7Var15, fl7Var16, fl7Var17, fl7Var18, fl7Var19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, fl7Var);
        sparseArray.put(1, fl7Var2);
        sparseArray.put(2, fl7Var3);
        sparseArray.put(3, fl7Var4);
        sparseArray.put(4, fl7Var5);
        sparseArray.put(5, fl7Var6);
        sparseArray.put(6, fl7Var7);
        sparseArray.put(7, fl7Var8);
        sparseArray.put(8, fl7Var9);
        sparseArray.put(9, fl7Var10);
        sparseArray.put(10, fl7Var11);
        sparseArray.put(11, fl7Var12);
        sparseArray.put(12, fl7Var13);
        sparseArray.put(13, fl7Var14);
        sparseArray.put(14, fl7Var15);
        sparseArray.put(15, fl7Var16);
        sparseArray.put(16, fl7Var17);
        sparseArray.put(17, fl7Var18);
        sparseArray.put(-1, fl7Var19);
    }

    public static fl7 valueOf(String str) {
        return (fl7) Enum.valueOf(fl7.class, str);
    }

    public static fl7[] values() {
        return (fl7[]) b.clone();
    }
}
