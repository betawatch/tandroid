// default package

import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dm3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ TLObject h;
    public final /* synthetic */ ArrayList n;
    public final /* synthetic */ TLObject r;

    public /* synthetic */ dm3(hs6 hs6Var, TLObject tLObject, ArrayList arrayList, int i, vh6 vh6Var, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i2) {
        this.a = (byte) 2;
        this.b = hs6Var;
        this.h = tLObject;
        this.n = arrayList;
        this.c = i;
        this.e = vh6Var;
        this.f = stickerSet;
        this.r = tL_messages_allStickers;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        ArrayList arrayList = this.n;
        int i2 = this.d;
        TLObject tLObject = this.r;
        Object obj = this.f;
        Object obj2 = this.e;
        int i3 = this.c;
        TLObject tLObject2 = this.h;
        Object obj3 = this.b;
        int i4 = 0;
        switch (b) {
            case 0:
                mm3 mm3Var = (mm3) obj3;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                String str = (String) obj;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) tLObject;
                fm3 fm3Var = mm3Var.k0;
                ArrayList arrayList2 = mm3Var.I;
                int i5 = mm3Var.t0;
                if (i3 == mm3Var.U && (i2 <= 0 || i2 == mm3Var.e0)) {
                    mm3Var.E0--;
                    if (tL_error == null) {
                        mm3Var.c0 = str;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                        cf7.Y(i5).j1(messages_messages.users, messages_messages.chats, true, true);
                        oc7.r1(i5).d4(messages_messages.users, false);
                        oc7.r1(i5).X3(messages_messages.chats, false);
                        if (tL_messages_search.add_offset == 0) {
                            arrayList2.clear();
                        }
                        mm3Var.d0 = messages_messages.next_rate;
                        for (int i6 = 0; i6 < messages_messages.messages.size(); i6++) {
                            TLRPC.Message message = messages_messages.messages.get(i6);
                            int i7 = oc7.r1(i5).U.get(k47.B0(message));
                            if (i7 == 0 || message.id > i7) {
                                arrayList2.add((k47) arrayList.get(i6));
                            }
                        }
                        mm3Var.O = true;
                        mm3Var.Y = messages_messages.messages.size() != 20;
                        if (i2 > 0) {
                            mm3Var.h0 = i2;
                            if (mm3Var.g0 != i2) {
                                mm3Var.s.clear();
                            }
                            if (mm3Var.f0 != i2) {
                                fm3Var.b();
                            }
                        }
                        fm3Var.f(mm3Var.s, mm3Var.w0);
                        uj3 uj3Var = mm3Var.V;
                        if (uj3Var != null) {
                            uj3Var.d(mm3Var.E0 > 0, true);
                            mm3Var.V.c();
                        }
                        mm3Var.f();
                    }
                }
                mm3Var.R = 0;
                break;
            case 1:
                mm3 mm3Var2 = (mm3) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                String str2 = (String) obj;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) tLObject;
                fm3 fm3Var2 = mm3Var2.k0;
                ArrayList arrayList3 = mm3Var2.J;
                ArrayList arrayList4 = mm3Var2.I;
                int i8 = mm3Var2.t0;
                if (i3 == mm3Var2.Q && (i2 <= 0 || i2 == mm3Var2.e0)) {
                    mm3Var2.E0--;
                    if (tL_error2 == null) {
                        mm3Var2.c0 = str2;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        cf7.Y(i8).j1(messages_messages2.users, messages_messages2.chats, true, true);
                        oc7.r1(i8).d4(messages_messages2.users, false);
                        oc7.r1(i8).X3(messages_messages2.chats, false);
                        if (tL_messages_searchGlobal.offset_id == 0) {
                            arrayList3.clear();
                        }
                        mm3Var2.d0 = messages_messages2.next_rate;
                        int i9 = 0;
                        while (i9 < messages_messages2.messages.size()) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i9);
                            int i10 = oc7.r1(i8).U.get(k47.B0(message2));
                            if (i10 == 0 || message2.id > i10) {
                                k47 k47Var = (k47) arrayList.get(i9);
                                if (!arrayList4.isEmpty()) {
                                    for (int i11 = i4; i11 < arrayList4.size(); i11++) {
                                        k47 k47Var2 = (k47) arrayList4.get(i11);
                                        if (k47Var2 == null || k47Var == null || k47Var.e1() != k47Var2.e1() || k47.B0(k47Var.k) != k47.B0(k47Var2.k)) {
                                        }
                                    }
                                }
                                arrayList3.add(k47Var);
                                Integer num = (Integer) (message2.out ? oc7.r1(i8).Q : oc7.r1(i8).P).get(Long.valueOf(k47.B0(message2)));
                                if (num != null) {
                                    message2.unread = num.intValue() < message2.id;
                                }
                            }
                            i9++;
                            i4 = 0;
                        }
                        mm3Var2.O = true;
                        mm3Var2.X = messages_messages2.messages.size() != 20;
                        if (i2 > 0) {
                            mm3Var2.h0 = i2;
                            if (mm3Var2.g0 != i2) {
                                mm3Var2.s.clear();
                            }
                            if (mm3Var2.f0 != i2) {
                                fm3Var2.b();
                            }
                        }
                        fm3Var2.f(mm3Var2.s, mm3Var2.w0);
                        uj3 uj3Var2 = mm3Var2.V;
                        if (uj3Var2 != null) {
                            uj3Var2.d(mm3Var2.E0 > 0, true);
                            mm3Var2.V.c();
                        }
                        mm3Var2.H0 = true;
                        mm3Var2.I0 = true;
                        i = 0;
                        mm3Var2.d = false;
                        qmb qmbVar = mm3Var2.F0;
                        if (qmbVar != null) {
                            ((TextView) qmbVar.b).setText(jb6.a0(null, null, 2131745484, mm3Var2.a0));
                        }
                        mm3Var2.f();
                        mm3Var2.P = i;
                        break;
                    }
                }
                i = 0;
                mm3Var2.P = i;
                break;
            default:
                hs6 hs6Var = (hs6) obj3;
                vh6 vh6Var = (vh6) obj2;
                TLRPC.TL_messages_allStickers tL_messages_allStickers = (TLRPC.TL_messages_allStickers) tLObject;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                ArrayList arrayList5 = this.n;
                arrayList5.set(i3, tL_messages_stickerSet);
                vh6Var.k(tL_messages_stickerSet, ((TLRPC.StickerSet) obj).id);
                if (vh6Var.m() == tL_messages_allStickers.sets.size()) {
                    while (i4 < arrayList5.size()) {
                        if (arrayList5.get(i4) == null) {
                            arrayList5.remove(i4);
                            i4--;
                        }
                        i4++;
                    }
                    hs6Var.A1(this.d, arrayList5, false, (int) (System.currentTimeMillis() / 1000), tL_messages_allStickers.hash2, null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ dm3(mm3 mm3Var, int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = mm3Var;
        this.c = i;
        this.d = i2;
        this.e = tL_error;
        this.f = str;
        this.h = tLObject;
        this.r = tLMethod;
        this.n = arrayList;
    }
}
