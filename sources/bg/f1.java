package bg;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.lg;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cr;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f1(h1 h1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.a = 0;
        this.c = h1Var;
        this.d = prepaidGiveaway;
        this.b = j10;
        this.e = o2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                h1.O((h1) this.c, (TL_stories.PrepaidGiveaway) this.d, this.b, (org.telegram.ui.ActionBar.o2) this.e);
                break;
            case 1:
                cr.R((cr) this.c, (Context) this.d, (kh.d) this.e, this.b);
                break;
            default:
                dy dyVar = (dy) this.c;
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) this.d;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.e;
                dyVar.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new lg(dyVar, dialogFilter, dialog, this.b, 7), 100L);
                break;
        }
    }

    public /* synthetic */ f1(Object obj, Object obj2, Object obj3, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j10;
    }
}
