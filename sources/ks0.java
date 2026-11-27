// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ks0 extends r47 {
    public TL_iv.RichMessage u3;
    public final /* synthetic */ boolean v3;
    public final /* synthetic */ TLRPC.BotInlineResult w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(int i, TLRPC.TL_message tL_message, boolean z, TLRPC.BotInlineResult botInlineResult) {
        super(i, tL_message, true, true);
        this.v3 = z;
        this.w3 = botInlineResult;
    }

    @Override // r47
    public final TL_iv.RichMessage E0() {
        if (!this.v3) {
            return super.E0();
        }
        TL_iv.RichMessage richMessage = this.u3;
        if (richMessage != null) {
            return richMessage;
        }
        TL_iv.RichMessage n = k0d.n(k0d.w(this.K1, this.w3));
        this.u3 = n;
        return n;
    }

    @Override // r47
    public final boolean N3() {
        return false;
    }

    @Override // r47
    public final boolean O3() {
        return false;
    }
}
