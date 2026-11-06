package hi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.v91;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements c20 {
    public final /* synthetic */ v91 a;
    public final /* synthetic */ ww b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ o1(v91 v91Var, ww wwVar, long j3, int i7) {
        this.a = v91Var;
        this.b = wwVar;
        this.c = j3;
        this.d = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        v91 v91Var = this.a;
        ww wwVar = this.b;
        if (v91Var != null) {
            v91Var.finishFragment();
            wwVar.removeSelfFromStack();
        } else {
            wwVar.finishFragment();
        }
        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j3 = this.c;
        int i7 = this.d;
        if (j3 >= 0) {
            TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(j3));
            str = t10.k(a22);
            chat = a22;
        } else {
            TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-j3));
            if (M0 == null) {
                str = "";
                chat = M0;
            } else {
                str = M0.title;
                chat = M0;
            }
        }
        hc a02 = hc.a0(T);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(hd.a0(null, null, bool.booleanValue() ? 2131752988 : 2131752987, str));
        a02.getClass();
        a02.V(Arrays.asList(chat), X2, null, null).k(false);
    }
}
