// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ga1 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new ga1());
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ha1 ha1Var = (ha1) view;
        TLRPC.Chat chat = (TLRPC.Chat) c6cVar.H;
        View.OnClickListener onClickListener = c6cVar.E;
        ha1Var.c = chat;
        mu8 mu8Var = ha1Var.b;
        mu8Var.setTag(Long.valueOf(chat.id));
        ha1Var.a.x(chat, null, null, (!sd2.T(chat) || chat.megagroup) ? chat.has_geo ? jb6.M0(2131748399, null) : !sd2.t0(chat) ? jb6.M0(2131748398, null).toLowerCase() : jb6.M0(2131748395, null).toLowerCase() : !sd2.t0(chat) ? jb6.M0(2131752271, null).toLowerCase() : jb6.M0(2131752260, null).toLowerCase(), false, false);
        mu8Var.setOnClickListener(onClickListener);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ha1(context);
    }
}
