// default package

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class buc {
    public final dka a;
    public final zw8 b;
    public final c5a c;
    public final xf4 d;
    public final na8 e;
    public final na8 f;
    public lg6 h;
    public guc i;
    public n19 j;
    public wyc k;
    public ArrayList l;
    public boolean m;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public fuc s;
    public fuc t;
    public d38 u;
    public final Object g = new Object();
    public final Object n = new Object();

    public buc(boolean z, String str, String str2, String str3, dka dkaVar) {
        this.a = dkaVar;
        zw8 zw8Var = new zw8((byte) 6);
        zw8Var.c = 1;
        zw8Var.b = 1;
        this.b = zw8Var;
        this.c = new c5a(str, str2, str3, z);
        xf4 xf4Var = new xf4();
        xf4Var.c = new ArrayList();
        xf4Var.a = true;
        xf4Var.b = this;
        this.d = xf4Var;
        byte b = 16;
        this.e = new na8(this, "PingSender", new pd5(b));
        this.f = new na8(this, "PongSender", new pd5(b));
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
                o15 o15Var = (o15) obj;
                try {
                    try {
                        gl.c3(new o57((Object) o15Var, r11.b, o15Var.a, o15Var.b, (byte) 5));
                    } catch (Throwable unused) {
                        o15Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            zw8 zw8Var = this.b;
            if (zw8Var.b != 1) {
                throw new cuc(1, "The current state of the WebSocket is not CREATED.");
            }
            zw8Var.b = 2;
        }
        this.d.g();
        try {
            dka dkaVar = this.a;
            try {
                dkaVar.a();
                h(dkaVar.g);
                ArrayList arrayList = this.l;
                d38 d38Var = null;
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        Object obj = arrayList.get(i);
                        i++;
                        duc ducVar = (duc) obj;
                        if (ducVar instanceof d38) {
                            d38Var = (d38) ducVar;
                            break;
                        }
                    }
                }
                this.u = d38Var;
                this.b.b = 3;
                this.d.g();
                i();
            } catch (cuc e) {
                Socket socket = dkaVar.g;
                if (socket != null) {
                    try {
                        socket.close();
                    } catch (IOException unused) {
                    }
                }
                throw e;
            }
        } catch (cuc e2) {
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
            int F = ug8.F(this.b.b);
            byte b = 1;
            int i = 4;
            if (F != 0) {
                if (F != 2) {
                    return;
                }
                zw8 zw8Var = this.b;
                zw8Var.b = 4;
                if (zw8Var.c == 1) {
                    zw8Var.c = 3;
                }
                g(fuc.a(1000, null));
                this.d.g();
                j();
                return;
            }
            xr2 xr2Var = new xr2("FinishThread", this, i, b);
            xf4 xf4Var = xr2Var.a.d;
            if (xf4Var != null) {
                ArrayList arrayList = (ArrayList) xf4Var.u();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    o15 o15Var = (o15) obj;
                    try {
                        try {
                            o15Var.getClass();
                        } catch (Throwable unused) {
                            o15Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            xr2Var.start();
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
        xf4 xf4Var = this.d;
        fuc fucVar = this.s;
        fuc fucVar2 = this.t;
        int i = 0;
        boolean z = this.b.c == 2;
        ArrayList arrayList = (ArrayList) xf4Var.u();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            o15 o15Var = (o15) obj;
            try {
                try {
                    o15Var.a((buc) xf4Var.b, fucVar, fucVar2, z);
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                o15Var.getClass();
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
        na8 na8Var = this.e;
        synchronized (na8Var) {
        }
        na8Var.e();
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

    public final void g(fuc fucVar) {
        if (fucVar != null) {
            synchronized (this.b) {
                int i = this.b.b;
                if (i == 3 || i == 4) {
                    wyc wycVar = this.k;
                    if (wycVar == null) {
                        return;
                    }
                    wycVar.e(fucVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0316  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeMap h(Socket socket) {
        int i;
        duc ducVar;
        duc ducVar2;
        String str;
        try {
            byte b = 1;
            lg6 lg6Var = new lg6(new BufferedInputStream(socket.getInputStream()), b);
            try {
                guc gucVar = new guc(new BufferedOutputStream(socket.getOutputStream()));
                byte[] bArr = new byte[16];
                yd7.a.nextBytes(bArr);
                String a = v21.a(bArr);
                c5a c5aVar = this.c;
                c5aVar.e = a;
                String y = tb4.y("GET ", (String) c5aVar.d, " HTTP/1.1");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new String[]{"Host", (String) c5aVar.c});
                arrayList.add(c5a.h);
                arrayList.add(c5a.n);
                arrayList.add(c5a.r);
                arrayList.add(new String[]{"Sec-WebSocket-Key", (String) c5aVar.e});
                String str2 = (String) c5aVar.b;
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(new String[]{"Authorization", "Basic " + v21.a(yd7.a(str2))});
                }
                StringBuilder k = b00.k(y, "\r\n");
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
                    o15 o15Var = (o15) obj2;
                    try {
                        try {
                            o15Var.getClass();
                        } catch (Throwable unused) {
                            o15Var.getClass();
                        }
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    gucVar.write(yd7.a(sb));
                    gucVar.flush();
                    s34 s34Var = new s34((Object) this, (byte) 7);
                    try {
                        String b2 = yd7.b(lg6Var);
                        if (b2 == null || b2.length() == 0) {
                            throw new cuc(6, "The status line of the opening handshake response is empty.");
                        }
                        try {
                            ng5 ng5Var = new ng5(b2, (byte) 2);
                            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                            StringBuilder sb2 = null;
                            while (true) {
                                try {
                                    String b3 = yd7.b(lg6Var);
                                    if (b3 == null || b3.length() == 0) {
                                        break;
                                    }
                                    char charAt = b3.charAt(0);
                                    if (charAt != ' ' && charAt != '\t') {
                                        if (sb2 != null) {
                                            s34.K(sb2.toString(), treeMap);
                                        }
                                        sb2 = new StringBuilder(b3);
                                    } else if (sb2 != null) {
                                        sb2.append(b3.replaceAll("^[ \t]+", " "));
                                    }
                                } catch (IOException e) {
                                    throw new cuc(9, "An error occurred while HTTP header section was being read: " + e.getMessage(), e);
                                }
                            }
                            if (sb2 != null) {
                                s34.K(sb2.toString(), treeMap);
                            }
                            if (ng5Var.b != 101) {
                                try {
                                    i = Integer.parseInt((String) ((List) treeMap.get("Content-Length")).get(0));
                                } catch (Exception unused3) {
                                    i = -1;
                                }
                                if (i > 0) {
                                    try {
                                        lg6Var.b(i, new byte[i]);
                                    } catch (Throwable unused4) {
                                    }
                                }
                                throw new nq7(8, "The status code of the opening handshake response is not '101 Switching Protocols'. The status line is: " + ng5Var, ng5Var);
                            }
                            List list = (List) treeMap.get("Upgrade");
                            if (list == null || list.size() == 0) {
                                throw new nq7(10, "The opening handshake response does not contain 'Upgrade' header.", ng5Var);
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
                                            throw new nq7(12, "The opening handshake response does not contain 'Connection' header.", ng5Var);
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
                                                        throw new nq7(14, "The opening handshake response does not contain 'Sec-WebSocket-Accept' header.", ng5Var);
                                                    }
                                                    try {
                                                        if (!v21.a(MessageDigest.getInstance("SHA-1").digest(yd7.a(tb4.o(a, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")))).equals((String) list3.get(0))) {
                                                            throw new nq7(15, "The value of 'Sec-WebSocket-Accept' header is different from the expected one.", ng5Var);
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
                                                                        if (nve.a(str4)) {
                                                                            if ("permessage-deflate".equals(str4)) {
                                                                                d38 d38Var = new d38(str4);
                                                                                d38Var.c = 32768;
                                                                                ducVar2 = d38Var;
                                                                            } else {
                                                                                ducVar2 = new duc(str4);
                                                                            }
                                                                            int i7 = b;
                                                                            while (i7 < split4.length) {
                                                                                String[] split5 = split4[i7].split("\\s*=\\s*", 2);
                                                                                if (split5.length != 0 && split5[0].length() != 0) {
                                                                                    String str5 = split5[0];
                                                                                    if (nve.a(str5)) {
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
                                                                                        if (str == null || nve.a(str)) {
                                                                                            if (!nve.a(str5)) {
                                                                                                w26.j("'key' is not a valid token.");
                                                                                                return null;
                                                                                            }
                                                                                            if (str != null && !nve.a(str)) {
                                                                                                w26.j("'value' is not a valid token.");
                                                                                                return null;
                                                                                            }
                                                                                            ducVar2.b.put(str5, str);
                                                                                        }
                                                                                    } else {
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                                i7++;
                                                                                b = 1;
                                                                            }
                                                                            ducVar = ducVar2;
                                                                            if (ducVar != null) {
                                                                                throw new nq7(16, b00.h("The value in 'Sec-WebSocket-Extensions' failed to be parsed: ", str3), ng5Var);
                                                                            }
                                                                            String str6 = ducVar.a;
                                                                            c5a c5aVar2 = ((buc) s34Var.b).c;
                                                                            if (str6 == null) {
                                                                                c5aVar2.getClass();
                                                                            }
                                                                            throw new nq7(17, b00.h("The extension contained in the Sec-WebSocket-Extensions header is not supported: ", str6), ng5Var);
                                                                        }
                                                                    }
                                                                }
                                                                ducVar = null;
                                                                if (ducVar != null) {
                                                                }
                                                            }
                                                        }
                                                        int size3 = arrayList3.size();
                                                        duc ducVar3 = null;
                                                        while (i2 < size3) {
                                                            Object obj3 = arrayList3.get(i2);
                                                            i2++;
                                                            duc ducVar4 = (duc) obj3;
                                                            if (ducVar4 instanceof d38) {
                                                                if (ducVar3 != null) {
                                                                    throw new nq7(18, b00.i("'", ducVar3.a, "' extension and '", ducVar4.a, "' extension conflict with each other."), ng5Var);
                                                                }
                                                                ducVar3 = ducVar4;
                                                            }
                                                        }
                                                        ((buc) s34Var.b).l = arrayList3;
                                                    }
                                                    s34Var.c0(ng5Var, treeMap);
                                                    this.h = lg6Var;
                                                    this.i = gucVar;
                                                    return treeMap;
                                                }
                                                i6++;
                                                b = 1;
                                            }
                                        }
                                        throw new nq7(13, "'Upgrade' was not found in 'Connection' header.", ng5Var);
                                    }
                                    i5++;
                                    b = 1;
                                }
                            }
                            throw new nq7(11, "'websocket' was not found in 'Upgrade' header.", ng5Var);
                        } catch (Exception unused6) {
                            throw new cuc(7, "The status line of the opening handshake response is badly formatted. The status line is: ".concat(b2));
                        }
                    } catch (IOException e2) {
                        throw new cuc(5, "Failed to read an opening handshake response from the server: " + e2.getMessage(), e2);
                    }
                } catch (IOException e3) {
                    throw new cuc(4, "Failed to send an opening handshake request to the server: " + e3.getMessage(), e3);
                }
            } catch (IOException e4) {
                throw new cuc(3, "Failed to get the output stream from the raw socket: " + e4.getMessage(), e4);
            }
        } catch (IOException e5) {
            throw new cuc(2, "Failed to get the input stream of the raw socket: " + e5.getMessage(), e5);
        }
    }

    public final void i() {
        n19 n19Var = new n19(this);
        wyc wycVar = new wyc(this);
        synchronized (this.g) {
            this.j = n19Var;
            this.k = wycVar;
        }
        xf4 xf4Var = n19Var.a.d;
        int i = 0;
        if (xf4Var != null) {
            ArrayList arrayList = (ArrayList) xf4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o15 o15Var = (o15) obj;
                try {
                    try {
                        o15Var.getClass();
                    } catch (Throwable unused) {
                        o15Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        xf4 xf4Var2 = wycVar.a.d;
        if (xf4Var2 != null) {
            ArrayList arrayList2 = (ArrayList) xf4Var2.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o15 o15Var2 = (o15) obj2;
                try {
                    try {
                        o15Var2.getClass();
                    } catch (Throwable unused3) {
                        o15Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
        }
        n19Var.start();
        wycVar.start();
    }

    public final void j() {
        n19 n19Var;
        wyc wycVar;
        synchronized (this.g) {
            n19Var = this.j;
            wycVar = this.k;
            this.j = null;
            this.k = null;
        }
        if (n19Var != null) {
            n19Var.h();
        }
        if (wycVar != null) {
            wycVar.f();
        }
    }
}
