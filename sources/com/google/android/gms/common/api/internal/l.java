package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        Activity e6 = this.mLifecycleFragment.e();
        b6.m.h(e6);
        return e6;
    }

    public abstract void onStop();

    public static m getFragment(k kVar) {
        r1 r1Var;
        t1 t1Var;
        Activity activity = kVar.a;
        if (!(activity instanceof androidx.fragment.app.v)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = r1.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (r1Var = (r1) weakReference.get()) != null) {
                return r1Var;
            }
            try {
                r1 r1Var2 = (r1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (r1Var2 == null || r1Var2.isRemoving()) {
                    r1Var2 = new r1();
                    activity.getFragmentManager().beginTransaction().add(r1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(r1Var2));
                return r1Var2;
            } catch (ClassCastException e6) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e6);
            }
        }
        androidx.fragment.app.v vVar = (androidx.fragment.app.v) activity;
        WeakHashMap weakHashMap2 = t1.i0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(vVar);
        if (weakReference2 != null && (t1Var = (t1) weakReference2.get()) != null) {
            return t1Var;
        }
        try {
            t1 t1Var2 = (t1) vVar.s().D("SLifecycleFragmentImpl");
            if (t1Var2 == null || t1Var2.w) {
                t1Var2 = new t1();
                androidx.fragment.app.k0 s6 = vVar.s();
                s6.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s6);
                aVar.f(0, t1Var2, "SLifecycleFragmentImpl");
                aVar.e(true, true);
            }
            weakHashMap2.put(vVar, new WeakReference(t1Var2));
            return t1Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
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

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
