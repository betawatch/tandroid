package ii;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m91;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements u10 {
    public final /* synthetic */ m91 a;
    public final /* synthetic */ uw b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ p1(m91 m91Var, uw uwVar, long j10, int i3) {
        this.a = m91Var;
        this.b = uwVar;
        this.c = j10;
        this.d = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        String str;
        TLRPC.Chat chat;
        Boolean bool = (Boolean) obj;
        m91 m91Var = this.a;
        uw uwVar = this.b;
        if (m91Var != null) {
            m91Var.finishFragment();
            uwVar.removeSelfFromStack();
        } else {
            uwVar.finishFragment();
        }
        org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
        if (T == null) {
            return;
        }
        long j10 = this.c;
        int i3 = this.d;
        if (j10 >= 0) {
            TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(j10));
            str = l10.k(a22);
            chat = a22;
        } else {
            TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(-j10));
            if (M0 == null) {
                str = "";
                chat = M0;
            } else {
                str = M0.title;
                chat = M0;
            }
        }
        fc a02 = fc.a0(T);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.a0(null, null, bool.booleanValue() ? 2131752988 : 2131752987, str));
        a02.getClass();
        a02.V(Arrays.asList(chat), X2, null, null).k(false);
    }
}
