package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib implements View.OnClickListener {
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

    public /* synthetic */ ib(ce ceVar, ij ijVar, cn cnVar, int i7, boolean z9, Context context, org.telegram.ui.ActionBar.g6 g6Var, long j3, TLRPC.Chat chat) {
        this.f = ceVar;
        this.h = ijVar;
        this.n = cnVar;
        this.b = i7;
        this.c = z9;
        this.r = context;
        this.d = g6Var;
        this.e = j3;
        this.s = chat;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fi.d dVar = (fi.d) this.f;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) this.h;
                org.telegram.ui.ActionBar.v2[] v2VarArr = (org.telegram.ui.ActionBar.v2[]) this.n;
                Activity activity = (Activity) this.r;
                String str = (String) this.s;
                if (!dVar.Q) {
                    int i7 = this.b;
                    ea y10 = ea.y(i7, false);
                    long j3 = this.e;
                    d0 d0Var = new d0(dVar, starsSubscription, i7, v2VarArr, j3, 1);
                    if (y10.f.amount >= starsSubscription.pricing.amount) {
                        d0Var.run();
                        break;
                    } else {
                        new tc(activity, this.d, starsSubscription.pricing.amount, this.c ? 8 : j3 < 0 ? 2 : 7, str, d0Var, j3).show();
                        break;
                    }
                }
                break;
            default:
                ce ceVar = (ce) this.f;
                ij ijVar = (ij) this.h;
                cn cnVar = (cn) this.n;
                TLRPC.Chat chat = (TLRPC.Chat) this.s;
                if (!ceVar.K1) {
                    long value = ceVar.p1.getValue();
                    if ((ceVar.I1 != null || (ijVar != null && cnVar != null)) && ceVar.O1 == null) {
                        int i10 = this.b;
                        if (!qp.s1(i10).v2()) {
                            ea y11 = ea.y(i10, false);
                            i0 i0Var = new i0(ceVar, value, y11, ijVar, cnVar);
                            if (y11.e && y11.p().amount < value) {
                                boolean z9 = this.c;
                                Context context = this.r;
                                org.telegram.ui.ActionBar.g6 g6Var = this.d;
                                long j10 = this.e;
                                if (!z9) {
                                    new tc(context, g6Var, value, 5, chat == null ? "" : chat.title, i0Var, j10).show();
                                    break;
                                } else {
                                    new tc(context, g6Var, value, 17, org.telegram.messenger.m5.s(i10, j10), i0Var, j10).show();
                                    break;
                                }
                            } else {
                                i0Var.run();
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

    public /* synthetic */ ib(fi.d dVar, int i7, TL_stars.StarsSubscription starsSubscription, org.telegram.ui.ActionBar.v2[] v2VarArr, long j3, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, String str) {
        this.f = dVar;
        this.b = i7;
        this.h = starsSubscription;
        this.n = v2VarArr;
        this.e = j3;
        this.r = activity;
        this.d = g6Var;
        this.c = z9;
        this.s = str;
    }
}
