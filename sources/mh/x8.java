package mh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ x8(int i10, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, qh.d dVar, boolean z4, boolean z10, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.e = dVar;
        this.f = h3VarArr;
        this.d = i10;
        this.b = z4;
        this.h = starsSubscription;
        this.c = z10;
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
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj2;
                TLObject tLObject = (TLObject) obj;
                ((qh.d) obj4).setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var = ((org.telegram.ui.ActionBar.h3[]) obj3)[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                }
                t7.y(this.d, false).S();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    qc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags((!this.b || TextUtils.isEmpty(starsSubscription.title)) ? (!this.c || TextUtils.isEmpty(starsSubscription.title)) ? LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date)) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title)), null).k(false);
                    break;
                }
                break;
            default:
                ((SendMessagesHelper) obj4).lambda$performSendMessageRequest$95(this.b, (TLRPC.Message) obj3, (ArrayList) obj2, this.c, (ArrayList) obj, this.d);
                break;
        }
    }

    public /* synthetic */ x8(SendMessagesHelper sendMessagesHelper, boolean z4, TLRPC.Message message, ArrayList arrayList, boolean z10, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.b = z4;
        this.f = message;
        this.h = arrayList;
        this.c = z10;
        this.n = arrayList2;
        this.d = i10;
    }
}
