package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y80 b;

    public /* synthetic */ t80(y80 y80Var, int i7) {
        this.a = i7;
        this.b = y80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        y80 y80Var = this.b;
        switch (i7) {
            case 0:
                y80Var.b0();
                break;
            default:
                Activity parentActivity = y80Var.getParentActivity();
                Activity parentActivity2 = y80Var.getParentActivity();
                org.telegram.messenger.q5 q5Var = sg.b1.m;
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
