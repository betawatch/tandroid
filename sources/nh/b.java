package nh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ b(f fVar, int i9) {
        this.a = i9;
        this.b = fVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        String string;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                f fVar = this.b;
                e eVar = fVar.f;
                l41 l41Var = new l41(-4);
                l41Var.d = 0;
                l41Var.c = eVar;
                l41Var.z = -1;
                arrayList.add(l41Var);
                l41 c10 = l41.c(1, R.drawable.msg_groups_create, LocaleController.getString(R.string.CommunityCreateCommunity));
                c10.q = true;
                arrayList.add(c10);
                arrayList.add(l41.D(2, AndroidUtilities.dp(14.0f)));
                ArrayList arrayList2 = fVar.h;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    arrayList.add(l41.s(3, LocaleController.getString(R.string.CommunityAddToExistingCommunity)));
                    ArrayList arrayList3 = fVar.h;
                    int size = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj3 = arrayList3.get(i9);
                        i9++;
                        TLRPC.Chat chat = (TLRPC.Chat) obj3;
                        TLRPC.ChatFull chatFull = fVar.getMessagesController().getChatFull(chat.id);
                        l41 v = l41.v(chat);
                        long j10 = chat.id;
                        v.d = (int) (j10 ^ (j10 >>> 32));
                        if (chatFull != null) {
                            ArrayList<TL_communities.CommunityPeer> arrayList4 = chatFull.linked_peers;
                            string = LocaleController.formatPluralString("Chats", arrayList4 != null ? arrayList4.size() : 0, new Object[0]);
                        } else {
                            string = LocaleController.getString(R.string.Loading);
                        }
                        v.m = string;
                        arrayList.add(v);
                    }
                    break;
                }
                break;
            default:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                f fVar2 = this.b;
                if (tL_error == null) {
                    r0.d(fVar2, fVar2.a, 0);
                    break;
                } else {
                    fVar2.getClass();
                    oc.a0(fVar2).d0(tL_error, false);
                    break;
                }
        }
    }
}
