package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q7 extends g7 {
    public final /* synthetic */ t7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(t7 t7Var) {
        super(t7Var, 3);
        this.n = t7Var;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        k7 k7Var = (k7) d1Var.a;
        org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) k7Var.b.getChildAt(0);
        ci.b bVar = ((m7) this.e.get(i7)).d;
        boolean z9 = bVar == k7Var.getTag();
        boolean z10 = i7 != this.e.size() - 1;
        k7Var.setTag(bVar);
        t7 t7Var = this.n;
        if (bVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i7;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e10 = org.telegram.messenger.p10.i(t7Var.e.getCurrentAccount()).e();
            tL_peerUser.user_id = e10;
            peer.user_id = e10;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.b;
            String D = org.telegram.messenger.w7.D(bVar.a);
            TLRPC.Document document = tL_message.media.document;
            document.id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (D.length() <= 0) {
                D = "mp3";
            }
            document.mime_type = "audio/".concat(D);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.e == null) {
                ci.a aVar = new ci.a();
                bVar.e = aVar;
                aVar.a = true;
                Utilities.e.c(new o1(t7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            org.telegram.messenger.ij ijVar = new org.telegram.messenger.ij(t7Var.e.getCurrentAccount(), tL_message, false, false);
            bVar.f = ijVar;
            ijVar.x0 = true;
        }
        g7Var.f(bVar.f, z10);
        boolean z11 = bVar.e.a;
        boolean z12 = !z11;
        if (!z9) {
            g7Var.g0 = !z11 ? 1.0f : 0.0f;
        }
        if (g7Var.f0 != z12) {
            g7Var.f0 = z12;
            g7Var.invalidate();
        }
        k7Var.d = z10;
        k7Var.c.setText(org.telegram.messenger.g0.i0(bVar.c, false, false));
        k7Var.a.a(this.n.h.j.contains(bVar), z9);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.b.addView(p7Var);
        return new org.telegram.ui.Components.xi0(k7Var);
    }
}
