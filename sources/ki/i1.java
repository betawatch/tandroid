package ki;

import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class i1 extends gj {
    public TL_iv.RichMessage u3;
    public final /* synthetic */ boolean v3;
    public final /* synthetic */ TLRPC.BotInlineResult w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(int i7, TLRPC.TL_message tL_message, boolean z10, TLRPC.BotInlineResult botInlineResult) {
        super(i7, tL_message, true, true);
        this.v3 = z10;
        this.w3 = botInlineResult;
    }

    @Override // org.telegram.messenger.gj
    public final TL_iv.RichMessage E0() {
        if (!this.v3) {
            return super.E0();
        }
        if (this.u3 == null) {
            this.u3 = org.telegram.utils.twidget.n0.o(org.telegram.utils.twidget.n0.v(this.K1, this.w3));
        }
        return this.u3;
    }

    @Override // org.telegram.messenger.gj
    public final boolean N3() {
        return false;
    }

    @Override // org.telegram.messenger.gj
    public final boolean P3() {
        return false;
    }
}
