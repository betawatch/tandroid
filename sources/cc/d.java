package cc;

import java.nio.charset.Charset;
import java.util.HashMap;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public enum d {
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
    EF437(new int[]{27, qs.A2}, "US-ASCII"),
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
        for (d dVar : values()) {
            if (Charset.isSupported(dVar.name())) {
                for (int i7 : dVar.a) {
                    c.put(Integer.valueOf(i7), dVar);
                }
                d.put(dVar.name(), dVar);
                for (String str : dVar.b) {
                    d.put(str, dVar);
                }
            }
        }
    }

    d(int i7, String... strArr) {
        this.a = new int[]{i7};
        this.b = strArr;
    }

    d(int[] iArr, String... strArr) {
        this.a = iArr;
        this.b = strArr;
    }
}
