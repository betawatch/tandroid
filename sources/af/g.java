package af;

import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import g5.m;
import g5.p;
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
import kc.k;
import kf.k0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import q5.l;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class g extends k {
    public static final i l;
    public static final HashMap m;
    public final ExtendedDefaultDataSourceFactory e;
    public final a f;
    public final ab.a g;
    public final HashMap h;
    public Pair i;
    public boolean j;
    public final AtomicInteger k;

    static {
        i iVar = new i(new h(Uri.parse("file:///android_asset/cast/default.png"), "image/png", "/assets/default"));
        l = iVar;
        i[] iVarArr = {iVar};
        HashMap hashMap = new HashMap();
        m = hashMap;
        i iVar2 = iVarArr[0];
        hashMap.put(iVar2.d, iVar2);
    }

    public g() {
        this.c = new f2.c(2);
        this.h = new HashMap();
        this.i = null;
        this.j = false;
        this.k = new AtomicInteger();
        this.f = new a(1);
        this.g = new ab.a(7);
        this.e = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
    }

    public static String i() {
        int ipAddress = ((WifiManager) ApplicationLoader.applicationContext.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        if (ipAddress == 0) {
            try {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (nextElement.isSiteLocalAddress()) {
                            byte[] address = nextElement.getAddress();
                            ipAddress = (((address[3] + 256) % 256) << 24) + ((address[0] + 256) % 256) + (((address[1] + 256) % 256) << 8) + (((address[2] + 256) % 256) << 16);
                        }
                    }
                }
            } catch (SocketException e) {
                FileLog.e(e);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(ipAddress & 255) + '.' + ((ipAddress >> 8) & 255) + '.' + ((ipAddress >> 16) & 255) + '.' + ((ipAddress >> 24) & 255));
        sb.append(":61578");
        return sb.toString();
    }

    public static String j(String str, String str2) {
        return android.support.v4.media.a.o("http://", str, str2);
    }

    @Override // kc.k
    public final kc.h e(kc.d dVar) {
        String str;
        int incrementAndGet = this.k.incrementAndGet();
        StringBuilder m9 = k0.m(incrementAndGet, "Request ", " ");
        switch (dVar.g) {
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
                str = BuildConfig.BETA_URL;
                break;
        }
        m9.append(str);
        m9.append(" ");
        m9.append(dVar.f);
        m9.append(" ");
        m9.append((String) dVar.i.get("range"));
        Log.d("CAST_SERVER", m9.toString());
        try {
            kc.h k10 = k(dVar);
            kc.e eVar = k10.e;
            eVar.put("Access-Control-Allow-Origin", "*");
            eVar.put("Access-Control-Max-Age", "3628800");
            eVar.put("Access-Control-Allow-Methods", "*");
            eVar.put("Access-Control-Allow-Headers", "*");
            return k10;
        } catch (Throwable unused) {
            Log.d("CAST_SERVER", "Error " + incrementAndGet);
            kc.h c3 = k.c(kc.g.n, "text/plain", "Error reading file");
            kc.e eVar2 = c3.e;
            eVar2.put("Access-Control-Allow-Origin", "*");
            eVar2.put("Access-Control-Max-Age", "3628800");
            eVar2.put("Access-Control-Allow-Methods", "*");
            eVar2.put("Access-Control-Allow-Headers", "*");
            return c3;
        }
    }

    public final void h() {
        if (!this.h.isEmpty()) {
            if (this.j) {
                return;
            }
            try {
                f();
                this.j = true;
                return;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (this.j) {
            try {
                k.d(this.a);
                f2.c cVar = this.c;
                cVar.getClass();
                ArrayList arrayList = new ArrayList((List) cVar.c);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    kc.a aVar = (kc.a) obj;
                    k.d(aVar.a);
                    k.d(aVar.b);
                }
                Thread thread = this.b;
                if (thread != null) {
                    thread.join();
                }
            } catch (Exception e6) {
                k.d.log(Level.SEVERE, "Could not stop all connections", (Throwable) e6);
            }
            this.j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kc.h k(kc.d dVar) {
        boolean z4;
        long j10;
        f fVar;
        long j11;
        kc.h c3;
        long parseLong;
        long parseLong2;
        String str = (String) dVar.i.get("host");
        String path = Uri.parse("http://" + str + dVar.f).getPath();
        boolean b10 = m1.j.b(6, dVar.g);
        kc.g gVar = kc.g.c;
        if (b10) {
            return k.c(gVar, "text/plain", "");
        }
        boolean equals = TextUtils.equals(path, "/");
        HashMap hashMap = this.h;
        HashMap hashMap2 = m;
        int i10 = 0;
        if (equals) {
            StringBuilder sb = new StringBuilder();
            if (this.i != null) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(j(str, (String) this.i.first));
            }
            while (i10 < 2) {
                for (Map.Entry entry : (i10 == 0 ? hashMap2 : hashMap).entrySet()) {
                    if (sb.length() > 0) {
                        sb.append('\n');
                    }
                    sb.append(j(str, (String) entry.getKey()));
                    l lVar = ((i) entry.getValue()).b;
                    if (lVar != null) {
                        Bundle bundle = lVar.b;
                        l.f(1, "com.google.android.gms.cast.metadata.TITLE");
                        String string = bundle.getString("com.google.android.gms.cast.metadata.TITLE");
                        l.f(1, "com.google.android.gms.cast.metadata.SUBTITLE");
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
                i10++;
            }
            return k.c(gVar, "text/plain", sb.toString());
        }
        i iVar = (i) hashMap2.get(path);
        if (iVar == null) {
            iVar = (i) hashMap.get(path);
        }
        if (iVar == null) {
            Pair pair = this.i;
            File file = (pair == null || !((String) pair.first).equalsIgnoreCase(path)) ? null : (File) this.i.second;
            return file != null ? new kc.h(gVar, "image/jpeg", new BufferedInputStream(new FileInputStream(file)), file.length()) : k.c(kc.g.h, "text/plain", "file not found");
        }
        Uri uri = iVar.c;
        String str2 = (String) dVar.i.get("host");
        String str3 = iVar.a;
        if (uri.toString().startsWith("data:application/x-mpegurl;base64,")) {
            return k.c(gVar, str3, new String(Base64.decode(uri.toString().substring(34), 0)).replaceAll("mtproto:", j(str2, "/mtproto_")));
        }
        m createDataSource = (uri.toString().startsWith("file://") ? uri.toString().startsWith("file:///android_asset/") ? this.f : this.g : this.e).createDataSource();
        Map map = Collections.EMPTY_MAP;
        long j12 = 0;
        long j13 = -1;
        long open = createDataSource.open(new p(uri, 1, null, map, 0L, -1L, null, 0));
        createDataSource.close();
        boolean equals2 = TextUtils.equals(str3, "application/x-mpegURL");
        if (!equals2) {
            String str4 = (String) dVar.i.get("range");
            if (!TextUtils.isEmpty(str4)) {
                String substring = str4.trim().substring(6);
                if (substring.startsWith("-")) {
                    parseLong2 = open - 1;
                    parseLong = parseLong2 - Long.parseLong(substring.substring(1));
                    z4 = equals2;
                } else {
                    String[] split = substring.split("-");
                    parseLong = Long.parseLong(split[0]);
                    z4 = equals2;
                    parseLong2 = split.length > 1 ? Long.parseLong(split[1]) : open - 1;
                }
                long j14 = parseLong;
                j10 = open;
                long j15 = j10 - 1;
                fVar = new f(j14, parseLong2 > j15 ? j15 : parseLong2);
                long j16 = fVar == null ? (fVar.b - fVar.a) + 1 : j10;
                if (fVar != null) {
                    j13 = j16;
                    j12 = fVar.a;
                }
                if (!z4) {
                    int i11 = (int) j16;
                    byte[] bArr = new byte[i11];
                    createDataSource.open(new p(uri, 1, null, map, j12, j13, null, 0));
                    createDataSource.read(bArr, 0, i11);
                    createDataSource.close();
                    return k.c(gVar, str3, new String(bArr).replaceAll("mtproto:", j(str2, "/mtproto_")));
                }
                if (j16 != 0) {
                    j11 = j10;
                    e eVar = new e(createDataSource, new p(uri, 1, null, map, j12, j13, null, 0));
                    if (fVar != null) {
                        gVar = kc.g.e;
                    }
                    c3 = new kc.h(gVar, iVar.a, eVar, j16);
                } else {
                    j11 = j10;
                    c3 = k.c(kc.g.d, str3, "");
                }
                kc.h hVar = c3;
                if (fVar != null) {
                    hVar.e.put("Content-Range", "bytes " + fVar.a + "-" + fVar.b + "/" + j11);
                }
                return hVar;
            }
        }
        z4 = equals2;
        j10 = open;
        fVar = null;
        if (fVar == null) {
        }
        if (fVar != null) {
        }
        if (!z4) {
        }
    }

    public final void l(File file, String str) {
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
        h();
    }
}
