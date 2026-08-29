package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eh implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ eh(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i10) {
            case 0:
                tn.p0((tn) obj4, (TLRPC.User) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 1:
                fy.B0((fy) obj4, (TLRPC.TL_attachMenuBot) obj2, (LaunchActivity) obj3);
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ye.c cVar = (ye.c) obj3;
                int[] iArr = (int[]) obj2;
                Long l10 = (Long) obj;
                Pattern pattern = LaunchActivity.x1;
                if (cVar != null) {
                    launchActivity.getClass();
                    cVar.b();
                }
                if (MessagesController.getInstance(launchActivity.K).getUserOrChat(l10.longValue()) != null) {
                    new ih.h2(launchActivity, iArr[0], l10.longValue(), null, null).show();
                    break;
                } else {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null && (R instanceof tn)) {
                        ((tn) R).qb();
                        break;
                    }
                }
                break;
            default:
                mb0 mb0Var = (mb0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                n20 n20Var = (n20) obj2;
                Long l11 = (Long) obj;
                TLRPC.User user = l11 == null ? null : MessagesController.getInstance(mb0Var.b).getUser(l11);
                userArr[0] = user;
                if (user != null) {
                    n20Var.run();
                    break;
                } else {
                    mb0Var.a();
                    org.telegram.messenger.x3.s(R.string.NoUsernameFound, mb0.b(), null);
                    break;
                }
        }
    }

    public /* synthetic */ eh(fy fyVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        this.a = 1;
        this.c = fyVar;
        this.b = tL_attachMenuBot;
        this.d = launchActivity;
    }
}
