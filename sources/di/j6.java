package di;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j6 extends q6 {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public j6(int i7, long j3, String str, y5 y5Var) {
        super(i7, j3, 4, -1, y5Var);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = 0;
        this.E = str;
    }

    @Override // di.q6
    public final void C(ArrayList arrayList, boolean z9) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
        int i7 = this.c;
        reorderpreviewmedias.bot = qp.s1(i7).o1(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            ij f10 = f(num.intValue());
            if (f10 != null) {
                reorderpreviewmedias.order.add(qp.Z4(f10.l.media));
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
            ij ijVar = (ij) arrayList2.get(i7);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (qp.t0(ijVar.l.media, (TLRPC.MessageMedia) arrayList.get(i10))) {
                    arrayList2.remove(i7);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && ijVar.f1() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(ijVar.f1());
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
        deletepreviewmedia.bot = qp.s1(i11).o1(this.d);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            deletepreviewmedia.media.add(qp.Z4((TLRPC.MessageMedia) arrayList.get(i12)));
        }
        ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        n6 n6Var = this.q;
        org.telegram.messenger.g0.r(n6Var);
        org.telegram.messenger.g0.h3(n6Var);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        ij ijVar;
        int f12;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i7 = 0;
        while (true) {
            arrayList = this.i;
            if (i7 >= arrayList.size()) {
                ijVar = null;
                i7 = 0;
                break;
            }
            ijVar = (ij) arrayList.get(i7);
            if (inputMedia != null && (storyItem = ijVar.l) != null && (messageMedia = storyItem.media) != null) {
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
        if (ijVar != null) {
            arrayList.remove(ijVar);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i7 > 0 && i7 < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i7);
            }
        }
        i6 i6Var = new i6(this, this.d, botpreviewmedia);
        ij ijVar2 = new ij(this.c, i6Var);
        TLRPC.Message message = ijVar2.k;
        if (ijVar == null) {
            f12 = this.I;
            this.I = f12 + 1;
        } else {
            f12 = ijVar.f1();
        }
        message.id = f12;
        i6Var.id = f12;
        ijVar2.j = this;
        ijVar2.r0(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i7, Integer.valueOf(ijVar2.f1()));
        arrayList.add(i7, ijVar2);
        n6 n6Var = this.q;
        org.telegram.messenger.g0.r(n6Var);
        org.telegram.messenger.g0.h3(n6Var);
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
            getpreviewinfo.bot = qp.s1(i7).o1(j3);
            getpreviewinfo.lang_code = str;
            getpreviewmedias = getpreviewinfo;
        } else {
            TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
            getpreviewmedias2.bot = qp.s1(i7).o1(j3);
            getpreviewmedias = getpreviewmedias2;
        }
        this.C = true;
        this.F = ConnectionsManager.getInstance(i7).sendRequest(getpreviewmedias, new bi.j(9, this, runnable));
        return true;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        i6 i6Var = new i6(this, this.d, botpreviewmedia);
        ij ijVar = new ij(this.c, i6Var);
        TLRPC.Message message = ijVar.k;
        int i7 = this.I;
        this.I = i7 + 1;
        message.id = i7;
        i6Var.id = i7;
        ijVar.j = this;
        ijVar.r0(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(ijVar.f1()));
        this.i.add(0, ijVar);
        n6 n6Var = this.q;
        org.telegram.messenger.g0.r(n6Var);
        org.telegram.messenger.g0.h3(n6Var);
    }

    @Override // di.q6
    public final ij f(int i7) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((ij) arrayList.get(i10)).f1() == i7) {
                return (ij) arrayList.get(i10);
            }
            i10++;
        }
    }

    @Override // di.q6
    public final int g() {
        return this.i.size();
    }

    @Override // di.q6
    public final ArrayList h() {
        return this.H;
    }

    @Override // di.q6
    public final int i() {
        return this.i.size();
    }

    @Override // di.q6
    public final boolean k() {
        return this.C;
    }

    @Override // di.q6
    public final boolean l() {
        return false;
    }

    @Override // di.q6
    public final boolean q(int i7, List list, boolean z9) {
        return H(null);
    }

    @Override // di.q6
    public final boolean r(int i7) {
        return false;
    }

    @Override // di.q6
    public final void j() {
    }

    @Override // di.q6
    public final void s() {
    }

    @Override // di.q6
    public final void x() {
    }
}
