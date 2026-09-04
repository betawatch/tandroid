package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class q7 extends g7 {
    public final /* synthetic */ s7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(s7 s7Var) {
        super(s7Var, 3);
        this.n = s7Var;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        k7 k7Var = (k7) c1Var.a;
        org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) k7Var.b.getChildAt(0);
        ai.b bVar = ((m7) this.e.get(i10)).d;
        boolean z10 = bVar == k7Var.getTag();
        boolean z11 = i10 != this.e.size() - 1;
        k7Var.setTag(bVar);
        s7 s7Var = this.n;
        if (bVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(s7Var.d.getCurrentAccount()).getClientUserId();
            tL_peerUser.user_id = clientUserId;
            peer.user_id = clientUserId;
            tL_message.date = (int) (System.currentTimeMillis() / 1000);
            tL_message.message = "";
            tL_message.attachPath = bVar.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = bVar.b;
            String fileExtension = FileLoader.getFileExtension(bVar.a);
            TLRPC.Document document = tL_message.media.document;
            document.id = 0L;
            document.access_hash = 0L;
            document.file_reference = new byte[0];
            document.date = tL_message.date;
            if (fileExtension.length() <= 0) {
                fileExtension = "mp3";
            }
            document.mime_type = "audio/".concat(fileExtension);
            TLRPC.Document document2 = tL_message.media.document;
            document2.size = bVar.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (bVar.e == null) {
                ai.a aVar = new ai.a();
                bVar.e = aVar;
                aVar.b = true;
                Utilities.globalQueue.postRunnable(new r1(s7Var, bVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = bVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(s7Var.d.getCurrentAccount(), tL_message, false, false);
            bVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        i7Var.f(bVar.f, z11);
        boolean z12 = bVar.e.b;
        boolean z13 = !z12;
        if (!z10) {
            i7Var.g0 = !z12 ? 1.0f : 0.0f;
        }
        if (i7Var.f0 != z13) {
            i7Var.f0 = z13;
            i7Var.invalidate();
        }
        k7Var.d = z11;
        k7Var.c.setText(AndroidUtilities.formatFileSize(bVar.c));
        k7Var.a.a(this.n.f.j.contains(bVar), z10);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.b.addView(p7Var);
        return new org.telegram.ui.Components.vk0(k7Var);
    }
}
