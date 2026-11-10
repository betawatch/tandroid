package androidx.fragment.app;

import a8.ra;
import a8.x6;
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
import org.telegram.ui.ly0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class i0 {
    public final b0 A;
    public final sa.d B;
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
    public l0 O;
    public final ra P;
    public boolean b;
    public ArrayList e;
    public androidx.activity.w g;
    public final ArrayList n;
    public final wf.b o;
    public final CopyOnWriteArrayList p;
    public final y q;
    public final y r;
    public final y s;
    public final y t;
    public final a0 u;
    public int v;
    public t w;
    public x6 x;
    public r y;
    public r z;
    public final ArrayList a = new ArrayList();
    public final ui.e c = new ui.e(1);
    public ArrayList d = new ArrayList();
    public final x f = new x(this);
    public a h = null;
    public boolean i = false;
    public final z j = new z(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());
    public final Map m = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.y] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.y] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.y] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.y] */
    public i0() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        this.o = new wf.b(this);
        this.p = new CopyOnWriteArrayList();
        final int i7 = 0;
        this.q = new q0.a(this) { // from class: androidx.fragment.app.y
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        i0 i0Var = this.b;
                        if (i0Var.M()) {
                            i0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i0 i0Var2 = this.b;
                        if (i0Var2.M() && num.intValue() == 80) {
                            i0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.f fVar = (e0.f) obj;
                        i0 i0Var3 = this.b;
                        if (i0Var3.M()) {
                            boolean z9 = fVar.a;
                            i0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.k0 k0Var = (e0.k0) obj;
                        i0 i0Var4 = this.b;
                        if (i0Var4.M()) {
                            boolean z10 = k0Var.a;
                            i0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.r = new q0.a(this) { // from class: androidx.fragment.app.y
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        i0 i0Var = this.b;
                        if (i0Var.M()) {
                            i0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i0 i0Var2 = this.b;
                        if (i0Var2.M() && num.intValue() == 80) {
                            i0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.f fVar = (e0.f) obj;
                        i0 i0Var3 = this.b;
                        if (i0Var3.M()) {
                            boolean z9 = fVar.a;
                            i0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.k0 k0Var = (e0.k0) obj;
                        i0 i0Var4 = this.b;
                        if (i0Var4.M()) {
                            boolean z10 = k0Var.a;
                            i0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i11 = 2;
        this.s = new q0.a(this) { // from class: androidx.fragment.app.y
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        i0 i0Var = this.b;
                        if (i0Var.M()) {
                            i0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i0 i0Var2 = this.b;
                        if (i0Var2.M() && num.intValue() == 80) {
                            i0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.f fVar = (e0.f) obj;
                        i0 i0Var3 = this.b;
                        if (i0Var3.M()) {
                            boolean z9 = fVar.a;
                            i0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.k0 k0Var = (e0.k0) obj;
                        i0 i0Var4 = this.b;
                        if (i0Var4.M()) {
                            boolean z10 = k0Var.a;
                            i0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i12 = 3;
        this.t = new q0.a(this) { // from class: androidx.fragment.app.y
            public final /* synthetic */ i0 b;

            {
                this.b = this;
            }

            @Override // q0.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        i0 i0Var = this.b;
                        if (i0Var.M()) {
                            i0Var.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        i0 i0Var2 = this.b;
                        if (i0Var2.M() && num.intValue() == 80) {
                            i0Var2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        e0.f fVar = (e0.f) obj;
                        i0 i0Var3 = this.b;
                        if (i0Var3.M()) {
                            boolean z9 = fVar.a;
                            i0Var3.n(false);
                            break;
                        }
                        break;
                    default:
                        e0.k0 k0Var = (e0.k0) obj;
                        i0 i0Var4 = this.b;
                        if (i0Var4.M()) {
                            boolean z10 = k0Var.a;
                            i0Var4.s(false);
                            break;
                        }
                        break;
                }
            }
        };
        this.u = new a0(this);
        this.v = -1;
        this.A = new b0(this);
        this.B = new sa.d(i12);
        this.F = new ArrayDeque();
        this.P = new ra(this, 6);
    }

    public static HashSet F(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < aVar.a.size(); i7++) {
            r rVar = ((p0) aVar.a.get(i7)).b;
            if (rVar != null && aVar.g) {
                hashSet.add(rVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i7) {
        return Log.isLoggable("FragmentManager", i7);
    }

    public static boolean L(r rVar) {
        rVar.getClass();
        ArrayList t6 = rVar.L.c.t();
        int size = t6.size();
        boolean z9 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = t6.get(i7);
            i7++;
            r rVar2 = (r) obj;
            if (rVar2 != null) {
                z9 = L(rVar2);
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(r rVar) {
        if (rVar == null) {
            return true;
        }
        if (rVar.T) {
            return rVar.J == null || N(rVar.M);
        }
        return false;
    }

    public static boolean O(r rVar) {
        if (rVar == null) {
            return true;
        }
        i0 i0Var = rVar.J;
        return rVar.equals(i0Var.z) && O(i0Var.y);
    }

    public static void e0(r rVar) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + rVar);
        }
        if (rVar.Q) {
            rVar.Q = false;
            rVar.Z = !rVar.Z;
        }
    }

    public final boolean A(boolean z9) {
        boolean z10;
        a aVar;
        z(z9);
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
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                r rVar = ((p0) obj).b;
                if (rVar != null) {
                    rVar.y = false;
                }
            }
            this.h = null;
        }
        boolean z11 = false;
        while (true) {
            ArrayList arrayList2 = this.L;
            ArrayList arrayList3 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z10 = false;
                } else {
                    try {
                        int size2 = this.a.size();
                        z10 = false;
                        for (int i10 = 0; i10 < size2; i10++) {
                            z10 |= ((f0) this.a.get(i10)).a(arrayList2, arrayList3);
                        }
                    } finally {
                    }
                }
            }
            if (!z10) {
                h0();
                v();
                ((HashMap) this.c.c).values().removeAll(Collections.singleton(null));
                return z11;
            }
            z11 = true;
            this.b = true;
            try {
                W(this.L, this.M);
            } finally {
                d();
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        String str;
        boolean z9;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        ui.e eVar = this.c;
        ArrayList arrayList3 = this.n;
        boolean z12 = ((a) arrayList.get(i7)).o;
        ArrayList arrayList4 = this.N;
        if (arrayList4 == null) {
            this.N = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.N.addAll(eVar.y());
        r rVar = this.z;
        int i14 = i7;
        boolean z13 = false;
        while (i14 < i10) {
            a aVar = (a) arrayList.get(i14);
            if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                z9 = z12;
                i11 = i14;
                z10 = z13;
                int i15 = 1;
                ArrayList arrayList5 = this.N;
                ArrayList arrayList6 = aVar.a;
                int size = arrayList6.size() - 1;
                while (size >= 0) {
                    p0 p0Var = (p0) arrayList6.get(size);
                    int i16 = p0Var.a;
                    if (i16 != i15) {
                        if (i16 != 3) {
                            switch (i16) {
                                case 8:
                                    rVar = null;
                                    break;
                                case 9:
                                    rVar = p0Var.b;
                                    break;
                                case 10:
                                    p0Var.i = p0Var.h;
                                    break;
                            }
                            size--;
                            i15 = 1;
                        }
                        arrayList5.add(p0Var.b);
                        size--;
                        i15 = 1;
                    }
                    arrayList5.remove(p0Var.b);
                    size--;
                    i15 = 1;
                }
            } else {
                ArrayList arrayList7 = this.N;
                ArrayList arrayList8 = aVar.a;
                int i17 = 0;
                while (i17 < arrayList8.size()) {
                    p0 p0Var2 = (p0) arrayList8.get(i17);
                    boolean z14 = z12;
                    int i18 = p0Var2.a;
                    int i19 = i14;
                    int i20 = 1;
                    if (i18 != 1) {
                        z11 = z13;
                        if (i18 != 2) {
                            if (i18 == 3 || i18 == 6) {
                                arrayList7.remove(p0Var2.b);
                                r rVar2 = p0Var2.b;
                                if (rVar2 == rVar) {
                                    arrayList8.add(i17, new p0(9, rVar2));
                                    i17++;
                                    rVar = null;
                                }
                            } else if (i18 == 7) {
                                i20 = 1;
                            } else if (i18 == 8) {
                                arrayList8.add(i17, new p0(9, rVar, 0));
                                p0Var2.c = true;
                                i17++;
                                rVar = p0Var2.b;
                            }
                            i20 = 1;
                        } else {
                            r rVar3 = p0Var2.b;
                            int i21 = rVar3.O;
                            int size2 = arrayList7.size() - 1;
                            boolean z15 = false;
                            while (size2 >= 0) {
                                int i22 = size2;
                                r rVar4 = (r) arrayList7.get(size2);
                                if (rVar4.O != i21) {
                                    i12 = i21;
                                } else if (rVar4 == rVar3) {
                                    i12 = i21;
                                    z15 = true;
                                } else {
                                    if (rVar4 == rVar) {
                                        i12 = i21;
                                        arrayList8.add(i17, new p0(9, rVar4, 0));
                                        i17++;
                                        i13 = 0;
                                        rVar = null;
                                    } else {
                                        i12 = i21;
                                        i13 = 0;
                                    }
                                    p0 p0Var3 = new p0(3, rVar4, i13);
                                    p0Var3.d = p0Var2.d;
                                    p0Var3.f = p0Var2.f;
                                    p0Var3.e = p0Var2.e;
                                    p0Var3.g = p0Var2.g;
                                    arrayList8.add(i17, p0Var3);
                                    arrayList7.remove(rVar4);
                                    i17++;
                                    rVar = rVar;
                                }
                                size2 = i22 - 1;
                                i21 = i12;
                            }
                            i20 = 1;
                            if (z15) {
                                arrayList8.remove(i17);
                                i17--;
                            } else {
                                p0Var2.a = 1;
                                p0Var2.c = true;
                                arrayList7.add(rVar3);
                            }
                        }
                        i17 += i20;
                        z12 = z14;
                        i14 = i19;
                        z13 = z11;
                    } else {
                        z11 = z13;
                    }
                    arrayList7.add(p0Var2.b);
                    i17 += i20;
                    z12 = z14;
                    i14 = i19;
                    z13 = z11;
                }
                z9 = z12;
                i11 = i14;
                z10 = z13;
            }
            z13 = z10 || aVar.g;
            i14 = i11 + 1;
            z12 = z9;
        }
        boolean z16 = z12;
        boolean z17 = z13;
        this.N.clear();
        if (!z16 && this.v >= 1) {
            for (int i23 = i7; i23 < i10; i23++) {
                ArrayList arrayList9 = ((a) arrayList.get(i23)).a;
                int size3 = arrayList9.size();
                int i24 = 0;
                while (i24 < size3) {
                    Object obj = arrayList9.get(i24);
                    i24++;
                    r rVar5 = ((p0) obj).b;
                    if (rVar5 != null && rVar5.J != null) {
                        eVar.J(g(rVar5));
                    }
                }
            }
        }
        String str2 = "Unknown cmd: ";
        int i25 = i7;
        while (i25 < i10) {
            a aVar2 = (a) arrayList.get(i25);
            if (((Boolean) arrayList2.get(i25)).booleanValue()) {
                aVar2.c(-1);
                i0 i0Var = aVar2.q;
                ArrayList arrayList10 = aVar2.a;
                boolean z18 = true;
                for (int size4 = arrayList10.size() - 1; size4 >= 0; size4--) {
                    p0 p0Var4 = (p0) arrayList10.get(size4);
                    r rVar6 = p0Var4.b;
                    if (rVar6 != null) {
                        if (rVar6.Y != null) {
                            rVar6.j().a = z18;
                        }
                        int i26 = aVar2.f;
                        int i27 = 8194;
                        int i28 = 4097;
                        if (i26 != 4097) {
                            if (i26 != 8194) {
                                i27 = 4100;
                                if (i26 != 8197) {
                                    i28 = 4099;
                                    if (i26 != 4099) {
                                        i27 = i26 != 4100 ? 0 : 8197;
                                    }
                                }
                            }
                            i27 = i28;
                        }
                        if (rVar6.Y != null || i27 != 0) {
                            rVar6.j();
                            rVar6.Y.f = i27;
                        }
                        rVar6.j();
                        rVar6.Y.getClass();
                    }
                    switch (p0Var4.a) {
                        case 1:
                            rVar6.L(p0Var4.d, p0Var4.e, p0Var4.f, p0Var4.g);
                            z18 = true;
                            i0Var.a0(rVar6, true);
                            i0Var.V(rVar6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + p0Var4.a);
                        case 3:
                            rVar6.L(p0Var4.d, p0Var4.e, p0Var4.f, p0Var4.g);
                            i0Var.a(rVar6);
                            z18 = true;
                        case 4:
                            rVar6.L(p0Var4.d, p0Var4.e, p0Var4.f, p0Var4.g);
                            i0Var.getClass();
                            e0(rVar6);
                            z18 = true;
                        case 5:
                            rVar6.L(p0Var4.d, p0Var4.e, p0Var4.f, p0Var4.g);
                            i0Var.a0(rVar6, true);
                            i0Var.J(rVar6);
                            z18 = true;
                        case 6:
                            rVar6.L(p0Var4.d, p0Var4.e, p0Var4.f, p0Var4.g);
                            i0Var.c(rVar6);
                            z18 = true;
                        case 7:
                            rVar6.L(p0Var4.d, p0Var4.e, p0Var4.f, p0Var4.g);
                            i0Var.a0(rVar6, true);
                            i0Var.h(rVar6);
                            z18 = true;
                        case 8:
                            i0Var.c0(null);
                            z18 = true;
                        case 9:
                            i0Var.c0(rVar6);
                            z18 = true;
                        case 10:
                            p0Var4.i = rVar6.c0;
                            i0Var.b0(rVar6, p0Var4.h);
                            z18 = true;
                    }
                }
            } else {
                aVar2.c(1);
                i0 i0Var2 = aVar2.q;
                ArrayList arrayList11 = aVar2.a;
                int size5 = arrayList11.size();
                int i29 = 0;
                while (i29 < size5) {
                    p0 p0Var5 = (p0) arrayList11.get(i29);
                    r rVar7 = p0Var5.b;
                    if (rVar7 != null) {
                        if (rVar7.Y != null) {
                            rVar7.j().a = false;
                        }
                        int i30 = aVar2.f;
                        if (rVar7.Y != null || i30 != 0) {
                            rVar7.j();
                            rVar7.Y.f = i30;
                        }
                        rVar7.j();
                        rVar7.Y.getClass();
                    }
                    switch (p0Var5.a) {
                        case 1:
                            str = str2;
                            rVar7.L(p0Var5.d, p0Var5.e, p0Var5.f, p0Var5.g);
                            i0Var2.a0(rVar7, false);
                            i0Var2.a(rVar7);
                            i29++;
                            str2 = str;
                        case 2:
                        default:
                            throw new IllegalArgumentException(str2 + p0Var5.a);
                        case 3:
                            str = str2;
                            rVar7.L(p0Var5.d, p0Var5.e, p0Var5.f, p0Var5.g);
                            i0Var2.V(rVar7);
                            i29++;
                            str2 = str;
                        case 4:
                            str = str2;
                            rVar7.L(p0Var5.d, p0Var5.e, p0Var5.f, p0Var5.g);
                            i0Var2.J(rVar7);
                            i29++;
                            str2 = str;
                        case 5:
                            str = str2;
                            rVar7.L(p0Var5.d, p0Var5.e, p0Var5.f, p0Var5.g);
                            i0Var2.a0(rVar7, false);
                            e0(rVar7);
                            i29++;
                            str2 = str;
                        case 6:
                            str = str2;
                            rVar7.L(p0Var5.d, p0Var5.e, p0Var5.f, p0Var5.g);
                            i0Var2.h(rVar7);
                            i29++;
                            str2 = str;
                        case 7:
                            str = str2;
                            rVar7.L(p0Var5.d, p0Var5.e, p0Var5.f, p0Var5.g);
                            i0Var2.a0(rVar7, false);
                            i0Var2.c(rVar7);
                            i29++;
                            str2 = str;
                        case 8:
                            i0Var2.c0(rVar7);
                            str = str2;
                            i29++;
                            str2 = str;
                        case 9:
                            i0Var2.c0(null);
                            str = str2;
                            i29++;
                            str2 = str;
                        case 10:
                            p0Var5.h = rVar7.c0;
                            i0Var2.b0(rVar7, p0Var5.i);
                            str = str2;
                            i29++;
                            str2 = str;
                    }
                }
            }
            i25++;
            str2 = str2;
        }
        boolean booleanValue = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
        if (z17 && !arrayList3.isEmpty()) {
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
        for (int i34 = i7; i34 < i10; i34++) {
            a aVar3 = (a) arrayList.get(i34);
            if (booleanValue) {
                for (int size9 = aVar3.a.size() - 1; size9 >= 0; size9--) {
                    r rVar8 = ((p0) aVar3.a.get(size9)).b;
                    if (rVar8 != null) {
                        g(rVar8).j();
                    }
                }
            } else {
                ArrayList arrayList12 = aVar3.a;
                int size10 = arrayList12.size();
                int i35 = 0;
                while (i35 < size10) {
                    Object obj5 = arrayList12.get(i35);
                    i35++;
                    r rVar9 = ((p0) obj5).b;
                    if (rVar9 != null) {
                        g(rVar9).j();
                    }
                }
            }
        }
        Q(this.v, true);
        int i36 = i7;
        Iterator it3 = f(i36, i10, arrayList).iterator();
        while (it3.hasNext()) {
            k kVar = (k) it3.next();
            kVar.e = booleanValue;
            synchronized (kVar.b) {
                kVar.f();
                ArrayList arrayList13 = kVar.b;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    ((t0) listIterator.previous()).getClass();
                    throw null;
                }
                kVar.f = false;
            }
            kVar.c();
        }
        while (i36 < i10) {
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
            i36++;
        }
        if (!z17 || arrayList3.size() <= 0) {
            return;
        }
        arrayList3.get(0).getClass();
        throw new ClassCastException();
    }

    public final r C(int i7) {
        ui.e eVar = this.c;
        ArrayList arrayList = (ArrayList) eVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r rVar = (r) arrayList.get(size);
            if (rVar != null && rVar.N == i7) {
                return rVar;
            }
        }
        for (o0 o0Var : ((HashMap) eVar.c).values()) {
            if (o0Var != null) {
                r rVar2 = o0Var.c;
                if (rVar2.N == i7) {
                    return rVar2;
                }
            }
        }
        return null;
    }

    public final r D(String str) {
        ui.e eVar = this.c;
        ArrayList arrayList = (ArrayList) eVar.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r rVar = (r) arrayList.get(size);
            if (rVar != null && str.equals(rVar.P)) {
                return rVar;
            }
        }
        for (o0 o0Var : ((HashMap) eVar.c).values()) {
            if (o0Var != null) {
                r rVar2 = o0Var.c;
                if (str.equals(rVar2.P)) {
                    return rVar2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.f) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                kVar.f = false;
                kVar.c();
            }
        }
    }

    public final ViewGroup G(r rVar) {
        ViewGroup viewGroup = rVar.V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rVar.O <= 0 || !this.x.c()) {
            return null;
        }
        View b10 = this.x.b(rVar.O);
        if (b10 instanceof ViewGroup) {
            return (ViewGroup) b10;
        }
        return null;
    }

    public final b0 H() {
        r rVar = this.y;
        return rVar != null ? rVar.J.H() : this.A;
    }

    public final sa.d I() {
        r rVar = this.y;
        return rVar != null ? rVar.J.I() : this.B;
    }

    public final void J(r rVar) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + rVar);
        }
        if (rVar.Q) {
            return;
        }
        rVar.Q = true;
        rVar.Z = true ^ rVar.Z;
        d0(rVar);
    }

    public final boolean M() {
        r rVar = this.y;
        if (rVar == null) {
            return true;
        }
        return rVar.t() && this.y.p().M();
    }

    public final boolean P() {
        return this.H || this.I;
    }

    public final void Q(int i7, boolean z9) {
        t tVar;
        if (this.w == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z9 || i7 != this.v) {
            this.v = i7;
            ui.e eVar = this.c;
            HashMap hashMap = (HashMap) eVar.c;
            ArrayList arrayList = (ArrayList) eVar.b;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                o0 o0Var = (o0) hashMap.get(((r) obj).e);
                if (o0Var != null) {
                    o0Var.j();
                }
            }
            for (o0 o0Var2 : hashMap.values()) {
                if (o0Var2 != null) {
                    o0Var2.j();
                    r rVar = o0Var2.c;
                    if (rVar.x && !rVar.v()) {
                        eVar.K(o0Var2);
                    }
                }
            }
            f0();
            if (this.G && (tVar = this.w) != null && this.v == 7) {
                tVar.e.invalidateOptionsMenu();
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
        for (r rVar : this.c.y()) {
            if (rVar != null) {
                rVar.L.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i7, int i10) {
        A(false);
        z(true);
        r rVar = this.z;
        if (rVar != null && i7 < 0 && rVar.l().S()) {
            return true;
        }
        boolean U = U(this.L, this.M, i7, i10);
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

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, int i7, int i10) {
        boolean z9 = (i10 & 1) != 0;
        int i11 = -1;
        if (!this.d.isEmpty()) {
            if (i7 < 0) {
                i11 = z9 ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if (i7 >= 0 && i7 == aVar.s) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i11 = size;
                } else if (z9) {
                    i11 = size;
                    while (i11 > 0) {
                        a aVar2 = (a) this.d.get(i11 - 1);
                        if (i7 < 0 || i7 != aVar2.s) {
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

    public final void V(r rVar) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + rVar + " nesting=" + rVar.I);
        }
        boolean v = rVar.v();
        if (rVar.R && v) {
            return;
        }
        ui.e eVar = this.c;
        synchronized (((ArrayList) eVar.b)) {
            ((ArrayList) eVar.b).remove(rVar);
        }
        rVar.w = false;
        if (L(rVar)) {
            this.G = true;
        }
        rVar.x = true;
        d0(rVar);
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i7 < size) {
            if (!((a) arrayList.get(i7)).o) {
                if (i10 != i7) {
                    B(arrayList, arrayList2, i10, i7);
                }
                i10 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).o) {
                        i10++;
                    }
                }
                B(arrayList, arrayList2, i7, i10);
                i7 = i10 - 1;
            }
            i7++;
        }
        if (i10 != size) {
            B(arrayList, arrayList2, i10, size);
        }
    }

    public final void X(Bundle bundle) {
        wf.b bVar;
        int i7;
        int i10;
        Bundle bundle2;
        o0 o0Var;
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
        ui.e eVar = this.c;
        HashMap hashMap2 = (HashMap) eVar.d;
        HashMap hashMap3 = (HashMap) eVar.c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        k0 k0Var = (k0) bundle.getParcelable("state");
        if (k0Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = k0Var.a;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            bVar = this.o;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            Bundle W = eVar.W((String) obj, null);
            if (W != null) {
                r rVar = (r) this.O.d.get(((n0) W.getParcelable("state")).b);
                if (rVar != null) {
                    if (K(2)) {
                        i10 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + rVar);
                    } else {
                        i10 = 2;
                    }
                    o0Var = new o0(bVar, eVar, rVar, W);
                    bundle2 = W;
                } else {
                    i10 = 2;
                    bundle2 = W;
                    o0Var = new o0(this.o, this.c, this.w.b.getClassLoader(), H(), W);
                }
                r rVar2 = o0Var.c;
                rVar2.b = bundle2;
                rVar2.J = this;
                if (K(i10)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + rVar2.e + "): " + rVar2);
                }
                o0Var.l(this.w.b.getClassLoader());
                eVar.J(o0Var);
                o0Var.e = this.v;
            }
        }
        l0 l0Var = this.O;
        l0Var.getClass();
        ArrayList arrayList2 = new ArrayList(l0Var.d.values());
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            r rVar3 = (r) obj2;
            if (hashMap3.get(rVar3.e) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + rVar3 + " that was not found in the set of active Fragments " + k0Var.a);
                }
                this.O.f(rVar3);
                rVar3.J = this;
                o0 o0Var2 = new o0(bVar, eVar, rVar3);
                o0Var2.e = 1;
                o0Var2.j();
                rVar3.x = true;
                o0Var2.j();
            }
        }
        ArrayList arrayList3 = k0Var.b;
        ((ArrayList) eVar.b).clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                String str3 = (String) obj3;
                r n10 = eVar.n(str3);
                if (n10 == null) {
                    throw new IllegalStateException(a8.p0.p("No instantiated fragment for (", str3, ")"));
                }
                if (K(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + n10);
                }
                eVar.e(n10);
            }
        }
        if (k0Var.c != null) {
            this.d = new ArrayList(k0Var.c.length);
            int i14 = 0;
            while (true) {
                b[] bVarArr = k0Var.c;
                if (i14 >= bVarArr.length) {
                    break;
                }
                b bVar2 = bVarArr[i14];
                ArrayList arrayList4 = bVar2.b;
                a aVar = new a(this);
                int[] iArr = bVar2.a;
                int i15 = 0;
                int i16 = 0;
                while (i15 < iArr.length) {
                    p0 p0Var = new p0();
                    int i17 = i15 + 1;
                    p0Var.a = iArr[i15];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i16 + " base fragment #" + iArr[i17]);
                    }
                    p0Var.h = androidx.lifecycle.n.values()[bVar2.c[i16]];
                    p0Var.i = androidx.lifecycle.n.values()[bVar2.d[i16]];
                    int i18 = i15 + 2;
                    p0Var.c = iArr[i17] != 0;
                    int i19 = iArr[i18];
                    p0Var.d = i19;
                    int i20 = iArr[i15 + 3];
                    p0Var.e = i20;
                    int i21 = i15 + 5;
                    int i22 = iArr[i15 + 4];
                    p0Var.f = i22;
                    i15 += 6;
                    int[] iArr2 = iArr;
                    int i23 = iArr2[i21];
                    p0Var.g = i23;
                    aVar.b = i19;
                    aVar.c = i20;
                    aVar.d = i22;
                    aVar.e = i23;
                    aVar.b(p0Var);
                    i16++;
                    iArr = iArr2;
                }
                aVar.f = bVar2.e;
                aVar.h = bVar2.f;
                aVar.g = true;
                aVar.i = bVar2.n;
                aVar.j = bVar2.r;
                aVar.k = bVar2.s;
                aVar.l = bVar2.w;
                aVar.m = bVar2.x;
                aVar.n = bVar2.y;
                aVar.o = bVar2.D;
                aVar.s = bVar2.h;
                for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                    String str4 = (String) arrayList4.get(i24);
                    if (str4 != null) {
                        ((p0) aVar.a.get(i24)).b = eVar.n(str4);
                    }
                }
                aVar.c(1);
                if (K(2)) {
                    StringBuilder n11 = jg.g.n(i14, "restoreAllState: back stack #", " (index ");
                    n11.append(aVar.s);
                    n11.append("): ");
                    n11.append(aVar);
                    Log.v("FragmentManager", n11.toString());
                    PrintWriter printWriter = new PrintWriter(new r0());
                    aVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i14++;
            }
            i7 = 0;
        } else {
            i7 = 0;
            this.d = new ArrayList();
        }
        this.k.set(k0Var.d);
        String str5 = k0Var.e;
        if (str5 != null) {
            r n12 = eVar.n(str5);
            this.z = n12;
            r(n12);
        }
        ArrayList arrayList5 = k0Var.f;
        if (arrayList5 != null) {
            for (int i25 = i7; i25 < arrayList5.size(); i25++) {
                this.l.put((String) arrayList5.get(i25), (c) k0Var.h.get(i25));
            }
        }
        this.F = new ArrayDeque(k0Var.n);
    }

    public final Bundle Y() {
        int i7;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.H = true;
        this.O.i = true;
        ui.e eVar = this.c;
        eVar.getClass();
        HashMap hashMap = (HashMap) eVar.c;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            o0 o0Var = (o0) it.next();
            if (o0Var != null) {
                r rVar = o0Var.c;
                String str = rVar.e;
                Bundle bundle3 = new Bundle();
                r rVar2 = o0Var.c;
                if (rVar2.a == -1 && (bundle = rVar2.b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new n0(rVar2));
                if (rVar2.a > 0) {
                    Bundle bundle4 = new Bundle();
                    rVar2.G(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    o0Var.a.U(rVar2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    rVar2.g0.f(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle Y = rVar2.L.Y();
                    if (!Y.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", Y);
                    }
                    SparseArray<? extends Parcelable> sparseArray = rVar2.c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = rVar2.d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = rVar2.f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                eVar.W(str, bundle3);
                arrayList2.add(rVar.e);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + rVar + ": " + rVar.b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.c.d;
        if (!hashMap2.isEmpty()) {
            ui.e eVar2 = this.c;
            synchronized (((ArrayList) eVar2.b)) {
                try {
                    if (((ArrayList) eVar2.b).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) eVar2.b).size());
                        ArrayList arrayList3 = (ArrayList) eVar2.b;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            r rVar3 = (r) obj;
                            arrayList.add(rVar3.e);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + rVar3.e + "): " + rVar3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                bVarArr = new b[size2];
                for (i7 = 0; i7 < size2; i7++) {
                    bVarArr[i7] = new b((a) this.d.get(i7));
                    if (K(2)) {
                        StringBuilder n10 = jg.g.n(i7, "saveAllState: adding back stack #", ": ");
                        n10.append(this.d.get(i7));
                        Log.v("FragmentManager", n10.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            k0 k0Var = new k0();
            k0Var.e = null;
            ArrayList arrayList4 = new ArrayList();
            k0Var.f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            k0Var.h = arrayList5;
            k0Var.a = arrayList2;
            k0Var.b = arrayList;
            k0Var.c = bVarArr;
            k0Var.d = this.k.get();
            r rVar4 = this.z;
            if (rVar4 != null) {
                k0Var.e = rVar4.e;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            k0Var.n = new ArrayList(this.F);
            bundle2.putParcelable("state", k0Var);
            for (String str2 : this.m.keySet()) {
                bundle2.putBundle(rf.b.i("result_", str2), (Bundle) this.m.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(rf.b.i("fragment_", str3), (Bundle) hashMap2.get(str3));
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

    public final o0 a(r rVar) {
        String str = rVar.b0;
        if (str != null) {
            w1.c.c(rVar, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + rVar);
        }
        o0 g10 = g(rVar);
        rVar.J = this;
        ui.e eVar = this.c;
        eVar.J(g10);
        if (!rVar.R) {
            eVar.e(rVar);
            rVar.x = false;
            rVar.Z = false;
            if (L(rVar)) {
                this.G = true;
            }
        }
        return g10;
    }

    public final void a0(r rVar, boolean z9) {
        ViewGroup G = G(rVar);
        if (G == null || !(G instanceof w)) {
            return;
        }
        ((w) G).setDrawDisappearingViewsLast(!z9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(t tVar, x6 x6Var, r rVar) {
        if (this.w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.w = tVar;
        this.x = x6Var;
        this.y = rVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (rVar != 0) {
            copyOnWriteArrayList.add(new c0(rVar));
        } else if (tVar != null) {
            copyOnWriteArrayList.add(tVar);
        }
        if (this.y != null) {
            h0();
        }
        if (tVar != null) {
            androidx.activity.w p10 = tVar.e.p();
            this.g = p10;
            p10.a(rVar != 0 ? rVar : tVar, this.j);
        }
        if (rVar != 0) {
            l0 l0Var = rVar.J.O;
            HashMap hashMap = l0Var.e;
            l0 l0Var2 = (l0) hashMap.get(rVar.e);
            if (l0Var2 == null) {
                l0Var2 = new l0(l0Var.g);
                hashMap.put(rVar.e, l0Var2);
            }
            this.O = l0Var2;
        } else if (tVar != null) {
            this.O = (l0) new android.support.v4.media.session.a0(tVar.e.f(), l0.j).i(l0.class);
        } else {
            this.O = new l0(false);
        }
        this.O.i = P();
        this.c.e = this.O;
        t tVar2 = this.w;
        if (tVar2 != null && rVar == 0) {
            m.q g10 = tVar2.g();
            g10.f("android:support:fragments", new androidx.activity.e(this, 2));
            Bundle c10 = g10.c("android:support:fragments");
            if (c10 != null) {
                X(c10);
            }
        }
        t tVar3 = this.w;
        if (tVar3 != null) {
            androidx.activity.h hVar = tVar3.e.x;
            String i7 = rf.b.i("FragmentManager:", rVar != 0 ? a8.p0.s(new StringBuilder(), rVar.e, ":") : "");
            this.C = hVar.d(rf.b.r(i7, "StartActivityForResult"), new d0(2), new d6.i(this, 8));
            this.D = hVar.d(rf.b.r(i7, "StartIntentSenderForResult"), new d0(0), new aa.n(this, 4));
            this.E = hVar.d(rf.b.r(i7, "RequestPermissions"), new d0(1), new cb.c(this, 8));
        }
        t tVar4 = this.w;
        if (tVar4 != null) {
            tVar4.e.o(this.q);
        }
        t tVar5 = this.w;
        if (tVar5 != null) {
            tVar5.e.D.add(this.r);
        }
        t tVar6 = this.w;
        if (tVar6 != null) {
            tVar6.e.F.add(this.s);
        }
        t tVar7 = this.w;
        if (tVar7 != null) {
            tVar7.e.G.add(this.t);
        }
        t tVar8 = this.w;
        if (tVar8 == null || rVar != 0) {
            return;
        }
        ly0 ly0Var = tVar8.e.c;
        ((CopyOnWriteArrayList) ly0Var.c).add(this.u);
        ((Runnable) ly0Var.b).run();
    }

    public final void b0(r rVar, androidx.lifecycle.n nVar) {
        if (rVar.equals(this.c.n(rVar.e)) && (rVar.K == null || rVar.J == this)) {
            rVar.c0 = nVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(r rVar) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + rVar);
        }
        if (rVar.R) {
            rVar.R = false;
            if (rVar.w) {
                return;
            }
            this.c.e(rVar);
            if (K(2)) {
                Log.v("FragmentManager", "add from attach: " + rVar);
            }
            if (L(rVar)) {
                this.G = true;
            }
        }
    }

    public final void c0(r rVar) {
        if (rVar != null) {
            if (!rVar.equals(this.c.n(rVar.e)) || (rVar.K != null && rVar.J != this)) {
                throw new IllegalArgumentException("Fragment " + rVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        r rVar2 = this.z;
        this.z = rVar;
        r(rVar2);
        r(this.z);
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(r rVar) {
        ViewGroup G = G(rVar);
        if (G != null) {
            q qVar = rVar.Y;
            if ((qVar == null ? 0 : qVar.e) + (qVar == null ? 0 : qVar.d) + (qVar == null ? 0 : qVar.c) + (qVar == null ? 0 : qVar.b) > 0) {
                if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G.setTag(R.id.visible_removing_fragment_view_tag, rVar);
                }
                r rVar2 = (r) G.getTag(R.id.visible_removing_fragment_view_tag);
                q qVar2 = rVar.Y;
                boolean z9 = qVar2 != null ? qVar2.a : false;
                if (rVar2.Y == null) {
                    return;
                }
                rVar2.j().a = z9;
            }
        }
    }

    public final HashSet e() {
        k kVar;
        HashSet hashSet = new HashSet();
        ArrayList s5 = this.c.s();
        int size = s5.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = s5.get(i7);
            i7++;
            ViewGroup viewGroup = ((o0) obj).c.V;
            if (viewGroup != null) {
                sa.d factory = I();
                kotlin.jvm.internal.j.e(factory, "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof k) {
                    kVar = (k) tag;
                } else {
                    kVar = new k(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, kVar);
                }
                hashSet.add(kVar);
            }
        }
        return hashSet;
    }

    public final HashSet f(int i7, int i10, ArrayList arrayList) {
        ViewGroup viewGroup;
        k kVar;
        HashSet hashSet = new HashSet();
        while (i7 < i10) {
            ArrayList arrayList2 = ((a) arrayList.get(i7)).a;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                r rVar = ((p0) obj).b;
                if (rVar != null && (viewGroup = rVar.V) != null) {
                    kotlin.jvm.internal.j.d(I(), "fragmentManager.specialEffectsControllerFactory");
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof k) {
                        kVar = (k) tag;
                    } else {
                        kVar = new k(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, kVar);
                    }
                    hashSet.add(kVar);
                }
            }
            i7++;
        }
        return hashSet;
    }

    public final void f0() {
        ArrayList s5 = this.c.s();
        int size = s5.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = s5.get(i7);
            i7++;
            o0 o0Var = (o0) obj;
            r rVar = o0Var.c;
            if (rVar.W) {
                if (this.b) {
                    this.K = true;
                } else {
                    rVar.W = false;
                    o0Var.j();
                }
            }
        }
    }

    public final o0 g(r rVar) {
        String str = rVar.e;
        ui.e eVar = this.c;
        o0 o0Var = (o0) ((HashMap) eVar.c).get(str);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0(this.o, eVar, rVar);
        o0Var2.l(this.w.b.getClassLoader());
        o0Var2.e = this.v;
        return o0Var2;
    }

    public final void g0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new r0());
        t tVar = this.w;
        if (tVar == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
                throw illegalStateException;
            }
        }
        try {
            tVar.e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e11) {
            Log.e("FragmentManager", "Failed dumping state", e11);
            throw illegalStateException;
        }
    }

    public final void h(r rVar) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + rVar);
        }
        if (rVar.R) {
            return;
        }
        rVar.R = true;
        if (rVar.w) {
            if (K(2)) {
                Log.v("FragmentManager", "remove from detach: " + rVar);
            }
            ui.e eVar = this.c;
            synchronized (((ArrayList) eVar.b)) {
                ((ArrayList) eVar.b).remove(rVar);
            }
            rVar.w = false;
            if (L(rVar)) {
                this.G = true;
            }
            d0(rVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [kotlin.jvm.internal.i, rd.a] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.internal.i, rd.a] */
    public final void h0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    z zVar = this.j;
                    zVar.a = true;
                    ?? r22 = zVar.c;
                    if (r22 != 0) {
                        r22.invoke();
                    }
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z9 = this.d.size() + (this.h != null ? 1 : 0) > 0 && O(this.y);
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z9);
                }
                z zVar2 = this.j;
                zVar2.a = z9;
                ?? r02 = zVar2.c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i(boolean z9, Configuration configuration) {
        if (z9 && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (r rVar : this.c.y()) {
            if (rVar != null) {
                rVar.onConfigurationChanged(configuration);
                if (z9) {
                    rVar.L.i(true, configuration);
                }
            }
        }
    }

    public final boolean j() {
        if (this.v < 1) {
            return false;
        }
        for (r rVar : this.c.y()) {
            if (rVar != null) {
                if (!rVar.Q ? rVar.L.j() : false) {
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
        boolean z9 = false;
        for (r rVar : this.c.y()) {
            if (rVar != null && N(rVar)) {
                if (!rVar.Q ? rVar.L.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(rVar);
                    z9 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i7 = 0; i7 < this.e.size(); i7++) {
                r rVar2 = (r) this.e.get(i7);
                if (arrayList == null || !arrayList.contains(rVar2)) {
                    rVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z9;
    }

    public final void l() {
        boolean z9;
        this.J = true;
        A(true);
        x();
        t tVar = this.w;
        ui.e eVar = this.c;
        if (tVar != null) {
            z9 = ((l0) eVar.e).h;
        } else {
            z9 = com.google.android.recaptcha.internal.a.u(tVar.b) ? !r1.isChangingConfigurations() : true;
        }
        if (z9) {
            Iterator it = this.l.values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((c) it.next()).a;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((l0) eVar.e).d((String) obj, false);
                }
            }
        }
        u(-1);
        t tVar2 = this.w;
        if (tVar2 != null) {
            tVar2.e.D.remove(this.r);
        }
        t tVar3 = this.w;
        if (tVar3 != null) {
            tVar3.e.y.remove(this.q);
        }
        t tVar4 = this.w;
        if (tVar4 != null) {
            tVar4.e.F.remove(this.s);
        }
        t tVar5 = this.w;
        if (tVar5 != null) {
            tVar5.e.G.remove(this.t);
        }
        t tVar6 = this.w;
        if ((tVar6 != null) && this.y == null) {
            ly0 ly0Var = tVar6.e.c;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ly0Var.c;
            a0 a0Var = this.u;
            copyOnWriteArrayList.remove(a0Var);
            if (((HashMap) ly0Var.d).remove(a0Var) != null) {
                throw new ClassCastException();
            }
            ((Runnable) ly0Var.b).run();
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

    public final void m(boolean z9) {
        if (z9 && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (r rVar : this.c.y()) {
            if (rVar != null) {
                rVar.U = true;
                if (z9) {
                    rVar.L.m(true);
                }
            }
        }
    }

    public final void n(boolean z9) {
        if (z9 && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (r rVar : this.c.y()) {
            if (rVar != null && z9) {
                rVar.L.n(true);
            }
        }
    }

    public final void o() {
        ArrayList t6 = this.c.t();
        int size = t6.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = t6.get(i7);
            i7++;
            r rVar = (r) obj;
            if (rVar != null) {
                rVar.u();
                rVar.L.o();
            }
        }
    }

    public final boolean p() {
        if (this.v >= 1) {
            for (r rVar : this.c.y()) {
                if (rVar != null) {
                    if (!rVar.Q ? rVar.L.p() : false) {
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
        for (r rVar : this.c.y()) {
            if (rVar != null && !rVar.Q) {
                rVar.L.q();
            }
        }
    }

    public final void r(r rVar) {
        if (rVar != null) {
            if (rVar.equals(this.c.n(rVar.e))) {
                rVar.J.getClass();
                boolean O = O(rVar);
                Boolean bool = rVar.s;
                if (bool == null || bool.booleanValue() != O) {
                    rVar.s = Boolean.valueOf(O);
                    j0 j0Var = rVar.L;
                    j0Var.h0();
                    j0Var.r(j0Var.z);
                }
            }
        }
    }

    public final void s(boolean z9) {
        if (z9 && this.w != null) {
            g0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (r rVar : this.c.y()) {
            if (rVar != null && z9) {
                rVar.L.s(true);
            }
        }
    }

    public final boolean t() {
        if (this.v < 1) {
            return false;
        }
        boolean z9 = false;
        for (r rVar : this.c.y()) {
            if (rVar != null && N(rVar)) {
                if (!rVar.Q ? rVar.L.t() : false) {
                    z9 = true;
                }
            }
        }
        return z9;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        r rVar = this.y;
        if (rVar != null) {
            sb2.append(rVar.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb2.append("}");
        } else {
            t tVar = this.w;
            if (tVar != null) {
                sb2.append(tVar.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i7) {
        try {
            this.b = true;
            for (o0 o0Var : ((HashMap) this.c.c).values()) {
                if (o0Var != null) {
                    o0Var.e = i7;
                }
            }
            Q(i7, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((k) it.next()).d();
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
        String r10 = rf.b.r(str, "    ");
        ui.e eVar = this.c;
        ArrayList arrayList = (ArrayList) eVar.b;
        String r11 = rf.b.r(str, "    ");
        HashMap hashMap = (HashMap) eVar.c;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (o0 o0Var : hashMap.values()) {
                printWriter.print(str);
                if (o0Var != null) {
                    r rVar = o0Var.c;
                    printWriter.println(rVar);
                    rVar.i(r11, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size2; i7++) {
                r rVar2 = (r) arrayList.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(rVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                r rVar3 = (r) this.e.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(rVar3.toString());
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
                aVar.g(r10, printWriter, true);
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
                        Object obj = (f0) this.a.get(i12);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
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
            ((k) it.next()).d();
        }
    }

    public final void y(f0 f0Var, boolean z9) {
        if (!z9) {
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
                    if (!z9) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(f0Var);
                    Z();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z(boolean z9) {
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
        if (!z9 && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
