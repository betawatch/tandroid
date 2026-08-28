package ih;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class f6 extends n6 {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public f6(int i9, long j10, String str, bg.i iVar) {
        super(i9, j10, 4, -1, iVar);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = 0;
        this.E = str;
    }

    @Override // ih.n6
    public final void C(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
        int i9 = this.c;
        reorderpreviewmedias.bot = MessagesController.getInstance(i9).getInputUser(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            MessageObject f10 = f(num.intValue());
            if (f10 != null) {
                reorderpreviewmedias.order.add(MessagesController.toInputMedia(f10.storyItem.media));
                arrayList2.add(f10);
                arrayList3.add(num);
            }
        }
        ConnectionsManager.getInstance(i9).sendRequest(reorderpreviewmedias, null);
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
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i9 >= arrayList2.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList2.get(i9);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (MessagesController.equals(messageObject.storyItem.media, (TLRPC.MessageMedia) arrayList.get(i10))) {
                    arrayList2.remove(i9);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && messageObject.getId() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(messageObject.getId());
                    }
                    i9--;
                } else {
                    i10++;
                }
            }
            i9++;
        }
        TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
        int i11 = this.c;
        deletepreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(this.d);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            deletepreviewmedia.media.add(MessagesController.toInputMedia((TLRPC.MessageMedia) arrayList.get(i12)));
        }
        ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        k6 k6Var = this.q;
        AndroidUtilities.cancelRunOnUIThread(k6Var);
        AndroidUtilities.runOnUIThread(k6Var);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        MessageObject messageObject;
        int id2;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i9 = 0;
        while (true) {
            arrayList = this.i;
            if (i9 >= arrayList.size()) {
                messageObject = null;
                i9 = 0;
                break;
            }
            messageObject = (MessageObject) arrayList.get(i9);
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
            i9++;
        }
        ArrayList arrayList2 = this.H;
        if (messageObject != null) {
            arrayList.remove(messageObject);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i9 > 0 && i9 < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i9);
            }
        }
        MessageObject messageObject2 = new MessageObject(this.c, new e6(this, this.d, botpreviewmedia));
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
        ((ArrayList) arrayList2.get(0)).add(i9, Integer.valueOf(messageObject2.getId()));
        arrayList.add(i9, messageObject2);
        k6 k6Var = this.q;
        AndroidUtilities.cancelRunOnUIThread(k6Var);
        AndroidUtilities.runOnUIThread(k6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (this.C || this.D) {
            return false;
        }
        long j10 = this.d;
        String str = this.E;
        int i9 = this.c;
        if (str != null) {
            TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
            getpreviewinfo.bot = MessagesController.getInstance(i9).getInputUser(j10);
            getpreviewinfo.lang_code = str;
            getpreviewmedias = getpreviewinfo;
        } else {
            TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
            getpreviewmedias2.bot = MessagesController.getInstance(i9).getInputUser(j10);
            getpreviewmedias = getpreviewmedias2;
        }
        this.C = true;
        this.F = ConnectionsManager.getInstance(i9).sendRequest(getpreviewmedias, new bg.j0(12, this, runnable));
        return true;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        MessageObject messageObject = new MessageObject(this.c, new e6(this, this.d, botpreviewmedia));
        TL_stories.StoryItem storyItem = messageObject.storyItem;
        TLRPC.Message message = messageObject.messageOwner;
        int i9 = this.I;
        this.I = i9 + 1;
        message.id = i9;
        storyItem.id = i9;
        messageObject.parentStoriesList = this;
        messageObject.generateThumbs(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(messageObject.getId()));
        this.i.add(0, messageObject);
        k6 k6Var = this.q;
        AndroidUtilities.cancelRunOnUIThread(k6Var);
        AndroidUtilities.runOnUIThread(k6Var);
    }

    @Override // ih.n6
    public final MessageObject f(int i9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((MessageObject) arrayList.get(i10)).getId() == i9) {
                return (MessageObject) arrayList.get(i10);
            }
            i10++;
        }
    }

    @Override // ih.n6
    public final int g() {
        return this.i.size();
    }

    @Override // ih.n6
    public final ArrayList h() {
        return this.H;
    }

    @Override // ih.n6
    public final int i() {
        return this.i.size();
    }

    @Override // ih.n6
    public final boolean k() {
        return this.C;
    }

    @Override // ih.n6
    public final boolean l() {
        return false;
    }

    @Override // ih.n6
    public final boolean q(int i9, List list, boolean z10) {
        return H(null);
    }

    @Override // ih.n6
    public final boolean r(int i9) {
        return false;
    }

    @Override // ih.n6
    public final void j() {
    }

    @Override // ih.n6
    public final void s() {
    }

    @Override // ih.n6
    public final void x() {
    }
}
