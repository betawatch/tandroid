// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class kha extends kea {
    public final /* synthetic */ e U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kha(Context context, String str, String str2, vnb vnbVar, e eVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = eVar;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        hl.d3(new a39(this.U2, zh6Var, i, (byte) 8), 100L);
    }
}
