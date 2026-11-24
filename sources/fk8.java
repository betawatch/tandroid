// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class fk8 extends n39 {
    public final Context c;
    public final /* synthetic */ gk8 d;

    public fk8(gk8 gk8Var, Context context) {
        this.d = gk8Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 0 || i == 2 || i == 4;
    }

    @Override // w39
    public final int b() {
        return this.d.e;
    }

    @Override // w39
    public final int d(int i) {
        gk8 gk8Var = this.d;
        if (i == gk8Var.x) {
            return 4;
        }
        if (i == gk8Var.n) {
            return 3;
        }
        if (i == gk8Var.f) {
            return 2;
        }
        return (i == gk8Var.h || i == gk8Var.w) ? 1 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        String M0;
        gk8 gk8Var = this.d;
        boolean z = gk8Var.E;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            gh6 gh6Var = (gh6) view;
            if (!z) {
                throw null;
            }
            long keyAt = gk8Var.getMessagesController().x0.keyAt(i - gk8Var.r);
            gh6Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat K0 = gk8Var.getMessagesController().K0(Long.valueOf(-keyAt));
                if (K0 != null) {
                    int i3 = K0.participants_count;
                    gh6Var.c(K0, null, i3 != 0 ? k96.G(i3, "Members", new Object[0]) : K0.has_geo ? k96.M0(2131748450, null) : !hc2.t0(K0) ? k96.M0(2131748449, null) : k96.M0(2131748446, null), i != gk8Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User V1 = gk8Var.getMessagesController().V1(Long.valueOf(keyAt));
            if (V1 != null) {
                if (V1.bot) {
                    M0 = k96.M0(2131753153, null).substring(0, 1).toUpperCase() + k96.M0(2131753153, null).substring(1);
                } else {
                    String str = V1.phone;
                    M0 = (str == null || str.length() == 0) ? k96.M0(2131747639, null) : yjb.k(new StringBuilder("+"), V1.phone, p38.f());
                }
                gh6Var.c(V1, null, M0, i != gk8Var.s - 1);
                return;
            }
            return;
        }
        if (i2 == 1) {
            mhb mhbVar = (mhb) view;
            if (i != gk8Var.h) {
                if (i == gk8Var.w) {
                    mhbVar.setFixedSize(12);
                    mhbVar.setText("");
                    return;
                }
                return;
            }
            if (z) {
                mhbVar.setFixedSize(0);
                mhbVar.setText(k96.M0(2131753674, null));
                return;
            } else {
                mhbVar.setFixedSize(8);
                mhbVar.setText(null);
                return;
            }
        }
        if (i2 == 2) {
            dh6 dh6Var = (dh6) view;
            dh6Var.a(bkb.u6, bkb.t6);
            if (z) {
                dh6Var.b(R.drawable.msg_contact_add, 5, k96.M0(2131753689, null), false);
                return;
            } else {
                k96.M0(2131746677, null);
                throw null;
            }
        }
        if (i2 == 3) {
            ld5 ld5Var = (ld5) view;
            if (i == gk8Var.n) {
                if (z) {
                    ld5Var.setText(k96.G(gk8Var.getMessagesController().y0, "BlockedUsersCount", new Object[0]));
                } else {
                    ld5Var.setText(k96.M0(2131746649, null));
                }
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        FrameLayout mhbVar;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                mhbVar = new mhb(context);
            } else if (i == 2) {
                mhbVar = new dh6(context);
            } else if (i != 4) {
                ld5 ld5Var = new ld5(this.c, bkb.K6, 21, 11, false, null);
                ld5Var.setHeight(43);
                frameLayout = ld5Var;
            } else {
                wgb wgbVar = new wgb(viewGroup.getContext());
                wgbVar.k(k96.M0(2131747722, null), false);
                wgbVar.g(-1, bkb.o7);
                frameLayout = wgbVar;
            }
            frameLayout = mhbVar;
        } else {
            gh6 gh6Var = new gh6(this.c, 7, 6, true, null);
            gh6Var.setDelegate(new k88(this, (byte) 9));
            frameLayout = gh6Var;
        }
        return new y29(frameLayout);
    }
}
