package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l {
    protected final m mLifecycleFragment;

    public l(m mVar) {
        this.mLifecycleFragment = mVar;
    }

    public static m getFragment(Activity activity) {
        return getFragment(new k(activity));
    }

    public Activity getActivity() {
        Activity e10 = this.mLifecycleFragment.e();
        x5.l.h(e10);
        return e10;
    }

    public abstract void onStop();

    public static m getFragment(k kVar) {
        p1 p1Var;
        r1 r1Var;
        Activity activity = kVar.a;
        if (!(activity instanceof androidx.fragment.app.v)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = p1.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (p1Var = (p1) weakReference.get()) != null) {
                return p1Var;
            }
            try {
                p1 p1Var2 = (p1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (p1Var2 == null || p1Var2.isRemoving()) {
                    p1Var2 = new p1();
                    activity.getFragmentManager().beginTransaction().add(p1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(p1Var2));
                return p1Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
            }
        }
        androidx.fragment.app.v vVar = (androidx.fragment.app.v) activity;
        WeakHashMap weakHashMap2 = r1.h0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(vVar);
        if (weakReference2 != null && (r1Var = (r1) weakReference2.get()) != null) {
            return r1Var;
        }
        try {
            r1 r1Var2 = (r1) vVar.s().D("SLifecycleFragmentImpl");
            if (r1Var2 == null || r1Var2.w) {
                r1Var2 = new r1();
                androidx.fragment.app.k0 s10 = vVar.s();
                s10.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s10);
                aVar.f(0, r1Var2, "SLifecycleFragmentImpl");
                aVar.e(true, true);
            }
            weakHashMap2.put(vVar, new WeakReference(r1Var2));
            return r1Var2;
        } catch (ClassCastException e11) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e11);
        }
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public static m getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onActivityResult(int i9, int i10, Intent intent) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
