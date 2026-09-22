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
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg1;
import org.telegram.ui.uy;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements Utilities.Callback {
    public final /* synthetic */ eg1 a;
    public final /* synthetic */ uy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ v1(eg1 eg1Var, uy uyVar, long j3, int i10) {
        this.a = eg1Var;
        this.b = uyVar;
        this.c = j3;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        eg1 eg1Var = this.a;
        uy uyVar = this.b;
        if (eg1Var != null) {
            eg1Var.finishFragment();
            uyVar.removeSelfFromStack();
        } else {
            uyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
        vc a02 = vc.a0(U);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(bool.booleanValue() ? R.string.BotSentRevokeVerifyRequest : R.string.BotSentVerifyRequest, str));
        a02.getClass();
        a02.V(Arrays.asList(chat), replaceTags, null, null).k(false);
    }
}
