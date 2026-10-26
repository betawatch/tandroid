package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class lb implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ lb(be beVar, MessageObject messageObject, un unVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.u6 u6Var, long j10, TLRPC.Chat chat) {
        this.f = beVar;
        this.h = messageObject;
        this.n = unVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = u6Var;
        this.e = j10;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fi.d dVar = (fi.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.k3[] k3VarArr = (org.telegram.ui.ActionBar.k3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.Q) {
                    int i10 = this.b;
                    ca y3 = ca.y(i10, false);
                    long j10 = this.e;
                    h0 h0Var = new h0((Object) dVar, (Object) starsSubscription, i10, (Object) k3VarArr, j10, 1);
                    if (y3.f.amount >= starsSubscription.pricing.amount) {
                        h0Var.run();
                        break;
                    } else {
                        new tc(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, h0Var, j10).show();
                        break;
                    }
                }
                break;
            default:
                be beVar = (be) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                un unVar = (un) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!beVar.T) {
                    long value = beVar.r.getValue();
                    if ((beVar.R != null || (messageObject != null && unVar != null)) && beVar.X == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            ca y10 = ca.y(i11, false);
                            a0 a0Var = new a0(beVar, value, y10, messageObject, unVar);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.u6 u6Var = this.d;
                                long j11 = this.e;
                                if (!z10) {
                                    new tc(context, u6Var, value, 5, chat == null ? "" : chat.title, a0Var, j11).show();
                                    break;
                                } else {
                                    new tc(context, u6Var, value, 17, DialogObject.getShortName(i11, j11), a0Var, j11).show();
                                    break;
                                }
                            } else {
                                a0Var.run();
                                break;
                            }
                        } else {
                            org.telegram.ui.b.b(i11);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ lb(fi.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.k3[] k3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = k3VarArr;
        this.e = j10;
        this.r = activity;
        this.d = u6Var;
        this.c = z10;
        this.s = str;
    }
}
