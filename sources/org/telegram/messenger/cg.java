package org.telegram.messenger;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.s71;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class cg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ cg(vi viVar, TLObject tLObject, ArrayList arrayList, int i10, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i11) {
        this.a = 0;
        this.f = viVar;
        this.d = tLObject;
        this.e = arrayList;
        this.b = i10;
        this.h = hVar;
        this.n = stickerSet;
        this.r = tL_messages_allStickers;
        this.c = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12 = this.a;
        ArrayList arrayList = this.e;
        int i13 = this.c;
        TLObject tLObject = this.r;
        TLObject tLObject2 = this.d;
        Object obj = this.n;
        Object obj2 = this.h;
        int i14 = this.b;
        Object obj3 = this.f;
        boolean z10 = true;
        int i15 = 0;
        switch (i12) {
            case 0:
                vi viVar = (vi) obj3;
                a0.h hVar = (a0.h) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                viVar.getClass();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ArrayList arrayList2 = this.e;
                arrayList2.set(i14, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, ((TLRPC.StickerSet) obj).id);
                if (hVar.m() == tL_messages_allStickers.sets.size()) {
                    int i16 = 0;
                    while (i16 < arrayList2.size()) {
                        if (arrayList2.get(i16) == null) {
                            arrayList2.remove(i16);
                            i16--;
                        }
                        i16++;
                    }
                    viVar.z1(this.c, arrayList2, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    break;
                }
                break;
            case 1:
                zf.z zVar = (zf.z) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                zf.t tVar = zVar.j0;
                ArrayList arrayList3 = zVar.H;
                int i17 = zVar.s0;
                if (i14 == zVar.T && (i13 <= 0 || i13 == zVar.d0)) {
                    zVar.D0--;
                    if (tL_error == null) {
                        zVar.b0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        is.a0(i17).m1(messages_messages.users, messages_messages.chats, true, true);
                        wp.r1(i17).V3(messages_messages.users, false);
                        wp.r1(i17).P3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList3.clear();
                        }
                        zVar.c0 = messages_messages.next_rate;
                        for (int i18 = 0; i18 < messages_messages.messages.size(); i18++) {
                            TLRPC.Message message = messages_messages.messages.get(i18);
                            int i19 = wp.r1(i17).T.get(kj.B0(message));
                            if (i19 == 0 || message.id > i19) {
                                arrayList3.add((kj) arrayList.get(i18));
                            }
                        }
                        zVar.N = true;
                        zVar.X = messages_messages.messages.size() != 20;
                        if (i13 > 0) {
                            zVar.g0 = i13;
                            if (zVar.f0 != i13) {
                                zVar.s.clear();
                            }
                            if (zVar.e0 != i13) {
                                tVar.b();
                            }
                        }
                        tVar.f(zVar.s, zVar.v0);
                        org.telegram.ui.lx lxVar = zVar.U;
                        if (lxVar != null) {
                            lxVar.d(zVar.D0 > 0, true);
                            zVar.U.c();
                        }
                        zVar.f();
                    }
                }
                zVar.Q = 0;
                break;
            default:
                zf.z zVar2 = (zf.z) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject;
                zf.t tVar2 = zVar2.j0;
                ArrayList arrayList4 = zVar2.I;
                ArrayList arrayList5 = zVar2.H;
                int i20 = zVar2.s0;
                if (i14 == zVar2.P && (i13 <= 0 || i13 == zVar2.d0)) {
                    zVar2.D0--;
                    if (tL_error2 == null) {
                        zVar2.b0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        is.a0(i20).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        wp.r1(i20).V3(messages_messages2.users, false);
                        wp.r1(i20).P3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList4.clear();
                        }
                        zVar2.c0 = messages_messages2.next_rate;
                        int i21 = 0;
                        while (i21 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i21);
                            int i22 = wp.r1(i20).T.get(kj.B0(message2));
                            if (i22 == 0 || message2.id > i22) {
                                kj kjVar = (kj) arrayList.get(i21);
                                if (!arrayList5.isEmpty()) {
                                    for (int i23 = i15; i23 < arrayList5.size(); i23++) {
                                        kj kjVar2 = (kj) arrayList5.get(i23);
                                        if (kjVar2 == null || kjVar == null || kjVar.f1() != kjVar2.f1() || kj.B0(kjVar.k) != kj.B0(kjVar2.k)) {
                                        }
                                    }
                                }
                                arrayList4.add(kjVar);
                                Integer num = (Integer) (message2.out ? wp.r1(i20).P : wp.r1(i20).O).get(Long.valueOf(kj.B0(message2)));
                                if (num != null) {
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                            i21++;
                            z10 = true;
                            i15 = 0;
                        }
                        zVar2.N = z10;
                        zVar2.W = messages_messages2.messages.size() != 20;
                        if (i13 > 0) {
                            zVar2.g0 = i13;
                            if (zVar2.f0 != i13) {
                                zVar2.s.clear();
                            }
                            if (zVar2.e0 != i13) {
                                tVar2.b();
                            }
                        }
                        tVar2.f(zVar2.s, zVar2.v0);
                        org.telegram.ui.lx lxVar2 = zVar2.U;
                        if (lxVar2 != null) {
                            i11 = 1;
                            lxVar2.d(zVar2.D0 > 0, true);
                            zVar2.U.c();
                        } else {
                            i11 = 1;
                        }
                        zVar2.G0 = i11;
                        zVar2.H0 = i11;
                        i10 = 0;
                        zVar2.d = false;
                        s71 s71Var = zVar2.E0;
                        if (s71Var != null) {
                            String str3 = zVar2.Z;
                            TextView textView = (TextView) s71Var.b;
                            Object[] objArr = new Object[i11];
                            objArr[0] = str3;
                            textView.setText(dd.a0(null, null, 2131745767, objArr));
                        }
                        zVar2.f();
                        zVar2.O = i10;
                        break;
                    }
                }
                i10 = 0;
                zVar2.O = i10;
                break;
        }
    }

    public /* synthetic */ cg(zf.z zVar, int i10, int i11, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i12) {
        this.a = i12;
        this.f = zVar;
        this.b = i10;
        this.c = i11;
        this.h = tL_error;
        this.n = str;
        this.d = tLObject;
        this.r = tLMethod;
        this.e = arrayList;
    }
}
