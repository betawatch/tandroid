package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h8 implements x10 {
    public final /* synthetic */ x8 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ q10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ h8(x8 x8Var, long j3, int i7, boolean[] zArr, q10 q10Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = x8Var;
        this.b = j3;
        this.c = i7;
        this.d = zArr;
        this.e = q10Var;
        this.f = context;
        this.g = i6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        x10 x10Var = (x10) obj;
        x8 x8Var = this.a;
        long j3 = x8Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.d;
        q10 q10Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j3 >= j10) {
            x8Var.X(str, chatInvite, new o6(x10Var, zArr, q10Var));
            return;
        }
        boolean z10 = mp.u1(this.c).m7;
        Context context = this.f;
        org.telegram.ui.ActionBar.i6 i6Var = this.g;
        if (!z10) {
            boolean[] zArr2 = {false};
            fb fbVar = new fb(context, i6Var, j10, 1, chatInvite.title, new m6(x8Var, zArr2, str, chatInvite, zArr, q10Var, x10Var), 0L);
            fbVar.setOnDismissListener(new n6(x8Var, x10Var, zArr2, zArr, q10Var, 0));
            fbVar.show();
            return;
        }
        if (x10Var != null) {
            x10Var.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            q10Var.a("cancelled", 0L);
            zArr[0] = true;
        }
        x8.c0(context, i6Var);
    }
}
