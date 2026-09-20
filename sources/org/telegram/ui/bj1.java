package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class bj1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bj1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w81(23, (cj1) this.b, (int[]) this.c));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new fs0((qg.n2) this.b, tLObject, (qg.l2) this.c, tL_error, 24));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cn0(tLObject, (MessagesController) this.b, (tg.x0) this.c, 28));
                break;
            case 3:
                MessagesController messagesController = (MessagesController) this.b;
                pj0 pj0Var = (pj0) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            arrayList.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(25, pj0Var, arrayList));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.r((org.telegram.ui.Components.yr0) this.b, tL_error, (org.telegram.ui.ActionBar.n2) this.c, 4));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.r((xh.v3) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 7));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.r((yh.g) this.b, tLObject, (Context) this.c, 8));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new fs0((yh.y3) this.b, tLObject, (tg.r) this.c, tL_error, 29));
                break;
            case 8:
                yh.y3.f1((yh.y3) this.b, (TL_stars.InputSavedStarGift) this.c, tLObject, tL_error);
                break;
            case 9:
                yh.y3.V0((yh.y3) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, tL_error);
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.r((yh.u5) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 17));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tg.r((yh.u5) this.b, tLObject, (Runnable) this.c, 18));
                break;
        }
    }
}
