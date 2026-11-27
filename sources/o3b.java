// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o3b extends a8c {
    public static final /* synthetic */ int b = 0;

    static {
        a8c.h(new o3b());
    }

    @Override // a8c
    public final void a(d79 d79Var, View view, b8c b8cVar) {
        p3b p3bVar = (p3b) view;
        boolean z = false;
        p3bVar.b(b8cVar != null && b8cVar.e, true);
        if ((d79Var instanceof q9c) && ((q9c) d79Var).k3) {
            z = true;
        }
        p3bVar.c(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    @Override // a8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        int i = l9cVar.f;
        p3b p3bVar = (p3b) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) b8cVar.H;
        boolean z2 = false;
        p3bVar.d(tL_messages_stickerSet, z, false);
        p3bVar.b(b8cVar.e, false);
        p3bVar.c(q9cVar.k3);
        p3bVar.setOnOptionsClick(b8cVar.E);
        p3bVar.E.setOnClickListener(b8cVar.F);
        p3bVar.F.setOnClickListener(b8cVar.F);
        p3bVar.G.setOnClickListener(b8cVar.F);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i2 = 1;
        boolean D0 = ls6.d0(i).D0(tL_messages_stickerSet.set.id, true);
        boolean p = yac.h(i).p();
        boolean z3 = !p;
        if (!p) {
            for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                if (r47.m3(tL_messages_stickerSet.documents.get(i3))) {
                }
            }
            if (z2) {
                i2 = D0 ? 4 : 3;
            } else if (D0 && !tL_messages_stickerSet.set.official) {
                i2 = 2;
            }
            p3bVar.e(i2);
        }
        z2 = z3;
        if (z2) {
        }
        p3bVar.e(i2);
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        p3b p3bVar = new p3b(context, 1);
        if (d79Var instanceof q9c) {
            p3bVar.setOnReorderButtonTouchListener(new g8((q9c) d79Var, p3bVar, (byte) 7));
        }
        return p3bVar;
    }
}
