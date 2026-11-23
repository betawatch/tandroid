package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k90 b;

    public /* synthetic */ g90(k90 k90Var, int i7) {
        this.a = i7;
        this.b = k90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        k90 k90Var = this.b;
        switch (i7) {
            case 0:
                k90Var.b0();
                break;
            default:
                Activity parentActivity = k90Var.getParentActivity();
                Activity parentActivity2 = k90Var.getParentActivity();
                org.telegram.messenger.r5 r5Var = sg.b1.m;
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
