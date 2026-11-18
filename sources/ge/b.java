package ge;

import c8.n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class b {
    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final /* synthetic */ b[] f;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        a = bVar;
        b bVar2 = new b("BLOCKING", 1);
        b = bVar2;
        b bVar3 = new b("PARKING", 2);
        c = bVar3;
        b bVar4 = new b("DORMANT", 3);
        d = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        e = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f = bVarArr;
        n1.a(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f.clone();
    }
}
