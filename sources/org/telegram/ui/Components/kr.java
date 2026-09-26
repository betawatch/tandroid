package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kr(Object obj, Object obj2, Object obj3, long j3, int i10) {
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
                nr.S((nr) this.c, (Context) this.d, (ci.d) this.e, this.b);
                break;
            case 1:
                org.telegram.ui.qy qyVar = (org.telegram.ui.qy) this.c;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                qyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new w21(qyVar, dialogFilter, dialog, this.b, 1), 100L);
                break;
            default:
                tg.a0.P((tg.a0) this.c, (TL_stories.PrepaidGiveaway) this.d, this.b, (org.telegram.ui.ActionBar.m2) this.e);
                break;
        }
    }

    public /* synthetic */ kr(tg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, org.telegram.ui.ActionBar.m2 m2Var) {
        this.a = 2;
        this.c = a0Var;
        this.d = prepaidGiveaway;
        this.b = j3;
        this.e = m2Var;
    }
}
