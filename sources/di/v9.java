package di;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v9 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ v9(jc jcVar, gj gjVar, an anVar, int i7, boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, TLRPC.Chat chat) {
        this.f = jcVar;
        this.h = gjVar;
        this.n = anVar;
        this.b = i7;
        this.c = z10;
        this.r = context;
        this.d = e6Var;
        this.e = j3;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hi.d dVar = (hi.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.R) {
                    int i7 = this.b;
                    v8 y10 = v8.y(i7, false);
                    long j3 = this.e;
                    bi.e0 e0Var = new bi.e0(dVar, starsSubscription, i7, u2VarArr, j3, 2);
                    if (y10.f.amount >= starsSubscription.pricing.amount) {
                        e0Var.run();
                        break;
                    } else {
                        new cb(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j3 < 0 ? 2 : 7, str, e0Var, j3).show();
                        break;
                    }
                }
                break;
            default:
                jc jcVar = (jc) this.f;
                gj gjVar = (gj) this.h;
                an anVar = (an) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!jcVar.O1) {
                    long value = jcVar.t1.getValue();
                    if ((jcVar.M1 != null || (gjVar != null && anVar != null)) && jcVar.S1 == null) {
                        int i10 = this.b;
                        if (!np.s1(i10).v2()) {
                            v8 y11 = v8.y(i10, false);
                            bi.r1 r1Var = new bi.r1(jcVar, value, y11, gjVar, anVar, 8);
                            if (y11.e && y11.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.e6 e6Var = this.d;
                                long j10 = this.e;
                                if (!z10) {
                                    new cb(context, e6Var, value, 5, chat == null ? "" : chat.title, r1Var, j10).show();
                                    break;
                                } else {
                                    new cb(context, e6Var, value, 17, org.telegram.messenger.m5.s(i10, j10), r1Var, j10).show();
                                    break;
                                }
                            } else {
                                r1Var.run();
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

    public /* synthetic */ v9(hi.d dVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.u2[] u2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i7;
        this.h = starsSubscription;
        this.n = u2VarArr;
        this.e = j3;
        this.r = activity;
        this.d = e6Var;
        this.c = z10;
        this.s = str;
    }
}
