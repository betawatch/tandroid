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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kj1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kj1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wg1(26, (lj1) this.b, (int[]) this.c));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new yw0(this.b, tLObject, this.c, tL_error, 23));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new pi.g(tLObject, (MessagesController) this.b, (ug.x0) this.c, 9));
                break;
            case 3:
                MessagesController messagesController = (MessagesController) this.b;
                mt mtVar = (mt) this.c;
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
                    AndroidUtilities.runOnUIThread(new s9.b(12, mtVar, arrayList));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new pi.g((org.telegram.ui.Components.ns0) this.b, tL_error, (org.telegram.ui.ActionBar.m2) this.c, 15));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new pi.g((yh.t3) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 18));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new pi.g((zh.g) this.b, tLObject, (Context) this.c, 19));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new yw0(this.b, tLObject, this.c, tL_error, 29));
                break;
            case 8:
                zh.r3.g1((zh.r3) this.b, (TL_stars.InputSavedStarGift) this.c, tLObject, tL_error);
                break;
            case 9:
                zh.r3.W0((zh.r3) this.b, (org.telegram.ui.ActionBar.a2) this.c, tLObject, tL_error);
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new pi.g((zh.n5) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 28));
                break;
            default:
                AndroidUtilities.runOnUIThread(new pi.g((zh.n5) this.b, tLObject, (Runnable) this.c, 29));
                break;
        }
    }
}
