package di;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;

    public /* synthetic */ t7(c8 c8Var, int i10) {
        this.a = i10;
        this.b = c8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a71 a71Var = (a71) obj2;
                c8 c8Var = this.b;
                MessagesController.SavedMusicList savedMusicList = c8Var.e0;
                a71Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(m61.C(AndroidUtilities.dp(64.0f)));
                if (c8Var.Z || c8Var.h0) {
                    dp += c8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), c8Var.b0, false, false, -1);
                }
                if (!c8Var.Z) {
                    if (TextUtils.isEmpty(c8Var.s0) && !c8Var.h0) {
                        a71Var.U();
                        m61 c10 = m61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.q = true;
                        arrayList.add(c10);
                        a71Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!c8Var.h0 && savedMusicList != null) {
                        dp += c8Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + c8Var.X(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), c8Var.c0, c8Var.w0 || c8Var.v0, c8Var.u0, 3) + c8Var.X(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), c8Var.d0, c8Var.D0 || c8Var.C0, c8Var.B0, 4);
                }
                if (arrayList.size() <= ((c8Var.Z || !TextUtils.isEmpty(c8Var.s0) || c8Var.h0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(c8Var.s0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = fj.a;
                        m61 J = m61.J(fj.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(c8Var.s0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, c8Var.s0));
                        int i11 = fj.a;
                        m61 J2 = m61.J(fj.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(m61.B(null));
                arrayList.add(m61.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                c8.Q(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
