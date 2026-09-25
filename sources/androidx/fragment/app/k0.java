package androidx.fragment.app;

import ai.q4;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.vision.e2;
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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class k0 {
    public final d0 A;
    public final ob.a B;
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
    public n0 O;
    public final q4 P;
    public boolean b;
    public ArrayList e;
    public androidx.activity.v g;
    public final ArrayList n;
    public final n4.y o;
    public final CopyOnWriteArrayList p;
    public final z q;
    public final z r;
    public final z s;
    public final z t;
    public final c0 u;
    public int v;
    public u w;
    public v7.c0 x;
    public s y;
    public s z;
    public final ArrayList a = new ArrayList();
    public final oi.f c = new oi.f(1);
    public ArrayList d = new ArrayList();
    public final y f = new y(this);
    public a h = null;
    public boolean i = false;
    public final b0 j = new b0(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());
    public final Map m = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.z] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.z] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.z] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.z] */
    public k0() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new n4.y(this);
        this.p = new CopyOnWriteArrayList();
        final int i10 = 0;
        this.q = new q0.a(this) { // from class: androidx.fragment.app.z
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        k0 k0Var = this.b;
                        if (k0Var.M()) {
                            k0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.b;
                        if (k0Var2.M() && num.intValue() == 80) {
                            k0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.i iVar = (e0.i) obj;
                        k0 k0Var3 = this.b;
                        if (k0Var3.M()) {
                            boolean z10 = iVar.a;
                            k0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.q0 q0Var = (e0.q0) obj;
                        k0 k0Var4 = this.b;
                        if (k0Var4.M()) {
                            boolean z11 = q0Var.a;
                            k0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 1;
        this.r = new q0.a(this) { // from class: androidx.fragment.app.z
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        k0 k0Var = this.b;
                        if (k0Var.M()) {
                            k0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.b;
                        if (k0Var2.M() && num.intValue() == 80) {
                            k0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.i iVar = (e0.i) obj;
                        k0 k0Var3 = this.b;
                        if (k0Var3.M()) {
                            boolean z10 = iVar.a;
                            k0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.q0 q0Var = (e0.q0) obj;
                        k0 k0Var4 = this.b;
                        if (k0Var4.M()) {
                            boolean z11 = q0Var.a;
                            k0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 2;
        this.s = new q0.a(this) { // from class: androidx.fragment.app.z
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        k0 k0Var = this.b;
                        if (k0Var.M()) {
                            k0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.b;
                        if (k0Var2.M() && num.intValue() == 80) {
                            k0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.i iVar = (e0.i) obj;
                        k0 k0Var3 = this.b;
                        if (k0Var3.M()) {
                            boolean z10 = iVar.a;
                            k0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.q0 q0Var = (e0.q0) obj;
                        k0 k0Var4 = this.b;
                        if (k0Var4.M()) {
                            boolean z11 = q0Var.a;
                            k0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i13 = 3;
        this.t = new q0.a(this) { // from class: androidx.fragment.app.z
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        k0 k0Var = this.b;
                        if (k0Var.M()) {
                            k0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        k0 k0Var2 = this.b;
                        if (k0Var2.M() && num.intValue() == 80) {
                            k0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.i iVar = (e0.i) obj;
                        k0 k0Var3 = this.b;
                        if (k0Var3.M()) {
                            boolean z10 = iVar.a;
                            k0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.q0 q0Var = (e0.q0) obj;
                        k0 k0Var4 = this.b;
                        if (k0Var4.M()) {
                            boolean z11 = q0Var.a;
                            k0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.u = new c0(this);
        this.v = -1;
        this.A = new d0(this);
        this.B = new ob.a(i13);
        this.F = new ArrayDeque();
        this.P = new q4(this, 7);
    }

    public static HashSet F(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < aVar.a.size(); i10++) {
            s sVar = ((r0) aVar.a.get(i10)).b;
            if (sVar != null && aVar.g) {
                hashSet.add(sVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean L(s sVar) {
        sVar.getClass();
        ArrayList q6 = sVar.L.c.q();
        int size = q6.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = q6.get(i10);
            i10++;
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
        if (sVar.T) {
            return sVar.J == null || N(sVar.M);
        }
        return false;
    }

    public static boolean O(s sVar) {
        if (sVar == null) {
            return true;
        }
        k0 k0Var = sVar.J;
        return sVar.equals(k0Var.z) && O(k0Var.y);
    }

    public static void e0(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + sVar);
        }
        if (sVar.Q) {
            sVar.Q = false;
            sVar.Z = !sVar.Z;
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
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                s sVar = ((r0) obj).b;
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
                        for (int i11 = 0; i11 < size2; i11++) {
                            z11 |= ((h0) this.a.get(i11)).a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!z11) {
                h0();
                v();
                ((HashMap) this.c.b).values().removeAll(Collections.singleton(null));
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

    public final void B(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        String str;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        oi.f fVar = this.c;
        ArrayList arrayList3 = this.n;
        boolean z13 = ((a) arrayList.get(i10)).o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(fVar.u());
        s sVar = this.z;
        int i16 = i10;
        boolean z14 = false;
        while (i16 < i11) {
            a aVar = (a) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                z10 = z13;
                i12 = i16;
                z11 = z14;
                int i17 = 1;
                ArrayList arrayList5 = this.N;
                ArrayList arrayList6 = aVar.a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    r0 r0Var = (r0) arrayList6.get(size);
                    int i18 = r0Var.a;
                    if (i18 != i17) {
                        if (i18 != 3) {
                            switch (i18) {
                                case 8:
                                    sVar = null;
                                    break;
                                case 9:
                                    sVar = r0Var.b;
                                    break;
                                case 10:
                                    r0Var.i = r0Var.h;
                                    break;
                            }
                            size--;
                            i17 = 1;
                        }
                        arrayList5.add(r0Var.b);
                        size--;
                        i17 = 1;
                    }
                    arrayList5.remove(r0Var.b);
                    size--;
                    i17 = 1;
                }
            } else {
                ArrayList arrayList7 = this.N;
                ArrayList arrayList8 = aVar.a;
                int i19 = 0;
                while (i19 < arrayList8.size()) {
                    r0 r0Var2 = (r0) arrayList8.get(i19);
                    int i20 = r0Var2.a;
                    boolean z15 = z13;
                    int i21 = 1;
                    if (i20 != 1) {
                        i13 = i16;
                        if (i20 != 2) {
                            if (i20 == 3 || i20 == 6) {
                                arrayList7.remove(r0Var2.b);
                                s sVar2 = r0Var2.b;
                                if (sVar2 == sVar) {
                                    arrayList8.add(i19, new r0(9, sVar2));
                                    i19++;
                                    z12 = z14;
                                    i21 = 1;
                                    sVar = null;
                                }
                            } else if (i20 == 7) {
                                i21 = 1;
                            } else if (i20 == 8) {
                                arrayList8.add(i19, new r0(9, sVar, 0));
                                r0Var2.c = true;
                                i19++;
                                sVar = r0Var2.b;
                            }
                            z12 = z14;
                            i21 = 1;
                        } else {
                            s sVar3 = r0Var2.b;
                            int i22 = sVar3.O;
                            int size2 = arrayList7.size() - 1;
                            boolean z16 = false;
                            while (size2 >= 0) {
                                int i23 = size2;
                                s sVar4 = (s) arrayList7.get(size2);
                                boolean z17 = z14;
                                if (sVar4.O != i22) {
                                    i14 = i22;
                                } else if (sVar4 == sVar3) {
                                    i14 = i22;
                                    z16 = true;
                                } else {
                                    if (sVar4 == sVar) {
                                        i14 = i22;
                                        i15 = 0;
                                        arrayList8.add(i19, new r0(9, sVar4, 0));
                                        i19++;
                                        sVar = null;
                                    } else {
                                        i14 = i22;
                                        i15 = 0;
                                    }
                                    r0 r0Var3 = new r0(3, sVar4, i15);
                                    r0Var3.d = r0Var2.d;
                                    r0Var3.f = r0Var2.f;
                                    r0Var3.e = r0Var2.e;
                                    r0Var3.g = r0Var2.g;
                                    arrayList8.add(i19, r0Var3);
                                    arrayList7.remove(sVar4);
                                    i19++;
                                    sVar = sVar;
                                }
                                size2 = i23 - 1;
                                i22 = i14;
                                z14 = z17;
                            }
                            z12 = z14;
                            i21 = 1;
                            if (z16) {
                                arrayList8.remove(i19);
                                i19--;
                            } else {
                                r0Var2.a = 1;
                                r0Var2.c = true;
                                arrayList7.add(sVar3);
                            }
                        }
                        i19 += i21;
                        z13 = z15;
                        i16 = i13;
                        z14 = z12;
                    } else {
                        i13 = i16;
                    }
                    z12 = z14;
                    arrayList7.add(r0Var2.b);
                    i19 += i21;
                    z13 = z15;
                    i16 = i13;
                    z14 = z12;
                }
                z10 = z13;
                i12 = i16;
                z11 = z14;
            }
            z14 = z11 || aVar.g;
            i16 = i12 + 1;
            z13 = z10;
        }
        boolean z18 = z13;
        boolean z19 = z14;
        this.N.clear();
        if (!z18 && this.v >= 1) {
            for (int i24 = i10; i24 < i11; i24++) {
                ArrayList arrayList9 = ((a) arrayList.get(i24)).a;
                int size3 = arrayList9.size();
                int i25 = 0;
                while (i25 < size3) {
                    Object obj = arrayList9.get(i25);
                    i25++;
                    s sVar5 = ((r0) obj).b;
                    if (sVar5 != null && sVar5.J != null) {
                        fVar.E(g(sVar5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i26 = i10;
        while (i26 < i11) {
            a aVar2 = (a) arrayList.get(i26);
            if (((Boolean) arrayList2.get(i26)).booleanValue()) {
                aVar2.c(-1);
                k0 k0Var = aVar2.q;
                ArrayList arrayList10 = aVar2.a;
                boolean z20 = true;
                for (int size4 = arrayList10.size() - 1; size4 >= 0; size4--) {
                    r0 r0Var4 = (r0) arrayList10.get(size4);
                    s sVar6 = r0Var4.b;
                    if (sVar6 != null) {
                        if (sVar6.Y != null) {
                            sVar6.j().a = z20;
                        }
                        int i27 = aVar2.f;
                        int i28 = 8194;
                        if (i27 != 4097) {
                            if (i27 != 8194) {
                                i28 = 4100;
                                if (i27 != 8197) {
                                    i28 = i27 != 4099 ? i27 != 4100 ? 0 : 8197 : 4099;
                                }
                            } else {
                                i28 = 4097;
                            }
                        }
                        if (sVar6.Y != null || i28 != 0) {
                            sVar6.j();
                            sVar6.Y.f = i28;
                        }
                        sVar6.j();
                        sVar6.Y.getClass();
                    }
                    switch (r0Var4.a) {
                        case 1:
                            sVar6.L(r0Var4.d, r0Var4.e, r0Var4.f, r0Var4.g);
                            z20 = true;
                            k0Var.a0(sVar6, true);
                            k0Var.V(sVar6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + r0Var4.a);
                        case 3:
                            sVar6.L(r0Var4.d, r0Var4.e, r0Var4.f, r0Var4.g);
                            k0Var.a(sVar6);
                            z20 = true;
                        case 4:
                            sVar6.L(r0Var4.d, r0Var4.e, r0Var4.f, r0Var4.g);
                            k0Var.getClass();
                            e0(sVar6);
                            z20 = true;
                        case 5:
                            sVar6.L(r0Var4.d, r0Var4.e, r0Var4.f, r0Var4.g);
                            k0Var.a0(sVar6, true);
                            k0Var.J(sVar6);
                            z20 = true;
                        case 6:
                            sVar6.L(r0Var4.d, r0Var4.e, r0Var4.f, r0Var4.g);
                            k0Var.c(sVar6);
                            z20 = true;
                        case 7:
                            sVar6.L(r0Var4.d, r0Var4.e, r0Var4.f, r0Var4.g);
                            k0Var.a0(sVar6, true);
                            k0Var.h(sVar6);
                            z20 = true;
                        case 8:
                            k0Var.c0(null);
                            z20 = true;
                        case 9:
                            k0Var.c0(sVar6);
                            z20 = true;
                        case 10:
                            r0Var4.i = sVar6.c0;
                            k0Var.b0(sVar6, r0Var4.h);
                            z20 = true;
                    }
                }
            } else {
                aVar2.c(1);
                k0 k0Var2 = aVar2.q;
                ArrayList arrayList11 = aVar2.a;
                int size5 = arrayList11.size();
                int i29 = 0;
                while (i29 < size5) {
                    r0 r0Var5 = (r0) arrayList11.get(i29);
                    s sVar7 = r0Var5.b;
                    if (sVar7 != null) {
                        if (sVar7.Y != null) {
                            sVar7.j().a = false;
                        }
                        int i30 = aVar2.f;
                        if (sVar7.Y != null || i30 != 0) {
                            sVar7.j();
                            sVar7.Y.f = i30;
                        }
                        sVar7.j();
                        sVar7.Y.getClass();
                    }
                    switch (r0Var5.a) {
                        case 1:
                            str = str2;
                            sVar7.L(r0Var5.d, r0Var5.e, r0Var5.f, r0Var5.g);
                            k0Var2.a0(sVar7, false);
                            k0Var2.a(sVar7);
                            i29++;
                            str2 = str;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + r0Var5.a);
                        case 3:
                            str = str2;
                            sVar7.L(r0Var5.d, r0Var5.e, r0Var5.f, r0Var5.g);
                            k0Var2.V(sVar7);
                            i29++;
                            str2 = str;
                        case 4:
                            str = str2;
                            sVar7.L(r0Var5.d, r0Var5.e, r0Var5.f, r0Var5.g);
                            k0Var2.J(sVar7);
                            i29++;
                            str2 = str;
                        case 5:
                            str = str2;
                            sVar7.L(r0Var5.d, r0Var5.e, r0Var5.f, r0Var5.g);
                            k0Var2.a0(sVar7, false);
                            e0(sVar7);
                            i29++;
                            str2 = str;
                        case 6:
                            str = str2;
                            sVar7.L(r0Var5.d, r0Var5.e, r0Var5.f, r0Var5.g);
                            k0Var2.h(sVar7);
                            i29++;
                            str2 = str;
                        case 7:
                            str = str2;
                            sVar7.L(r0Var5.d, r0Var5.e, r0Var5.f, r0Var5.g);
                            k0Var2.a0(sVar7, false);
                            k0Var2.c(sVar7);
                            i29++;
                            str2 = str;
                        case 8:
                            k0Var2.c0(sVar7);
                            str = str2;
                            i29++;
                            str2 = str;
                        case 9:
                            k0Var2.c0(null);
                            str = str2;
                            i29++;
                            str2 = str;
                        case 10:
                            r0Var5.h = sVar7.c0;
                            k0Var2.b0(sVar7, r0Var5.i);
                            str = str2;
                            i29++;
                            str2 = str;
                    }
                }
            }
            i26++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i11 - 1)).booleanValue();
        if (z19 && !arrayList3.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size6 = arrayList.size();
            int i31 = 0;
            while (i31 < size6) {
                Object obj2 = arrayList.get(i31);
                i31++;
                linkedHashSet.addAll(F((a) obj2));
            }
            if (this.h == null) {
                int size7 = arrayList3.size();
                int i32 = 0;
                while (i32 < size7) {
                    Object obj3 = arrayList3.get(i32);
                    i32++;
                    if (obj3 != null) {
                        throw new ClassCastException();
                    }
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw null;
                    }
                }
                int size8 = arrayList3.size();
                int i33 = 0;
                while (i33 < size8) {
                    Object obj4 = arrayList3.get(i33);
                    i33++;
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
        for (int i34 = i10; i34 < i11; i34++) {
            a aVar3 = (a) arrayList.get(i34);
            if (booleanValue) {
                for (int size9 = aVar3.a.size() - 1; size9 >= 0; size9--) {
                    s sVar8 = ((r0) aVar3.a.get(size9)).b;
                    if (sVar8 != null) {
                        g(sVar8).j();
                    }
                }
            } else {
                ArrayList arrayList12 = aVar3.a;
                int size10 = arrayList12.size();
                int i35 = 0;
                while (i35 < size10) {
                    Object obj5 = arrayList12.get(i35);
                    i35++;
                    s sVar9 = ((r0) obj5).b;
                    if (sVar9 != null) {
                        g(sVar9).j();
                    }
                }
            }
        }
        Q(this.v, true);
        Iterator it3 = f(i10, i11, arrayList).iterator();
        while (it3.hasNext()) {
            l lVar = (l) it3.next();
            lVar.e = booleanValue;
            synchronized (lVar.b) {
                lVar.f();
                ArrayList arrayList13 = lVar.b;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    ((v0) listIterator.previous()).getClass();
                    throw null;
                }
                lVar.f = false;
            }
            lVar.c();
        }
        for (int i36 = i10; i36 < i11; i36++) {
            a aVar4 = (a) arrayList.get(i36);
            if (((Boolean) arrayList2.get(i36)).booleanValue() && aVar4.s >= 0) {
                aVar4.s = -1;
            }
            if (aVar4.p != null) {
                for (int i37 = 0; i37 < aVar4.p.size(); i37++) {
                    ((Runnable) aVar4.p.get(i37)).run();
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

    public final s C(int i10) {
        oi.f fVar = this.c;
        ArrayList arrayList = (ArrayList) fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s sVar = (s) arrayList.get(size);
            if (sVar != null && sVar.N == i10) {
                return sVar;
            }
        }
        for (q0 q0Var : ((HashMap) fVar.b).values()) {
            if (q0Var != null) {
                s sVar2 = q0Var.c;
                if (sVar2.N == i10) {
                    return sVar2;
                }
            }
        }
        return null;
    }

    public final s D(String str) {
        oi.f fVar = this.c;
        ArrayList arrayList = (ArrayList) fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s sVar = (s) arrayList.get(size);
            if (sVar != null && str.equals(sVar.P)) {
                return sVar;
            }
        }
        for (q0 q0Var : ((HashMap) fVar.b).values()) {
            if (q0Var != null) {
                s sVar2 = q0Var.c;
                if (str.equals(sVar2.P)) {
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
        ViewGroup viewGroup = sVar.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (sVar.O <= 0 || !this.x.c()) {
            return null;
        }
        View b10 = this.x.b(sVar.O);
        if (b10 instanceof ViewGroup) {
            return (ViewGroup) b10;
        }
        return null;
    }

    public final d0 H() {
        s sVar = this.y;
        return sVar != null ? sVar.J.H() : this.A;
    }

    public final ob.a I() {
        s sVar = this.y;
        return sVar != null ? sVar.J.I() : this.B;
    }

    public final void J(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + sVar);
        }
        if (sVar.Q) {
            return;
        }
        sVar.Q = true;
        sVar.Z = true ^ sVar.Z;
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

    public final void Q(int i10, boolean z10) {
        u uVar;
        if (this.w == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.v) {
            this.v = i10;
            oi.f fVar = this.c;
            HashMap hashMap = (HashMap) fVar.b;
            ArrayList arrayList = (ArrayList) fVar.a;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                q0 q0Var = (q0) hashMap.get(((s) obj).e);
                if (q0Var != null) {
                    q0Var.j();
                }
            }
            for (q0 q0Var2 : hashMap.values()) {
                if (q0Var2 != null) {
                    q0Var2.j();
                    s sVar = q0Var2.c;
                    if (sVar.w && !sVar.v()) {
                        fVar.F(q0Var2);
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
                sVar.L.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i10, int i11) {
        A(false);
        z(true);
        s sVar = this.z;
        if (sVar != null && i10 < 0 && sVar.l().S()) {
            return true;
        }
        boolean U = U(i10, i11, this.L, this.M);
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

    public final boolean U(int i10, int i11, ArrayList arrayList, ArrayList arrayList2) {
        boolean z10 = (i11 & 1) != 0;
        int i12 = -1;
        if (!this.d.isEmpty()) {
            if (i10 < 0) {
                i12 = z10 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if (i10 >= 0 && i10 == aVar.s) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i12 = size;
                } else if (z10) {
                    i12 = size;
                    while (i12 > 0) {
                        a aVar2 = (a) this.d.get(i12 - 1);
                        if (i10 < 0 || i10 != aVar2.s) {
                            break;
                        }
                        i12--;
                    }
                } else if (size != this.d.size() - 1) {
                    i12 = size + 1;
                }
            }
        }
        if (i12 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i12; size2--) {
            arrayList.add((a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + sVar + " nesting=" + sVar.I);
        }
        boolean v = sVar.v();
        if (sVar.R && v) {
            return;
        }
        oi.f fVar = this.c;
        synchronized (((ArrayList) fVar.a)) {
            ((ArrayList) fVar.a).remove(sVar);
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
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((a) arrayList.get(i10)).o) {
                if (i11 != i10) {
                    B(i11, i10, arrayList, arrayList2);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((a) arrayList.get(i11)).o) {
                        i11++;
                    }
                }
                B(i10, i11, arrayList, arrayList2);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            B(i11, size, arrayList, arrayList2);
        }
    }

    public final void X(Bundle bundle) {
        n4.y yVar;
        int i10;
        Bundle bundle2;
        q0 q0Var;
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
        oi.f fVar = this.c;
        HashMap hashMap2 = (HashMap) fVar.c;
        HashMap hashMap3 = (HashMap) fVar.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        m0 m0Var = (m0) bundle.getParcelable("state");
        if (m0Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = m0Var.a;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            yVar = this.o;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            Bundle O = fVar.O((String) obj, null);
            if (O != null) {
                s sVar = (s) this.O.d.get(((p0) O.getParcelable("state")).b);
                if (sVar != null) {
                    if (K(2)) {
                        i10 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + sVar);
                    } else {
                        i10 = 2;
                    }
                    q0Var = new q0(yVar, fVar, sVar, O);
                    bundle2 = O;
                } else {
                    i10 = 2;
                    bundle2 = O;
                    q0Var = new q0(this.o, this.c, this.w.b.getClassLoader(), H(), O);
                }
                s sVar2 = q0Var.c;
                sVar2.b = bundle2;
                sVar2.J = this;
                if (K(i10)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + sVar2.e + "): " + sVar2);
                }
                q0Var.l(this.w.b.getClassLoader());
                fVar.E(q0Var);
                q0Var.e = this.v;
            }
        }
        n0 n0Var = this.O;
        n0Var.getClass();
        ArrayList arrayList2 = new ArrayList(n0Var.d.values());
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            s sVar3 = (s) obj2;
            if (hashMap3.get(sVar3.e) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + sVar3 + " that was not found in the set of active Fragments " + m0Var.a);
                }
                this.O.f(sVar3);
                sVar3.J = this;
                q0 q0Var2 = new q0(yVar, fVar, sVar3);
                q0Var2.e = 1;
                q0Var2.j();
                sVar3.w = true;
                q0Var2.j();
            }
        }
        ArrayList arrayList3 = m0Var.b;
        ((ArrayList) fVar.a).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                String str3 = (String) obj3;
                s k10 = fVar.k(str3);
                if (k10 == null) {
                    throw new IllegalStateException(a4.a.q("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + k10);
                }
                fVar.c(k10);
            }
        }
        if (m0Var.c != null) {
            this.d = new ArrayList(m0Var.c.length);
            int i14 = 0;
            while (true) {
                b[] bVarArr = m0Var.c;
                if (i14 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i14];
                ArrayList arrayList4 = bVar.b;
                a aVar = new a(this);
                int[] iArr = bVar.a;
                int i15 = 0;
                int i16 = 0;
                while (i15 < iArr.length) {
                    r0 r0Var = new r0();
                    int i17 = i15 + 1;
                    r0Var.a = iArr[i15];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i16 + " base fragment #" + iArr[i17]);
                    }
                    r0Var.h = androidx.lifecycle.n.values()[bVar.c[i16]];
                    r0Var.i = androidx.lifecycle.n.values()[bVar.d[i16]];
                    int i18 = i15 + 2;
                    r0Var.c = iArr[i17] != 0;
                    int i19 = iArr[i18];
                    r0Var.d = i19;
                    int i20 = iArr[i15 + 3];
                    r0Var.e = i20;
                    int i21 = i15 + 5;
                    int i22 = iArr[i15 + 4];
                    r0Var.f = i22;
                    i15 += 6;
                    int[] iArr2 = iArr;
                    int i23 = iArr2[i21];
                    r0Var.g = i23;
                    aVar.b = i19;
                    aVar.c = i20;
                    aVar.d = i22;
                    aVar.e = i23;
                    aVar.b(r0Var);
                    i16++;
                    iArr = iArr2;
                }
                aVar.f = bVar.e;
                aVar.h = bVar.f;
                aVar.g = true;
                aVar.i = bVar.n;
                aVar.j = bVar.r;
                aVar.k = bVar.s;
                aVar.l = bVar.v;
                aVar.m = bVar.w;
                aVar.n = bVar.x;
                aVar.o = bVar.y;
                aVar.s = bVar.h;
                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                    String str4 = (String) arrayList4.get(i24);
                    if (str4 != null) {
                        ((r0) aVar.a.get(i24)).b = fVar.k(str4);
                    }
                }
                aVar.c(1);
                if (K(2)) {
                    StringBuilder j3 = hg.c.j(i14, "restoreAllState: back stack #", " (index ");
                    j3.append(aVar.s);
                    j3.append("): ");
                    j3.append(aVar);
                    Log.v("FragmentManager", j3.toString());
                    PrintWriter printWriter = new PrintWriter(new t0());
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i14++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.k.set(m0Var.d);
        String str5 = m0Var.e;
        if (str5 != null) {
            s k11 = fVar.k(str5);
            this.z = k11;
            r(k11);
        }
        ArrayList arrayList5 = m0Var.f;
        if (arrayList5 != null) {
            for (int i25 = 0; i25 < arrayList5.size(); i25++) {
                this.l.put((String) arrayList5.get(i25), (c) m0Var.h.get(i25));
            }
        }
        this.F = new ArrayDeque(m0Var.n);
    }

    public final Bundle Y() {
        int i10;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.H = true;
        this.O.i = true;
        oi.f fVar = this.c;
        fVar.getClass();
        HashMap hashMap = (HashMap) fVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            q0 q0Var = (q0) it.next();
            if (q0Var != null) {
                s sVar = q0Var.c;
                String str = sVar.e;
                Bundle bundle3 = new Bundle();
                s sVar2 = q0Var.c;
                if (sVar2.a == -1 && (bundle = sVar2.b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new p0(sVar2));
                if (sVar2.a > 0) {
                    Bundle bundle4 = new Bundle();
                    sVar2.G(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    q0Var.a.I(sVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    sVar2.g0.d(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle Y = sVar2.L.Y();
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
                fVar.O(str, bundle3);
                arrayList2.add(sVar.e);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + sVar + ": " + sVar.b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.c.c;
        if (!hashMap2.isEmpty()) {
            oi.f fVar2 = this.c;
            synchronized (((ArrayList) fVar2.a)) {
                try {
                    if (((ArrayList) fVar2.a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) fVar2.a).size());
                        ArrayList arrayList3 = (ArrayList) fVar2.a;
                        int size = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList3.get(i11);
                            i11++;
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
                for (i10 = 0; i10 < size2; i10++) {
                    bVarArr[i10] = new b((a) this.d.get(i10));
                    if (K(2)) {
                        StringBuilder j3 = hg.c.j(i10, "saveAllState: adding back stack #", ": ");
                        j3.append(this.d.get(i10));
                        Log.v("FragmentManager", j3.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            m0 m0Var = new m0();
            m0Var.e = null;
            ArrayList arrayList4 = new ArrayList();
            m0Var.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            m0Var.h = arrayList5;
            m0Var.a = arrayList2;
            m0Var.b = arrayList;
            m0Var.c = bVarArr;
            m0Var.d = this.k.get();
            s sVar4 = this.z;
            if (sVar4 != null) {
                m0Var.e = sVar4.e;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            m0Var.n = new ArrayList(this.F);
            bundle2.putParcelable("state", m0Var);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(v7.j.g("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(v7.j.g("fragment_", str3), (Bundle) hashMap2.get(str3));
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q0 a(s sVar) {
        String str = sVar.b0;
        if (str != null) {
            t1.c.c(sVar, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + sVar);
        }
        q0 g10 = g(sVar);
        sVar.J = this;
        oi.f fVar = this.c;
        fVar.E(g10);
        if (!sVar.R) {
            fVar.c(sVar);
            sVar.w = false;
            sVar.Z = false;
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
    public final void b(u uVar, v7.c0 c0Var, s sVar) {
        if (this.w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.w = uVar;
        this.x = c0Var;
        this.y = sVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (sVar != 0) {
            copyOnWriteArrayList.add(new e0(sVar));
        } else if (uVar != null) {
            copyOnWriteArrayList.add(uVar);
        }
        if (this.y != null) {
            h0();
        }
        if (uVar != null) {
            androidx.activity.v p5 = uVar.e.p();
            this.g = p5;
            p5.a(sVar != 0 ? sVar : uVar, this.j);
        }
        if (sVar != 0) {
            n0 n0Var = sVar.J.O;
            HashMap hashMap = n0Var.e;
            n0 n0Var2 = (n0) hashMap.get(sVar.e);
            if (n0Var2 == null) {
                n0Var2 = new n0(n0Var.g);
                hashMap.put(sVar.e, n0Var2);
            }
            this.O = n0Var2;
        } else if (uVar != null) {
            this.O = (n0) new aa.a(uVar.e.f(), n0.j).k(n0.class);
        } else {
            this.O = new n0(false);
        }
        this.O.i = P();
        this.c.d = this.O;
        u uVar2 = this.w;
        if (uVar2 != null && sVar == 0) {
            m.p g10 = uVar2.g();
            g10.f("android:support:fragments", new androidx.activity.e(this, 2));
            Bundle c10 = g10.c("android:support:fragments");
            if (c10 != null) {
                X(c10);
            }
        }
        u uVar3 = this.w;
        if (uVar3 != null) {
            androidx.activity.h hVar = uVar3.e.w;
            String g11 = v7.j.g("FragmentManager:", sVar != 0 ? a4.a.t(new StringBuilder(), sVar.e, ":") : "");
            this.C = hVar.d(v7.j.t(g11, "StartActivityForResult"), new f0(2), new a4.m(this, 3));
            this.D = hVar.d(v7.j.t(g11, "StartIntentSenderForResult"), new f0(0), new a6.m(this, 6));
            this.E = hVar.d(v7.j.t(g11, "RequestPermissions"), new f0(1), new a6.i(this, 5));
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
            uVar6.e.F.add(this.s);
        }
        u uVar7 = this.w;
        if (uVar7 != null) {
            uVar7.e.G.add(this.t);
        }
        u uVar8 = this.w;
        if (uVar8 == null || sVar != 0) {
            return;
        }
        la.h hVar2 = uVar8.e.c;
        ((CopyOnWriteArrayList) hVar2.d).add(this.u);
        ((Runnable) hVar2.c).run();
    }

    public final void b0(s sVar, androidx.lifecycle.n nVar) {
        if (sVar.equals(this.c.k(sVar.e)) && (sVar.K == null || sVar.J == this)) {
            sVar.c0 = nVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + sVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + sVar);
        }
        if (sVar.R) {
            sVar.R = false;
            if (sVar.v) {
                return;
            }
            this.c.c(sVar);
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
            if (!sVar.equals(this.c.k(sVar.e)) || (sVar.K != null && sVar.J != this)) {
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
            r rVar = sVar.Y;
            if ((rVar == null ? 0 : rVar.e) + (rVar == null ? 0 : rVar.d) + (rVar == null ? 0 : rVar.c) + (rVar == null ? 0 : rVar.b) > 0) {
                if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G.setTag(R.id.visible_removing_fragment_view_tag, sVar);
                }
                s sVar2 = (s) G.getTag(R.id.visible_removing_fragment_view_tag);
                r rVar2 = sVar.Y;
                boolean z10 = rVar2 != null ? rVar2.a : false;
                if (sVar2.Y == null) {
                    return;
                }
                sVar2.j().a = z10;
            }
        }
    }

    public final HashSet e() {
        l lVar;
        HashSet hashSet = new HashSet();
        ArrayList p5 = this.c.p();
        int size = p5.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = p5.get(i10);
            i10++;
            ViewGroup viewGroup = ((q0) obj).c.V;
            if (viewGroup != null) {
                ob.a factory = I();
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

    public final HashSet f(int i10, int i11, ArrayList arrayList) {
        ViewGroup viewGroup;
        l lVar;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            ArrayList arrayList2 = ((a) arrayList.get(i10)).a;
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                s sVar = ((r0) obj).b;
                if (sVar != null && (viewGroup = sVar.V) != null) {
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
            i10++;
        }
        return hashSet;
    }

    public final void f0() {
        ArrayList p5 = this.c.p();
        int size = p5.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = p5.get(i10);
            i10++;
            q0 q0Var = (q0) obj;
            s sVar = q0Var.c;
            if (sVar.W) {
                if (this.b) {
                    this.K = true;
                } else {
                    sVar.W = false;
                    q0Var.j();
                }
            }
        }
    }

    public final q0 g(s sVar) {
        String str = sVar.e;
        oi.f fVar = this.c;
        q0 q0Var = (q0) ((HashMap) fVar.b).get(str);
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this.o, fVar, sVar);
        q0Var2.l(this.w.b.getClassLoader());
        q0Var2.e = this.v;
        return q0Var2;
    }

    public final void g0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new t0());
        u uVar = this.w;
        if (uVar == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            uVar.e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e7) {
            Log.e("FragmentManager", "Failed dumping state", e7);
            throw illegalStateException;
        }
    }

    public final void h(s sVar) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + sVar);
        }
        if (sVar.R) {
            return;
        }
        sVar.R = true;
        if (sVar.v) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + sVar);
            }
            oi.f fVar = this.c;
            synchronized (((ArrayList) fVar.a)) {
                ((ArrayList) fVar.a).remove(sVar);
            }
            sVar.v = false;
            if (L(sVar)) {
                this.G = true;
            }
            d0(sVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.internal.h, rd.a] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.h, rd.a] */
    public final void h0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    b0 b0Var = this.j;
                    b0Var.a = true;
                    ?? r22 = b0Var.c;
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
                b0 b0Var2 = this.j;
                b0Var2.a = z10;
                ?? r02 = b0Var2.c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th2) {
                throw th2;
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
                    sVar.L.i(true, configuration);
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
                if (!sVar.Q ? sVar.L.j() : false) {
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
                if (!sVar.Q ? sVar.L.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(sVar);
                    z10 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i10 = 0; i10 < this.e.size(); i10++) {
                s sVar2 = (s) this.e.get(i10);
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
        oi.f fVar = this.c;
        if (uVar != null) {
            z10 = ((n0) fVar.d).h;
        } else {
            z10 = e2.u(uVar.b) ? !r1.isChangingConfigurations() : true;
        }
        if (z10) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((c) it.next()).a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((n0) fVar.d).d((String) obj, false);
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
            uVar4.e.F.remove(this.s);
        }
        u uVar5 = this.w;
        if (uVar5 != null) {
            uVar5.e.G.remove(this.t);
        }
        u uVar6 = this.w;
        if ((uVar6 != null) && this.y == null) {
            la.h hVar = uVar6.e.c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) hVar.d;
            c0 c0Var = this.u;
            copyOnWriteArrayList.remove(c0Var);
            if (((HashMap) hVar.b).remove(c0Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) hVar.c).run();
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
        androidx.activity.result.c cVar = this.C;
        if (cVar != null) {
            cVar.d.f(cVar.b);
            androidx.activity.result.c cVar2 = this.D;
            cVar2.d.f(cVar2.b);
            androidx.activity.result.c cVar3 = this.E;
            cVar3.d.f(cVar3.b);
        }
    }

    public final void m(boolean z10) {
        if (z10 && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (s sVar : this.c.u()) {
            if (sVar != null) {
                sVar.U = true;
                if (z10) {
                    sVar.L.m(true);
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
                sVar.L.n(true);
            }
        }
    }

    public final void o() {
        ArrayList q6 = this.c.q();
        int size = q6.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = q6.get(i10);
            i10++;
            s sVar = (s) obj;
            if (sVar != null) {
                sVar.u();
                sVar.L.o();
            }
        }
    }

    public final boolean p() {
        if (this.v >= 1) {
            for (s sVar : this.c.u()) {
                if (sVar != null) {
                    if (!sVar.Q ? sVar.L.p() : false) {
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
            if (sVar != null && !sVar.Q) {
                sVar.L.q();
            }
        }
    }

    public final void r(s sVar) {
        if (sVar != null) {
            if (sVar.equals(this.c.k(sVar.e))) {
                sVar.J.getClass();
                boolean O = O(sVar);
                Boolean bool = sVar.s;
                if (bool == null || bool.booleanValue() != O) {
                    sVar.s = Boolean.valueOf(O);
                    l0 l0Var = sVar.L;
                    l0Var.h0();
                    l0Var.r(l0Var.z);
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
                sVar.L.s(true);
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
                if (!sVar.Q ? sVar.L.t() : false) {
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

    public final void u(int i10) {
        try {
            this.b = true;
            for (q0 q0Var : ((HashMap) this.c.b).values()) {
                if (q0Var != null) {
                    q0Var.e = i10;
                }
            }
            Q(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((l) it.next()).d();
            }
            this.b = false;
            A(true);
        } catch (Throwable th2) {
            this.b = false;
            throw th2;
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
        String t10 = v7.j.t(str, "    ");
        oi.f fVar = this.c;
        ArrayList arrayList = (ArrayList) fVar.a;
        String t11 = v7.j.t(str, "    ");
        HashMap hashMap = (HashMap) fVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (q0 q0Var : hashMap.values()) {
                printWriter.print(str);
                if (q0Var != null) {
                    s sVar = q0Var.c;
                    printWriter.println(sVar);
                    sVar.i(t11, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(BuildConfig.BETA_URL);
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size2; i10++) {
                s sVar2 = (s) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(sVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size; i11++) {
                s sVar3 = (s) this.e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(sVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size3; i12++) {
                a aVar = (a) this.d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.g(t10, printWriter, true);
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
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (h0) this.a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
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

    public final void y(h0 h0Var, boolean z10) {
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
                    this.a.add(h0Var);
                    Z();
                }
            } catch (Throwable th2) {
                throw th2;
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
