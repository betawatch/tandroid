// default package

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class mr7 implements HostnameVerifier {
    public static final mr7 a = new mr7();
    public static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01af, code lost:
    
        grb.i("Unexpected end of DN: ".concat(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b6, code lost:
    
        return r16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z;
        boolean z2;
        String str2;
        char[] cArr;
        char c;
        char[] cArr2;
        int i;
        char c2;
        boolean z3 = false;
        boolean z4 = true;
        if (b.matcher(str).matches()) {
            List a2 = a(x509Certificate, 7);
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (str.equalsIgnoreCase((String) a2.get(i2))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c3 = 2;
        List a3 = a(x509Certificate, 2);
        int size2 = a3.size();
        int i3 = 0;
        Object[] objArr = false;
        while (i3 < size2) {
            if (c(lowerCase, (String) a3.get(i3))) {
                return true;
            }
            i3++;
            objArr = true;
        }
        if (objArr == false) {
            gp3 gp3Var = new gp3(x509Certificate.getSubjectX500Principal());
            gp3Var.c = 0;
            gp3Var.d = 0;
            gp3Var.e = 0;
            gp3Var.f = 0;
            String str3 = gp3Var.a;
            gp3Var.g = str3.toCharArray();
            String c4 = gp3Var.c();
            String str4 = null;
            if (c4 != null) {
                while (true) {
                    int i4 = gp3Var.c;
                    int i5 = gp3Var.b;
                    if (i4 == i5) {
                        break;
                    }
                    char c5 = gp3Var.g[i4];
                    char c6 = c3;
                    z = z3;
                    if (c5 == '\"') {
                        z2 = z4;
                        int i6 = i4 + 1;
                        gp3Var.c = i6;
                        gp3Var.d = i6;
                        gp3Var.e = i6;
                        while (true) {
                            int i7 = gp3Var.c;
                            if (i7 == i5) {
                                grb.i("Unexpected end of DN: ".concat(str3));
                                return z;
                            }
                            char[] cArr3 = gp3Var.g;
                            char c7 = cArr3[i7];
                            if (c7 == '\"') {
                                gp3Var.c = i7 + 1;
                                while (true) {
                                    int i8 = gp3Var.c;
                                    if (i8 >= i5 || gp3Var.g[i8] != ' ') {
                                        break;
                                    }
                                    gp3Var.c = i8 + 1;
                                }
                                char[] cArr4 = gp3Var.g;
                                int i9 = gp3Var.d;
                                str2 = new String(cArr4, i9, gp3Var.e - i9);
                            } else {
                                int i10 = gp3Var.e;
                                if (c7 == '\\') {
                                    cArr3[i10] = gp3Var.b();
                                } else {
                                    cArr3[i10] = c7;
                                }
                                gp3Var.c++;
                                gp3Var.e++;
                            }
                        }
                    } else if (c5 == '#') {
                        z2 = z4;
                        if (i4 + 4 >= i5) {
                            grb.i("Unexpected end of DN: ".concat(str3));
                            return z;
                        }
                        gp3Var.d = i4;
                        gp3Var.c = i4 + 1;
                        while (true) {
                            int i11 = gp3Var.c;
                            if (i11 == i5 || (c = (cArr = gp3Var.g)[i11]) == '+' || c == ',' || c == ';') {
                                break;
                            }
                            if (c == ' ') {
                                gp3Var.e = i11;
                                gp3Var.c = i11 + 1;
                                while (true) {
                                    int i12 = gp3Var.c;
                                    if (i12 >= i5 || gp3Var.g[i12] != ' ') {
                                        break;
                                    }
                                    gp3Var.c = i12 + 1;
                                }
                            } else {
                                if (c >= 'A' && c <= 'F') {
                                    cArr[i11] = (char) (c + ' ');
                                }
                                gp3Var.c = i11 + 1;
                            }
                        }
                        int i13 = gp3Var.e;
                        int i14 = gp3Var.d;
                        int i15 = i13 - i14;
                        if (i15 < 5 || (i15 & 1) == 0) {
                            break;
                        }
                        int i16 = i15 / 2;
                        byte[] bArr = new byte[i16];
                        int i17 = i14 + 1;
                        for (int i18 = z ? 1 : 0; i18 < i16; i18++) {
                            bArr[i18] = (byte) gp3Var.a(i17);
                            i17 += 2;
                        }
                        str2 = new String(gp3Var.g, gp3Var.d, i15);
                    } else if (c5 == '+' || c5 == ',' || c5 == ';') {
                        z2 = z4;
                        str2 = "";
                    } else {
                        gp3Var.d = i4;
                        gp3Var.e = i4;
                        while (true) {
                            int i19 = gp3Var.c;
                            cArr2 = gp3Var.g;
                            if (i19 >= i5) {
                                int i20 = gp3Var.d;
                                str2 = new String(cArr2, i20, gp3Var.e - i20);
                                z2 = z4;
                                break;
                            }
                            char c8 = cArr2[i19];
                            if (c8 == ' ') {
                                z2 = z4;
                                int i21 = gp3Var.e;
                                gp3Var.f = i21;
                                gp3Var.c = i19 + 1;
                                gp3Var.e = i21 + 1;
                                cArr2[i21] = ' ';
                                while (true) {
                                    i = gp3Var.c;
                                    if (i >= i5) {
                                        break;
                                    }
                                    char[] cArr5 = gp3Var.g;
                                    if (cArr5[i] != ' ') {
                                        break;
                                    }
                                    int i22 = gp3Var.e;
                                    gp3Var.e = i22 + 1;
                                    cArr5[i22] = ' ';
                                    gp3Var.c = i + 1;
                                }
                                if (i == i5 || (c2 = gp3Var.g[i]) == ',' || c2 == '+' || c2 == ';') {
                                    break;
                                }
                                z4 = z2;
                            } else {
                                if (c8 == ';') {
                                    break;
                                }
                                if (c8 == '\\') {
                                    z2 = z4;
                                    int i23 = gp3Var.e;
                                    gp3Var.e = i23 + 1;
                                    cArr2[i23] = gp3Var.b();
                                    gp3Var.c++;
                                } else {
                                    if (c8 == '+' || c8 == ',') {
                                        break;
                                    }
                                    int i24 = gp3Var.e;
                                    z2 = z4;
                                    gp3Var.e = i24 + 1;
                                    cArr2[i24] = c8;
                                    gp3Var.c = i19 + 1;
                                }
                                z4 = z2;
                            }
                        }
                        z2 = z4;
                        int i25 = gp3Var.d;
                        str2 = new String(cArr2, i25, gp3Var.e - i25);
                    }
                    if ("cn".equalsIgnoreCase(c4)) {
                        str4 = str2;
                        break;
                    }
                    int i26 = gp3Var.c;
                    if (i26 >= i5) {
                        break;
                    }
                    char c9 = gp3Var.g[i26];
                    if (c9 != ',' && c9 != ';' && c9 != '+') {
                        grb.i("Malformed DN: ".concat(str3));
                        return z;
                    }
                    gp3Var.c = i26 + 1;
                    c4 = gp3Var.c();
                    if (c4 == null) {
                        grb.i("Malformed DN: ".concat(str3));
                        return z;
                    }
                    c3 = c6;
                    z3 = z ? 1 : 0;
                    z4 = z2;
                }
                return str4 == null ? c(lowerCase, str4) : z;
            }
            z = z3;
            if (str4 == null) {
            }
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        String lowerCase = str2.toLowerCase(Locale.US);
        if (!lowerCase.contains("*")) {
            return str.equals(lowerCase);
        }
        if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
            return false;
        }
        String substring = lowerCase.substring(1);
        if (!str.endsWith(substring)) {
            return false;
        }
        int length = str.length() - substring.length();
        return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
