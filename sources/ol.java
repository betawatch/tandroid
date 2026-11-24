// default package

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ol implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rl b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ HashSet d;

    public /* synthetic */ ol(rl rlVar, ArrayList arrayList, HashSet hashSet, byte b) {
        this.a = b;
        this.b = rlVar;
        this.c = arrayList;
        this.d = hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        HashSet hashSet = this.d;
        ArrayList arrayList = this.c;
        rl rlVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new ol(rlVar, arrayList, hashSet, (byte) 1));
                break;
            default:
                rlVar.d(arrayList);
                if (!hashSet.isEmpty()) {
                    ArrayList<Long> arrayList2 = new ArrayList<>(hashSet);
                    TLRPC.TL_messages_getCustomEmojiDocuments tL_messages_getCustomEmojiDocuments = new TLRPC.TL_messages_getCustomEmojiDocuments();
                    tL_messages_getCustomEmojiDocuments.document_id = arrayList2;
                    ConnectionsManager.getInstance(rlVar.e).sendRequest(tL_messages_getCustomEmojiDocuments, new pl(rlVar, arrayList2, (byte) 0));
                    break;
                }
                break;
        }
    }
}
