// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class eea implements yr9, fh6 {
    public final /* synthetic */ gea a;

    public /* synthetic */ eea(gea geaVar) {
        this.a = geaVar;
    }

    @Override // yr9
    public final vf6 O0() {
        return null;
    }

    @Override // yr9
    public final boolean U1(int i) {
        return true;
    }

    @Override // fh6
    public final boolean a(gh6 gh6Var, boolean z) {
        int intValue = ((Integer) gh6Var.getTag()).intValue();
        gea geaVar = this.a;
        TLObject E = geaVar.E(intValue);
        if (!(E instanceof TLRPC.ChannelParticipant)) {
            return false;
        }
        TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) E;
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
        tL_chatChannelParticipant.channelParticipant = channelParticipant;
        tL_chatChannelParticipant.user_id = k27.B1(channelParticipant.peer);
        tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
        tL_chatChannelParticipant.date = channelParticipant.date;
        return geaVar.s.G1.g(tL_chatChannelParticipant, true, !z, gh6Var);
    }

    @Override // yr9
    public final void r(int i) {
        gea geaVar = this.a;
        geaVar.f();
        if (i != 1) {
            return;
        }
        int i2 = geaVar.r - 1;
        geaVar.r = i2;
        if (i2 != 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            nfa nfaVar = geaVar.s;
            iea[] ieaVarArr = nfaVar.n0;
            if (i3 >= ieaVarArr.length) {
                return;
            }
            iea ieaVar = ieaVarArr[i3];
            if (ieaVar.F == 7) {
                if (geaVar.h == 0) {
                    ieaVar.w.e(false, true);
                } else {
                    nfaVar.i(ieaVar.h, 0, null);
                }
            }
            i3++;
        }
    }

    @Override // yr9
    public final vf6 t1() {
        return null;
    }

    @Override // yr9
    public final void m2(ArrayList arrayList) {
    }
}
