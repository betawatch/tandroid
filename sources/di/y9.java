package di;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y9 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.h6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ y9(mc mcVar, gj gjVar, bn bnVar, int i7, boolean z10, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, TLRPC.Chat chat) {
        this.f = mcVar;
        this.h = gjVar;
        this.n = bnVar;
        this.b = i7;
        this.c = z10;
        this.r = context;
        this.d = h6Var;
        this.e = j3;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hi.e eVar = (hi.e) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!eVar.R) {
                    int i7 = this.b;
                    y8 y10 = y8.y(i7, false);
                    long j3 = this.e;
                    bi.e0 e0Var = new bi.e0(eVar, starsSubscription, i7, w2VarArr, j3, 4);
                    if (y10.f.amount >= starsSubscription.pricing.amount) {
                        e0Var.run();
                        break;
                    } else {
                        new fb(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j3 < 0 ? 2 : 7, str, e0Var, j3).show();
                        break;
                    }
                }
                break;
            default:
                mc mcVar = (mc) this.f;
                gj gjVar = (gj) this.h;
                bn bnVar = (bn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!mcVar.O1) {
                    long value = mcVar.t1.getValue();
                    if ((mcVar.M1 != null || (gjVar != null && bnVar != null)) && mcVar.S1 == null) {
                        int i10 = this.b;
                        if (!np.u1(i10).A2()) {
                            y8 y11 = y8.y(i10, false);
                            bi.o2 o2Var = new bi.o2(mcVar, value, y11, gjVar, bnVar, 7);
                            if (y11.e && y11.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.h6 h6Var = this.d;
                                long j10 = this.e;
                                if (!z10) {
                                    new fb(context, h6Var, value, 5, chat == null ? "" : chat.title, o2Var, j10).show();
                                    break;
                                } else {
                                    new fb(context, h6Var, value, 17, org.telegram.messenger.n5.s(i10, j10), o2Var, j10).show();
                                    break;
                                }
                            } else {
                                o2Var.run();
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

    public /* synthetic */ y9(hi.e eVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.w2[] w2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, String str) {
        this.f = eVar;
        this.b = i7;
        this.h = starsSubscription;
        this.n = w2VarArr;
        this.e = j3;
        this.r = activity;
        this.d = h6Var;
        this.c = z10;
        this.s = str;
    }
}
