package lg;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.u8;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.is;
import org.telegram.ui.ra1;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ TLObject n;

    public /* synthetic */ p0(File file, ArrayList arrayList, d2 d2Var, wm wmVar, TLRPC.Document document, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.d = file;
        this.b = arrayList;
        this.e = d2Var;
        this.f = wmVar;
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
        zh.k kVar;
        int i3 = this.a;
        boolean z11 = this.c;
        Object obj = this.b;
        TLObject tLObject = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                r0.Z((r0) obj5, (TLRPC.TL_error) obj4, (TLObject) obj3, (int[]) obj2, (ArrayList) obj, this.c, (TLRPC.User) tLObject);
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                d2 d2Var = (d2) obj4;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
                arrayList2.add(new ye(0, ((File) obj5).getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.v1().N2(d2Var.getParentActivity(), null, d2Var.getResourceProvider());
                PhotoViewer.v1().j2(arrayList2, 0, 11, false, new nv0(), (wm) obj3);
                PhotoViewer.v1().Z0(document, z11 ? document : null, false, null);
                is.p().T = z11 ? tL_messages_stickerSet : null;
                break;
            case 2:
                ra1.i0((ra1) obj5, (TLRPC.TL_error) obj4, this.c, (TLObject) obj3, (byte[]) obj2, (String) obj, (TL_account.passwordInputSettings) tLObject);
                break;
            default:
                zh.k kVar2 = (zh.k) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                TLObject tLObject2 = (TLObject) obj3;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) obj2;
                TLRPC.User user = (TLRPC.User) tLObject;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) obj;
                int i10 = kVar2.k;
                ArrayList arrayList3 = kVar2.e;
                d2 d2Var2 = kVar2.g;
                if (d2Var2 != null && d2Var2.getParentActivity() != null) {
                    if (tL_error != null) {
                        t4.e0(i10, tL_error, d2Var2, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject2;
                        boolean z12 = true;
                        if (!tL_updates.chats.isEmpty()) {
                            hp.s1(i10).V2(0, tL_updates.chats.get(0).id, true);
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
                        zh.f fVar = kVar2.f;
                        zh.k kVar3 = fVar.c;
                        int i12 = 0;
                        while (true) {
                            arrayList = kVar3.c;
                            if (i12 < arrayList.size()) {
                                r82 = z12;
                                kVar = kVar2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList.get(i12)).user_id != tL_chatInviteImporter.user_id) {
                                    i12++;
                                    z12 = r82 == true ? 1 : 0;
                                    kVar2 = kVar;
                                }
                            } else {
                                r82 = z12;
                                kVar = kVar2;
                                i12 = -1;
                            }
                        }
                        if (i12 >= 0) {
                            arrayList.remove(i12);
                            fVar.s(((fVar.c.B ? 1 : 0) ^ r82) + i12);
                            if (arrayList.isEmpty()) {
                                fVar.s(r82);
                            }
                        }
                        zh.k kVar4 = kVar;
                        kVar4.f(kVar4.t, false, r82);
                        if (z10) {
                            mb mbVar = new mb(d2Var2.getParentActivity(), d2Var2.getResourceProvider());
                            int L = org.telegram.messenger.g0.L(15.0f);
                            k9 k9Var = mbVar.a;
                            k9Var.setRoundRadius(L);
                            k9Var.e(user, new u8(0, user));
                            String j10 = l10.j(user, true);
                            String a02 = kVar4.a ? bd.a0("HasBeenAddedToChannel", null, 2131749372, j10) : bd.a0("HasBeenAddedToGroup", null, 2131749371, j10);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                            int indexOf = a02.indexOf(j10);
                            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), indexOf, j10.length() + indexOf, 18);
                            mbVar.b.setText(spannableStringBuilder);
                            if (arrayList3.isEmpty()) {
                                ac.g(d2Var2, mbVar, 2750).j();
                            } else {
                                ac.f(kVar4.h, mbVar, 2750).j();
                            }
                        }
                        org.telegram.ui.ActionBar.x q10 = d2Var2.getActionBar().q();
                        if (TextUtils.isEmpty(kVar4.t) && kVar4.l) {
                            q10.j(0).setVisibility(arrayList3.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ p0(r0 r0Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z10, TLRPC.User user) {
        this.d = r0Var;
        this.e = tL_error;
        this.f = tLObject;
        this.h = iArr;
        this.b = arrayList;
        this.c = z10;
        this.n = user;
    }

    public /* synthetic */ p0(ra1 ra1Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.d = ra1Var;
        this.e = tL_error;
        this.c = z10;
        this.f = tLObject;
        this.h = bArr;
        this.b = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ p0(zh.k kVar, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.d = kVar;
        this.e = tL_error;
        this.f = tLObject;
        this.h = tL_chatInviteImporter;
        this.c = z10;
        this.n = user;
        this.b = tL_messages_hideChatJoinRequest;
    }
}
