package lh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r8 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ r8(eb ebVar, MessageObject messageObject, xn xnVar, int i10, boolean z4, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, TLRPC.Chat chat) {
        this.f = ebVar;
        this.h = messageObject;
        this.n = xnVar;
        this.b = i10;
        this.c = z4;
        this.r = context;
        this.d = f6Var;
        this.e = j10;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ph.d dVar = (ph.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.g3[] g3VarArr = (org.telegram.ui.ActionBar.g3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.K) {
                    int i10 = this.b;
                    t7 y10 = t7.y(i10, false);
                    long j10 = this.e;
                    kh.x xVar = new kh.x(dVar, starsSubscription, i10, g3VarArr, j10, 2);
                    if (y10.f.amount >= starsSubscription.pricing.amount) {
                        xVar.run();
                        break;
                    } else {
                        new z9(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, xVar, j10).show();
                        break;
                    }
                }
                break;
            default:
                eb ebVar = (eb) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                xn xnVar = (xn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!ebVar.O) {
                    long value = ebVar.r.getValue();
                    if ((ebVar.M != null || (messageObject != null && xnVar != null)) && ebVar.S == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            t7 y11 = t7.y(i11, false);
                            kh.g1 g1Var = new kh.g1(ebVar, value, y11, messageObject, xnVar, 7);
                            if (y11.e && y11.p().amount < value) {
                                boolean z4 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.f6 f6Var = this.d;
                                long j11 = this.e;
                                if (!z4) {
                                    new z9(context, f6Var, value, 5, chat == null ? "" : chat.title, g1Var, j11).show();
                                    break;
                                } else {
                                    new z9(context, f6Var, value, 17, DialogObject.getShortName(i11, j11), g1Var, j11).show();
                                    break;
                                }
                            } else {
                                g1Var.run();
                                break;
                            }
                        } else {
                            org.telegram.ui.c.b(i11);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ r8(ph.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.g3[] g3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = g3VarArr;
        this.e = j10;
        this.r = activity;
        this.d = f6Var;
        this.c = z4;
        this.s = str;
    }
}
