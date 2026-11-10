package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e80 implements org.telegram.messenger.tr {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zw c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Uri f;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 h;

    public /* synthetic */ e80(LaunchActivity launchActivity, int i7, zw zwVar, boolean z9, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = launchActivity;
        this.b = i7;
        this.c = zwVar;
        this.d = z9;
        this.e = arrayList;
        this.f = uri;
        this.h = u1Var;
    }

    @Override // org.telegram.messenger.tr
    public final void run(long j3) {
        org.telegram.ui.ActionBar.u1 u1Var = this.h;
        LaunchActivity launchActivity = this.a;
        if (j3 != 0) {
            String str = LaunchActivity.B1;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (!org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.qs.f(this.b).k(org.telegram.messenger.qs.t, new Object[0]);
            }
            if (org.telegram.messenger.m5.E(j3)) {
                k10.putLong("user_id", j3);
            } else {
                k10.putLong("chat_id", -j3);
            }
            cn cnVar = new cn(k10);
            cnVar.M9 = true;
            org.telegram.ui.ActionBar.r4 M = launchActivity.M();
            zw zwVar = this.c;
            ((ActionBarLayout) M).V(cnVar, zwVar != null || this.d, zwVar == null);
        } else {
            ArrayList arrayList = this.e;
            launchActivity.W = arrayList;
            if (arrayList == null) {
                launchActivity.W = new ArrayList();
            }
            launchActivity.W.add(0, this.f);
            launchActivity.j0(true);
        }
        try {
            u1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
