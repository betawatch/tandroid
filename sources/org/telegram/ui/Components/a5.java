package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c5 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ a5(c5 c5Var, ArrayList arrayList, HashSet hashSet, int i7) {
        this.a = i7;
        this.b = c5Var;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new a5(this.b, this.c, this.d, 1));
                break;
            default:
                c5 c5Var = this.b;
                c5Var.d(this.c);
                HashSet hashSet = this.d;
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList;
                    ConnectionsManager.getInstance(c5Var.e).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.v7(11, c5Var, arrayList));
                    break;
                }
                break;
        }
    }
}
