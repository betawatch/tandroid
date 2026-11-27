// default package

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class cya implements View.OnClickListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ vnb d;
    public final /* synthetic */ long e;
    public final /* synthetic */ KeyEvent.Callback f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Context r;
    public final /* synthetic */ Object s;

    public /* synthetic */ cya(c51 c51Var, int i, TL_stars.StarsSubscription starsSubscription, nx0[] nx0VarArr, long j, Activity activity, vnb vnbVar, boolean z, String str) {
        this.f = c51Var;
        this.b = i;
        this.h = starsSubscription;
        this.n = nx0VarArr;
        this.e = j;
        this.r = activity;
        this.d = vnbVar;
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
                c51 c51Var = (c51) callback;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj3;
                nx0[] nx0VarArr = (nx0[]) obj2;
                Activity activity = (Activity) this.r;
                String str = (String) obj;
                if (!c51Var.R) {
                    int i = this.b;
                    jxa v = jxa.v(i, false);
                    long j = this.e;
                    wy wyVar = new wy((Object) c51Var, (Object) starsSubscription, i, (Object) nx0VarArr, j, (byte) 12);
                    if (v.f.amount >= starsSubscription.pricing.amount) {
                        wyVar.run();
                        break;
                    } else {
                        new dza(activity, this.d, starsSubscription.pricing.amount, z ? 8 : j < 0 ? 2 : 7, str, wyVar, j).show();
                        break;
                    }
                }
                break;
            default:
                e0b e0bVar = (e0b) callback;
                r47 r47Var = (r47) obj3;
                zu1 zu1Var = (zu1) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (!e0bVar.N1) {
                    long value = e0bVar.s1.getValue();
                    if ((e0bVar.L1 != null || (r47Var != null && zu1Var != null)) && e0bVar.R1 == null) {
                        int i2 = this.b;
                        if (!uc7.s1(i2).x2()) {
                            jxa v2 = jxa.v(i2, false);
                            da7 da7Var = new da7((Object) e0bVar, value, (Object) v2, (Object) r47Var, (Object) zu1Var, (byte) 21);
                            if (v2.e && v2.m().amount < value) {
                                Context context = this.r;
                                vnb vnbVar = this.d;
                                long j2 = this.e;
                                if (!z) {
                                    new dza(context, vnbVar, value, 5, chat == null ? "" : chat.title, da7Var, j2).show();
                                    break;
                                } else {
                                    new dza(context, vnbVar, value, 17, wf3.r(i2, j2), da7Var, j2).show();
                                    break;
                                }
                            } else {
                                da7Var.run();
                                break;
                            }
                        } else {
                            i5.b(i2);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ cya(e0b e0bVar, r47 r47Var, zu1 zu1Var, int i, boolean z, Context context, vnb vnbVar, long j, TLRPC.Chat chat) {
        this.f = e0bVar;
        this.h = r47Var;
        this.n = zu1Var;
        this.b = i;
        this.c = z;
        this.r = context;
        this.d = vnbVar;
        this.e = j;
        this.s = chat;
    }
}
