package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u80 b;

    public /* synthetic */ q80(u80 u80Var, int i7) {
        this.a = i7;
        this.b = u80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        u80 u80Var = this.b;
        switch (i7) {
            case 0:
                u80Var.b0();
                break;
            default:
                Activity parentActivity = u80Var.getParentActivity();
                Activity parentActivity2 = u80Var.getParentActivity();
                org.telegram.messenger.q5 q5Var = sg.d1.m;
                boolean z9 = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z9) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                break;
        }
    }
}
