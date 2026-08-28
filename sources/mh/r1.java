package mh;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;
import org.telegram.ui.we1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Utilities.Callback {
    public final /* synthetic */ we1 a;
    public final /* synthetic */ dy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ r1(we1 we1Var, dy dyVar, long j10, int i9) {
        this.a = we1Var;
        this.b = dyVar;
        this.c = j10;
        this.d = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        we1 we1Var = this.a;
        dy dyVar = this.b;
        if (we1Var != null) {
            we1Var.finishFragment();
            dyVar.removeSelfFromStack();
        } else {
            dyVar.finishFragment();
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        long j10 = this.c;
        int i9 = this.d;
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            if (chat2 == null) {
                str = "";
                chat = chat2;
            } else {
                str = chat2.title;
                chat = chat2;
            }
        }
        oc a02 = oc.a0(U);
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(bool.booleanValue() ? R.string.BotSentRevokeVerifyRequest : R.string.BotSentVerifyRequest, str));
        a02.getClass();
        a02.V(Arrays.asList(chat), replaceTags, null, null).k(false);
    }
}
