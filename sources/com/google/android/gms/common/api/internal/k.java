package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        Activity c10 = this.mLifecycleFragment.c();
        q6.m.h(c10);
        return c10;
    }

    public abstract void onStop();

    public static l getFragment(j jVar) {
        i1 i1Var;
        j1 j1Var;
        Activity activity = jVar.a;
        if (!(activity instanceof androidx.fragment.app.v)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = i1.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (i1Var = (i1) weakReference.get()) != null) {
                return i1Var;
            }
            try {
                i1 i1Var2 = (i1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (i1Var2 == null || i1Var2.isRemoving()) {
                    i1Var2 = new i1();
                    activity.getFragmentManager().beginTransaction().add(i1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(i1Var2));
                return i1Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
            }
        }
        androidx.fragment.app.v vVar = (androidx.fragment.app.v) activity;
        WeakHashMap weakHashMap2 = j1.m0;
        androidx.fragment.app.k0 s5 = vVar.s();
        WeakHashMap weakHashMap3 = j1.m0;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(vVar);
        if (weakReference2 != null && (j1Var = (j1) weakReference2.get()) != null) {
            return j1Var;
        }
        try {
            j1 j1Var2 = (j1) s5.D("SLifecycleFragmentImpl");
            if (j1Var2 == null || j1Var2.x) {
                j1Var2 = new j1();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s5);
                aVar.f(0, j1Var2, "SLifecycleFragmentImpl");
                aVar.e(true, true);
            }
            weakHashMap3.put(vVar, new WeakReference(j1Var2));
            return j1Var2;
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
