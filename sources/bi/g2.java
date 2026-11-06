package bi;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.bh;
import org.telegram.ui.bk0;
import org.telegram.ui.oo0;
import org.telegram.ui.oy0;
import org.telegram.ui.sj0;
import org.telegram.ui.so;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i7 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.g0.h3(new a3((k7) obj4, tLObject, (wg.f1[]) obj3, (Long) obj2, (aa.s) obj, tL_error, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new a3((k7) obj4, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, 1));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new a3((ea) obj4, tLObject, (ij) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (bh) obj, tL_error, 4));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new u0(obj4, (org.telegram.ui.ActionBar.u1) obj3, tLObject, (TLObject) obj2, obj, 6));
                break;
            case 4:
                t9 t9Var = (t9) obj4;
                t9Var.getClass();
                org.telegram.messenger.g0.h3(new a3(t9Var, tLObject, (TL_stars.TL_starGiftCollection) obj3, (v9) obj2, (c20) obj, tL_error, 6));
                break;
            case 5:
                org.telegram.messenger.g0.h3(new u0(obj4, obj3, tL_error, (TLObject) obj2, obj, 9));
                break;
            case 6:
                fi.e7 e7Var = (fi.e7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                j0 j0Var = (j0) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && storyItem != null) {
                    org.telegram.messenger.r8.n(e7Var.a).u(new Object[]{tL_messages_getAttachedStickers, j0Var}, storyItem);
                    break;
                } else {
                    j0Var.run(tLObject, tL_error);
                    break;
                }
            case 7:
                org.telegram.messenger.g0.h3(new a3((jg.z0) obj4, (String) obj3, tL_error, tLObject, (qp) obj2, (yr) obj));
                break;
            case 8:
                org.telegram.messenger.g0.h3(new u0((jg.b2) obj4, (TLRPC.TL_messages_getStickers) obj3, tLObject, (ArrayList) obj2, (LongSparseArray) obj, 14));
                break;
            case 9:
                org.telegram.ui.hb hbVar = (org.telegram.ui.hb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj;
                org.telegram.ui.mb mbVar = hbVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i10 = 0; i10 < tL_messages_exportedChatInvite.users.size(); i10++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i10);
                        if (mbVar.z0 == null) {
                            mbVar.z0 = new HashMap();
                        }
                        mbVar.z0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                org.telegram.messenger.g0.h3(new u0(hbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, u1Var));
                break;
            case 10:
                org.telegram.messenger.g0.h3(new org.telegram.ui.m6((so) obj4, (org.telegram.ui.ActionBar.u1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.f2) obj, 10));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new u0(obj4, tL_error, obj3, obj2, (TLObject) obj, 27));
                break;
            case 12:
                oo0 oo0Var = (oo0) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                org.telegram.ui.ld ldVar = (org.telegram.ui.ld) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(oo0Var.a).u(new Object[]{tL_messages_getAttachedStickers2, ldVar}, obj3);
                    break;
                } else {
                    ldVar.run(tLObject, tL_error);
                    break;
                }
            case 13:
                org.telegram.messenger.g0.h3(new jv0(obj4, tL_error, obj3, obj2, obj, 12));
                break;
            case 14:
                org.telegram.messenger.g0.h3(new a3((bk0) obj4, tL_error, (String) obj3, (sj0) obj2, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new jv0(obj4, tL_error, obj3, obj2, obj, 19));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new jv0(obj4, tL_error, obj3, obj2, obj, 23));
                break;
            case 17:
                oy0 oy0Var = (oy0) obj4;
                oy0Var.getClass();
                org.telegram.messenger.g0.h3(new a3(oy0Var, tLObject, (CharSequence) obj3, tL_error, (byte[]) obj2, (String) obj));
                break;
            case 18:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.x((org.telegram.ui.web.x0) obj4, tLObject, (di.o7) obj3, (String) obj2, (String) obj));
                break;
            case 19:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj4;
                x0Var.getClass();
                org.telegram.messenger.g0.h3(new a3(x0Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj3, (String) obj2, tL_error, (String) obj));
                break;
            default:
                org.telegram.messenger.g0.h3(new a3((zh.h1) obj4, (org.telegram.ui.ActionBar.u1) obj3, tLObject, (ub) obj2, (c20) obj, tL_error));
                break;
        }
    }
}
