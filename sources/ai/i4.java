package ai;

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
import org.telegram.ui.mn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class i4 implements gk {
    public final /* synthetic */ e6 a;

    public i4(e6 e6Var) {
        this.a = e6Var;
    }

    @Override // org.telegram.ui.Components.gk
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        AccountInstance accountInstance;
        e6 e6Var = this.a;
        TL_stories.StoryItem storyItem = e6Var.O1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = e6Var.getAccountInstance();
        SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, e6Var.B1, (MessageObject) null, (MessageObject) null, storyItem, (mn) null, (MessageObject) null, z10, i10, (t0.i) null, (SendMessageChatArguments) null, 0L, false, j10);
        e6Var.k0(j10 <= 0);
    }

    @Override // org.telegram.ui.Components.gk
    public final void w() {
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
    public final /* synthetic */ void l(long j3, ArrayList arrayList, boolean z10, int i10) {
    }
}
