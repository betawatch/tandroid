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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cj1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cj1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new w81(23, (dj1) this.b, (int[]) this.c));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new es0((rg.o2) this.b, tLObject, (rg.m2) this.c, tL_error, 24));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.er0(tLObject, (MessagesController) this.b, (ug.y0) this.c, 26));
                break;
            case 3:
                MessagesController messagesController = (MessagesController) this.b;
                oj0 oj0Var = (oj0) this.c;
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
                    AndroidUtilities.runOnUIThread(new ug.r(1, oj0Var, arrayList));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new wh.n((org.telegram.ui.Components.nr0) this.b, tL_error, (org.telegram.ui.ActionBar.n2) this.c, 1));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new wh.n((yh.t3) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 4));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new wh.n((zh.g) this.b, tLObject, (Context) this.c, 5));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new es0((zh.w3) this.b, tLObject, (wh.n) this.c, tL_error, 29));
                break;
            case 8:
                zh.w3.f1((zh.w3) this.b, (TL_stars.InputSavedStarGift) this.c, tLObject, tL_error);
                break;
            case 9:
                zh.w3.V0((zh.w3) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, tL_error);
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new wh.n((zh.s5) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 14));
                break;
            default:
                AndroidUtilities.runOnUIThread(new wh.n((zh.s5) this.b, tLObject, (Runnable) this.c, 15));
                break;
        }
    }
}
