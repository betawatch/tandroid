// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kt0 extends k47 {
    public TL_iv.RichMessage u3;
    public final /* synthetic */ boolean v3;
    public final /* synthetic */ TLRPC.BotInlineResult w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt0(int i, TLRPC.TL_message tL_message, boolean z, TLRPC.BotInlineResult botInlineResult) {
        super(i, tL_message, true, true);
        this.v3 = z;
        this.w3 = botInlineResult;
    }

    @Override // k47
    public final TL_iv.RichMessage E0() {
        if (!this.v3) {
            return super.E0();
        }
        TL_iv.RichMessage richMessage = this.u3;
        if (richMessage != null) {
            return richMessage;
        }
        TL_iv.RichMessage n = wxc.n(wxc.w(this.K1, this.w3));
        this.u3 = n;
        return n;
    }

    @Override // k47
    public final boolean N3() {
        return false;
    }

    @Override // k47
    public final boolean O3() {
        return false;
    }
}
