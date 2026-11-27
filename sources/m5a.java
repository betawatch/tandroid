// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class m5a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ k5 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int h;
    public final /* synthetic */ int n;

    public /* synthetic */ m5a(CharSequence charSequence, k5 k5Var, long j, long j2, boolean z, int i, int i2, byte b) {
        this.a = b;
        this.b = charSequence;
        this.c = k5Var;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.h = i;
        this.n = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // java.lang.Runnable
    public final void run() {
        r47 r47Var;
        TLRPC.TL_forumTopic f;
        TLRPC.Message message;
        switch (this.a) {
            case 0:
                CharSequence charSequence = this.b;
                k5 k5Var = this.c;
                long j = this.d;
                long j2 = this.e;
                boolean z = this.f;
                int i = this.h;
                int i2 = this.n;
                CharSequence G = r7a.G(charSequence);
                int i3 = k5Var.a;
                int t1 = uc7.s1(i3).t1();
                if (G != null && G.length() != 0) {
                    int ceil = (int) Math.ceil(G.length() / t1);
                    char c = 0;
                    int i4 = 1;
                    if (j == 0 || (f = uc7.s1(i3).h4.f(-j2, j)) == null || (message = f.topicStartMessage) == null) {
                        r47Var = null;
                    } else {
                        r47Var = new r47(i3, message, false, false);
                        r47Var.p = true;
                    }
                    int i5 = 0;
                    while (i5 < ceil) {
                        int i6 = i5 + 1;
                        CharSequence[] charSequenceArr = new CharSequence[i4];
                        charSequenceArr[c] = G.subSequence(i5 * t1, Math.min(i6 * t1, G.length()));
                        ArrayList Y = ls6.d0(i3).Y(charSequenceArr, i4, i4);
                        int i7 = i;
                        char c2 = c;
                        boolean z2 = i4;
                        int i8 = ceil;
                        CharSequence charSequence2 = G;
                        int i9 = i2;
                        int i10 = t1;
                        r47 r47Var2 = r47Var;
                        p7a b = p7a.b(charSequenceArr[c].toString(), j2, r47Var2, r47Var, null, true, null, null, null, z, i7, i9, null, false);
                        b.w = Y;
                        if (i5 == 0) {
                            b.O = 0L;
                        }
                        r7a.B(i3).q0(b);
                        G = charSequence2;
                        r47Var = r47Var2;
                        i = i7;
                        i2 = i9;
                        i5 = i6;
                        t1 = i10;
                        c = c2;
                        i4 = z2;
                        ceil = i8;
                    }
                    break;
                }
                break;
            case 1:
                Utilities.d.c(new m5a(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 2));
                break;
            default:
                hl.c3(new m5a(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 0));
                break;
        }
    }
}
