package kg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ff;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.y31;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.ns;
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject n;

    public /* synthetic */ o0(File file, ArrayList arrayList, e2 e2Var, an anVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d = file;
        this.b = arrayList;
        this.e = e2Var;
        this.f = anVar;
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
                q0.Z((q0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.c, (TLRPC.User) tLObject);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                e2 e2Var = (e2) obj4;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new ff(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.p1().I2(e2Var.getParentActivity(), null, e2Var.getResourceProvider());
                PhotoViewer.p1().f2(arrayList2, 0, 11, false, new qv0(), (an) obj3);
                PhotoViewer.p1().S0(document, z11 ? document : null, false, null);
                ns.p().T = z11 ? tL_messages_stickerSet : null;
                break;
            case 2:
                xa1.i0((xa1) obj5, (TLRPC.TL_error) obj4, this.c, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
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
                e2 e2Var2 = lVar2.g;
                if (e2Var2 != null && e2Var2.getParentActivity() != null) {
                    if (tL_error != null) {
                        t4.c0(i10, tL_error, e2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        boolean z12 = true;
                        if (!tL_updates.chats.isEmpty()) {
                            np.s1(i10).V2(0, tL_updates.chats.get(0).id, true);
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
                            jb jbVar = new jb(e2Var2.getParentActivity(), e2Var2.getResourceProvider());
                            int L = org.telegram.messenger.g0.L(15.0f);
                            i9 i9Var = jbVar.a;
                            i9Var.setRoundRadius(L);
                            i9Var.f(user, new t8(0, user));
                            String j3 = q10.j(user, true);
                            String a02 = lVar4.a ? hd.a0("HasBeenAddedToChannel", null, 2131749364, j3) : hd.a0("HasBeenAddedToGroup", null, 2131749363, j3);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(j3);
                            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), indexOf, j3.length() + indexOf, 18);
                            jbVar.b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                xb.g(e2Var2, jbVar, 2750).j();
                            } else {
                                xb.f(lVar4.h, jbVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y s5 = e2Var2.getActionBar().s();
                        if (TextUtils.isEmpty(lVar4.t) && lVar4.l) {
                            s5.j(0).setVisibility(arrayList3.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ o0(q0 q0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.d = q0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.h = iArr;
        this.b = arrayList;
        this.c = z10;
        this.n = user;
    }

    public /* synthetic */ o0(xa1 xa1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = xa1Var;
        this.e = tL_error;
        this.c = z10;
        this.f = tLObject;
        this.h = bArr;
        this.b = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ o0(zh.l lVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = lVar;
        this.e = tL_error;
        this.f = tLObject;
        this.h = tL_chatInviteImporter;
        this.c = z10;
        this.n = user;
        this.b = tL_messages_hideChatJoinRequest;
    }
}
