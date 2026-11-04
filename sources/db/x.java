package db;

import b8.zc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x implements oa.f {
    public static final x b;
    public static final /* synthetic */ x[] c;
    public final int a;

    static {
        x xVar = new x("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        x xVar2 = new x("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        x xVar3 = new x("LOG_ENVIRONMENT_STAGING", 2, 2);
        x xVar4 = new x("LOG_ENVIRONMENT_PROD", 3, 3);
        b = xVar4;
        x[] xVarArr = {xVar, xVar2, xVar3, xVar4};
        c = xVarArr;
        zc.a(xVarArr);
    }

    public x(String str, int i3, int i10) {
        this.a = i10;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) c.clone();
    }

    @Override // oa.f
    public final int a() {
        return this.a;
    }
}
