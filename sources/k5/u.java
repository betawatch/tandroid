package k5;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class u {
    public static final SparseArray a;
    public static final /* synthetic */ u[] b;

    /* JADX INFO: Fake field, exist only in values array */
    u EF0;

    static {
        u uVar = new u("MOBILE", 0);
        u uVar2 = new u("WIFI", 1);
        u uVar3 = new u("MOBILE_MMS", 2);
        u uVar4 = new u("MOBILE_SUPL", 3);
        u uVar5 = new u("MOBILE_DUN", 4);
        u uVar6 = new u("MOBILE_HIPRI", 5);
        u uVar7 = new u("WIMAX", 6);
        u uVar8 = new u("BLUETOOTH", 7);
        u uVar9 = new u("DUMMY", 8);
        u uVar10 = new u("ETHERNET", 9);
        u uVar11 = new u("MOBILE_FOTA", 10);
        u uVar12 = new u("MOBILE_IMS", 11);
        u uVar13 = new u("MOBILE_CBS", 12);
        u uVar14 = new u("WIFI_P2P", 13);
        u uVar15 = new u("MOBILE_IA", 14);
        u uVar16 = new u("MOBILE_EMERGENCY", 15);
        u uVar17 = new u("PROXY", 16);
        u uVar18 = new u("VPN", 17);
        u uVar19 = new u("NONE", 18);
        b = new u[]{uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14, uVar15, uVar16, uVar17, uVar18, uVar19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, uVar);
        sparseArray.put(1, uVar2);
        sparseArray.put(2, uVar3);
        sparseArray.put(3, uVar4);
        sparseArray.put(4, uVar5);
        sparseArray.put(5, uVar6);
        sparseArray.put(6, uVar7);
        sparseArray.put(7, uVar8);
        sparseArray.put(8, uVar9);
        sparseArray.put(9, uVar10);
        sparseArray.put(10, uVar11);
        sparseArray.put(11, uVar12);
        sparseArray.put(12, uVar13);
        sparseArray.put(13, uVar14);
        sparseArray.put(14, uVar15);
        sparseArray.put(15, uVar16);
        sparseArray.put(16, uVar17);
        sparseArray.put(17, uVar18);
        sparseArray.put(-1, uVar19);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) b.clone();
    }
}
