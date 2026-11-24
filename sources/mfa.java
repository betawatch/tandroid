// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mfa {
    public final int a;
    public final int b;
    public final lfa c;
    public final kfa d;
    public final /* synthetic */ nfa e;

    public mfa(nfa nfaVar, Context context, int i) {
        this.e = nfaVar;
        this.b = i;
        int i2 = nfaVar.o2;
        nfaVar.o2 = i2 + 1;
        this.a = (i2 & 65535) | 65536;
        this.c = new lfa(this, context, i);
        this.d = new kfa(nfaVar, context, i, false);
    }
}
