package kg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.w8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bb1;
import org.telegram.ui.cn;
import org.telegram.ui.ms;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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

    public /* synthetic */ o0(File file, ArrayList arrayList, f2 f2Var, cn cnVar, TLRPC.Document document, boolean z9, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d = file;
        this.b = arrayList;
        this.e = f2Var;
        this.f = cnVar;
        this.h = document;
        this.c = z9;
        this.n = tL_messages_stickerSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        ArrayList arrayList;
        ?? r82;
        yh.m mVar;
        int i7 = this.a;
        boolean z10 = this.c;
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
                f2 f2Var = (f2) obj4;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new gf(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.p1().H2(f2Var.getParentActivity(), null, f2Var.getResourceProvider());
                PhotoViewer.p1().e2(arrayList2, 0, 11, false, new pv0(), (cn) obj3);
                PhotoViewer.p1().S0(document, z10 ? document : null, false, null);
                ms.p().T = z10 ? tL_messages_stickerSet : null;
                break;
            case 2:
                bb1.i0((bb1) obj5, (TLRPC.TL_error) obj4, this.c, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                break;
            default:
                yh.m mVar2 = (yh.m) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i10 = mVar2.k;
                ArrayList arrayList3 = mVar2.e;
                f2 f2Var2 = mVar2.g;
                if (f2Var2 != null && f2Var2.getParentActivity() != null) {
                    if (tL_error != null) {
                        v4.c0(i10, tL_error, f2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        boolean z11 = true;
                        if (!tL_updates.chats.isEmpty()) {
                            qp.s1(i10).V2(0, tL_updates.chats.get(0).id, true);
                        }
                        int i11 = 0;
                        while (true) {
                            if (i11 < arrayList3.size()) {
                                z9 = z10;
                                if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i11)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList3.remove(i11);
                                } else {
                                    i11++;
                                    z10 = z9;
                                }
                            } else {
                                z9 = z10;
                            }
                        }
                        yh.h hVar = mVar2.f;
                        yh.m mVar3 = hVar.c;
                        int i12 = 0;
                        while (true) {
                            arrayList = mVar3.c;
                            if (i12 < arrayList.size()) {
                                r82 = z11;
                                mVar = mVar2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i12)).user_id != tL_chatInviteImporter.user_id) {
                                    i12++;
                                    z11 = r82 == true ? 1 : 0;
                                    mVar2 = mVar;
                                }
                            } else {
                                r82 = z11;
                                mVar = mVar2;
                                i12 = -1;
                            }
                        }
                        if (i12 >= 0) {
                            arrayList.remove(i12);
                            hVar.s(((hVar.c.B ? 1 : 0) ^ r82) + i12);
                            if (arrayList.isEmpty()) {
                                hVar.s(r82);
                            }
                        }
                        yh.m mVar4 = mVar;
                        mVar4.f(mVar4.t, false, r82);
                        if (z9) {
                            ob obVar = new ob(f2Var2.getParentActivity(), f2Var2.getResourceProvider());
                            int L = org.telegram.messenger.g0.L(15.0f);
                            l9 l9Var = obVar.a;
                            l9Var.setRoundRadius(L);
                            l9Var.e(user, new w8(0, user));
                            String j3 = t10.j(user, true);
                            String a02 = mVar4.a ? id.a0("HasBeenAddedToChannel", null, 2131749364, j3) : id.a0("HasBeenAddedToGroup", null, 2131749363, j3);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(j3);
                            spannableStringBuilder.setSpan(new v31(org.telegram.messenger.g0.o()), indexOf, j3.length() + indexOf, 18);
                            obVar.b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                cc.g(f2Var2, obVar, 2750).j();
                            } else {
                                cc.f(mVar4.h, obVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.y r10 = f2Var2.getActionBar().r();
                        if (TextUtils.isEmpty(mVar4.t) && mVar4.l) {
                            r10.j(0).setVisibility(arrayList3.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ o0(q0 q0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z9, TLRPC.User user) {
        this.d = q0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.h = iArr;
        this.b = arrayList;
        this.c = z9;
        this.n = user;
    }

    public /* synthetic */ o0(bb1 bb1Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = bb1Var;
        this.e = tL_error;
        this.c = z9;
        this.f = tLObject;
        this.h = bArr;
        this.b = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ o0(yh.m mVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = mVar;
        this.e = tL_error;
        this.f = tLObject;
        this.h = tL_chatInviteImporter;
        this.c = z9;
        this.n = user;
        this.b = tL_messages_hideChatJoinRequest;
    }
}
