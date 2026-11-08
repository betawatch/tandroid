package gb;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class j implements pa.f {
    public static final j b;
    public static final j c;
    public static final j d;
    public static final /* synthetic */ j[] e;
    public final int a;

    static {
        j jVar = new j("COLLECTION_UNKNOWN", 0, 0);
        j jVar2 = new j("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        b = jVar2;
        j jVar3 = new j("COLLECTION_ENABLED", 2, 2);
        c = jVar3;
        j jVar4 = new j("COLLECTION_DISABLED", 3, 3);
        d = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, new j("COLLECTION_DISABLED_REMOTE", 4, 4), new j("COLLECTION_SAMPLED", 5, 5)};
        e = jVarArr;
        c8.j1.a(jVarArr);
    }

    public j(String str, int i7, int i10) {
        this.a = i10;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) e.clone();
    }

    @Override // pa.f
    public final int a() {
        return this.a;
    }
}
