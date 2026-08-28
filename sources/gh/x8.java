package gh;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.DataAutoDownloadActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class x8 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ x8(kh.d dVar, TL_stars.StarsSubscription starsSubscription, int i9, org.telegram.ui.ActionBar.f3[] f3VarArr, org.telegram.ui.ActionBar.b6 b6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i9;
        this.e = f3VarArr;
        this.f = b6Var;
        this.h = zArr;
        this.n = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kh.d dVar = (kh.d) this.c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.e;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.n;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            ve.e.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new k9(dVar), null, false, true, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i9 = this.b;
                        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_checkChatInvite, new ff.j0(dVar, f3VarArr, b6Var, i9, tL_messages_checkChatInvite, 2));
                        break;
                    }
                }
                break;
            default:
                DataAutoDownloadActivity.T((DataAutoDownloadActivity) this.c, (org.telegram.ui.Cells.q8) this.d, (org.telegram.ui.Cells.q8[]) this.e, this.b, (org.telegram.ui.Cells.d5[]) this.f, (org.telegram.ui.Cells.t8[]) this.h, (AnimatorSet[]) this.n, view);
                break;
        }
    }

    public /* synthetic */ x8(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.q8 q8Var, org.telegram.ui.Cells.q8[] q8VarArr, int i9, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.t8[] t8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = q8Var;
        this.e = q8VarArr;
        this.b = i9;
        this.f = d5VarArr;
        this.h = t8VarArr;
        this.n = animatorSetArr;
    }
}
