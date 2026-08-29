package lh;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.zj;
import org.telegram.ui.jn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class u2 implements zj {
    public final /* synthetic */ d4 a;

    public u2(d4 d4Var) {
        this.a = d4Var;
    }

    @Override // org.telegram.ui.Components.zj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        d4 d4Var = this.a;
        TL_stories.StoryItem storyItem = d4Var.K1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = d4Var.getAccountInstance();
        SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, d4Var.x1, (MessageObject) null, (MessageObject) null, storyItem, (jn) null, (MessageObject) null, z10, i10, (t0.i) null, (SendMessageChatArguments) null, 0L, false, j11);
        d4Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.zj
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.o2 o2Var = this.a.F0.f;
            if (o2Var.getParentActivity() == null) {
                return;
            }
            o2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override // org.telegram.ui.Components.zj
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.zj
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
