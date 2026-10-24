package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n80 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ f80 h;

    public /* synthetic */ n80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, f80 f80Var) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i10;
        this.e = str;
        this.f = tL_error;
        this.h = f80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.xc a02;
        int i10;
        int i11;
        int i12 = this.a;
        f80 f80Var = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str = this.e;
        TLObject tLObject = this.c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.E1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            a02 = org.telegram.ui.Components.xc.a0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            a02 = org.telegram.ui.Components.xc.a0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.v0.p(i11, a02, i10, 36);
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    MessagesController.getInstance(launchActivity.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        ai.l7 l7Var = new ai.l7(launchActivity, this.d, 0L, null, null);
                        l7Var.J2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 == null) {
                            l7Var.show();
                        } else if (U2.getLastStoryViewer() == null || !U2.getLastStoryViewer().K0) {
                            U2.showDialog(l7Var);
                        } else {
                            U2.getLastStoryViewer().showDialog(l7Var);
                        }
                    }
                }
                try {
                    f80Var.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.E1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.d).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.u0(new sn(bundle));
                } else {
                    StringBuilder v = a1.g.v("cant import contact token. token=", str, " err=");
                    v.append(tL_error == null ? null : tL_error.text);
                    FileLog.e(v.toString());
                    org.telegram.messenger.sl.q(R.string.NoUsernameFound, org.telegram.ui.Components.xc.a0((org.telegram.ui.ActionBar.o2) i2.o1.i(1, launchActivity2.d0)), null);
                }
                try {
                    f80Var.run();
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
        }
    }

    public /* synthetic */ n80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, f80 f80Var) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i10;
        this.e = str;
        this.h = f80Var;
    }
}
