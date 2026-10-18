package ei;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ k7(s7 s7Var, int i10) {
        this.a = i10;
        this.b = s7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                s61 s61Var = (s61) obj2;
                s7 s7Var = this.b;
                MessagesController.SavedMusicList savedMusicList = s7Var.e0;
                s61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(f61.C(AndroidUtilities.dp(64.0f)));
                if (s7Var.Z || s7Var.h0) {
                    dp += s7Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), s7Var.b0, false, false, -1);
                }
                if (!s7Var.Z) {
                    if (TextUtils.isEmpty(s7Var.s0) && !s7Var.h0) {
                        s61Var.U();
                        f61 c10 = f61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.q = true;
                        arrayList.add(c10);
                        s61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!s7Var.h0 && savedMusicList != null) {
                        dp += s7Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + s7Var.X(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), s7Var.c0, s7Var.w0 || s7Var.v0, s7Var.u0, 3) + s7Var.X(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), s7Var.d0, s7Var.D0 || s7Var.C0, s7Var.B0, 4);
                }
                if (arrayList.size() <= ((s7Var.Z || !TextUtils.isEmpty(s7Var.s0) || s7Var.h0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(s7Var.s0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = dj.a;
                        f61 J = f61.J(dj.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(s7Var.s0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, s7Var.s0));
                        int i11 = dj.a;
                        f61 J2 = f61.J(dj.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(f61.B(null));
                arrayList.add(f61.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                s7.Q(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
