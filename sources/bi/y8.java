package bi;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class y8 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;

    public /* synthetic */ y8(i9 i9Var, int i10) {
        this.a = i10;
        this.b = i9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                j61 j61Var = (j61) obj2;
                i9 i9Var = this.b;
                MessagesController.SavedMusicList savedMusicList = i9Var.e0;
                j61Var.E = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(v51.C(AndroidUtilities.dp(64.0f)));
                if (i9Var.Z || i9Var.h0) {
                    dp += i9Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), i9Var.b0, false, false, -1);
                }
                if (!i9Var.Z) {
                    if (TextUtils.isEmpty(i9Var.s0) && !i9Var.h0) {
                        j61Var.U();
                        v51 c10 = v51.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.q = true;
                        arrayList.add(c10);
                        j61Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!i9Var.h0 && savedMusicList != null) {
                        dp += i9Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + i9Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), i9Var.c0, i9Var.w0 || i9Var.v0, i9Var.u0, 3) + i9Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), i9Var.d0, i9Var.D0 || i9Var.C0, i9Var.B0, 4);
                }
                if (arrayList.size() <= ((i9Var.Z || !TextUtils.isEmpty(i9Var.s0) || i9Var.h0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(i9Var.s0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = hj.a;
                        v51 J = v51.J(hj.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i9Var.s0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, i9Var.s0));
                        int i11 = hj.a;
                        v51 J2 = v51.J(hj.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(v51.B(null));
                arrayList.add(v51.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()))));
                break;
            default:
                i9.Q(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
