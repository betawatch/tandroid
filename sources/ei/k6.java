package ei;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k6 extends r6 {
    public boolean C;
    public boolean D;
    public final String E;
    public int F;
    public final ArrayList G;
    public final ArrayList H;
    public int I;

    public k6(int i3, long j10, String str, y5 y5Var) {
        super(i3, j10, 4, -1, y5Var);
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.I = 0;
        this.E = str;
    }

    @Override // ei.r6
    public final void C(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        TL_bots.reorderPreviewMedias reorderpreviewmedias = new TL_bots.reorderPreviewMedias();
        int i3 = this.c;
        reorderpreviewmedias.bot = hp.s1(i3).o1(this.d);
        reorderpreviewmedias.lang_code = this.E;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Integer num = (Integer) obj;
            zi f10 = f(num.intValue());
            if (f10 != null) {
                reorderpreviewmedias.order.add(hp.Z4(f10.l.media));
                arrayList2.add(f10);
                arrayList3.add(num);
            }
        }
        ConnectionsManager.getInstance(i3).sendRequest(reorderpreviewmedias, null);
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
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.i;
            if (i3 >= arrayList2.size()) {
                break;
            }
            zi ziVar = (zi) arrayList2.get(i3);
            int i10 = 0;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (hp.t0(ziVar.l.media, (TLRPC.MessageMedia) arrayList.get(i10))) {
                    arrayList2.remove(i3);
                    ArrayList arrayList3 = this.H;
                    if (!arrayList3.isEmpty() && ziVar.f1() < ((ArrayList) arrayList3.get(0)).size()) {
                        ((ArrayList) arrayList3.get(0)).remove(ziVar.f1());
                    }
                    i3--;
                } else {
                    i10++;
                }
            }
            i3++;
        }
        TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
        int i11 = this.c;
        deletepreviewmedia.bot = hp.s1(i11).o1(this.d);
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            deletepreviewmedia.media.add(hp.Z4((TLRPC.MessageMedia) arrayList.get(i12)));
        }
        ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        o6 o6Var = this.q;
        org.telegram.messenger.g0.r(o6Var);
        org.telegram.messenger.g0.h3(o6Var);
    }

    public final void G(TLRPC.InputMedia inputMedia, TL_bots.botPreviewMedia botpreviewmedia) {
        ArrayList arrayList;
        zi ziVar;
        int f12;
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        int i3 = 0;
        while (true) {
            arrayList = this.i;
            if (i3 >= arrayList.size()) {
                ziVar = null;
                i3 = 0;
                break;
            }
            ziVar = (zi) arrayList.get(i3);
            if (inputMedia != null && (storyItem = ziVar.l) != null && (messageMedia = storyItem.media) != null) {
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
            i3++;
        }
        ArrayList arrayList2 = this.H;
        if (ziVar != null) {
            arrayList.remove(ziVar);
            if (arrayList2.isEmpty()) {
                arrayList2.add(new ArrayList());
            }
            if (i3 > 0 && i3 < ((ArrayList) arrayList2.get(0)).size()) {
                ((ArrayList) arrayList2.get(0)).remove(i3);
            }
        }
        j6 j6Var = new j6(this, this.d, botpreviewmedia);
        zi ziVar2 = new zi(this.c, j6Var);
        TLRPC.Message message = ziVar2.k;
        if (ziVar == null) {
            f12 = this.I;
            this.I = f12 + 1;
        } else {
            f12 = ziVar.f1();
        }
        message.id = f12;
        j6Var.id = f12;
        ziVar2.j = this;
        ziVar2.r0(false);
        if (arrayList2.isEmpty()) {
            arrayList2.add(new ArrayList());
        }
        ((ArrayList) arrayList2.get(0)).add(i3, Integer.valueOf(ziVar2.f1()));
        arrayList.add(i3, ziVar2);
        o6 o6Var = this.q;
        org.telegram.messenger.g0.r(o6Var);
        org.telegram.messenger.g0.h3(o6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H(Runnable runnable) {
        TL_bots.getPreviewMedias getpreviewmedias;
        if (this.C || this.D) {
            return false;
        }
        long j10 = this.d;
        String str = this.E;
        int i3 = this.c;
        if (str != null) {
            TL_bots.getPreviewInfo getpreviewinfo = new TL_bots.getPreviewInfo();
            getpreviewinfo.bot = hp.s1(i3).o1(j10);
            getpreviewinfo.lang_code = str;
            getpreviewmedias = getpreviewinfo;
        } else {
            TL_bots.getPreviewMedias getpreviewmedias2 = new TL_bots.getPreviewMedias();
            getpreviewmedias2.bot = hp.s1(i3).o1(j10);
            getpreviewmedias = getpreviewmedias2;
        }
        this.C = true;
        this.F = ConnectionsManager.getInstance(i3).sendRequest(getpreviewmedias, new ai.f3(12, this, runnable));
        return true;
    }

    public final void I(TL_bots.botPreviewMedia botpreviewmedia) {
        j6 j6Var = new j6(this, this.d, botpreviewmedia);
        zi ziVar = new zi(this.c, j6Var);
        TLRPC.Message message = ziVar.k;
        int i3 = this.I;
        this.I = i3 + 1;
        message.id = i3;
        j6Var.id = i3;
        ziVar.j = this;
        ziVar.r0(false);
        ArrayList arrayList = this.H;
        if (arrayList.isEmpty()) {
            arrayList.add(new ArrayList());
        }
        ((ArrayList) arrayList.get(0)).add(0, Integer.valueOf(ziVar.f1()));
        this.i.add(0, ziVar);
        o6 o6Var = this.q;
        org.telegram.messenger.g0.r(o6Var);
        org.telegram.messenger.g0.h3(o6Var);
    }

    @Override // ei.r6
    public final zi f(int i3) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i10 >= arrayList.size()) {
                return null;
            }
            if (((zi) arrayList.get(i10)).f1() == i3) {
                return (zi) arrayList.get(i10);
            }
            i10++;
        }
    }

    @Override // ei.r6
    public final int g() {
        return this.i.size();
    }

    @Override // ei.r6
    public final ArrayList h() {
        return this.H;
    }

    @Override // ei.r6
    public final int i() {
        return this.i.size();
    }

    @Override // ei.r6
    public final boolean k() {
        return this.C;
    }

    @Override // ei.r6
    public final boolean l() {
        return false;
    }

    @Override // ei.r6
    public final boolean q(int i3, List list, boolean z10) {
        return H(null);
    }

    @Override // ei.r6
    public final boolean r(int i3) {
        return false;
    }

    @Override // ei.r6
    public final void j() {
    }

    @Override // ei.r6
    public final void s() {
    }

    @Override // ei.r6
    public final void x() {
    }
}
