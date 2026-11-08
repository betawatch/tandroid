package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ q10 h;

    public /* synthetic */ q60(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, TLRPC.TL_error tL_error, q10 q10Var) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i7;
        this.e = str;
        this.f = tL_error;
        this.h = q10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.hc a02;
        int i7;
        int i10;
        int i11 = this.a;
        q10 q10Var = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str = this.e;
        TLObject tLObject = this.c;
        switch (i11) {
            case 0:
                String str2 = LaunchActivity.B1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.hc.a0(T);
                            i7 = R.raw.fire_on;
                            i10 = 2131743883;
                        } else {
                            a02 = org.telegram.ui.Components.hc.a0(T);
                            i7 = R.raw.error;
                            i10 = 2131743884;
                        }
                        org.telegram.messenger.k5.o(null, i10, a02, i7, 36);
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    org.telegram.messenger.qp.s1(launchActivity.O).Y3(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.qp.s1(launchActivity.O).S3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        bi.k7 k7Var = new bi.k7(launchActivity, this.d, 0L, null, null);
                        k7Var.h2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 == null) {
                            k7Var.show();
                        } else if (T2.getLastStoryViewer() == null || !T2.getLastStoryViewer().J0) {
                            T2.showDialog(k7Var);
                        } else {
                            T2.getLastStoryViewer().t(k7Var);
                        }
                    }
                }
                try {
                    q10Var.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                String str3 = LaunchActivity.B1;
                boolean z9 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.b;
                if (z9) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    org.telegram.messenger.qp.s1(this.d).X3(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.t0(new an(bundle));
                } else {
                    StringBuilder u10 = a8.p0.u("cant import contact token. token=", str, " err=");
                    u10.append(tL_error == null ? null : tL_error.text);
                    org.telegram.messenger.a8.d(u10.toString());
                    org.telegram.messenger.k5.p(null, 2131748135, org.telegram.ui.Components.hc.a0((org.telegram.ui.ActionBar.f2) jg.g.i(1, launchActivity2.d0)), null);
                }
                try {
                    q10Var.run();
                    break;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
        }
    }

    public /* synthetic */ q60(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i7, String str, q10 q10Var) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i7;
        this.e = str;
        this.h = q10Var;
    }
}
