// default package

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import org.telegram.messenger.a;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class nh2 extends nk7 {
    public static final ph2 l;
    public static final HashMap m;
    public final ExtendedDefaultDataSourceFactory e;
    public final c22 f;
    public final faf g;
    public final HashMap h;
    public Pair i;
    public boolean j;
    public final AtomicInteger k;

    static {
        ph2 ph2Var = new ph2(new oh2("image/png", Uri.parse("file:///android_asset/cast/default.png"), "/assets/default"));
        l = ph2Var;
        ph2[] ph2VarArr = {ph2Var};
        HashMap hashMap = new HashMap();
        m = hashMap;
        ph2 ph2Var2 = ph2VarArr[0];
        hashMap.put(ph2Var2.d, ph2Var2);
    }

    public nh2() {
        this.c = new zg2((byte) 4);
        this.h = new HashMap();
        this.i = null;
        this.j = false;
        this.k = new AtomicInteger();
        this.f = new c22((byte) 11);
        this.g = new faf((byte) 19);
        this.e = new ExtendedDefaultDataSourceFactory(a.b, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String h() {
        int ipAddress = ((WifiManager) a.b.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (nextElement.isSiteLocalAddress()) {
                            byte[] address = nextElement.getAddress();
                            ipAddress = ((address[0] + ConnectionsManager.USE_IPV4_ONLY) % 256) + (((address[1] + ConnectionsManager.USE_IPV4_ONLY) % 256) << 8) + (((address[2] + ConnectionsManager.USE_IPV4_ONLY) % 256) << 16) + (((address[3] + ConnectionsManager.USE_IPV4_ONLY) % 256) << 24);
                        }
                    }
                }
            } catch (SocketException e) {
                cc4.g(e, true);
            }
        }
        return (String.valueOf(ipAddress & jn7.d4) + '.' + ((ipAddress >> 8) & jn7.d4) + '.' + ((ipAddress >> 16) & jn7.d4) + '.' + ((ipAddress >> 24) & jn7.d4)).concat(":61578");
    }

    public static String i(String str, String str2) {
        return qd4.y("http://", str, str2);
    }

    @Override // nk7
    public final lk7 d(jk7 jk7Var) {
        String str;
        int incrementAndGet = this.k.incrementAndGet();
        StringBuilder m2 = uh9.m(incrementAndGet, "Request ", " ");
        switch (jk7Var.g) {
            case 1:
                str = "GET";
                break;
            case 2:
                str = "PUT";
                break;
            case 3:
                str = "POST";
                break;
            case 4:
                str = "DELETE";
                break;
            case 5:
                str = "HEAD";
                break;
            case 6:
                str = "OPTIONS";
                break;
            case 7:
                str = "TRACE";
                break;
            case 8:
                str = "CONNECT";
                break;
            case 9:
                str = "PATCH";
                break;
            case 10:
                str = "PROPFIND";
                break;
            case 11:
                str = "PROPPATCH";
                break;
            case 12:
                str = "MKCOL";
                break;
            case 13:
                str = "MOVE";
                break;
            case 14:
                str = "COPY";
                break;
            case 15:
                str = "LOCK";
                break;
            case 16:
                str = "UNLOCK";
                break;
            default:
                str = "null";
                break;
        }
        m2.append(str);
        m2.append(" ");
        m2.append(jk7Var.f);
        m2.append(" ");
        bs2.x(m2, (String) jk7Var.i.get("range"), "CAST_SERVER");
        try {
            lk7 j = j(jk7Var);
            fz1 fz1Var = j.e;
            fz1Var.put("Access-Control-Allow-Origin", "*");
            fz1Var.put("Access-Control-Max-Age", "3628800");
            fz1Var.put("Access-Control-Allow-Methods", "*");
            fz1Var.put("Access-Control-Allow-Headers", "*");
            return j;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            lk7 b = nk7.b(29, "text/plain", "Error reading file");
            fz1 fz1Var2 = b.e;
            fz1Var2.put("Access-Control-Allow-Origin", "*");
            fz1Var2.put("Access-Control-Max-Age", "3628800");
            fz1Var2.put("Access-Control-Allow-Methods", "*");
            fz1Var2.put("Access-Control-Allow-Headers", "*");
            return b;
        }
    }

    public final void g() {
        boolean isEmpty = this.h.isEmpty();
        boolean z = this.j;
        if (!isEmpty) {
            if (z) {
                return;
            }
            try {
                e();
                this.j = true;
                return;
            } catch (IOException e) {
                grb.m(e);
                return;
            }
        }
        if (z) {
            try {
                nk7.c(this.a);
                ArrayList arrayList = new ArrayList((List) this.c.c);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    gk7 gk7Var = (gk7) obj;
                    nk7.c(gk7Var.a);
                    nk7.c(gk7Var.b);
                }
                Thread thread = this.b;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e2) {
                nk7.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e2);
            }
            this.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lk7 j(jk7 jk7Var) {
        String str;
        ry0 ry0Var;
        long j;
        long j2;
        lk7 b;
        long parseLong;
        long j3;
        long j4;
        String str2 = (String) jk7Var.i.get("host");
        StringBuilder l2 = c00.l("http://", str2);
        l2.append(jk7Var.f);
        String path = Uri.parse(l2.toString()).getPath();
        if (ik8.c(6, jk7Var.g)) {
            return nk7.b(2, "text/plain", "");
        }
        boolean equals = TextUtils.equals(path, "/");
        HashMap hashMap = this.h;
        HashMap hashMap2 = m;
        int i = 0;
        if (equals) {
            StringBuilder sb = new StringBuilder();
            if (this.i != null) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(i(str2, (String) this.i.first));
            }
            while (i < 2) {
                for (Map.Entry entry : (i == 0 ? hashMap2 : hashMap).entrySet()) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(i(str2, (String) entry.getKey()));
                    mt6 mt6Var = ((ph2) entry.getValue()).b;
                    if (mt6Var != null) {
                        Bundle bundle = mt6Var.b;
                        mt6.c(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string = bundle.getString("com.google.android.gms.cast.metadata.TITLE");
                        mt6.c(1, "com.google.android.gms.cast.metadata.SUBTITLE");
                        String string2 = bundle.getString("com.google.android.gms.cast.metadata.SUBTITLE");
                        if (string != null) {
                            sb.append(' ');
                            sb.append(string);
                        }
                        if (string2 != null) {
                            sb.append(" [");
                            sb.append(string2);
                            sb.append(']');
                        }
                    }
                }
                i++;
            }
            return nk7.b(2, "text/plain", sb.toString());
        }
        ph2 ph2Var = (ph2) hashMap2.get(path);
        if (ph2Var == null) {
            ph2Var = (ph2) hashMap.get(path);
        }
        if (ph2Var == null) {
            Pair pair = this.i;
            File file = (pair == null || !((String) pair.first).equalsIgnoreCase(path)) ? null : (File) this.i.second;
            return file != null ? new lk7(2, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length()) : nk7.b(16, "text/plain", "file not found");
        }
        Uri uri = ph2Var.c;
        String str3 = (String) jk7Var.i.get("host");
        String str4 = ph2Var.a;
        if (uri.toString().startsWith("data:application/x-mpegurl;base64,")) {
            return nk7.b(2, str4, new String(Base64.decode(uri.toString().substring(34), 0)).replaceAll("mtproto:", i(str3, "/mtproto_")));
        }
        h73 createDataSource = (uri.toString().startsWith("file://") ? uri.toString().startsWith("file:///android_asset/") ? this.f : this.g : this.e).createDataSource();
        Map map = Collections.EMPTY_MAP;
        long j5 = 0;
        long j6 = -1;
        long open = createDataSource.open(new n73(uri, 1, null, map, 0L, -1L, null, 0));
        createDataSource.close();
        boolean equals2 = TextUtils.equals(str4, "application/x-mpegURL");
        if (!equals2) {
            String str5 = (String) jk7Var.i.get("range");
            if (!TextUtils.isEmpty(str5)) {
                String substring = str5.trim().substring(6);
                if (substring.startsWith("-")) {
                    parseLong = open - 1;
                    j3 = parseLong - Long.parseLong(substring.substring(1));
                } else {
                    String[] split = substring.split("-");
                    long parseLong2 = Long.parseLong(split[0]);
                    parseLong = split.length > 1 ? Long.parseLong(split[1]) : open - 1;
                    j3 = parseLong2;
                }
                long j7 = open - 1;
                if (parseLong > j7) {
                    str = "";
                    j4 = j7;
                } else {
                    str = "";
                    j4 = parseLong;
                }
                ry0Var = new ry0(j3, j4);
                if (ry0Var == null) {
                    long j8 = ry0Var.b;
                    long j9 = ry0Var.a;
                    j6 = (j8 - j9) + 1;
                    j5 = j9;
                    j = j6;
                } else {
                    j = open;
                }
                if (!equals2) {
                    int i2 = (int) j;
                    byte[] bArr = new byte[i2];
                    createDataSource.open(new n73(uri, 1, null, map, j5, j6, null, 0));
                    createDataSource.read(bArr, 0, i2);
                    createDataSource.close();
                    return nk7.b(2, str4, new String(bArr).replaceAll("mtproto:", i(str3, "/mtproto_")));
                }
                if (j != 0) {
                    j2 = open;
                    b = new lk7(ry0Var != null ? 6 : 2, ph2Var.a, new mh2(createDataSource, new n73(uri, 1, null, map, j5, j6, null, 0)), j);
                } else {
                    j2 = open;
                    b = nk7.b(5, str4, str);
                }
                lk7 lk7Var = b;
                if (ry0Var != null) {
                    lk7Var.e.put("Content-Range", "bytes " + ry0Var.a + "-" + ry0Var.b + "/" + j2);
                }
                return lk7Var;
            }
        }
        str = "";
        ry0Var = null;
        if (ry0Var == null) {
        }
        if (!equals2) {
        }
    }

    public final void k(File file, String str) {
        if (str == null || file == null) {
            Pair pair = this.i;
            if (pair != null && ((File) pair.second).exists()) {
                try {
                    ((File) this.i.second).delete();
                } catch (Exception unused) {
                }
            }
            this.i = null;
        } else {
            this.i = new Pair(str, file);
        }
        g();
    }
}
