// default package

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class lyc {
    public static final lyc a;
    public static final lyc b;
    public static final lyc c;
    public static final lyc d;
    public static final lyc e;
    public static final lyc f;
    public static final lyc h;
    public static final lyc n;
    public static final lyc r;
    public static final /* synthetic */ lyc[] s;

    static {
        lyc lycVar = new lyc("INT", 0);
        a = lycVar;
        lyc lycVar2 = new lyc("LONG", 1);
        b = lycVar2;
        lyc lycVar3 = new lyc("FLOAT", 2);
        c = lycVar3;
        lyc lycVar4 = new lyc("DOUBLE", 3);
        d = lycVar4;
        lyc lycVar5 = new lyc("BOOLEAN", 4);
        e = lycVar5;
        lyc lycVar6 = new lyc("STRING", 5);
        f = lycVar6;
        f51 f51Var = f51.c;
        lyc lycVar7 = new lyc("BYTE_STRING", 6);
        h = lycVar7;
        lyc lycVar8 = new lyc("ENUM", 7);
        n = lycVar8;
        lyc lycVar9 = new lyc("MESSAGE", 8);
        r = lycVar9;
        s = new lyc[]{lycVar, lycVar2, lycVar3, lycVar4, lycVar5, lycVar6, lycVar7, lycVar8, lycVar9};
    }

    public static lyc valueOf(String str) {
        return (lyc) Enum.valueOf(lyc.class, str);
    }

    public static lyc[] values() {
        return (lyc[]) s.clone();
    }
}
