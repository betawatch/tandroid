package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q7 extends g7 {
    public final /* synthetic */ s7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(s7 s7Var) {
        super(s7Var, 3);
        this.n = s7Var;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        k7 k7Var = (k7) o1Var.a;
        org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) k7Var.b.getChildAt(0);
        ih.a aVar = ((m7) this.e.get(i10)).d;
        boolean z10 = aVar == k7Var.getTag();
        boolean z11 = i10 != this.e.size() - 1;
        k7Var.setTag(aVar);
        s7 s7Var = this.n;
        if (aVar.f == null) {
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
            tL_message.attachPath = aVar.a.getPath();
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_message.media = tL_messageMediaDocument;
            tL_messageMediaDocument.flags |= 3;
            tL_messageMediaDocument.document = new TLRPC.TL_document();
            tL_message.flags |= 768;
            tL_message.dialog_id = aVar.b;
            String fileExtension = FileLoader.getFileExtension(aVar.a);
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
            document2.size = aVar.c;
            document2.dc_id = 0;
            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
            if (aVar.e == null) {
                d5.c cVar = new d5.c();
                aVar.e = cVar;
                cVar.a = true;
                Utilities.globalQueue.postRunnable(new u1(s7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(s7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        e7Var.f(aVar.f, z11);
        boolean z12 = aVar.e.a;
        boolean z13 = !z12;
        if (!z10) {
            e7Var.c0 = !z12 ? 1.0f : 0.0f;
        }
        if (e7Var.b0 != z13) {
            e7Var.b0 = z13;
            e7Var.invalidate();
        }
        k7Var.d = z11;
        k7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        k7Var.a.a(this.n.f.j.contains(aVar), z10);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        k7 k7Var = new k7(this, viewGroup.getContext(), 1);
        k7Var.e = 3;
        p7 p7Var = new p7(this, viewGroup.getContext(), k7Var);
        p7Var.setCheckForButtonPress(true);
        k7Var.b.addView(p7Var);
        return new org.telegram.ui.Components.lk0(k7Var);
    }
}
