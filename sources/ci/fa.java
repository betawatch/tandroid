package ci;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements View.OnClickListener {
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

    public /* synthetic */ fa(tc tcVar, zi ziVar, wm wmVar, int i3, boolean z10, Context context, org.telegram.ui.ActionBar.e6 e6Var, long j10, TLRPC.Chat chat) {
        this.f = tcVar;
        this.h = ziVar;
        this.n = wmVar;
        this.b = i3;
        this.c = z10;
        this.r = context;
        this.d = e6Var;
        this.e = j10;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                gi.d dVar = (gi.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.R) {
                    int i3 = this.b;
                    e9 y9 = e9.y(i3, false);
                    long j10 = this.e;
                    ai.k0 k0Var = new ai.k0(dVar, starsSubscription, i3, t2VarArr, j10, 2);
                    if (y9.f.amount >= starsSubscription.pricing.amount) {
                        k0Var.run();
                        break;
                    } else {
                        new mb(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j10 < 0 ? 2 : 7, str, k0Var, j10).show();
                        break;
                    }
                }
                break;
            default:
                tc tcVar = (tc) this.f;
                zi ziVar = (zi) this.h;
                wm wmVar = (wm) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!tcVar.L1) {
                    long value = tcVar.q1.getValue();
                    if ((tcVar.J1 != null || (ziVar != null && wmVar != null)) && tcVar.P1 == null) {
                        int i10 = this.b;
                        if (!hp.s1(i10).v2()) {
                            e9 y10 = e9.y(i10, false);
                            ai.z1 z1Var = new ai.z1(tcVar, value, y10, ziVar, wmVar, 8);
                            if (y10.e && y10.p().amount < value) {
                                boolean z10 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.e6 e6Var = this.d;
                                long j11 = this.e;
                                if (!z10) {
                                    new mb(context, e6Var, value, 5, chat == null ? "" : chat.title, z1Var, j11).show();
                                    break;
                                } else {
                                    new mb(context, e6Var, value, 17, org.telegram.messenger.m5.s(i10, j11), z1Var, j11).show();
                                    break;
                                }
                            } else {
                                z1Var.run();
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

    public /* synthetic */ fa(gi.d dVar, int i3, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.t2[] t2VarArr, long j10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, String str) {
        this.f = dVar;
        this.b = i3;
        this.h = starsSubscription;
        this.n = t2VarArr;
        this.e = j10;
        this.r = activity;
        this.d = e6Var;
        this.c = z10;
        this.s = str;
    }
}
