package lh;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.DataAutoDownloadActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    public /* synthetic */ u8(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.o8 o8Var, org.telegram.ui.Cells.o8[] o8VarArr, int i10, org.telegram.ui.Cells.c5[] c5VarArr, org.telegram.ui.Cells.r8[] r8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = o8Var;
        this.e = o8VarArr;
        this.b = i10;
        this.f = c5VarArr;
        this.h = r8VarArr;
        this.n = animatorSetArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ph.d dVar = (ph.d) this.c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.e;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.n;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            ze.d.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new g9(dVar), null, false, true, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new kf.i0(dVar, g3VarArr, f6Var, i10, tL_messages_checkChatInvite, 2));
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.c, (org.telegram.ui.Cells.o8) this.d, (org.telegram.ui.Cells.o8[]) this.e, this.b, (org.telegram.ui.Cells.c5[]) this.f, (org.telegram.ui.Cells.r8[]) this.h, (AnimatorSet[]) this.n, view);
                break;
        }
    }

    public /* synthetic */ u8(ph.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.g3[] g3VarArr, org.telegram.ui.ActionBar.f6 f6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = g3VarArr;
        this.f = f6Var;
        this.h = zArr;
        this.n = activity;
    }
}
