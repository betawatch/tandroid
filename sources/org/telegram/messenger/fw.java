package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;

    public /* synthetic */ fw(CharSequence charSequence, c cVar, long j10, long j11, boolean z10, int i3, int i10, int i11) {
        this.a = i11;
        this.b = charSequence;
        this.c = cVar;
        this.d = j10;
        this.e = j11;
        this.f = z10;
        this.h = i3;
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
        zi ziVar;
        int i3;
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                CharSequence charSequence = this.b;
                c cVar = this.c;
                long j10 = this.d;
                long j11 = this.e;
                boolean z11 = this.f;
                int i10 = this.h;
                int i11 = this.n;
                CharSequence H = yy.H(charSequence);
                int i12 = cVar.a;
                int u12 = hp.s1(i12).u1();
                if (H != null && H.length() != 0) {
                    int ceil = (int) Math.ceil(H.length() / u12);
                    int i13 = 1;
                    if (j10 != 0) {
                        z10 = z11;
                        TLRPC.TL_forumTopic f10 = hp.s1(i12).q7.f(-j11, j10);
                        if (f10 != null && (message = f10.topicStartMessage) != null) {
                            ziVar = new zi(i12, message, false, false);
                            ziVar.p = true;
                            i3 = 0;
                            while (i3 < ceil) {
                                int i14 = i3 + 1;
                                CharSequence[] charSequenceArr = new CharSequence[i13];
                                charSequenceArr[0] = H.subSequence(i3 * u12, Math.min(i14 * u12, H.length()));
                                ArrayList W = li.b0(i12).W(charSequenceArr, i13, i13);
                                int i15 = ceil;
                                boolean z12 = i13;
                                boolean z13 = z10;
                                int i16 = i10;
                                int i17 = u12;
                                int i18 = i11;
                                zi ziVar2 = ziVar;
                                CharSequence charSequence2 = H;
                                int i19 = i12;
                                wy b10 = wy.b(charSequenceArr[0].toString(), j11, ziVar2, ziVar, null, true, null, null, null, z13, i16, i18, null, false);
                                b10.w = W;
                                if (i3 == 0) {
                                    b10.O = 0L;
                                }
                                yy.C(i19).r0(b10);
                                u12 = i17;
                                ziVar = ziVar2;
                                z10 = z13;
                                i10 = i16;
                                i11 = i18;
                                i3 = i14;
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
                    ziVar = null;
                    i3 = 0;
                    while (i3 < ceil) {
                    }
                }
                break;
            case 1:
                Utilities.d.c(new fw(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 2));
                break;
            default:
                g0.h3(new fw(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                break;
        }
    }
}
