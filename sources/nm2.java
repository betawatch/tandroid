// default package

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class nm2 {
    public static final nm2 a;
    public static final HashMap b;
    public static final /* synthetic */ nm2[] c;

    /* JADX INFO: Fake field, exist only in values array */
    nm2 EF0;

    static {
        nm2 nm2Var = new nm2("X86_32", 0);
        nm2 nm2Var2 = new nm2("X86_64", 1);
        nm2 nm2Var3 = new nm2("ARM_UNKNOWN", 2);
        nm2 nm2Var4 = new nm2("PPC", 3);
        nm2 nm2Var5 = new nm2("PPC64", 4);
        nm2 nm2Var6 = new nm2("ARMV6", 5);
        nm2 nm2Var7 = new nm2("ARMV7", 6);
        nm2 nm2Var8 = new nm2("UNKNOWN", 7);
        a = nm2Var8;
        nm2 nm2Var9 = new nm2("ARMV7S", 8);
        nm2 nm2Var10 = new nm2("ARM64", 9);
        c = new nm2[]{nm2Var, nm2Var2, nm2Var3, nm2Var4, nm2Var5, nm2Var6, nm2Var7, nm2Var8, nm2Var9, nm2Var10};
        HashMap hashMap = new HashMap(4);
        b = hashMap;
        hashMap.put("armeabi-v7a", nm2Var7);
        hashMap.put("armeabi", nm2Var6);
        hashMap.put("arm64-v8a", nm2Var10);
        hashMap.put("x86", nm2Var);
    }

    public static nm2 valueOf(String str) {
        return (nm2) Enum.valueOf(nm2.class, str);
    }

    public static nm2[] values() {
        return (nm2[]) c.clone();
    }
}
