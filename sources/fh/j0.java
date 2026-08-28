package fh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.rp0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class j0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ TL_stars.StarGift a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 c;

    public j0(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.b6 b6Var) {
        this.a = starGift;
        this.b = context;
        this.c = b6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        Context context = this.b;
        TL_stars.StarGift starGift = this.a;
        if (i9 != 3 && i9 != 2) {
            if (i9 == 4) {
                k0.T(context, starGift, this.c);
                return;
            }
            return;
        }
        String str = MessagesController.getInstance(UserConfig.selectedAccount).linkPrefix + "/auction/" + starGift.auction_slug;
        if (i9 == 3) {
            AndroidUtilities.addToClipboard(str);
        } else {
            rp0.N0(context, null, str, false, str).show();
        }
    }
}
