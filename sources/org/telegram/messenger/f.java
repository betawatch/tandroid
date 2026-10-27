package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gj0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements org.telegram.ui.ActionBar.b2, RequestTimeDelegate, MessagesController.ErrorDelegate, gj0, QuickAckDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.gj0
    public void a(Canvas canvas) {
        ((RichMessageLayout.RichThinkingBlock) this.b).lambda$onDrawFaded$0((View) this.c, canvas);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.a) {
            case 0:
                AndroidUtilities.lambda$isMapsInstalled$11((String) this.b, (org.telegram.ui.ActionBar.r2) this.c, e2Var, i10);
                break;
            default:
                AndroidUtilities.lambda$showProxyAlert$20((SharedPreferences) this.b, (j0) this.c, e2Var, i10);
                break;
        }
    }

    @Override // org.telegram.tgnet.QuickAckDelegate
    public void run() {
        ((SendMessagesHelper) this.b).lambda$performSendMessageRequest$106((TLRPC.Message) this.c);
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.lambda$showProxyAlert$18((boolean[]) this.b, (org.telegram.ui.Components.yc[]) this.c, j10);
    }

    @Override // org.telegram.messenger.MessagesController.ErrorDelegate
    public boolean run(TLRPC.TL_error tL_error) {
        boolean lambda$addUsersToChat$294;
        lambda$addUsersToChat$294 = MessagesController.lambda$addUsersToChat$294((q0.a) this.b, (TLRPC.User) this.c, tL_error);
        return lambda$addUsersToChat$294;
    }
}
