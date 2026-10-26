package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.wc;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d3 extends mr0 {
    public final /* synthetic */ q4 a1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(q4 q4Var, Context context, String str, String str2, boolean z10, s2 s2Var) {
        super(context, null, null, str, null, false, str2, null, false, false, z10, null, s2Var);
        this.a1 = q4Var;
    }

    @Override // org.telegram.ui.Components.mr0
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            q4 q4Var = this.a1;
            wc wcVar = new wc(q4Var.R0, this.resourcesProvider);
            if (hVar.m() == 1) {
                long j10 = hVar.j(0);
                if (j10 == UserConfig.getInstance(this.currentAccount).clientUserId) {
                    qc G = wcVar.G(R.raw.saved_messages, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedToSavedMessages, new Object[0])));
                    G.s = false;
                    G.j();
                } else if (j10 < 0) {
                    qc G2 = wcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, tL_forumTopic != null ? tL_forumTopic.title : MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10)).title)));
                    G2.s = false;
                    G2.j();
                } else {
                    qc G3 = wcVar.G(R.raw.forward, 5000, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StorySharedTo, MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10)).first_name)));
                    G3.s = false;
                    G3.j();
                }
            } else {
                qc R = wcVar.R(R.raw.forward, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StorySharedToManyChats", hVar.m(), Integer.valueOf(hVar.m()))));
                R.s = false;
                R.j();
            }
            try {
                q4Var.performHapticFeedback(3);
            } catch (Exception unused) {
            }
        }
    }

    @Override // org.telegram.ui.Components.mr0
    public final void U0(View view) {
        this.a1.c1();
    }

    @Override // org.telegram.ui.Components.mr0, org.telegram.ui.ActionBar.k3
    public final void dismissInternal() {
        super.dismissInternal();
        this.a1.O2 = null;
    }
}
