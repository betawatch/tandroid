package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class ou implements org.telegram.messenger.ls {
    public final ArrayList a;
    public ArrayList b;
    public ArrayList[] c;
    public final int d;
    public boolean e = false;
    public final /* synthetic */ qu f;

    public ou(int i7, ArrayList arrayList, qu quVar) {
        this.f = quVar;
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
                    lw lwVar = new lw();
                    long j3 = document.id;
                    for (int i12 = 0; i12 < tL_messages_stickerSet.packs.size() && ((arrayList = tL_messages_stickerSet.packs.get(i12).documents) == null || !arrayList.contains(Long.valueOf(j3))); i12++) {
                    }
                    lwVar.a = tL_messages_stickerSet;
                    lwVar.b = document.id;
                    this.c[i7].add(lwVar);
                    if (this.f.y1) {
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

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.StickerSet stickerSet;
        if (i7 == org.telegram.messenger.qs.B0) {
            for (int i11 = 0; i11 < this.b.size(); i11++) {
                if (this.b.get(i11) == null) {
                    TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.d).m0((TLRPC.InputStickerSet) this.a.get(i11), true);
                    if (this.b.size() == 1 && m0 != null && (stickerSet = m0.set) != null && !stickerSet.emojis) {
                        qu quVar = this.f;
                        quVar.dismiss();
                        Context context = quVar.getContext();
                        org.telegram.ui.ActionBar.f2 f2Var = quVar.j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) this.a.get(i11);
                        org.telegram.ui.ActionBar.f2 f2Var2 = quVar.j1;
                        new yv0(context, f2Var, inputStickerSet, null, f2Var2 instanceof org.telegram.ui.an ? ((org.telegram.ui.an) f2Var2).Z : null, quVar.I0).show();
                        return;
                    }
                    this.b.set(i11, m0);
                    if (m0 != null) {
                        a(i11, m0);
                    }
                }
            }
            qu quVar2 = ((cu) this).h;
            quVar2.N0();
            fi.v vVar = quVar2.n1;
            if (vVar == null || vVar.getAdapter() == null) {
                return;
            }
            vVar.getAdapter().f();
        }
    }
}
