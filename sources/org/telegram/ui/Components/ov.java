package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class ov implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ rv f;

    public ov(int i10, ArrayList arrayList, rv rvVar) {
        this.f = rvVar;
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
                    px pxVar = new px();
                    long j3 = document.id;
                    for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j3))); i13++) {
                    }
                    pxVar.a = tL_messages_stickerSet;
                    pxVar.b = document.id;
                    this.c[i10].add(pxVar);
                    if (this.f.H) {
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
                        rv rvVar = this.f;
                        rvVar.dismiss();
                        Context context = rvVar.getContext();
                        org.telegram.ui.ActionBar.n2 n2Var = rvVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.a.get(i12);
                        org.telegram.ui.ActionBar.n2 n2Var2 = rvVar.c;
                        org.telegram.ui.mk mkVar = n2Var2 instanceof org.telegram.ui.co ? ((org.telegram.ui.co) n2Var2).Y : null;
                        f6Var = ((org.telegram.ui.ActionBar.f3) rvVar).resourcesProvider;
                        new ux0(context, n2Var, inputStickerSet, null, mkVar, f6Var).show();
                        return;
                    }
                    this.b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            rv rvVar2 = ((bv) this).h;
            rvVar2.a0();
            di.v vVar = rvVar2.h;
            if (vVar == null || vVar.getAdapter() == null) {
                return;
            }
            vVar.getAdapter().l();
        }
    }
}
