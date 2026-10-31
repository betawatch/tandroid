package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q7 extends g7 {
    public final /* synthetic */ t7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(t7 t7Var) {
        super(t7Var, 3);
        this.n = t7Var;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        k7 k7Var = (k7) c1Var.a;
        org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) k7Var.b.getChildAt(0);
        sh.a aVar = ((m7) this.e.get(i10)).d;
        boolean z10 = aVar == k7Var.getTag();
        boolean z11 = i10 != this.e.size() - 1;
        k7Var.setTag(aVar);
        t7 t7Var = this.n;
        if (aVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long e = org.telegram.messenger.d20.i(t7Var.e.getCurrentAccount()).e();
            tL_peerUser.user_id = e;
            peer.user_id = e;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = aVar.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.b;
            String D = org.telegram.messenger.b8.D(aVar.a);
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
            document2.size = aVar.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.e == null) {
                c3.m0 m0Var = new c3.m0();
                aVar.e = m0Var;
                m0Var.a = true;
                Utilities.e.c(new p1(t7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(t7Var.e.getCurrentAccount(), tL_message, false, false);
            aVar.f = jjVar;
            jjVar.x0 = true;
        }
        k7Var2.f(aVar.f, z11);
        boolean z12 = aVar.e.a;
        boolean z13 = !z12;
        if (!z10) {
            k7Var2.g0 = !z12 ? 1.0f : 0.0f;
        }
        if (k7Var2.f0 != z13) {
            k7Var2.f0 = z13;
            k7Var2.invalidate();
        }
        k7Var.d = z11;
        k7Var.c.setText(org.telegram.messenger.i0.i0(aVar.c, false, false));
        k7Var.a.a(this.n.h.j.contains(aVar), z10);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.b.addView(p7Var);
        return new org.telegram.ui.Components.ck0(k7Var);
    }
}
