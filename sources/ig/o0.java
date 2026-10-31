package ig;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.b8;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.sd;
import org.telegram.ui.tu;
import org.telegram.ui.vu;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ o0(Object obj, Object obj2, int i10, boolean z10, Object obj3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = z10;
        this.f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a0.h hVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        TLRPC.Document document;
        int i10 = this.a;
        final int i11 = 0;
        char c10 = 1;
        char c11 = 1;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        int i12 = this.b;
        boolean z10 = this.c;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) obj3;
                Runnable runnable = (Runnable) obj;
                q0Var.d((r0) obj2, i12, z10 ? q0Var.h : null);
                if (z10) {
                    q0Var.h = null;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                m4.p0 p0Var = (m4.p0) obj3;
                n4.r rVar = (n4.r) obj2;
                m4.o0 o0Var = (m4.o0) obj;
                m4.f0 f0Var = p0Var.h;
                if (!f0Var.j()) {
                    if (((n4.l) p0Var.n.a).a.isActive()) {
                        m4.w m0 = p0Var.m0(rVar);
                        if (p0Var.g.M(m0, i12)) {
                            oa.d dVar = f0Var.e;
                            f0Var.s(m0);
                            dVar.getClass();
                            try {
                                o0Var.b(m0);
                            } catch (RemoteException e) {
                                e2.a.m("MediaSessionLegacyStub", "Exception in " + m0, e);
                            }
                            if (z10) {
                                new SparseBooleanArray().append(i12, true);
                                f0Var.p(m0);
                                break;
                            }
                        } else if (i12 == 1 && !f0Var.t.t()) {
                            e2.a.l("MediaSessionLegacyStub", "Calling play() omitted due to COMMAND_PLAY_PAUSE not being available. If this play command has started the service for instance for playback resumption, this may prevent the service from being started into the foreground.");
                            break;
                        }
                    } else {
                        StringBuilder l4 = i0.a.l(i12, "Ignore incoming player command before initialization. command=", ", pid=");
                        l4.append(rVar.a.b);
                        e2.a.l("MediaSessionLegacyStub", l4.toString());
                        break;
                    }
                }
                break;
            case 2:
                vp vpVar = (vp) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                final q0.a aVar = (q0.a) obj;
                LongSparseIntArray longSparseIntArray = vpVar.B0;
                a0.h hVar2 = vpVar.A0;
                ArrayList arrayList3 = (ArrayList) hVar2.f(chat.id);
                a0.h hVar3 = vpVar.C0;
                ArrayList arrayList4 = (ArrayList) hVar3.f(chat.id);
                if (z10) {
                    if (arrayList3 != null) {
                        arrayList3.remove(Integer.valueOf(i12));
                    }
                    if (arrayList3 == null || arrayList3.isEmpty()) {
                        hVar2.e(chat.id);
                    }
                    if (chat.megagroup) {
                        if (arrayList4 != null) {
                            arrayList4.remove(Integer.valueOf(i12));
                        }
                        if (arrayList4 == null || arrayList4.isEmpty()) {
                            hVar3.e(chat.id);
                            break;
                        }
                    }
                } else {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        hVar2.k(arrayList3, chat.id);
                    }
                    if (!arrayList3.contains(Integer.valueOf(i12))) {
                        arrayList3.add(Integer.valueOf(i12));
                    }
                    if (vpVar.z0.indexOfKey(chat.id) < 0) {
                        if (aVar != null) {
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.messenger.wj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            aVar.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            aVar.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                        hVar = hVar3;
                        arrayList = arrayList4;
                        vpVar.I0(chat.id, 3, 0L, null);
                    } else {
                        hVar = hVar3;
                        arrayList = arrayList4;
                        if (aVar != null) {
                            final char c12 = c10 == true ? 1 : 0;
                            org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.messenger.wj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c12) {
                                        case 0:
                                            aVar.accept(Boolean.TRUE);
                                            break;
                                        default:
                                            aVar.accept(Boolean.FALSE);
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    if (chat.megagroup && !chat.monoforum) {
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                            hVar.k(arrayList2, chat.id);
                        } else {
                            arrayList2 = arrayList;
                        }
                        if (!arrayList2.contains(Integer.valueOf(i12))) {
                            arrayList2.add(Integer.valueOf(i12));
                        }
                        if (longSparseIntArray.indexOfKey(chat.id) < 0) {
                            longSparseIntArray.put(chat.id, 0);
                            break;
                        }
                    }
                }
                break;
            case 3:
                gs gsVar = (gs) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList5 = gsVar.V;
                int i13 = gsVar.P;
                if (i12 == gsVar.f0 && TextUtils.equals(tL_messages_searchGlobal.q, gsVar.g0)) {
                    gsVar.b0 = false;
                    if (!z10) {
                        arrayList5.clear();
                    }
                    if (tLObject instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        hs.a0(i13).m1(messages_messages.users, messages_messages.chats, true, true);
                        vp.r1(i13).V3(messages_messages.users, false);
                        vp.r1(i13).P3(messages_messages.chats, false);
                        ArrayList<TLRPC.Message> arrayList6 = messages_messages.messages;
                        int size = arrayList6.size();
                        int i14 = 0;
                        while (i14 < size) {
                            TLRPC.Message message = arrayList6.get(i14);
                            i14++;
                            jj jjVar = new jj(i13, message, false, true);
                            jjVar.J5(gsVar.g0, true);
                            arrayList5.add(jjVar);
                        }
                        gsVar.d0 = messages_messages instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList5.size(), messages_messages.count);
                        gsVar.e0 = messages_messages.next_rate;
                    }
                    gsVar.O(true);
                    break;
                }
                break;
            case 4:
                is isVar = (is) obj3;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList7 = isVar.R;
                int i15 = isVar.P;
                if (i12 == isVar.c0 && TextUtils.equals(tL_messages_searchGlobal2.q, isVar.d0)) {
                    isVar.Y = false;
                    if (!z10) {
                        arrayList7.clear();
                    }
                    if (tLObject2 instanceof TLRPC.messages_Messages) {
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject2;
                        hs.a0(i15).m1(messages_messages2.users, messages_messages2.chats, true, true);
                        vp.r1(i15).V3(messages_messages2.users, false);
                        vp.r1(i15).P3(messages_messages2.chats, false);
                        ArrayList<TLRPC.Message> arrayList8 = messages_messages2.messages;
                        int size2 = arrayList8.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            TLRPC.Message message2 = arrayList8.get(i16);
                            i16++;
                            jj jjVar2 = new jj(i15, message2, false, true);
                            jjVar2.J5(isVar.d0, true);
                            arrayList7.add(jjVar2);
                        }
                        isVar.a0 = messages_messages2 instanceof TLRPC.TL_messages_messagesSlice;
                        Math.max(arrayList7.size(), messages_messages2.count);
                        isVar.b0 = messages_messages2.next_rate;
                    }
                    isVar.O(true);
                    break;
                }
                break;
            case 5:
                sd sdVar = (sd) obj3;
                Context context = (Context) obj2;
                k2 k2Var = (k2) obj;
                vu vuVar = (vu) sdVar.d;
                vuVar.a();
                p8 p8Var = vuVar.e;
                vuVar.c();
                int x02 = t6.x0(null, t6.q6, false);
                bi0 bi0Var = vuVar.d;
                bi0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                int x03 = t6.x0(null, t6.a7, false);
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if ((activity != null ? activity.getWindow() : null) != null) {
                    ValueAnimator valueAnimator = vuVar.h;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        vuVar.h.cancel();
                    }
                    ValueAnimator valueAnimator2 = vuVar.h;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        i12 = vuVar.n;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    vuVar.h = ofFloat;
                    ofFloat.addUpdateListener(new tu(sdVar, z10 ? 50.0f : 200.0f, i12, x03, activity));
                    vuVar.h.addListener(new org.telegram.ui.t0(activity, x03, c11 == true ? 1 : 0));
                    vuVar.h.setDuration(350L);
                    vuVar.h.start();
                }
                if (t6.k1()) {
                    p8Var.p(cd.L0(2131745484, null), bi0Var, true);
                    p8Var.x += 2;
                } else {
                    p8Var.p(cd.L0(2131745485, null), bi0Var, true);
                    p8Var.x += 2;
                }
                t6.M1(k2Var);
                break;
            default:
                String str2 = (String) obj3;
                ImageReceiver imageReceiver = (ImageReceiver) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (z10) {
                    str = d20.i(i12).c0;
                    if (str == null) {
                        ui.b0(i12).C();
                        break;
                    }
                } else {
                    str = d20.i(i12).b0;
                    if (str == null) {
                        ui.b0(i12).z();
                        break;
                    }
                }
                TLRPC.TL_messages_stickerSet p02 = ui.b0(i12).p0(str);
                if (p02 == null) {
                    p02 = ui.b0(i12).n0(str);
                }
                if (p02 != null) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < p02.packs.size()) {
                            TLRPC.TL_stickerPack tL_stickerPack = p02.packs.get(i17);
                            if (!TextUtils.equals(tL_stickerPack.emoticon, str2) || tL_stickerPack.documents.isEmpty()) {
                                i17++;
                            } else {
                                long longValue = tL_stickerPack.documents.get(0).longValue();
                                for (int i18 = 0; i18 < p02.documents.size(); i18++) {
                                    document = p02.documents.get(i18);
                                    if (document == null || document.id != longValue) {
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document == null && !p02.documents.isEmpty()) {
                        document = p02.documents.get(0);
                    }
                } else {
                    document = null;
                }
                if (document != null) {
                    imageReceiver.u0 = true;
                    imageReceiver.g1 = new l2.f(zArr, 26);
                    c00 f7 = v5.f(document, t6.a7, 0.3f, null);
                    TLRPC.PhotoSize w9 = b8.w(document.thumbs, zs.q2, true, null, true);
                    imageReceiver.W(0);
                    imageReceiver.r0(ic.b(document), "160_160_nr", ic.c(w9, document), "160_160", f7, document.size, "tgs", p02, 1);
                    break;
                } else {
                    ui.b0(i12).c1(str, false, p02 == null);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ o0(m4.p0 p0Var, int i10, n4.r rVar, m4.o0 o0Var, boolean z10) {
        this.a = 1;
        this.d = p0Var;
        this.b = i10;
        this.e = rVar;
        this.f = o0Var;
        this.c = z10;
    }

    public /* synthetic */ o0(vp vpVar, TLRPC.Chat chat, boolean z10, int i10, q0.a aVar) {
        this.a = 2;
        this.d = vpVar;
        this.e = chat;
        this.c = z10;
        this.b = i10;
        this.f = aVar;
    }

    public /* synthetic */ o0(p51 p51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, TLObject tLObject, int i11) {
        this.a = i11;
        this.d = p51Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
        this.f = tLObject;
    }

    public /* synthetic */ o0(boolean z10, int i10, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = 6;
        this.c = z10;
        this.b = i10;
        this.d = str;
        this.e = imageReceiver;
        this.f = zArr;
    }
}
