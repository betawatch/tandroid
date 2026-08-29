package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ x60 h;

    public /* synthetic */ i80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, x60 x60Var) {
        this.b = launchActivity;
        this.d = tLObject;
        this.e = i10;
        this.f = str;
        this.c = tL_error;
        this.h = x60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        x60 x60Var = this.h;
        String str = this.f;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.x1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity = this.b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.e).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity.p0(new tn(bundle));
                } else {
                    StringBuilder s10 = a4.w.s("cant import contact token. token=", str, " err=");
                    s10.append(tL_error == null ? null : tL_error.text);
                    FileLog.e(s10.toString());
                    org.telegram.messenger.x3.s(R.string.NoUsernameFound, org.telegram.ui.Components.tc.a0((org.telegram.ui.ActionBar.o2) j7.l1.i(1, launchActivity.Z)), null);
                }
                try {
                    x60Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.x1;
                LaunchActivity launchActivity2 = this.b;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            org.telegram.ui.Components.tc.a0(U).Q(R.raw.fire_on, 36, launchActivity2.getString(R.string.UniqueGiftNotFoundBurned)).j();
                        } else {
                            org.telegram.ui.Components.tc.a0(U).Q(R.raw.error, 36, launchActivity2.getString(R.string.UniqueGiftNotFound)).j();
                        }
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    MessagesController.getInstance(launchActivity2.K).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.K).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        jh.h5 h5Var = new jh.h5(launchActivity2, this.e, 0L, null, null);
                        h5Var.h2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 == null) {
                            h5Var.show();
                        } else if (U2.getLastStoryViewer() == null || !U2.getLastStoryViewer().G0) {
                            U2.showDialog(h5Var);
                        } else {
                            U2.getLastStoryViewer().showDialog(h5Var);
                        }
                    }
                }
                try {
                    x60Var.run();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                break;
        }
    }

    public /* synthetic */ i80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, x60 x60Var) {
        this.b = launchActivity;
        this.c = tL_error;
        this.d = tLObject;
        this.e = i10;
        this.f = str;
        this.h = x60Var;
    }
}
