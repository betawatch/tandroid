package org.telegram.ui.Components;

import android.app.Activity;
import android.content.SharedPreferences;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x80 b;

    public /* synthetic */ t80(x80 x80Var, int i7) {
        this.a = i7;
        this.b = x80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        x80 x80Var = this.b;
        switch (i7) {
            case 0:
                x80Var.b0();
                break;
            default:
                Activity parentActivity = x80Var.getParentActivity();
                Activity parentActivity2 = x80Var.getParentActivity();
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
