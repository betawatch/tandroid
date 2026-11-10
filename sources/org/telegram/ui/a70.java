package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a70 implements tw {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLRPC.User c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ a70(LaunchActivity launchActivity, String str, int i7, TLRPC.User user) {
        this.b = launchActivity;
        this.d = str;
        this.e = i7;
        this.c = user;
    }

    @Override // org.telegram.ui.tw
    public final /* synthetic */ boolean G() {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.tw
    public final /* synthetic */ boolean N(zw zwVar) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.tw
    public final boolean y(zw zwVar, ArrayList arrayList, CharSequence charSequence, boolean z9, boolean z10, int i7, int i10, z91 z91Var) {
        int i11 = this.a;
        int i12 = this.e;
        String str = this.d;
        TLRPC.User user = this.c;
        LaunchActivity launchActivity = this.b;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.B1;
                long j3 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
                TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
                TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
                tL_inputMediaGame.id = tL_inputGameShortName;
                tL_inputGameShortName.short_name = str;
                tL_inputGameShortName.bot_id = org.telegram.messenger.qp.s1(i12).q1(user);
                org.telegram.messenger.gz.C(i12).p0(org.telegram.messenger.qp.s1(i12).j1(j3), tL_inputMediaGame, 0L, 0L);
                Bundle k10 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j3)) {
                    k10.putInt("enc_id", (int) (j3 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(j3)) {
                    k10.putLong("user_id", j3);
                } else {
                    k10.putLong("chat_id", -j3);
                }
                if (org.telegram.messenger.qp.s1(i12).E(k10, zwVar, null, null)) {
                    org.telegram.messenger.qs.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new cn(k10), true, false);
                    break;
                }
                break;
            default:
                String str3 = LaunchActivity.B1;
                long j10 = ((org.telegram.messenger.xr) arrayList.get(0)).a;
                Bundle k11 = a8.p0.k("scrollToTopOnResume", true);
                if (org.telegram.messenger.m5.C(j10)) {
                    k11.putInt("enc_id", (int) (j10 & 4294967295L));
                } else if (org.telegram.messenger.m5.E(j10)) {
                    k11.putLong("user_id", j10);
                } else {
                    k11.putLong("chat_id", -j10);
                }
                k11.putString("attach_bot", org.telegram.messenger.t10.n(user));
                if (str != null) {
                    k11.putString("attach_bot_start_command", str);
                }
                if (org.telegram.messenger.qp.s1(i12).E(k11, zwVar, null, null)) {
                    org.telegram.messenger.qs.f(i12).k(4, new Object[0]);
                    ((ActionBarLayout) launchActivity.M()).V(new cn(k11), true, false);
                    break;
                }
                break;
        }
        return true;
    }

    public /* synthetic */ a70(LaunchActivity launchActivity, TLRPC.User user, String str, int i7) {
        this.b = launchActivity;
        this.c = user;
        this.d = str;
        this.e = i7;
    }
}
