package hh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ t8(jb jbVar, MessageObject messageObject, rn rnVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TLRPC.Chat chat) {
        this.f = jbVar;
        this.h = messageObject;
        this.n = rnVar;
        this.b = i10;
        this.c = z10;
        this.r = context;
        this.d = c6Var;
        this.e = j10;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                lh.d dVar = (lh.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.e3[] e3VarArr = (org.telegram.ui.ActionBar.e3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.J) {
                    int i10 = this.b;
                    u7 y10 = u7.y(i10, false);
                    long j10 = this.e;
                    gh.a0 a0Var = new gh.a0(dVar, starsSubscription, i10, e3VarArr, j10, 2);
                    if (y10.f.amount >= starsSubscription.pricing.amount) {
                        a0Var.run();
                        break;
                    } else {
                        new ea(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, a0Var, j10).show();
                        break;
                    }
                }
                break;
            default:
                jb jbVar = (jb) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                rn rnVar = (rn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!jbVar.N) {
                    long value = jbVar.r.getValue();
                    if ((jbVar.L != null || (messageObject != null && rnVar != null)) && jbVar.R == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            u7 y11 = u7.y(i11, false);
                            gh.k1 k1Var = new gh.k1(jbVar, value, y11, messageObject, rnVar, 7);
                            if (y11.e && y11.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.c6 c6Var = this.d;
                                long j11 = this.e;
                                if (!z10) {
                                    new ea(context, c6Var, value, 5, chat == null ? "" : chat.title, k1Var, j11).show();
                                    break;
                                } else {
                                    new ea(context, c6Var, value, 17, DialogObject.getShortName(i11, j11), k1Var, j11).show();
                                    break;
                                }
                            } else {
                                k1Var.run();
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

    public /* synthetic */ t8(lh.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.e3[] e3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = e3VarArr;
        this.e = j10;
        this.r = activity;
        this.d = c6Var;
        this.c = z10;
        this.s = str;
    }
}
