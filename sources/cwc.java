// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class cwc {
    public final ema a;
    public final az8 b;
    public final e7a c;
    public final yh4 d;
    public final qc8 e;
    public final qc8 f;
    public li6 h;
    public hwc i;
    public q39 j;
    public x0d k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public gwc s;
    public gwc t;
    public f58 u;
    public final Object g = new Object();
    public final Object n = new Object();

    public cwc(boolean z, String str, String str2, String str3, ema emaVar) {
        this.a = emaVar;
        az8 az8Var = new az8((byte) 6);
        az8Var.c = 1;
        az8Var.b = 1;
        this.b = az8Var;
        e7a e7aVar = new e7a();
        e7aVar.a = str;
        e7aVar.b = str2;
        e7aVar.c = str3;
        URI.create((z ? "wss" : "ws") + "://" + str2 + str3);
        this.c = e7aVar;
        yh4 yh4Var = new yh4();
        yh4Var.c = new ArrayList();
        yh4Var.a = true;
        yh4Var.b = this;
        this.d = yh4Var;
        byte b = 16;
        this.e = new qc8(this, "PingSender", new nf5(b));
        this.f = new qc8(this, "PongSender", new nf5(b));
    }

    public final void a() {
        synchronized (this.n) {
            if (this.m) {
                return;
            }
            this.m = true;
            ArrayList arrayList = (ArrayList) this.d.u();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o35 o35Var = (o35) obj;
                try {
                    try {
                        gm.c3(new o77((Object) o35Var, r11.b, o35Var.a, o35Var.b, (byte) 5));
                    } catch (Throwable unused) {
                        o35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            az8 az8Var = this.b;
            if (az8Var.b != 1) {
                throw new dwc(1, "The current state of the WebSocket is not CREATED.");
            }
            az8Var.b = 2;
        }
        this.d.g();
        try {
            ema emaVar = this.a;
            try {
                emaVar.a();
                h(emaVar.g);
                ArrayList arrayList = this.l;
                f58 f58Var = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        ewc ewcVar = (ewc) obj;
                        if (ewcVar instanceof f58) {
                            f58Var = (f58) ewcVar;
                            break;
                        }
                    }
                }
                this.u = f58Var;
                this.b.b = 3;
                this.d.g();
                i();
            } catch (dwc e) {
                Socket socket = emaVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (dwc e2) {
            Socket socket2 = this.a.g;
            if (socket2 != null) {
                try {
                    socket2.close();
                } catch (Throwable unused2) {
                }
            }
            this.b.b = 5;
            this.d.g();
            throw e2;
        }
    }

    public final void c() {
        synchronized (this.b) {
            int F = wi8.F(this.b.b);
            byte b = 1;
            int i = 4;
            if (F != 0) {
                if (F != 2) {
                    return;
                }
                az8 az8Var = this.b;
                az8Var.b = 4;
                if (az8Var.c == 1) {
                    az8Var.c = 3;
                }
                g(gwc.a(1000, null));
                this.d.g();
                j();
                return;
            }
            it2 it2Var = new it2("FinishThread", this, i, b);
            yh4 yh4Var = it2Var.a.d;
            if (yh4Var != null) {
                ArrayList arrayList = (ArrayList) yh4Var.u();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    o35 o35Var = (o35) obj;
                    try {
                        try {
                            o35Var.getClass();
                        } catch (Throwable unused) {
                            o35Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            it2Var.start();
        }
    }

    public final void d() {
        this.e.g();
        this.f.g();
        Socket socket = this.a.g;
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
        synchronized (this.b) {
            this.b.b = 5;
        }
        this.d.g();
        yh4 yh4Var = this.d;
        gwc gwcVar = this.s;
        gwc gwcVar2 = this.t;
        int i = 0;
        boolean z = this.b.c == 2;
        ArrayList arrayList = (ArrayList) yh4Var.u();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o35 o35Var = (o35) obj;
            try {
                try {
                    o35Var.a((cwc) yh4Var.b, gwcVar, gwcVar2, z);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                o35Var.getClass();
            }
        }
    }

    public final void e() {
        boolean z;
        synchronized (this.g) {
            this.o = true;
            z = this.p;
        }
        a();
        if (z) {
            f();
        }
    }

    public final void f() {
        qc8 qc8Var = this.e;
        synchronized (qc8Var) {
        }
        qc8Var.e();
        this.f.f();
    }

    public final void finalize() {
        boolean z;
        synchronized (this.b) {
            z = this.b.b == 1;
        }
        if (z) {
            d();
        }
        super.finalize();
    }

    public final void g(gwc gwcVar) {
        if (gwcVar != null) {
            synchronized (this.b) {
                int i = this.b.b;
                if (i == 3 || i == 4) {
                    x0d x0dVar = this.k;
                    if (x0dVar == null) {
                        return;
                    }
                    x0dVar.e(gwcVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeMap h(Socket socket) {
        int i;
        ewc ewcVar;
        ewc ewcVar2;
        String str;
        try {
            byte b = 1;
            li6 li6Var = new li6(new BufferedInputStream(socket.getInputStream()), b);
            try {
                hwc hwcVar = new hwc(new BufferedOutputStream(socket.getOutputStream()));
                byte[] bArr = new byte[16];
                ag7.a.nextBytes(bArr);
                String a = d41.a(bArr);
                e7a e7aVar = this.c;
                e7aVar.d = a;
                String o = kt6.o("GET ", (String) e7aVar.c, " HTTP/1.1");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new String[]{"Host", (String) e7aVar.b});
                arrayList.add(e7a.f);
                arrayList.add(e7a.h);
                arrayList.add(e7a.n);
                arrayList.add(new String[]{"Sec-WebSocket-Key", (String) e7aVar.d});
                String str2 = (String) e7aVar.a;
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(new String[]{"Authorization", "Basic " + d41.a(ag7.a(str2))});
                }
                StringBuilder k = b10.k(o, "\r\n");
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    String[] strArr = (String[]) obj;
                    k.append(strArr[0]);
                    k.append(": ");
                    k.append(strArr[1]);
                    k.append("\r\n");
                }
                k.append("\r\n");
                String sb = k.toString();
                ArrayList arrayList2 = (ArrayList) this.d.u();
                int size2 = arrayList2.size();
                int i4 = 0;
                while (i4 < size2) {
                    Object obj2 = arrayList2.get(i4);
                    i4++;
                    o35 o35Var = (o35) obj2;
                    try {
                        try {
                            o35Var.getClass();
                        } catch (Throwable unused) {
                            o35Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    hwcVar.write(ag7.a(sb));
                    hwcVar.flush();
                    fk3 fk3Var = new fk3(this);
                    try {
                        String b2 = ag7.b(li6Var);
                        if (b2 == null || b2.length() == 0) {
                            throw new dwc(6, "The status line of the opening handshake response is empty.");
                        }
                        try {
                            mi5 mi5Var = new mi5(b2, (byte) 2);
                            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                            StringBuilder sb2 = null;
                            while (true) {
                                try {
                                    String b3 = ag7.b(li6Var);
                                    if (b3 == null || b3.length() == 0) {
                                        break;
                                    }
                                    char charAt = b3.charAt(0);
                                    if (charAt != ' ' && charAt != '\t') {
                                        if (sb2 != null) {
                                            fk3.Y(sb2.toString(), treeMap);
                                        }
                                        sb2 = new StringBuilder(b3);
                                    } else if (sb2 != null) {
                                        sb2.append(b3.replaceAll("^[ \t]+", " "));
                                    }
                                } catch (IOException e) {
                                    throw new dwc(9, "An error occurred while HTTP header section was being read: " + e.getMessage(), e);
                                }
                            }
                            if (sb2 != null) {
                                fk3.Y(sb2.toString(), treeMap);
                            }
                            if (mi5Var.b != 101) {
                                try {
                                    i = Integer.parseInt((String) ((List) treeMap.get("Content-Length")).get(0));
                                } catch (Exception unused3) {
                                    i = -1;
                                }
                                if (i > 0) {
                                    try {
                                        li6Var.b(i, new byte[i]);
                                    } catch (Throwable unused4) {
                                    }
                                }
                                throw new qs7(8, "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + mi5Var, mi5Var);
                            }
                            List list = (List) treeMap.get("Upgrade");
                            if (list == null || list.size() == 0) {
                                throw new qs7(10, "The opening handshake response does not contain 'Upgrade' header.", mi5Var);
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String[] split = ((String) it.next()).split("\\s*,\\s*");
                                int length = split.length;
                                int i5 = 0;
                                while (i5 < length) {
                                    if ("websocket".equalsIgnoreCase(split[i5])) {
                                        List list2 = (List) treeMap.get("Connection");
                                        if (list2 == null || list2.size() == 0) {
                                            throw new qs7(12, "The opening handshake response does not contain 'Connection' header.", mi5Var);
                                        }
                                        Iterator it2 = list2.iterator();
                                        while (it2.hasNext()) {
                                            String[] split2 = ((String) it2.next()).split("\\s*,\\s*");
                                            int length2 = split2.length;
                                            int i6 = 0;
                                            while (i6 < length2) {
                                                if ("Upgrade".equalsIgnoreCase(split2[i6])) {
                                                    List list3 = (List) treeMap.get("Sec-WebSocket-Accept");
                                                    if (list3 == null) {
                                                        throw new qs7(14, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", mi5Var);
                                                    }
                                                    try {
                                                        if (!d41.a(MessageDigest.getInstance("SHA-1").digest(ag7.a(td4.p(a, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")))).equals((String) list3.get(0))) {
                                                            throw new qs7(15, "The value of 'Sec-WebSocket-Accept' header is different from the expected one.", mi5Var);
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
                                                                        if (pxe.a(str4)) {
                                                                            if ("permessage-deflate".equals(str4)) {
                                                                                f58 f58Var = new f58(str4);
                                                                                f58Var.c = 32768;
                                                                                ewcVar2 = f58Var;
                                                                            } else {
                                                                                ewcVar2 = new ewc(str4);
                                                                            }
                                                                            int i7 = b;
                                                                            while (i7 < split4.length) {
                                                                                String[] split5 = split4[i7].split("\\s*=\\s*", 2);
                                                                                if (split5.length != 0 && split5[0].length() != 0) {
                                                                                    String str5 = split5[0];
                                                                                    if (pxe.a(str5)) {
                                                                                        if (split5.length != 2 || (str = split5[b]) == null) {
                                                                                            str = null;
                                                                                        } else {
                                                                                            int length3 = str.length();
                                                                                            if (length3 >= 2 && str.charAt(0) == '\"') {
                                                                                                int i8 = length3 - 1;
                                                                                                if (str.charAt(i8) == '\"') {
                                                                                                    str = str.substring(b, i8);
                                                                                                    if (str.indexOf(92) >= 0) {
                                                                                                        int length4 = str.length();
                                                                                                        StringBuilder sb3 = new StringBuilder();
                                                                                                        boolean z = false;
                                                                                                        for (int i9 = 0; i9 < length4; i9++) {
                                                                                                            char charAt2 = str.charAt(i9);
                                                                                                            if (charAt2 != '\\' || z) {
                                                                                                                sb3.append(charAt2);
                                                                                                                z = false;
                                                                                                            } else {
                                                                                                                z = true;
                                                                                                            }
                                                                                                        }
                                                                                                        str = sb3.toString();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (str == null || pxe.a(str)) {
                                                                                            if (!pxe.a(str5)) {
                                                                                                u36.j("'key' is not a valid token.");
                                                                                                return null;
                                                                                            }
                                                                                            if (str != null && !pxe.a(str)) {
                                                                                                u36.j("'value' is not a valid token.");
                                                                                                return null;
                                                                                            }
                                                                                            ewcVar2.b.put(str5, str);
                                                                                        }
                                                                                    } else {
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                i7++;
                                                                                b = 1;
                                                                            }
                                                                            ewcVar = ewcVar2;
                                                                            if (ewcVar != null) {
                                                                                throw new qs7(16, b10.h("The value in 'Sec-WebSocket-Extensions' failed to be parsed: ", str3), mi5Var);
                                                                            }
                                                                            String str6 = ewcVar.a;
                                                                            e7a e7aVar2 = ((cwc) fk3Var.a).c;
                                                                            if (str6 == null) {
                                                                                e7aVar2.getClass();
                                                                            }
                                                                            throw new qs7(17, b10.h("The extension contained in the Sec-WebSocket-Extensions header is not supported: ", str6), mi5Var);
                                                                        }
                                                                    }
                                                                }
                                                                ewcVar = null;
                                                                if (ewcVar != null) {
                                                                }
                                                            }
                                                        }
                                                        int size3 = arrayList3.size();
                                                        ewc ewcVar3 = null;
                                                        while (i2 < size3) {
                                                            Object obj3 = arrayList3.get(i2);
                                                            i2++;
                                                            ewc ewcVar4 = (ewc) obj3;
                                                            if (ewcVar4 instanceof f58) {
                                                                if (ewcVar3 != null) {
                                                                    throw new qs7(18, b10.i("'", ewcVar3.a, "' extension and '", ewcVar4.a, "' extension conflict with each other."), mi5Var);
                                                                }
                                                                ewcVar3 = ewcVar4;
                                                            }
                                                        }
                                                        ((cwc) fk3Var.a).l = arrayList3;
                                                    }
                                                    fk3Var.p0(mi5Var, treeMap);
                                                    this.h = li6Var;
                                                    this.i = hwcVar;
                                                    return treeMap;
                                                }
                                                i6++;
                                                b = 1;
                                            }
                                        }
                                        throw new qs7(13, "'Upgrade' was not found in 'Connection' header.", mi5Var);
                                    }
                                    i5++;
                                    b = 1;
                                }
                            }
                            throw new qs7(11, "'websocket' was not found in 'Upgrade' header.", mi5Var);
                        } catch (Exception unused6) {
                            throw new dwc(7, "The status line of the opening handshake response is badly formatted. The status line is: ".concat(b2));
                        }
                    } catch (IOException e2) {
                        throw new dwc(5, "Failed to read an opening handshake response from the server: " + e2.getMessage(), e2);
                    }
                } catch (IOException e3) {
                    throw new dwc(4, "Failed to send an opening handshake request to the server: " + e3.getMessage(), e3);
                }
            } catch (IOException e4) {
                throw new dwc(3, "Failed to get the output stream from the raw socket: " + e4.getMessage(), e4);
            }
        } catch (IOException e5) {
            throw new dwc(2, "Failed to get the input stream of the raw socket: " + e5.getMessage(), e5);
        }
    }

    public final void i() {
        q39 q39Var = new q39(this);
        x0d x0dVar = new x0d(this);
        synchronized (this.g) {
            this.j = q39Var;
            this.k = x0dVar;
        }
        yh4 yh4Var = q39Var.a.d;
        int i = 0;
        if (yh4Var != null) {
            ArrayList arrayList = (ArrayList) yh4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o35 o35Var = (o35) obj;
                try {
                    try {
                        o35Var.getClass();
                    } catch (Throwable unused) {
                        o35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        yh4 yh4Var2 = x0dVar.a.d;
        if (yh4Var2 != null) {
            ArrayList arrayList2 = (ArrayList) yh4Var2.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o35 o35Var2 = (o35) obj2;
                try {
                    try {
                        o35Var2.getClass();
                    } catch (Throwable unused3) {
                        o35Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        q39Var.start();
        x0dVar.start();
    }

    public final void j() {
        q39 q39Var;
        x0d x0dVar;
        synchronized (this.g) {
            q39Var = this.j;
            x0dVar = this.k;
            this.j = null;
            this.k = null;
        }
        if (q39Var != null) {
            q39Var.h();
        }
        if (x0dVar != null) {
            x0dVar.f();
        }
    }
}
