package org.telegram.ui;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b90 implements org.telegram.messenger.ds {
    public final /* synthetic */ LaunchActivity a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zx c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Uri f;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 h;

    public /* synthetic */ b90(LaunchActivity launchActivity, int i10, zx zxVar, boolean z10, ArrayList arrayList, Uri uri, org.telegram.ui.ActionBar.x1 x1Var) {
        this.a = launchActivity;
        this.b = i10;
        this.c = zxVar;
        this.d = z10;
        this.e = arrayList;
        this.f = uri;
        this.h = x1Var;
    }

    @Override // org.telegram.messenger.ds
    public final void run(long j10) {
        org.telegram.ui.ActionBar.x1 x1Var = this.h;
        LaunchActivity launchActivity = this.a;
        if (j10 != 0) {
            Pattern pattern = LaunchActivity.D1;
            Bundle g10 = a1.g.g("scrollToTopOnResume", true);
            if (!org.telegram.messenger.i0.Q1()) {
                org.telegram.messenger.at.f(this.b).k(org.telegram.messenger.at.t, new Object[0]);
            }
            if (org.telegram.messenger.o5.E(j10)) {
                g10.putLong("user_id", j10);
            } else {
                g10.putLong("chat_id", -j10);
            }
            un unVar = new un(g10);
            unVar.K9 = true;
            org.telegram.ui.ActionBar.z4 M = launchActivity.M();
            zx zxVar = this.c;
            ((ActionBarLayout) M).U(unVar, zxVar != null || this.d, zxVar == null);
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
            x1Var.dismiss();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
