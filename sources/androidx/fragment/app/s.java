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
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import n7.a1;
import org.telegram.ui.Cells.r6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public abstract class s implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, androidx.lifecycle.u0, androidx.lifecycle.i, t4.e {
    public static final Object j0 = new Object();
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;
    public j0 J;
    public u K;
    public s M;
    public int N;
    public int O;
    public String P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean U;
    public ViewGroup V;
    public boolean W;
    public r Y;
    public boolean Z;
    public boolean a0;
    public Bundle b;
    public String b0;
    public SparseArray c;
    public androidx.lifecycle.n c0;
    public Bundle d;
    public androidx.lifecycle.v d0;
    public final androidx.lifecycle.z e0;
    public Bundle f;
    public androidx.lifecycle.n0 f0;
    public androidx.activity.o g0;
    public s h;
    public final ArrayList h0;
    public final q i0;
    public int r;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String n = null;
    public Boolean s = null;
    public k0 L = new k0();
    public final boolean T = true;
    public boolean X = true;

    public s() {
        new androidx.activity.i(this, 3);
        this.c0 = androidx.lifecycle.n.e;
        this.e0 = new androidx.lifecycle.z();
        new AtomicInteger();
        this.h0 = new ArrayList();
        this.i0 = new q(this);
        r();
    }

    public void A() {
        this.U = true;
    }

    public void B() {
        this.U = true;
    }

    public void C() {
        this.U = true;
    }

    public LayoutInflater D(Bundle bundle) {
        u uVar = this.K;
        if (uVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        v vVar = uVar.e;
        LayoutInflater cloneInContext = vVar.getLayoutInflater().cloneInContext(vVar);
        cloneInContext.setFactory2(this.L.f);
        return cloneInContext;
    }

    public void E() {
        this.U = true;
    }

    public void F() {
        this.U = true;
    }

    public abstract void H();

    public abstract void I();

    public void J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.L.R();
        this.H = true;
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
        if (this.Y == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        j().b = i10;
        j().c = i11;
        j().d = i12;
        j().e = i13;
    }

    public final void M(Bundle bundle) {
        j0 j0Var = this.J;
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
        if (this.J == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f0 == null) {
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
            this.f0 = new androidx.lifecycle.n0(application, this, this.f);
        }
        return this.f0;
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
        if (this.J == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (o() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap hashMap = this.J.O.f;
        androidx.lifecycle.t0 t0Var = (androidx.lifecycle.t0) hashMap.get(this.e);
        if (t0Var != null) {
            return t0Var;
        }
        androidx.lifecycle.t0 t0Var2 = new androidx.lifecycle.t0();
        hashMap.put(this.e, t0Var2);
        return t0Var2;
    }

    @Override // t4.e
    public final m.p g() {
        return (m.p) this.g0.d;
    }

    public v7.a0 h() {
        return new o(this);
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.N));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.O));
        printWriter.print(" mTag=");
        printWriter.println(this.P);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.I);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.v);
        printWriter.print(" mRemoving=");
        printWriter.print(this.w);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.y);
        printWriter.print(" mInLayout=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.Q);
        printWriter.print(" mDetached=");
        printWriter.print(this.R);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.T);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.S);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.X);
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.J);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.K);
        }
        if (this.M != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.M);
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
            j0 j0Var = this.J;
            sVar = (j0Var == null || (str2 = this.n) == null) ? null : j0Var.c.k(str2);
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
        r rVar = this.Y;
        printWriter.println(rVar == null ? false : rVar.a);
        r rVar2 = this.Y;
        if ((rVar2 == null ? 0 : rVar2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            r rVar3 = this.Y;
            printWriter.println(rVar3 == null ? 0 : rVar3.b);
        }
        r rVar4 = this.Y;
        if ((rVar4 == null ? 0 : rVar4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            r rVar5 = this.Y;
            printWriter.println(rVar5 == null ? 0 : rVar5.c);
        }
        r rVar6 = this.Y;
        if ((rVar6 == null ? 0 : rVar6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            r rVar7 = this.Y;
            printWriter.println(rVar7 == null ? 0 : rVar7.d);
        }
        r rVar8 = this.Y;
        if ((rVar8 == null ? 0 : rVar8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            r rVar9 = this.Y;
            printWriter.println(rVar9 != null ? rVar9.e : 0);
        }
        if (this.V != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.V);
        }
        if (n() != null) {
            new a1(this, f()).J(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.L + ":");
        this.L.w(r6.t(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final r j() {
        if (this.Y == null) {
            r rVar = new r();
            Object obj = j0;
            rVar.g = obj;
            rVar.h = obj;
            rVar.i = obj;
            rVar.j = null;
            this.Y = rVar;
        }
        return this.Y;
    }

    public final v k() {
        u uVar = this.K;
        if (uVar == null) {
            return null;
        }
        return uVar.a;
    }

    public final j0 l() {
        if (this.K != null) {
            return this.L;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.o m() {
        return this.d0;
    }

    public final Context n() {
        u uVar = this.K;
        if (uVar == null) {
            return null;
        }
        return uVar.b;
    }

    public final int o() {
        androidx.lifecycle.n nVar = this.c0;
        return (nVar == androidx.lifecycle.n.b || this.M == null) ? nVar.ordinal() : Math.min(nVar.ordinal(), this.M.o());
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.U = true;
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
        this.U = true;
    }

    public final j0 p() {
        j0 j0Var = this.J;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final String q(int i10) {
        return K().getResources().getString(i10);
    }

    public final void r() {
        this.d0 = new androidx.lifecycle.v(this);
        this.g0 = new androidx.activity.o(this);
        this.f0 = null;
        ArrayList arrayList = this.h0;
        q qVar = this.i0;
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
        this.b0 = this.e;
        this.e = UUID.randomUUID().toString();
        this.v = false;
        this.w = false;
        this.y = false;
        this.E = false;
        this.G = false;
        this.I = 0;
        this.J = null;
        this.L = new k0();
        this.K = null;
        this.N = 0;
        this.O = 0;
        this.P = null;
        this.Q = false;
        this.R = false;
    }

    public final void startActivityForResult(Intent intent, int i10) {
        if (this.K == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        j0 p5 = p();
        if (p5.C != null) {
            String str = this.e;
            f0 f0Var = new f0();
            f0Var.a = str;
            f0Var.b = i10;
            p5.F.addLast(f0Var);
            p5.C.a(intent);
            return;
        }
        u uVar = p5.w;
        uVar.getClass();
        kotlin.jvm.internal.i.e(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        uVar.b.startActivity(intent, null);
    }

    public final boolean t() {
        return this.K != null && this.v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.e);
        if (this.N != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.N));
        }
        if (this.P != null) {
            sb2.append(" tag=");
            sb2.append(this.P);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final boolean u() {
        if (this.Q) {
            return true;
        }
        j0 j0Var = this.J;
        if (j0Var != null) {
            s sVar = this.M;
            j0Var.getClass();
            if (sVar == null ? false : sVar.u()) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        return this.I > 0;
    }

    public void w() {
        this.U = true;
    }

    public void x(int i10, int i11, Intent intent) {
        if (j0.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void y(Context context) {
        this.U = true;
        u uVar = this.K;
        if ((uVar == null ? null : uVar.a) != null) {
            this.U = true;
        }
    }

    public void z(Bundle bundle) {
        Bundle bundle2;
        this.U = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.L.X(bundle2);
            k0 k0Var = this.L;
            k0Var.H = false;
            k0Var.I = false;
            k0Var.O.i = false;
            k0Var.u(1);
        }
        k0 k0Var2 = this.L;
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
