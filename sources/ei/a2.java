package ei;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.u9;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public abstract class a2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, final int i10, final long j3, final long j10, TL_bots.botVerifierSettings botverifiersettings, final v1 v1Var) {
        String str;
        TLRPC.Chat chat;
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
        FrameLayout frameLayout = new FrameLayout(activity);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(j6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), j6.w0(null, j6.ci, false)));
        u9 u9Var = new u9(activity);
        u9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        f9 f9Var = new f9((f6) null);
        f9Var.p(chat);
        u9Var.e(chat, f9Var);
        frameLayout2.addView(u9Var, x5.e(28, 28, 51));
        u9 u9Var2 = new u9(activity);
        u9Var2.setEmojiColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.z9, false), PorterDuff.Mode.SRC_IN));
        u9Var2.setAnimatedEmojiDrawable(o5.n(i10, botverifiersettings.icon, null, 3));
        frameLayout2.addView(u9Var2, x5.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        k5 k5Var = new k5(activity);
        k5Var.setTextColor(j6.w0(null, j6.j5, false));
        k5Var.setTextSize(13);
        k5Var.setEllipsizeByGradient(true);
        k5Var.l(str, false);
        k5Var.setWidthWrapContent(true);
        frameLayout2.addView(k5Var, x5.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, x5.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        alertDialog$Builder.a.T = LocaleController.getString(j10 >= 0 ? R.string.BotRemoveVerificationText : R.string.BotRemoveVerificationChatText);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: ei.y1
            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i11) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i12 = i10;
                setcustomverification.bot = MessagesController.getInstance(i12).getInputUser(j3);
                setcustomverification.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                ConnectionsManager.getInstance(i12).sendRequest(setcustomverification, new ai.v1(8, zArr2, v1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }
}
