package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class zw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;

    public /* synthetic */ zw(CharSequence charSequence, c cVar, long j10, long j11, boolean z10, int i10, int i11, int i12) {
        this.a = i12;
        this.b = charSequence;
        this.c = cVar;
        this.d = j10;
        this.e = j11;
        this.f = z10;
        this.h = i10;
        this.n = i11;
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
        kj kjVar;
        int i10;
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                CharSequence charSequence = this.b;
                c cVar = this.c;
                long j10 = this.d;
                long j11 = this.e;
                boolean z11 = this.f;
                int i11 = this.h;
                int i12 = this.n;
                CharSequence H = rz.H(charSequence);
                int i13 = cVar.a;
                int t12 = wp.r1(i13).t1();
                if (H != null && H.length() != 0) {
                    int ceil = (int) Math.ceil(H.length() / t12);
                    int i14 = 1;
                    if (j10 != 0) {
                        z10 = z11;
                        TLRPC.TL_forumTopic f7 = wp.r1(i13).r7.f(-j11, j10);
                        if (f7 != null && (message = f7.topicStartMessage) != null) {
                            kjVar = new kj(i13, message, false, false);
                            kjVar.p = true;
                            i10 = 0;
                            while (i10 < ceil) {
                                int i15 = i10 + 1;
                                CharSequence[] charSequenceArr = new CharSequence[i14];
                                charSequenceArr[0] = H.subSequence(i10 * t12, Math.min(i15 * t12, H.length()));
                                ArrayList W = vi.b0(i13).W(charSequenceArr, i14, i14);
                                int i16 = ceil;
                                boolean z12 = i14;
                                boolean z13 = z10;
                                int i17 = i11;
                                int i18 = t12;
                                int i19 = i12;
                                kj kjVar2 = kjVar;
                                CharSequence charSequence2 = H;
                                int i20 = i13;
                                pz b10 = pz.b(charSequenceArr[0].toString(), j11, kjVar2, kjVar, null, true, null, null, null, z13, i17, i19, null, false);
                                b10.w = W;
                                if (i10 == 0) {
                                    b10.O = 0L;
                                }
                                rz.C(i20).r0(b10);
                                t12 = i18;
                                kjVar = kjVar2;
                                z10 = z13;
                                i11 = i17;
                                i12 = i19;
                                i10 = i15;
                                ceil = i16;
                                i14 = z12;
                                H = charSequence2;
                                i13 = i20;
                            }
                            break;
                        }
                    } else {
                        z10 = z11;
                    }
                    kjVar = null;
                    i10 = 0;
                    while (i10 < ceil) {
                    }
                }
                break;
            case 1:
                Utilities.d.c(new zw(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 2));
                break;
            default:
                i0.g3(new zw(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                break;
        }
    }
}
