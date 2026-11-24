// default package

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class js2 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ js2(yv1 yv1Var, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.a = (byte) 2;
        this.c = yv1Var;
        this.d = fileLocationArr;
        this.e = str;
        this.f = fileLocationArr2;
        this.b = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((ConferenceCall) obj4).lambda$poll$8((TL_phone.getGroupCallChainBlocks) obj3, this.b, (AtomicBoolean) obj2, (AtomicInteger) obj, tLObject, tL_error);
                break;
            case 1:
                oc7 oc7Var = (oc7) obj4;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) obj3;
                f92 f92Var = (f92) obj2;
                g92 g92Var = (g92) obj;
                oc7Var.getClass();
                if (tLObject == null) {
                    gm.c3(new q87(g92Var, tL_error, (byte) 13));
                    break;
                } else {
                    oc7Var.T3((TLRPC.Updates) tLObject, false);
                    long j = this.b;
                    TLRPC.ChatFull M0 = oc7Var.M0(j);
                    if (M0 != null) {
                        if (M0 instanceof TLRPC.TL_chatFull) {
                            M0.flags |= 262144;
                        }
                        if (M0 instanceof TLRPC.TL_channelFull) {
                            M0.flags |= TLObject.FLAG_30;
                        }
                        M0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        oc7Var.getMessagesStorage().K1(M0, false);
                    }
                    gm.c3(new hq6((Object) oc7Var, (Object) f92Var, j, (byte) 6));
                    break;
                }
            case 2:
                gm.c3(new rr6(tL_error, (yv1) obj4, tLObject, (TLRPC.FileLocation[]) obj3, (String) obj2, (TLRPC.FileLocation[]) obj, this.b));
                break;
            default:
                gm.c3(new om1(obj4, (Object) tLObject, this.b, obj3, obj2, obj, (byte) 5));
                break;
        }
    }

    public /* synthetic */ js2(Object obj, long j, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ js2(ConferenceCall conferenceCall, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        this.a = (byte) 0;
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j;
        this.e = atomicBoolean;
        this.f = atomicInteger;
    }
}
