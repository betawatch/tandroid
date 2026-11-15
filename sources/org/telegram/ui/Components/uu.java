package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class uu implements org.telegram.messenger.is {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ wu f;

    public uu(int i7, ArrayList arrayList, wu wuVar) {
        this.f = wuVar;
        this.d = i7;
        this.a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i7, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        ArrayList<Long> arrayList;
        if (i7 >= 0) {
            ArrayList[] arrayListArr = this.c;
            if (i7 >= arrayListArr.length) {
                return;
            }
            if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                arrayListArr[i7] = new ArrayList(12);
                for (int i10 = 0; i10 < 12; i10++) {
                    this.c[i7].add(null);
                }
                return;
            }
            arrayListArr[i7] = new ArrayList();
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                if (document == null) {
                    this.c[i7].add(null);
                } else {
                    rw rwVar = new rw();
                    long j3 = document.id;
                    for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                    }
                    rwVar.a = tL_messages_stickerSet;
                    rwVar.b = document.id;
                    this.c[i7].add(rwVar);
                    if (this.f.C1) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (this.c[i7].size() >= ((stickerSet == null || stickerSet.emojis) ? 16 : 10)) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        if (i7 == org.telegram.messenger.ns.B0) {
            for (int i11 = 0; i11 < this.b.size(); i11++) {
                if (this.b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.si.b0(this.d).m0((TLRPC.InputStickerSet) this.a.get(i11), true);
                    if (this.b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        wu wuVar = this.f;
                        wuVar.dismiss();
                        Context context = wuVar.getContext();
                        org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.a.get(i11);
                        org.telegram.ui.ActionBar.e2 e2Var2 = wuVar.n1;
                        new bw0(context, e2Var, inputStickerSet, null, e2Var2 instanceof org.telegram.ui.an ? ((org.telegram.ui.an) e2Var2).a0 : null, wuVar.J0).show();
                        return;
                    }
                    this.b.set(i11, m0);
                    if (m0 != null) {
                        a(i11, m0);
                    }
                }
            }
            wu wuVar2 = ((iu) this).h;
            wuVar2.N0();
            hi.v vVar = wuVar2.r1;
            if (vVar == null || vVar.getAdapter() == null) {
                return;
            }
            vVar.getAdapter().f();
        }
    }
}
