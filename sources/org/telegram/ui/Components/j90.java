package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n90 b;

    public /* synthetic */ j90(n90 n90Var, int i10) {
        this.a = i10;
        this.b = n90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        n90 n90Var = this.b;
        switch (i10) {
            case 0:
                n90Var.a0();
                break;
            default:
                Activity parentActivity = n90Var.getParentActivity();
                Activity parentActivity2 = n90Var.getParentActivity();
                org.telegram.messenger.s5 s5Var = ig.k1.m;
                boolean z10 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z10) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                break;
        }
    }
}
