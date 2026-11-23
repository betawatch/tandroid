package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements y10 {
    public final /* synthetic */ y8 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ r10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ i8(y8 y8Var, long j3, int i7, boolean[] zArr, r10 r10Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = y8Var;
        this.b = j3;
        this.c = i7;
        this.d = zArr;
        this.e = r10Var;
        this.f = context;
        this.g = h6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        y10 y10Var = (y10) obj;
        y8 y8Var = this.a;
        long j3 = y8Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.d;
        r10 r10Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j3 >= j10) {
            y8Var.X(str, chatInvite, new o6(y10Var, zArr, r10Var));
            return;
        }
        boolean z10 = np.u1(this.c).m7;
        Context context = this.f;
        org.telegram.ui.ActionBar.h6 h6Var = this.g;
        if (!z10) {
            boolean[] zArr2 = {false};
            fb fbVar = new fb(context, h6Var, j10, 1, chatInvite.title, new m6(y8Var, zArr2, str, chatInvite, zArr, r10Var, y10Var), 0L);
            fbVar.setOnDismissListener(new n6(y8Var, y10Var, zArr2, zArr, r10Var, 0));
            fbVar.show();
            return;
        }
        if (y10Var != null) {
            y10Var.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            r10Var.a("cancelled", 0L);
            zArr[0] = true;
        }
        y8.c0(context, h6Var);
    }
}
