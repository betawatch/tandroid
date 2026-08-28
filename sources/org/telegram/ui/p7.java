package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p7 extends f7 {
    public final /* synthetic */ r7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(r7 r7Var) {
        super(r7Var, 3);
        this.n = r7Var;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        j7 j7Var = (j7) q1Var.a;
        org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) j7Var.b.getChildAt(0);
        hh.a aVar = ((l7) this.e.get(i9)).d;
        boolean z10 = aVar == j7Var.getTag();
        boolean z11 = i9 != this.e.size() - 1;
        j7Var.setTag(aVar);
        r7 r7Var = this.n;
        if (aVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i9;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(r7Var.d.getCurrentAccount()).getClientUserId();
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
                Utilities.globalQueue.postRunnable(new t1(r7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(r7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        h7Var.f(aVar.f, z11);
        boolean z12 = aVar.e.a;
        boolean z13 = !z12;
        if (!z10) {
            h7Var.c0 = !z12 ? 1.0f : 0.0f;
        }
        if (h7Var.b0 != z13) {
            h7Var.b0 = z13;
            h7Var.invalidate();
        }
        j7Var.d = z11;
        j7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        j7Var.a.a(this.n.f.j.contains(aVar), z10);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        j7 j7Var = new j7(this, viewGroup.getContext(), 1);
        j7Var.e = 3;
        o7 o7Var = new o7(this, viewGroup.getContext(), j7Var);
        o7Var.setCheckForButtonPress(true);
        j7Var.b.addView(o7Var);
        return new org.telegram.ui.Components.ik0(j7Var);
    }
}
