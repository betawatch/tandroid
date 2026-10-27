package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n80 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ kz h;

    public /* synthetic */ n80(LaunchActivity launchActivity, TLObject tLObject, int i10, String str, TLRPC.TL_error tL_error, kz kzVar) {
        this.b = launchActivity;
        this.c = tLObject;
        this.d = i10;
        this.e = str;
        this.f = tL_error;
        this.h = kzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.wc b02;
        int i10;
        int i11;
        int i12 = this.a;
        kz kzVar = this.h;
        TLRPC.TL_error tL_error = this.f;
        String str = this.e;
        TLObject tLObject = this.c;
        switch (i12) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (tL_error != null) {
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                            b02 = org.telegram.ui.Components.wc.b0(U);
                            i10 = R.raw.fire_on;
                            i11 = R.string.UniqueGiftNotFoundBurned;
                        } else {
                            b02 = org.telegram.ui.Components.wc.b0(U);
                            i10 = R.raw.error;
                            i11 = R.string.UniqueGiftNotFound;
                        }
                        org.telegram.messenger.t.q(i11, b02, i10, 36);
                    }
                } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    LaunchActivity launchActivity = this.b;
                    MessagesController.getInstance(launchActivity.O).putUsers(tL_payments_uniqueStarGift.users, false);
                    MessagesController.getInstance(launchActivity.O).putChats(tL_payments_uniqueStarGift.chats, false);
                    org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        bi.h7 h7Var = new bi.h7(launchActivity, this.d, 0L, null, null);
                        h7Var.J2(str, (TL_stars.TL_starGiftUnique) starGift, null);
                        if (U2 == null) {
                            h7Var.show();
                        } else if (U2.getLastStoryViewer() == null || !U2.getLastStoryViewer().K0) {
                            U2.showDialog(h7Var);
                        } else {
                            U2.getLastStoryViewer().showDialog(h7Var);
                        }
                    }
                }
                try {
                    kzVar.run();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                boolean z10 = tLObject instanceof TLRPC.User;
                LaunchActivity launchActivity2 = this.b;
                if (z10) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    MessagesController.getInstance(this.d).putUser(user, false);
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    launchActivity2.u0(new wn(bundle));
                } else {
                    StringBuilder v = a1.g.v("cant import contact token. token=", str, " err=");
                    v.append(tL_error == null ? null : tL_error.text);
                    FileLog.e(v.toString());
                    org.telegram.messenger.wh.n(R.string.NoUsernameFound, org.telegram.ui.Components.wc.b0((org.telegram.ui.ActionBar.r2) ic.a.g(1, launchActivity2.d0)), null);
                }
                try {
                    kzVar.run();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
        }
    }

    public /* synthetic */ n80(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i10, String str, kz kzVar) {
        this.b = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i10;
        this.e = str;
        this.h = kzVar;
    }
}
