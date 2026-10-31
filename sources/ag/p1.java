package ag;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.h20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ib;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.x41;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.lt;
import org.telegram.ui.tc1;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ TLObject e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ p1(t1 t1Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.f = t1Var;
        this.b = tL_error;
        this.c = tLObject;
        this.h = iArr;
        this.n = arrayList;
        this.d = z10;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ArrayList arrayList;
        TLRPC.User user;
        int i10 = this.a;
        boolean z11 = this.d;
        TLObject tLObject = this.e;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.f;
        switch (i10) {
            case 0:
                t1.Y((t1) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.d, (TLRPC.User) tLObject);
                break;
            case 1:
                oh.q qVar = (oh.q) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user2 = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i11 = qVar.k;
                ArrayList arrayList2 = qVar.e;
                org.telegram.ui.ActionBar.k2 k2Var = qVar.g;
                if (k2Var != null && k2Var.getParentActivity() != null) {
                    if (tL_error != null) {
                        s4.e0(i11, tL_error, k2Var, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        if (!tL_updates.chats.isEmpty()) {
                            vp.r1(i11).T2(0, tL_updates.chats.get(0).id, true);
                        }
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList2.size()) {
                                z10 = z11;
                                if (((TLRPC.TL_chatInviteImporter) arrayList2.get(i12)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList2.remove(i12);
                                } else {
                                    i12++;
                                    z11 = z10;
                                }
                            } else {
                                z10 = z11;
                            }
                        }
                        oh.j jVar = qVar.f;
                        oh.q qVar2 = jVar.c;
                        int i13 = 0;
                        while (true) {
                            arrayList = qVar2.c;
                            if (i13 < arrayList.size()) {
                                user = user2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i13)).user_id != tL_chatInviteImporter.user_id) {
                                    i13++;
                                    user2 = user;
                                }
                            } else {
                                user = user2;
                                i13 = -1;
                            }
                        }
                        if (i13 >= 0) {
                            arrayList.remove(i13);
                            jVar.s((!jVar.c.B ? 1 : 0) + i13);
                            if (arrayList.isEmpty()) {
                                jVar.s(1);
                            }
                        }
                        qVar.f(qVar.t, false, true);
                        if (z10) {
                            ib ibVar = new ib(k2Var.getParentActivity(), k2Var.getResourceProvider());
                            int L = org.telegram.messenger.i0.L(15.0f);
                            g9 g9Var = ibVar.a;
                            g9Var.setRoundRadius(L);
                            g9Var.e(user, new r8(0, user));
                            String j10 = h20.j(user, true);
                            String a02 = qVar.a ? cd.a0("HasBeenAddedToChannel", null, 2131749373, j10) : cd.a0("HasBeenAddedToGroup", null, 2131749372, j10);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(j10);
                            spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), indexOf, j10.length() + indexOf, 18);
                            ibVar.b.setText(spannableStringBuilder);
                            if (arrayList2.isEmpty()) {
                                wb.g(k2Var, ibVar, 2750).j();
                            } else {
                                wb.f(qVar.h, ibVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y p5 = k2Var.getActionBar().p();
                        if (TextUtils.isEmpty(qVar.t) && qVar.l) {
                            p5.j(0).setVisibility(arrayList2.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            case 2:
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj4;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList3.add(new ef(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.v1().N2(k2Var2.getParentActivity(), null, k2Var2.getResourceProvider());
                PhotoViewer.v1().j2(arrayList3, 0, 11, false, new sw0(), (un) obj3);
                PhotoViewer.v1().Z0(document, z11 ? document : null, false, null);
                lt.p().T = z11 ? tL_messages_stickerSet : null;
                break;
            default:
                tc1.h0((tc1) obj5, (TLRPC.TL_error) obj4, this.d, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                break;
        }
    }

    public /* synthetic */ p1(File file, ArrayList arrayList, org.telegram.ui.ActionBar.k2 k2Var, un unVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f = file;
        this.n = arrayList;
        this.b = k2Var;
        this.c = unVar;
        this.h = document;
        this.d = z10;
        this.e = tL_messages_stickerSet;
    }

    public /* synthetic */ p1(oh.q qVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.f = qVar;
        this.b = tL_error;
        this.c = tLObject;
        this.h = tL_chatInviteImporter;
        this.d = z10;
        this.e = user;
        this.n = tL_messages_hideChatJoinRequest;
    }

    public /* synthetic */ p1(tc1 tc1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f = tc1Var;
        this.b = tL_error;
        this.d = z10;
        this.c = tLObject;
        this.h = bArr;
        this.n = str;
        this.e = passwordinputsettings;
    }
}
