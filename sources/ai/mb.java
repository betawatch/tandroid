package ai;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class mb implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ mb(le leVar, MessageObject messageObject, sn snVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j10, TLRPC.Chat chat) {
        this.f = leVar;
        this.h = messageObject;
        this.n = snVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = d6Var;
        this.e = j10;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ei.d dVar = (ei.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.N) {
                    int i10 = this.b;
                    ga y3 = ga.y(i10, false);
                    long j10 = this.e;
                    g0 g0Var = new g0((Object) dVar, (Object) starsSubscription, i10, (Object) f3VarArr, j10, 1);
                    if (y3.f.amount >= starsSubscription.pricing.amount) {
                        g0Var.run();
                        break;
                    } else {
                        new cd(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, g0Var, j10).show();
                        break;
                    }
                }
                break;
            default:
                le leVar = (le) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                sn snVar = (sn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!leVar.S) {
                    long value = leVar.r.getValue();
                    if ((leVar.Q != null || (messageObject != null && snVar != null)) && leVar.W == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            ga y10 = ga.y(i11, false);
                            z zVar = new z(leVar, value, y10, messageObject, snVar);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.d6 d6Var = this.d;
                                long j11 = this.e;
                                if (!z10) {
                                    new cd(context, d6Var, value, 5, chat == null ? "" : chat.title, zVar, j11).show();
                                    break;
                                } else {
                                    new cd(context, d6Var, value, 17, DialogObject.getShortName(i11, j11), zVar, j11).show();
                                    break;
                                }
                            } else {
                                zVar.run();
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

    public /* synthetic */ mb(ei.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = f3VarArr;
        this.e = j10;
        this.r = activity;
        this.d = d6Var;
        this.c = z10;
        this.s = str;
    }
}
