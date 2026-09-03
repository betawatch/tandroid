package kh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.lq0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ f6 c;

    public e0(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        this.a = starGift;
        this.b = context;
        this.c = f6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i10 != 3 && i10 != 2) {
            if (i10 == 4) {
                f0.U(context, starGift, this.c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i10 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            lq0.N0(context, null, str, false, str).show();
        }
    }
}
