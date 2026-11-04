package oc;

import ci.f8;
import d2.t0;
import gi.w5;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Wallet.w0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u {
    public final s a;
    public final t0 b;
    public final h c;
    public final b4.n d;
    public final p e;
    public final p f;
    public y h;
    public z i;
    public q j;
    public b0 k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public x s;
    public x t;
    public o u;
    public final Object g = new Object();
    public final Object n = new Object();

    public u(boolean z10, String str, String str2, String str3, s sVar) {
        this.a = sVar;
        t0 t0Var = new t0();
        t0Var.b = 1;
        t0Var.a = 1;
        this.b = t0Var;
        h hVar = new h();
        hVar.a = str;
        hVar.b = str2;
        hVar.c = str3;
        URI.create((z10 ? "wss" : "ws") + "://" + str2 + str3);
        this.c = hVar;
        b4.n nVar = new b4.n();
        nVar.c = new ArrayList();
        nVar.a = true;
        nVar.b = this;
        this.d = nVar;
        this.e = new p(this, "PingSender", new mb.b(16));
        this.f = new p(this, "PongSender", new mb.b(16));
    }

    public final void a() {
        synchronized (this.n) {
            try {
                if (this.m) {
                    return;
                }
                this.m = true;
                b4.n nVar = this.d;
                ArrayList arrayList = (ArrayList) nVar.q();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    w0 w0Var = (w0) obj;
                    try {
                        try {
                            int i10 = 5;
                            g0.h3(new f8(w0Var.a, i10, w0Var.b, w0Var, (u) nVar.b));
                        } catch (Throwable unused) {
                            w0Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            t0 t0Var = this.b;
            if (t0Var.a != 1) {
                throw new v(1, "The current state of the WebSocket is not CREATED.");
            }
            t0Var.a = 2;
        }
        this.d.g();
        try {
            s sVar = this.a;
            try {
                sVar.a();
                h(sVar.g);
                ArrayList arrayList = this.l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i3);
                        i3++;
                        w wVar = (w) obj;
                        if (wVar instanceof o) {
                            oVar = (o) wVar;
                            break;
                        }
                    }
                }
                this.u = oVar;
                this.b.a = 3;
                this.d.g();
                i();
            } catch (v e10) {
                Socket socket = sVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e10;
            }
        } catch (v e11) {
            Socket socket2 = this.a.g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.b.a = 5;
            this.d.g();
            throw e11;
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                int c2 = o1.g.c(this.b.a);
                int i3 = 4;
                if (c2 != 0) {
                    if (c2 != 2) {
                        return;
                    }
                    t0 t0Var = this.b;
                    t0Var.a = 4;
                    if (t0Var.b == 1) {
                        t0Var.b = 3;
                    }
                    g(x.a(1000, null));
                    this.d.g();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, i3, 1);
                b4.n nVar = bVar.a.d;
                if (nVar != null) {
                    ArrayList arrayList = (ArrayList) nVar.q();
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        w0 w0Var = (w0) obj;
                        try {
                            try {
                                w0Var.getClass();
                            } catch (Throwable unused) {
                                w0Var.getClass();
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                bVar.start();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        this.e.stop();
        this.f.stop();
        Socket socket = this.a.g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.b) {
            this.b.a = 5;
        }
        this.d.g();
        b4.n nVar = this.d;
        x xVar = this.s;
        x xVar2 = this.t;
        int i3 = 0;
        boolean z10 = this.b.b == 2;
        ArrayList arrayList = (ArrayList) nVar.q();
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            w0 w0Var = (w0) obj;
            try {
                try {
                    w0Var.a((u) nVar.b, xVar, xVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                w0Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z10;
        synchronized (this.g) {
            this.o = true;
            z10 = this.p;
        }
        a();
        if (z10) {
            f();
        }
    }

    public final void f() {
        p pVar = this.e;
        synchronized (pVar) {
        }
        pVar.c1();
        this.f.d1();
    }

    public final void finalize() {
        boolean z10;
        synchronized (this.b) {
            z10 = this.b.a == 1;
        }
        if (z10) {
            d();
        }
        super.finalize();
    }

    public final void g(x xVar) {
        if (xVar == null) {
            return;
        }
        synchronized (this.b) {
            try {
                int i3 = this.b.a;
                if (i3 == 3 || i3 == 4) {
                    b0 b0Var = this.k;
                    if (b0Var == null) {
                        return;
                    }
                    b0Var.f(xVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeMap h(Socket socket) {
        int i3;
        int i10;
        w wVar;
        w wVar2;
        String str;
        try {
            y yVar = new y(new BufferedInputStream(socket.getInputStream()), 0);
            try {
                z zVar = new z(new BufferedOutputStream(socket.getOutputStream()));
                byte[] bArr = new byte[16];
                k.a.nextBytes(bArr);
                String a10 = d.a(bArr);
                h hVar = this.c;
                hVar.d = a10;
                String q10 = a1.g.q("GET ", (String) hVar.c, " HTTP/1.1");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new String[]{"Host", (String) hVar.b});
                arrayList.add(h.e);
                arrayList.add(h.f);
                arrayList.add(h.g);
                arrayList.add(new String[]{"Sec-WebSocket-Key", (String) hVar.d});
                String str2 = (String) hVar.a;
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(new String[]{"Authorization", "Basic " + d.a(k.a(str2))});
                }
                StringBuilder h = t4.c.h(q10, "\r\n");
                int size = arrayList.size();
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    i3 = 1;
                    if (i12 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i12);
                    i12++;
                    String[] strArr = (String[]) obj;
                    h.append(strArr[0]);
                    h.append(": ");
                    h.append(strArr[1]);
                    h.append("\r\n");
                }
                h.append("\r\n");
                String sb2 = h.toString();
                ArrayList arrayList2 = (ArrayList) this.d.q();
                int size2 = arrayList2.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj2 = arrayList2.get(i13);
                    i13++;
                    w0 w0Var = (w0) obj2;
                    try {
                        try {
                            w0Var.getClass();
                        } catch (Throwable unused) {
                            w0Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    zVar.write(k.a(sb2));
                    zVar.flush();
                    w5 w5Var = new w5(this, 20);
                    try {
                        String b10 = k.b(yVar);
                        if (b10 == null || b10.length() == 0) {
                            throw new v(6, "The status line of the opening handshake response is empty.");
                        }
                        try {
                            ad.b bVar = new ad.b(b10, 4);
                            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                            StringBuilder sb3 = null;
                            while (true) {
                                try {
                                    String b11 = k.b(yVar);
                                    if (b11 == null || b11.length() == 0) {
                                        break;
                                    }
                                    char charAt = b11.charAt(0);
                                    if (charAt != ' ' && charAt != '\t') {
                                        if (sb3 != null) {
                                            w5.X(sb3.toString(), treeMap);
                                        }
                                        sb3 = new StringBuilder(b11);
                                    } else if (sb3 != null) {
                                        sb3.append(b11.replaceAll("^[ \t]+", " "));
                                    }
                                } catch (IOException e10) {
                                    throw new v(9, "An error occurred while HTTP header section was being read: " + e10.getMessage(), e10);
                                }
                            }
                            if (sb3 != null) {
                                w5.X(sb3.toString(), treeMap);
                            }
                            if (bVar.c != 101) {
                                try {
                                    i10 = Integer.parseInt((String) ((List) treeMap.get("Content-Length")).get(0));
                                } catch (Exception unused3) {
                                    i10 = -1;
                                }
                                if (i10 > 0) {
                                    try {
                                        yVar.b(i10, new byte[i10]);
                                    } catch (Throwable unused4) {
                                    }
                                }
                                throw new n(8, "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + bVar, bVar);
                            }
                            List list = (List) treeMap.get("Upgrade");
                            if (list == null || list.size() == 0) {
                                throw new n(10, "The opening handshake response does not contain 'Upgrade' header.", bVar);
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String[] split = ((String) it.next()).split("\\s*,\\s*");
                                int length = split.length;
                                int i14 = 0;
                                while (i14 < length) {
                                    if ("websocket".equalsIgnoreCase(split[i14])) {
                                        List list2 = (List) treeMap.get("Connection");
                                        if (list2 == null || list2.size() == 0) {
                                            throw new n(12, "The opening handshake response does not contain 'Connection' header.", bVar);
                                        }
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            String[] split2 = ((String) it2.next()).split("\\s*,\\s*");
                                            int length2 = split2.length;
                                            int i15 = 0;
                                            while (i15 < length2) {
                                                if ("Upgrade".equalsIgnoreCase(split2[i15])) {
                                                    List list3 = (List) treeMap.get("Sec-WebSocket-Accept");
                                                    if (list3 == null) {
                                                        throw new n(14, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", bVar);
                                                    }
                                                    try {
                                                        if (!d.a(MessageDigest.getInstance("SHA-1").digest(k.a(t4.c.q(a10, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")))).equals((String) list3.get(0))) {
                                                            throw new n(15, "The value of 'Sec-WebSocket-Accept' header is different from the expected one.", bVar);
                                                        }
                                                    } catch (Exception unused5) {
                                                    }
                                                    List list4 = (List) treeMap.get("Sec-WebSocket-Extensions");
                                                    if (list4 != null && list4.size() != 0) {
                                                        ArrayList arrayList3 = new ArrayList();
                                                        Iterator it3 = list4.iterator();
                                                        while (it3.hasNext()) {
                                                            String[] split3 = ((String) it3.next()).split("\\s*,\\s*");
                                                            if (split3.length > 0) {
                                                                String str3 = split3[0];
                                                                if (str3 != null) {
                                                                    String[] split4 = str3.trim().split("\\s*;\\s*");
                                                                    if (split4.length != 0) {
                                                                        String str4 = split4[0];
                                                                        if (d.b(str4)) {
                                                                            if ("permessage-deflate".equals(str4)) {
                                                                                o oVar = new o(str4);
                                                                                oVar.c = 32768;
                                                                                wVar = oVar;
                                                                            } else {
                                                                                wVar = new w(str4);
                                                                            }
                                                                            int i16 = i3;
                                                                            while (i16 < split4.length) {
                                                                                String[] split5 = split4[i16].split("\\s*=\\s*", 2);
                                                                                if (split5.length != 0 && split5[0].length() != 0) {
                                                                                    String str5 = split5[0];
                                                                                    if (d.b(str5)) {
                                                                                        if (split5.length == 2 && (str = split5[i3]) != null) {
                                                                                            int length3 = str.length();
                                                                                            if (length3 >= 2 && str.charAt(0) == '\"') {
                                                                                                int i17 = length3 - 1;
                                                                                                if (str.charAt(i17) == '\"') {
                                                                                                    str = str.substring(i3, i17);
                                                                                                    if (str != null) {
                                                                                                        if (str.indexOf(92) >= 0) {
                                                                                                            int length4 = str.length();
                                                                                                            StringBuilder sb4 = new StringBuilder();
                                                                                                            boolean z10 = false;
                                                                                                            for (int i18 = 0; i18 < length4; i18++) {
                                                                                                                char charAt2 = str.charAt(i18);
                                                                                                                if (charAt2 != '\\' || z10) {
                                                                                                                    sb4.append(charAt2);
                                                                                                                    z10 = false;
                                                                                                                } else {
                                                                                                                    z10 = true;
                                                                                                                }
                                                                                                            }
                                                                                                            str = sb4.toString();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (str != null || d.b(str)) {
                                                                                                if (d.b(str5)) {
                                                                                                    throw new IllegalArgumentException("'key' is not a valid token.");
                                                                                                }
                                                                                                if (str != null && !d.b(str)) {
                                                                                                    throw new IllegalArgumentException("'value' is not a valid token.");
                                                                                                }
                                                                                                wVar.b.put(str5, str);
                                                                                            }
                                                                                        }
                                                                                        str = null;
                                                                                        if (str != null) {
                                                                                        }
                                                                                        if (d.b(str5)) {
                                                                                        }
                                                                                    } else {
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                i16++;
                                                                                i3 = 1;
                                                                            }
                                                                            wVar2 = wVar;
                                                                            if (wVar2 != null) {
                                                                                throw new n(16, t4.c.f("The value in 'Sec-WebSocket-Extensions' failed to be parsed: ", str3), bVar);
                                                                            }
                                                                            String str6 = wVar2.a;
                                                                            h hVar2 = ((u) w5Var.b).c;
                                                                            if (str6 == null) {
                                                                                hVar2.getClass();
                                                                            }
                                                                            throw new n(17, t4.c.f("The extension contained in the Sec-WebSocket-Extensions header is not supported: ", str6), bVar);
                                                                        }
                                                                    }
                                                                }
                                                                wVar2 = null;
                                                                if (wVar2 != null) {
                                                                }
                                                            }
                                                        }
                                                        int size3 = arrayList3.size();
                                                        w wVar3 = null;
                                                        while (i11 < size3) {
                                                            Object obj3 = arrayList3.get(i11);
                                                            i11++;
                                                            w wVar4 = (w) obj3;
                                                            if (wVar4 instanceof o) {
                                                                if (wVar3 != null) {
                                                                    throw new n(18, f1.q("'", wVar3.a, "' extension and '", wVar4.a, "' extension conflict with each other."), bVar);
                                                                }
                                                                wVar3 = wVar4;
                                                            }
                                                        }
                                                        ((u) w5Var.b).l = arrayList3;
                                                    }
                                                    w5Var.d0(bVar, treeMap);
                                                    this.h = yVar;
                                                    this.i = zVar;
                                                    return treeMap;
                                                }
                                                i15++;
                                                i3 = 1;
                                            }
                                        }
                                        throw new n(13, "'Upgrade' was not found in 'Connection' header.", bVar);
                                    }
                                    i14++;
                                    i3 = 1;
                                }
                            }
                            throw new n(11, "'websocket' was not found in 'Upgrade' header.", bVar);
                        } catch (Exception unused6) {
                            throw new v(7, "The status line of the opening handshake response is badly formatted. The status line is: ".concat(b10));
                        }
                    } catch (IOException e11) {
                        throw new v(5, "Failed to read an opening handshake response from the server: " + e11.getMessage(), e11);
                    }
                } catch (IOException e12) {
                    throw new v(4, "Failed to send an opening handshake request to the server: " + e12.getMessage(), e12);
                }
            } catch (IOException e13) {
                throw new v(3, "Failed to get the output stream from the raw socket: " + e13.getMessage(), e13);
            }
        } catch (IOException e14) {
            throw new v(2, "Failed to get the input stream of the raw socket: " + e14.getMessage(), e14);
        }
    }

    public final void i() {
        q qVar = new q(this);
        b0 b0Var = new b0(this);
        synchronized (this.g) {
            this.j = qVar;
            this.k = b0Var;
        }
        b4.n nVar = qVar.a.d;
        int i3 = 0;
        if (nVar != null) {
            ArrayList arrayList = (ArrayList) nVar.q();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                w0 w0Var = (w0) obj;
                try {
                    try {
                        w0Var.getClass();
                    } catch (Throwable unused) {
                        w0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        b4.n nVar2 = b0Var.a.d;
        if (nVar2 != null) {
            ArrayList arrayList2 = (ArrayList) nVar2.q();
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                w0 w0Var2 = (w0) obj2;
                try {
                    try {
                        w0Var2.getClass();
                    } catch (Throwable unused3) {
                        w0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        qVar.start();
        b0Var.start();
    }

    public final void j() {
        q qVar;
        b0 b0Var;
        synchronized (this.g) {
            qVar = this.j;
            b0Var = this.k;
            this.j = null;
            this.k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (b0Var != null) {
            b0Var.g();
        }
    }
}
