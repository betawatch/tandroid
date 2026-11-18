package gb;

import c8.n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class y implements pa.f {
    public static final y b;
    public static final /* synthetic */ y[] c;
    public final int a;

    static {
        y yVar = new y("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
        y yVar2 = new y("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
        y yVar3 = new y("LOG_ENVIRONMENT_STAGING", 2, 2);
        y yVar4 = new y("LOG_ENVIRONMENT_PROD", 3, 3);
        b = yVar4;
        y[] yVarArr = {yVar, yVar2, yVar3, yVar4};
        c = yVarArr;
        n1.a(yVarArr);
    }

    public y(String str, int i7, int i10) {
        this.a = i10;
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) c.clone();
    }

    @Override // pa.f
    public final int a() {
        return this.a;
    }
}
