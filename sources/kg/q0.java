package kg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.sb;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bb1;
import org.telegram.ui.bn;
import org.telegram.ui.ns;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject n;

    public /* synthetic */ q0(File file, ArrayList arrayList, g2 g2Var, bn bnVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d = file;
        this.b = arrayList;
        this.e = g2Var;
        this.f = bnVar;
        this.h = document;
        this.c = z10;
        this.n = tL_messages_stickerSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        ArrayList arrayList;
        ?? r82;
        zh.l lVar;
        int i7 = this.a;
        boolean z11 = this.c;
        Object obj = this.b;
        TLObject tLObject = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                s0.Z((s0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.c, (TLRPC.User) tLObject);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                g2 g2Var = (g2) obj4;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new ff(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.p1().I2(g2Var.getParentActivity(), null, g2Var.getResourceProvider());
                PhotoViewer.p1().f2(arrayList2, 0, 11, false, new aw0(), (bn) obj3);
                PhotoViewer.p1().S0(document, z11 ? document : null, false, null);
                ns.p().T = z11 ? tL_messages_stickerSet : null;
                break;
            case 2:
                bb1.i0((bb1) obj5, (TLRPC.TL_error) obj4, this.c, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                break;
            default:
                zh.l lVar2 = (zh.l) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i10 = lVar2.k;
                ArrayList arrayList3 = lVar2.e;
                g2 g2Var2 = lVar2.g;
                if (g2Var2 != null && g2Var2.getParentActivity() != null) {
                    if (tL_error != null) {
                        c5.c0(i10, tL_error, g2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        boolean z12 = true;
                        if (!tL_updates.chats.isEmpty()) {
                            np.u1(i10).b3(0, tL_updates.chats.get(0).id, true);
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList3.size()) {
                                z10 = z11;
                                if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i11)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList3.remove(i11);
                                } else {
                                    i11++;
                                    z11 = z10;
                                }
                            } else {
                                z10 = z11;
                            }
                        }
                        zh.g gVar = lVar2.f;
                        zh.l lVar3 = gVar.c;
                        int i12 = 0;
                        while (true) {
                            arrayList = lVar3.c;
                            if (i12 < arrayList.size()) {
                                r82 = z12;
                                lVar = lVar2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i12)).user_id != tL_chatInviteImporter.user_id) {
                                    i12++;
                                    z12 = r82 == true ? 1 : 0;
                                    lVar2 = lVar;
                                }
                            } else {
                                r82 = z12;
                                lVar = lVar2;
                                i12 = -1;
                            }
                        }
                        if (i12 >= 0) {
                            arrayList.remove(i12);
                            gVar.s(((gVar.c.B ? 1 : 0) ^ r82) + i12);
                            if (arrayList.isEmpty()) {
                                gVar.s(r82);
                            }
                        }
                        zh.l lVar4 = lVar;
                        lVar4.f(lVar4.t, false, r82);
                        if (z10) {
                            sb sbVar = new sb(g2Var2.getParentActivity(), g2Var2.getResourceProvider());
                            int L = org.telegram.messenger.g0.L(15.0f);
                            q9 q9Var = sbVar.a;
                            q9Var.setRoundRadius(L);
                            q9Var.f(user, new b9(0, user));
                            String k10 = p10.k(user, true);
                            String a02 = lVar4.a ? hd.a0("HasBeenAddedToChannel", null, 2131749171, k10) : hd.a0("HasBeenAddedToGroup", null, 2131749170, k10);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(k10);
                            spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), indexOf, k10.length() + indexOf, 18);
                            sbVar.b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                gc.g(g2Var2, sbVar, 2750).j();
                            } else {
                                gc.f(lVar4.h, sbVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y s5 = g2Var2.getActionBar().s();
                        if (TextUtils.isEmpty(lVar4.t) && lVar4.l) {
                            s5.j(0).setVisibility(arrayList3.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ q0(s0 s0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.d = s0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.h = iArr;
        this.b = arrayList;
        this.c = z10;
        this.n = user;
    }

    public /* synthetic */ q0(bb1 bb1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = bb1Var;
        this.e = tL_error;
        this.c = z10;
        this.f = tLObject;
        this.h = bArr;
        this.b = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ q0(zh.l lVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = lVar;
        this.e = tL_error;
        this.f = tLObject;
        this.h = tL_chatInviteImporter;
        this.c = z10;
        this.n = user;
        this.b = tL_messages_hideChatJoinRequest;
    }
}
