package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class zu implements org.telegram.messenger.fs {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ bv f;

    public zu(int i7, ArrayList arrayList, bv bvVar) {
        this.f = bvVar;
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
                    ww wwVar = new ww();
                    long j3 = document.id;
                    for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                    }
                    wwVar.a = tL_messages_stickerSet;
                    wwVar.b = document.id;
                    this.c[i7].add(wwVar);
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

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        if (i7 == org.telegram.messenger.ks.B0) {
            for (int i11 = 0; i11 < this.b.size(); i11++) {
                if (this.b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet o02 = org.telegram.messenger.ri.d0(this.d).o0((TLRPC.InputStickerSet) this.a.get(i11), true);
                    if (this.b.size() == 1 && o02 != null && (stickerSet = o02.set) != null && !stickerSet.emojis) {
                        bv bvVar = this.f;
                        bvVar.dismiss();
                        Context context = bvVar.getContext();
                        org.telegram.ui.ActionBar.g2 g2Var = bvVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.a.get(i11);
                        org.telegram.ui.ActionBar.g2 g2Var2 = bvVar.n1;
                        new jw0(context, g2Var, inputStickerSet, null, g2Var2 instanceof org.telegram.ui.bn ? ((org.telegram.ui.bn) g2Var2).a0 : null, bvVar.J0).show();
                        return;
                    }
                    this.b.set(i11, o02);
                    if (o02 != null) {
                        a(i11, o02);
                    }
                }
            }
            bv bvVar2 = ((nu) this).h;
            bvVar2.O0();
            hi.e0 e0Var = bvVar2.r1;
            if (e0Var == null || e0Var.getAdapter() == null) {
                return;
            }
            e0Var.getAdapter().f();
        }
    }
}
