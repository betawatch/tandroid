package ci;

import android.content.Context;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements u10 {
    public final /* synthetic */ e9 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ n10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ n8(e9 e9Var, long j10, int i3, boolean[] zArr, n10 n10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = e9Var;
        this.b = j10;
        this.c = i3;
        this.d = zArr;
        this.e = n10Var;
        this.f = context;
        this.g = e6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        u10 u10Var = (u10) obj;
        e9 e9Var = this.a;
        long j10 = e9Var.f.amount;
        long j11 = this.b;
        boolean[] zArr = this.d;
        n10 n10Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j10 >= j11) {
            e9Var.Y(str, chatInvite, new u6(u10Var, zArr, n10Var));
            return;
        }
        boolean z10 = hp.s1(this.c).j7;
        Context context = this.f;
        org.telegram.ui.ActionBar.e6 e6Var = this.g;
        if (!z10) {
            boolean[] zArr2 = {false};
            mb mbVar = new mb(context, e6Var, j11, 1, chatInvite.title, new s6(e9Var, zArr2, str, chatInvite, zArr, n10Var, u10Var), 0L);
            mbVar.setOnDismissListener(new t6(e9Var, u10Var, zArr2, zArr, n10Var, 0));
            mbVar.show();
            return;
        }
        if (u10Var != null) {
            u10Var.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            n10Var.a("cancelled", 0L);
            zArr[0] = true;
        }
        e9.c0(context, e6Var);
    }
}
