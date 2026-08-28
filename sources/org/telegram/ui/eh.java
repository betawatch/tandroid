package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eh(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        int i9 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i9) {
            case 0:
                qn.o0((qn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 1:
                dy.A0((dy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ve.d dVar = (ve.d) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.x1;
                if (dVar != null) {
                    launchActivity.getClass();
                    dVar.b();
                }
                if (MessagesController.getInstance(launchActivity.K).getUserOrChat(l10.longValue()) != null) {
                    new fh.p2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null && (R instanceof qn)) {
                        ((qn) R).qb();
                        break;
                    }
                }
                break;
            default:
                kb0 kb0Var = (kb0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                org.telegram.ui.Components.no0 no0Var = (org.telegram.ui.Components.no0) obj2;
                Long l11 = (Long) obj;
                TLRPC.User user = l11 == null ? null : MessagesController.getInstance(kb0Var.b).getUser(l11);
                userArr[0] = user;
                if (user != null) {
                    no0Var.run();
                    break;
                } else {
                    kb0Var.a();
                    org.telegram.messenger.ll.p(R.string.NoUsernameFound, kb0.b(), null);
                    break;
                }
        }
    }

    public /* synthetic */ eh(dy dyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.a = 1;
        this.c = dyVar;
        this.b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
