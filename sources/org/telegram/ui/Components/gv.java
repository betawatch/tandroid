package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class gv implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ jv f;

    public gv(int i10, ArrayList arrayList, jv jvVar) {
        this.f = jvVar;
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
                    ix ixVar = new ix();
                    long j10 = document.id;
                    for (int i13 = 0; i13 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i13).documents) == null || !arrayList.contains(Long.valueOf(j10))); i13++) {
                    }
                    ixVar.a = tL_messages_stickerSet;
                    ixVar.b = document.id;
                    this.c[i10].add(ixVar);
                    if (this.f.D) {
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
        org.telegram.ui.ActionBar.c6 c6Var;
        if (i10 == NotificationCenter.groupStickersDidLoad) {
            for (int i12 = 0; i12 < this.b.size(); i12++) {
                if (this.b.get(i12) == null) {
                    TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(this.d).getStickerSet((TLRPC.InputStickerSet) this.a.get(i12), true);
                    if (this.b.size() == 1 && stickerSet2 != null && (stickerSet = stickerSet2.set) != null && !stickerSet.emojis) {
                        jv jvVar = this.f;
                        jvVar.dismiss();
                        Context context = jvVar.getContext();
                        org.telegram.ui.ActionBar.o2 o2Var = jvVar.c;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.a.get(i12);
                        org.telegram.ui.ActionBar.o2 o2Var2 = jvVar.c;
                        org.telegram.ui.dk dkVar = o2Var2 instanceof org.telegram.ui.tn ? ((org.telegram.ui.tn) o2Var2).U : null;
                        c6Var = ((org.telegram.ui.ActionBar.f3) jvVar).resourcesProvider;
                        new nx0(context, o2Var, inputStickerSet, null, dkVar, c6Var).show();
                        return;
                    }
                    this.b.set(i12, stickerSet2);
                    if (stickerSet2 != null) {
                        a(i12, stickerSet2);
                    }
                }
            }
            jv jvVar2 = ((tu) this).h;
            jvVar2.a0();
            nh.v vVar = jvVar2.h;
            if (vVar == null || vVar.getAdapter() == null) {
                return;
            }
            vVar.getAdapter().l();
        }
    }
}
