// default package

import java.net.URI;
import java.security.SecureRandom;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fwc {
    public final f8e a;
    public short b;

    public fwc() {
        f8e f8eVar = new f8e();
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
        this.a = f8eVar;
    }

    public final cwc a(String str) {
        String str2;
        boolean z;
        String str3;
        Matcher matcher;
        Matcher matcher2;
        short s = this.b;
        if (str == null) {
            u36.j("The given URI is null.");
            return null;
        }
        if (s < 0) {
            u36.j("The given timeout value is negative.");
            return null;
        }
        URI create = URI.create(str);
        if (create == null) {
            u36.j("The given URI is null.");
            return null;
        }
        if (s < 0) {
            u36.j("The given timeout value is negative.");
            return null;
        }
        String scheme = create.getScheme();
        String userInfo = create.getUserInfo();
        SecureRandom secureRandom = ag7.a;
        String host = create.getHost();
        if (host == null) {
            String rawAuthority = create.getRawAuthority();
            host = (rawAuthority == null || (matcher2 = Pattern.compile("^(.*@)?([^:]+)(:\\d+)?$").matcher(rawAuthority)) == null || !matcher2.matches()) ? null : matcher2.group(2);
            if (host == null) {
                String uri = create.toString();
                if (uri == null || (matcher = Pattern.compile("^\\w+://([^@/]*@)?([^:/]+)(:\\d+)?(/.*)?$").matcher(uri)) == null || !matcher.matches()) {
                    str2 = null;
                    int port = create.getPort();
                    String rawPath = create.getRawPath();
                    String rawQuery = create.getRawQuery();
                    if (scheme != null || scheme.length() == 0) {
                        u36.j("The scheme part is empty.");
                        return null;
                    }
                    if ("wss".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                        z = true;
                    } else {
                        if (!"ws".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) {
                            u36.j("Bad scheme: ".concat(scheme));
                            return null;
                        }
                        z = false;
                    }
                    if (str2 == null || str2.length() == 0) {
                        u36.j("The host part is empty.");
                        return null;
                    }
                    if (rawPath == null || rawPath.length() == 0) {
                        str3 = "/";
                    } else {
                        if (!rawPath.startsWith("/")) {
                            rawPath = "/".concat(rawPath);
                        }
                        str3 = rawPath;
                    }
                    int i = port >= 0 ? port : z ? 443 : 80;
                    this.a.getClass();
                    ema emaVar = new ema(z ? SSLSocketFactory.getDefault() : SocketFactory.getDefault(), new qa(str2, i), s, null, null);
                    emaVar.d = 1;
                    emaVar.e = (short) 250;
                    emaVar.f = true;
                    if (port >= 0) {
                        str2 = str2 + ":" + port;
                    }
                    if (rawQuery != null) {
                        str3 = kt6.o(str3, "?", rawQuery);
                    }
                    return new cwc(z, userInfo, str2, str3, emaVar);
                }
                host = matcher.group(2);
            }
        }
        str2 = host;
        int port2 = create.getPort();
        String rawPath2 = create.getRawPath();
        String rawQuery2 = create.getRawQuery();
        if (scheme != null) {
        }
        u36.j("The scheme part is empty.");
        return null;
    }
}
