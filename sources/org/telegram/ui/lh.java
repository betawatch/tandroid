package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lh(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                zn.p0((zn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 1:
                qy.B0((qy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ze.c cVar = (ze.c) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.y1;
                if (cVar != null) {
                    launchActivity.getClass();
                    cVar.b();
                }
                if (MessagesController.getInstance(launchActivity.L).getUserOrChat(l10.longValue()) != null) {
                    new kh.g2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null && (R instanceof zn)) {
                        ((zn) R).qb();
                        break;
                    }
                }
                break;
            default:
                yb0 yb0Var = (yb0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                c30 c30Var = (c30) obj2;
                Long l11 = (Long) obj;
                TLRPC.User user = l11 == null ? null : MessagesController.getInstance(yb0Var.b).getUser(l11);
                userArr[0] = user;
                if (user != null) {
                    c30Var.run();
                    break;
                } else {
                    yb0Var.a();
                    org.telegram.messenger.y3.s(R.string.NoUsernameFound, yb0.b(), null);
                    break;
                }
        }
    }

    public /* synthetic */ lh(qy qyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.a = 1;
        this.c = qyVar;
        this.b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
