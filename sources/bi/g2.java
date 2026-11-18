package bi;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.bh;
import org.telegram.ui.gb;
import org.telegram.ui.hk0;
import org.telegram.ui.lb;
import org.telegram.ui.qo0;
import org.telegram.ui.qy0;
import org.telegram.ui.vo;
import org.telegram.ui.wn;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.messenger.g0.g3(new h2((j3) obj4, (org.telegram.ui.ActionBar.u1) obj3, tLObject, (ai.g1) obj2, (x10) obj, tL_error, 0));
                break;
            case 1:
                org.telegram.messenger.g0.g3(new h2((di.f6) obj4, tLObject, (a2[]) obj3, (Long) obj2, (aa.r) obj, tL_error, 2, false));
                break;
            case 2:
                org.telegram.messenger.g0.g3(new h2((di.f6) obj4, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, 1, false));
                break;
            case 3:
                org.telegram.messenger.g0.g3(new h2((di.x8) obj4, tLObject, (fj) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (bh) obj, tL_error, 5, false));
                break;
            case 4:
                org.telegram.messenger.g0.g3(new ai.b((di.x8) obj4, (org.telegram.ui.ActionBar.u1) obj3, tLObject, (TL_stars.InputSavedStarGift) obj2, (x10) obj, 9));
                break;
            case 5:
                di.m8 m8Var = (di.m8) obj4;
                m8Var.getClass();
                org.telegram.messenger.g0.g3(new h2(m8Var, tLObject, (TL_stars.TL_starGiftCollection) obj3, (di.o8) obj2, (x10) obj, tL_error, 7, false));
                break;
            case 6:
                org.telegram.messenger.g0.g3(new ai.b((fi.z3) obj4, (Runnable) obj3, tL_error, (TL_stories.StoryItem) obj2, (hi.o8) obj, 12));
                break;
            case 7:
                hi.d7 d7Var = (hi.d7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ai.e1 e1Var = (ai.e1) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && storyItem != null) {
                    org.telegram.messenger.r8.n(d7Var.a).u(new Object[]{tL_messages_getAttachedStickers, e1Var}, storyItem);
                    break;
                } else {
                    e1Var.run(tLObject, tL_error);
                    break;
                }
            case 8:
                org.telegram.messenger.g0.g3(new h2((jg.z0) obj4, (String) obj3, tL_error, tLObject, (mp) obj2, (tr) obj));
                break;
            case 9:
                org.telegram.messenger.g0.g3(new ai.b((jg.a2) obj4, (TLRPC.TL_messages_getStickers) obj3, tLObject, (ArrayList) obj2, (LongSparseArray) obj, 17));
                break;
            case 10:
                gb gbVar = (gb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj2;
                boolean[] zArr = (boolean[]) obj;
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj3;
                lb lbVar = gbVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i10 = 0; i10 < tL_messages_exportedChatInvite.users.size(); i10++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i10);
                        if (lbVar.A0 == null) {
                            lbVar.A0 = new HashMap();
                        }
                        lbVar.A0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                org.telegram.messenger.g0.g3(new ai.b(gbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, u1Var));
                break;
            case 11:
                org.telegram.messenger.g0.g3(new org.telegram.messenger.camera.i((vo) obj4, (org.telegram.ui.ActionBar.u1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.h2) obj, 15));
                break;
            case 12:
                org.telegram.messenger.g0.g3(new wn(obj4, tL_error, obj3, obj2, obj, 1));
                break;
            case 13:
                qo0 qo0Var = (qo0) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                org.telegram.ui.u7 u7Var = (org.telegram.ui.u7) obj;
                if (tL_error != null && org.telegram.messenger.r8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.r8.n(qo0Var.a).u(new Object[]{tL_messages_getAttachedStickers2, u7Var}, obj3);
                    break;
                } else {
                    u7Var.run(tLObject, tL_error);
                    break;
                }
            case 14:
                org.telegram.messenger.g0.g3(new wn(obj4, tL_error, obj3, obj2, obj, 17));
                break;
            case 15:
                org.telegram.messenger.g0.g3(new h2((hk0) obj4, tL_error, (String) obj3, (yj0) obj2, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                break;
            case 16:
                org.telegram.messenger.g0.g3(new wn(obj4, tL_error, obj3, obj2, obj, 24));
                break;
            case 17:
                org.telegram.messenger.g0.g3(new wn(obj4, tL_error, obj3, obj2, obj, 28));
                break;
            case 18:
                qy0 qy0Var = (qy0) obj4;
                qy0Var.getClass();
                org.telegram.messenger.g0.g3(new h2(qy0Var, tLObject, (CharSequence) obj3, tL_error, (byte[]) obj2, (String) obj));
                break;
            case 19:
                org.telegram.messenger.g0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) obj4, tLObject, (fi.f7) obj3, (String) obj2, (String) obj));
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                v0Var.getClass();
                org.telegram.messenger.g0.g3(new h2(v0Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj3, (String) obj2, tL_error, (String) obj));
                break;
        }
    }

    public /* synthetic */ g2(gb gbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = 10;
        this.b = gbVar;
        this.d = tL_chatInviteExported;
        this.e = zArr;
        this.c = u1Var;
    }
}
