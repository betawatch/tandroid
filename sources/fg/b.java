package fg;

import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.net.IDN;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class b {
    public static final b g = new b(a());
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public b(a aVar) {
        int i10 = aVar.a;
        this.a = i10;
        this.b = aVar.b;
        if (i10 == 3) {
            this.f = aVar.f;
            this.c = 0;
            this.d = "";
            this.e = "";
            return;
        }
        if (i10 == 2) {
            this.f = aVar.f;
            this.c = aVar.c;
            this.d = "";
            this.e = "";
            return;
        }
        if (i10 != 1) {
            throw new IllegalArgumentException();
        }
        this.f = "";
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
    }

    public static a a() {
        a aVar = new a();
        aVar.a = 1;
        aVar.b = "";
        aVar.d = "";
        aVar.e = "";
        aVar.f = "";
        return aVar;
    }

    public static b b(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i10 = sharedPreferences.getInt("proxy_port", 1080);
        int i11 = 2;
        int c10 = m1.j.c(TextUtils.isEmpty(string4) ? 1 : 2);
        if (c10 == 1) {
            i11 = 1;
        } else if (c10 != 2) {
            i11 = 0;
        }
        int d = d(sharedPreferences.getInt("proxy_type", i11));
        a a2 = a();
        if (string == null) {
            string = "";
        }
        a2.b = string;
        if (string2 == null) {
            string2 = "";
        }
        a2.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a2.e = string3;
        a2.f = string4 != null ? string4 : "";
        a2.c = i10;
        a2.a = d != 0 ? d : 1;
        return new b(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075 A[Catch: Exception -> 0x0142, TryCatch #1 {Exception -> 0x0142, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002c, B:18:0x0039, B:21:0x0043, B:23:0x004c, B:26:0x0056, B:28:0x005f, B:32:0x006b, B:36:0x0075, B:37:0x00d7, B:39:0x00e0, B:40:0x00e6, B:42:0x00ec, B:43:0x00f0, B:68:0x00fd, B:46:0x0103, B:49:0x010a, B:53:0x0112, B:56:0x0121, B:59:0x012e, B:62:0x013a, B:73:0x008a, B:77:0x0092, B:79:0x009f, B:81:0x00a8, B:85:0x00b3, B:89:0x00bb, B:92:0x00c5, B:95:0x00ce), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0 A[Catch: Exception -> 0x0142, TryCatch #1 {Exception -> 0x0142, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002c, B:18:0x0039, B:21:0x0043, B:23:0x004c, B:26:0x0056, B:28:0x005f, B:32:0x006b, B:36:0x0075, B:37:0x00d7, B:39:0x00e0, B:40:0x00e6, B:42:0x00ec, B:43:0x00f0, B:68:0x00fd, B:46:0x0103, B:49:0x010a, B:53:0x0112, B:56:0x0121, B:59:0x012e, B:62:0x013a, B:73:0x008a, B:77:0x0092, B:79:0x009f, B:81:0x00a8, B:85:0x00b3, B:89:0x00bb, B:92:0x00c5, B:95:0x00ce), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec A[Catch: Exception -> 0x0142, TryCatch #1 {Exception -> 0x0142, blocks: (B:4:0x0007, B:9:0x000f, B:11:0x001a, B:14:0x0023, B:16:0x002c, B:18:0x0039, B:21:0x0043, B:23:0x004c, B:26:0x0056, B:28:0x005f, B:32:0x006b, B:36:0x0075, B:37:0x00d7, B:39:0x00e0, B:40:0x00e6, B:42:0x00ec, B:43:0x00f0, B:68:0x00fd, B:46:0x0103, B:49:0x010a, B:53:0x0112, B:56:0x0121, B:59:0x012e, B:62:0x013a, B:73:0x008a, B:77:0x0092, B:79:0x009f, B:81:0x00a8, B:85:0x00b3, B:89:0x00bb, B:92:0x00c5, B:95:0x00ce), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b c(Uri uri) {
        String path;
        String queryParameter;
        String queryParameter2;
        int parseInt;
        String queryParameter3;
        String queryParameter4;
        int indexOf;
        if (uri == null) {
            return null;
        }
        try {
            String scheme = uri.getScheme();
            if (scheme == null) {
                return null;
            }
            int i10 = 2;
            if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) {
                if (!scheme.equalsIgnoreCase("tg")) {
                    return null;
                }
                String uri2 = uri.toString();
                if (!uri2.startsWith("tg://socks") && !uri2.startsWith("tg:socks")) {
                    if (!uri2.startsWith("tg://proxy") && !uri2.startsWith("tg:proxy")) {
                        if (!uri2.startsWith("tg://webproxy") && !uri2.startsWith("tg:webproxy")) {
                            return null;
                        }
                        i10 = 3;
                    }
                    indexOf = uri2.indexOf(63);
                    if (indexOf >= 0) {
                        return null;
                    }
                    uri = Uri.parse("tg://telegram.org/" + uri2.substring(indexOf));
                    queryParameter = uri.getQueryParameter("server");
                    if (queryParameter == null) {
                        queryParameter = uri.getQueryParameter("host");
                    }
                    if (AndroidUtilities.checkHostForPunycode(queryParameter)) {
                        queryParameter = IDN.toASCII(queryParameter, 1);
                    }
                    queryParameter2 = uri.getQueryParameter("port");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        try {
                            parseInt = Integer.parseInt(queryParameter2);
                        } catch (NumberFormatException unused) {
                        }
                        a a2 = a();
                        a2.a = i10 != 0 ? i10 : 1;
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        a2.b = queryParameter;
                        a2.c = parseInt;
                        queryParameter3 = uri.getQueryParameter("user");
                        if (queryParameter3 == null) {
                            queryParameter3 = "";
                        }
                        a2.d = queryParameter3;
                        queryParameter4 = uri.getQueryParameter("pass");
                        if (queryParameter4 == null) {
                            queryParameter4 = "";
                        }
                        a2.e = queryParameter4;
                        String queryParameter5 = uri.getQueryParameter("secret");
                        a2.f = queryParameter5 != null ? queryParameter5 : "";
                        return new b(a2);
                    }
                    parseInt = 0;
                    a a22 = a();
                    a22.a = i10 != 0 ? i10 : 1;
                    if (queryParameter == null) {
                    }
                    a22.b = queryParameter;
                    a22.c = parseInt;
                    queryParameter3 = uri.getQueryParameter("user");
                    if (queryParameter3 == null) {
                    }
                    a22.d = queryParameter3;
                    queryParameter4 = uri.getQueryParameter("pass");
                    if (queryParameter4 == null) {
                    }
                    a22.e = queryParameter4;
                    String queryParameter52 = uri.getQueryParameter("secret");
                    a22.f = queryParameter52 != null ? queryParameter52 : "";
                    return new b(a22);
                }
                i10 = 1;
                indexOf = uri2.indexOf(63);
                if (indexOf >= 0) {
                }
            }
            String host = uri.getHost();
            if (host == null) {
                return null;
            }
            String lowerCase = host.toLowerCase();
            if ((lowerCase.equals("telegram.me") || lowerCase.equals("t.me") || lowerCase.equals("telegram.dog")) && (path = uri.getPath()) != null) {
                if (path.startsWith("/socks")) {
                    i10 = 1;
                } else if (!path.startsWith("/proxy")) {
                    if (!path.startsWith("/webproxy")) {
                        return null;
                    }
                    i10 = 3;
                }
                queryParameter = uri.getQueryParameter("server");
                if (queryParameter == null) {
                }
                if (AndroidUtilities.checkHostForPunycode(queryParameter)) {
                }
                queryParameter2 = uri.getQueryParameter("port");
                if (!TextUtils.isEmpty(queryParameter2)) {
                }
                parseInt = 0;
                a a222 = a();
                a222.a = i10 != 0 ? i10 : 1;
                if (queryParameter == null) {
                }
                a222.b = queryParameter;
                a222.c = parseInt;
                queryParameter3 = uri.getQueryParameter("user");
                if (queryParameter3 == null) {
                }
                a222.d = queryParameter3;
                queryParameter4 = uri.getQueryParameter("pass");
                if (queryParameter4 == null) {
                }
                a222.e = queryParameter4;
                String queryParameter522 = uri.getQueryParameter("secret");
                a222.f = queryParameter522 != null ? queryParameter522 : "";
                return new b(a222);
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static int d(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 3;
            }
        }
        return 1;
    }

    public final boolean e() {
        if (TextUtils.isEmpty(this.b)) {
            return false;
        }
        return this.a == 3 || this.c > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.c == bVar.c && this.a == bVar.a && Objects.equals(this.b, bVar.b) && Objects.equals(this.d, bVar.d) && Objects.equals(this.e, bVar.e) && Objects.equals(this.f, bVar.f);
    }

    public final void f(SharedPreferences.Editor editor) {
        int i10 = this.a;
        int c10 = m1.j.c(i10);
        editor.putInt("proxy_type", c10 != 1 ? c10 != 2 ? 0 : 2 : 1);
        editor.putString("proxy_ip", this.b);
        int c11 = m1.j.c(i10);
        int i11 = this.c;
        if (c11 == 0) {
            editor.putInt("proxy_port", i11);
            editor.remove("proxy_secret");
            String str = this.e;
            if (TextUtils.isEmpty(str)) {
                editor.remove("proxy_pass");
            } else {
                editor.putString("proxy_pass", str);
            }
            String str2 = this.d;
            if (TextUtils.isEmpty(str2)) {
                editor.remove("proxy_user");
                return;
            } else {
                editor.putString("proxy_user", str2);
                return;
            }
        }
        String str3 = this.f;
        if (c11 == 1) {
            editor.putString("proxy_secret", str3);
            editor.putInt("proxy_port", i11);
            editor.remove("proxy_pass");
            editor.remove("proxy_user");
            return;
        }
        if (c11 != 2) {
            return;
        }
        editor.putString("proxy_secret", str3);
        editor.remove("proxy_port");
        editor.remove("proxy_pass");
        editor.remove("proxy_user");
    }

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f);
    }
}
