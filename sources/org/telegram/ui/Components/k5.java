package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class k5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ k5(m5 m5Var, ArrayList arrayList, HashSet hashSet, int i10) {
        this.a = i10;
        this.b = m5Var;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k5(this.b, this.c, this.d, 1));
                break;
            default:
                m5 m5Var = this.b;
                m5Var.d(this.c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(m5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.ro(3, m5Var, arrayList));
                    break;
                }
                break;
        }
    }
}
