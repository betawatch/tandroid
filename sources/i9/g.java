package i9;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g {
    public static final g a;
    public static final HashMap b;
    public static final /* synthetic */ g[] c;

    /* JADX INFO: Fake field, exist only in values array */
    g EF0;

    static {
        g gVar = new g("X86_32", 0);
        g gVar2 = new g("X86_64", 1);
        g gVar3 = new g("ARM_UNKNOWN", 2);
        g gVar4 = new g("PPC", 3);
        g gVar5 = new g("PPC64", 4);
        g gVar6 = new g("ARMV6", 5);
        g gVar7 = new g("ARMV7", 6);
        g gVar8 = new g("UNKNOWN", 7);
        a = gVar8;
        g gVar9 = new g("ARMV7S", 8);
        g gVar10 = new g("ARM64", 9);
        c = new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10};
        HashMap hashMap = new HashMap(4);
        b = hashMap;
        hashMap.put("armeabi-v7a", gVar7);
        hashMap.put("armeabi", gVar6);
        hashMap.put("arm64-v8a", gVar10);
        hashMap.put("x86", gVar);
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) c.clone();
    }
}
