package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r80 b;

    public /* synthetic */ n80(r80 r80Var, int i3) {
        this.a = i3;
        this.b = r80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        r80 r80Var = this.b;
        switch (i3) {
            case 0:
                r80Var.b0();
                break;
            default:
                Activity parentActivity = r80Var.getParentActivity();
                Activity parentActivity2 = r80Var.getParentActivity();
                org.telegram.messenger.q5 q5Var = tg.b1.m;
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
