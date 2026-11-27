// default package

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Timer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class c59 extends xyc {
    public boolean b;
    public vyc c;
    public final ArrayList d;
    public final t68 e;
    public final Object f;
    public Timer h;
    public vw3 n;
    public short r;
    public boolean s;

    public c59(ryc rycVar) {
        super("ReadingThread", rycVar, 1);
        this.d = new ArrayList();
        this.f = new Object();
        this.e = rycVar.u;
    }

    @Override // xyc
    public final void a() {
        try {
            g();
        } catch (Throwable th) {
            syc sycVar = new syc(38, "An uncaught throwable was detected in the reading thread: " + th.getMessage(), th);
            vh4 vh4Var = this.a.d;
            vh4Var.d(sycVar);
            ArrayList arrayList = (ArrayList) vh4Var.s();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                s35 s35Var = (s35) obj;
                try {
                    try {
                        s35Var.getClass();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                    s35Var.getClass();
                }
            }
        }
        ryc rycVar = this.a;
        vyc vycVar = this.c;
        synchronized (rycVar.g) {
            rycVar.q = true;
            rycVar.s = vycVar;
            if (rycVar.r) {
                rycVar.d();
            }
        }
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.a.d.s();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            s35 s35Var = (s35) obj;
            try {
                try {
                    s35Var.getClass();
                } catch (Throwable unused) {
                    s35Var.getClass();
                }
            } catch (Throwable unused2) {
            }
        }
    }

    public final void c(byte[] bArr) {
        ryc rycVar = this.a;
        rycVar.getClass();
        vh4 vh4Var = rycVar.d;
        int i = 0;
        try {
            SecureRandom secureRandom = hg7.a;
            String str = null;
            if (bArr != null) {
                try {
                    str = new String(bArr, 0, bArr.length, "UTF-8");
                } catch (UnsupportedEncodingException | IndexOutOfBoundsException unused) {
                }
            }
            ArrayList arrayList = (ArrayList) vh4Var.s();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                s35 s35Var = (s35) obj;
                try {
                    try {
                        s35Var.b((ryc) vh4Var.b, str);
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    s35Var.getClass();
                }
            }
        } catch (Throwable th) {
            rycVar.d.d(new syc(37, "Failed to convert payload data into a string: " + th.getMessage(), th));
            ArrayList arrayList2 = (ArrayList) vh4Var.s();
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                s35 s35Var2 = (s35) obj2;
                try {
                    try {
                        s35Var2.getClass();
                    } catch (Throwable unused4) {
                    }
                } catch (Throwable unused5) {
                    s35Var2.getClass();
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
            vw3 vw3Var = this.n;
            if (vw3Var != null) {
                vw3Var.cancel();
                this.n = null;
            }
        }
    }

    public final byte[] e(byte[] bArr) {
        try {
            return this.e.c(bArr);
        } catch (syc e) {
            ryc rycVar = this.a;
            rycVar.d.d(e);
            ArrayList arrayList = (ArrayList) rycVar.d.s();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                s35 s35Var = (s35) obj;
                try {
                    try {
                        s35Var.getClass();
                    } catch (Throwable unused) {
                        s35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
            rycVar.g(vyc.a(1003, e.getMessage()));
            return null;
        }
    }

    public final boolean f(vyc vycVar) {
        byte[] bArr;
        ArrayList arrayList = (ArrayList) this.a.d.s();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            s35 s35Var = (s35) obj;
            try {
                try {
                    s35Var.getClass();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                s35Var.getClass();
            }
        }
        int i3 = vycVar.e;
        boolean z = true;
        if (i3 == 0) {
            ArrayList arrayList2 = this.d;
            ryc rycVar = this.a;
            ArrayList arrayList3 = (ArrayList) rycVar.d.s();
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                s35 s35Var2 = (s35) obj2;
                try {
                    try {
                        s35Var2.getClass();
                    } catch (Throwable unused3) {
                        s35Var2.getClass();
                    }
                } catch (Throwable unused4) {
                }
            }
            arrayList2.add(vycVar);
            if (vycVar.a) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int size3 = arrayList2.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj3 = arrayList2.get(i5);
                        i5++;
                        byte[] bArr2 = ((vyc) obj3).g;
                        if (bArr2 != null && bArr2.length != 0) {
                            byteArrayOutputStream.write(bArr2);
                        }
                    }
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException | OutOfMemoryError e) {
                    syc sycVar = new syc(36, "Failed to concatenate payloads of multiple frames to construct a message: " + e.getMessage(), e);
                    this.a.d.d(sycVar);
                    ArrayList arrayList4 = (ArrayList) rycVar.d.s();
                    int size4 = arrayList4.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj4 = arrayList4.get(i6);
                        i6++;
                        s35 s35Var3 = (s35) obj4;
                        try {
                            try {
                                s35Var3.getClass();
                            } catch (Throwable unused5) {
                            }
                        } catch (Throwable unused6) {
                            s35Var3.getClass();
                        }
                    }
                    rycVar.g(vyc.a(1009, sycVar.getMessage()));
                    bArr = null;
                }
                byte[] e2 = bArr != null ? (this.e == null || !((vyc) arrayList2.get(0)).b) ? bArr : e(bArr) : null;
                if (e2 == null) {
                    return false;
                }
                if (((vyc) arrayList2.get(0)).e == 1) {
                    c(e2);
                } else {
                    b();
                }
                arrayList2.clear();
            }
            return true;
        }
        if (i3 == 1) {
            ArrayList arrayList5 = (ArrayList) this.a.d.s();
            int size5 = arrayList5.size();
            while (i < size5) {
                Object obj5 = arrayList5.get(i);
                i++;
                s35 s35Var4 = (s35) obj5;
                try {
                    try {
                        s35Var4.getClass();
                    } catch (Throwable unused7) {
                        s35Var4.getClass();
                    }
                } catch (Throwable unused8) {
                }
            }
            if (vycVar.a) {
                byte[] bArr3 = vycVar.g;
                if (this.e != null && vycVar.b) {
                    bArr3 = e(bArr3);
                }
                c(bArr3);
            } else {
                this.d.add(vycVar);
            }
        } else if (i3 != 2) {
            switch (i3) {
                case 8:
                    l09 l09Var = this.a.b;
                    this.c = vycVar;
                    synchronized (l09Var) {
                        int i7 = l09Var.b;
                        if (i7 == 4 || i7 == 5) {
                            z = false;
                        } else {
                            l09Var.b = 4;
                            if (l09Var.c == 1) {
                                l09Var.c = 2;
                            }
                            this.a.g(vycVar);
                        }
                    }
                    if (z) {
                        this.a.d.e();
                    }
                    ArrayList arrayList6 = (ArrayList) this.a.d.s();
                    int size6 = arrayList6.size();
                    int i8 = 0;
                    while (i8 < size6) {
                        Object obj6 = arrayList6.get(i8);
                        i8++;
                        s35 s35Var5 = (s35) obj6;
                        try {
                            try {
                                s35Var5.getClass();
                            } catch (Throwable unused9) {
                                s35Var5.getClass();
                            }
                        } catch (Throwable unused10) {
                        }
                    }
                    return false;
                case 9:
                    ryc rycVar2 = this.a;
                    ArrayList arrayList7 = (ArrayList) rycVar2.d.s();
                    int size7 = arrayList7.size();
                    while (i < size7) {
                        Object obj7 = arrayList7.get(i);
                        i++;
                        s35 s35Var6 = (s35) obj7;
                        try {
                            try {
                                s35Var6.getClass();
                            } catch (Throwable unused11) {
                                s35Var6.getClass();
                            }
                        } catch (Throwable unused12) {
                        }
                    }
                    byte[] bArr4 = vycVar.g;
                    vyc vycVar2 = new vyc();
                    vycVar2.a = true;
                    vycVar2.e = 10;
                    vycVar2.c(bArr4);
                    rycVar2.g(vycVar2);
                    return true;
                case 10:
                    ArrayList arrayList8 = (ArrayList) this.a.d.s();
                    int size8 = arrayList8.size();
                    while (i < size8) {
                        Object obj8 = arrayList8.get(i);
                        i++;
                        s35 s35Var7 = (s35) obj8;
                        try {
                            try {
                                s35Var7.getClass();
                            } catch (Throwable unused13) {
                                s35Var7.getClass();
                            }
                        } catch (Throwable unused14) {
                        }
                    }
                default:
                    return true;
            }
        } else {
            ArrayList arrayList9 = (ArrayList) this.a.d.s();
            int size9 = arrayList9.size();
            while (i < size9) {
                Object obj9 = arrayList9.get(i);
                i++;
                s35 s35Var8 = (s35) obj9;
                try {
                    try {
                        s35Var8.getClass();
                    } catch (Throwable unused15) {
                    }
                } catch (Throwable unused16) {
                    s35Var8.getClass();
                }
            }
            if (vycVar.a) {
                byte[] bArr5 = vycVar.g;
                if (this.e != null && vycVar.b) {
                    e(bArr5);
                }
                b();
            } else {
                this.d.add(vycVar);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        syc sycVar;
        int F;
        this.a.e();
        while (true) {
            synchronized (this) {
                if (!this.b) {
                    ryc rycVar = this.a;
                    vyc vycVar = null;
                    try {
                        vyc c = rycVar.h.c();
                        j(c);
                        vycVar = c;
                    } catch (InterruptedIOException e) {
                        if (!this.b) {
                            sycVar = new syc(24, "Interruption occurred while a frame was being read from the web socket: " + e.getMessage(), e);
                            e = sycVar;
                            if (e instanceof pm7) {
                                this.s = true;
                                rycVar.getClass();
                            } else {
                                this.a.d.d(e);
                                ArrayList arrayList = (ArrayList) rycVar.d.s();
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    s35 s35Var = (s35) obj;
                                    try {
                                        try {
                                            s35Var.getClass();
                                        } catch (Throwable unused) {
                                            s35Var.getClass();
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }
                            F = ik8.F(e.a);
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
                            rycVar.g(vyc.a(i2, e.getMessage()));
                        }
                    } catch (IOException e2) {
                        if (!this.b || !isInterrupted()) {
                            sycVar = new syc(25, "An I/O error occurred while a frame was being read from the web socket: " + e2.getMessage(), e2);
                            e = sycVar;
                            if (e instanceof pm7) {
                            }
                            F = ik8.F(e.a);
                            int i22 = 1002;
                            if (F != 47) {
                            }
                            rycVar.g(vyc.a(i22, e.getMessage()));
                        }
                    } catch (syc e3) {
                        e = e3;
                        if (e instanceof pm7) {
                        }
                        F = ik8.F(e.a);
                        int i222 = 1002;
                        if (F != 47) {
                        }
                        rycVar.g(vyc.a(i222, e.getMessage()));
                    }
                    if (vycVar != null && f(vycVar)) {
                    }
                }
            }
        }
        if (!this.s && this.c == null) {
            i();
            while (true) {
                try {
                    vyc c2 = this.a.h.c();
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
            vw3 vw3Var = this.n;
            if (vw3Var != null) {
                vw3Var.cancel();
                this.n = null;
            }
            this.n = new vw3(this, (byte) 3);
            Timer timer2 = new Timer("ReadingThreadCloseTimer");
            this.h = timer2;
            timer2.schedule(this.n, this.r);
        }
    }

    public final void j(vyc vycVar) {
        byte[] bArr;
        int i;
        this.a.getClass();
        if ((this.e == null || !((i = vycVar.e) == 1 || i == 2)) && vycVar.b) {
            throw new syc(29, "The RSV1 bit of a frame is set unexpectedly.");
        }
        if (vycVar.c) {
            throw new syc(29, "The RSV2 bit of a frame is set unexpectedly.");
        }
        if (vycVar.d) {
            throw new syc(29, "The RSV3 bit of a frame is set unexpectedly.");
        }
        int i2 = vycVar.e;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            switch (i2) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new syc(31, "A frame has an unknown opcode: 0x" + Integer.toHexString(vycVar.e));
            }
        }
        if (vycVar.f) {
            throw new syc(30, "A frame from the server is masked.");
        }
        if (8 > i2 || i2 > 15) {
            boolean z = this.d.size() != 0;
            i2 = vycVar.e;
            if (i2 == 0) {
                if (!z) {
                    throw new syc(33, "A continuation frame was detected although a continuation had not started.");
                }
            } else if (z) {
                throw new syc(34, "A non-control frame was detected although the existing continuation had not been closed.");
            }
        } else if (!vycVar.a) {
            throw new syc(32, "A control frame is fragmented.");
        }
        if (8 > i2 || i2 > 15 || (bArr = vycVar.g) == null || 125 >= bArr.length) {
            return;
        }
        throw new syc(35, "The payload size of a control frame exceeds the maximum size (125 bytes): " + bArr.length);
    }
}
