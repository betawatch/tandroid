package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a implements g0 {
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
    public final j0 q;
    public boolean r;
    public int s;

    public a(j0 j0Var) {
        j0Var.H();
        u uVar = j0Var.w;
        if (uVar != null) {
            uVar.b.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = j0Var;
    }

    @Override // androidx.fragment.app.g0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (j0.K(2)) {
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

    public final void b(q0 q0Var) {
        this.a.add(q0Var);
        q0Var.d = this.b;
        q0Var.e = this.c;
        q0Var.f = this.d;
        q0Var.g = this.e;
    }

    public final void c(int i3) {
        if (this.g) {
            if (j0.K(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                q0 q0Var = (q0) arrayList.get(i10);
                s sVar = q0Var.b;
                if (sVar != null) {
                    sVar.J += i3;
                    if (j0.K(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + q0Var.b + " to " + q0Var.b.J);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            q0 q0Var = (q0) arrayList.get(size);
            if (q0Var.c) {
                if (q0Var.a == 8) {
                    q0Var.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i3 = q0Var.b.P;
                    q0Var.a = 2;
                    q0Var.c = false;
                    for (int i10 = size - 1; i10 >= 0; i10--) {
                        q0 q0Var2 = (q0) arrayList.get(i10);
                        if (q0Var2.c && q0Var2.b.P == i3) {
                            arrayList.remove(i10);
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
        if (j0.K(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new s0());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.r = true;
        boolean z12 = this.g;
        j0 j0Var = this.q;
        if (z12) {
            this.s = j0Var.k.getAndIncrement();
        } else {
            this.s = -1;
        }
        if (z11) {
            j0Var.y(this, z10);
        }
        return this.s;
    }

    public final void f(int i3, s sVar, String str) {
        String str2 = sVar.c0;
        if (str2 != null) {
            v1.c.c(sVar, str2);
        }
        Class<?> cls = sVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = sVar.Q;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(sVar);
                sb2.append(": was ");
                throw new IllegalStateException(f1.r(sVar.Q, " now ", str, sb2));
            }
            sVar.Q = str;
        }
        if (i3 != 0) {
            if (i3 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + sVar + " with tag " + str + " to container view with no id");
            }
            int i10 = sVar.O;
            if (i10 != 0 && i10 != i3) {
                throw new IllegalStateException("Can't change container ID of fragment " + sVar + ": was " + sVar.O + " now " + i3);
            }
            sVar.O = i3;
            sVar.P = i3;
        }
        b(new q0(1, sVar));
        sVar.K = this.q;
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
        for (int i3 = 0; i3 < size; i3++) {
            q0 q0Var = (q0) arrayList.get(i3);
            switch (q0Var.a) {
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
                    str2 = "cmd=" + q0Var.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i3);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(q0Var.b);
            if (z10) {
                if (q0Var.d != 0 || q0Var.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(q0Var.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(q0Var.e));
                }
                if (q0Var.f != 0 || q0Var.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(q0Var.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(q0Var.g));
                }
            }
        }
    }

    public final void h(s sVar) {
        j0 j0Var = sVar.K;
        if (j0Var == null || j0Var == this.q) {
            b(new q0(3, sVar));
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
