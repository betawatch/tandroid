package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gh(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                rn.p0((rn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 1:
                gy.B0((gy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                we.d dVar = (we.d) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.x1;
                if (dVar != null) {
                    launchActivity.getClass();
                    dVar.b();
                }
                if (MessagesController.getInstance(launchActivity.K).getUserOrChat(l10.longValue()) != null) {
                    new gh.k2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null && (R instanceof rn)) {
                        ((rn) R).qb();
                        break;
                    }
                }
                break;
            default:
                ob0 ob0Var = (ob0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.l11 l11Var = (org.telegram.ui.Components.l11) obj2;
                Long l11 = (Long) obj;
                TLRPC.User user = l11 == null ? null : MessagesController.getInstance(ob0Var.b).getUser(l11);
                userArr[0] = user;
                if (user != null) {
                    l11Var.run();
                    break;
                } else {
                    ob0Var.a();
                    org.telegram.messenger.y1.r(R.string.NoUsernameFound, ob0.b(), null);
                    break;
                }
        }
    }

    public /* synthetic */ gh(gy gyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.a = 1;
        this.c = gyVar;
        this.b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
