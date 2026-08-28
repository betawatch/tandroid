package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class av implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ dv f;

    public av(int i9, ArrayList arrayList, dv dvVar) {
        this.f = dvVar;
        this.d = i9;
        this.a = arrayList == null ? new ArrayList() : arrayList;
    }

    public final void a(int i9, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        ArrayList<Long> arrayList;
        if (i9 >= 0) {
            ArrayList[] arrayListArr = this.c;
            if (i9 >= arrayListArr.length) {
                return;
            }
            if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                arrayListArr[i9] = new ArrayList(12);
                for (int i10 = 0; i10 < 12; i10++) {
                    this.c[i9].add(null);
                }
                return;
            }
            arrayListArr[i9] = new ArrayList();
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                TLRPC.Document document = tL_messages_stickerSet.documents.get(i11);
                if (document == null) {
                    this.c[i9].add(null);
                } else {
                    bx bxVar = new bx();
                    long j10 = document.id;
                    for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j10))); i12++) {
                    }
                    bxVar.a = tL_messages_stickerSet;
                    bxVar.b = document.id;
                    this.c[i9].add(bxVar);
                    if (this.f.D) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (this.c[i9].size() >= ((stickerSet == null || stickerSet.emojis) ? 16 : 10)) {
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.ActionBar.b6 b6Var;
        if (i9 == NotificationCenter.groupStickersDidLoad) {
            for (int i11 = 0; i11 < this.b.size(); i11++) {
                if (this.b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.a.get(i11), true);
                    if (this.b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        dv dvVar = this.f;
                        dvVar.dismiss();
                        Context context = dvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = dvVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.a.get(i11);
                        org.telegram.ui.ActionBar.o2 o2Var2 = dvVar.c;
                        org.telegram.ui.ak akVar = o2Var2 instanceof org.telegram.ui.qn ? ((org.telegram.ui.qn) o2Var2).U : null;
                        b6Var = ((org.telegram.ui.ActionBar.f3) dvVar).resourcesProvider;
                        new cx0(context, o2Var, inputStickerSet, null, akVar, b6Var).show();
                        return;
                    }
                    this.b.set(i11, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i11, stickerSet2);
                    }
                }
            }
            dv dvVar2 = ((nu) this).h;
            dvVar2.Z();
            kh.w wVar = dvVar2.h;
            if (wVar == null || wVar.getAdapter() == null) {
                return;
            }
            wVar.getAdapter().l();
        }
    }
}
