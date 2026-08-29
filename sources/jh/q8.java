package jh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q8 implements View.OnClickListener {
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

    public /* synthetic */ q8(db dbVar, MessageObject messageObject, tn tnVar, int i10, boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TLRPC.Chat chat) {
        this.f = dbVar;
        this.h = messageObject;
        this.n = tnVar;
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
                nh.d dVar = (nh.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.J) {
                    int i10 = this.b;
                    s7 y8 = s7.y(i10, false);
                    long j10 = this.e;
                    ih.y yVar = new ih.y(dVar, starsSubscription, i10, f3VarArr, j10, 2);
                    if (y8.f.amount >= starsSubscription.pricing.amount) {
                        yVar.run();
                        break;
                    } else {
                        new y9(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, yVar, j10).show();
                        break;
                    }
                }
                break;
            default:
                db dbVar = (db) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                tn tnVar = (tn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!dbVar.N) {
                    long value = dbVar.r.getValue();
                    if ((dbVar.L != null || (messageObject != null && tnVar != null)) && dbVar.R == null) {
                        int i11 = this.b;
                        if (!MessagesController.getInstance(i11).isFrozen()) {
                            s7 y10 = s7.y(i11, false);
                            ih.h1 h1Var = new ih.h1(dbVar, value, y10, messageObject, tnVar, 7);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.c6 c6Var = this.d;
                                long j11 = this.e;
                                if (!z10) {
                                    new y9(context, c6Var, value, 5, chat == null ? "" : chat.title, h1Var, j11).show();
                                    break;
                                } else {
                                    new y9(context, c6Var, value, 17, DialogObject.getShortName(i11, j11), h1Var, j11).show();
                                    break;
                                }
                            } else {
                                h1Var.run();
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

    public /* synthetic */ q8(nh.d dVar, int i10, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i10;
        this.h = starsSubscription;
        this.n = f3VarArr;
        this.e = j10;
        this.r = activity;
        this.d = c6Var;
        this.c = z10;
        this.s = str;
    }
}
