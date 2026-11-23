package di;

import android.content.Context;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i8 implements w10 {
    public final /* synthetic */ y8 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ p10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ i8(y8 y8Var, long j3, int i7, boolean[] zArr, p10 p10Var, Context context, org.telegram.ui.ActionBar.i6 i6Var, TLRPC.ChatInvite chatInvite, String str) {
        this.a = y8Var;
        this.b = j3;
        this.c = i7;
        this.d = zArr;
        this.e = p10Var;
        this.f = context;
        this.g = i6Var;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        w10 w10Var = (w10) obj;
        y8 y8Var = this.a;
        long j3 = y8Var.f.amount;
        long j10 = this.b;
        boolean[] zArr = this.d;
        p10 p10Var = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j3 >= j10) {
            y8Var.X(str, chatInvite, new o6(w10Var, zArr, p10Var));
            return;
        }
        boolean z10 = mp.u1(this.c).m7;
        Context context = this.f;
        org.telegram.ui.ActionBar.i6 i6Var = this.g;
        if (!z10) {
            boolean[] zArr2 = {false};
            fb fbVar = new fb(context, i6Var, j10, 1, chatInvite.title, new m6(y8Var, zArr2, str, chatInvite, zArr, p10Var, w10Var), 0L);
            fbVar.setOnDismissListener(new n6(y8Var, w10Var, zArr2, zArr, p10Var, 0));
            fbVar.show();
            return;
        }
        if (w10Var != null) {
            w10Var.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            p10Var.a("cancelled", 0L);
            zArr[0] = true;
        }
        y8.c0(context, i6Var);
    }
}
