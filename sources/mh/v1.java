package mh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import g7.e6;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public abstract class v1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, final int i9, final long j10, final long j11, TL_bots.botVerifierSettings botverifiersettings, final r1 r1Var) {
        String str;
        TLRPC.Chat chat;
        if (j11 >= 0) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(j11));
            str = UserObject.getForcedFirstName(user);
            chat = user;
        } else {
            TLRPC.Chat chat2 = MessagesController.getInstance(i9).getChat(Long.valueOf(-j11));
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
        frameLayout2.setBackground(f6.c0(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), f6.w0(null, f6.ci, false)));
        o9 o9Var = new o9(activity);
        o9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        z8 z8Var = new z8((b6) null);
        z8Var.p(chat);
        o9Var.e(chat, z8Var);
        frameLayout2.addView(o9Var, e6.e(28, 28, 51));
        o9 o9Var2 = new o9(activity);
        o9Var2.setEmojiColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.z9, false), PorterDuff.Mode.SRC_IN));
        o9Var2.setAnimatedEmojiDrawable(k5.n(i9, botverifiersettings.icon, null, 3));
        frameLayout2.addView(o9Var2, e6.d(20, 20.0f, 19, 34.0f, 0.0f, 0.0f, 0.0f));
        h5 h5Var = new h5(activity);
        h5Var.setTextColor(f6.w0(null, f6.j5, false));
        h5Var.setTextSize(13);
        h5Var.setEllipsizeByGradient(true);
        h5Var.l(str, false);
        h5Var.setWidthWrapContent(true);
        frameLayout2.addView(h5Var, e6.d(-2, -2.0f, 19, 57.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(frameLayout2, e6.d(-2, -2.0f, 17, 16.0f, 0.0f, 16.0f, 0.0f));
        final boolean[] zArr = new boolean[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity);
        alertDialog$Builder.a.N = LocaleController.getString(R.string.BotRemoveVerificationTitle);
        alertDialog$Builder.a.P = LocaleController.getString(j11 >= 0 ? R.string.BotRemoveVerificationText : R.string.BotRemoveVerificationChatText);
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new org.telegram.ui.ActionBar.b2() { // from class: mh.t1
            @Override // org.telegram.ui.ActionBar.b2
            public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                boolean[] zArr2 = zArr;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                setcustomverification.enabled = false;
                setcustomverification.flags |= 1;
                int i11 = i9;
                setcustomverification.bot = MessagesController.getInstance(i11).getInputUser(j10);
                setcustomverification.peer = MessagesController.getInstance(i11).getInputPeer(j11);
                ConnectionsManager.getInstance(i11).sendRequest(setcustomverification, new bg.j0(18, zArr2, r1Var));
            }
        });
        alertDialog$Builder.d(-1);
        alertDialog$Builder.o();
    }
}
