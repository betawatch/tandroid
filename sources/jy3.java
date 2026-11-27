// default package

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class jy3 implements fn7 {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ ly3 f;

    public jy3(ly3 ly3Var, int i, ArrayList arrayList) {
        this.f = ly3Var;
        this.d = i;
        this.a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        ArrayList<Long> arrayList;
        if (i >= 0) {
            ArrayList[] arrayListArr = this.c;
            if (i < arrayListArr.length) {
                if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                    arrayListArr[i] = new ArrayList(12);
                    for (int i2 = 0; i2 < 12; i2++) {
                        this.c[i].add(null);
                    }
                    return;
                }
                arrayListArr[i] = new ArrayList();
                for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                    TLRPC.Document document = tL_messages_stickerSet.documents.get(i3);
                    if (document == null) {
                        this.c[i].add(null);
                    } else {
                        u04 u04Var = new u04();
                        long j = document.id;
                        for (int i4 = 0; i4 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i4).documents) == null || !arrayList.contains(Long.valueOf(j))); i4++) {
                        }
                        u04Var.a = tL_messages_stickerSet;
                        u04Var.b = document.id;
                        this.c[i].add(u04Var);
                        if (this.f.B1) {
                            TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                            if (this.c[i].size() >= ((stickerSet == null || stickerSet.emojis) ? 16 : 10)) {
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        if (i == jn7.B0) {
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                if (this.b.get(i3) == null) {
                    ls6 d0 = ls6.d0(this.d);
                    ArrayList arrayList = this.a;
                    TLRPC.TL_messages_stickerSet n0 = d0.n0((TLRPC.InputStickerSet) arrayList.get(i3), true);
                    if (this.b.size() == 1 && n0 != null && (stickerSet = n0.set) != null && !stickerSet.emojis) {
                        ly3 ly3Var = this.f;
                        ly3Var.dismiss();
                        Context context = ly3Var.getContext();
                        e eVar = ly3Var.m1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i3);
                        e eVar2 = ly3Var.m1;
                        new s4b(context, eVar, inputStickerSet, null, eVar2 instanceof zu1 ? ((zu1) eVar2).a0 : null, ly3Var.J0).show();
                        return;
                    }
                    this.b.set(i3, n0);
                    if (n0 != null) {
                        a(i3, n0);
                    }
                }
            }
            ly3 ly3Var2 = ((xx3) this).h;
            ly3Var2.J0();
            iw iwVar = ly3Var2.q1;
            if (iwVar == null || iwVar.getAdapter() == null) {
                return;
            }
            iwVar.getAdapter().f();
        }
    }
}
