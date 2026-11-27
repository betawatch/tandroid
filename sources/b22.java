// default package

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class b22 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b22(int i, zo2 zo2Var) {
        this.a = (byte) 7;
        this.b = i;
        this.c = zo2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00af  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        r47 r47Var;
        byte b = this.a;
        byte b2 = 14;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                hl.c3(new ze7((j22) obj, tLObject, i, b2));
                break;
            case 1:
                hl.c3(new gp6(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 17));
                break;
            case 2:
                hl.c3(new gp6(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 0));
                break;
            case 3:
                hl.c3(new l65(obj, (Object) tLObject, i, (byte) 9));
                break;
            case 4:
                hl.c3(new a39(obj, (Object) tLObject, i, (byte) 10));
                break;
            case 5:
                wua wuaVar = (wua) obj;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                        TLRPC.Message message = messages_messages.messages.get(i2);
                        if (message != null && message.id == i) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                r47Var = new r47(wuaVar.a, message, false, false);
                                r47Var.K5();
                                if (r47Var == null) {
                                    hl.c3(new jr9((Object) wuaVar, (Object) tLObject, (Object) r47Var, (byte) 21));
                                    break;
                                }
                            }
                        }
                    }
                }
                r47Var = null;
                if (r47Var == null) {
                }
                break;
            case 6:
                hl.c3(new a39((jxa) obj, i, tLObject, b2));
                break;
            case 7:
                hl.c3(new a39((Object) tLObject, i, obj, (byte) 19));
                break;
            case 8:
                u5b u5bVar = (u5b) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                        arrayList.add(u5bVar.y(tL_stories_stories.stories.get(i3)));
                    }
                    hl.c3(new efa((Object) u5bVar, (Object) arrayList, (Object) tL_stories_stories, this.b, (byte) 6));
                    break;
                } else {
                    hl.c3(new r5b(u5bVar, (byte) 0));
                    break;
                }
            case 9:
                ((VoIPService) obj).lambda$startScreenCapture$63(i, tLObject, tL_error);
                break;
            default:
                hl.c3(new mpc(obj, i, (Object) tLObject, (byte) 6));
                break;
        }
    }

    public /* synthetic */ b22(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
