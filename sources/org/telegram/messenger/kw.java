package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class kw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;

    public /* synthetic */ kw(CharSequence charSequence, c cVar, long j3, long j10, boolean z10, int i7, int i10, int i11) {
        this.a = i11;
        this.b = charSequence;
        this.c = cVar;
        this.d = j3;
        this.e = j10;
        this.f = z10;
        this.h = i7;
        this.n = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        gj gjVar;
        int i7;
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                CharSequence charSequence = this.b;
                c cVar = this.c;
                long j3 = this.d;
                long j10 = this.e;
                boolean z11 = this.f;
                int i10 = this.h;
                int i11 = this.n;
                CharSequence H = ez.H(charSequence);
                int i12 = cVar.a;
                int u12 = np.s1(i12).u1();
                if (H != null && H.length() != 0) {
                    int ceil = (int) Math.ceil(H.length() / u12);
                    int i13 = 1;
                    if (j3 != 0) {
                        z10 = z11;
                        TLRPC.TL_forumTopic f10 = np.s1(i12).r7.f(-j10, j3);
                        if (f10 != null && (message = f10.topicStartMessage) != null) {
                            gjVar = new gj(i12, message, false, false);
                            gjVar.p = true;
                            i7 = 0;
                            while (i7 < ceil) {
                                int i14 = i7 + 1;
                                CharSequence[] charSequenceArr = new CharSequence[i13];
                                charSequenceArr[0] = H.subSequence(i7 * u12, Math.min(i14 * u12, H.length()));
                                ArrayList W = si.b0(i12).W(charSequenceArr, i13, i13);
                                int i15 = ceil;
                                boolean z12 = i13;
                                boolean z13 = z10;
                                int i16 = i10;
                                int i17 = u12;
                                int i18 = i11;
                                gj gjVar2 = gjVar;
                                CharSequence charSequence2 = H;
                                int i19 = i12;
                                cz b10 = cz.b(charSequenceArr[0].toString(), j10, gjVar2, gjVar, null, true, null, null, null, z13, i16, i18, null, false);
                                b10.w = W;
                                if (i7 == 0) {
                                    b10.O = 0L;
                                }
                                ez.C(i19).r0(b10);
                                u12 = i17;
                                gjVar = gjVar2;
                                z10 = z13;
                                i10 = i16;
                                i11 = i18;
                                i7 = i14;
                                ceil = i15;
                                i13 = z12;
                                H = charSequence2;
                                i12 = i19;
                            }
                            break;
                        }
                    } else {
                        z10 = z11;
                    }
                    gjVar = null;
                    i7 = 0;
                    while (i7 < ceil) {
                    }
                }
                break;
            case 1:
                Utilities.d.c(new kw(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 2));
                break;
            default:
                g0.h3(new kw(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                break;
        }
    }
}
