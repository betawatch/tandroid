package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o60 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ g50 h;

    public /* synthetic */ o60(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, TLRPC.TL_error tL_error, g50 g50Var) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i7;
        this.e = str;
        this.f = tL_error;
        this.h = g50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i7;
        int i10;
        int i11 = this.a;
        g50 g50Var = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str = this.e;
        TLObject tLObject = this.c;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.C1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.cc.a0(T);
                            i7 = R.raw.fire_on;
                            i10 = 2131743880;
                        } else {
                            a02 = org.telegram.ui.Components.cc.a0(T);
                            i7 = R.raw.error;
                            i10 = 2131743881;
                        }
                        org.telegram.messenger.k5.n(null, i10, a02, i7, 36);
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    org.telegram.messenger.np.s1(launchActivity.P).Y3(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.np.s1(launchActivity.P).S3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        di.c6 c6Var = new di.c6(launchActivity, this.d, 0L, null, null);
                        c6Var.i2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 == null) {
                            c6Var.show();
                        } else if (T2.getLastStoryViewer() == null || !T2.getLastStoryViewer().K0) {
                            T2.showDialog(c6Var);
                        } else {
                            T2.getLastStoryViewer().t(c6Var);
                        }
                    }
                }
                try {
                    g50Var.run();
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
                    org.telegram.messenger.np.s1(this.d).X3(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.t0(new an(bundle));
                } else {
                    StringBuilder u10 = a8.p0.u("cant import contact token. token=", str, " err=");
                    u10.append(tL_error == null ? null : tL_error.text);
                    org.telegram.messenger.a8.d(u10.toString());
                    org.telegram.messenger.k5.o(null, 2131748134, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.e2) i5.c.h(1, launchActivity2.e0)), null);
                }
                try {
                    g50Var.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }

    public /* synthetic */ o60(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, String str, g50 g50Var) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i7;
        this.e = str;
        this.h = g50Var;
    }
}
