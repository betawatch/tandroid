package hi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.z91;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements c20 {
    public final /* synthetic */ z91 a;
    public final /* synthetic */ zw b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ o1(z91 z91Var, zw zwVar, long j3, int i7) {
        this.a = z91Var;
        this.b = zwVar;
        this.c = j3;
        this.d = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        z91 z91Var = this.a;
        zw zwVar = this.b;
        if (z91Var != null) {
            z91Var.finishFragment();
            zwVar.removeSelfFromStack();
        } else {
            zwVar.finishFragment();
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
        gc a02 = gc.a0(T);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.a0(null, null, bool.booleanValue() ? 2131752988 : 2131752987, str));
        a02.getClass();
        a02.V(Arrays.asList(chat), X2, null, null).k(false);
    }
}
