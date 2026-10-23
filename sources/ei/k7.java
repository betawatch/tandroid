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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                b71 b71Var = (b71) obj2;
                s7 s7Var = this.b;
                MessagesController.SavedMusicList savedMusicList = s7Var.e0;
                b71Var.F = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(m61.C(AndroidUtilities.dp(64.0f)));
                if (s7Var.Z || s7Var.h0) {
                    dp += s7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), s7Var.b0, false, false, -1);
                }
                if (!s7Var.Z) {
                    if (TextUtils.isEmpty(s7Var.t0) && !s7Var.h0) {
                        b71Var.U();
                        m61 c10 = m61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.q = true;
                        arrayList.add(c10);
                        b71Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!s7Var.h0 && savedMusicList != null) {
                        dp += s7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + s7Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), s7Var.c0, s7Var.x0 || s7Var.w0, s7Var.v0, 3) + s7Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), s7Var.d0, s7Var.E0 || s7Var.D0, s7Var.C0, 4);
                }
                if (arrayList.size() <= ((s7Var.Z || !TextUtils.isEmpty(s7Var.t0) || s7Var.h0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(s7Var.t0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = dj.a;
                        m61 J = m61.J(dj.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(s7Var.t0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, s7Var.t0));
                        int i11 = dj.a;
                        m61 J2 = m61.J(dj.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(m61.B(null));
                arrayList.add(m61.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                s7.P(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
