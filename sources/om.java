// default package

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class om implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rm b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ om(rm rmVar, ArrayList arrayList, HashSet hashSet, byte b) {
        this.a = b;
        this.b = rmVar;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        HashSet hashSet = this.d;
        ArrayList arrayList = this.c;
        rm rmVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new om(rmVar, arrayList, hashSet, (byte) 1));
                break;
            default:
                rmVar.d(arrayList);
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                    ConnectionsManager.getInstance(rmVar.e).sendRequest(tL_messages_getCustomEmojiDocuments, new pm(rmVar, arrayList2, (byte) 0));
                    break;
                }
                break;
        }
    }
}
