package androidx.fragment.app;

import ag.q1;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class s implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.u0, androidx.lifecycle.i, g2.f {
    public static final Object f0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public j0 F;
    public u G;
    public s I;
    public int J;
    public int K;
    public String L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean Q;
    public ViewGroup R;
    public boolean S;
    public r U;
    public boolean V;
    public boolean W;
    public String X;
    public androidx.lifecycle.n Y;
    public androidx.lifecycle.v Z;
    public final androidx.lifecycle.z a0;
    public Bundle b;
    public androidx.lifecycle.n0 b0;
    public SparseArray c;
    public androidx.activity.n c0;
    public Bundle d;
    public final ArrayList d0;
    public final q e0;
    public Bundle f;
    public s h;
    public int r;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String n = null;
    public Boolean s = null;
    public k0 H = new k0();
    public final boolean P = true;
    public boolean T = true;

    public s() {
        new q1(this, 4);
        this.Y = androidx.lifecycle.n.e;
        this.a0 = new androidx.lifecycle.z();
        new AtomicInteger();
        this.d0 = new ArrayList();
        this.e0 = new q(this);
        r();
    }

    public void A() {
        this.Q = true;
    }

    public void B() {
        this.Q = true;
    }

    public void C() {
        this.Q = true;
    }

    public LayoutInflater D(Bundle bundle) {
        u uVar = this.G;
        if (uVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        v vVar = uVar.e;
        LayoutInflater cloneInContext = vVar.getLayoutInflater().cloneInContext(vVar);
        cloneInContext.setFactory2(this.H.f);
        return cloneInContext;
    }

    public void E() {
        this.Q = true;
    }

    public void F() {
        this.Q = true;
    }

    public abstract void H();

    public abstract void I();

    public void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.H.R();
        this.D = true;
        f();
    }

    public final Context K() {
        Context n10 = n();
        if (n10 != null) {
            return n10;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void L(int i10, int i11, int i12, int i13) {
        if (this.U == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        j().b = i10;
        j().c = i11;
        j().d = i12;
        j().e = i13;
    }

    public final void M(Bundle bundle) {
        j0 j0Var = this.F;
        if (j0Var != null) {
            if (j0Var == null ? false : j0Var.P()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f = bundle;
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.s0 c() {
        Application application;
        if (this.F == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.b0 == null) {
            Context applicationContext = K().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && j0.K(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.b0 = new androidx.lifecycle.n0(application, this, this.f);
        }
        return this.b0;
    }

    @Override // androidx.lifecycle.i
    public final v1.b d() {
        Application application;
        Context applicationContext = K().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && j0.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        v1.b bVar = new v1.b();
        LinkedHashMap linkedHashMap = (LinkedHashMap) bVar.a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.q0.a, application);
        }
        linkedHashMap.put(androidx.lifecycle.j0.a, this);
        linkedHashMap.put(androidx.lifecycle.j0.b, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.j0.c, bundle);
        }
        return bVar;
    }

    public Activity e() {
        return k();
    }

    @Override // androidx.lifecycle.u0
    public final androidx.lifecycle.t0 f() {
        if (this.F == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (o() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.F.O.f;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) hashMap.get(this.e);
        if (t0Var != null) {
            return t0Var;
        }
        androidx.lifecycle.t0 t0Var2 = new androidx.lifecycle.t0();
        hashMap.put(this.e, t0Var2);
        return t0Var2;
    }

    @Override // g2.f
    public final g2.e g() {
        return (g2.e) this.c0.c;
    }

    public h7.i0 h() {
        return new o(this);
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.J));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.K));
        printWriter.print(" mTag=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.w);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.y);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.M);
        printWriter.print(" mDetached=");
        printWriter.print(this.N);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.P);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.O);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.T);
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.F);
        }
        if (this.G != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.G);
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.I);
        }
        if (this.f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        s sVar = this.h;
        if (sVar == null) {
            j0 j0Var = this.F;
            sVar = (j0Var == null || (str2 = this.n) == null) ? null : j0Var.c.p(str2);
        }
        if (sVar != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(sVar);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        r rVar = this.U;
        printWriter.println(rVar == null ? false : rVar.a);
        r rVar2 = this.U;
        if ((rVar2 == null ? 0 : rVar2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            r rVar3 = this.U;
            printWriter.println(rVar3 == null ? 0 : rVar3.b);
        }
        r rVar4 = this.U;
        if ((rVar4 == null ? 0 : rVar4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            r rVar5 = this.U;
            printWriter.println(rVar5 == null ? 0 : rVar5.c);
        }
        r rVar6 = this.U;
        if ((rVar6 == null ? 0 : rVar6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            r rVar7 = this.U;
            printWriter.println(rVar7 == null ? 0 : rVar7.d);
        }
        r rVar8 = this.U;
        if ((rVar8 == null ? 0 : rVar8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            r rVar9 = this.U;
            printWriter.println(rVar9 != null ? rVar9.e : 0);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.R);
        }
        if (n() != null) {
            new v5.n(this, f()).i(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.H + ":");
        this.H.w(u3.c.k(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final r j() {
        if (this.U == null) {
            r rVar = new r();
            Object obj = f0;
            rVar.g = obj;
            rVar.h = obj;
            rVar.i = obj;
            rVar.j = null;
            this.U = rVar;
        }
        return this.U;
    }

    public final v k() {
        u uVar = this.G;
        if (uVar == null) {
            return null;
        }
        return uVar.a;
    }

    public final j0 l() {
        if (this.G != null) {
            return this.H;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.Z;
    }

    public final Context n() {
        u uVar = this.G;
        if (uVar == null) {
            return null;
        }
        return uVar.b;
    }

    public final int o() {
        androidx.lifecycle.n nVar = this.Y;
        return (nVar == androidx.lifecycle.n.b || this.I == null) ? nVar.ordinal() : Math.min(nVar.ordinal(), this.I.o());
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        v k9 = k();
        if (k9 != null) {
            k9.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.Q = true;
    }

    public final j0 p() {
        j0 j0Var = this.F;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final String q(int i10) {
        return K().getResources().getString(i10);
    }

    public final void r() {
        this.Z = new androidx.lifecycle.v(this);
        this.c0 = new androidx.activity.n(this);
        this.b0 = null;
        ArrayList arrayList = this.d0;
        q qVar = this.e0;
        if (arrayList.contains(qVar)) {
            return;
        }
        if (this.a >= 0) {
            qVar.a();
        } else {
            arrayList.add(qVar);
        }
    }

    public final void s() {
        r();
        this.X = this.e;
        this.e = UUID.randomUUID().toString();
        this.v = false;
        this.w = false;
        this.y = false;
        this.A = false;
        this.C = false;
        this.E = 0;
        this.F = null;
        this.H = new k0();
        this.G = null;
        this.J = 0;
        this.K = 0;
        this.L = null;
        this.M = false;
        this.N = false;
    }

    public final void startActivityForResult(Intent intent, int i10) {
        if (this.G == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        j0 p10 = p();
        if (p10.C != null) {
            String str = this.e;
            f0 f0Var = new f0();
            f0Var.a = str;
            f0Var.b = i10;
            p10.F.addLast(f0Var);
            p10.C.a(intent);
            return;
        }
        u uVar = p10.w;
        uVar.getClass();
        kotlin.jvm.internal.j.e(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        uVar.b.startActivity(intent, null);
    }

    public final boolean t() {
        return this.G != null && this.v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.e);
        if (this.J != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.J));
        }
        if (this.L != null) {
            sb2.append(" tag=");
            sb2.append(this.L);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final boolean u() {
        if (this.M) {
            return true;
        }
        j0 j0Var = this.F;
        if (j0Var != null) {
            s sVar = this.I;
            j0Var.getClass();
            if (sVar == null ? false : sVar.u()) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return this.E > 0;
    }

    public void w() {
        this.Q = true;
    }

    public void x(int i10, int i11, Intent intent) {
        if (j0.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void y(Context context) {
        this.Q = true;
        u uVar = this.G;
        if ((uVar == null ? null : uVar.a) != null) {
            this.Q = true;
        }
    }

    public void z(Bundle bundle) {
        Bundle bundle2;
        this.Q = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.H.X(bundle2);
            k0 k0Var = this.H;
            k0Var.H = false;
            k0Var.I = false;
            k0Var.O.i = false;
            k0Var.u(1);
        }
        k0 k0Var2 = this.H;
        if (k0Var2.v >= 1) {
            return;
        }
        k0Var2.H = false;
        k0Var2.I = false;
        k0Var2.O.i = false;
        k0Var2.u(1);
    }

    public void G(Bundle bundle) {
    }
}
