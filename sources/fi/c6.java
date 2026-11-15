package fi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c6 extends k6 {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public c6(int i7, long j3, String str, q5 q5Var) {
        super(i7, j3, 4, -1, q5Var);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = 0;
        this.E = str;
    }

    @Override // fi.k6
    public final void C(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
        int i7 = this.c;
        reorderpreviewmedias.bot = np.s1(i7).o1(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            gj f10 = f(num.intValue());
            if (f10 != null) {
                reorderpreviewmedias.order.add(np.a5(f10.l.media));
                arrayList2.add(f10);
                arrayList3.add(num);
            }
        }
        ConnectionsManager.getInstance(i7).sendRequest(reorderpreviewmedias, null);
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
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i7 >= arrayList2.size()) {
                break;
            }
            gj gjVar = (gj) arrayList2.get(i7);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (np.t0(gjVar.l.media, (TLRPC.MessageMedia) arrayList.get(i10))) {
                    arrayList2.remove(i7);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && gjVar.e1() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(gjVar.e1());
                    }
                    i7--;
                } else {
                    i10++;
                }
            }
            i7++;
        }
        TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
        int i11 = this.c;
        deletepreviewmedia.bot = np.s1(i11).o1(this.d);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            deletepreviewmedia.media.add(np.a5((TLRPC.MessageMedia) arrayList.get(i12)));
        }
        ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        h6 h6Var = this.q;
        org.telegram.messenger.g0.r(h6Var);
        org.telegram.messenger.g0.h3(h6Var);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        gj gjVar;
        int e12;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i7 = 0;
        while (true) {
            arrayList = this.i;
            if (i7 >= arrayList.size()) {
                gjVar = null;
                i7 = 0;
                break;
            }
            gjVar = (gj) arrayList.get(i7);
            if (inputMedia != null && (storyItem = gjVar.l) != null && (messageMedia = storyItem.media) != null) {
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
            i7++;
        }
        ArrayList arrayList2 = this.H;
        if (gjVar != null) {
            arrayList.remove(gjVar);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i7 > 0 && i7 < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i7);
            }
        }
        b6 b6Var = new b6(this, this.d, botpreviewmedia);
        gj gjVar2 = new gj(this.c, b6Var);
        TLRPC.Message message = gjVar2.k;
        if (gjVar == null) {
            e12 = this.I;
            this.I = e12 + 1;
        } else {
            e12 = gjVar.e1();
        }
        message.id = e12;
        b6Var.id = e12;
        gjVar2.j = this;
        gjVar2.r0(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i7, Integer.valueOf(gjVar2.e1()));
        arrayList.add(i7, gjVar2);
        h6 h6Var = this.q;
        org.telegram.messenger.g0.r(h6Var);
        org.telegram.messenger.g0.h3(h6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (this.C || this.D) {
            return false;
        }
        long j3 = this.d;
        String str = this.E;
        int i7 = this.c;
        if (str != null) {
            TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
            getpreviewinfo.bot = np.s1(i7).o1(j3);
            getpreviewinfo.lang_code = str;
            getpreviewmedias = getpreviewinfo;
        } else {
            TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
            getpreviewmedias2.bot = np.s1(i7).o1(j3);
            getpreviewmedias = getpreviewmedias2;
        }
        this.C = true;
        this.F = ConnectionsManager.getInstance(i7).sendRequest(getpreviewmedias, new bi.v2(11, this, runnable));
        return true;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        b6 b6Var = new b6(this, this.d, botpreviewmedia);
        gj gjVar = new gj(this.c, b6Var);
        TLRPC.Message message = gjVar.k;
        int i7 = this.I;
        this.I = i7 + 1;
        message.id = i7;
        b6Var.id = i7;
        gjVar.j = this;
        gjVar.r0(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(gjVar.e1()));
        this.i.add(0, gjVar);
        h6 h6Var = this.q;
        org.telegram.messenger.g0.r(h6Var);
        org.telegram.messenger.g0.h3(h6Var);
    }

    @Override // fi.k6
    public final gj f(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((gj) arrayList.get(i10)).e1() == i7) {
                return (gj) arrayList.get(i10);
            }
            i10++;
        }
    }

    @Override // fi.k6
    public final int g() {
        return this.i.size();
    }

    @Override // fi.k6
    public final ArrayList h() {
        return this.H;
    }

    @Override // fi.k6
    public final int i() {
        return this.i.size();
    }

    @Override // fi.k6
    public final boolean k() {
        return this.C;
    }

    @Override // fi.k6
    public final boolean l() {
        return false;
    }

    @Override // fi.k6
    public final boolean q(int i7, List list, boolean z10) {
        return H(null);
    }

    @Override // fi.k6
    public final boolean r(int i7) {
        return false;
    }

    @Override // fi.k6
    public final void j() {
    }

    @Override // fi.k6
    public final void s() {
    }

    @Override // fi.k6
    public final void x() {
    }
}
