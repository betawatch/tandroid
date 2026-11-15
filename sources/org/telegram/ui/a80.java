package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a80 implements org.telegram.messenger.qr {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ int b;
    public final /* synthetic */ yw c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Uri f;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 h;

    public /* synthetic */ a80(LaunchActivity launchActivity, int i7, yw ywVar, boolean z10, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.t1 t1Var) {
        this.a = launchActivity;
        this.b = i7;
        this.c = ywVar;
        this.d = z10;
        this.e = arrayList;
        this.f = uri;
        this.h = t1Var;
    }

    @Override // org.telegram.messenger.qr
    public final void run(long j3) {
        org.telegram.ui.ActionBar.t1 t1Var = this.h;
        LaunchActivity launchActivity = this.a;
        if (j3 != 0) {
            String str = LaunchActivity.C1;
            Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
            if (!org.telegram.messenger.g0.Q1()) {
                org.telegram.messenger.ns.f(this.b).k(org.telegram.messenger.ns.t, new Object[0]);
            }
            if (org.telegram.messenger.m5.E(j3)) {
                k10.putLong("user_id", j3);
            } else {
                k10.putLong("chat_id", -j3);
            }
            an anVar = new an(k10);
            anVar.N9 = true;
            org.telegram.ui.ActionBar.o4 M = launchActivity.M();
            yw ywVar = this.c;
            ((ActionBarLayout) M).V(anVar, ywVar != null || this.d, ywVar == null);
        } else {
            ArrayList arrayList = this.e;
            launchActivity.X = arrayList;
            if (arrayList == null) {
                launchActivity.X = new ArrayList();
            }
            launchActivity.X.add(0, this.f);
            launchActivity.j0(true);
        }
        try {
            t1Var.dismiss();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
