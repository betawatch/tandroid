// default package

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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class bn4 implements ComponentCallbacks, View.OnCreateContextMenuListener, e16, tdc, oc5, dq9 {
    public static final Object k0 = new Object();
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public go4 K;
    public dn4 L;
    public bn4 N;
    public int O;
    public int P;
    public String Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean V;
    public ViewGroup W;
    public boolean X;
    public an4 Z;
    public boolean a0;
    public Bundle b;
    public boolean b0;
    public SparseArray c;
    public String c0;
    public Bundle d;
    public v06 d0;
    public g16 e0;
    public Bundle f;
    public final hh7 f0;
    public eq9 g0;
    public bn4 h;
    public qx h0;
    public final ArrayList i0;
    public final ym4 j0;
    public int r;
    public boolean w;
    public boolean x;
    public boolean y;
    public int a = -1;
    public String e = UUID.randomUUID().toString();
    public String n = null;
    public Boolean s = null;
    public ho4 M = new ho4();
    public final boolean U = true;
    public boolean Y = true;

    public bn4() {
        new ez3(this, (byte) 6);
        this.d0 = v06.e;
        this.f0 = new hh7();
        this.i0 = new ArrayList();
        this.j0 = new ym4(this);
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
        dn4 dn4Var = this.L;
        if (dn4Var == null) {
            sc8.j("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        en4 en4Var = dn4Var.e;
        LayoutInflater cloneInContext = en4Var.getLayoutInflater().cloneInContext(en4Var);
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
        Context n = n();
        if (n != null) {
            return n;
        }
        w44.d(this, " not attached to a context.", "Fragment ");
        return null;
    }

    public final void L() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.M.X(bundle);
        ho4 ho4Var = this.M;
        ho4Var.H = false;
        ho4Var.I = false;
        ho4Var.O.g = false;
        ho4Var.u(1);
    }

    public final void M(int i, int i2, int i3, int i4) {
        if (this.Z == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        j().b = i;
        j().c = i2;
        j().d = i3;
        j().e = i4;
    }

    public final void N(Bundle bundle) {
        go4 go4Var = this.K;
        if (go4Var != null) {
            if (go4Var == null ? false : go4Var.P()) {
                sc8.j("Fragment already added and state has been saved");
                return;
            }
        }
        this.f = bundle;
    }

    @Override // oc5
    public final rdc c() {
        Application application = null;
        if (this.K == null) {
            sc8.j("Can't access ViewModels from detached fragment");
            return null;
        }
        eq9 eq9Var = this.g0;
        if (eq9Var != null) {
            return eq9Var;
        }
        Context applicationContext = K().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && go4.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        eq9 eq9Var2 = new eq9(application, this, this.f);
        this.g0 = eq9Var2;
        return eq9Var2;
    }

    @Override // oc5
    public final fh7 d() {
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
        if (application == null && go4.K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + K().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        fh7 fh7Var = new fh7();
        LinkedHashMap linkedHashMap = (LinkedHashMap) fh7Var.a;
        if (application != null) {
            linkedHashMap.put(qdc.I, application);
        }
        linkedHashMap.put(mcd.a, this);
        linkedHashMap.put(mcd.b, this);
        Bundle bundle = this.f;
        if (bundle != null) {
            linkedHashMap.put(mcd.c, bundle);
        }
        return fh7Var;
    }

    public final Activity e() {
        return k();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // tdc
    public final sdc f() {
        if (this.K == null) {
            sc8.j("Can't access ViewModels from detached fragment");
            return null;
        }
        if (o() == 1) {
            sc8.j("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.K.O.d;
        sdc sdcVar = (sdc) hashMap.get(this.e);
        if (sdcVar != null) {
            return sdcVar;
        }
        sdc sdcVar2 = new sdc();
        hashMap.put(this.e, sdcVar2);
        return sdcVar2;
    }

    @Override // dq9
    public final oo g() {
        return (oo) this.h0.d;
    }

    public iie h() {
        return new ye3(this);
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
        bn4 bn4Var = this.h;
        if (bn4Var == null) {
            go4 go4Var = this.K;
            bn4Var = (go4Var == null || (str2 = this.n) == null) ? null : go4Var.c.m(str2);
        }
        if (bn4Var != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(bn4Var);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        an4 an4Var = this.Z;
        printWriter.println(an4Var == null ? false : an4Var.a);
        an4 an4Var2 = this.Z;
        if ((an4Var2 == null ? 0 : an4Var2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            an4 an4Var3 = this.Z;
            printWriter.println(an4Var3 == null ? 0 : an4Var3.b);
        }
        an4 an4Var4 = this.Z;
        if ((an4Var4 == null ? 0 : an4Var4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            an4 an4Var5 = this.Z;
            printWriter.println(an4Var5 == null ? 0 : an4Var5.c);
        }
        an4 an4Var6 = this.Z;
        if ((an4Var6 == null ? 0 : an4Var6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            an4 an4Var7 = this.Z;
            printWriter.println(an4Var7 == null ? 0 : an4Var7.d);
        }
        an4 an4Var8 = this.Z;
        if ((an4Var8 == null ? 0 : an4Var8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            an4 an4Var9 = this.Z;
            printWriter.println(an4Var9 != null ? an4Var9.e : 0);
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.W);
        }
        if (n() != null) {
            new sk4(this, f()).n(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.M + ":");
        this.M.w(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final an4 j() {
        an4 an4Var = this.Z;
        if (an4Var != null) {
            return an4Var;
        }
        an4 an4Var2 = new an4();
        Object obj = k0;
        an4Var2.f = obj;
        an4Var2.g = obj;
        an4Var2.h = obj;
        an4Var2.i = null;
        this.Z = an4Var2;
        return an4Var2;
    }

    public final en4 k() {
        dn4 dn4Var = this.L;
        if (dn4Var == null) {
            return null;
        }
        return (en4) dn4Var.a;
    }

    public final go4 l() {
        if (this.L != null) {
            return this.M;
        }
        w44.d(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    @Override // e16
    public final g16 m() {
        return this.e0;
    }

    public final Context n() {
        dn4 dn4Var = this.L;
        if (dn4Var == null) {
            return null;
        }
        return dn4Var.b;
    }

    public final int o() {
        v06 v06Var = this.d0;
        return (v06Var == v06.b || this.N == null) ? v06Var.ordinal() : Math.min(v06Var.ordinal(), this.N.o());
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.V = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        en4 k = k();
        if (k != null) {
            k.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            w44.d(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.V = true;
    }

    public final go4 p() {
        go4 go4Var = this.K;
        if (go4Var != null) {
            return go4Var;
        }
        w44.d(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    public final String q(int i) {
        return K().getResources().getString(i);
    }

    public final void r() {
        this.e0 = new g16(this);
        this.h0 = new qx(this);
        this.g0 = null;
        ArrayList arrayList = this.i0;
        ym4 ym4Var = this.j0;
        if (arrayList.contains(ym4Var)) {
            return;
        }
        if (this.a >= 0) {
            ym4Var.a();
        } else {
            arrayList.add(ym4Var);
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
        this.M = new ho4();
        this.L = null;
        this.O = 0;
        this.P = 0;
        this.Q = null;
        this.R = false;
        this.S = false;
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.L == null) {
            w44.d(this, " not attached to Activity", "Fragment ");
            return;
        }
        go4 p = p();
        if (p.C != null) {
            String str = this.e;
            co4 co4Var = new co4();
            co4Var.a = str;
            co4Var.b = i;
            p.F.addLast(co4Var);
            p.C.a(intent);
            return;
        }
        dn4 dn4Var = p.w;
        dn4Var.getClass();
        intent.getClass();
        if (i == -1) {
            dn4Var.b.startActivity(intent, null);
        } else {
            sc8.j("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    public final boolean t() {
        return this.L != null && this.w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.e);
        if (this.O != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.O));
        }
        if (this.Q != null) {
            sb.append(" tag=");
            sb.append(this.Q);
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        if (this.R) {
            return true;
        }
        if (this.K != null) {
            bn4 bn4Var = this.N;
            if (bn4Var == null ? false : bn4Var.u()) {
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

    public void x(int i, int i2, Intent intent) {
        if (go4.K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void y(Context context) {
        this.V = true;
        dn4 dn4Var = this.L;
        if ((dn4Var == null ? null : dn4Var.a) != null) {
            this.V = true;
        }
    }

    public void z(Bundle bundle) {
        this.V = true;
        L();
        ho4 ho4Var = this.M;
        if (ho4Var.v >= 1) {
            return;
        }
        ho4Var.H = false;
        ho4Var.I = false;
        ho4Var.O.g = false;
        ho4Var.u(1);
    }

    public void G(Bundle bundle) {
    }
}
