package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h90 b;

    public /* synthetic */ d90(h90 h90Var, int i7) {
        this.a = i7;
        this.b = h90Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        h90 h90Var = this.b;
        switch (i7) {
            case 0:
                h90Var.b0();
                break;
            default:
                Activity parentActivity = h90Var.getParentActivity();
                Activity parentActivity2 = h90Var.getParentActivity();
                org.telegram.messenger.r5 r5Var = sg.a1.m;
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
