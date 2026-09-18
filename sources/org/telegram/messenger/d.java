package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.uj0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements org.telegram.ui.ActionBar.a2, RequestTimeDelegate, MessagesController.ErrorDelegate, uj0, QuickAckDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.uj0
    public void b(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.b).lambda$onDrawFaded$0((View) this.c, canvas);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.b, (org.telegram.ui.ActionBar.n2) this.c, b2Var, i10);
                break;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.b, (g0) this.c, b2Var, i10);
                break;
        }
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public void run() {
        ((SendMessagesHelper) this.b).lambda$performSendMessageRequest$103((TLRPC.Message) this.c);
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.b, (org.telegram.ui.Components.zc[]) this.c, j3);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$295;
        lambda$addUsersToChat$295 = MessagesController.lambda$addUsersToChat$295((q0.a) this.b, (TLRPC.User) this.c, tL_error);
        return lambda$addUsersToChat$295;
    }
}
