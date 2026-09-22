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
import yh.u5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ d0(int i10, ci.d dVar, TLObject tLObject, TL_stars.StarsSubscription starsSubscription, boolean z10, boolean z11, f3[] f3VarArr) {
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
                q0 q0Var = (q0) this.e;
                q qVar = (q) this.f;
                boolean z10 = this.b;
                File file2 = (File) this.h;
                boolean z11 = this.c;
                int i10 = this.d;
                m0 m0Var = (m0) this.n;
                q0Var.getClass();
                long nanoTime = System.nanoTime();
                try {
                    qVar.c();
                    q0Var.l.b("preview output finalized: size=" + qVar.a.length() + ", replace=" + z10 + ", elapsedMs=" + q0.e(nanoTime));
                    q0Var.f();
                    if (z10) {
                        q0Var.r(file2, q0Var.F, q0Var.G, z11, i10);
                        file = file2;
                        w7.k.c(qVar.a);
                    } else {
                        file = file2;
                        q0Var.b(m0Var, qVar.a, q0Var.D, true);
                    }
                    w7.k.c(file);
                    q0Var.P = null;
                    break;
                } catch (Exception e) {
                    q0Var.h.post(new z(q0Var, e, 0));
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
                u5.y(i11, false).S();
                n2 U = LaunchActivity.U();
                if (U != null) {
                    xc.a0(U).V(Collections.singletonList(tLObject), LocaleController.getString(R.string.StarsSubscriptionCancelledToast), AndroidUtilities.replaceTags((!z12 || TextUtils.isEmpty(starsSubscription.title)) ? (!z13 || TextUtils.isEmpty(starsSubscription.title)) ? LocaleController.formatString(R.string.StarsSubscriptionCancelledToastText, LocaleController.formatDateChat(starsSubscription.until_date)) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBotToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title) : LocaleController.formatString(R.string.StarsSubscriptionCancelledBizToastText, LocaleController.formatDateChat(starsSubscription.until_date), starsSubscription.title)), null).k(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d0(q0 q0Var, q qVar, boolean z10, File file, boolean z11, int i10, m0 m0Var) {
        this.e = q0Var;
        this.f = qVar;
        this.b = z10;
        this.h = file;
        this.c = z11;
        this.d = i10;
        this.n = m0Var;
    }

    public /* synthetic */ d0(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.Message message, ArrayList arrayList, boolean z11, ArrayList arrayList2, int i10) {
        this.e = sendMessagesHelper;
        this.b = z10;
        this.f = message;
        this.h = arrayList;
        this.c = z11;
        this.n = arrayList2;
        this.d = i10;
    }
}
