package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class au implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback[] e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ au(ci.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.e3[] e3VarArr, org.telegram.ui.ActionBar.d6 d6Var, boolean[] zArr, Activity activity) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = e3VarArr;
        this.f = d6Var;
        this.h = zArr;
        this.n = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                DataAutoDownloadActivity.U((DataAutoDownloadActivity) this.c, (org.telegram.ui.Cells.s8) this.d, (org.telegram.ui.Cells.s8[]) this.e, this.b, (org.telegram.ui.Cells.d5[]) this.f, (org.telegram.ui.Cells.w8[]) this.h, (AnimatorSet[]) this.n, view);
                break;
            default:
                ci.d dVar = (ci.d) this.c;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.d;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.e;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.f;
                boolean[] zArr = (boolean[]) this.h;
                Activity activity = (Activity) this.n;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    if (starsSubscription.chat_invite_hash == null) {
                        if (starsSubscription.invoice_slug != null) {
                            zArr[0] = true;
                            nf.f.r(activity, Uri.parse("https://t.me/$" + starsSubscription.invoice_slug), true, false, false, new yh.v6(dVar), null, false, true, false);
                            break;
                        }
                    } else {
                        TLRPC.TL_messages_checkChatInvite tL_messages_checkChatInvite = new TLRPC.TL_messages_checkChatInvite();
                        tL_messages_checkChatInvite.hash = starsSubscription.chat_invite_hash;
                        int i10 = this.b;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_checkChatInvite, new ai.ya(dVar, e3VarArr, d6Var, i10, tL_messages_checkChatInvite, 14));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ au(DataAutoDownloadActivity dataAutoDownloadActivity, org.telegram.ui.Cells.s8 s8Var, org.telegram.ui.Cells.s8[] s8VarArr, int i10, org.telegram.ui.Cells.d5[] d5VarArr, org.telegram.ui.Cells.w8[] w8VarArr, AnimatorSet[] animatorSetArr) {
        this.c = dataAutoDownloadActivity;
        this.d = s8Var;
        this.e = s8VarArr;
        this.b = i10;
        this.f = d5VarArr;
        this.h = w8VarArr;
        this.n = animatorSetArr;
    }
}
