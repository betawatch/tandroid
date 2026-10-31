package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class av implements org.telegram.messenger.us {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ cv f;

    public av(int i10, ArrayList arrayList, cv cvVar) {
        this.f = cvVar;
        this.d = i10;
        this.a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        ArrayList<Long> arrayList;
        if (i10 >= 0) {
            ArrayList[] arrayListArr = this.c;
            if (i10 >= arrayListArr.length) {
                return;
            }
            if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                arrayListArr[i10] = new ArrayList(12);
                for (int i11 = 0; i11 < 12; i11++) {
                    this.c[i10].add(null);
                }
                return;
            }
            arrayListArr[i10] = new ArrayList();
            for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i12);
                if (document == null) {
                    this.c[i10].add(null);
                } else {
                    ax axVar = new ax();
                    long j10 = document.id;
                    for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                    }
                    axVar.a = tL_messages_stickerSet;
                    axVar.b = document.id;
                    this.c[i10].add(axVar);
                    if (this.f.y1) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (this.c[i10].size() >= ((stickerSet == null || stickerSet.emojis) ? 16 : 10)) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        if (i10 == org.telegram.messenger.zs.B0) {
            for (int i12 = 0; i12 < this.b.size(); i12++) {
                if (this.b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.d).m0((TLRPC.InputStickerSet) this.a.get(i12), true);
                    if (this.b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        cv cvVar = this.f;
                        cvVar.dismiss();
                        Context context = cvVar.getContext();
                        org.telegram.ui.ActionBar.k2 k2Var = cvVar.j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.a.get(i12);
                        org.telegram.ui.ActionBar.k2 k2Var2 = cvVar.j1;
                        new cx0(context, k2Var, inputStickerSet, null, k2Var2 instanceof org.telegram.ui.un ? ((org.telegram.ui.un) k2Var2).Z : null, cvVar.I0).show();
                        return;
                    }
                    this.b.set(i12, m0);
                    if (m0 != null) {
                        a(i12, m0);
                    }
                }
            }
            cv cvVar2 = ((ou) this).h;
            cvVar2.N0();
            org.telegram.ui.g3 g3Var = cvVar2.n1;
            if (g3Var == null || g3Var.getAdapter() == null) {
                return;
            }
            g3Var.getAdapter().f();
        }
    }
}
