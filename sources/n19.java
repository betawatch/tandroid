// default package

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class n19 extends huc {
    public boolean b;
    public fuc c;
    public final ArrayList d;
    public final d38 e;
    public final Object f;
    public Timer h;
    public aw3 n;
    public short r;
    public boolean s;

    public n19(buc bucVar) {
        super("ReadingThread", bucVar, 1);
        this.d = new ArrayList();
        this.f = new Object();
        this.e = bucVar.u;
    }

    @Override // huc
    public final void a() {
        try {
            g();
        } catch (Throwable th) {
            cuc cucVar = new cuc(38, "An uncaught throwable was detected in the reading thread: " + th.getMessage(), th);
            xf4 xf4Var = this.a.d;
            xf4Var.f(cucVar);
            ArrayList arrayList = (ArrayList) xf4Var.u();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o15 o15Var = (o15) obj;
                try {
                    try {
                        o15Var.getClass();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    o15Var.getClass();
                }
            }
        }
        buc bucVar = this.a;
        fuc fucVar = this.c;
        synchronized (bucVar.g) {
            bucVar.q = true;
            bucVar.s = fucVar;
            if (bucVar.r) {
                bucVar.d();
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.a.d.u();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
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

    public final void c(byte[] bArr) {
        buc bucVar = this.a;
        bucVar.getClass();
        xf4 xf4Var = bucVar.d;
        int i = 0;
        try {
            SecureRandom secureRandom = yd7.a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) xf4Var.u();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                o15 o15Var = (o15) obj;
                try {
                    try {
                        o15Var.b((buc) xf4Var.b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    o15Var.getClass();
                }
            }
        } catch (Throwable th) {
            bucVar.d.f(new cuc(37, "Failed to convert payload data into a string: " + th.getMessage(), th));
            ArrayList arrayList2 = (ArrayList) xf4Var.u();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                o15 o15Var2 = (o15) obj2;
                try {
                    try {
                        o15Var2.getClass();
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    o15Var2.getClass();
                }
            }
        }
    }

    public final void d() {
        synchronized (this.f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            aw3 aw3Var = this.n;
            if (aw3Var != null) {
                aw3Var.cancel();
                this.n = null;
            }
        }
    }

    public final byte[] e(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (cuc e) {
            buc bucVar = this.a;
            bucVar.d.f(e);
            ArrayList arrayList = (ArrayList) bucVar.d.u();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
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
            bucVar.g(fuc.a(1003, e.getMessage()));
            return null;
        }
    }

    public final boolean f(fuc fucVar) {
        byte[] bArr;
        ArrayList arrayList = (ArrayList) this.a.d.u();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            o15 o15Var = (o15) obj;
            try {
                try {
                    o15Var.getClass();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                o15Var.getClass();
            }
        }
        int i3 = fucVar.e;
        boolean z = true;
        if (i3 == 0) {
            ArrayList arrayList2 = this.d;
            buc bucVar = this.a;
            ArrayList arrayList3 = (ArrayList) bucVar.d.u();
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
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
            arrayList2.add(fucVar);
            if (fucVar.a) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int size3 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj3 = arrayList2.get(i5);
                        i5++;
                        byte[] bArr2 = ((fuc) obj3).g;
                        if (bArr2 != null && bArr2.length != 0) {
                            byteArrayOutputStream.write(bArr2);
                        }
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException | OutOfMemoryError e) {
                    cuc cucVar = new cuc(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                    this.a.d.f(cucVar);
                    ArrayList arrayList4 = (ArrayList) bucVar.d.u();
                    int size4 = arrayList4.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj4 = arrayList4.get(i6);
                        i6++;
                        o15 o15Var3 = (o15) obj4;
                        try {
                            try {
                                o15Var3.getClass();
                            } catch (Throwable unused5) {
                            }
                        } catch (Throwable unused6) {
                            o15Var3.getClass();
                        }
                    }
                    bucVar.g(fuc.a(1009, cucVar.getMessage()));
                    bArr = null;
                }
                byte[] e2 = bArr != null ? (this.e == null || !((fuc) arrayList2.get(0)).b) ? bArr : e(bArr) : null;
                if (e2 == null) {
                    return false;
                }
                if (((fuc) arrayList2.get(0)).e == 1) {
                    c(e2);
                } else {
                    b();
                }
                arrayList2.clear();
            }
            return true;
        }
        if (i3 == 1) {
            ArrayList arrayList5 = (ArrayList) this.a.d.u();
            int size5 = arrayList5.size();
            while (i < size5) {
                Object obj5 = arrayList5.get(i);
                i++;
                o15 o15Var4 = (o15) obj5;
                try {
                    try {
                        o15Var4.getClass();
                    } catch (Throwable unused7) {
                        o15Var4.getClass();
                    }
                } catch (Throwable unused8) {
                }
            }
            if (fucVar.a) {
                byte[] bArr3 = fucVar.g;
                if (this.e != null && fucVar.b) {
                    bArr3 = e(bArr3);
                }
                c(bArr3);
            } else {
                this.d.add(fucVar);
            }
        } else if (i3 != 2) {
            switch (i3) {
                case 8:
                    zw8 zw8Var = this.a.b;
                    this.c = fucVar;
                    synchronized (zw8Var) {
                        int i7 = zw8Var.b;
                        if (i7 == 4 || i7 == 5) {
                            z = false;
                        } else {
                            zw8Var.b = 4;
                            if (zw8Var.c == 1) {
                                zw8Var.c = 2;
                            }
                            this.a.g(fucVar);
                        }
                    }
                    if (z) {
                        this.a.d.g();
                    }
                    ArrayList arrayList6 = (ArrayList) this.a.d.u();
                    int size6 = arrayList6.size();
                    int i8 = 0;
                    while (i8 < size6) {
                        Object obj6 = arrayList6.get(i8);
                        i8++;
                        o15 o15Var5 = (o15) obj6;
                        try {
                            try {
                                o15Var5.getClass();
                            } catch (Throwable unused9) {
                                o15Var5.getClass();
                            }
                        } catch (Throwable unused10) {
                        }
                    }
                    return false;
                case 9:
                    buc bucVar2 = this.a;
                    ArrayList arrayList7 = (ArrayList) bucVar2.d.u();
                    int size7 = arrayList7.size();
                    while (i < size7) {
                        Object obj7 = arrayList7.get(i);
                        i++;
                        o15 o15Var6 = (o15) obj7;
                        try {
                            try {
                                o15Var6.getClass();
                            } catch (Throwable unused11) {
                                o15Var6.getClass();
                            }
                        } catch (Throwable unused12) {
                        }
                    }
                    byte[] bArr4 = fucVar.g;
                    fuc fucVar2 = new fuc();
                    fucVar2.a = true;
                    fucVar2.e = 10;
                    fucVar2.c(bArr4);
                    bucVar2.g(fucVar2);
                    return true;
                case 10:
                    ArrayList arrayList8 = (ArrayList) this.a.d.u();
                    int size8 = arrayList8.size();
                    while (i < size8) {
                        Object obj8 = arrayList8.get(i);
                        i++;
                        o15 o15Var7 = (o15) obj8;
                        try {
                            try {
                                o15Var7.getClass();
                            } catch (Throwable unused13) {
                                o15Var7.getClass();
                            }
                        } catch (Throwable unused14) {
                        }
                    }
                default:
                    return true;
            }
        } else {
            ArrayList arrayList9 = (ArrayList) this.a.d.u();
            int size9 = arrayList9.size();
            while (i < size9) {
                Object obj9 = arrayList9.get(i);
                i++;
                o15 o15Var8 = (o15) obj9;
                try {
                    try {
                        o15Var8.getClass();
                    } catch (Throwable unused15) {
                    }
                } catch (Throwable unused16) {
                    o15Var8.getClass();
                }
            }
            if (fucVar.a) {
                byte[] bArr5 = fucVar.g;
                if (this.e != null && fucVar.b) {
                    e(bArr5);
                }
                b();
            } else {
                this.d.add(fucVar);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        cuc cucVar;
        cuc e;
        int F;
        this.a.e();
        while (true) {
            synchronized (this) {
                if (!this.b) {
                    buc bucVar = this.a;
                    fuc fucVar = null;
                    try {
                        fuc c = bucVar.h.c();
                        j(c);
                        fucVar = c;
                    } catch (cuc e2) {
                        e = e2;
                        if (e instanceof qj7) {
                            this.s = true;
                            bucVar.getClass();
                        } else {
                            this.a.d.f(e);
                            ArrayList arrayList = (ArrayList) bucVar.d.u();
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
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
                        F = ug8.F(e.a);
                        int i2 = 1002;
                        if (F != 47) {
                            switch (F) {
                                case 19:
                                case 20:
                                    break;
                                case 21:
                                case 22:
                                    i2 = 1009;
                                    break;
                                default:
                                    switch (F) {
                                    }
                                case 23:
                                case 24:
                                    i2 = 1008;
                                    break;
                            }
                        }
                        bucVar.g(fuc.a(i2, e.getMessage()));
                    } catch (InterruptedIOException e3) {
                        if (!this.b) {
                            cucVar = new cuc(24, "Interruption occurred while a frame was being read from the web socket: " + e3.getMessage(), e3);
                            e = cucVar;
                            if (e instanceof qj7) {
                            }
                            F = ug8.F(e.a);
                            int i22 = 1002;
                            if (F != 47) {
                            }
                            bucVar.g(fuc.a(i22, e.getMessage()));
                        }
                    } catch (IOException e4) {
                        if (!this.b || !isInterrupted()) {
                            cucVar = new cuc(25, "An I/O error occurred while a frame was being read from the web socket: " + e4.getMessage(), e4);
                            e = cucVar;
                            if (e instanceof qj7) {
                            }
                            F = ug8.F(e.a);
                            int i222 = 1002;
                            if (F != 47) {
                            }
                            bucVar.g(fuc.a(i222, e.getMessage()));
                        }
                    }
                    if (fucVar != null && f(fucVar)) {
                    }
                }
            }
        }
        if (!this.s && this.c == null) {
            i();
            while (true) {
                try {
                    fuc c2 = this.a.h.c();
                    if (c2.e == 8) {
                        this.c = c2;
                    } else if (isInterrupted()) {
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        d();
    }

    public final void h() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            interrupt();
            this.r = (short) 10000;
            i();
        }
    }

    public final void i() {
        synchronized (this.f) {
            Timer timer = this.h;
            if (timer != null) {
                timer.cancel();
                this.h = null;
            }
            aw3 aw3Var = this.n;
            if (aw3Var != null) {
                aw3Var.cancel();
                this.n = null;
            }
            this.n = new aw3(this, (byte) 3);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.n, this.r);
        }
    }

    public final void j(fuc fucVar) {
        byte[] bArr;
        int i;
        this.a.getClass();
        if ((this.e == null || !((i = fucVar.e) == 1 || i == 2)) && fucVar.b) {
            throw new cuc(29, "The RSV1 bit of a frame is set unexpectedly.");
        }
        if (fucVar.c) {
            throw new cuc(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        if (fucVar.d) {
            throw new cuc(29, "The RSV3 bit of a frame is set unexpectedly.");
        }
        int i2 = fucVar.e;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            switch (i2) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new cuc(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(fucVar.e));
            }
        }
        if (fucVar.f) {
            throw new cuc(30, "A frame from the server is masked.");
        }
        if (8 > i2 || i2 > 15) {
            boolean z = this.d.size() != 0;
            i2 = fucVar.e;
            if (i2 == 0) {
                if (!z) {
                    throw new cuc(33, "A continuation frame was detected although a continuation had not started.");
                }
            } else if (z) {
                throw new cuc(34, "A non-control frame was detected although the existing continuation had not been closed.");
            }
        } else if (!fucVar.a) {
            throw new cuc(32, "A control frame is fragmented.");
        }
        if (8 > i2 || i2 > 15 || (bArr = fucVar.g) == null || 125 >= bArr.length) {
            return;
        }
        throw new cuc(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
    }
}
