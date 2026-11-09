package hi;

import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class h1 extends ij {
    public TL_iv.RichMessage s3;
    public final /* synthetic */ boolean t3;
    public final /* synthetic */ TLRPC.BotInlineResult u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i7, TLRPC.TL_message tL_message, boolean z9, TLRPC.BotInlineResult botInlineResult) {
        super(i7, tL_message, true, true);
        this.t3 = z9;
        this.u3 = botInlineResult;
    }

    @Override // org.telegram.messenger.ij
    public final TL_iv.RichMessage E0() {
        if (!this.t3) {
            return super.E0();
        }
        if (this.s3 == null) {
            this.s3 = org.telegram.utils.twidget.n0.o(org.telegram.utils.twidget.n0.v(this.I1, this.u3));
        }
        return this.s3;
    }

    @Override // org.telegram.messenger.ij
    public final boolean N3() {
        return false;
    }

    @Override // org.telegram.messenger.ij
    public final boolean P3() {
        return false;
    }
}
