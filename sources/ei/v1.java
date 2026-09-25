package ei;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qy;
import org.telegram.ui.wf1;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Utilities.Callback {
    public final /* synthetic */ wf1 a;
    public final /* synthetic */ qy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ v1(wf1 wf1Var, qy qyVar, long j3, int i10) {
        this.a = wf1Var;
        this.b = qyVar;
        this.c = j3;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        wf1 wf1Var = this.a;
        qy qyVar = this.b;
        if (wf1Var != null) {
            wf1Var.finishFragment();
            qyVar.removeSelfFromStack();
        } else {
            qyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j3 = this.c;
        int i10 = this.d;
        if (j3 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j3));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j3));
            if (chat2 == null) {
                str = "";
                chat = chat2;
            } else {
                str = chat2.title;
                chat = chat2;
            }
        }
        xc a02 = xc.a0(U);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(bool.booleanValue() ? R.string.BotSentRevokeVerifyRequest : R.string.BotSentVerifyRequest, str));
        a02.getClass();
        a02.V(Arrays.asList(chat), replaceTags, null, null).k(false);
    }
}
