package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class iv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ lv f;

    public iv(int i10, ArrayList arrayList, lv lvVar) {
        this.f = lvVar;
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
                    nx nxVar = new nx();
                    long j10 = document.id;
                    for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                    }
                    nxVar.a = tL_messages_stickerSet;
                    nxVar.b = document.id;
                    this.c[i10].add(nxVar);
                    if (this.f.E) {
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

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ActionBar.f6 f6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.b.size(); i12++) {
                if (this.b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.a.get(i12), true);
                    if (this.b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        lv lvVar = this.f;
                        lvVar.dismiss();
                        Context context = lvVar.getContext();
                        org.telegram.ui.ActionBar.p2 p2Var = lvVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.a.get(i12);
                        org.telegram.ui.ActionBar.p2 p2Var2 = lvVar.c;
                        org.telegram.ui.lk lkVar = p2Var2 instanceof org.telegram.ui.zn ? ((org.telegram.ui.zn) p2Var2).V : null;
                        f6Var = ((org.telegram.ui.ActionBar.g3) lvVar).resourcesProvider;
                        new xx0(context, p2Var, inputStickerSet, null, lkVar, f6Var).show();
                        return;
                    }
                    this.b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            lv lvVar2 = ((vu) this).h;
            lvVar2.a0();
            org.telegram.ui.m3 m3Var = lvVar2.h;
            if (m3Var == null || m3Var.getAdapter() == null) {
                return;
            }
            m3Var.getAdapter().l();
        }
    }
}
