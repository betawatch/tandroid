package androidx.fragment.app;

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
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class j0 {
    public final c0 A;
    public final ya.b B;
    public androidx.activity.result.c C;
    public androidx.activity.result.c D;
    public androidx.activity.result.c E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public m0 O;
    public final androidx.activity.i P;
    public boolean b;
    public ArrayList e;
    public androidx.activity.x g;
    public final ArrayList n;
    public final we.b o;
    public final CopyOnWriteArrayList p;
    public final z q;
    public final z r;
    public final z s;
    public final z t;
    public final b0 u;
    public int v;
    public u w;
    public f7.a0 x;
    public s y;
    public s z;
    public final ArrayList a = new ArrayList();
    public final com.google.firebase.messaging.t c = new com.google.firebase.messaging.t(3);
    public ArrayList d = new ArrayList();
    public final y f = new y(this);
    public a h = null;
    public boolean i = false;
    public final a0 j = new a0(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());
    public final Map m = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.z] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.z] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.z] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.z] */
    public j0() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new we.b(this);
        this.p = new CopyOnWriteArrayList();
        final int i9 = 0;
        this.q = new q0.a(this) { // from class: androidx.fragment.app.z
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j0 j0Var = this.b;
                        if (j0Var.M()) {
                            j0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j0 j0Var2 = this.b;
                        if (j0Var2.M() && num.intValue() == 80) {
                            j0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.i iVar = (e0.i) obj;
                        j0 j0Var3 = this.b;
                        if (j0Var3.M()) {
                            boolean z10 = iVar.a;
                            j0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.q0 q0Var = (e0.q0) obj;
                        j0 j0Var4 = this.b;
                        if (j0Var4.M()) {
                            boolean z11 = q0Var.a;
                            j0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.r = new q0.a(this) { // from class: androidx.fragment.app.z
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j0 j0Var = this.b;
                        if (j0Var.M()) {
                            j0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j0 j0Var2 = this.b;
                        if (j0Var2.M() && num.intValue() == 80) {
                            j0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.i iVar = (e0.i) obj;
                        j0 j0Var3 = this.b;
                        if (j0Var3.M()) {
                            boolean z10 = iVar.a;
                            j0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.q0 q0Var = (e0.q0) obj;
                        j0 j0Var4 = this.b;
                        if (j0Var4.M()) {
                            boolean z11 = q0Var.a;
                            j0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.s = new q0.a(this) { // from class: androidx.fragment.app.z
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j0 j0Var = this.b;
                        if (j0Var.M()) {
                            j0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j0 j0Var2 = this.b;
                        if (j0Var2.M() && num.intValue() == 80) {
                            j0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.i iVar = (e0.i) obj;
                        j0 j0Var3 = this.b;
                        if (j0Var3.M()) {
                            boolean z10 = iVar.a;
                            j0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.q0 q0Var = (e0.q0) obj;
                        j0 j0Var4 = this.b;
                        if (j0Var4.M()) {
                            boolean z11 = q0Var.a;
                            j0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.t = new q0.a(this) { // from class: androidx.fragment.app.z
            public final /* synthetic */ j0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        j0 j0Var = this.b;
                        if (j0Var.M()) {
                            j0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        j0 j0Var2 = this.b;
                        if (j0Var2.M() && num.intValue() == 80) {
                            j0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.i iVar = (e0.i) obj;
                        j0 j0Var3 = this.b;
                        if (j0Var3.M()) {
                            boolean z10 = iVar.a;
                            j0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.q0 q0Var = (e0.q0) obj;
                        j0 j0Var4 = this.b;
                        if (j0Var4.M()) {
                            boolean z11 = q0Var.a;
                            j0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.u = new b0(this);
        this.v = -1;
        this.A = new c0(this);
        this.B = new ya.b(2);
        this.F = new ArrayDeque();
        this.P = new androidx.activity.i(this, 4);
    }

    public static HashSet F(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < aVar.a.size(); i9++) {
            s sVar = ((q0) aVar.a.get(i9)).b;
            if (sVar != null && aVar.g) {
                hashSet.add(sVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i9) {
        return Log.isLoggable("FragmentManager", i9);
    }

    public static boolean L(s sVar) {
        sVar.getClass();
        ArrayList t10 = sVar.H.c.t();
        int size = t10.size();
        boolean z10 = false;
        int i9 = 0;
        while (i9 < size) {
            Object obj = t10.get(i9);
            i9++;
            s sVar2 = (s) obj;
            if (sVar2 != null) {
                z10 = L(sVar2);
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(s sVar) {
        if (sVar == null) {
            return true;
        }
        if (sVar.P) {
            return sVar.F == null || N(sVar.I);
        }
        return false;
    }

    public static boolean O(s sVar) {
        if (sVar == null) {
            return true;
        }
        j0 j0Var = sVar.F;
        return sVar.equals(j0Var.z) && O(j0Var.y);
    }

    public static void e0(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + sVar);
        }
        if (sVar.M) {
            sVar.M = false;
            sVar.V = !sVar.V;
        }
    }

    public final boolean A(boolean z10) {
        boolean z11;
        a aVar;
        z(z10);
        if (!this.i && (aVar = this.h) != null) {
            aVar.r = false;
            aVar.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.e(false, false);
            this.a.add(0, this.h);
            ArrayList arrayList = this.h.a;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                s sVar = ((q0) obj).b;
                if (sVar != null) {
                    sVar.x = false;
                }
            }
            this.h = null;
        }
        boolean z12 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z11 = false;
                } else {
                    try {
                        int size2 = this.a.size();
                        z11 = false;
                        for (int i10 = 0; i10 < size2; i10++) {
                            z11 |= ((g0) this.a.get(i10)).a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!z11) {
                h0();
                v();
                ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
                return z12;
            }
            z12 = true;
            this.b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
    }

    public final void B(int i9, int i10, ArrayList arrayList, ArrayList arrayList2) {
        String str;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        int i14;
        com.google.firebase.messaging.t tVar = this.c;
        ArrayList arrayList3 = this.n;
        boolean z13 = ((a) arrayList.get(i9)).o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(tVar.u());
        s sVar = this.z;
        int i15 = i9;
        boolean z14 = false;
        while (i15 < i10) {
            a aVar = (a) arrayList.get(i15);
            if (((Boolean) arrayList2.get(i15)).booleanValue()) {
                z10 = z13;
                i11 = i15;
                z11 = z14;
                int i16 = 1;
                ArrayList arrayList5 = this.N;
                ArrayList arrayList6 = aVar.a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    q0 q0Var = (q0) arrayList6.get(size);
                    int i17 = q0Var.a;
                    if (i17 != i16) {
                        if (i17 != 3) {
                            switch (i17) {
                                case 8:
                                    sVar = null;
                                    break;
                                case 9:
                                    sVar = q0Var.b;
                                    break;
                                case 10:
                                    q0Var.i = q0Var.h;
                                    break;
                            }
                            size--;
                            i16 = 1;
                        }
                        arrayList5.add(q0Var.b);
                        size--;
                        i16 = 1;
                    }
                    arrayList5.remove(q0Var.b);
                    size--;
                    i16 = 1;
                }
            } else {
                ArrayList arrayList7 = this.N;
                ArrayList arrayList8 = aVar.a;
                int i18 = 0;
                while (i18 < arrayList8.size()) {
                    q0 q0Var2 = (q0) arrayList8.get(i18);
                    int i19 = q0Var2.a;
                    boolean z15 = z13;
                    int i20 = 1;
                    if (i19 != 1) {
                        i12 = i15;
                        if (i19 != 2) {
                            if (i19 == 3 || i19 == 6) {
                                arrayList7.remove(q0Var2.b);
                                s sVar2 = q0Var2.b;
                                if (sVar2 == sVar) {
                                    arrayList8.add(i18, new q0(9, sVar2));
                                    i18++;
                                    z12 = z14;
                                    i20 = 1;
                                    sVar = null;
                                }
                            } else if (i19 == 7) {
                                i20 = 1;
                            } else if (i19 == 8) {
                                arrayList8.add(i18, new q0(9, sVar, 0));
                                q0Var2.c = true;
                                i18++;
                                sVar = q0Var2.b;
                            }
                            z12 = z14;
                            i20 = 1;
                        } else {
                            s sVar3 = q0Var2.b;
                            int i21 = sVar3.K;
                            int size2 = arrayList7.size() - 1;
                            boolean z16 = false;
                            while (size2 >= 0) {
                                int i22 = size2;
                                s sVar4 = (s) arrayList7.get(size2);
                                boolean z17 = z14;
                                if (sVar4.K != i21) {
                                    i13 = i21;
                                } else if (sVar4 == sVar3) {
                                    i13 = i21;
                                    z16 = true;
                                } else {
                                    if (sVar4 == sVar) {
                                        i13 = i21;
                                        i14 = 0;
                                        arrayList8.add(i18, new q0(9, sVar4, 0));
                                        i18++;
                                        sVar = null;
                                    } else {
                                        i13 = i21;
                                        i14 = 0;
                                    }
                                    q0 q0Var3 = new q0(3, sVar4, i14);
                                    q0Var3.d = q0Var2.d;
                                    q0Var3.f = q0Var2.f;
                                    q0Var3.e = q0Var2.e;
                                    q0Var3.g = q0Var2.g;
                                    arrayList8.add(i18, q0Var3);
                                    arrayList7.remove(sVar4);
                                    i18++;
                                    sVar = sVar;
                                }
                                size2 = i22 - 1;
                                i21 = i13;
                                z14 = z17;
                            }
                            z12 = z14;
                            i20 = 1;
                            if (z16) {
                                arrayList8.remove(i18);
                                i18--;
                            } else {
                                q0Var2.a = 1;
                                q0Var2.c = true;
                                arrayList7.add(sVar3);
                            }
                        }
                        i18 += i20;
                        z13 = z15;
                        i15 = i12;
                        z14 = z12;
                    } else {
                        i12 = i15;
                    }
                    z12 = z14;
                    arrayList7.add(q0Var2.b);
                    i18 += i20;
                    z13 = z15;
                    i15 = i12;
                    z14 = z12;
                }
                z10 = z13;
                i11 = i15;
                z11 = z14;
            }
            z14 = z11 || aVar.g;
            i15 = i11 + 1;
            z13 = z10;
        }
        boolean z18 = z13;
        boolean z19 = z14;
        this.N.clear();
        if (!z18 && this.v >= 1) {
            for (int i23 = i9; i23 < i10; i23++) {
                ArrayList arrayList9 = ((a) arrayList.get(i23)).a;
                int size3 = arrayList9.size();
                int i24 = 0;
                while (i24 < size3) {
                    Object obj = arrayList9.get(i24);
                    i24++;
                    s sVar5 = ((q0) obj).b;
                    if (sVar5 != null && sVar5.F != null) {
                        tVar.A(g(sVar5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i25 = i9;
        while (i25 < i10) {
            a aVar2 = (a) arrayList.get(i25);
            if (((Boolean) arrayList2.get(i25)).booleanValue()) {
                aVar2.c(-1);
                j0 j0Var = aVar2.q;
                ArrayList arrayList10 = aVar2.a;
                boolean z20 = true;
                for (int size4 = arrayList10.size() - 1; size4 >= 0; size4--) {
                    q0 q0Var4 = (q0) arrayList10.get(size4);
                    s sVar6 = q0Var4.b;
                    if (sVar6 != null) {
                        if (sVar6.U != null) {
                            sVar6.j().a = z20;
                        }
                        int i26 = aVar2.f;
                        int i27 = 8194;
                        if (i26 != 4097) {
                            if (i26 != 8194) {
                                i27 = 4100;
                                if (i26 != 8197) {
                                    i27 = i26 != 4099 ? i26 != 4100 ? 0 : 8197 : 4099;
                                }
                            } else {
                                i27 = 4097;
                            }
                        }
                        if (sVar6.U != null || i27 != 0) {
                            sVar6.j();
                            sVar6.U.f = i27;
                        }
                        sVar6.j();
                        sVar6.U.getClass();
                    }
                    switch (q0Var4.a) {
                        case 1:
                            sVar6.L(q0Var4.d, q0Var4.e, q0Var4.f, q0Var4.g);
                            z20 = true;
                            j0Var.a0(sVar6, true);
                            j0Var.V(sVar6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + q0Var4.a);
                        case 3:
                            sVar6.L(q0Var4.d, q0Var4.e, q0Var4.f, q0Var4.g);
                            j0Var.a(sVar6);
                            z20 = true;
                        case 4:
                            sVar6.L(q0Var4.d, q0Var4.e, q0Var4.f, q0Var4.g);
                            j0Var.getClass();
                            e0(sVar6);
                            z20 = true;
                        case 5:
                            sVar6.L(q0Var4.d, q0Var4.e, q0Var4.f, q0Var4.g);
                            j0Var.a0(sVar6, true);
                            j0Var.J(sVar6);
                            z20 = true;
                        case 6:
                            sVar6.L(q0Var4.d, q0Var4.e, q0Var4.f, q0Var4.g);
                            j0Var.c(sVar6);
                            z20 = true;
                        case 7:
                            sVar6.L(q0Var4.d, q0Var4.e, q0Var4.f, q0Var4.g);
                            j0Var.a0(sVar6, true);
                            j0Var.h(sVar6);
                            z20 = true;
                        case 8:
                            j0Var.c0(null);
                            z20 = true;
                        case 9:
                            j0Var.c0(sVar6);
                            z20 = true;
                        case 10:
                            q0Var4.i = sVar6.Y;
                            j0Var.b0(sVar6, q0Var4.h);
                            z20 = true;
                    }
                }
            } else {
                aVar2.c(1);
                j0 j0Var2 = aVar2.q;
                ArrayList arrayList11 = aVar2.a;
                int size5 = arrayList11.size();
                int i28 = 0;
                while (i28 < size5) {
                    q0 q0Var5 = (q0) arrayList11.get(i28);
                    s sVar7 = q0Var5.b;
                    if (sVar7 != null) {
                        if (sVar7.U != null) {
                            sVar7.j().a = false;
                        }
                        int i29 = aVar2.f;
                        if (sVar7.U != null || i29 != 0) {
                            sVar7.j();
                            sVar7.U.f = i29;
                        }
                        sVar7.j();
                        sVar7.U.getClass();
                    }
                    switch (q0Var5.a) {
                        case 1:
                            str = str2;
                            sVar7.L(q0Var5.d, q0Var5.e, q0Var5.f, q0Var5.g);
                            j0Var2.a0(sVar7, false);
                            j0Var2.a(sVar7);
                            i28++;
                            str2 = str;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + q0Var5.a);
                        case 3:
                            str = str2;
                            sVar7.L(q0Var5.d, q0Var5.e, q0Var5.f, q0Var5.g);
                            j0Var2.V(sVar7);
                            i28++;
                            str2 = str;
                        case 4:
                            str = str2;
                            sVar7.L(q0Var5.d, q0Var5.e, q0Var5.f, q0Var5.g);
                            j0Var2.J(sVar7);
                            i28++;
                            str2 = str;
                        case 5:
                            str = str2;
                            sVar7.L(q0Var5.d, q0Var5.e, q0Var5.f, q0Var5.g);
                            j0Var2.a0(sVar7, false);
                            e0(sVar7);
                            i28++;
                            str2 = str;
                        case 6:
                            str = str2;
                            sVar7.L(q0Var5.d, q0Var5.e, q0Var5.f, q0Var5.g);
                            j0Var2.h(sVar7);
                            i28++;
                            str2 = str;
                        case 7:
                            str = str2;
                            sVar7.L(q0Var5.d, q0Var5.e, q0Var5.f, q0Var5.g);
                            j0Var2.a0(sVar7, false);
                            j0Var2.c(sVar7);
                            i28++;
                            str2 = str;
                        case 8:
                            j0Var2.c0(sVar7);
                            str = str2;
                            i28++;
                            str2 = str;
                        case 9:
                            j0Var2.c0(null);
                            str = str2;
                            i28++;
                            str2 = str;
                        case 10:
                            q0Var5.h = sVar7.Y;
                            j0Var2.b0(sVar7, q0Var5.i);
                            str = str2;
                            i28++;
                            str2 = str;
                    }
                }
            }
            i25++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
        if (z19 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i30 = 0;
            while (i30 < size6) {
                Object obj2 = arrayList.get(i30);
                i30++;
                linkedHashSet.addAll(F((a) obj2));
            }
            if (this.h == null) {
                int size7 = arrayList3.size();
                int i31 = 0;
                while (i31 < size7) {
                    Object obj3 = arrayList3.get(i31);
                    i31++;
                    if (obj3 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i32 = 0;
                while (i32 < size8) {
                    Object obj4 = arrayList3.get(i32);
                    i32++;
                    if (obj4 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i33 = i9; i33 < i10; i33++) {
            a aVar3 = (a) arrayList.get(i33);
            if (booleanValue) {
                for (int size9 = aVar3.a.size() - 1; size9 >= 0; size9--) {
                    s sVar8 = ((q0) aVar3.a.get(size9)).b;
                    if (sVar8 != null) {
                        g(sVar8).j();
                    }
                }
            } else {
                ArrayList arrayList12 = aVar3.a;
                int size10 = arrayList12.size();
                int i34 = 0;
                while (i34 < size10) {
                    Object obj5 = arrayList12.get(i34);
                    i34++;
                    s sVar9 = ((q0) obj5).b;
                    if (sVar9 != null) {
                        g(sVar9).j();
                    }
                }
            }
        }
        Q(this.v, true);
        Iterator it3 = f(i9, i10, arrayList).iterator();
        while (it3.hasNext()) {
            l lVar = (l) it3.next();
            lVar.e = booleanValue;
            synchronized (lVar.b) {
                lVar.f();
                ArrayList arrayList13 = lVar.b;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    ((u0) listIterator.previous()).getClass();
                    throw null;
                }
                lVar.f = false;
            }
            lVar.c();
        }
        for (int i35 = i9; i35 < i10; i35++) {
            a aVar4 = (a) arrayList.get(i35);
            if (((Boolean) arrayList2.get(i35)).booleanValue() && aVar4.s >= 0) {
                aVar4.s = -1;
            }
            if (aVar4.p != null) {
                for (int i36 = 0; i36 < aVar4.p.size(); i36++) {
                    ((Runnable) aVar4.p.get(i36)).run();
                }
                aVar4.p = null;
            }
        }
        if (!z19 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        throw new ClassCastException();
    }

    public final s C(int i9) {
        com.google.firebase.messaging.t tVar = this.c;
        ArrayList arrayList = (ArrayList) tVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s sVar = (s) arrayList.get(size);
            if (sVar != null && sVar.J == i9) {
                return sVar;
            }
        }
        for (p0 p0Var : ((HashMap) tVar.c).values()) {
            if (p0Var != null) {
                s sVar2 = p0Var.c;
                if (sVar2.J == i9) {
                    return sVar2;
                }
            }
        }
        return null;
    }

    public final s D(String str) {
        com.google.firebase.messaging.t tVar = this.c;
        ArrayList arrayList = (ArrayList) tVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s sVar = (s) arrayList.get(size);
            if (sVar != null && str.equals(sVar.L)) {
                return sVar;
            }
        }
        for (p0 p0Var : ((HashMap) tVar.c).values()) {
            if (p0Var != null) {
                s sVar2 = p0Var.c;
                if (str.equals(sVar2.L)) {
                    return sVar2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar.f) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                lVar.f = false;
                lVar.c();
            }
        }
    }

    public final ViewGroup G(s sVar) {
        ViewGroup viewGroup = sVar.R;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (sVar.K <= 0 || !this.x.c()) {
            return null;
        }
        View b10 = this.x.b(sVar.K);
        if (b10 instanceof ViewGroup) {
            return (ViewGroup) b10;
        }
        return null;
    }

    public final c0 H() {
        s sVar = this.y;
        return sVar != null ? sVar.F.H() : this.A;
    }

    public final ya.b I() {
        s sVar = this.y;
        return sVar != null ? sVar.F.I() : this.B;
    }

    public final void J(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + sVar);
        }
        if (sVar.M) {
            return;
        }
        sVar.M = true;
        sVar.V = true ^ sVar.V;
        d0(sVar);
    }

    public final boolean M() {
        s sVar = this.y;
        if (sVar == null) {
            return true;
        }
        return sVar.t() && this.y.p().M();
    }

    public final boolean P() {
        return this.H || this.I;
    }

    public final void Q(int i9, boolean z10) {
        u uVar;
        if (this.w == null && i9 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i9 != this.v) {
            this.v = i9;
            com.google.firebase.messaging.t tVar = this.c;
            HashMap hashMap = (HashMap) tVar.c;
            ArrayList arrayList = (ArrayList) tVar.b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p0 p0Var = (p0) hashMap.get(((s) obj).e);
                if (p0Var != null) {
                    p0Var.j();
                }
            }
            for (p0 p0Var2 : hashMap.values()) {
                if (p0Var2 != null) {
                    p0Var2.j();
                    s sVar = p0Var2.c;
                    if (sVar.w && !sVar.v()) {
                        tVar.B(p0Var2);
                    }
                }
            }
            f0();
            if (this.G && (uVar = this.w) != null && this.v == 7) {
                uVar.e.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void R() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.i = false;
        for (s sVar : this.c.u()) {
            if (sVar != null) {
                sVar.H.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i9, int i10) {
        A(false);
        z(true);
        s sVar = this.z;
        if (sVar != null && i9 < 0 && sVar.l().S()) {
            return true;
        }
        boolean U = U(i9, i10, this.L, this.M);
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
        ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
        return U;
    }

    public final boolean U(int i9, int i10, ArrayList arrayList, ArrayList arrayList2) {
        boolean z10 = (i10 & 1) != 0;
        int i11 = -1;
        if (!this.d.isEmpty()) {
            if (i9 < 0) {
                i11 = z10 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if (i9 >= 0 && i9 == aVar.s) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i11 = size;
                } else if (z10) {
                    i11 = size;
                    while (i11 > 0) {
                        a aVar2 = (a) this.d.get(i11 - 1);
                        if (i9 < 0 || i9 != aVar2.s) {
                            break;
                        }
                        i11--;
                    }
                } else if (size != this.d.size() - 1) {
                    i11 = size + 1;
                }
            }
        }
        if (i11 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i11; size2--) {
            arrayList.add((a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + sVar + " nesting=" + sVar.E);
        }
        boolean v = sVar.v();
        if (sVar.N && v) {
            return;
        }
        com.google.firebase.messaging.t tVar = this.c;
        synchronized (((ArrayList) tVar.b)) {
            ((ArrayList) tVar.b).remove(sVar);
        }
        sVar.v = false;
        if (L(sVar)) {
            this.G = true;
        }
        sVar.w = true;
        d0(sVar);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            if (!((a) arrayList.get(i9)).o) {
                if (i10 != i9) {
                    B(i10, i9, arrayList, arrayList2);
                }
                i10 = i9 + 1;
                if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).o) {
                        i10++;
                    }
                }
                B(i9, i10, arrayList, arrayList2);
                i9 = i10 - 1;
            }
            i9++;
        }
        if (i10 != size) {
            B(i10, size, arrayList, arrayList2);
        }
    }

    public final void X(Bundle bundle) {
        we.b bVar;
        int i9;
        Bundle bundle2;
        p0 p0Var;
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
        com.google.firebase.messaging.t tVar = this.c;
        HashMap hashMap2 = (HashMap) tVar.d;
        HashMap hashMap3 = (HashMap) tVar.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        l0 l0Var = (l0) bundle.getParcelable("state");
        if (l0Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = l0Var.a;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            bVar = this.o;
            if (i10 >= size) {
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            Bundle N = tVar.N((String) obj, null);
            if (N != null) {
                s sVar = (s) this.O.d.get(((o0) N.getParcelable("state")).b);
                if (sVar != null) {
                    if (K(2)) {
                        i9 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + sVar);
                    } else {
                        i9 = 2;
                    }
                    p0Var = new p0(bVar, tVar, sVar, N);
                    bundle2 = N;
                } else {
                    i9 = 2;
                    bundle2 = N;
                    p0Var = new p0(this.o, this.c, this.w.b.getClassLoader(), H(), N);
                }
                s sVar2 = p0Var.c;
                sVar2.b = bundle2;
                sVar2.F = this;
                if (K(i9)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + sVar2.e + "): " + sVar2);
                }
                p0Var.l(this.w.b.getClassLoader());
                tVar.A(p0Var);
                p0Var.e = this.v;
            }
        }
        m0 m0Var = this.O;
        m0Var.getClass();
        ArrayList arrayList2 = new ArrayList(m0Var.d.values());
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            s sVar3 = (s) obj2;
            if (hashMap3.get(sVar3.e) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + sVar3 + " that was not found in the set of active Fragments " + l0Var.a);
                }
                this.O.f(sVar3);
                sVar3.F = this;
                p0 p0Var2 = new p0(bVar, tVar, sVar3);
                p0Var2.e = 1;
                p0Var2.j();
                sVar3.w = true;
                p0Var2.j();
            }
        }
        ArrayList arrayList3 = l0Var.b;
        ((ArrayList) tVar.b).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList3.get(i12);
                i12++;
                String str3 = (String) obj3;
                s p6 = tVar.p(str3);
                if (p6 == null) {
                    throw new IllegalStateException(aa.d.o("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + p6);
                }
                tVar.h(p6);
            }
        }
        if (l0Var.c != null) {
            this.d = new ArrayList(l0Var.c.length);
            int i13 = 0;
            while (true) {
                b[] bVarArr = l0Var.c;
                if (i13 >= bVarArr.length) {
                    break;
                }
                b bVar2 = bVarArr[i13];
                ArrayList arrayList4 = bVar2.b;
                a aVar = new a(this);
                int[] iArr = bVar2.a;
                int i14 = 0;
                int i15 = 0;
                while (i14 < iArr.length) {
                    q0 q0Var = new q0();
                    int i16 = i14 + 1;
                    q0Var.a = iArr[i14];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i15 + " base fragment #" + iArr[i16]);
                    }
                    q0Var.h = androidx.lifecycle.n.values()[bVar2.c[i15]];
                    q0Var.i = androidx.lifecycle.n.values()[bVar2.d[i15]];
                    int i17 = i14 + 2;
                    q0Var.c = iArr[i16] != 0;
                    int i18 = iArr[i17];
                    q0Var.d = i18;
                    int i19 = iArr[i14 + 3];
                    q0Var.e = i19;
                    int i20 = i14 + 5;
                    int i21 = iArr[i14 + 4];
                    q0Var.f = i21;
                    i14 += 6;
                    int[] iArr2 = iArr;
                    int i22 = iArr2[i20];
                    q0Var.g = i22;
                    aVar.b = i18;
                    aVar.c = i19;
                    aVar.d = i21;
                    aVar.e = i22;
                    aVar.b(q0Var);
                    i15++;
                    iArr = iArr2;
                }
                aVar.f = bVar2.e;
                aVar.h = bVar2.f;
                aVar.g = true;
                aVar.i = bVar2.n;
                aVar.j = bVar2.r;
                aVar.k = bVar2.s;
                aVar.l = bVar2.v;
                aVar.m = bVar2.w;
                aVar.n = bVar2.x;
                aVar.o = bVar2.y;
                aVar.s = bVar2.h;
                for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                    String str4 = (String) arrayList4.get(i23);
                    if (str4 != null) {
                        ((q0) aVar.a.get(i23)).b = tVar.p(str4);
                    }
                }
                aVar.c(1);
                if (K(2)) {
                    StringBuilder p9 = j3.r0.p(i13, "restoreAllState: back stack #", " (index ");
                    p9.append(aVar.s);
                    p9.append("): ");
                    p9.append(aVar);
                    Log.v("FragmentManager", p9.toString());
                    PrintWriter printWriter = new PrintWriter(new s0());
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i13++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(l0Var.d);
        String str5 = l0Var.e;
        if (str5 != null) {
            s p10 = tVar.p(str5);
            this.z = p10;
            r(p10);
        }
        ArrayList arrayList5 = l0Var.f;
        if (arrayList5 != null) {
            for (int i24 = 0; i24 < arrayList5.size(); i24++) {
                this.l.put((String) arrayList5.get(i24), (c) l0Var.h.get(i24));
            }
        }
        this.F = new ArrayDeque(l0Var.n);
    }

    public final Bundle Y() {
        int i9;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.H = true;
        this.O.i = true;
        com.google.firebase.messaging.t tVar = this.c;
        tVar.getClass();
        HashMap hashMap = (HashMap) tVar.c;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p0 p0Var = (p0) it.next();
            if (p0Var != null) {
                s sVar = p0Var.c;
                String str = sVar.e;
                Bundle bundle3 = new Bundle();
                s sVar2 = p0Var.c;
                if (sVar2.a == -1 && (bundle = sVar2.b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new o0(sVar2));
                if (sVar2.a > 0) {
                    Bundle bundle4 = new Bundle();
                    sVar2.G(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    p0Var.a.w(sVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    sVar2.c0.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle Y = sVar2.H.Y();
                    if (!Y.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", Y);
                    }
                    SparseArray<? extends Parcelable> sparseArray = sVar2.c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = sVar2.d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = sVar2.f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                tVar.N(str, bundle3);
                arrayList2.add(sVar.e);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + sVar + ": " + sVar.b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.c.d;
        if (!hashMap2.isEmpty()) {
            com.google.firebase.messaging.t tVar2 = this.c;
            synchronized (((ArrayList) tVar2.b)) {
                try {
                    if (((ArrayList) tVar2.b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) tVar2.b).size());
                        ArrayList arrayList3 = (ArrayList) tVar2.b;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            s sVar3 = (s) obj;
                            arrayList.add(sVar3.e);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + sVar3.e + "): " + sVar3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                bVarArr = new b[size2];
                for (i9 = 0; i9 < size2; i9++) {
                    bVarArr[i9] = new b((a) this.d.get(i9));
                    if (K(2)) {
                        StringBuilder p6 = j3.r0.p(i9, "saveAllState: adding back stack #", ": ");
                        p6.append(this.d.get(i9));
                        Log.v("FragmentManager", p6.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            l0 l0Var = new l0();
            l0Var.e = null;
            ArrayList arrayList4 = new ArrayList();
            l0Var.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            l0Var.h = arrayList5;
            l0Var.a = arrayList2;
            l0Var.b = arrayList;
            l0Var.c = bVarArr;
            l0Var.d = this.k.get();
            s sVar4 = this.z;
            if (sVar4 != null) {
                l0Var.e = sVar4.e;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            l0Var.n = new ArrayList(this.F);
            bundle2.putParcelable("state", l0Var);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(ta.b.d("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(ta.b.d("fragment_", str3), (Bundle) hashMap2.get(str3));
            }
        } else if (K(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    public final void Z() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.c.removeCallbacks(this.P);
                    this.w.c.post(this.P);
                    h0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final p0 a(s sVar) {
        String str = sVar.X;
        if (str != null) {
            t1.c.c(sVar, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + sVar);
        }
        p0 g10 = g(sVar);
        sVar.F = this;
        com.google.firebase.messaging.t tVar = this.c;
        tVar.A(g10);
        if (!sVar.N) {
            tVar.h(sVar);
            sVar.w = false;
            sVar.V = false;
            if (L(sVar)) {
                this.G = true;
            }
        }
        return g10;
    }

    public final void a0(s sVar, boolean z10) {
        ViewGroup G = G(sVar);
        if (G == null || !(G instanceof x)) {
            return;
        }
        ((x) G).setDrawDisappearingViewsLast(!z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(u uVar, f7.a0 a0Var, s sVar) {
        if (this.w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.w = uVar;
        this.x = a0Var;
        this.y = sVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (sVar != 0) {
            copyOnWriteArrayList.add(new d0(sVar));
        } else if (uVar != null) {
            copyOnWriteArrayList.add(uVar);
        }
        if (this.y != null) {
            h0();
        }
        if (uVar != null) {
            androidx.activity.x p6 = uVar.e.p();
            this.g = p6;
            p6.a(sVar != 0 ? sVar : uVar, this.j);
        }
        if (sVar != 0) {
            m0 m0Var = sVar.F.O;
            HashMap hashMap = m0Var.e;
            m0 m0Var2 = (m0) hashMap.get(sVar.e);
            if (m0Var2 == null) {
                m0Var2 = new m0(m0Var.g);
                hashMap.put(sVar.e, m0Var2);
            }
            this.O = m0Var2;
        } else if (uVar != null) {
            this.O = (m0) new a5.m(uVar.e.f(), m0.j).n(m0.class);
        } else {
            this.O = new m0(false);
        }
        this.O.i = P();
        this.c.e = this.O;
        u uVar2 = this.w;
        if (uVar2 != null && sVar == 0) {
            g2.e g10 = uVar2.g();
            g10.f("android:support:fragments", new androidx.activity.e(this, 2));
            Bundle c10 = g10.c("android:support:fragments");
            if (c10 != null) {
                X(c10);
            }
        }
        u uVar3 = this.w;
        if (uVar3 != null) {
            androidx.activity.h hVar = uVar3.e.w;
            String d = ta.b.d("FragmentManager:", sVar != 0 ? aa.d.r(new StringBuilder(), sVar.e, ":") : "");
            this.C = hVar.d(ta.b.j(d, "StartActivityForResult"), new e0(2), new android.support.v4.media.c(this, 2));
            this.D = hVar.d(ta.b.j(d, "StartIntentSenderForResult"), new e0(0), new xa.c(this, 5));
            this.E = hVar.d(ta.b.j(d, "RequestPermissions"), new e0(1), new k5.i(this, 3));
        }
        u uVar4 = this.w;
        if (uVar4 != null) {
            uVar4.e.o(this.q);
        }
        u uVar5 = this.w;
        if (uVar5 != null) {
            uVar5.e.y.add(this.r);
        }
        u uVar6 = this.w;
        if (uVar6 != null) {
            uVar6.e.B.add(this.s);
        }
        u uVar7 = this.w;
        if (uVar7 != null) {
            uVar7.e.C.add(this.t);
        }
        u uVar8 = this.w;
        if (uVar8 == null || sVar != 0) {
            return;
        }
        j4.c cVar = uVar8.e.c;
        ((CopyOnWriteArrayList) cVar.c).add(this.u);
        ((Runnable) cVar.b).run();
    }

    public final void b0(s sVar, androidx.lifecycle.n nVar) {
        if (sVar.equals(this.c.p(sVar.e)) && (sVar.G == null || sVar.F == this)) {
            sVar.Y = nVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + sVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + sVar);
        }
        if (sVar.N) {
            sVar.N = false;
            if (sVar.v) {
                return;
            }
            this.c.h(sVar);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + sVar);
            }
            if (L(sVar)) {
                this.G = true;
            }
        }
    }

    public final void c0(s sVar) {
        if (sVar != null) {
            if (!sVar.equals(this.c.p(sVar.e)) || (sVar.G != null && sVar.F != this)) {
                throw new IllegalArgumentException("Fragment " + sVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        s sVar2 = this.z;
        this.z = sVar;
        r(sVar2);
        r(this.z);
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(s sVar) {
        ViewGroup G = G(sVar);
        if (G != null) {
            r rVar = sVar.U;
            if ((rVar == null ? 0 : rVar.e) + (rVar == null ? 0 : rVar.d) + (rVar == null ? 0 : rVar.c) + (rVar == null ? 0 : rVar.b) > 0) {
                if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G.setTag(R.id.visible_removing_fragment_view_tag, sVar);
                }
                s sVar2 = (s) G.getTag(R.id.visible_removing_fragment_view_tag);
                r rVar2 = sVar.U;
                boolean z10 = rVar2 != null ? rVar2.a : false;
                if (sVar2.U == null) {
                    return;
                }
                sVar2.j().a = z10;
            }
        }
    }

    public final HashSet e() {
        l lVar;
        HashSet hashSet = new HashSet();
        ArrayList s10 = this.c.s();
        int size = s10.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = s10.get(i9);
            i9++;
            ViewGroup viewGroup = ((p0) obj).c.R;
            if (viewGroup != null) {
                ya.b factory = I();
                kotlin.jvm.internal.i.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof l) {
                    lVar = (l) tag;
                } else {
                    lVar = new l(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
                }
                hashSet.add(lVar);
            }
        }
        return hashSet;
    }

    public final HashSet f(int i9, int i10, ArrayList arrayList) {
        ViewGroup viewGroup;
        l lVar;
        HashSet hashSet = new HashSet();
        while (i9 < i10) {
            ArrayList arrayList2 = ((a) arrayList.get(i9)).a;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                s sVar = ((q0) obj).b;
                if (sVar != null && (viewGroup = sVar.R) != null) {
                    kotlin.jvm.internal.i.d(I(), "fragmentManager.specialEffectsControllerFactory");
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof l) {
                        lVar = (l) tag;
                    } else {
                        lVar = new l(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
                    }
                    hashSet.add(lVar);
                }
            }
            i9++;
        }
        return hashSet;
    }

    public final void f0() {
        ArrayList s10 = this.c.s();
        int size = s10.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = s10.get(i9);
            i9++;
            p0 p0Var = (p0) obj;
            s sVar = p0Var.c;
            if (sVar.S) {
                if (this.b) {
                    this.K = true;
                } else {
                    sVar.S = false;
                    p0Var.j();
                }
            }
        }
    }

    public final p0 g(s sVar) {
        String str = sVar.e;
        com.google.firebase.messaging.t tVar = this.c;
        p0 p0Var = (p0) ((HashMap) tVar.c).get(str);
        if (p0Var != null) {
            return p0Var;
        }
        p0 p0Var2 = new p0(this.o, tVar, sVar);
        p0Var2.l(this.w.b.getClassLoader());
        p0Var2.e = this.v;
        return p0Var2;
    }

    public final void g0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new s0());
        u uVar = this.w;
        if (uVar == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            uVar.e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    public final void h(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + sVar);
        }
        if (sVar.N) {
            return;
        }
        sVar.N = true;
        if (sVar.v) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + sVar);
            }
            com.google.firebase.messaging.t tVar = this.c;
            synchronized (((ArrayList) tVar.b)) {
                ((ArrayList) tVar.b).remove(sVar);
            }
            sVar.v = false;
            if (L(sVar)) {
                this.G = true;
            }
            d0(sVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.internal.h, zc.a] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.h, zc.a] */
    public final void h0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    a0 a0Var = this.j;
                    a0Var.a = true;
                    ?? r22 = a0Var.c;
                    if (r22 != 0) {
                        r22.invoke();
                    }
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z10 = this.d.size() + (this.h != null ? 1 : 0) > 0 && O(this.y);
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                a0 a0Var2 = this.j;
                a0Var2.a = z10;
                ?? r02 = a0Var2.c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(boolean z10, Configuration configuration) {
        if (z10 && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (s sVar : this.c.u()) {
            if (sVar != null) {
                sVar.onConfigurationChanged(configuration);
                if (z10) {
                    sVar.H.i(true, configuration);
                }
            }
        }
    }

    public final boolean j() {
        if (this.v < 1) {
            return false;
        }
        for (s sVar : this.c.u()) {
            if (sVar != null) {
                if (!sVar.M ? sVar.H.j() : false) {
                    return true;
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
        boolean z10 = false;
        for (s sVar : this.c.u()) {
            if (sVar != null && N(sVar)) {
                if (!sVar.M ? sVar.H.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(sVar);
                    z10 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i9 = 0; i9 < this.e.size(); i9++) {
                s sVar2 = (s) this.e.get(i9);
                if (arrayList == null || !arrayList.contains(sVar2)) {
                    sVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z10;
    }

    public final void l() {
        boolean z10;
        this.J = true;
        A(true);
        x();
        u uVar = this.w;
        com.google.firebase.messaging.t tVar = this.c;
        if (uVar != null) {
            z10 = ((m0) tVar.e).h;
        } else {
            z10 = e2.c.v(uVar.b) ? !r1.isChangingConfigurations() : true;
        }
        if (z10) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((c) it.next()).a;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((m0) tVar.e).d((String) obj, false);
                }
            }
        }
        u(-1);
        u uVar2 = this.w;
        if (uVar2 != null) {
            uVar2.e.y.remove(this.r);
        }
        u uVar3 = this.w;
        if (uVar3 != null) {
            uVar3.e.x.remove(this.q);
        }
        u uVar4 = this.w;
        if (uVar4 != null) {
            uVar4.e.B.remove(this.s);
        }
        u uVar5 = this.w;
        if (uVar5 != null) {
            uVar5.e.C.remove(this.t);
        }
        u uVar6 = this.w;
        if ((uVar6 != null) && this.y == null) {
            j4.c cVar = uVar6.e.c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.c;
            b0 b0Var = this.u;
            copyOnWriteArrayList.remove(b0Var);
            if (((HashMap) cVar.d).remove(b0Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) cVar.b).run();
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            Iterator it2 = this.j.b.iterator();
            while (it2.hasNext()) {
                ((androidx.activity.c) it2.next()).cancel();
            }
            this.g = null;
        }
        androidx.activity.result.c cVar2 = this.C;
        if (cVar2 != null) {
            cVar2.d.f(cVar2.b);
            androidx.activity.result.c cVar3 = this.D;
            cVar3.d.f(cVar3.b);
            androidx.activity.result.c cVar4 = this.E;
            cVar4.d.f(cVar4.b);
        }
    }

    public final void m(boolean z10) {
        if (z10 && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (s sVar : this.c.u()) {
            if (sVar != null) {
                sVar.Q = true;
                if (z10) {
                    sVar.H.m(true);
                }
            }
        }
    }

    public final void n(boolean z10) {
        if (z10 && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (s sVar : this.c.u()) {
            if (sVar != null && z10) {
                sVar.H.n(true);
            }
        }
    }

    public final void o() {
        ArrayList t10 = this.c.t();
        int size = t10.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = t10.get(i9);
            i9++;
            s sVar = (s) obj;
            if (sVar != null) {
                sVar.u();
                sVar.H.o();
            }
        }
    }

    public final boolean p() {
        if (this.v >= 1) {
            for (s sVar : this.c.u()) {
                if (sVar != null) {
                    if (!sVar.M ? sVar.H.p() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v < 1) {
            return;
        }
        for (s sVar : this.c.u()) {
            if (sVar != null && !sVar.M) {
                sVar.H.q();
            }
        }
    }

    public final void r(s sVar) {
        if (sVar != null) {
            if (sVar.equals(this.c.p(sVar.e))) {
                sVar.F.getClass();
                boolean O = O(sVar);
                Boolean bool = sVar.s;
                if (bool == null || bool.booleanValue() != O) {
                    sVar.s = Boolean.valueOf(O);
                    k0 k0Var = sVar.H;
                    k0Var.h0();
                    k0Var.r(k0Var.z);
                }
            }
        }
    }

    public final void s(boolean z10) {
        if (z10 && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (s sVar : this.c.u()) {
            if (sVar != null && z10) {
                sVar.H.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.v < 1) {
            return false;
        }
        boolean z10 = false;
        for (s sVar : this.c.u()) {
            if (sVar != null && N(sVar)) {
                if (!sVar.M ? sVar.H.t() : false) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        s sVar = this.y;
        if (sVar != null) {
            sb2.append(sVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb2.append("}");
        } else {
            u uVar = this.w;
            if (uVar != null) {
                sb2.append(uVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb2.append("}");
            } else {
                sb2.append(BuildConfig.BETA_URL);
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i9) {
        try {
            this.b = true;
            for (p0 p0Var : ((HashMap) this.c.c).values()) {
                if (p0Var != null) {
                    p0Var.e = i9;
                }
            }
            Q(i9, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((l) it.next()).d();
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
        String j10 = ta.b.j(str, "    ");
        com.google.firebase.messaging.t tVar = this.c;
        ArrayList arrayList = (ArrayList) tVar.b;
        String j11 = ta.b.j(str, "    ");
        HashMap hashMap = (HashMap) tVar.c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (p0 p0Var : hashMap.values()) {
                printWriter.print(str);
                if (p0Var != null) {
                    s sVar = p0Var.c;
                    printWriter.println(sVar);
                    sVar.i(j11, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(BuildConfig.BETA_URL);
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i9 = 0; i9 < size2; i9++) {
                s sVar2 = (s) arrayList.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(sVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                s sVar3 = (s) this.e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(sVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                a aVar = (a) this.d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(j10, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        Object obj = (g0) this.a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
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
            ((l) it.next()).d();
        }
    }

    public final void y(g0 g0Var, boolean z10) {
        if (!z10) {
            if (this.w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(g0Var);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z10) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.w.c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
