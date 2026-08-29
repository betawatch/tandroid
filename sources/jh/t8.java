package jh;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.DataAutoDownloadActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t8 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ t8(nh.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.c6 c6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = f3VarArr;
        this.f = c6Var;
        this.h = zArr;
        this.n = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                nh.d dVar = (nh.d) this.c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.e;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.n;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            ye.d.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new f9(dVar), null, false, true, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new jf.i0(dVar, f3VarArr, c6Var, i10, tL_messages_checkChatInvite, 2));
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.c, (org.telegram.ui.Cells.n8) this.d, (org.telegram.ui.Cells.n8[]) this.e, this.b, (org.telegram.ui.Cells.b5[]) this.f, (org.telegram.ui.Cells.q8[]) this.h, (AnimatorSet[]) this.n, view);
                break;
        }
    }

    public /* synthetic */ t8(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.n8 n8Var, org.telegram.ui.Cells.n8[] n8VarArr, int i10, org.telegram.ui.Cells.b5[] b5VarArr, org.telegram.ui.Cells.q8[] q8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = n8Var;
        this.e = n8VarArr;
        this.b = i10;
        this.f = b5VarArr;
        this.h = q8VarArr;
        this.n = animatorSetArr;
    }
}
