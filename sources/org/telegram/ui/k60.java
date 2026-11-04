package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k60 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ ly h;

    public /* synthetic */ k60(LaunchActivity launchActivity, TLObject tLObject, int i3, String str, TLRPC.TL_error tL_error, ly lyVar) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i3;
        this.e = str;
        this.f = tL_error;
        this.h = lyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.fc a02;
        int i3;
        int i10;
        int i11 = this.a;
        ly lyVar = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str = this.e;
        TLObject tLObject = this.c;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.E1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.fc.a0(T);
                            i3 = R.raw.fire_on;
                            i10 = 2131743890;
                        } else {
                            a02 = org.telegram.ui.Components.fc.a0(T);
                            i3 = R.raw.error;
                            i10 = 2131743891;
                        }
                        org.telegram.messenger.k5.o(null, i10, a02, i3, 36);
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    org.telegram.messenger.hp.s1(launchActivity.P).Y3(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.hp.s1(launchActivity.P).S3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        ci.l6 l6Var = new ci.l6(launchActivity, this.d, 0L, null, null);
                        l6Var.h2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 == null) {
                            l6Var.show();
                        } else if (T2.getLastStoryViewer() == null || !T2.getLastStoryViewer().L0) {
                            T2.showDialog(l6Var);
                        } else {
                            T2.getLastStoryViewer().t(l6Var);
                        }
                    }
                }
                try {
                    lyVar.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                String str3 = LaunchActivity.E1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    org.telegram.messenger.hp.s1(this.d).X3(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.t0(new wm(bundle));
                } else {
                    StringBuilder u10 = a1.g.u("cant import contact token. token=", str, " err=");
                    u10.append(tL_error == null ? null : tL_error.text);
                    org.telegram.messenger.a8.d(u10.toString());
                    org.telegram.messenger.k5.p(null, 2131748142, org.telegram.ui.Components.fc.a0((org.telegram.ui.ActionBar.d2) k2.p1.h(1, launchActivity2.e0)), null);
                }
                try {
                    lyVar.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }

    public /* synthetic */ k60(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i3, String str, ly lyVar) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i3;
        this.e = str;
        this.h = lyVar;
    }
}
