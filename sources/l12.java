// default package

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class l12 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l12(int i, go2 go2Var) {
        this.a = (byte) 7;
        this.b = i;
        this.c = go2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        k27 k27Var;
        byte b = this.a;
        byte b2 = 9;
        int i = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                gl.c3(new va7(obj, (Object) tLObject, i, (byte) 14));
                break;
            case 1:
                gl.c3(new tn6(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 17));
                break;
            case 2:
                gl.c3(new tn6(obj, (Object) tL_error, (Object) tLObject, this.b, (byte) 0));
                break;
            case 3:
                gl.c3(new j45((ap1) obj, tLObject, i, b2));
                break;
            case 4:
                gl.c3(new t79((zea) obj, tLObject, i, b2));
                break;
            case 5:
                vqa vqaVar = (vqa) obj;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                        TLRPC.Message message = messages_messages.messages.get(i2);
                        if (message != null && message.id == i) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                k27Var = new k27(vqaVar.a, message, false, false);
                                k27Var.K5();
                                if (k27Var == null) {
                                    gl.c3(new q3a((Object) vqaVar, (Object) tLObject, (Object) k27Var, (byte) 12));
                                    break;
                                }
                            }
                        }
                    }
                }
                k27Var = null;
                if (k27Var == null) {
                }
                break;
            case 6:
                gl.c3(new t79(obj, i, (Object) tLObject, (byte) 13));
                break;
            case 7:
                gl.c3(new t79((Object) tLObject, i, obj, (byte) 18));
                break;
            case 8:
                y1b y1bVar = (y1b) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                        arrayList.add(y1bVar.y(tL_stories_stories.stories.get(i3)));
                    }
                    gl.c3(new ica((Object) y1bVar, (Object) arrayList, (Object) tL_stories_stories, this.b, (byte) 4));
                    break;
                } else {
                    gl.c3(new v1b(y1bVar, (byte) 1));
                    break;
                }
            case 9:
                ((VoIPService) obj).lambda$startScreenCapture$63(i, tLObject, tL_error);
                break;
            default:
                gl.c3(new clc((orc) obj, i, tLObject, (byte) 5));
                break;
        }
    }

    public /* synthetic */ l12(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
