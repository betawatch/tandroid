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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class nb implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ nb(me meVar, MessageObject messageObject, sn snVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j10, TLRPC.Chat chat) {
        this.f = meVar;
        this.h = messageObject;
        this.n = snVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = g6Var;
        this.e = j10;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ei.d dVar = (ei.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.Q) {
                    int i10 = this.b;
                    ha y3 = ha.y(i10, false);
                    long j10 = this.e;
                    g0 g0Var = new g0((Object) dVar, (Object) starsSubscription, i10, (Object) h3VarArr, j10, 1);
                    if (y3.f.amount >= starsSubscription.pricing.amount) {
                        g0Var.run();
                        break;
                    } else {
                        new dd(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, g0Var, j10).show();
                        break;
                    }
                }
                break;
            default:
                me meVar = (me) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                sn snVar = (sn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!meVar.T) {
                    long value = meVar.r.getValue();
                    if ((meVar.R != null || (messageObject != null && snVar != null)) && meVar.X == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            ha y10 = ha.y(i11, false);
                            z zVar = new z(meVar, value, y10, messageObject, snVar);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.g6 g6Var = this.d;
                                long j11 = this.e;
                                if (!z10) {
                                    new dd(context, g6Var, value, 5, chat == null ? "" : chat.title, zVar, j11).show();
                                    break;
                                } else {
                                    new dd(context, g6Var, value, 17, DialogObject.getShortName(i11, j11), zVar, j11).show();
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

    public /* synthetic */ nb(ei.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.h3[] h3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = h3VarArr;
        this.e = j10;
        this.r = activity;
        this.d = g6Var;
        this.c = z10;
        this.s = str;
    }
}
