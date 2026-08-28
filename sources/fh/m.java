package fh;

import android.text.TextUtils;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(Object obj, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = j10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        int i9 = this.a;
        long j10 = this.b;
        Object obj3 = this.c;
        switch (i9) {
            case 0:
                x.R((x) obj3, j10, (Boolean) obj, (String) obj2);
                break;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error == null) {
                    nh.r0.d(o2Var, -j10, 1);
                    break;
                } else if (!TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                    oc.a0(o2Var).d0(tL_error, false);
                    break;
                } else {
                    nh.r0.d(o2Var, -j10, 2);
                    break;
                }
            case 2:
                ((GiftAuctionController) obj3).lambda$subscribeToGiftAuctionStateInternal$1(j10, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l10 = (Long) obj2;
                Pattern pattern = LaunchActivity.x1;
                if ("paid".equals((String) obj) && l10.longValue() != 0) {
                    AndroidUtilities.runOnUIThread(new e5.w(launchActivity, l10, this.b, 29));
                    break;
                }
                break;
        }
    }
}
