package oh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d6 extends l6 {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public d6(int i10, long j10, String str, dg.h0 h0Var) {
        super(i10, j10, 4, -1, h0Var);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = 0;
        this.E = str;
    }

    @Override // oh.l6
    public final void C(ArrayList arrayList, boolean z4) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
        int i10 = this.c;
        reorderpreviewmedias.bot = MessagesController.getInstance(i10).getInputUser(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            Integer num = (Integer) obj;
            MessageObject f10 = f(num.intValue());
            if (f10 != null) {
                reorderpreviewmedias.order.add(MessagesController.toInputMedia(f10.storyItem.media));
                arrayList2.add(f10);
                arrayList3.add(num);
            }
        }
        ConnectionsManager.getInstance(i10).sendRequest(reorderpreviewmedias, null);
        ArrayList arrayList4 = this.H;
        if (arrayList4.isEmpty()) {
            arrayList4.add(new ArrayList());
        }
        ((ArrayList) arrayList4.get(0)).clear();
        ((ArrayList) arrayList4.get(0)).addAll(arrayList3);
        ArrayList arrayList5 = this.i;
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
    }

    public final void F(ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i10 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    break;
                }
                if (MessagesController.equals(messageObject.storyItem.media, (TLRPC.MessageMedia) arrayList.get(i11))) {
                    arrayList2.remove(i10);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && messageObject.getId() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(messageObject.getId());
                    }
                    i10--;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
        int i12 = this.c;
        deletepreviewmedia.bot = MessagesController.getInstance(i12).getInputUser(this.d);
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            deletepreviewmedia.media.add(MessagesController.toInputMedia((TLRPC.MessageMedia) arrayList.get(i13)));
        }
        ConnectionsManager.getInstance(i12).sendRequest(deletepreviewmedia, null);
        i6 i6Var = this.q;
        AndroidUtilities.cancelRunOnUIThread(i6Var);
        AndroidUtilities.runOnUIThread(i6Var);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        MessageObject messageObject;
        int id2;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i10 = 0;
        while (true) {
            arrayList = this.i;
            if (i10 >= arrayList.size()) {
                messageObject = null;
                i10 = 0;
                break;
            }
            messageObject = (MessageObject) arrayList.get(i10);
            if (inputMedia != null && (storyItem = messageObject.storyItem) != null && (messageMedia = storyItem.media) != null) {
                if (!(inputMedia instanceof TLRPC.TL_inputMediaPhoto)) {
                    if ((inputMedia instanceof TLRPC.TL_inputMediaDocument) && (document = messageMedia.document) != null && document.id == ((TLRPC.TL_inputMediaDocument) inputMedia).id.id) {
                        break;
                    }
                } else {
                    TLRPC.Photo photo = messageMedia.photo;
                    if (photo != null && photo.id == ((TLRPC.TL_inputMediaPhoto) inputMedia).id.id) {
                        break;
                    }
                }
            }
            i10++;
        }
        ArrayList arrayList2 = this.H;
        if (messageObject != null) {
            arrayList.remove(messageObject);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i10 > 0 && i10 < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i10);
            }
        }
        MessageObject messageObject2 = new MessageObject(this.c, new c6(this, this.d, botpreviewmedia));
        TL_stories.StoryItem storyItem2 = messageObject2.storyItem;
        TLRPC.Message message = messageObject2.messageOwner;
        if (messageObject == null) {
            id2 = this.I;
            this.I = id2 + 1;
        } else {
            id2 = messageObject.getId();
        }
        message.id = id2;
        storyItem2.id = id2;
        messageObject2.parentStoriesList = this;
        messageObject2.generateThumbs(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i10, Integer.valueOf(messageObject2.getId()));
        arrayList.add(i10, messageObject2);
        i6 i6Var = this.q;
        AndroidUtilities.cancelRunOnUIThread(i6Var);
        AndroidUtilities.runOnUIThread(i6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (this.C || this.D) {
            return false;
        }
        long j10 = this.d;
        String str = this.E;
        int i10 = this.c;
        if (str != null) {
            TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
            getpreviewinfo.bot = MessagesController.getInstance(i10).getInputUser(j10);
            getpreviewinfo.lang_code = str;
            getpreviewmedias = getpreviewinfo;
        } else {
            TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
            getpreviewmedias2.bot = MessagesController.getInstance(i10).getInputUser(j10);
            getpreviewmedias = getpreviewmedias2;
        }
        this.C = true;
        this.F = ConnectionsManager.getInstance(i10).sendRequest(getpreviewmedias, new eg.b3(13, this, runnable));
        return true;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        MessageObject messageObject = new MessageObject(this.c, new c6(this, this.d, botpreviewmedia));
        TL_stories.StoryItem storyItem = messageObject.storyItem;
        TLRPC.Message message = messageObject.messageOwner;
        int i10 = this.I;
        this.I = i10 + 1;
        message.id = i10;
        storyItem.id = i10;
        messageObject.parentStoriesList = this;
        messageObject.generateThumbs(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(messageObject.getId()));
        this.i.add(0, messageObject);
        i6 i6Var = this.q;
        AndroidUtilities.cancelRunOnUIThread(i6Var);
        AndroidUtilities.runOnUIThread(i6Var);
    }

    @Override // oh.l6
    public final MessageObject f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i11 >= arrayList.size()) {
                return null;
            }
            if (((MessageObject) arrayList.get(i11)).getId() == i10) {
                return (MessageObject) arrayList.get(i11);
            }
            i11++;
        }
    }

    @Override // oh.l6
    public final int g() {
        return this.i.size();
    }

    @Override // oh.l6
    public final ArrayList h() {
        return this.H;
    }

    @Override // oh.l6
    public final int i() {
        return this.i.size();
    }

    @Override // oh.l6
    public final boolean k() {
        return this.C;
    }

    @Override // oh.l6
    public final boolean l() {
        return false;
    }

    @Override // oh.l6
    public final boolean q(int i10, List list, boolean z4) {
        return H(null);
    }

    @Override // oh.l6
    public final boolean r(int i10) {
        return false;
    }

    @Override // oh.l6
    public final void j() {
    }

    @Override // oh.l6
    public final void s() {
    }

    @Override // oh.l6
    public final void x() {
    }
}
