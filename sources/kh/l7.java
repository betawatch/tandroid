package kh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s7 b;

    public /* synthetic */ l7(s7 s7Var, int i9) {
        this.a = i9;
        this.b = s7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                z41 z41Var = (z41) obj2;
                s7 s7Var = this.b;
                MessagesController.SavedMusicList savedMusicList = s7Var.a0;
                z41Var.A = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(l41.C(AndroidUtilities.dp(64.0f)));
                if (s7Var.V || s7Var.d0) {
                    dp += s7Var.V(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), s7Var.X, false, false, -1);
                }
                if (!s7Var.V) {
                    if (TextUtils.isEmpty(s7Var.o0) && !s7Var.d0) {
                        z41Var.U();
                        l41 c10 = l41.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.q = true;
                        arrayList.add(c10);
                        z41Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!s7Var.d0 && savedMusicList != null) {
                        dp += s7Var.V(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + s7Var.V(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), s7Var.Y, s7Var.s0 || s7Var.r0, s7Var.q0, 3) + s7Var.V(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), s7Var.Z, s7Var.z0 || s7Var.y0, s7Var.x0, 4);
                }
                if (arrayList.size() <= ((s7Var.V || !TextUtils.isEmpty(s7Var.o0) || s7Var.d0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(s7Var.o0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i9 = ti.a;
                        l41 J = l41.J(ti.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(s7Var.o0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, s7Var.o0));
                        int i10 = ti.a;
                        l41 J2 = l41.J(ti.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(l41.B(null));
                arrayList.add(l41.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                s7.O(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
