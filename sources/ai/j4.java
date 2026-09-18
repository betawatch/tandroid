package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.Components.vc;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class j4 extends iq0 {
    public final /* synthetic */ f6 b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(f6 f6Var, Context context, String str, String str2, boolean z10, x3 x3Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, x3Var);
        this.b1 = f6Var;
    }

    @Override // org.telegram.ui.Components.iq0
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            f6 f6Var = this.b1;
            vc vcVar = new vc(f6Var.c1, this.resourcesProvider);
            if (iVar.m() == 1) {
                long j3 = iVar.j(0);
                if (j3 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    org.telegram.ui.Components.oc G = vcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j3 < 0) {
                    org.telegram.ui.Components.oc G2 = vcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    org.telegram.ui.Components.oc G3 = vcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j3)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                org.telegram.ui.Components.oc Q = vcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", iVar.m(), Integer.valueOf(iVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                f6Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.iq0
    public final void S0(View view) {
        this.b1.e1();
    }

    @Override // org.telegram.ui.Components.iq0, org.telegram.ui.ActionBar.g3
    public final void dismissInternal() {
        super.dismissInternal();
        this.b1.Z2 = null;
    }
}
