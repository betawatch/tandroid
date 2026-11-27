// default package

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class hn2 {
    public static final hn2 a;
    public static final HashMap b;
    public static final /* synthetic */ hn2[] c;

    /* JADX INFO: Fake field, exist only in values array */
    hn2 EF0;

    static {
        hn2 hn2Var = new hn2("X86_32", 0);
        hn2 hn2Var2 = new hn2("X86_64", 1);
        hn2 hn2Var3 = new hn2("ARM_UNKNOWN", 2);
        hn2 hn2Var4 = new hn2("PPC", 3);
        hn2 hn2Var5 = new hn2("PPC64", 4);
        hn2 hn2Var6 = new hn2("ARMV6", 5);
        hn2 hn2Var7 = new hn2("ARMV7", 6);
        hn2 hn2Var8 = new hn2("UNKNOWN", 7);
        a = hn2Var8;
        hn2 hn2Var9 = new hn2("ARMV7S", 8);
        hn2 hn2Var10 = new hn2("ARM64", 9);
        c = new hn2[]{hn2Var, hn2Var2, hn2Var3, hn2Var4, hn2Var5, hn2Var6, hn2Var7, hn2Var8, hn2Var9, hn2Var10};
        HashMap hashMap = new HashMap(4);
        b = hashMap;
        hashMap.put("armeabi-v7a", hn2Var7);
        hashMap.put("armeabi", hn2Var6);
        hashMap.put("arm64-v8a", hn2Var10);
        hashMap.put("x86", hn2Var);
    }

    public static hn2 valueOf(String str) {
        return (hn2) Enum.valueOf(hn2.class, str);
    }

    public static hn2[] values() {
        return (hn2[]) c.clone();
    }
}
