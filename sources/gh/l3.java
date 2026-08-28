package gh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.rp0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class l3 extends rp0 {
    public final /* synthetic */ k5 X0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(k5 k5Var, Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, null, str, null, false, str2, null, false, false, true, null, b6Var);
        this.X0 = k5Var;
        this.W = true;
    }

    @Override // org.telegram.ui.Components.rp0
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        oc bulletinFactory;
        if (z10 && (bulletinFactory = getBulletinFactory()) != null) {
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    gc G = bulletinFactory.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedToSavedMessages, new Object[0])));
                    G.r = false;
                    G.t = true;
                    G.j();
                } else if (j10 < 0) {
                    gc G2 = bulletinFactory.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.t = true;
                    G2.j();
                } else {
                    gc G3 = bulletinFactory.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LinkSharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.t = true;
                    G3.j();
                }
            } else {
                gc Q = bulletinFactory.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("LinkSharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.t = true;
                Q.j();
            }
            try {
                this.container.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.rp0
    public final void S0(View view) {
        k5.k1(this.X0, view);
    }
}
