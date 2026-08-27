package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j80 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ a30 h;

    public /* synthetic */ j80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, a30 a30Var) {
        this.b = launchActivity;
        this.d = tLObject;
        this.e = i10;
        this.f = str;
        this.c = tL_error;
        this.h = a30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a30 a30Var = this.h;
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
                    launchActivity.p0(new rn(bundle));
                } else {
                    StringBuilder r10 = a9.p.r("cant import contact token. token=", str, " err=");
                    r10.append(tL_error == null ? null : tL_error.text);
                    FileLog.e(r10.toString());
                    org.telegram.messenger.y1.r(R.string.NoUsernameFound, org.telegram.ui.Components.mc.a0((org.telegram.ui.ActionBar.n2) i0.a.i(1, launchActivity.Z)), null);
                }
                try {
                    a30Var.run();
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            default:
                Pattern pattern2 = LaunchActivity.x1;
                LaunchActivity launchActivity2 = this.b;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            org.telegram.ui.Components.mc.a0(U).Q(R.raw.fire_on, 36, launchActivity2.getString(R.string.UniqueGiftNotFoundBurned)).j();
                        } else {
                            org.telegram.ui.Components.mc.a0(U).Q(R.raw.error, 36, launchActivity2.getString(R.string.UniqueGiftNotFound)).j();
                        }
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    MessagesController.getInstance(launchActivity2.K).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity2.K).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        hh.i5 i5Var = new hh.i5(launchActivity2, this.e, 0L, null, null);
                        i5Var.h2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 == null) {
                            i5Var.show();
                        } else if (U2.getLastStoryViewer() == null || !U2.getLastStoryViewer().G0) {
                            U2.showDialog(i5Var);
                        } else {
                            U2.getLastStoryViewer().showDialog(i5Var);
                        }
                    }
                }
                try {
                    a30Var.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                break;
        }
    }

    public /* synthetic */ j80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, a30 a30Var) {
        this.b = launchActivity;
        this.c = tL_error;
        this.d = tLObject;
        this.e = i10;
        this.f = str;
        this.h = a30Var;
    }
}
