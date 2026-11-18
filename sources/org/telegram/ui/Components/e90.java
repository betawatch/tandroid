package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;

    public /* synthetic */ e90(i90 i90Var, int i7) {
        this.a = i7;
        this.b = i90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        i90 i90Var = this.b;
        switch (i7) {
            case 0:
                i90Var.b0();
                break;
            default:
                Activity parentActivity = i90Var.getParentActivity();
                Activity parentActivity2 = i90Var.getParentActivity();
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
