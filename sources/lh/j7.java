package lh;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.pi;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ r7 b;

    public /* synthetic */ j7(r7 r7Var, int i10) {
        this.a = i10;
        this.b = r7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                b51 b51Var = (b51) obj2;
                r7 r7Var = this.b;
                MessagesController.SavedMusicList savedMusicList = r7Var.a0;
                b51Var.A = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(n41.C(AndroidUtilities.dp(64.0f)));
                if (r7Var.V || r7Var.d0) {
                    dp += r7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), r7Var.X, false, false, -1);
                }
                if (!r7Var.V) {
                    if (TextUtils.isEmpty(r7Var.o0) && !r7Var.d0) {
                        b51Var.U();
                        n41 c10 = n41.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.q = true;
                        arrayList.add(c10);
                        b51Var.T();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!r7Var.d0 && savedMusicList != null) {
                        dp += r7Var.W(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + r7Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), r7Var.Y, r7Var.s0 || r7Var.r0, r7Var.q0, 3) + r7Var.W(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), r7Var.Z, r7Var.z0 || r7Var.y0, r7Var.x0, 4);
                }
                if (arrayList.size() <= ((r7Var.V || !TextUtils.isEmpty(r7Var.o0) || r7Var.d0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(r7Var.o0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = pi.a;
                        n41 J = n41.J(pi.class);
                        J.l = string;
                        J.m = string2;
                        arrayList.add(J);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(r7Var.o0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, r7Var.o0));
                        int i11 = pi.a;
                        n41 J2 = n41.J(pi.class);
                        J2.l = string3;
                        J2.m = replaceTags;
                        arrayList.add(J2);
                    }
                }
                arrayList.add(n41.B(null));
                arrayList.add(n41.C(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                r7.P(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
