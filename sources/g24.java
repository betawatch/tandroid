// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g24 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new g24());
    }

    public static c6c i(TLRPC.StickerSetCovered stickerSetCovered, x14 x14Var, boolean z) {
        c6c K = c6c.K(g24.class);
        long j = stickerSetCovered.set.id;
        long j2 = 1 + j;
        K.d = (int) (j2 ^ (j2 >>> 32));
        K.C = j;
        K.H = stickerSetCovered;
        K.I = x14Var;
        K.e = z;
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        wo4 wo4Var = (wo4) view;
        Object obj = c6cVar.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            wo4Var.setPack((TLRPC.TL_messages_stickerSet) obj);
        } else if (obj instanceof TLRPC.StickerSetCovered) {
            TLRPC.Document document = ((x14) c6cVar.I).e;
            wo4Var.d.setText(((TLRPC.StickerSetCovered) obj).set.short_name);
            wo4Var.c.d(document, null, null, null, false, false);
        }
        wo4Var.a(c6cVar.e, false);
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.C == c6cVar2.C && c6cVar.e == c6cVar2.e;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        wo4 wo4Var = new wo4(context, ylbVar);
        wo4Var.setLayoutParams(new g69(gm.L(64.0f), -1));
        return wo4Var;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.C == c6cVar2.C;
    }
}
