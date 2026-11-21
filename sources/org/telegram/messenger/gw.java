package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class gw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ c c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;

    public /* synthetic */ gw(CharSequence charSequence, c cVar, long j3, long j10, boolean z10, int i7, int i10, int i11) {
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
        fj fjVar;
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
                CharSequence H = zy.H(charSequence);
                int i12 = cVar.a;
                int w12 = mp.u1(i12).w1();
                if (H != null && H.length() != 0) {
                    int ceil = (int) Math.ceil(H.length() / w12);
                    int i13 = 1;
                    if (j3 != 0) {
                        z10 = z11;
                        TLRPC.TL_forumTopic f10 = mp.u1(i12).t7.f(-j10, j3);
                        if (f10 != null && (message = f10.topicStartMessage) != null) {
                            fjVar = new fj(i12, message, false, false);
                            fjVar.p = true;
                            i7 = 0;
                            while (i7 < ceil) {
                                int i14 = i7 + 1;
                                CharSequence[] charSequenceArr = new CharSequence[i13];
                                charSequenceArr[0] = H.subSequence(i7 * w12, Math.min(i14 * w12, H.length()));
                                ArrayList Y = ri.d0(i12).Y(charSequenceArr, i13, i13);
                                int i15 = ceil;
                                boolean z12 = i13;
                                boolean z13 = z10;
                                int i16 = i10;
                                int i17 = w12;
                                int i18 = i11;
                                fj fjVar2 = fjVar;
                                CharSequence charSequence2 = H;
                                int i19 = i12;
                                xy b10 = xy.b(charSequenceArr[0].toString(), j10, fjVar2, fjVar, null, true, null, null, null, z13, i16, i18, null, false);
                                b10.w = Y;
                                if (i7 == 0) {
                                    b10.O = 0L;
                                }
                                zy.C(i19).r0(b10);
                                w12 = i17;
                                fjVar = fjVar2;
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
                    fjVar = null;
                    i7 = 0;
                    while (i7 < ceil) {
                    }
                }
                break;
            case 1:
                Utilities.d.c(new gw(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 2));
                break;
            default:
                g0.g3(new gw(this.b, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                break;
        }
    }
}
