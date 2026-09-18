package ki;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import yh.t5;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ b0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, f3[] f3VarArr) {
        this.e = dVar;
        this.f = f3VarArr;
        this.d = i10;
        this.b = z10;
        this.h = starsSubscription;
        this.c = z11;
        this.n = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File file;
        switch (this.a) {
            case 0:
                h0 h0Var = (h0) this.e;
                o oVar = (o) this.f;
                boolean z10 = this.b;
                File file2 = (File) this.h;
                boolean z11 = this.c;
                int i10 = this.d;
                e0 e0Var = (e0) this.n;
                h0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    oVar.c();
                    h0Var.l.b("preview output finalized: size=" + oVar.a.length() + ", replace=" + z10 + ", elapsedMs=" + h0.e(nanoTime));
                    h0Var.f();
                    if (z10) {
                        h0Var.q(file2, h0Var.A, h0Var.B, z11, i10);
                        file = file2;
                        w7.k.c(oVar.a);
                    } else {
                        file = file2;
                        h0Var.b(e0Var, oVar.a, h0Var.y, true);
                    }
                    w7.k.c(file);
                    h0Var.K = null;
                    break;
                } catch (Exception e) {
                    h0Var.h.post(new x(h0Var, e, 0));
                    return;
                }
            case 1:
                ((SendMessagesHelper) this.e).lambda$performSendMessageRequest$95(this.b, (TLRPC.Message) this.f, (ArrayList) this.h, this.c, (ArrayList) this.n, this.d);
                break;
            default:
                ci.d dVar = (ci.d) this.e;
                f3[] f3VarArr = (f3[]) this.f;
                int i11 = this.d;
                boolean z12 = this.b;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                boolean z13 = this.c;
                TLObject tLObject = (TLObject) this.n;
                dVar.setLoading(false);
                f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.dismiss();
                }
                t5.y(i11, false).S();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    xc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags((!z12 || TextUtils.isEmpty(starsSubscription.title)) ? (!z13 || TextUtils.isEmpty(starsSubscription.title)) ? LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date)) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title)), null).k(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b0(h0 h0Var, o oVar, boolean z10, File file, boolean z11, int i10, e0 e0Var) {
        this.e = h0Var;
        this.f = oVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i10;
        this.n = e0Var;
    }

    public /* synthetic */ b0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i10;
    }
}
