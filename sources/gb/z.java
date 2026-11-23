package gb;

import c8.h9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class z implements pa.f {
    public static final z b;
    public static final /* synthetic */ z[] c;
    public final int a;

    static {
        z zVar = new z("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        z zVar2 = new z("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        z zVar3 = new z("LOG_ENVIRONMENT_STAGING", 2, 2);
        z zVar4 = new z("LOG_ENVIRONMENT_PROD", 3, 3);
        b = zVar4;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4};
        c = zVarArr;
        h9.a(zVarArr);
    }

    public z(String str, int i7, int i10) {
        this.a = i10;
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) c.clone();
    }

    @Override // pa.f
    public final int a() {
        return this.a;
    }
}
