package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class hj implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ hj(int i10, di.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, org.telegram.ui.ActionBar.f3[] f3VarArr) {
        this.e = dVar;
        this.f = f3VarArr;
        this.b = i10;
        this.c = z10;
        this.h = starsSubscription;
        this.d = z11;
        this.n = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i10) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.c, (TLRPC.Message) obj3, (ArrayList) obj2, this.d, (ArrayList) obj, this.b);
                break;
            default:
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((di.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var = ((org.telegram.ui.ActionBar.f3[]) obj3)[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                zh.s5.y(this.b, false).S();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    org.telegram.ui.Components.yc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags((!this.c || TextUtils.isEmpty(starsSubscription.title)) ? (!this.d || TextUtils.isEmpty(starsSubscription.title)) ? LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date)) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title)), null).k(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.c = z10;
        this.f = message;
        this.h = arrayList;
        this.d = z11;
        this.n = arrayList2;
        this.b = i10;
    }
}
