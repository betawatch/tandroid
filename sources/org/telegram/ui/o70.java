package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o70 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ f70 h;

    public /* synthetic */ o70(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, f70 f70Var) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i10;
        this.e = str;
        this.f = tL_error;
        this.h = f70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i10;
        int i11;
        int i12 = this.a;
        f70 f70Var = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str = this.e;
        TLObject tLObject = this.c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.cc.a0(T);
                            i10 = R.raw.fire_on;
                            i11 = 2131743905;
                        } else {
                            a02 = org.telegram.ui.Components.cc.a0(T);
                            i10 = R.raw.error;
                            i11 = 2131743906;
                        }
                        org.telegram.messenger.m5.n(null, i11, a02, i10, 36);
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    org.telegram.messenger.vp.r1(launchActivity.O).V3(tL_payments_uniqueStarGift.users, false);
                    org.telegram.messenger.vp.r1(launchActivity.O).P3(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        rh.e4 e4Var = new rh.e4(launchActivity, this.d, 0L, null, null);
                        e4Var.h2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (T2 == null) {
                            e4Var.show();
                        } else if (T2.getLastStoryViewer() == null || !T2.getLastStoryViewer().K0) {
                            T2.showDialog(e4Var);
                        } else {
                            T2.getLastStoryViewer().t(e4Var);
                        }
                    }
                }
                try {
                    f70Var.run();
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    org.telegram.messenger.vp.r1(this.d).U3(user, false, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.t0(new un(bundle));
                } else {
                    StringBuilder u10 = a1.g.u("cant import contact token. token=", str, " err=");
                    u10.append(tL_error == null ? null : tL_error.text);
                    org.telegram.messenger.f8.d(u10.toString());
                    org.telegram.messenger.m5.o(null, 2131748150, org.telegram.ui.Components.cc.a0((org.telegram.ui.ActionBar.k2) i0.a.g(1, launchActivity2.d0)), null);
                }
                try {
                    f70Var.run();
                    break;
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
        }
    }

    public /* synthetic */ o70(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, f70 f70Var) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i10;
        this.e = str;
        this.h = f70Var;
    }
}
