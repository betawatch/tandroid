package ci;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ek;
import org.telegram.ui.in;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class d3 implements ek {
    public final /* synthetic */ q4 a;

    public d3(q4 q4Var) {
        this.a = q4Var;
    }

    @Override // org.telegram.ui.Components.ek
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        q4 q4Var = this.a;
        TL_stories.StoryItem storyItem = q4Var.O1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = q4Var.getAccountInstance();
        SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, q4Var.B1, (MessageObject) null, (MessageObject) null, storyItem, (in) null, (MessageObject) null, z10, i10, (t0.j) null, (SendMessageChatArguments) null, 0L, false, j11);
        q4Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.ek
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            org.telegram.ui.ActionBar.n2 n2Var = this.a.J0.f;
            if (n2Var.getParentActivity() == null) {
                return;
            }
            n2Var.getParentActivity().startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.Components.ek
    public final /* synthetic */ void O() {
    }

    @Override // org.telegram.ui.Components.ek
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i10) {
    }
}
