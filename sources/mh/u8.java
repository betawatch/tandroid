package mh;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.DataAutoDownloadActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ u8(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.p8 p8Var, org.telegram.ui.Cells.p8[] p8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.s8[] s8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = p8Var;
        this.e = p8VarArr;
        this.b = i10;
        this.f = d5VarArr;
        this.h = s8VarArr;
        this.n = animatorSetArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                qh.d dVar = (qh.d) this.c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.e;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.n;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            af.g.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new g9(dVar), null, false, true, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new lf.i0(dVar, h3VarArr, g6Var, i10, tL_messages_checkChatInvite, 2));
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.c, (org.telegram.ui.Cells.p8) this.d, (org.telegram.ui.Cells.p8[]) this.e, this.b, (org.telegram.ui.Cells.d5[]) this.f, (org.telegram.ui.Cells.s8[]) this.h, (AnimatorSet[]) this.n, view);
                break;
        }
    }

    public /* synthetic */ u8(qh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr, org.telegram.ui.ActionBar.g6 g6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = h3VarArr;
        this.f = g6Var;
        this.h = zArr;
        this.n = activity;
    }
}
