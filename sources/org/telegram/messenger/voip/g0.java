package org.telegram.messenger.voip;

import bi.i6;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.u41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oi;
import org.telegram.ui.pe1;
import rh.e4;
import rh.e6;
import th.u4;
import th.x4;
import xh.i3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0(int i10, i6 i6Var) {
        this.a = 7;
        this.b = i10;
        this.c = i6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        jj jjVar;
        jj jjVar2;
        int i10 = this.a;
        int i11 = 6;
        int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                ((VoIPService) obj).lambda$startScreenCapture$60(i12, tLObject, tL_error);
                break;
            case 1:
                org.telegram.messenger.i0.g3(new ji0((lt0) obj, tLObject, i12, i11));
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.D1;
                tz.l1 = System.currentTimeMillis();
                tz.y();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    org.telegram.messenger.i0.g3(new ji0(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i12, 18));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(5));
                    break;
                } else if (tL_error != null) {
                    org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.m0(tL_error, i11));
                    break;
                }
                break;
            case 3:
                org.telegram.messenger.i0.g3(new ji0((oi) obj, tLObject, i12, 19));
                break;
            case 4:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.x0((pe1) obj, i12, tLObject, i11));
                break;
            case 5:
                e4 e4Var = (e4) obj;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i13 = 0; i13 < messages_messages.messages.size(); i13++) {
                        TLRPC.Message message = messages_messages.messages.get(i13);
                        if (message != null && message.id == i12) {
                            TLRPC.MessageAction messageAction = message.action;
                            if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                                jjVar = new jj(e4Var.a, message, false, false);
                                jjVar.K5();
                                jjVar2 = jjVar;
                                if (jjVar2 == null) {
                                    org.telegram.messenger.i0.g3(new u41(e4Var, tLObject, jjVar2, false, 23));
                                    break;
                                }
                            }
                        }
                    }
                }
                jjVar = null;
                jjVar2 = jjVar;
                if (jjVar2 == null) {
                }
                break;
            case 6:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.x0((e6) obj, i12, tLObject, 13));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.x0(tLObject, i12, (i6) obj, 17));
                break;
            case 8:
                x4 x4Var = (x4) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i14 = 0; i14 < tL_stories_stories.stories.size(); i14++) {
                        arrayList.add(x4Var.y(tL_stories_stories.stories.get(i14)));
                    }
                    org.telegram.messenger.i0.g3(new c11(x4Var, arrayList, tL_stories_stories, this.b, 20));
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new u4(x4Var, 1));
                    break;
                }
            default:
                org.telegram.messenger.i0.g3(new org.telegram.ui.Wallet.x0((i3) obj, tLObject, i12, 25));
                break;
        }
    }

    public /* synthetic */ g0(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
