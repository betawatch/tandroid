package db;

import b8.zc;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements oa.f {
    public static final m b;
    public static final /* synthetic */ m[] c;
    public final int a;

    static {
        m mVar = new m("EVENT_TYPE_UNKNOWN", 0, 0);
        m mVar2 = new m("SESSION_START", 1, 1);
        b = mVar2;
        m[] mVarArr = {mVar, mVar2};
        c = mVarArr;
        zc.a(mVarArr);
    }

    public m(String str, int i3, int i10) {
        this.a = i10;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) c.clone();
    }

    @Override // oa.f
    public final int a() {
        return this.a;
    }
}
