package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        Activity e7 = this.mLifecycleFragment.e();
        n6.l.h(e7);
        return e7;
    }

    public abstract void onStop();

    public static m getFragment(k kVar) {
        q1 q1Var;
        r1 r1Var;
        Activity activity = kVar.a;
        if (!(activity instanceof androidx.fragment.app.u)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = q1.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (q1Var = (q1) weakReference.get()) != null) {
                return q1Var;
            }
            try {
                q1 q1Var2 = (q1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (q1Var2 == null || q1Var2.isRemoving()) {
                    q1Var2 = new q1();
                    activity.getFragmentManager().beginTransaction().add(q1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(q1Var2));
                return q1Var2;
            } catch (ClassCastException e7) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e7);
            }
        }
        androidx.fragment.app.u uVar = (androidx.fragment.app.u) activity;
        WeakHashMap weakHashMap2 = r1.l0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(uVar);
        if (weakReference2 != null && (r1Var = (r1) weakReference2.get()) != null) {
            return r1Var;
        }
        try {
            r1 r1Var2 = (r1) uVar.s().D("SLifecycleFragmentImpl");
            if (r1Var2 == null || r1Var2.w) {
                r1Var2 = new r1();
                androidx.fragment.app.j0 s10 = uVar.s();
                s10.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(s10);
                aVar.f(0, r1Var2, "SLifecycleFragmentImpl");
                aVar.e(true, true);
            }
            weakHashMap2.put(uVar, new WeakReference(r1Var2));
            return r1Var2;
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
