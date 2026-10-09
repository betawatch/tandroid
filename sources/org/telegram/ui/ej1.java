package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ej1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ej1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ii1(20, (fj1) this.b, (int[]) this.c));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new rr0((qg.o2) this.b, tLObject, (qg.m2) this.c, tL_error, 25));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new tg.q(tLObject, (MessagesController) this.b, (tg.x0) this.c, 0));
                break;
            case 3:
                MessagesController messagesController = (MessagesController) this.b;
                ft ftVar = (ft) this.c;
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
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.w1(24, ftVar, arrayList));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new tg.q(this.b, (Object) tL_error, this.c, 6));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new tg.q(this.b, tLObject, this.c, 9));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new tg.q(this.b, tLObject, this.c, 10));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new yh.i1((yh.s3) this.b, tLObject, (tg.q) this.c, tL_error, 0));
                break;
            case 8:
                yh.s3.g1(tLObject, tL_error, (TL_stars.InputSavedStarGift) this.c, (yh.s3) this.b);
                break;
            case 9:
                yh.s3.W0((yh.s3) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, tL_error);
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new tg.q((yh.m5) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 19));
                break;
            default:
                AndroidUtilities.runOnUIThread(new tg.q(this.b, tLObject, this.c, 20));
                break;
        }
    }
}
