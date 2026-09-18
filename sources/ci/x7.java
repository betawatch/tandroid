package ci;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8 b;

    public /* synthetic */ x7(g8 g8Var, int i10) {
        this.a = i10;
        this.b = g8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                l61 l61Var = (l61) obj2;
                g8 g8Var = this.b;
                MessagesController.SavedMusicList savedMusicList = g8Var.e0;
                l61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(x51.C(AndroidUtilities.dp(64.0f)));
                if (g8Var.Z || g8Var.h0) {
                    dp += g8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), g8Var.b0, false, false, -1);
                }
                if (!g8Var.Z) {
                    if (TextUtils.isEmpty(g8Var.s0) && !g8Var.h0) {
                        l61Var.U();
                        x51 c10 = x51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.q = true;
                        arrayList.add(c10);
                        l61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!g8Var.h0 && savedMusicList != null) {
                        dp += g8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + g8Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), g8Var.c0, g8Var.w0 || g8Var.v0, g8Var.u0, 3) + g8Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), g8Var.d0, g8Var.D0 || g8Var.C0, g8Var.B0, 4);
                }
                if (arrayList.size() <= ((g8Var.Z || !TextUtils.isEmpty(g8Var.s0) || g8Var.h0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(g8Var.s0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = ej.a;
                        x51 J = x51.J(ej.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(g8Var.s0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, g8Var.s0));
                        int i11 = ej.a;
                        x51 J2 = x51.J(ej.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(x51.B(null));
                arrayList.add(x51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                g8.Q(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
