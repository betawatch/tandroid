package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class nu implements org.telegram.messenger.cs {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ pu f;

    public nu(int i3, ArrayList arrayList, pu puVar) {
        this.f = puVar;
        this.d = i3;
        this.a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i3, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        ArrayList<Long> arrayList;
        if (i3 >= 0) {
            ArrayList[] arrayListArr = this.c;
            if (i3 >= arrayListArr.length) {
                return;
            }
            if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                arrayListArr[i3] = new ArrayList(12);
                for (int i10 = 0; i10 < 12; i10++) {
                    this.c[i3].add(null);
                }
                return;
            }
            arrayListArr[i3] = new ArrayList();
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                if (document == null) {
                    this.c[i3].add(null);
                } else {
                    kw kwVar = new kw();
                    long j10 = document.id;
                    for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j10))); i12++) {
                    }
                    kwVar.a = tL_messages_stickerSet;
                    kwVar.b = document.id;
                    this.c[i3].add(kwVar);
                    if (this.f.z1) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (this.c[i3].size() >= ((stickerSet == null || stickerSet.emojis) ? 16 : 10)) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        if (i3 == org.telegram.messenger.hs.B0) {
            for (int i11 = 0; i11 < this.b.size(); i11++) {
                if (this.b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.li.b0(this.d).m0((TLRPC.InputStickerSet) this.a.get(i11), true);
                    if (this.b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        pu puVar = this.f;
                        puVar.dismiss();
                        Context context = puVar.getContext();
                        org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.a.get(i11);
                        org.telegram.ui.ActionBar.d2 d2Var2 = puVar.k1;
                        new xv0(context, d2Var, inputStickerSet, null, d2Var2 instanceof org.telegram.ui.wm ? ((org.telegram.ui.wm) d2Var2).a0 : null, puVar.J0).show();
                        return;
                    }
                    this.b.set(i11, m0);
                    if (m0 != null) {
                        a(i11, m0);
                    }
                }
            }
            pu puVar2 = ((bu) this).h;
            puVar2.N0();
            gi.v vVar = puVar2.o1;
            if (vVar == null || vVar.getAdapter() == null) {
                return;
            }
            vVar.getAdapter().f();
        }
    }
}
