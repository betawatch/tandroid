package hi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cf1;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements Utilities.Callback {
    public final /* synthetic */ cf1 a;
    public final /* synthetic */ ey b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ y1(cf1 cf1Var, ey eyVar, long j10, int i10) {
        this.a = cf1Var;
        this.b = eyVar;
        this.c = j10;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        cf1 cf1Var = this.a;
        ey eyVar = this.b;
        if (cf1Var != null) {
            cf1Var.finishFragment();
            eyVar.removeSelfFromStack();
        } else {
            eyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j10 = this.c;
        int i10 = this.d;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            if (chat2 == null) {
                str = "";
                chat = chat2;
            } else {
                str = chat2.title;
                chat = chat2;
            }
        }
        wc b02 = wc.b0(U);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(bool.booleanValue() ? R.string.BotSentRevokeVerifyRequest : R.string.BotSentVerifyRequest, str));
        b02.getClass();
        b02.W(Arrays.asList(chat), replaceTags, null, null).k(false);
    }
}
