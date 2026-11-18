package di;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x9 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ org.telegram.ui.ActionBar.i6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ x9(mc mcVar, fj fjVar, bn bnVar, int i7, boolean z10, Context context, org.telegram.ui.ActionBar.i6 i6Var, long j3, TLRPC.Chat chat) {
        this.f = mcVar;
        this.h = fjVar;
        this.n = bnVar;
        this.b = i7;
        this.c = z10;
        this.r = context;
        this.d = i6Var;
        this.e = j3;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                hi.d dVar = (hi.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.x2[] x2VarArr = (org.telegram.ui.ActionBar.x2[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.R) {
                    int i7 = this.b;
                    x8 y10 = x8.y(i7, false);
                    long j3 = this.e;
                    bi.e0 e0Var = new bi.e0(dVar, starsSubscription, i7, x2VarArr, j3, 4);
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
                fj fjVar = (fj) this.h;
                bn bnVar = (bn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!mcVar.O1) {
                    long value = mcVar.t1.getValue();
                    if ((mcVar.M1 != null || (fjVar != null && bnVar != null)) && mcVar.S1 == null) {
                        int i10 = this.b;
                        if (!mp.u1(i10).A2()) {
                            x8 y11 = x8.y(i10, false);
                            bi.k2 k2Var = new bi.k2(mcVar, value, y11, fjVar, bnVar, 7);
                            if (y11.e && y11.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.i6 i6Var = this.d;
                                long j10 = this.e;
                                if (!z10) {
                                    new fb(context, i6Var, value, 5, chat == null ? "" : chat.title, k2Var, j10).show();
                                    break;
                                } else {
                                    new fb(context, i6Var, value, 17, org.telegram.messenger.n5.s(i10, j10), k2Var, j10).show();
                                    break;
                                }
                            } else {
                                k2Var.run();
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

    public /* synthetic */ x9(hi.d dVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.x2[] x2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i7;
        this.h = starsSubscription;
        this.n = x2VarArr;
        this.e = j3;
        this.r = activity;
        this.d = i6Var;
        this.c = z10;
        this.s = str;
    }
}
