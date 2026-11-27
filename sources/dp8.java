// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class dp8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ProfileActivity b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ dp8(ProfileActivity profileActivity, TLRPC.User user, byte b) {
        this.a = b;
        this.b = profileActivity;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                TLRPC.User user = this.c;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.presentFragment(zu1.ha(user.id));
                break;
            case 1:
                ProfileActivity profileActivity2 = this.b;
                TLRPC.User user2 = this.c;
                RectF rectF2 = ProfileActivity.Z6;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.w2;
                    xkc.m(user2, false, userFull != null && userFull.video_calls_available, profileActivity2.getParentActivity(), profileActivity2.w2, profileActivity2.getAccountInstance());
                    break;
                }
                break;
            case 2:
                ProfileActivity profileActivity3 = this.b;
                TLRPC.User user3 = this.c;
                RectF rectF3 = ProfileActivity.Z6;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.w2;
                    xkc.m(user3, true, userFull2 != null && userFull2.video_calls_available, profileActivity3.getParentActivity(), profileActivity3.w2, profileActivity3.getAccountInstance());
                    break;
                }
                break;
            case 3:
                ProfileActivity profileActivity4 = this.b;
                TLRPC.User user4 = this.c;
                RectF rectF4 = ProfileActivity.Z6;
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(TLObject.FLAG_28);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.b;
                TLRPC.User user5 = this.c;
                RectF rectF5 = ProfileActivity.Z6;
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (hl.C3()) {
                        d31.b0(profileActivity5).i(ob6.M0(2131747022, null)).j();
                        break;
                    }
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
                break;
        }
    }
}
