// default package

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class kq4 {
    public final eq4 A;
    public final rg7 B;
    public v9 C;
    public v9 D;
    public v9 E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public nq4 O;
    public final zz3 P;
    public boolean b;
    public ArrayList e;
    public vr7 g;
    public final ArrayList n;
    public final um4 o;
    public final CopyOnWriteArrayList p;
    public final bq4 q;
    public final bq4 r;
    public final bq4 s;
    public final bq4 t;
    public final dq4 u;
    public int v;
    public ip4 w;
    public ane x;
    public gp4 y;
    public gp4 z;
    public final ArrayList a = new ArrayList();
    public final u8a c = new u8a((byte) 6);
    public ArrayList d = new ArrayList();
    public final aq4 f = new aq4(this);
    public kd0 h = null;
    public boolean i = false;
    public final cq4 j = new cq4(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());
    public final Map m = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [bq4] */
    /* JADX WARN: Type inference failed for: r0v17, types: [bq4] */
    /* JADX WARN: Type inference failed for: r0v18, types: [bq4] */
    /* JADX WARN: Type inference failed for: r0v19, types: [bq4] */
    public kq4() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new um4(this);
        this.p = new CopyOnWriteArrayList();
        final byte b = 0;
        this.q = new pt2(this) { // from class: bq4
            public final /* synthetic */ kq4 b;

            {
                this.b = this;
            }

            @Override // pt2
            public final void accept(Object obj) {
                byte b2 = b;
                kq4 kq4Var = this.b;
                switch (b2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (kq4Var.M()) {
                            kq4Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (kq4Var.M() && num.intValue() == 80) {
                            kq4Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        bj7 bj7Var = (bj7) obj;
                        if (kq4Var.M()) {
                            boolean z = bj7Var.a;
                            kq4Var.n(false);
                            break;
                        }
                        break;
                    default:
                        sd8 sd8Var = (sd8) obj;
                        if (kq4Var.M()) {
                            boolean z2 = sd8Var.a;
                            kq4Var.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b2 = 1;
        this.r = new pt2(this) { // from class: bq4
            public final /* synthetic */ kq4 b;

            {
                this.b = this;
            }

            @Override // pt2
            public final void accept(Object obj) {
                byte b22 = b2;
                kq4 kq4Var = this.b;
                switch (b22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (kq4Var.M()) {
                            kq4Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (kq4Var.M() && num.intValue() == 80) {
                            kq4Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        bj7 bj7Var = (bj7) obj;
                        if (kq4Var.M()) {
                            boolean z = bj7Var.a;
                            kq4Var.n(false);
                            break;
                        }
                        break;
                    default:
                        sd8 sd8Var = (sd8) obj;
                        if (kq4Var.M()) {
                            boolean z2 = sd8Var.a;
                            kq4Var.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b3 = 2;
        this.s = new pt2(this) { // from class: bq4
            public final /* synthetic */ kq4 b;

            {
                this.b = this;
            }

            @Override // pt2
            public final void accept(Object obj) {
                byte b22 = b3;
                kq4 kq4Var = this.b;
                switch (b22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (kq4Var.M()) {
                            kq4Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (kq4Var.M() && num.intValue() == 80) {
                            kq4Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        bj7 bj7Var = (bj7) obj;
                        if (kq4Var.M()) {
                            boolean z = bj7Var.a;
                            kq4Var.n(false);
                            break;
                        }
                        break;
                    default:
                        sd8 sd8Var = (sd8) obj;
                        if (kq4Var.M()) {
                            boolean z2 = sd8Var.a;
                            kq4Var.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final byte b4 = 3;
        this.t = new pt2(this) { // from class: bq4
            public final /* synthetic */ kq4 b;

            {
                this.b = this;
            }

            @Override // pt2
            public final void accept(Object obj) {
                byte b22 = b4;
                kq4 kq4Var = this.b;
                switch (b22) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        if (kq4Var.M()) {
                            kq4Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (kq4Var.M() && num.intValue() == 80) {
                            kq4Var.m(false);
                            break;
                        }
                        break;
                    case 2:
                        bj7 bj7Var = (bj7) obj;
                        if (kq4Var.M()) {
                            boolean z = bj7Var.a;
                            kq4Var.n(false);
                            break;
                        }
                        break;
                    default:
                        sd8 sd8Var = (sd8) obj;
                        if (kq4Var.M()) {
                            boolean z2 = sd8Var.a;
                            kq4Var.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.u = new dq4(this);
        this.v = -1;
        this.A = new eq4(this);
        this.B = new rg7((byte) 20);
        this.F = new ArrayDeque();
        this.P = new zz3(this, (byte) 8);
    }

    public static HashSet F(kd0 kd0Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < kd0Var.a.size(); i++) {
            gp4 gp4Var = ((ar4) kd0Var.a.get(i)).b;
            if (gp4Var != null && kd0Var.g) {
                hashSet.add(gp4Var);
            }
        }
        return hashSet;
    }

    public static boolean K(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean L(gp4 gp4Var) {
        ArrayList t = gp4Var.M.c.t();
        int size = t.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = t.get(i);
            i++;
            gp4 gp4Var2 = (gp4) obj;
            if (gp4Var2 != null) {
                z = L(gp4Var2);
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(gp4 gp4Var) {
        if (gp4Var == null) {
            return true;
        }
        if (gp4Var.U) {
            return gp4Var.K == null || N(gp4Var.N);
        }
        return false;
    }

    public static boolean O(gp4 gp4Var) {
        if (gp4Var == null) {
            return true;
        }
        kq4 kq4Var = gp4Var.K;
        return gp4Var == kq4Var.z && O(kq4Var.y);
    }

    public static void e0(gp4 gp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + gp4Var);
        }
        if (gp4Var.R) {
            gp4Var.R = false;
            gp4Var.a0 = !gp4Var.a0;
        }
    }

    public final boolean A(boolean z) {
        boolean z2;
        kd0 kd0Var;
        z(z);
        if (!this.i && (kd0Var = this.h) != null) {
            kd0Var.r = false;
            kd0Var.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.e(false, false);
            this.a.add(0, this.h);
            ArrayList arrayList = this.h.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                gp4 gp4Var = ((ar4) obj).b;
                if (gp4Var != null) {
                    gp4Var.y = false;
                }
            }
            this.h = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    try {
                        int size2 = this.a.size();
                        z2 = false;
                        for (int i2 = 0; i2 < size2; i2++) {
                            z2 |= ((hq4) this.a.get(i2)).a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!z2) {
                h0();
                v();
                ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        String str;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        u8a u8aVar = this.c;
        ArrayList arrayList3 = this.n;
        boolean z4 = ((kd0) arrayList.get(i)).o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(u8aVar.u());
        gp4 gp4Var = this.z;
        int i6 = i;
        boolean z5 = false;
        while (i6 < i2) {
            kd0 kd0Var = (kd0) arrayList.get(i6);
            boolean booleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList5 = this.N;
            if (booleanValue) {
                z = z4;
                i3 = i6;
                z2 = z5;
                int i7 = 1;
                ArrayList arrayList6 = kd0Var.a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    ar4 ar4Var = (ar4) arrayList6.get(size);
                    int i8 = ar4Var.a;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 8:
                                    gp4Var = null;
                                    break;
                                case 9:
                                    gp4Var = ar4Var.b;
                                    break;
                                case 10:
                                    ar4Var.i = ar4Var.h;
                                    break;
                            }
                            size--;
                            i7 = 1;
                        }
                        arrayList5.add(ar4Var.b);
                        size--;
                        i7 = 1;
                    }
                    arrayList5.remove(ar4Var.b);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList7 = kd0Var.a;
                int i9 = 0;
                while (i9 < arrayList7.size()) {
                    ar4 ar4Var2 = (ar4) arrayList7.get(i9);
                    boolean z6 = z4;
                    int i10 = ar4Var2.a;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        z3 = z5;
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                arrayList5.remove(ar4Var2.b);
                                gp4 gp4Var2 = ar4Var2.b;
                                if (gp4Var2 == gp4Var) {
                                    arrayList7.add(i9, new ar4(9, gp4Var2));
                                    i9++;
                                    gp4Var = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 == 8) {
                                arrayList7.add(i9, new ar4(9, gp4Var, 0));
                                ar4Var2.c = true;
                                i9++;
                                gp4Var = ar4Var2.b;
                            }
                            i12 = 1;
                        } else {
                            gp4 gp4Var3 = ar4Var2.b;
                            int i13 = gp4Var3.P;
                            int size2 = arrayList5.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                gp4 gp4Var4 = (gp4) arrayList5.get(size2);
                                if (gp4Var4.P != i13) {
                                    i4 = i13;
                                } else if (gp4Var4 == gp4Var3) {
                                    i4 = i13;
                                    z7 = true;
                                } else {
                                    if (gp4Var4 == gp4Var) {
                                        i4 = i13;
                                        arrayList7.add(i9, new ar4(9, gp4Var4, 0));
                                        i9++;
                                        i5 = 0;
                                        gp4Var = null;
                                    } else {
                                        i4 = i13;
                                        i5 = 0;
                                    }
                                    ar4 ar4Var3 = new ar4(3, gp4Var4, i5);
                                    ar4Var3.d = ar4Var2.d;
                                    ar4Var3.f = ar4Var2.f;
                                    ar4Var3.e = ar4Var2.e;
                                    ar4Var3.g = ar4Var2.g;
                                    arrayList7.add(i9, ar4Var3);
                                    arrayList5.remove(gp4Var4);
                                    i9++;
                                    gp4Var = gp4Var;
                                }
                                size2 = i14 - 1;
                                i13 = i4;
                            }
                            i12 = 1;
                            if (z7) {
                                arrayList7.remove(i9);
                                i9--;
                            } else {
                                ar4Var2.a = 1;
                                ar4Var2.c = true;
                                arrayList5.add(gp4Var3);
                            }
                        }
                        i9 += i12;
                        z4 = z6;
                        i6 = i11;
                        z5 = z3;
                    } else {
                        z3 = z5;
                    }
                    arrayList5.add(ar4Var2.b);
                    i9 += i12;
                    z4 = z6;
                    i6 = i11;
                    z5 = z3;
                }
                z = z4;
                i3 = i6;
                z2 = z5;
            }
            z5 = z2 || kd0Var.g;
            i6 = i3 + 1;
            z4 = z;
        }
        boolean z8 = z4;
        boolean z9 = z5;
        this.N.clear();
        if (!z8 && this.v >= 1) {
            for (int i15 = i; i15 < i2; i15++) {
                ArrayList arrayList8 = ((kd0) arrayList.get(i15)).a;
                int size3 = arrayList8.size();
                int i16 = 0;
                while (i16 < size3) {
                    Object obj = arrayList8.get(i16);
                    i16++;
                    gp4 gp4Var5 = ((ar4) obj).b;
                    if (gp4Var5 != null && gp4Var5.K != null) {
                        u8aVar.y(g(gp4Var5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i17 = i;
        while (i17 < i2) {
            kd0 kd0Var2 = (kd0) arrayList.get(i17);
            if (((Boolean) arrayList2.get(i17)).booleanValue()) {
                kd0Var2.c(-1);
                kq4 kq4Var = kd0Var2.q;
                ArrayList arrayList9 = kd0Var2.a;
                boolean z10 = true;
                for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                    ar4 ar4Var4 = (ar4) arrayList9.get(size4);
                    gp4 gp4Var6 = ar4Var4.b;
                    if (gp4Var6 != null) {
                        if (gp4Var6.Z != null) {
                            gp4Var6.j().a = z10;
                        }
                        int i18 = kd0Var2.f;
                        char c = 8194;
                        char c2 = 4097;
                        if (i18 != 4097) {
                            if (i18 != 8194) {
                                c = 4100;
                                if (i18 != 8197) {
                                    c2 = 4099;
                                    if (i18 != 4099) {
                                        c = i18 != 4100 ? (char) 0 : (char) 8197;
                                    }
                                }
                            }
                            c = c2;
                        }
                        if (gp4Var6.Z != null || c != 0) {
                            gp4Var6.j();
                            gp4Var6.Z.getClass();
                        }
                        gp4Var6.j();
                        gp4Var6.Z.getClass();
                    }
                    switch (ar4Var4.a) {
                        case 1:
                            gp4Var6.M(ar4Var4.d, ar4Var4.e, ar4Var4.f, ar4Var4.g);
                            z10 = true;
                            kq4Var.a0(gp4Var6, true);
                            kq4Var.V(gp4Var6);
                        case 2:
                        default:
                            xi4.g(ar4Var4.a, str2);
                            return;
                        case 3:
                            gp4Var6.M(ar4Var4.d, ar4Var4.e, ar4Var4.f, ar4Var4.g);
                            kq4Var.a(gp4Var6);
                            z10 = true;
                        case 4:
                            gp4Var6.M(ar4Var4.d, ar4Var4.e, ar4Var4.f, ar4Var4.g);
                            kq4Var.getClass();
                            e0(gp4Var6);
                            z10 = true;
                        case 5:
                            gp4Var6.M(ar4Var4.d, ar4Var4.e, ar4Var4.f, ar4Var4.g);
                            kq4Var.a0(gp4Var6, true);
                            kq4Var.J(gp4Var6);
                            z10 = true;
                        case 6:
                            gp4Var6.M(ar4Var4.d, ar4Var4.e, ar4Var4.f, ar4Var4.g);
                            kq4Var.c(gp4Var6);
                            z10 = true;
                        case 7:
                            gp4Var6.M(ar4Var4.d, ar4Var4.e, ar4Var4.f, ar4Var4.g);
                            kq4Var.a0(gp4Var6, true);
                            kq4Var.h(gp4Var6);
                            z10 = true;
                        case 8:
                            kq4Var.c0(null);
                            z10 = true;
                        case 9:
                            kq4Var.c0(gp4Var6);
                            z10 = true;
                        case 10:
                            ar4Var4.i = gp4Var6.d0;
                            kq4Var.b0(gp4Var6, ar4Var4.h);
                            z10 = true;
                    }
                }
            } else {
                kd0Var2.c(1);
                kq4 kq4Var2 = kd0Var2.q;
                ArrayList arrayList10 = kd0Var2.a;
                int size5 = arrayList10.size();
                int i19 = 0;
                while (i19 < size5) {
                    ar4 ar4Var5 = (ar4) arrayList10.get(i19);
                    gp4 gp4Var7 = ar4Var5.b;
                    if (gp4Var7 != null) {
                        if (gp4Var7.Z != null) {
                            gp4Var7.j().a = false;
                        }
                        int i20 = kd0Var2.f;
                        if (gp4Var7.Z != null || i20 != 0) {
                            gp4Var7.j();
                            gp4Var7.Z.getClass();
                        }
                        gp4Var7.j();
                        gp4Var7.Z.getClass();
                    }
                    switch (ar4Var5.a) {
                        case 1:
                            str = str2;
                            gp4Var7.M(ar4Var5.d, ar4Var5.e, ar4Var5.f, ar4Var5.g);
                            kq4Var2.a0(gp4Var7, false);
                            kq4Var2.a(gp4Var7);
                            i19++;
                            str2 = str;
                        case 2:
                        default:
                            xi4.g(ar4Var5.a, str2);
                            return;
                        case 3:
                            str = str2;
                            gp4Var7.M(ar4Var5.d, ar4Var5.e, ar4Var5.f, ar4Var5.g);
                            kq4Var2.V(gp4Var7);
                            i19++;
                            str2 = str;
                        case 4:
                            str = str2;
                            gp4Var7.M(ar4Var5.d, ar4Var5.e, ar4Var5.f, ar4Var5.g);
                            kq4Var2.J(gp4Var7);
                            i19++;
                            str2 = str;
                        case 5:
                            str = str2;
                            gp4Var7.M(ar4Var5.d, ar4Var5.e, ar4Var5.f, ar4Var5.g);
                            kq4Var2.a0(gp4Var7, false);
                            e0(gp4Var7);
                            i19++;
                            str2 = str;
                        case 6:
                            str = str2;
                            gp4Var7.M(ar4Var5.d, ar4Var5.e, ar4Var5.f, ar4Var5.g);
                            kq4Var2.h(gp4Var7);
                            i19++;
                            str2 = str;
                        case 7:
                            str = str2;
                            gp4Var7.M(ar4Var5.d, ar4Var5.e, ar4Var5.f, ar4Var5.g);
                            kq4Var2.a0(gp4Var7, false);
                            kq4Var2.c(gp4Var7);
                            i19++;
                            str2 = str;
                        case 8:
                            kq4Var2.c0(gp4Var7);
                            str = str2;
                            i19++;
                            str2 = str;
                        case 9:
                            kq4Var2.c0(null);
                            str = str2;
                            i19++;
                            str2 = str;
                        case 10:
                            ar4Var5.h = gp4Var7.d0;
                            kq4Var2.b0(gp4Var7, ar4Var5.i);
                            str = str2;
                            i19++;
                            str2 = str;
                    }
                }
            }
            i17++;
            str2 = str2;
        }
        boolean booleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i21 = 0;
            while (i21 < size6) {
                Object obj2 = arrayList.get(i21);
                i21++;
                linkedHashSet.addAll(F((kd0) obj2));
            }
            if (this.h == null) {
                int size7 = arrayList3.size();
                int i22 = 0;
                while (i22 < size7) {
                    Object obj3 = arrayList3.get(i22);
                    i22++;
                    if (obj3 != null) {
                        grb.o();
                        return;
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i23 = 0;
                while (i23 < size8) {
                    Object obj4 = arrayList3.get(i23);
                    i23++;
                    if (obj4 != null) {
                        grb.o();
                        return;
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i24 = i; i24 < i2; i24++) {
            kd0 kd0Var3 = (kd0) arrayList.get(i24);
            if (booleanValue2) {
                for (int size9 = kd0Var3.a.size() - 1; size9 >= 0; size9--) {
                    gp4 gp4Var8 = ((ar4) kd0Var3.a.get(size9)).b;
                    if (gp4Var8 != null) {
                        g(gp4Var8).j();
                    }
                }
            } else {
                ArrayList arrayList11 = kd0Var3.a;
                int size10 = arrayList11.size();
                int i25 = 0;
                while (i25 < size10) {
                    Object obj5 = arrayList11.get(i25);
                    i25++;
                    gp4 gp4Var9 = ((ar4) obj5).b;
                    if (gp4Var9 != null) {
                        g(gp4Var9).j();
                    }
                }
            }
        }
        Q(this.v, true);
        int i26 = i;
        Iterator it3 = f(i26, i2, arrayList).iterator();
        while (it3.hasNext()) {
            tc3 tc3Var = (tc3) it3.next();
            tc3Var.e = booleanValue2;
            synchronized (tc3Var.b) {
                tc3Var.e();
                ArrayList arrayList12 = tc3Var.b;
                ListIterator listIterator = arrayList12.listIterator(arrayList12.size());
                if (listIterator.hasPrevious()) {
                    throw null;
                }
            }
            tc3Var.b();
        }
        while (i26 < i2) {
            kd0 kd0Var4 = (kd0) arrayList.get(i26);
            if (((Boolean) arrayList2.get(i26)).booleanValue() && kd0Var4.s >= 0) {
                kd0Var4.s = -1;
            }
            if (kd0Var4.p != null) {
                for (int i27 = 0; i27 < kd0Var4.p.size(); i27++) {
                    ((Runnable) kd0Var4.p.get(i27)).run();
                }
                kd0Var4.p = null;
            }
            i26++;
        }
        if (!z9 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        grb.o();
    }

    public final gp4 C(int i) {
        u8a u8aVar = this.c;
        ArrayList arrayList = (ArrayList) u8aVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gp4 gp4Var = (gp4) arrayList.get(size);
            if (gp4Var != null && gp4Var.O == i) {
                return gp4Var;
            }
        }
        for (xq4 xq4Var : ((HashMap) u8aVar.b).values()) {
            if (xq4Var != null) {
                gp4 gp4Var2 = xq4Var.c;
                if (gp4Var2.O == i) {
                    return gp4Var2;
                }
            }
        }
        return null;
    }

    public final gp4 D(String str) {
        u8a u8aVar = this.c;
        ArrayList arrayList = (ArrayList) u8aVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gp4 gp4Var = (gp4) arrayList.get(size);
            if (gp4Var != null && str.equals(gp4Var.Q)) {
                return gp4Var;
            }
        }
        for (xq4 xq4Var : ((HashMap) u8aVar.b).values()) {
            if (xq4Var != null) {
                gp4 gp4Var2 = xq4Var.c;
                if (str.equals(gp4Var2.Q)) {
                    return gp4Var2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((tc3) it.next()).getClass();
        }
    }

    public final ViewGroup G(gp4 gp4Var) {
        ViewGroup viewGroup = gp4Var.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (gp4Var.P <= 0 || !this.x.c()) {
            return null;
        }
        View b = this.x.b(gp4Var.P);
        if (b instanceof ViewGroup) {
            return (ViewGroup) b;
        }
        return null;
    }

    public final eq4 H() {
        gp4 gp4Var = this.y;
        return gp4Var != null ? gp4Var.K.H() : this.A;
    }

    public final rg7 I() {
        gp4 gp4Var = this.y;
        return gp4Var != null ? gp4Var.K.I() : this.B;
    }

    public final void J(gp4 gp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + gp4Var);
        }
        if (gp4Var.R) {
            return;
        }
        gp4Var.R = true;
        gp4Var.a0 = !gp4Var.a0;
        d0(gp4Var);
    }

    public final boolean M() {
        gp4 gp4Var = this.y;
        if (gp4Var == null) {
            return true;
        }
        return gp4Var.t() && this.y.p().M();
    }

    public final boolean P() {
        return this.H || this.I;
    }

    public final void Q(int i, boolean z) {
        ip4 ip4Var;
        if (this.w == null && i != -1) {
            grb.i("No activity");
            return;
        }
        if (z || i != this.v) {
            this.v = i;
            u8a u8aVar = this.c;
            HashMap hashMap = (HashMap) u8aVar.b;
            ArrayList arrayList = (ArrayList) u8aVar.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                xq4 xq4Var = (xq4) hashMap.get(((gp4) obj).e);
                if (xq4Var != null) {
                    xq4Var.j();
                }
            }
            for (xq4 xq4Var2 : hashMap.values()) {
                if (xq4Var2 != null) {
                    xq4Var2.j();
                    gp4 gp4Var = xq4Var2.c;
                    if (gp4Var.x && !gp4Var.v()) {
                        u8aVar.z(xq4Var2);
                    }
                }
            }
            f0();
            if (this.G && (ip4Var = this.w) != null && this.v == 7) {
                ip4Var.e.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void R() {
        if (this.w != null) {
            this.H = false;
            this.I = false;
            this.O.g = false;
            for (gp4 gp4Var : this.c.u()) {
                if (gp4Var != null) {
                    gp4Var.M.R();
                }
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i, int i2) {
        A(false);
        z(true);
        gp4 gp4Var = this.z;
        if (gp4Var != null && i < 0 && gp4Var.l().S()) {
            return true;
        }
        boolean U = U(this.L, this.M, i, i2);
        if (U) {
            this.b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
        h0();
        v();
        ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
        return U;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int i3 = -1;
        if (!this.d.isEmpty()) {
            if (i >= 0) {
                int size = this.d.size() - 1;
                while (true) {
                    if (size < 0) {
                        i3 = size;
                        break;
                    }
                    kd0 kd0Var = (kd0) this.d.get(size);
                    if (i < 0 || i != kd0Var.s) {
                        size--;
                    } else if (z) {
                        i3 = size;
                        while (i3 > 0) {
                            kd0 kd0Var2 = (kd0) this.d.get(i3 - 1);
                            if (i < 0 || i != kd0Var2.s) {
                                break;
                            }
                            i3--;
                        }
                    } else if (size != this.d.size() - 1) {
                        i3 = size + 1;
                    }
                }
            } else {
                i3 = z ? 0 : this.d.size() - 1;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((kd0) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(gp4 gp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + gp4Var + " nesting=" + gp4Var.J);
        }
        boolean v = gp4Var.v();
        if (gp4Var.S && v) {
            return;
        }
        u8a u8aVar = this.c;
        synchronized (((ArrayList) u8aVar.a)) {
            ((ArrayList) u8aVar.a).remove(gp4Var);
        }
        gp4Var.w = false;
        if (L(gp4Var)) {
            this.G = true;
        }
        gp4Var.x = true;
        d0(gp4Var);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            grb.i("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((kd0) arrayList.get(i)).o) {
                if (i2 != i) {
                    B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((kd0) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(arrayList, arrayList2, i2, size);
        }
    }

    public final void X(Bundle bundle) {
        um4 um4Var;
        int i;
        int i2;
        Bundle bundle2;
        xq4 xq4Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.w.b.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.w.b.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        u8a u8aVar = this.c;
        HashMap hashMap2 = (HashMap) u8aVar.c;
        HashMap hashMap3 = (HashMap) u8aVar.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        mq4 mq4Var = (mq4) bundle.getParcelable("state");
        if (mq4Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = mq4Var.a;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            um4Var = this.o;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            Bundle I = u8aVar.I((String) obj, null);
            if (I != null) {
                gp4 gp4Var = (gp4) this.O.b.get(((wq4) I.getParcelable("state")).b);
                if (gp4Var != null) {
                    if (K(2)) {
                        i2 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + gp4Var);
                    } else {
                        i2 = 2;
                    }
                    xq4Var = new xq4(um4Var, u8aVar, gp4Var, I);
                    bundle2 = I;
                } else {
                    i2 = 2;
                    bundle2 = I;
                    xq4Var = new xq4(this.o, this.c, this.w.b.getClassLoader(), H(), I);
                }
                gp4 gp4Var2 = xq4Var.c;
                gp4Var2.b = bundle2;
                gp4Var2.K = this;
                if (K(i2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + gp4Var2.e + "): " + gp4Var2);
                }
                xq4Var.l(this.w.b.getClassLoader());
                u8aVar.y(xq4Var);
                xq4Var.e = this.v;
            }
        }
        nq4 nq4Var = this.O;
        nq4Var.getClass();
        ArrayList arrayList2 = new ArrayList(nq4Var.b.values());
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            gp4 gp4Var3 = (gp4) obj2;
            if (hashMap3.get(gp4Var3.e) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + gp4Var3 + " that was not found in the set of active Fragments " + mq4Var.a);
                }
                this.O.f(gp4Var3);
                gp4Var3.K = this;
                xq4 xq4Var2 = new xq4(um4Var, u8aVar, gp4Var3);
                xq4Var2.e = 1;
                xq4Var2.j();
                gp4Var3.x = true;
                xq4Var2.j();
            }
        }
        ArrayList arrayList3 = mq4Var.b;
        ((ArrayList) u8aVar.a).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList3.get(i5);
                i5++;
                String str3 = (String) obj3;
                gp4 o = u8aVar.o(str3);
                if (o == null) {
                    grb.i(qd4.y("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + o);
                }
                u8aVar.c(o);
            }
        }
        if (mq4Var.c != null) {
            this.d = new ArrayList(mq4Var.c.length);
            int i6 = 0;
            while (true) {
                ld0[] ld0VarArr = mq4Var.c;
                if (i6 >= ld0VarArr.length) {
                    break;
                }
                ld0 ld0Var = ld0VarArr[i6];
                ArrayList arrayList4 = ld0Var.b;
                kd0 kd0Var = new kd0(this);
                int[] iArr = ld0Var.a;
                int i7 = 0;
                int i8 = 0;
                while (i7 < iArr.length) {
                    ar4 ar4Var = new ar4();
                    int i9 = i7 + 1;
                    ar4Var.a = iArr[i7];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + kd0Var + " op #" + i8 + " base fragment #" + iArr[i9]);
                    }
                    ar4Var.h = z26.values()[ld0Var.c[i8]];
                    ar4Var.i = z26.values()[ld0Var.d[i8]];
                    int i10 = i7 + 2;
                    ar4Var.c = iArr[i9] != 0;
                    int i11 = iArr[i10];
                    ar4Var.d = i11;
                    int i12 = iArr[i7 + 3];
                    ar4Var.e = i12;
                    int i13 = i7 + 5;
                    int i14 = iArr[i7 + 4];
                    ar4Var.f = i14;
                    i7 += 6;
                    int[] iArr2 = iArr;
                    int i15 = iArr2[i13];
                    ar4Var.g = i15;
                    kd0Var.b = i11;
                    kd0Var.c = i12;
                    kd0Var.d = i14;
                    kd0Var.e = i15;
                    kd0Var.b(ar4Var);
                    i8++;
                    iArr = iArr2;
                }
                kd0Var.f = ld0Var.e;
                kd0Var.h = ld0Var.f;
                kd0Var.g = true;
                kd0Var.i = ld0Var.n;
                kd0Var.j = ld0Var.r;
                kd0Var.k = ld0Var.s;
                kd0Var.l = ld0Var.w;
                kd0Var.m = ld0Var.x;
                kd0Var.n = ld0Var.y;
                kd0Var.o = ld0Var.E;
                kd0Var.s = ld0Var.h;
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    String str4 = (String) arrayList4.get(i16);
                    if (str4 != null) {
                        ((ar4) kd0Var.a.get(i16)).b = u8aVar.o(str4);
                    }
                }
                kd0Var.c(1);
                if (K(2)) {
                    StringBuilder m = uh9.m(i6, "restoreAllState: back stack #", " (index ");
                    m.append(kd0Var.s);
                    m.append("): ");
                    m.append(kd0Var);
                    Log.v("FragmentManager", m.toString());
                    PrintWriter printWriter = new PrintWriter(new fe6());
                    kd0Var.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(kd0Var);
                i6++;
            }
            i = 0;
        } else {
            i = 0;
            this.d = new ArrayList();
        }
        this.k.set(mq4Var.d);
        String str5 = mq4Var.e;
        if (str5 != null) {
            gp4 o2 = u8aVar.o(str5);
            this.z = o2;
            r(o2);
        }
        ArrayList arrayList5 = mq4Var.f;
        if (arrayList5 != null) {
            for (int i17 = i; i17 < arrayList5.size(); i17++) {
                this.l.put((String) arrayList5.get(i17), (md0) mq4Var.h.get(i17));
            }
        }
        this.F = new ArrayDeque(mq4Var.n);
    }

    public final Bundle Y() {
        int i;
        ArrayList arrayList;
        ld0[] ld0VarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.H = true;
        this.O.g = true;
        u8a u8aVar = this.c;
        u8aVar.getClass();
        HashMap hashMap = (HashMap) u8aVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xq4 xq4Var = (xq4) it.next();
            if (xq4Var != null) {
                gp4 gp4Var = xq4Var.c;
                String str = gp4Var.e;
                Bundle bundle3 = new Bundle();
                gp4 gp4Var2 = xq4Var.c;
                if (gp4Var2.a == -1 && (bundle = gp4Var2.b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new wq4(gp4Var2));
                if (gp4Var2.a > 0) {
                    Bundle bundle4 = new Bundle();
                    gp4Var2.G(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    xq4Var.a.J(gp4Var2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    gp4Var2.h0.h(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle Y = gp4Var2.M.Y();
                    if (!Y.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", Y);
                    }
                    SparseArray<? extends Parcelable> sparseArray = gp4Var2.c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = gp4Var2.d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = gp4Var2.f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                u8aVar.I(str, bundle3);
                arrayList2.add(gp4Var.e);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + gp4Var + ": " + gp4Var.b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.c.c;
        if (!hashMap2.isEmpty()) {
            u8a u8aVar2 = this.c;
            synchronized (((ArrayList) u8aVar2.a)) {
                if (((ArrayList) u8aVar2.a).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) u8aVar2.a).size());
                    ArrayList arrayList3 = (ArrayList) u8aVar2.a;
                    int size = arrayList3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList3.get(i2);
                        i2++;
                        gp4 gp4Var3 = (gp4) obj;
                        arrayList.add(gp4Var3.e);
                        if (K(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + gp4Var3.e + "): " + gp4Var3);
                        }
                    }
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                ld0VarArr = new ld0[size2];
                for (i = 0; i < size2; i++) {
                    ld0VarArr[i] = new ld0((kd0) this.d.get(i));
                    if (K(2)) {
                        StringBuilder m = uh9.m(i, "saveAllState: adding back stack #", ": ");
                        m.append(this.d.get(i));
                        Log.v("FragmentManager", m.toString());
                    }
                }
            } else {
                ld0VarArr = null;
            }
            mq4 mq4Var = new mq4();
            mq4Var.e = null;
            ArrayList arrayList4 = new ArrayList();
            mq4Var.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            mq4Var.h = arrayList5;
            mq4Var.a = arrayList2;
            mq4Var.b = arrayList;
            mq4Var.c = ld0VarArr;
            mq4Var.d = this.k.get();
            gp4 gp4Var4 = this.z;
            if (gp4Var4 != null) {
                mq4Var.e = gp4Var4.e;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            mq4Var.n = new ArrayList(this.F);
            bundle2.putParcelable("state", mq4Var);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(c00.i("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(c00.i("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void Z() {
        synchronized (this.a) {
            if (this.a.size() == 1) {
                this.w.c.removeCallbacks(this.P);
                this.w.c.post(this.P);
                h0();
            }
        }
    }

    public final xq4 a(gp4 gp4Var) {
        String str = gp4Var.c0;
        if (str != null) {
            zq4.c(gp4Var, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + gp4Var);
        }
        xq4 g = g(gp4Var);
        gp4Var.K = this;
        u8a u8aVar = this.c;
        u8aVar.y(g);
        if (!gp4Var.S) {
            u8aVar.c(gp4Var);
            gp4Var.x = false;
            gp4Var.a0 = false;
            if (L(gp4Var)) {
                this.G = true;
            }
        }
        return g;
    }

    public final void a0(gp4 gp4Var, boolean z) {
        ViewGroup G = G(gp4Var);
        if (G == null || !(G instanceof kp4)) {
            return;
        }
        ((kp4) G).setDrawDisappearingViewsLast(!z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(ip4 ip4Var, ane aneVar, gp4 gp4Var) {
        nq4 nq4Var;
        if (this.w != null) {
            grb.i("Already attached");
            return;
        }
        this.w = ip4Var;
        this.x = aneVar;
        this.y = gp4Var;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (gp4Var != 0) {
            copyOnWriteArrayList.add(new fq4(gp4Var));
        } else if (ip4Var != null) {
            copyOnWriteArrayList.add(ip4Var);
        }
        if (this.y != null) {
            h0();
        }
        if (ip4Var != null) {
            vr7 p = ip4Var.e.p();
            this.g = p;
            ip4 ip4Var2 = gp4Var != 0 ? gp4Var : ip4Var;
            p.getClass();
            cq4 cq4Var = this.j;
            cq4Var.getClass();
            k36 m = ip4Var2.m();
            if (m.b != z26.a) {
                cq4Var.b.add(new tr7(p, m, cq4Var));
                p.c();
                cq4Var.c = new j03(0, p, vr7.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, (byte) 3);
            }
        }
        if (gp4Var != 0) {
            nq4 nq4Var2 = gp4Var.K.O;
            HashMap hashMap = nq4Var2.c;
            nq4Var = (nq4) hashMap.get(gp4Var.e);
            if (nq4Var == null) {
                nq4Var = new nq4(nq4Var2.e);
                hashMap.put(gp4Var.e, nq4Var);
            }
            this.O = nq4Var;
        } else if (ip4Var != null) {
            nq4Var = (nq4) new pq8(ip4Var.e.f(), nq4.h).n(nq4.class);
            this.O = nq4Var;
        } else {
            nq4Var = new nq4(false);
            this.O = nq4Var;
        }
        nq4Var.g = P();
        this.c.d = this.O;
        ip4 ip4Var3 = this.w;
        byte b = 2;
        if (ip4Var3 != null && gp4Var == 0) {
            po g = ip4Var3.g();
            g.f("android:support:fragments", new hq2(this, b));
            Bundle c = g.c("android:support:fragments");
            if (c != null) {
                X(c);
            }
        }
        ip4 ip4Var4 = this.w;
        if (ip4Var4 != null) {
            jq2 jq2Var = ip4Var4.e.x;
            String concat = "FragmentManager:".concat(gp4Var != 0 ? c00.k(new StringBuilder(), gp4Var.e, ":") : "");
            this.C = jq2Var.c(concat.concat("StartActivityForResult"), new t9((byte) 1), new xh4(this, b));
            this.D = jq2Var.c(concat.concat("StartIntentSenderForResult"), new t9((byte) 3), new aj3((Object) this, (byte) 7));
            this.E = jq2Var.c(concat.concat("RequestPermissions"), new t9((byte) 0), new kj4(this, b));
        }
        ip4 ip4Var5 = this.w;
        if (ip4Var5 != null) {
            ip4Var5.e.o(this.q);
        }
        ip4 ip4Var6 = this.w;
        if (ip4Var6 != null) {
            ip4Var6.e.E.add(this.r);
        }
        ip4 ip4Var7 = this.w;
        if (ip4Var7 != null) {
            ip4Var7.e.G.add(this.s);
        }
        ip4 ip4Var8 = this.w;
        if (ip4Var8 != null) {
            ip4Var8.e.H.add(this.t);
        }
        ip4 ip4Var9 = this.w;
        if (ip4Var9 == null || gp4Var != 0) {
            return;
        }
        pm3 pm3Var = ip4Var9.e.c;
        ((CopyOnWriteArrayList) pm3Var.c).add(this.u);
        ((Runnable) pm3Var.b).run();
    }

    public final void b0(gp4 gp4Var, z26 z26Var) {
        if (gp4Var == this.c.o(gp4Var.e) && (gp4Var.L == null || gp4Var.K == this)) {
            gp4Var.d0 = z26Var;
        } else {
            c22.c("Fragment ", gp4Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final void c(gp4 gp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + gp4Var);
        }
        if (gp4Var.S) {
            gp4Var.S = false;
            if (gp4Var.w) {
                return;
            }
            this.c.c(gp4Var);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + gp4Var);
            }
            if (L(gp4Var)) {
                this.G = true;
            }
        }
    }

    public final void c0(gp4 gp4Var) {
        if (gp4Var != null) {
            if (gp4Var != this.c.o(gp4Var.e) || (gp4Var.L != null && gp4Var.K != this)) {
                c22.c("Fragment ", gp4Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        gp4 gp4Var2 = this.z;
        this.z = gp4Var;
        r(gp4Var2);
        r(this.z);
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(gp4 gp4Var) {
        ViewGroup G = G(gp4Var);
        if (G != null) {
            fp4 fp4Var = gp4Var.Z;
            if ((fp4Var == null ? 0 : fp4Var.e) + (fp4Var == null ? 0 : fp4Var.d) + (fp4Var == null ? 0 : fp4Var.c) + (fp4Var == null ? 0 : fp4Var.b) > 0) {
                if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G.setTag(R.id.visible_removing_fragment_view_tag, gp4Var);
                }
                gp4 gp4Var2 = (gp4) G.getTag(R.id.visible_removing_fragment_view_tag);
                fp4 fp4Var2 = gp4Var.Z;
                boolean z = fp4Var2 != null ? fp4Var2.a : false;
                if (gp4Var2.Z != null) {
                    gp4Var2.j().a = z;
                }
            }
        }
    }

    public final HashSet e() {
        tc3 tc3Var;
        HashSet hashSet = new HashSet();
        ArrayList r = this.c.r();
        int size = r.size();
        int i = 0;
        while (i < size) {
            Object obj = r.get(i);
            i++;
            ViewGroup viewGroup = ((xq4) obj).c.W;
            if (viewGroup != null) {
                I().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof tc3) {
                    tc3Var = (tc3) tag;
                } else {
                    tc3Var = new tc3(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, tc3Var);
                }
                hashSet.add(tc3Var);
            }
        }
        return hashSet;
    }

    public final HashSet f(int i, int i2, ArrayList arrayList) {
        ViewGroup viewGroup;
        tc3 tc3Var;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((kd0) arrayList.get(i)).a;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                gp4 gp4Var = ((ar4) obj).b;
                if (gp4Var != null && (viewGroup = gp4Var.W) != null) {
                    I().getClass();
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof tc3) {
                        tc3Var = (tc3) tag;
                    } else {
                        tc3Var = new tc3(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, tc3Var);
                    }
                    hashSet.add(tc3Var);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0() {
        ArrayList r = this.c.r();
        int size = r.size();
        int i = 0;
        while (i < size) {
            Object obj = r.get(i);
            i++;
            xq4 xq4Var = (xq4) obj;
            gp4 gp4Var = xq4Var.c;
            if (gp4Var.X) {
                if (this.b) {
                    this.K = true;
                } else {
                    gp4Var.X = false;
                    xq4Var.j();
                }
            }
        }
    }

    public final xq4 g(gp4 gp4Var) {
        String str = gp4Var.e;
        u8a u8aVar = this.c;
        xq4 xq4Var = (xq4) ((HashMap) u8aVar.b).get(str);
        if (xq4Var != null) {
            return xq4Var;
        }
        xq4 xq4Var2 = new xq4(this.o, u8aVar, gp4Var);
        xq4Var2.l(this.w.b.getClassLoader());
        xq4Var2.e = this.v;
        return xq4Var2;
    }

    public final void g0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new fe6());
        ip4 ip4Var = this.w;
        if (ip4Var == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            ip4Var.e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    public final void h(gp4 gp4Var) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + gp4Var);
        }
        if (gp4Var.S) {
            return;
        }
        gp4Var.S = true;
        if (gp4Var.w) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + gp4Var);
            }
            u8a u8aVar = this.c;
            synchronized (((ArrayList) u8aVar.a)) {
                ((ArrayList) u8aVar.a).remove(gp4Var);
            }
            gp4Var.w = false;
            if (L(gp4Var)) {
                this.G = true;
            }
            d0(gp4Var);
        }
    }

    public final void h0() {
        synchronized (this.a) {
            if (!this.a.isEmpty()) {
                cq4 cq4Var = this.j;
                cq4Var.a = true;
                sr4 sr4Var = cq4Var.c;
                if (sr4Var != null) {
                    sr4Var.invoke();
                }
                if (K(3)) {
                    Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                }
                return;
            }
            boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && O(this.y);
            if (K(3)) {
                Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
            }
            cq4 cq4Var2 = this.j;
            cq4Var2.a = z;
            sr4 sr4Var2 = cq4Var2.c;
            if (sr4Var2 != null) {
                sr4Var2.invoke();
            }
        }
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (gp4 gp4Var : this.c.u()) {
            if (gp4Var != null) {
                gp4Var.onConfigurationChanged(configuration);
                if (z) {
                    gp4Var.M.i(true, configuration);
                }
            }
        }
    }

    public final boolean j() {
        if (this.v >= 1) {
            for (gp4 gp4Var : this.c.u()) {
                if (gp4Var != null) {
                    if (!gp4Var.R ? gp4Var.M.j() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (gp4 gp4Var : this.c.u()) {
            if (gp4Var != null && N(gp4Var)) {
                if (!gp4Var.R ? gp4Var.M.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gp4Var);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                gp4 gp4Var2 = (gp4) this.e.get(i);
                if (arrayList == null || !arrayList.contains(gp4Var2)) {
                    gp4Var2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l() {
        boolean z = true;
        this.J = true;
        A(true);
        x();
        ip4 ip4Var = this.w;
        u8a u8aVar = this.c;
        if (ip4Var != null) {
            z = ((nq4) u8aVar.d).f;
        } else {
            Context context = ip4Var.b;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((md0) it.next()).a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((nq4) u8aVar.d).d((String) obj, false);
                }
            }
        }
        u(-1);
        ip4 ip4Var2 = this.w;
        if (ip4Var2 != null) {
            ip4Var2.e.E.remove(this.r);
        }
        ip4 ip4Var3 = this.w;
        if (ip4Var3 != null) {
            ip4Var3.e.y.remove(this.q);
        }
        ip4 ip4Var4 = this.w;
        if (ip4Var4 != null) {
            ip4Var4.e.G.remove(this.s);
        }
        ip4 ip4Var5 = this.w;
        if (ip4Var5 != null) {
            ip4Var5.e.H.remove(this.t);
        }
        ip4 ip4Var6 = this.w;
        if (ip4Var6 != null && this.y == null) {
            pm3 pm3Var = ip4Var6.e.c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) pm3Var.c;
            dq4 dq4Var = this.u;
            copyOnWriteArrayList.remove(dq4Var);
            if (((HashMap) pm3Var.d).remove(dq4Var) == null) {
                ((Runnable) pm3Var.b).run();
            } else {
                grb.o();
            }
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            Iterator it2 = this.j.b.iterator();
            while (it2.hasNext()) {
                ((sa1) it2.next()).cancel();
            }
            this.g = null;
        }
        v9 v9Var = this.C;
        if (v9Var != null) {
            v9Var.d.e(v9Var.b);
            v9 v9Var2 = this.D;
            v9Var2.d.e(v9Var2.b);
            v9 v9Var3 = this.E;
            v9Var3.d.e(v9Var3.b);
        }
    }

    public final void m(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (gp4 gp4Var : this.c.u()) {
            if (gp4Var != null) {
                gp4Var.V = true;
                if (z) {
                    gp4Var.M.m(true);
                }
            }
        }
    }

    public final void n(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (gp4 gp4Var : this.c.u()) {
            if (gp4Var != null && z) {
                gp4Var.M.n(true);
            }
        }
    }

    public final void o() {
        ArrayList t = this.c.t();
        int size = t.size();
        int i = 0;
        while (i < size) {
            Object obj = t.get(i);
            i++;
            gp4 gp4Var = (gp4) obj;
            if (gp4Var != null) {
                gp4Var.u();
                gp4Var.M.o();
            }
        }
    }

    public final boolean p() {
        if (this.v >= 1) {
            for (gp4 gp4Var : this.c.u()) {
                if (gp4Var != null) {
                    if (!gp4Var.R ? gp4Var.M.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v >= 1) {
            for (gp4 gp4Var : this.c.u()) {
                if (gp4Var != null && !gp4Var.R) {
                    gp4Var.M.q();
                }
            }
        }
    }

    public final void r(gp4 gp4Var) {
        if (gp4Var != null) {
            if (gp4Var == this.c.o(gp4Var.e)) {
                gp4Var.K.getClass();
                boolean O = O(gp4Var);
                Boolean bool = gp4Var.s;
                if (bool == null || bool.booleanValue() != O) {
                    gp4Var.s = Boolean.valueOf(O);
                    lq4 lq4Var = gp4Var.M;
                    lq4Var.h0();
                    lq4Var.r(lq4Var.z);
                }
            }
        }
    }

    public final void s(boolean z) {
        if (z && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (gp4 gp4Var : this.c.u()) {
            if (gp4Var != null && z) {
                gp4Var.M.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.v < 1) {
            return false;
        }
        boolean z = false;
        for (gp4 gp4Var : this.c.u()) {
            if (gp4Var != null && N(gp4Var)) {
                if (!gp4Var.R ? gp4Var.M.t() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        gp4 gp4Var = this.y;
        if (gp4Var != null) {
            sb.append(gp4Var.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            ip4 ip4Var = this.w;
            if (ip4Var != null) {
                sb.append(ip4Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (xq4 xq4Var : ((HashMap) this.c.b).values()) {
                if (xq4Var != null) {
                    xq4Var.e = i;
                }
            }
            Q(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((tc3) it.next()).c();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.K) {
            this.K = false;
            f0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String o = qd4.o(str, "    ");
        u8a u8aVar = this.c;
        ArrayList arrayList = (ArrayList) u8aVar.a;
        String o2 = qd4.o(str, "    ");
        HashMap hashMap = (HashMap) u8aVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (xq4 xq4Var : hashMap.values()) {
                printWriter.print(str);
                if (xq4Var != null) {
                    gp4 gp4Var = xq4Var.c;
                    printWriter.println(gp4Var);
                    gp4Var.i(o2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                gp4 gp4Var2 = (gp4) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(gp4Var2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                gp4 gp4Var3 = (gp4) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(gp4Var3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                kd0 kd0Var = (kd0) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(kd0Var.toString());
                kd0Var.g(o, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    Object obj = (hq4) this.a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((tc3) it.next()).c();
        }
    }

    public final void y(hq4 hq4Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    grb.i("FragmentManager has been destroyed");
                    return;
                } else {
                    grb.i("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (P()) {
                grb.i("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            if (this.w == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.a.add(hq4Var);
                Z();
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            grb.i("FragmentManager is already executing transactions");
            return;
        }
        if (this.w == null) {
            if (this.J) {
                grb.i("FragmentManager has been destroyed");
                return;
            } else {
                grb.i("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.w.c.getLooper()) {
            grb.i("Must be called from main thread of fragment host");
            return;
        }
        if (!z && P()) {
            grb.i("Can not perform this action after onSaveInstanceState");
        } else if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
