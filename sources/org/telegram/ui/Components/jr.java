package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jr(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                mr.S((mr) this.c, (Context) this.d, (ci.d) this.e, this.b);
                break;
            case 1:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.c;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                uyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new j21(uyVar, dialogFilter, dialog, this.b, 1), 100L);
                break;
            default:
                tg.b0.P((tg.b0) this.c, (TL_stories.PrepaidGiveaway) this.d, this.b, (org.telegram.ui.ActionBar.n2) this.e);
                break;
        }
    }

    public /* synthetic */ jr(tg.b0 b0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        this.a = 2;
        this.c = b0Var;
        this.d = prepaidGiveaway;
        this.b = j3;
        this.e = n2Var;
    }
}
