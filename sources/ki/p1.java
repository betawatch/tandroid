package ki;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u91;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements z10 {
    public final /* synthetic */ u91 a;
    public final /* synthetic */ yw b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ p1(u91 u91Var, yw ywVar, long j3, int i7) {
        this.a = u91Var;
        this.b = ywVar;
        this.c = j3;
        this.d = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        u91 u91Var = this.a;
        yw ywVar = this.b;
        if (u91Var != null) {
            u91Var.finishFragment();
            ywVar.removeSelfFromStack();
        } else {
            ywVar.finishFragment();
        }
        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j3 = this.c;
        int i7 = this.d;
        if (j3 >= 0) {
            TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(j3));
            str = q10.k(a22);
            chat = a22;
        } else {
            TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
                chat = M0;
            } else {
                str = M0.title;
                chat = M0;
            }
        }
        cc a02 = cc.a0(T);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, bool.booleanValue() ? 2131752988 : 2131752987, str));
        a02.getClass();
        a02.V(Arrays.asList(chat), X2, null, null).k(false);
    }
}
