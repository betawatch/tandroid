package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ n60 h;

    public /* synthetic */ q60(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, TLRPC.TL_error tL_error, n60 n60Var) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i7;
        this.e = str;
        this.f = tL_error;
        this.h = n60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.lc b02;
        int i7;
        int i10;
        int i11 = this.a;
        n60 n60Var = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str = this.e;
        TLObject tLObject = this.c;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            b02 = org.telegram.ui.Components.lc.b0(T);
                            i7 = R.raw.fire_on;
                            i10 = 2131743643;
                        } else {
                            b02 = org.telegram.ui.Components.lc.b0(T);
                            i7 = R.raw.error;
                            i10 = 2131743644;
                        }
                        org.telegram.messenger.f3.n(null, i10, b02, i7, 36);
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    org.telegram.messenger.mp.u1(launchActivity.P).f4(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.mp.u1(launchActivity.P).Z3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        di.f6 f6Var = new di.f6(launchActivity, this.d, 0L, null, null);
                        f6Var.u2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 == null) {
                            f6Var.show();
                        } else if (T2.getLastStoryViewer() == null || !T2.getLastStoryViewer().K0) {
                            T2.showDialog(f6Var);
                        } else {
                            T2.getLastStoryViewer().t(f6Var);
                        }
                    }
                }
                try {
                    n60Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                String str3 = LaunchActivity.C1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    org.telegram.messenger.mp.u1(this.d).e4(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.t0(new bn(bundle));
                } else {
                    StringBuilder u10 = a8.p0.u("cant import contact token. token=", str, " err=");
                    u10.append(tL_error == null ? null : tL_error.text);
                    org.telegram.messenger.a8.d(u10.toString());
                    org.telegram.messenger.f3.o(null, 2131747942, org.telegram.ui.Components.lc.b0((org.telegram.ui.ActionBar.h2) i5.c.h(1, launchActivity2.e0)), null);
                }
                try {
                    n60Var.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }

    public /* synthetic */ q60(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, String str, n60 n60Var) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i7;
        this.e = str;
        this.h = n60Var;
    }
}
