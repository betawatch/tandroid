// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ega implements au9, hj6 {
    public final /* synthetic */ gga a;

    public /* synthetic */ ega(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // au9
    public final boolean F1(int i) {
        return true;
    }

    @Override // au9
    public final vh6 G0() {
        return null;
    }

    @Override // hj6
    public final boolean a(ij6 ij6Var, boolean z) {
        int intValue = ((Integer) ij6Var.getTag()).intValue();
        gga ggaVar = this.a;
        TLObject E = ggaVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = k47.B1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return ggaVar.s.G1.g(tL_chatChannelParticipant, true, !z, ij6Var);
    }

    @Override // au9
    public final vh6 e1() {
        return null;
    }

    @Override // au9
    public final void o(int i) {
        gga ggaVar = this.a;
        ggaVar.f();
        if (i != 1) {
            return;
        }
        int i2 = ggaVar.r - 1;
        ggaVar.r = i2;
        if (i2 != 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            nha nhaVar = ggaVar.s;
            iga[] igaVarArr = nhaVar.n0;
            if (i3 >= igaVarArr.length) {
                return;
            }
            iga igaVar = igaVarArr[i3];
            if (igaVar.F == 7) {
                if (ggaVar.h == 0) {
                    igaVar.w.e(false, true);
                } else {
                    nhaVar.i(igaVar.h, 0, null);
                }
            }
            i3++;
        }
    }

    @Override // au9
    public final void a2(ArrayList arrayList) {
    }
}
