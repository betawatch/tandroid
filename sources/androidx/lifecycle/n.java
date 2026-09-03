package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n {
    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final /* synthetic */ n[] f;

    static {
        n nVar = new n("DESTROYED", 0);
        a = nVar;
        n nVar2 = new n("INITIALIZED", 1);
        b = nVar2;
        n nVar3 = new n("CREATED", 2);
        c = nVar3;
        n nVar4 = new n("STARTED", 3);
        d = nVar4;
        n nVar5 = new n("RESUMED", 4);
        e = nVar5;
        f = new n[]{nVar, nVar2, nVar3, nVar4, nVar5};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f.clone();
    }
}
