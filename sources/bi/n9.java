package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements c20 {
    public final /* synthetic */ ea a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ v10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ n9(ea eaVar, long j3, int i7, boolean[] zArr, v10 v10Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = eaVar;
        this.b = j3;
        this.c = i7;
        this.d = zArr;
        this.e = v10Var;
        this.f = context;
        this.g = f6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        c20 c20Var = (c20) obj;
        ea eaVar = this.a;
        long j3 = eaVar.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.d;
        v10 v10Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j3 >= j10) {
            eaVar.Y(str, chatInvite, new t7(c20Var, zArr, v10Var));
            return;
        }
        boolean z9 = qp.s1(this.c).j7;
        Context context = this.f;
        org.telegram.ui.ActionBar.f6 f6Var = this.g;
        if (!z9) {
            boolean[] zArr2 = {false};
            tc tcVar = new tc(context, f6Var, j10, 1, chatInvite.title, new r7(eaVar, zArr2, str, chatInvite, zArr, v10Var, c20Var), 0L);
            tcVar.setOnDismissListener(new s7(eaVar, c20Var, zArr2, zArr, v10Var, 0));
            tcVar.show();
            return;
        }
        if (c20Var != null) {
            c20Var.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            v10Var.a("cancelled", 0L);
            zArr[0] = true;
        }
        ea.c0(context, f6Var);
    }
}
