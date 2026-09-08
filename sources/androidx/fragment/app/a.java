package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a implements f0 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final i0 q;
    public boolean r;
    public int s;

    public a(i0 i0Var) {
        i0Var.H();
        t tVar = i0Var.w;
        if (tVar != null) {
            tVar.b.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = i0Var;
    }

    @Override // androidx.fragment.app.f0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (i0.K(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(p0 p0Var) {
        this.a.add(p0Var);
        p0Var.d = this.b;
        p0Var.e = this.c;
        p0Var.f = this.d;
        p0Var.g = this.e;
    }

    public final void c(int i10) {
        if (this.g) {
            if (i0.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                p0 p0Var = (p0) arrayList.get(i11);
                r rVar = p0Var.b;
                if (rVar != null) {
                    rVar.I += i10;
                    if (i0.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + p0Var.b + " to " + p0Var.b.I);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            p0 p0Var = (p0) arrayList.get(size);
            if (p0Var.c) {
                if (p0Var.a == 8) {
                    p0Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = p0Var.b.O;
                    p0Var.a = 2;
                    p0Var.c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        p0 p0Var2 = (p0) arrayList.get(i11);
                        if (p0Var2.c && p0Var2.b.O == i10) {
                            arrayList.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z10, boolean z11) {
        if (this.r) {
            throw new IllegalStateException("commit already called");
        }
        if (i0.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new r0());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z12 = this.g;
        i0 i0Var = this.q;
        if (z12) {
            this.s = i0Var.k.getAndIncrement();
        } else {
            this.s = -1;
        }
        if (z11) {
            i0Var.y(this, z10);
        }
        return this.s;
    }

    public final void f(int i10, r rVar, String str) {
        String str2 = rVar.b0;
        if (str2 != null) {
            t1.c.c(rVar, str2);
        }
        Class<?> cls = rVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = rVar.P;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(rVar);
                sb2.append(": was ");
                throw new IllegalStateException(a4.a.q(rVar.P, " now ", str, sb2));
            }
            rVar.P = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + rVar + " with tag " + str + " to container view with no id");
            }
            int i11 = rVar.N;
            if (i11 != 0 && i11 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + rVar + ": was " + rVar.N + " now " + i10);
            }
            rVar.N = i10;
            rVar.O = i10;
        }
        b(new p0(1, rVar));
        rVar.J = this.q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p0 p0Var = (p0) arrayList.get(i10);
            switch (p0Var.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + p0Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(p0Var.b);
            if (z10) {
                if (p0Var.d != 0 || p0Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(p0Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(p0Var.e));
                }
                if (p0Var.f != 0 || p0Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(p0Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(p0Var.g));
                }
            }
        }
    }

    public final void h(r rVar) {
        i0 i0Var = rVar.J;
        if (i0Var == null || i0Var == this.q) {
            b(new p0(3, rVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + rVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb2.append(" #");
            sb2.append(this.s);
        }
        if (this.h != null) {
            sb2.append(" ");
            sb2.append(this.h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
