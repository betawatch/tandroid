package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.kj0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements RequestTimeDelegate, org.telegram.ui.ActionBar.c2, MessagesController.ErrorDelegate, kj0, QuickAckDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.kj0
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.b).lambda$onDrawFaded$0((View) this.c, canvas);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 1:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.b, (g0) this.c, d2Var, i10);
                break;
            default:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.b, (org.telegram.ui.ActionBar.p2) this.c, d2Var, i10);
                break;
        }
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public void run() {
        ((SendMessagesHelper) this.b).lambda$performSendMessageRequest$103((TLRPC.Message) this.c);
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.b, (org.telegram.ui.Components.sc[]) this.c, j10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.b, (TLRPC.User) this.c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
