package fi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ b(f fVar, int i10) {
        this.a = i10;
        this.b = fVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        String string;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f fVar = this.b;
                arrayList.add(h61.l(0, fVar.f));
                h61 c10 = h61.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.q = true;
                arrayList.add(c10);
                arrayList.add(h61.E(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(h61.t(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.id);
                        h61 w10 = h61.w(chat);
                        long j3 = chat.id;
                        w10.d = (int) (j3 ^ (j3 >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            string = LocaleController.formatPluralString("Chats", arrayList4 != null ? arrayList4.size() : 0, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        w10.m = string;
                        arrayList.add(w10);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.b;
                if (tL_error == null) {
                    u0.d(fVar2, fVar2.a, 0);
                    break;
                } else {
                    fVar2.getClass();
                    yc.a0(fVar2).d0(tL_error, false);
                    break;
                }
        }
    }
}
