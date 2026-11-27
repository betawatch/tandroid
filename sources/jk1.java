// default package

import java.nio.charset.Charset;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public enum jk1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF12(new int[]{0, 2}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    EF31(new int[]{1, 3}, "ISO-8859-1"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45(4, "ISO-8859-2"),
    /* JADX INFO: Fake field, exist only in values array */
    EF59(5, "ISO-8859-3"),
    /* JADX INFO: Fake field, exist only in values array */
    EF73(6, "ISO-8859-4"),
    /* JADX INFO: Fake field, exist only in values array */
    EF87(7, "ISO-8859-5"),
    /* JADX INFO: Fake field, exist only in values array */
    EF106(8, "ISO-8859-6"),
    /* JADX INFO: Fake field, exist only in values array */
    EF125(9, "ISO-8859-7"),
    /* JADX INFO: Fake field, exist only in values array */
    EF144(10, "ISO-8859-8"),
    /* JADX INFO: Fake field, exist only in values array */
    EF163(11, "ISO-8859-9"),
    /* JADX INFO: Fake field, exist only in values array */
    EF180(12, "ISO-8859-10"),
    /* JADX INFO: Fake field, exist only in values array */
    EF197(13, "ISO-8859-11"),
    /* JADX INFO: Fake field, exist only in values array */
    EF218(15, "ISO-8859-13"),
    /* JADX INFO: Fake field, exist only in values array */
    EF237(16, "ISO-8859-14"),
    /* JADX INFO: Fake field, exist only in values array */
    EF256(17, "ISO-8859-15"),
    /* JADX INFO: Fake field, exist only in values array */
    EF277(18, "ISO-8859-16"),
    /* JADX INFO: Fake field, exist only in values array */
    EF296(20, "Shift_JIS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF315(21, "windows-1250"),
    /* JADX INFO: Fake field, exist only in values array */
    EF334(22, "windows-1251"),
    /* JADX INFO: Fake field, exist only in values array */
    EF353(23, "windows-1252"),
    /* JADX INFO: Fake field, exist only in values array */
    EF372(24, "windows-1256"),
    /* JADX INFO: Fake field, exist only in values array */
    EF393(25, "UTF-16BE", "UnicodeBig"),
    /* JADX INFO: Fake field, exist only in values array */
    EF412(26, "UTF-8"),
    /* JADX INFO: Fake field, exist only in values array */
    EF437(new int[]{27, jn7.z2}, "US-ASCII"),
    /* JADX INFO: Fake field, exist only in values array */
    EF457(new int[]{28}, new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    EF480(29, "GB2312", "EUC_CN", "GBK"),
    /* JADX INFO: Fake field, exist only in values array */
    EF499(30, "EUC-KR");

    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public final int[] a;
    public final String[] b;

    static {
        for (jk1 jk1Var : values()) {
            if (Charset.isSupported(jk1Var.name())) {
                for (int i : jk1Var.a) {
                    c.put(Integer.valueOf(i), jk1Var);
                }
                d.put(jk1Var.name(), jk1Var);
                for (String str : jk1Var.b) {
                    d.put(str, jk1Var);
                }
            }
        }
    }

    jk1(int i, String... strArr) {
        this.a = new int[]{i};
        this.b = strArr;
    }

    public static jk1 a(Charset charset) {
        return (jk1) d.get(charset.name());
    }

    jk1(int[] iArr, String... strArr) {
        this.a = iArr;
        this.b = strArr;
    }
}
