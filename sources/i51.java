// default package

import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class i51 {
    public static final String c;
    public static final Set d;
    public static final i51 e;
    public static final i51 f;
    public final String a;
    public final String b;

    static {
        String a = lue.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = a;
        String a2 = lue.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a3 = lue.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new s24("proto"), new s24("json"))));
        e = new i51(a, null);
        f = new i51(a2, a3);
    }

    public i51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static i51 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            w26.j("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split("\\Q\\\\E", 2);
        if (split.length != 2) {
            w26.j("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            w26.j("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new i51(str2, str3.isEmpty() ? null : str3);
    }
}
