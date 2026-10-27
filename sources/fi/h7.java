package fi;

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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7 b;

    public /* synthetic */ h7(o7 o7Var, int i10) {
        this.a = i10;
        this.b = o7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                k71 k71Var = (k71) obj2;
                o7 o7Var = this.b;
                MessagesController.SavedMusicList savedMusicList = o7Var.e0;
                k71Var.F = 1;
                int dp = AndroidUtilities.dp(64.0f);
                arrayList.add(u61.D(AndroidUtilities.dp(64.0f)));
                if (o7Var.Z || o7Var.h0) {
                    dp += o7Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchLocal), o7Var.b0, false, false, -1);
                }
                if (!o7Var.Z) {
                    if (TextUtils.isEmpty(o7Var.r0) && !o7Var.h0) {
                        k71Var.V();
                        u61 c10 = u61.c(1, R.drawable.msg2_folder, LocaleController.getString(R.string.StoryMusicSelectFromFiles));
                        c10.q = true;
                        arrayList.add(c10);
                        k71Var.U();
                        dp += AndroidUtilities.dp(50.0f);
                    }
                    if (!o7Var.h0 && savedMusicList != null) {
                        dp += o7Var.X(true, arrayList, LocaleController.getString(R.string.AudioSearchProfile), savedMusicList.list, savedMusicList.loading, !savedMusicList.endReached, 2);
                    }
                    dp = dp + o7Var.X(false, arrayList, LocaleController.getString(R.string.AudioSearchChats), o7Var.c0, o7Var.v0 || o7Var.u0, o7Var.t0, 3) + o7Var.X(false, arrayList, LocaleController.getString(R.string.AudioSearchGlobal), o7Var.d0, o7Var.C0 || o7Var.B0, o7Var.A0, 4);
                }
                if (arrayList.size() <= ((o7Var.Z || !TextUtils.isEmpty(o7Var.r0) || o7Var.h0) ? 1 : 2)) {
                    if (TextUtils.isEmpty(o7Var.r0)) {
                        String string = LocaleController.getString(R.string.NoAudioFound);
                        String string2 = LocaleController.getString(R.string.NoAudioFilesInfo);
                        int i10 = dj.a;
                        u61 K = u61.K(dj.class);
                        K.l = string;
                        K.m = string2;
                        arrayList.add(K);
                    } else {
                        String string3 = LocaleController.getString(R.string.NoAudioFound);
                        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(o7Var.r0.length() >= 3 ? R.string.NoAudioFoundInfo2 : R.string.NoAudioFoundInfo, o7Var.r0));
                        int i11 = dj.a;
                        u61 K2 = u61.K(dj.class);
                        K2.l = string3;
                        K2.m = replaceTags;
                        arrayList.add(K2);
                    }
                }
                arrayList.add(u61.C(null));
                arrayList.add(u61.D(Math.max(0, AndroidUtilities.dp(24.0f) + (((AndroidUtilities.displaySize.y - (AndroidUtilities.dp(12.0f) + dp)) - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()))));
                break;
            default:
                o7.R(this.b, (TLRPC.messages_BotResults) obj);
                break;
        }
    }
}
