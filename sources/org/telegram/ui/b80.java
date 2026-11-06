package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b80 implements org.telegram.messenger.tr {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ww c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Uri f;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 h;

    public /* synthetic */ b80(LaunchActivity launchActivity, int i7, ww wwVar, boolean z9, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = launchActivity;
        this.b = i7;
        this.c = wwVar;
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
            an anVar = new an(k10);
            anVar.K9 = true;
            org.telegram.ui.ActionBar.q4 M = launchActivity.M();
            ww wwVar = this.c;
            ((ActionBarLayout) M).V(anVar, wwVar != null || this.d, wwVar == null);
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
