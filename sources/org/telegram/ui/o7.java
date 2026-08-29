package org.telegram.ui;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o7 extends e7 {
    public final /* synthetic */ q7 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(q7 q7Var) {
        super(q7Var, 3);
        this.n = q7Var;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        i7 i7Var = (i7) n1Var.a;
        org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) i7Var.b.getChildAt(0);
        kh.a aVar = ((k7) this.e.get(i10)).d;
        boolean z10 = aVar == i7Var.getTag();
        boolean z11 = i10 != this.e.size() - 1;
        i7Var.setTag(aVar);
        q7 q7Var = this.n;
        if (aVar.f == null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.out = true;
            tL_message.id = i10;
            tL_message.peer_id = new TLRPC.TL_peerUser();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.from_id = tL_peerUser;
            TLRPC.Peer peer = tL_message.peer_id;
            long clientUserId = UserConfig.getInstance(q7Var.d.getCurrentAccount()).getClientUserId();
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
                f5.c cVar = new f5.c();
                aVar.e = cVar;
                cVar.a = true;
                Utilities.globalQueue.postRunnable(new u1(q7Var, aVar, tL_documentAttributeAudio, 4));
            }
            tL_documentAttributeAudio.flags |= 3;
            tL_message.media.document.attributes.add(tL_documentAttributeAudio);
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = aVar.a.getName();
            tL_message.media.document.attributes.add(tL_documentAttributeFilename);
            MessageObject messageObject = new MessageObject(q7Var.d.getCurrentAccount(), tL_message, false, false);
            aVar.f = messageObject;
            messageObject.mediaExists = true;
        }
        f7Var.f(aVar.f, z11);
        boolean z12 = aVar.e.a;
        boolean z13 = !z12;
        if (!z10) {
            f7Var.c0 = !z12 ? 1.0f : 0.0f;
        }
        if (f7Var.b0 != z13) {
            f7Var.b0 = z13;
            f7Var.invalidate();
        }
        i7Var.d = z11;
        i7Var.c.setText(AndroidUtilities.formatFileSize(aVar.c));
        i7Var.a.a(this.n.f.j.contains(aVar), z10);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        i7 i7Var = new i7(this, viewGroup.getContext(), 1);
        i7Var.e = 3;
        n7 n7Var = new n7(this, viewGroup.getContext(), i7Var);
        n7Var.setCheckForButtonPress(true);
        i7Var.b.addView(n7Var);
        return new org.telegram.ui.Components.vk0(i7Var);
    }
}
