package ci;

import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zi;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.is0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nc1;
import org.telegram.ui.ph;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i3, w9 w9Var) {
        this.a = 2;
        this.b = i3;
        this.c = w9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010d  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        zi ziVar;
        int i3 = this.a;
        int i10 = 20;
        int i11 = this.b;
        Object obj = this.c;
        switch (i3) {
            case 0:
                l6 l6Var = (l6) obj;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i12 = 0; i12 < messages_messages.messages.size(); i12++) {
                        TLRPC.Message message = messages_messages.messages.get(i12);
                        if (message != null && message.id == i11) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                ziVar = new zi(l6Var.a, message, false, false);
                                ziVar.M5();
                                if (ziVar == null) {
                                    org.telegram.messenger.g0.h3(new ai.k3(l6Var, tLObject, ziVar, 14));
                                    break;
                                }
                            }
                        }
                    }
                }
                ziVar = null;
                if (ziVar == null) {
                }
                break;
            case 1:
                org.telegram.messenger.g0.h3(new ai.e3((e9) obj, i11, tLObject, 4));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new ai.e3(tLObject, i11, (w9) obj, 8));
                break;
            case 3:
                ei.r6 r6Var = (ei.r6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i13 = 0; i13 < tL_stories_stories.stories.size(); i13++) {
                        arrayList.add(r6Var.y(tL_stories_stories.stories.get(i13)));
                    }
                    org.telegram.messenger.g0.h3(new bi.q0(r6Var, arrayList, tL_stories_stories, this.b, 3));
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ei.o6(r6Var, 1));
                    break;
                }
            case 4:
                org.telegram.messenger.g0.h3(new ai.e3((ii.d4) obj, tLObject, i11, 17));
                break;
            case 5:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                break;
            case 6:
                org.telegram.messenger.g0.h3(new org.telegram.ui.f4((is0) obj, tLObject, i11, i10));
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str = LaunchActivity.E1;
                az.l1 = System.currentTimeMillis();
                az.y();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    org.telegram.messenger.g0.h3(new rw(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 2));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    org.telegram.messenger.g0.h3(new go(18));
                    break;
                } else if (tL_error != null) {
                    org.telegram.messenger.g0.h3(new go(tL_error, 19));
                    break;
                }
                break;
            case 8:
                org.telegram.messenger.g0.h3(new rw((ph) obj, tLObject, i11, 3));
                break;
            default:
                org.telegram.messenger.g0.h3(new rw((nc1) obj, i11, tLObject, i10));
                break;
        }
    }

    public /* synthetic */ a2(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }
}
