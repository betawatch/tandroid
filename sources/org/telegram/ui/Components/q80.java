package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v80 b;

    public /* synthetic */ q80(v80 v80Var, int i7) {
        this.a = i7;
        this.b = v80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        v80 v80Var = this.b;
        switch (i7) {
            case 0:
                v80Var.b0();
                break;
            default:
                Activity parentActivity = v80Var.getParentActivity();
                Activity parentActivity2 = v80Var.getParentActivity();
                org.telegram.messenger.q5 q5Var = sg.c1.m;
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
