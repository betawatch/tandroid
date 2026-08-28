package ih;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wj;
import org.telegram.ui.gn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w2 implements wj {
    public final /* synthetic */ i4 a;

    public w2(i4 i4Var) {
        this.a = i4Var;
    }

    @Override // org.telegram.ui.Components.wj
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i9, long j10, boolean z11, long j11) {
        AccountInstance accountInstance;
        i4 i4Var = this.a;
        TL_stories.StoryItem storyItem = i4Var.K1.a;
        if (storyItem == null || (storyItem instanceof TL_stories.TL_storyItemSkipped)) {
            return;
        }
        accountInstance = i4Var.getAccountInstance();
        SendMessagesHelper.prepareSendingDocuments(accountInstance, (ArrayList<String>) arrayList, (ArrayList<String>) arrayList, (ArrayList<Uri>) null, str, (String) null, i4Var.x1, (MessageObject) null, (MessageObject) null, storyItem, (gn) null, (MessageObject) null, z10, i9, (t0.j) null, (SendMessageChatArguments) null, 0L, false, j11);
        i4Var.k0(j11 <= 0);
    }

    @Override // org.telegram.ui.Components.wj
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

    @Override // org.telegram.ui.Components.wj
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.wj
    public final /* synthetic */ void m(long j10, ArrayList arrayList, boolean z10, int i9) {
    }
}
