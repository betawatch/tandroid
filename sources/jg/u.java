package jg;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.ui;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c61;
import org.telegram.ui.hw;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ u(h0 h0Var, int i7, int i10, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = h0Var;
        this.c = i7;
        this.d = i10;
        this.e = tL_error;
        this.f = str;
        this.h = tLObject;
        this.r = tLMethod;
        this.n = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        int i10;
        int i11 = this.a;
        ArrayList arrayList = this.n;
        int i12 = this.d;
        TLObject tLObject = this.r;
        Object obj = this.f;
        Object obj2 = this.e;
        int i13 = this.c;
        TLObject tLObject2 = this.h;
        Object obj3 = this.b;
        boolean z9 = true;
        int i14 = 0;
        switch (i11) {
            case 0:
                h0 h0Var = (h0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                z zVar = h0Var.j0;
                ArrayList arrayList2 = h0Var.H;
                int i15 = h0Var.s0;
                if (i13 == h0Var.T && (i12 <= 0 || i12 == h0Var.d0)) {
                    h0Var.D0--;
                    if (tL_error == null) {
                        h0Var.b0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        yr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        qp.s1(i15).Y3(messages_messages.users, false);
                        qp.s1(i15).S3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        h0Var.c0 = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = qp.s1(i15).T.get(ij.B0(message));
                            if (i17 == 0 || message.id > i17) {
                                arrayList2.add((ij) arrayList.get(i16));
                            }
                        }
                        h0Var.N = true;
                        h0Var.X = messages_messages.messages.size() != 20;
                        if (i12 > 0) {
                            h0Var.g0 = i12;
                            if (h0Var.f0 != i12) {
                                h0Var.s.clear();
                            }
                            if (h0Var.e0 != i12) {
                                zVar.b();
                            }
                        }
                        zVar.f(h0Var.s, h0Var.v0);
                        hw hwVar = h0Var.U;
                        if (hwVar != null) {
                            hwVar.d(h0Var.D0 > 0, true);
                            h0Var.U.c();
                        }
                        h0Var.f();
                    }
                }
                h0Var.Q = 0;
                break;
            case 1:
                h0 h0Var2 = (h0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject;
                z zVar2 = h0Var2.j0;
                ArrayList arrayList3 = h0Var2.I;
                ArrayList arrayList4 = h0Var2.H;
                int i18 = h0Var2.s0;
                if (i13 == h0Var2.P && (i12 <= 0 || i12 == h0Var2.d0)) {
                    h0Var2.D0--;
                    if (tL_error2 == null) {
                        h0Var2.b0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        yr.a0(i18).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        qp.s1(i18).Y3(messages_messages2.users, false);
                        qp.s1(i18).S3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        h0Var2.c0 = messages_messages2.next_rate;
                        int i19 = 0;
                        while (i19 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = qp.s1(i18).T.get(ij.B0(message2));
                            if (i20 == 0 || message2.id > i20) {
                                ij ijVar = (ij) arrayList.get(i19);
                                if (!arrayList4.isEmpty()) {
                                    for (int i21 = i14; i21 < arrayList4.size(); i21++) {
                                        ij ijVar2 = (ij) arrayList4.get(i21);
                                        if (ijVar2 == null || ijVar == null || ijVar.f1() != ijVar2.f1() || ij.B0(ijVar.k) != ij.B0(ijVar2.k)) {
                                        }
                                    }
                                }
                                arrayList3.add(ijVar);
                                Integer num = (Integer) (message2.out ? qp.s1(i18).P : qp.s1(i18).O).get(Long.valueOf(ij.B0(message2)));
                                if (num != null) {
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                            i19++;
                            z9 = true;
                            i14 = 0;
                        }
                        h0Var2.N = z9;
                        h0Var2.W = messages_messages2.messages.size() != 20;
                        if (i12 > 0) {
                            h0Var2.g0 = i12;
                            if (h0Var2.f0 != i12) {
                                h0Var2.s.clear();
                            }
                            if (h0Var2.e0 != i12) {
                                zVar2.b();
                            }
                        }
                        zVar2.f(h0Var2.s, h0Var2.v0);
                        hw hwVar2 = h0Var2.U;
                        if (hwVar2 != null) {
                            i10 = 1;
                            hwVar2.d(h0Var2.D0 > 0, true);
                            h0Var2.U.c();
                        } else {
                            i10 = 1;
                        }
                        h0Var2.G0 = i10;
                        h0Var2.H0 = i10;
                        i7 = 0;
                        h0Var2.d = false;
                        c61 c61Var = h0Var2.E0;
                        if (c61Var != null) {
                            String str3 = h0Var2.Z;
                            TextView textView = (TextView) c61Var.b;
                            Object[] objArr = new Object[i10];
                            objArr[0] = str3;
                            textView.setText(id.a0(null, null, 2131745753, objArr));
                        }
                        h0Var2.f();
                        h0Var2.O = i7;
                        break;
                    }
                }
                i7 = 0;
                h0Var2.O = i7;
                break;
            default:
                ui uiVar = (ui) obj3;
                a0.h hVar = (a0.h) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                uiVar.getClass();
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ArrayList arrayList5 = this.n;
                arrayList5.set(i13, tL_messages_stickerSet);
                hVar.k(tL_messages_stickerSet, ((TLRPC.StickerSet) obj).id);
                if (hVar.m() == tL_messages_allStickers.sets.size()) {
                    while (i14 < arrayList5.size()) {
                        if (arrayList5.get(i14) == null) {
                            arrayList5.remove(i14);
                            i14--;
                        }
                        i14++;
                    }
                    uiVar.z1(this.d, arrayList5, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u(ui uiVar, TLObject tLObject, ArrayList arrayList, int i7, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        this.a = 2;
        this.b = uiVar;
        this.h = tLObject;
        this.n = arrayList;
        this.c = i7;
        this.e = hVar;
        this.f = stickerSet;
        this.r = tL_messages_allStickers;
        this.d = i10;
    }
}
