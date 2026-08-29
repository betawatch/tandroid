package nh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z6 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g7 b;

    public /* synthetic */ z6(g7 g7Var, int i10) {
        this.a = i10;
        this.b = g7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k51 k51Var = (k51) obj2;
                g7 g7Var = this.b;
                MessagesController.SavedMusicList savedMusicList = g7Var.a0;
                k51Var.A = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(w41.C(AndroidUtilities.dp(64.0f)));
                if (g7Var.V || g7Var.d0) {
                    dp += g7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), g7Var.X, false, false, -1);
                }
                if (!g7Var.V) {
                    if (TextUtils.isEmpty(g7Var.o0) && !g7Var.d0) {
                        k51Var.U();
                        w41 c3 = w41.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c3.q = true;
                        arrayList.add(c3);
                        k51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!g7Var.d0 && savedMusicList != null) {
                        dp += g7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + g7Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), g7Var.Y, g7Var.s0 || g7Var.r0, g7Var.q0, 3) + g7Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), g7Var.Z, g7Var.z0 || g7Var.y0, g7Var.x0, 4);
                }
                if (arrayList.size() <= ((g7Var.V || !TextUtils.isEmpty(g7Var.o0) || g7Var.d0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(g7Var.o0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = wi.a;
                        w41 J = w41.J(wi.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(g7Var.o0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, g7Var.o0));
                        int i11 = wi.a;
                        w41 J2 = w41.J(wi.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(w41.B(null));
                arrayList.add(w41.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()))));
                break;
            default:
                g7.P(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
