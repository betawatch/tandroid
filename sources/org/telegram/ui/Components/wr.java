package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wr(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                zr.S((zr) this.c, (Context) this.d, (fi.d) this.e, this.b);
                break;
            case 1:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) this.c;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                eyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new bi.y2(eyVar, dialogFilter, dialog, this.b, 19), 100L);
                break;
            default:
                vg.a0.P((vg.a0) this.c, (TL_stories.PrepaidGiveaway) this.d, this.b, (org.telegram.ui.ActionBar.r2) this.e);
                break;
        }
    }

    public /* synthetic */ wr(vg.a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.a = 2;
        this.c = a0Var;
        this.d = prepaidGiveaway;
        this.b = j10;
        this.e = r2Var;
    }
}
