package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jh(Object obj, Object obj2, Object obj3, int i10) {
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
                xn.p0((xn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 1:
                oy.B0((oy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                af.f fVar = (af.f) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.y1;
                if (fVar != null) {
                    launchActivity.getClass();
                    fVar.b();
                }
                if (MessagesController.getInstance(launchActivity.L).getUserOrChat(l10.longValue()) != null) {
                    new kh.h2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null && (R instanceof xn)) {
                        ((xn) R).qb();
                        break;
                    }
                }
                break;
            default:
                wb0 wb0Var = (wb0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                a30 a30Var = (a30) obj2;
                Long l11 = (Long) obj;
                TLRPC.User user = l11 == null ? null : MessagesController.getInstance(wb0Var.b).getUser(l11);
                userArr[0] = user;
                if (user != null) {
                    a30Var.run();
                    break;
                } else {
                    wb0Var.a();
                    org.telegram.messenger.y3.s(R.string.NoUsernameFound, wb0.b(), null);
                    break;
                }
        }
    }

    public /* synthetic */ jh(oy oyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.a = 1;
        this.c = oyVar;
        this.b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
