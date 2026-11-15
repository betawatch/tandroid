package bi;

import android.util.LongSparseArray;
import di.j8;
import di.l8;
import di.u8;
import fi.i7;
import hi.d7;
import hi.o8;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.r8;
import org.telegram.messenger.vr;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bh;
import org.telegram.ui.ce0;
import org.telegram.ui.ef0;
import org.telegram.ui.ek0;
import org.telegram.ui.gb;
import org.telegram.ui.hp;
import org.telegram.ui.lb;
import org.telegram.ui.mp;
import org.telegram.ui.my0;
import org.telegram.ui.nj0;
import org.telegram.ui.no0;
import org.telegram.ui.v7;
import org.telegram.ui.vj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l1(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
                org.telegram.messenger.g0.h3(new p1((s2) obj4, (org.telegram.ui.ActionBar.t1) obj3, tLObject, (ai.g1) obj2, (z10) obj, tL_error, 0));
                break;
            case 1:
                org.telegram.messenger.g0.h3(new p1((di.c6) obj4, tLObject, (wg.c1[]) obj3, (Long) obj2, (aa.r) obj, tL_error, 1, false));
                break;
            case 2:
                org.telegram.messenger.g0.h3(new p1((di.c6) obj4, tLObject, (CharSequence) obj3, (TL_stars.TL_starGiftUnique) obj2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) obj, tL_error, 2, false));
                break;
            case 3:
                org.telegram.messenger.g0.h3(new p1((u8) obj4, tLObject, (gj) obj3, (TLRPC.TL_inputInvoiceMessage) obj2, (bh) obj, tL_error, 5, false));
                break;
            case 4:
                org.telegram.messenger.g0.h3(new ai.b((u8) obj4, (org.telegram.ui.ActionBar.t1) obj3, tLObject, (TL_stars.InputSavedStarGift) obj2, (z10) obj, 8));
                break;
            case 5:
                j8 j8Var = (j8) obj4;
                j8Var.getClass();
                org.telegram.messenger.g0.h3(new p1(j8Var, tLObject, (TL_stars.TL_starGiftCollection) obj3, (l8) obj2, (z10) obj, tL_error, 7, false));
                break;
            case 6:
                org.telegram.messenger.g0.h3(new ai.b((fi.b4) obj4, (Runnable) obj3, tL_error, (TL_stories.StoryItem) obj2, (o8) obj, 11));
                break;
            case 7:
                d7 d7Var = (d7) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ai.e1 e1Var = (ai.e1) obj;
                if (tL_error != null && r8.r(tL_error.text) && storyItem != null) {
                    r8.n(d7Var.a).u(new Object[]{tL_messages_getAttachedStickers, e1Var}, storyItem);
                    break;
                } else {
                    e1Var.run(tLObject, tL_error);
                    break;
                }
            case 8:
                org.telegram.messenger.g0.h3(new p1((jg.z0) obj4, (String) obj3, tL_error, tLObject, (np) obj2, (vr) obj));
                break;
            case 9:
                org.telegram.messenger.g0.h3(new ai.b((jg.a2) obj4, (TLRPC.TL_messages_getStickers) obj3, tLObject, (ArrayList) obj2, (LongSparseArray) obj, 16));
                break;
            case 10:
                gb gbVar = (gb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj2;
                boolean[] zArr = (boolean[]) obj;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
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
                org.telegram.messenger.g0.h3(new ai.b(gbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, t1Var));
                break;
            case 11:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.l5(obj4, obj3, obj2, obj, 12));
                break;
            case 12:
                org.telegram.messenger.g0.h3(new hp((mp) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 0));
                break;
            case 13:
                no0 no0Var = (no0) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                v7 v7Var = (v7) obj;
                if (tL_error != null && r8.r(tL_error.text) && obj3 != null) {
                    r8.n(no0Var.a).u(new Object[]{tL_messages_getAttachedStickers2, v7Var}, obj3);
                    break;
                } else {
                    v7Var.run(tLObject, tL_error);
                    break;
                }
            case 14:
                org.telegram.messenger.g0.h3(new hp((ce0) obj4, tL_error, (String) obj3, (String) obj2, (String) obj, 16));
                break;
            case 15:
                org.telegram.messenger.g0.h3(new p1((ek0) obj4, tL_error, (String) obj3, (vj0) obj2, tLObject, (TL_account.sendVerifyPhoneCode) obj));
                break;
            case 16:
                org.telegram.messenger.g0.h3(new hp((nj0) obj4, tL_error, (ef0) obj3, (k8.a) obj2, (TL_account.verifyEmail) obj, 23));
                break;
            case 17:
                org.telegram.messenger.g0.h3(new hp((PrivacyControlActivity) obj4, tL_error, (boolean[]) obj3, (TLRPC.GlobalPrivacySettings) obj2, (TL_account.setGlobalPrivacySettings) obj, 27));
                break;
            case 18:
                my0 my0Var = (my0) obj4;
                my0Var.getClass();
                org.telegram.messenger.g0.h3(new p1(my0Var, tLObject, (CharSequence) obj3, tL_error, (byte[]) obj2, (String) obj));
                break;
            case 19:
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.x((org.telegram.ui.web.v0) obj4, tLObject, (i7) obj3, (String) obj2, (String) obj));
                break;
            default:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                v0Var.getClass();
                org.telegram.messenger.g0.h3(new p1(v0Var, tLObject, (TLRPC.TL_messages_requestUrlAuth) obj3, (String) obj2, tL_error, (String) obj));
                break;
        }
    }

    public /* synthetic */ l1(gb gbVar, TLRPC.TL_chatInviteExported tL_chatInviteExported, boolean[] zArr, org.telegram.ui.ActionBar.t1 t1Var) {
        this.a = 10;
        this.b = gbVar;
        this.d = tL_chatInviteExported;
        this.e = zArr;
        this.c = t1Var;
    }
}
