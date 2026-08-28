package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g5 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ f5(g5 g5Var, ArrayList arrayList, TLObject tLObject, int i9) {
        this.a = i9;
        this.b = g5Var;
        this.c = arrayList;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new f5(this.b, this.c, this.d, 1));
                break;
            default:
                g5 g5Var = this.b;
                int i9 = g5Var.e;
                HashSet hashSet = new HashSet(this.c);
                TLObject tLObject = this.d;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList = ((Vector) tLObject).objects;
                    MessagesStorage.getInstance(i9).getStorageQueue().postRunnable(new d5(g5Var, arrayList, 1));
                    g5Var.d(arrayList);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) instanceof TLRPC.Document) {
                            hashSet.remove(Long.valueOf(((TLRPC.Document) arrayList.get(i10)).id));
                        }
                    }
                    if (!hashSet.isEmpty()) {
                        ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                        TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                        tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getCustomEmojiDocuments, new org.telegram.ui.rc(10, g5Var, arrayList2));
                        break;
                    }
                }
                break;
        }
    }
}
