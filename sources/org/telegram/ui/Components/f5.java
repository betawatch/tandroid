package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h5 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ f5(h5 h5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.a = i10;
        this.b = h5Var;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f5(this.b, this.c, this.d, 1));
                break;
            default:
                h5 h5Var = this.b;
                h5Var.d(this.c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(h5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.lo(3, h5Var, arrayList));
                    break;
                }
                break;
        }
    }
}
