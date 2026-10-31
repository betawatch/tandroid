package org.telegram.ui;

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mb(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite;
        int i10 = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                nb nbVar = (nb) obj4;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj;
                sb sbVar = nbVar.a.n;
                if (tL_error == null) {
                    tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) tLObject;
                    for (int i11 = 0; i11 < tL_messages_exportedChatInvite.users.size(); i11++) {
                        TLRPC.User user = tL_messages_exportedChatInvite.users.get(i11);
                        if (sbVar.z0 == null) {
                            sbVar.z0 = new HashMap();
                        }
                        sbVar.z0.put(Long.valueOf(user.id), user);
                    }
                } else {
                    tL_messages_exportedChatInvite = null;
                }
                org.telegram.messenger.i0.g3(new ag.e3(nbVar, tL_chatInviteExported, tL_messages_exportedChatInvite, zArr, x1Var, 11));
                break;
            case 1:
                org.telegram.messenger.i0.g3(new fp((qp) obj4, (org.telegram.ui.ActionBar.x1[]) obj3, (TLRPC.Chat) obj2, (org.telegram.ui.ActionBar.k2) obj, 0));
                break;
            case 2:
                org.telegram.messenger.i0.g3(new ag.e3((iq) obj4, tL_error, (TLRPC.InputCheckPasswordSRP) obj3, (TwoStepVerificationActivity) obj2, (TLRPC.TL_channels_editCreator) obj, 17));
                break;
            case 3:
                zp0 zp0Var = (zp0) obj4;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                org.telegram.ui.Components.t20 t20Var = (org.telegram.ui.Components.t20) obj;
                if (tL_error != null && org.telegram.messenger.w8.r(tL_error.text) && obj3 != null) {
                    org.telegram.messenger.w8.n(zp0Var.a).u(new Object[]{tL_messages_getAttachedStickers, t20Var}, obj3);
                    break;
                } else {
                    t20Var.run(tLObject, tL_error);
                    break;
                }
                break;
            case 4:
                org.telegram.messenger.i0.g3(new m90(obj4, tL_error, obj3, obj2, obj, 2));
                break;
            case 5:
                org.telegram.messenger.i0.g3(new v8((org.telegram.ui.ActionBar.k2) obj4, (Object) tL_error, obj3, obj2, tLObject, obj, 5));
                break;
            case 6:
                org.telegram.messenger.i0.g3(new m90(obj4, tL_error, obj3, obj2, obj, 9));
                break;
            case 7:
                org.telegram.messenger.i0.g3(new m90(obj4, tL_error, obj2, obj3, obj, 13));
                break;
            case 8:
                c01 c01Var = (c01) obj4;
                c01Var.getClass();
                org.telegram.messenger.i0.g3(new v8((Object) c01Var, tLObject, obj3, (Object) tL_error, obj2, obj, 6));
                break;
            case 9:
                org.telegram.messenger.i0.g3(new org.telegram.ui.web.x((org.telegram.ui.web.z0) obj4, tLObject, (org.telegram.ui.web.x0) obj3, (String) obj2, (String) obj));
                break;
            case 10:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                z0Var.getClass();
                org.telegram.messenger.i0.g3(new v8((Object) z0Var, tLObject, obj3, obj2, (Object) tL_error, obj, 15));
                break;
            case 11:
                org.telegram.messenger.i0.g3(new v8((ph.l1) obj4, (org.telegram.ui.ActionBar.x1) obj, tLObject, (i2.g1) obj3, (org.telegram.messenger.q20) obj2, tL_error));
                break;
            case 12:
                org.telegram.messenger.i0.g3(new v8(obj4, tLObject, obj3, obj2, obj, (Object) tL_error, 18));
                break;
            case 13:
                org.telegram.messenger.i0.g3(new v8(obj4, tLObject, obj3, obj2, obj, (Object) tL_error, 19));
                break;
            case 14:
                org.telegram.messenger.i0.g3(new v8(obj4, tLObject, obj3, obj2, obj, (Object) tL_error, 22));
                break;
            case 15:
                org.telegram.messenger.i0.g3(new rh.r4(obj4, obj, tLObject, obj3, obj2, 5));
                break;
            case 16:
                rh.u5 u5Var = (rh.u5) obj4;
                u5Var.getClass();
                org.telegram.messenger.i0.g3(new v8((Object) u5Var, tLObject, obj3, obj2, obj, (Object) tL_error, 24));
                break;
            case 17:
                org.telegram.messenger.i0.g3(new rh.r4((th.z2) obj4, (Runnable) obj3, tL_error, (TL_stories.StoryItem) obj2, (vh.u6) obj));
                break;
            case 18:
                vh.n5 n5Var = (vh.n5) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers2 = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ag.c cVar = (ag.c) obj;
                if (tL_error != null && org.telegram.messenger.w8.r(tL_error.text) && storyItem != null) {
                    org.telegram.messenger.w8.n(n5Var.a).u(new Object[]{tL_messages_getAttachedStickers2, cVar}, storyItem);
                    break;
                } else {
                    cVar.run(tLObject, tL_error);
                    break;
                }
                break;
            case 19:
                org.telegram.messenger.i0.g3(new v8((zf.p0) obj4, (String) obj3, tL_error, tLObject, (org.telegram.messenger.vp) obj2, (org.telegram.messenger.hs) obj));
                break;
            default:
                org.telegram.messenger.i0.g3(new rh.r4(obj4, obj3, tLObject, obj2, obj, 13));
                break;
        }
    }

    public /* synthetic */ mb(Object obj, org.telegram.ui.ActionBar.x1 x1Var, Object obj2, org.telegram.messenger.q20 q20Var, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = x1Var;
        this.c = obj2;
        this.d = q20Var;
    }

    public /* synthetic */ mb(PrivacyControlActivity privacyControlActivity, boolean[] zArr, TLRPC.GlobalPrivacySettings globalPrivacySettings, TL_account.setGlobalPrivacySettings setglobalprivacysettings) {
        this.a = 7;
        this.b = privacyControlActivity;
        this.d = zArr;
        this.c = globalPrivacySettings;
        this.e = setglobalprivacysettings;
    }
}
