package oc;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m implements HostnameVerifier {
    public static final m a = new m();
    public static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    public static List a(X509Certificate x509Certificate, int i3) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i3 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c2, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
    
        r4 = r5.d;
        r8 = new java.lang.String(r10, r4, r5.e - r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(String str, X509Certificate x509Certificate) {
        boolean z10;
        boolean z11;
        String str2;
        int i3;
        char[] cArr;
        char c2;
        int i10;
        char c10;
        boolean z12 = false;
        boolean z13 = true;
        if (b.matcher(str).matches()) {
            List a10 = a(x509Certificate, 7);
            int size = a10.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (str.equalsIgnoreCase((String) a10.get(i11))) {
                    return true;
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        char c11 = 2;
        List a11 = a(x509Certificate, 2);
        int size2 = a11.size();
        int i12 = 0;
        Object[] objArr = false;
        while (i12 < size2) {
            if (c(lowerCase, (String) a11.get(i12))) {
                return true;
            }
            i12++;
            objArr = true;
        }
        if (objArr == false) {
            e eVar = new e(x509Certificate.getSubjectX500Principal());
            eVar.c = 0;
            eVar.d = 0;
            eVar.e = 0;
            eVar.f = 0;
            String str3 = eVar.a;
            eVar.g = str3.toCharArray();
            String c12 = eVar.c();
            String str4 = null;
            if (c12 != null) {
                while (true) {
                    int i13 = eVar.c;
                    int i14 = eVar.b;
                    if (i13 == i14) {
                        break;
                    }
                    char c13 = eVar.g[i13];
                    char c14 = c11;
                    z10 = z12;
                    if (c13 == '\"') {
                        z11 = z13;
                        int i15 = i13 + 1;
                        eVar.c = i15;
                        eVar.d = i15;
                        eVar.e = i15;
                        while (true) {
                            int i16 = eVar.c;
                            if (i16 == i14) {
                                throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                            }
                            char[] cArr2 = eVar.g;
                            char c15 = cArr2[i16];
                            if (c15 == '\"') {
                                eVar.c = i16 + 1;
                                while (true) {
                                    int i17 = eVar.c;
                                    if (i17 >= i14 || eVar.g[i17] != ' ') {
                                        break;
                                    }
                                    eVar.c = i17 + 1;
                                }
                                char[] cArr3 = eVar.g;
                                int i18 = eVar.d;
                                str2 = new String(cArr3, i18, eVar.e - i18);
                            } else {
                                if (c15 == '\\') {
                                    cArr2[eVar.e] = eVar.b();
                                } else {
                                    cArr2[eVar.e] = c15;
                                }
                                eVar.c++;
                                eVar.e++;
                            }
                        }
                    } else if (c13 == '#') {
                        z11 = z13;
                        if (i13 + 4 >= i14) {
                            throw new IllegalStateException("Unexpected end of DN: ".concat(str3));
                        }
                        eVar.d = i13;
                        eVar.c = i13 + 1;
                        while (true) {
                            i3 = eVar.c;
                            if (i3 == i14 || (c2 = (cArr = eVar.g)[i3]) == '+' || c2 == ',' || c2 == ';') {
                                break;
                            }
                            if (c2 == ' ') {
                                eVar.e = i3;
                                eVar.c = i3 + 1;
                                while (true) {
                                    int i19 = eVar.c;
                                    if (i19 >= i14 || eVar.g[i19] != ' ') {
                                        break;
                                    }
                                    eVar.c = i19 + 1;
                                }
                            } else {
                                if (c2 >= 'A' && c2 <= 'F') {
                                    cArr[i3] = (char) (c2 + ' ');
                                }
                                eVar.c = i3 + 1;
                            }
                        }
                        eVar.e = i3;
                        int i20 = eVar.e;
                        int i21 = eVar.d;
                        int i22 = i20 - i21;
                        if (i22 < 5 || (i22 & 1) == 0) {
                            break;
                        }
                        int i23 = i22 / 2;
                        byte[] bArr = new byte[i23];
                        int i24 = i21 + 1;
                        for (int i25 = z10 ? 1 : 0; i25 < i23; i25++) {
                            bArr[i25] = (byte) eVar.a(i24);
                            i24 += 2;
                        }
                        str2 = new String(eVar.g, eVar.d, i22);
                    } else if (c13 == '+' || c13 == ',' || c13 == ';') {
                        z11 = z13;
                        str2 = "";
                    } else {
                        eVar.d = i13;
                        eVar.e = i13;
                        while (true) {
                            int i26 = eVar.c;
                            if (i26 >= i14) {
                                char[] cArr4 = eVar.g;
                                int i27 = eVar.d;
                                str2 = new String(cArr4, i27, eVar.e - i27);
                                z11 = z13;
                                break;
                            }
                            char[] cArr5 = eVar.g;
                            char c16 = cArr5[i26];
                            if (c16 == ' ') {
                                z11 = z13;
                                int i28 = eVar.e;
                                eVar.f = i28;
                                eVar.c = i26 + 1;
                                eVar.e = i28 + 1;
                                cArr5[i28] = ' ';
                                while (true) {
                                    i10 = eVar.c;
                                    if (i10 >= i14) {
                                        break;
                                    }
                                    char[] cArr6 = eVar.g;
                                    if (cArr6[i10] != ' ') {
                                        break;
                                    }
                                    int i29 = eVar.e;
                                    eVar.e = i29 + 1;
                                    cArr6[i29] = ' ';
                                    eVar.c = i10 + 1;
                                }
                                if (i10 == i14 || (c10 = eVar.g[i10]) == ',' || c10 == '+' || c10 == ';') {
                                    break;
                                }
                                z13 = z11;
                            } else {
                                if (c16 == ';') {
                                    break;
                                }
                                if (c16 == '\\') {
                                    z11 = z13;
                                    int i30 = eVar.e;
                                    eVar.e = i30 + 1;
                                    cArr5[i30] = eVar.b();
                                    eVar.c++;
                                } else {
                                    if (c16 == '+' || c16 == ',') {
                                        break;
                                    }
                                    int i31 = eVar.e;
                                    z11 = z13;
                                    eVar.e = i31 + 1;
                                    cArr5[i31] = c16;
                                    eVar.c = i26 + 1;
                                }
                                z13 = z11;
                            }
                        }
                        char[] cArr7 = eVar.g;
                        int i32 = eVar.d;
                        str2 = new String(cArr7, i32, eVar.f - i32);
                    }
                    if ("cn".equalsIgnoreCase(c12)) {
                        str4 = str2;
                        break;
                    }
                    int i33 = eVar.c;
                    if (i33 >= i14) {
                        break;
                    }
                    char c17 = eVar.g[i33];
                    if (c17 != ',' && c17 != ';' && c17 != '+') {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                    eVar.c = i33 + 1;
                    c12 = eVar.c();
                    if (c12 == null) {
                        throw new IllegalStateException("Malformed DN: ".concat(str3));
                    }
                    c11 = c14;
                    z12 = z10 ? 1 : 0;
                    z13 = z11;
                }
            }
            z10 = z12;
            return str4 != null ? c(lowerCase, str4) : z10;
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
