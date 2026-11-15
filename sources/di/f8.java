package di;

import android.content.Context;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements z10 {
    public final /* synthetic */ v8 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ s10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ f8(v8 v8Var, long j3, int i7, boolean[] zArr, s10 s10Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = v8Var;
        this.b = j3;
        this.c = i7;
        this.d = zArr;
        this.e = s10Var;
        this.f = context;
        this.g = e6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        z10 z10Var = (z10) obj;
        v8 v8Var = this.a;
        long j3 = v8Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.d;
        s10 s10Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j3 >= j10) {
            v8Var.Y(str, chatInvite, new l6(z10Var, zArr, s10Var));
            return;
        }
        boolean z10 = np.s1(this.c).k7;
        Context context = this.f;
        org.telegram.ui.ActionBar.e6 e6Var = this.g;
        if (!z10) {
            boolean[] zArr2 = {false};
            cb cbVar = new cb(context, e6Var, j10, 1, chatInvite.title, new j6(v8Var, zArr2, str, chatInvite, zArr, s10Var, z10Var), 0L);
            cbVar.setOnDismissListener(new k6(v8Var, z10Var, zArr2, zArr, s10Var, 0));
            cbVar.show();
            return;
        }
        if (z10Var != null) {
            z10Var.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            s10Var.a("cancelled", 0L);
            zArr[0] = true;
        }
        v8.c0(context, e6Var);
    }
}
