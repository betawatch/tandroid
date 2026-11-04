package kg;

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ew;
import org.telegram.ui.s51;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ s(e0 e0Var, int i3, int i10, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i11) {
        this.a = i11;
        this.b = e0Var;
        this.c = i3;
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
        int i3;
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
        boolean z10 = true;
        int i14 = 0;
        switch (i11) {
            case 0:
                e0 e0Var = (e0) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                w wVar = e0Var.k0;
                ArrayList arrayList2 = e0Var.I;
                int i15 = e0Var.t0;
                if (i13 == e0Var.U && (i12 <= 0 || i12 == e0Var.e0)) {
                    e0Var.E0--;
                    if (tL_error == null) {
                        e0Var.c0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        qr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        hp.s1(i15).Y3(messages_messages.users, false);
                        hp.s1(i15).S3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        e0Var.d0 = messages_messages.next_rate;
                        for (int i16 = 0; i16 < messages_messages.messages.size(); i16++) {
                            TLRPC.Message message = messages_messages.messages.get(i16);
                            int i17 = hp.s1(i15).U.get(zi.B0(message));
                            if (i17 == 0 || message.id > i17) {
                                arrayList2.add((zi) arrayList.get(i16));
                            }
                        }
                        e0Var.O = true;
                        e0Var.Y = messages_messages.messages.size() != 20;
                        if (i12 > 0) {
                            e0Var.h0 = i12;
                            if (e0Var.g0 != i12) {
                                e0Var.s.clear();
                            }
                            if (e0Var.f0 != i12) {
                                wVar.b();
                            }
                        }
                        wVar.f(e0Var.s, e0Var.w0);
                        ew ewVar = e0Var.V;
                        if (ewVar != null) {
                            ewVar.d(e0Var.E0 > 0, true);
                            e0Var.V.c();
                        }
                        e0Var.f();
                    }
                }
                e0Var.R = 0;
                break;
            case 1:
                e0 e0Var2 = (e0) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject;
                w wVar2 = e0Var2.k0;
                ArrayList arrayList3 = e0Var2.J;
                ArrayList arrayList4 = e0Var2.I;
                int i18 = e0Var2.t0;
                if (i13 == e0Var2.Q && (i12 <= 0 || i12 == e0Var2.e0)) {
                    e0Var2.E0--;
                    if (tL_error2 == null) {
                        e0Var2.c0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        qr.a0(i18).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        hp.s1(i18).Y3(messages_messages2.users, false);
                        hp.s1(i18).S3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        e0Var2.d0 = messages_messages2.next_rate;
                        int i19 = 0;
                        while (i19 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i19);
                            int i20 = hp.s1(i18).U.get(zi.B0(message2));
                            if (i20 == 0 || message2.id > i20) {
                                zi ziVar = (zi) arrayList.get(i19);
                                if (!arrayList4.isEmpty()) {
                                    for (int i21 = i14; i21 < arrayList4.size(); i21++) {
                                        zi ziVar2 = (zi) arrayList4.get(i21);
                                        if (ziVar2 == null || ziVar == null || ziVar.f1() != ziVar2.f1() || zi.B0(ziVar.k) != zi.B0(ziVar2.k)) {
                                        }
                                    }
                                }
                                arrayList3.add(ziVar);
                                Integer num = (Integer) (message2.out ? hp.s1(i18).Q : hp.s1(i18).P).get(Long.valueOf(zi.B0(message2)));
                                if (num != null) {
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                            i19++;
                            z10 = true;
                            i14 = 0;
                        }
                        e0Var2.O = z10;
                        e0Var2.X = messages_messages2.messages.size() != 20;
                        if (i12 > 0) {
                            e0Var2.h0 = i12;
                            if (e0Var2.g0 != i12) {
                                e0Var2.s.clear();
                            }
                            if (e0Var2.f0 != i12) {
                                wVar2.b();
                            }
                        }
                        wVar2.f(e0Var2.s, e0Var2.w0);
                        ew ewVar2 = e0Var2.V;
                        if (ewVar2 != null) {
                            i10 = 1;
                            ewVar2.d(e0Var2.E0 > 0, true);
                            e0Var2.V.c();
                        } else {
                            i10 = 1;
                        }
                        e0Var2.H0 = i10;
                        e0Var2.I0 = i10;
                        i3 = 0;
                        e0Var2.d = false;
                        s51 s51Var = e0Var2.F0;
                        if (s51Var != null) {
                            String str3 = e0Var2.a0;
                            TextView textView = (TextView) s51Var.b;
                            Object[] objArr = new Object[i10];
                            objArr[0] = str3;
                            textView.setText(bd.a0(null, null, 2131745760, objArr));
                        }
                        e0Var2.f();
                        e0Var2.P = i3;
                        break;
                    }
                }
                i3 = 0;
                e0Var2.P = i3;
                break;
            default:
                li liVar = (li) obj3;
                a0.h hVar = (a0.h) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                liVar.getClass();
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
                    liVar.z1(this.d, arrayList5, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s(li liVar, TLObject tLObject, ArrayList arrayList, int i3, a0.h hVar, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i10) {
        this.a = 2;
        this.b = liVar;
        this.h = tLObject;
        this.n = arrayList;
        this.c = i3;
        this.e = hVar;
        this.f = stickerSet;
        this.r = tL_messages_allStickers;
        this.d = i10;
    }
}
