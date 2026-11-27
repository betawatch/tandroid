// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class g91 extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new g91());
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        h91 h91Var = (h91) view;
        TLRPC.Chat chat = (TLRPC.Chat) b8cVar.H;
        View.OnClickListener onClickListener = b8cVar.E;
        h91Var.c = chat;
        uv8 uv8Var = h91Var.b;
        uv8Var.setTag(Long.valueOf(chat.id));
        h91Var.a.C(chat, null, null, (!xc2.T(chat) || chat.megagroup) ? chat.has_geo ? ob6.M0(2131748396, null) : !xc2.t0(chat) ? ob6.M0(2131748395, null).toLowerCase() : ob6.M0(2131748392, null).toLowerCase() : !xc2.t0(chat) ? ob6.M0(2131752299, null).toLowerCase() : ob6.M0(2131752288, null).toLowerCase(), false, false);
        uv8Var.setOnClickListener(onClickListener);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new h91(context);
    }
}
