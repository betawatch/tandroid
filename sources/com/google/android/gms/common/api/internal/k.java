package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class k {
    protected final l mLifecycleFragment;

    public k(l lVar) {
        this.mLifecycleFragment = lVar;
    }

    public static l getFragment(Activity activity) {
        return getFragment(new j(activity));
    }

    public Activity getActivity() {
        Activity e10 = this.mLifecycleFragment.e();
        q6.m.g(e10);
        return e10;
    }

    public abstract void onStop();

    public static l getFragment(j jVar) {
        h1 h1Var;
        i1 i1Var;
        Activity activity = jVar.a;
        if (!(activity instanceof androidx.fragment.app.u)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = h1.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (h1Var = (h1) weakReference.get()) != null) {
                return h1Var;
            }
            try {
                h1 h1Var2 = (h1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (h1Var2 == null || h1Var2.isRemoving()) {
                    h1Var2 = new h1();
                    activity.getFragmentManager().beginTransaction().add(h1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(h1Var2));
                return h1Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
            }
        }
        androidx.fragment.app.u uVar = (androidx.fragment.app.u) activity;
        WeakHashMap weakHashMap2 = i1.l0;
        androidx.fragment.app.j0 s5 = uVar.s();
        WeakHashMap weakHashMap3 = i1.l0;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(uVar);
        if (weakReference2 != null && (i1Var = (i1) weakReference2.get()) != null) {
            return i1Var;
        }
        try {
            i1 i1Var2 = (i1) s5.D("SLifecycleFragmentImpl");
            if (i1Var2 == null || i1Var2.x) {
                i1Var2 = new i1();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s5);
                aVar.f(0, i1Var2, "SLifecycleFragmentImpl");
                aVar.e(true, true);
            }
            weakHashMap3.put(uVar, new WeakReference(i1Var2));
            return i1Var2;
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

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public static l getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void onActivityResult(int i7, int i10, Intent intent) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
