package lc;

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
import k2.m0;
import org.telegram.messenger.i0;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Wallet.y0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v {
    public final t a;
    public final ac.g b;
    public final h c;
    public final ac.a d;
    public final p e;
    public final p f;
    public z h;
    public a0 i;
    public q j;
    public c0 k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public y s;
    public y t;
    public o u;
    public final Object g = new Object();
    public final Object n = new Object();

    public v(boolean z10, String str, String str2, String str3, t tVar) {
        this.a = tVar;
        ac.g gVar = new ac.g();
        gVar.b = 1;
        gVar.a = 1;
        this.b = gVar;
        h hVar = new h();
        hVar.a = str;
        hVar.b = str2;
        hVar.c = str3;
        URI.create((z10 ? "wss" : "ws") + "://" + str2 + str3);
        this.c = hVar;
        ac.a aVar = new ac.a();
        aVar.c = new ArrayList();
        aVar.a = true;
        aVar.b = this;
        this.d = aVar;
        this.e = new p(this, "PingSender", new t7.u(10));
        this.f = new p(this, "PongSender", new t7.u(10));
    }

    public final void a() {
        synchronized (this.n) {
            try {
                if (this.m) {
                    return;
                }
                this.m = true;
                ac.a aVar = this.d;
                ArrayList arrayList = (ArrayList) aVar.o();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    y0 y0Var = (y0) obj;
                    try {
                        try {
                            int i11 = 3;
                            i0.g3(new org.telegram.ui.z(y0Var.a, i11, y0Var.b, y0Var, (v) aVar.b));
                        } catch (Throwable unused) {
                            y0Var.getClass();
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
            ac.g gVar = this.b;
            if (gVar.a != 1) {
                throw new w(1, "The current state of the WebSocket is not CREATED.");
            }
            gVar.a = 2;
        }
        this.d.f();
        try {
            t tVar = this.a;
            try {
                tVar.a();
                h(tVar.g);
                ArrayList arrayList = this.l;
                o oVar = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i10);
                        i10++;
                        x xVar = (x) obj;
                        if (xVar instanceof o) {
                            oVar = (o) xVar;
                            break;
                        }
                    }
                }
                this.u = oVar;
                this.b.a = 3;
                this.d.f();
                i();
            } catch (w e) {
                Socket socket = tVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (w e7) {
            Socket socket2 = this.a.g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.b.a = 5;
            this.d.f();
            throw e7;
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                int c10 = m1.j.c(this.b.a);
                int i10 = 4;
                if (c10 != 0) {
                    if (c10 != 2) {
                        return;
                    }
                    ac.g gVar = this.b;
                    gVar.a = 4;
                    if (gVar.b == 1) {
                        gVar.b = 3;
                    }
                    g(y.a(1000, null));
                    this.d.f();
                    j();
                    return;
                }
                b bVar = new b("FinishThread", this, i10, 1);
                ac.a aVar = bVar.a.d;
                if (aVar != null) {
                    ArrayList arrayList = (ArrayList) aVar.o();
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        y0 y0Var = (y0) obj;
                        try {
                            try {
                                y0Var.getClass();
                            } catch (Throwable unused) {
                                y0Var.getClass();
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
        this.d.f();
        ac.a aVar = this.d;
        y yVar = this.s;
        y yVar2 = this.t;
        int i10 = 0;
        boolean z10 = this.b.b == 2;
        ArrayList arrayList = (ArrayList) aVar.o();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y0 y0Var = (y0) obj;
            try {
                try {
                    y0Var.a((v) aVar.b, yVar, yVar2, z10);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                y0Var.getClass();
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

    public final void g(y yVar) {
        if (yVar == null) {
            return;
        }
        synchronized (this.b) {
            try {
                int i10 = this.b.a;
                if (i10 == 3 || i10 == 4) {
                    c0 c0Var = this.k;
                    if (c0Var == null) {
                        return;
                    }
                    c0Var.f(yVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeMap h(Socket socket) {
        int i10;
        int i11;
        x xVar;
        x xVar2;
        String str;
        try {
            z zVar = new z(new BufferedInputStream(socket.getInputStream()), 0);
            try {
                a0 a0Var = new a0(new BufferedOutputStream(socket.getOutputStream()));
                byte[] bArr = new byte[16];
                k.a.nextBytes(bArr);
                String a2 = d.a(bArr);
                h hVar = this.c;
                hVar.d = a2;
                String n10 = a1.g.n("GET ", (String) hVar.c, " HTTP/1.1");
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
                StringBuilder i12 = sc.e.i(n10, "\r\n");
                int size = arrayList.size();
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    i10 = 1;
                    if (i14 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i14);
                    i14++;
                    String[] strArr = (String[]) obj;
                    i12.append(strArr[0]);
                    i12.append(": ");
                    i12.append(strArr[1]);
                    i12.append("\r\n");
                }
                i12.append("\r\n");
                String sb2 = i12.toString();
                ArrayList arrayList2 = (ArrayList) this.d.o();
                int size2 = arrayList2.size();
                int i15 = 0;
                while (i15 < size2) {
                    Object obj2 = arrayList2.get(i15);
                    i15++;
                    y0 y0Var = (y0) obj2;
                    try {
                        try {
                            y0Var.getClass();
                        } catch (Throwable unused) {
                            y0Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    a0Var.write(k.a(sb2));
                    a0Var.flush();
                    m0 m0Var = new m0(this);
                    try {
                        String b10 = k.b(zVar);
                        if (b10 == null || b10.length() == 0) {
                            throw new w(6, "The status line of the opening handshake response is empty.");
                        }
                        try {
                            ba.a aVar = new ba.a(b10, 3);
                            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                            StringBuilder sb3 = null;
                            while (true) {
                                try {
                                    String b11 = k.b(zVar);
                                    if (b11 == null || b11.length() == 0) {
                                        break;
                                    }
                                    char charAt = b11.charAt(0);
                                    if (charAt != ' ' && charAt != '\t') {
                                        if (sb3 != null) {
                                            m0.q0(sb3.toString(), treeMap);
                                        }
                                        sb3 = new StringBuilder(b11);
                                    } else if (sb3 != null) {
                                        sb3.append(b11.replaceAll("^[ \t]+", " "));
                                    }
                                } catch (IOException e) {
                                    throw new w(9, "An error occurred while HTTP header section was being read: " + e.getMessage(), e);
                                }
                            }
                            if (sb3 != null) {
                                m0.q0(sb3.toString(), treeMap);
                            }
                            if (aVar.c != 101) {
                                try {
                                    i11 = Integer.parseInt((String) ((List) treeMap.get("Content-Length")).get(0));
                                } catch (Exception unused3) {
                                    i11 = -1;
                                }
                                if (i11 > 0) {
                                    try {
                                        zVar.b(i11, new byte[i11]);
                                    } catch (Throwable unused4) {
                                    }
                                }
                                throw new n(8, "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + aVar, aVar);
                            }
                            List list = (List) treeMap.get("Upgrade");
                            if (list == null || list.size() == 0) {
                                throw new n(10, "The opening handshake response does not contain 'Upgrade' header.", aVar);
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String[] split = ((String) it.next()).split("\\s*,\\s*");
                                int length = split.length;
                                int i16 = 0;
                                while (i16 < length) {
                                    if ("websocket".equalsIgnoreCase(split[i16])) {
                                        List list2 = (List) treeMap.get("Connection");
                                        if (list2 == null || list2.size() == 0) {
                                            throw new n(12, "The opening handshake response does not contain 'Connection' header.", aVar);
                                        }
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            String[] split2 = ((String) it2.next()).split("\\s*,\\s*");
                                            int length2 = split2.length;
                                            int i17 = 0;
                                            while (i17 < length2) {
                                                if ("Upgrade".equalsIgnoreCase(split2[i17])) {
                                                    List list3 = (List) treeMap.get("Sec-WebSocket-Accept");
                                                    if (list3 == null) {
                                                        throw new n(14, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", aVar);
                                                    }
                                                    try {
                                                        if (!d.a(MessageDigest.getInstance("SHA-1").digest(k.a(sc.e.A(a2, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")))).equals((String) list3.get(0))) {
                                                            throw new n(15, "The value of 'Sec-WebSocket-Accept' header is different from the expected one.", aVar);
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
                                                                                xVar = oVar;
                                                                            } else {
                                                                                xVar = new x(str4);
                                                                            }
                                                                            int i18 = i10;
                                                                            while (i18 < split4.length) {
                                                                                String[] split5 = split4[i18].split("\\s*=\\s*", 2);
                                                                                if (split5.length != 0 && split5[0].length() != 0) {
                                                                                    String str5 = split5[0];
                                                                                    if (d.b(str5)) {
                                                                                        if (split5.length == 2 && (str = split5[i10]) != null) {
                                                                                            int length3 = str.length();
                                                                                            if (length3 >= 2 && str.charAt(0) == '\"') {
                                                                                                int i19 = length3 - 1;
                                                                                                if (str.charAt(i19) == '\"') {
                                                                                                    str = str.substring(i10, i19);
                                                                                                    if (str != null) {
                                                                                                        if (str.indexOf(92) >= 0) {
                                                                                                            int length4 = str.length();
                                                                                                            StringBuilder sb4 = new StringBuilder();
                                                                                                            boolean z10 = false;
                                                                                                            for (int i20 = 0; i20 < length4; i20++) {
                                                                                                                char charAt2 = str.charAt(i20);
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
                                                                                                xVar.b.put(str5, str);
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
                                                                                i18++;
                                                                                i10 = 1;
                                                                            }
                                                                            xVar2 = xVar;
                                                                            if (xVar2 != null) {
                                                                                throw new n(16, sc.e.h("The value in 'Sec-WebSocket-Extensions' failed to be parsed: ", str3), aVar);
                                                                            }
                                                                            String str6 = xVar2.a;
                                                                            h hVar2 = ((v) m0Var.a).c;
                                                                            if (str6 == null) {
                                                                                hVar2.getClass();
                                                                            }
                                                                            throw new n(17, sc.e.h("The extension contained in the Sec-WebSocket-Extensions header is not supported: ", str6), aVar);
                                                                        }
                                                                    }
                                                                }
                                                                xVar2 = null;
                                                                if (xVar2 != null) {
                                                                }
                                                            }
                                                        }
                                                        int size3 = arrayList3.size();
                                                        x xVar3 = null;
                                                        while (i13 < size3) {
                                                            Object obj3 = arrayList3.get(i13);
                                                            i13++;
                                                            x xVar4 = (x) obj3;
                                                            if (xVar4 instanceof o) {
                                                                if (xVar3 != null) {
                                                                    throw new n(18, f1.o("'", xVar3.a, "' extension and '", xVar4.a, "' extension conflict with each other."), aVar);
                                                                }
                                                                xVar3 = xVar4;
                                                            }
                                                        }
                                                        ((v) m0Var.a).l = arrayList3;
                                                    }
                                                    m0Var.B0(aVar, treeMap);
                                                    this.h = zVar;
                                                    this.i = a0Var;
                                                    return treeMap;
                                                }
                                                i17++;
                                                i10 = 1;
                                            }
                                        }
                                        throw new n(13, "'Upgrade' was not found in 'Connection' header.", aVar);
                                    }
                                    i16++;
                                    i10 = 1;
                                }
                            }
                            throw new n(11, "'websocket' was not found in 'Upgrade' header.", aVar);
                        } catch (Exception unused6) {
                            throw new w(7, "The status line of the opening handshake response is badly formatted. The status line is: ".concat(b10));
                        }
                    } catch (IOException e7) {
                        throw new w(5, "Failed to read an opening handshake response from the server: " + e7.getMessage(), e7);
                    }
                } catch (IOException e10) {
                    throw new w(4, "Failed to send an opening handshake request to the server: " + e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                throw new w(3, "Failed to get the output stream from the raw socket: " + e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            throw new w(2, "Failed to get the input stream of the raw socket: " + e12.getMessage(), e12);
        }
    }

    public final void i() {
        q qVar = new q(this);
        c0 c0Var = new c0(this);
        synchronized (this.g) {
            this.j = qVar;
            this.k = c0Var;
        }
        ac.a aVar = qVar.a.d;
        int i10 = 0;
        if (aVar != null) {
            ArrayList arrayList = (ArrayList) aVar.o();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                y0 y0Var = (y0) obj;
                try {
                    try {
                        y0Var.getClass();
                    } catch (Throwable unused) {
                        y0Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        ac.a aVar2 = c0Var.a.d;
        if (aVar2 != null) {
            ArrayList arrayList2 = (ArrayList) aVar2.o();
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Object obj2 = arrayList2.get(i10);
                i10++;
                y0 y0Var2 = (y0) obj2;
                try {
                    try {
                        y0Var2.getClass();
                    } catch (Throwable unused3) {
                        y0Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        qVar.start();
        c0Var.start();
    }

    public final void j() {
        q qVar;
        c0 c0Var;
        synchronized (this.g) {
            qVar = this.j;
            c0Var = this.k;
            this.j = null;
            this.k = null;
        }
        if (qVar != null) {
            qVar.i();
        }
        if (c0Var != null) {
            c0Var.g();
        }
    }
}
