package hi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public abstract class c2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, final int i10, final long j10, final long j11, TL_bots.BotVerifierSettings botVerifierSettings, final y1 y1Var) {
        String str;
        TLRPC.Chat chat;
        if (j11 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j11));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i10).getChat(Long.valueOf(-j11));
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
        int dp = AndroidUtilities.dp(28.0f);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i11 = y6.ci;
        ShapeDrawable d02 = y6.d0(dp, dp2, y6.x0(null, i11, false));
        b7 N = f7.N(i11);
        frameLayout2.setBackground(d02);
        f7.k(frameLayout2, d02, N, null, null);
        y9 y9Var = new y9(activity);
        y9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        j9 j9Var = new j9((u6) null);
        j9Var.p(chat);
        y9Var.f(chat, j9Var);
        frameLayout2.addView(y9Var, gb1.i(28, 28, 51));
        y9 y9Var2 = new y9(activity);
        y9Var2.setEmojiColorFilter(new PorterDuffColorFilter(y6.x0(null, y6.z9, false), PorterDuff.Mode.SRC_IN));
        y9Var2.setAnimatedEmojiDrawable(t5.n(i10, botVerifierSettings.icon, null, 3));
        frameLayout2.addView(y9Var2, gb1.h(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        b6 b6Var = new b6(activity);
        f7.Y(b6Var, y6.j5, null);
        b6Var.setTextSize(13);
        b6Var.setEllipsizeByGradient(true);
        b6Var.l(str, false);
        b6Var.setWidthWrapContent(true);
        frameLayout2.addView(b6Var, gb1.h(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, gb1.h(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        alertDialog$Builder.a.T = LocaleController.getString(j11 >= 0 ? R.string.BotRemoveVerificationText : R.string.BotRemoveVerificationChatText);
        alertDialog$Builder.o(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: hi.a2
            @Override // org.telegram.ui.ActionBar.b2
            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i12) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i13 = i10;
                setcustomverification.bot = MessagesController.getInstance(i13).getInputUser(j10);
                setcustomverification.peer = MessagesController.getInstance(i13).getInputPeer(j11);
                ConnectionsManager.getInstance(i13).sendRequest(setcustomverification, new bi.j(16, zArr2, y1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.p();
    }
}
