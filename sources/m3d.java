// default package

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class m3d extends xyc {
    public final LinkedList b;
    public final t68 c;
    public boolean d;
    public vyc e;
    public boolean f;

    public m3d(ryc rycVar) {
        super("WritingThread", rycVar, 2);
        this.b = new LinkedList();
        this.c = rycVar.u;
    }

    @Override // xyc
    public final void a() {
        try {
            c();
        } catch (Throwable th) {
            syc sycVar = new syc(39, "An uncaught throwable was detected in the writing thread: " + th.getMessage(), th);
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
        synchronized (this) {
            this.f = true;
            notifyAll();
        }
        d();
    }

    public final void b() {
        try {
            this.a.i.flush();
            synchronized (this) {
            }
        } catch (IOException e) {
            syc sycVar = new syc(27, "Flushing frames to the server failed: " + e.getMessage(), e);
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
                        s35Var.getClass();
                    }
                } catch (Throwable unused2) {
                }
            }
            throw sycVar;
        }
    }

    public final void c() {
        boolean z;
        ryc rycVar = this.a;
        synchronized (rycVar.g) {
            rycVar.p = true;
            z = rycVar.o;
        }
        rycVar.a();
        if (z) {
            rycVar.f();
        }
        while (true) {
            int i = i();
            if (i != 1) {
                if (i == 3) {
                    try {
                        this.a.i.flush();
                    } catch (IOException unused) {
                    }
                } else if (i != 2) {
                    try {
                        h(false);
                    } catch (syc unused2) {
                    }
                } else {
                    continue;
                }
            }
            try {
                h(true);
                return;
            } catch (syc unused3) {
                return;
            }
        }
    }

    public final void d() {
        ryc rycVar = this.a;
        vyc vycVar = this.e;
        synchronized (rycVar.g) {
            rycVar.r = true;
            rycVar.t = vycVar;
            if (rycVar.q) {
                rycVar.d();
            }
        }
    }

    public final void e(vyc vycVar) {
        synchronized (this) {
            if (this.f) {
                return;
            }
            if (!this.d && this.e == null) {
                int i = vycVar.e;
                if (!(8 <= i && i <= 15)) {
                    this.a.getClass();
                }
            }
            int i2 = vycVar.e;
            if (i2 == 9 || i2 == 10) {
                LinkedList linkedList = this.b;
                Iterator it = linkedList.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    int i4 = ((vyc) it.next()).e;
                    if (!(i4 == 9 || i4 == 10)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                linkedList.add(i3, vycVar);
            } else {
                this.b.addLast(vycVar);
            }
            notifyAll();
        }
    }

    public final void f() {
        synchronized (this) {
            this.d = true;
            notifyAll();
        }
    }

    public final void g(vyc vycVar) {
        int i;
        byte[] bArr;
        byte[] bArr2;
        t68 t68Var = this.c;
        boolean z = true;
        if (t68Var != null && (((i = vycVar.e) == 1 || i == 2) && vycVar.a && !vycVar.b && (bArr = vycVar.g) != null && bArr.length != 0)) {
            try {
                bArr2 = t68Var.b(bArr);
            } catch (syc unused) {
                bArr2 = bArr;
            }
            if (bArr.length > bArr2.length) {
                vycVar.c(bArr2);
                vycVar.b = true;
            }
        }
        ArrayList arrayList = (ArrayList) this.a.d.s();
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            s35 s35Var = (s35) obj;
            try {
                try {
                    s35Var.getClass();
                } catch (Throwable unused2) {
                    s35Var.getClass();
                }
            } catch (Throwable unused3) {
            }
        }
        if (this.e != null) {
            ArrayList arrayList2 = (ArrayList) this.a.d.s();
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                s35 s35Var2 = (s35) obj2;
                try {
                    try {
                        s35Var2.getClass();
                    } catch (Throwable unused4) {
                        s35Var2.getClass();
                    }
                } catch (Throwable unused5) {
                }
            }
            return;
        }
        int i4 = vycVar.e;
        if (i4 == 8) {
            this.e = vycVar;
        }
        if (i4 == 8) {
            l09 l09Var = this.a.b;
            synchronized (l09Var) {
                int i5 = l09Var.b;
                if (i5 == 4 || i5 == 5) {
                    z = false;
                } else {
                    l09Var.b = 4;
                    if (l09Var.c == 1) {
                        l09Var.c = 3;
                    }
                }
            }
            if (z) {
                this.a.d.e();
            }
        }
        try {
            this.a.i.a(vycVar);
            ArrayList arrayList3 = (ArrayList) this.a.d.s();
            int size3 = arrayList3.size();
            while (i2 < size3) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                s35 s35Var3 = (s35) obj3;
                try {
                    try {
                        s35Var3.getClass();
                    } catch (Throwable unused6) {
                        s35Var3.getClass();
                    }
                } catch (Throwable unused7) {
                }
            }
        } catch (IOException e) {
            syc sycVar = new syc(26, "An I/O error occurred when a frame was tried to be sent: " + e.getMessage(), e);
            vh4 vh4Var = this.a.d;
            vh4Var.d(sycVar);
            ArrayList arrayList4 = (ArrayList) vh4Var.s();
            int size4 = arrayList4.size();
            while (i2 < size4) {
                Object obj4 = arrayList4.get(i2);
                i2++;
                s35 s35Var4 = (s35) obj4;
                try {
                    try {
                        s35Var4.getClass();
                    } catch (Throwable unused8) {
                        s35Var4.getClass();
                    }
                } catch (Throwable unused9) {
                }
            }
            throw sycVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r2 != 10) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        b();
        r0 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r9 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        r8.a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (1000 >= (r2 - r0)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        b();
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        g(r2);
        r2 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r2 == 9) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            synchronized (this) {
                vyc vycVar = (vyc) this.b.poll();
                notifyAll();
                if (vycVar == null) {
                    break;
                }
            }
        }
        if (!z) {
            this.a.getClass();
        }
        b();
    }

    public final int i() {
        synchronized (this) {
            if (this.d) {
                return 1;
            }
            if (this.e != null) {
                return 1;
            }
            if (this.b.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.d) {
                return 1;
            }
            return this.b.size() == 0 ? 2 : 0;
        }
    }
}
