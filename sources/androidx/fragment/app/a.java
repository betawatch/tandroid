package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a implements h0 {
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
    public final k0 q;
    public boolean r;
    public int s;

    public a(k0 k0Var) {
        k0Var.H();
        u uVar = k0Var.w;
        if (uVar != null) {
            uVar.b.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = k0Var;
    }

    @Override // androidx.fragment.app.h0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (k0.K(2)) {
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

    public final void b(r0 r0Var) {
        this.a.add(r0Var);
        r0Var.d = this.b;
        r0Var.e = this.c;
        r0Var.f = this.d;
        r0Var.g = this.e;
    }

    public final void c(int i10) {
        if (this.g) {
            if (k0.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                r0 r0Var = (r0) arrayList.get(i11);
                s sVar = r0Var.b;
                if (sVar != null) {
                    sVar.I += i10;
                    if (k0.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + r0Var.b + " to " + r0Var.b.I);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            r0 r0Var = (r0) arrayList.get(size);
            if (r0Var.c) {
                if (r0Var.a == 8) {
                    r0Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = r0Var.b.O;
                    r0Var.a = 2;
                    r0Var.c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        r0 r0Var2 = (r0) arrayList.get(i11);
                        if (r0Var2.c && r0Var2.b.O == i10) {
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
        if (k0.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new t0());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z12 = this.g;
        k0 k0Var = this.q;
        if (z12) {
            this.s = k0Var.k.getAndIncrement();
        } else {
            this.s = -1;
        }
        if (z11) {
            k0Var.y(this, z10);
        }
        return this.s;
    }

    public final void f(int i10, s sVar, String str) {
        String str2 = sVar.b0;
        if (str2 != null) {
            t1.c.c(sVar, str2);
        }
        Class<?> cls = sVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = sVar.P;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(sVar);
                sb2.append(": was ");
                throw new IllegalStateException(a4.a.r(sVar.P, " now ", str, sb2));
            }
            sVar.P = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + sVar + " with tag " + str + " to container view with no id");
            }
            int i11 = sVar.N;
            if (i11 != 0 && i11 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + sVar + ": was " + sVar.N + " now " + i10);
            }
            sVar.N = i10;
            sVar.O = i10;
        }
        b(new r0(1, sVar));
        sVar.J = this.q;
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
            r0 r0Var = (r0) arrayList.get(i10);
            switch (r0Var.a) {
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
                    str2 = "cmd=" + r0Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(r0Var.b);
            if (z10) {
                if (r0Var.d != 0 || r0Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(r0Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(r0Var.e));
                }
                if (r0Var.f != 0 || r0Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(r0Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(r0Var.g));
                }
            }
        }
    }

    public final void h(s sVar) {
        k0 k0Var = sVar.J;
        if (k0Var == null || k0Var == this.q) {
            b(new r0(3, sVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + sVar.toString() + " is already attached to a FragmentManager.");
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
