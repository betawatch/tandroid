package androidx.fragment.app;

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
import b8.a1;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class s implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.u0, androidx.lifecycle.i, v4.e {
    public static final Object k0 = new Object();
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public j0 K;
    public u L;
    public s N;
    public int O;
    public int P;
    public String Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean V;
    public ViewGroup W;
    public boolean X;
    public r Z;
    public boolean a0;
    public Bundle b;
    public boolean b0;
    public SparseArray c;
    public String c0;
    public Bundle d;
    public androidx.lifecycle.n d0;
    public androidx.lifecycle.v e0;
    public Bundle f;
    public final androidx.lifecycle.z f0;
    public androidx.lifecycle.n0 g0;
    public s h;
    public androidx.activity.n h0;
    public final ArrayList i0;
    public final q j0;
    public int r;
    public boolean w;
    public boolean x;
    public boolean y;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String n = null;
    public Boolean s = null;
    public k0 M = new k0();
    public final boolean U = true;
    public boolean Y = true;

    public s() {
        new a3.o(this, 4);
        this.d0 = androidx.lifecycle.n.e;
        this.f0 = new androidx.lifecycle.z();
        new AtomicInteger();
        this.i0 = new ArrayList();
        this.j0 = new q(this);
        r();
    }

    public void A() {
        this.V = true;
    }

    public void B() {
        this.V = true;
    }

    public void C() {
        this.V = true;
    }

    public LayoutInflater D(Bundle bundle) {
        u uVar = this.L;
        if (uVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        v vVar = uVar.e;
        LayoutInflater cloneInContext = vVar.getLayoutInflater().cloneInContext(vVar);
        cloneInContext.setFactory2(this.M.f);
        return cloneInContext;
    }

    public void E() {
        this.V = true;
    }

    public void F() {
        this.V = true;
    }

    public abstract void H();

    public abstract void I();

    public void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.M.R();
        this.I = true;
        f();
    }

    public final Context K() {
        Context n4 = n();
        if (n4 != null) {
            return n4;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final void L(int i3, int i10, int i11, int i12) {
        if (this.Z == null && i3 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return;
        }
        j().b = i3;
        j().c = i10;
        j().d = i11;
        j().e = i12;
    }

    public final void M(Bundle bundle) {
        j0 j0Var = this.K;
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
        if (this.K == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.g0 == null) {
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
            this.g0 = new androidx.lifecycle.n0(application, this, this.f);
        }
        return this.g0;
    }

    @Override // androidx.lifecycle.i
    public final x1.b d() {
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
        x1.b bVar = new x1.b();
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
        if (this.K == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (o() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.K.O.f;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) hashMap.get(this.e);
        if (t0Var != null) {
            return t0Var;
        }
        androidx.lifecycle.t0 t0Var2 = new androidx.lifecycle.t0();
        hashMap.put(this.e, t0Var2);
        return t0Var2;
    }

    @Override // v4.e
    public final m.p g() {
        return (m.p) this.h0.d;
    }

    public a1 h() {
        return new o(this);
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.O));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.P));
        printWriter.print(" mTag=");
        printWriter.println(this.Q);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.J);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.w);
        printWriter.print(" mRemoving=");
        printWriter.print(this.x);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.E);
        printWriter.print(" mInLayout=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.R);
        printWriter.print(" mDetached=");
        printWriter.print(this.S);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.U);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.T);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Y);
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.L);
        }
        if (this.N != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.N);
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
            j0 j0Var = this.K;
            sVar = (j0Var == null || (str2 = this.n) == null) ? null : j0Var.c.m(str2);
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
        r rVar = this.Z;
        printWriter.println(rVar == null ? false : rVar.a);
        r rVar2 = this.Z;
        if ((rVar2 == null ? 0 : rVar2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            r rVar3 = this.Z;
            printWriter.println(rVar3 == null ? 0 : rVar3.b);
        }
        r rVar4 = this.Z;
        if ((rVar4 == null ? 0 : rVar4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            r rVar5 = this.Z;
            printWriter.println(rVar5 == null ? 0 : rVar5.c);
        }
        r rVar6 = this.Z;
        if ((rVar6 == null ? 0 : rVar6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            r rVar7 = this.Z;
            printWriter.println(rVar7 == null ? 0 : rVar7.d);
        }
        r rVar8 = this.Z;
        if ((rVar8 == null ? 0 : rVar8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            r rVar9 = this.Z;
            printWriter.println(rVar9 != null ? rVar9.e : 0);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.W);
        }
        if (n() != null) {
            new w9.b(this, f()).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.M + ":");
        this.M.w(t4.c.q(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final r j() {
        if (this.Z == null) {
            r rVar = new r();
            Object obj = k0;
            rVar.g = obj;
            rVar.h = obj;
            rVar.i = obj;
            rVar.j = null;
            this.Z = rVar;
        }
        return this.Z;
    }

    public final v k() {
        u uVar = this.L;
        if (uVar == null) {
            return null;
        }
        return uVar.a;
    }

    public final j0 l() {
        if (this.L != null) {
            return this.M;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.e0;
    }

    public final Context n() {
        u uVar = this.L;
        if (uVar == null) {
            return null;
        }
        return uVar.b;
    }

    public final int o() {
        androidx.lifecycle.n nVar = this.d0;
        return (nVar == androidx.lifecycle.n.b || this.N == null) ? nVar.ordinal() : Math.min(nVar.ordinal(), this.N.o());
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.V = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        v k10 = k();
        if (k10 != null) {
            k10.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.V = true;
    }

    public final j0 p() {
        j0 j0Var = this.K;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final String q(int i3) {
        return K().getResources().getString(i3);
    }

    public final void r() {
        this.e0 = new androidx.lifecycle.v(this);
        this.h0 = new androidx.activity.n(this);
        this.g0 = null;
        ArrayList arrayList = this.i0;
        q qVar = this.j0;
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
        this.c0 = this.e;
        this.e = UUID.randomUUID().toString();
        this.w = false;
        this.x = false;
        this.E = false;
        this.F = false;
        this.H = false;
        this.J = 0;
        this.K = null;
        this.M = new k0();
        this.L = null;
        this.O = 0;
        this.P = 0;
        this.Q = null;
        this.R = false;
        this.S = false;
    }

    public final boolean t() {
        return this.L != null && this.w;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.e);
        if (this.O != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.O));
        }
        if (this.Q != null) {
            sb2.append(" tag=");
            sb2.append(this.Q);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final boolean u() {
        if (this.R) {
            return true;
        }
        j0 j0Var = this.K;
        if (j0Var != null) {
            s sVar = this.N;
            j0Var.getClass();
            if (sVar == null ? false : sVar.u()) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return this.J > 0;
    }

    public void w() {
        this.V = true;
    }

    public void x(int i3, int i10, Intent intent) {
        if (j0.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i3 + " resultCode: " + i10 + " data: " + intent);
        }
    }

    public void y(Context context) {
        this.V = true;
        u uVar = this.L;
        if ((uVar == null ? null : uVar.a) != null) {
            this.V = true;
        }
    }

    public void z(Bundle bundle) {
        Bundle bundle2;
        this.V = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.M.X(bundle2);
            k0 k0Var = this.M;
            k0Var.H = false;
            k0Var.I = false;
            k0Var.O.i = false;
            k0Var.u(1);
        }
        k0 k0Var2 = this.M;
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
