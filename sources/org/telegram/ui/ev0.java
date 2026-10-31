package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ ev0(ProfileActivity profileActivity, TLRPC.User user, int i10) {
        this.a = i10;
        this.b = profileActivity;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                TLRPC.User user = this.c;
                RectF rectF = ProfileActivity.R6;
                profileActivity.getClass();
                profileActivity.presentFragment(un.ha(user.id));
                break;
            case 1:
                ProfileActivity profileActivity2 = this.b;
                TLRPC.User user2 = this.c;
                RectF rectF2 = ProfileActivity.R6;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.u2;
                    org.telegram.ui.Components.voip.m1.m(user2, false, userFull != null && userFull.video_calls_available, profileActivity2.getParentActivity(), profileActivity2.u2, profileActivity2.getAccountInstance());
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity3 = this.b;
                TLRPC.User user3 = this.c;
                RectF rectF3 = ProfileActivity.R6;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.u2;
                    org.telegram.ui.Components.voip.m1.m(user3, true, userFull2 != null && userFull2.video_calls_available, profileActivity3.getParentActivity(), profileActivity3.u2, profileActivity3.getAccountInstance());
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity4 = this.b;
                TLRPC.User user4 = this.c;
                RectF rectF4 = ProfileActivity.R6;
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(TLObject.FLAG_28);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.b;
                TLRPC.User user5 = this.c;
                RectF rectF5 = ProfileActivity.R6;
                try {
                    ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (org.telegram.messenger.i0.H3()) {
                        org.telegram.ui.Components.cc.a0(profileActivity5).i(org.telegram.messenger.cd.L0(2131747311, null)).j();
                        break;
                    }
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                break;
        }
    }
}
