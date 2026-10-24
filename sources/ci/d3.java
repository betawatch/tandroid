package ci;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class d3 extends ir0 {
    public final /* synthetic */ p4 e1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(p4 p4Var, Context context, String str, String str2, boolean z10, s2 s2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, s2Var);
        this.e1 = p4Var;
    }

    @Override // org.telegram.ui.Components.ir0
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            p4 p4Var = this.e1;
            xc xcVar = new xc(p4Var.c1, this.resourcesProvider);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    qc G = xcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                    G.r = false;
                    G.j();
                } else if (j10 < 0) {
                    qc G2 = xcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)).title)));
                    G2.r = false;
                    G2.j();
                } else {
                    qc G3 = xcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.r = false;
                    G3.j();
                }
            } else {
                qc Q = xcVar.Q(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                Q.r = false;
                Q.j();
            }
            try {
                p4Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.ir0
    public final void X0(View view) {
        this.e1.d1();
    }

    @Override // org.telegram.ui.Components.ir0, org.telegram.ui.ActionBar.h3
    public final void dismissInternal() {
        super.dismissInternal();
        this.e1.Z2 = null;
    }
}
