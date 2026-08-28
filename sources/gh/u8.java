package gh;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u8 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.b6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ u8(jb jbVar, MessageObject messageObject, qn qnVar, int i9, boolean z10, Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, TLRPC.Chat chat) {
        this.f = jbVar;
        this.h = messageObject;
        this.n = qnVar;
        this.b = i9;
        this.c = z10;
        this.r = context;
        this.d = b6Var;
        this.e = j10;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                kh.d dVar = (kh.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.J) {
                    int i9 = this.b;
                    v7 y10 = v7.y(i9, false);
                    long j10 = this.e;
                    fh.c0 c0Var = new fh.c0(dVar, starsSubscription, i9, f3VarArr, j10, 2);
                    if (y10.f.amount >= starsSubscription.pricing.amount) {
                        c0Var.run();
                        break;
                    } else {
                        new ea(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, c0Var, j10).show();
                        break;
                    }
                }
                break;
            default:
                jb jbVar = (jb) this.f;
                MessageObject messageObject = (MessageObject) this.h;
                qn qnVar = (qn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!jbVar.N) {
                    long value = jbVar.r.getValue();
                    if ((jbVar.L != null || (messageObject != null && qnVar != null)) && jbVar.R == null) {
                        int i10 = this.b;
                        if (!MessagesController.getInstance(i10).isFrozen()) {
                            v7 y11 = v7.y(i10, false);
                            fh.m1 m1Var = new fh.m1(jbVar, value, y11, messageObject, qnVar, 7);
                            if (y11.e && y11.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.b6 b6Var = this.d;
                                long j11 = this.e;
                                if (!z10) {
                                    new ea(context, b6Var, value, 5, chat == null ? "" : chat.title, m1Var, j11).show();
                                    break;
                                } else {
                                    new ea(context, b6Var, value, 17, DialogObject.getShortName(i10, j11), m1Var, j11).show();
                                    break;
                                }
                            } else {
                                m1Var.run();
                                break;
                            }
                        } else {
                            org.telegram.ui.b.b(i10);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ u8(kh.d dVar, int i9, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.f3[] f3VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i9;
        this.h = starsSubscription;
        this.n = f3VarArr;
        this.e = j10;
        this.r = activity;
        this.d = b6Var;
        this.c = z10;
        this.s = str;
    }
}
