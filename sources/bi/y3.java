package bi;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gk;
import org.telegram.ui.un;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class y3 implements gk {
    public final /* synthetic */ q5 a;

    public y3(q5 q5Var) {
        this.a = q5Var;
    }

    @Override // org.telegram.ui.Components.gk
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        q5 q5Var = this.a;
        TL_stories.StoryItem storyItem = q5Var.O1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = q5Var.getAccountInstance();
        SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, q5Var.B1, (MessageObject) null, (MessageObject) null, storyItem, (un) null, (MessageObject) null, z10, i10, (t0.j) null, (SendMessageChatArguments) null, 0L, false, j11);
        q5Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.gk
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.m2 m2Var = this.a.J0.f;
            if (m2Var.getParentActivity() == null) {
                return;
            }
            m2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.gk
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.gk
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
