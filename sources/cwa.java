// default package

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class cwa implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ylb d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ cwa(b61 b61Var, int i, TL_stars.StarsSubscription starsSubscription, my0[] my0VarArr, long j, Activity activity, ylb ylbVar, boolean z, String str) {
        this.f = b61Var;
        this.b = i;
        this.h = starsSubscription;
        this.n = my0VarArr;
        this.e = j;
        this.r = activity;
        this.d = ylbVar;
        this.c = z;
        this.s = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.s;
        boolean z = this.c;
        Object obj2 = this.n;
        Object obj3 = this.h;
        KeyEvent.Callback callback = this.f;
        switch (b) {
            case 0:
                b61 b61Var = (b61) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                my0[] my0VarArr = (my0[]) obj2;
                Activity activity = (Activity) this.r;
                String str = (String) obj;
                if (!b61Var.R) {
                    int i = this.b;
                    jva v = jva.v(i, false);
                    long j = this.e;
                    wz wzVar = new wz((Object) b61Var, (Object) starsSubscription, i, (Object) my0VarArr, j, (byte) 12);
                    if (v.f.amount >= starsSubscription.pricing.amount) {
                        wzVar.run();
                        break;
                    } else {
                        new dxa(activity, this.d, starsSubscription.pricing.amount, z ? 8 : j < 0 ? 2 : 7, str, wzVar, j).show();
                        break;
                    }
                }
                break;
            default:
                eya eyaVar = (eya) callback;
                k47 k47Var = (k47) obj3;
                yv1 yv1Var = (yv1) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!eyaVar.N1) {
                    long value = eyaVar.s1.getValue();
                    if ((eyaVar.L1 != null || (k47Var != null && yv1Var != null)) && eyaVar.R1 == null) {
                        int i2 = this.b;
                        if (!oc7.r1(i2).u2()) {
                            jva v2 = jva.v(i2, false);
                            r97 r97Var = new r97((Object) eyaVar, value, (Object) v2, (Object) k47Var, (Object) yv1Var, (byte) 20);
                            if (v2.e && v2.m().amount < value) {
                                Context context = this.r;
                                ylb ylbVar = this.d;
                                long j2 = this.e;
                                if (!z) {
                                    new dxa(context, ylbVar, value, 5, chat == null ? "" : chat.title, r97Var, j2).show();
                                    break;
                                } else {
                                    new dxa(context, ylbVar, value, 17, pg3.r(i2, j2), r97Var, j2).show();
                                    break;
                                }
                            } else {
                                r97Var.run();
                                break;
                            }
                        } else {
                            h5.b(i2);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ cwa(eya eyaVar, k47 k47Var, yv1 yv1Var, int i, boolean z, Context context, ylb ylbVar, long j, TLRPC.Chat chat) {
        this.f = eyaVar;
        this.h = k47Var;
        this.n = yv1Var;
        this.b = i;
        this.c = z;
        this.r = context;
        this.d = ylbVar;
        this.e = j;
        this.s = chat;
    }
}
