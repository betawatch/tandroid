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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.w61;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ u7(c8 c8Var, int i10) {
        this.a = i10;
        this.b = c8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                w61 w61Var = (w61) obj2;
                c8 c8Var = this.b;
                MessagesController.SavedMusicList savedMusicList = c8Var.e0;
                w61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(h61.D(AndroidUtilities.dp(64.0f)));
                if (c8Var.Z || c8Var.h0) {
                    dp += c8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), c8Var.b0, false, false, -1);
                }
                if (!c8Var.Z) {
                    if (TextUtils.isEmpty(c8Var.q0) && !c8Var.h0) {
                        w61Var.U();
                        h61 c10 = h61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.q = true;
                        arrayList.add(c10);
                        w61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!c8Var.h0 && savedMusicList != null) {
                        dp += c8Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + c8Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), c8Var.c0, c8Var.u0 || c8Var.t0, c8Var.s0, 3) + c8Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), c8Var.d0, c8Var.B0 || c8Var.A0, c8Var.z0, 4);
                }
                if (arrayList.size() <= ((c8Var.Z || !TextUtils.isEmpty(c8Var.q0) || c8Var.h0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(c8Var.q0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = hj.a;
                        h61 K = h61.K(hj.class);
                        K.l = string;
                        K.m = string2;
                        arrayList.add(K);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(c8Var.q0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, c8Var.q0));
                        int i11 = hj.a;
                        h61 K2 = h61.K(hj.class);
                        K2.l = string3;
                        K2.m = replaceTags;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(h61.C(null));
                arrayList.add(h61.D(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                c8.P(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
