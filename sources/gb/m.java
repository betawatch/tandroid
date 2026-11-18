package gb;

import c8.n1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class m implements pa.f {
    public static final m b;
    public static final /* synthetic */ m[] c;
    public final int a;

    static {
        m mVar = new m("EVENT_TYPE_UNKNOWN", 0, 0);
        m mVar2 = new m("SESSION_START", 1, 1);
        b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        c = mVarArr;
        n1.a(mVarArr);
    }

    public m(String str, int i7, int i10) {
        this.a = i10;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) c.clone();
    }

    @Override // pa.f
    public final int a() {
        return this.a;
    }
}
