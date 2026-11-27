// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class od5 extends c79 {
    public final Context c;
    public final /* synthetic */ sd5 d;

    public od5(sd5 sd5Var, Context context) {
        this.d = sd5Var;
        this.c = context;
    }

    @Override // j79
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        View view = f89Var.a;
        if ((view instanceof lj6) && this.d.Z1.contains(Long.valueOf(((lj6) view).getUserId()))) {
            return false;
        }
        int i = f89Var.f;
        return i == 0 || i == 1;
    }

    @Override // j79
    public final int b() {
        return this.d.l2;
    }

    @Override // j79
    public final int d(int i) {
        sd5 sd5Var = this.d;
        if (i >= sd5Var.e2 && i < sd5Var.f2) {
            return 0;
        }
        if (i >= sd5Var.h2 && i < sd5Var.i2) {
            return 0;
        }
        if (i == sd5Var.c2) {
            return 1;
        }
        if (i == sd5Var.j2 || i == sd5Var.g2) {
            return 2;
        }
        if (i == 0) {
            return 3;
        }
        if (i == sd5Var.d2) {
            return 4;
        }
        return i == sd5Var.k2 ? 5 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        TLObject tLObject;
        int i2;
        sd5 sd5Var = this.d;
        ArrayList arrayList = sd5Var.R1;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 == 0) {
            lj6 lj6Var = (lj6) view;
            lj6Var.setTag(Integer.valueOf(i));
            int i4 = sd5Var.e2;
            if (i < i4 || i >= sd5Var.f2) {
                int i5 = sd5Var.h2;
                tLObject = (i < i5 || i >= sd5Var.i2) ? null : (TLObject) sd5Var.S1.get(i - i5);
            } else {
                tLObject = (TLObject) arrayList.get(i - i4);
            }
            if (i < sd5Var.e2 || i >= (i2 = sd5Var.f2)) {
                i2 = sd5Var.i2;
            }
            TLRPC.User X1 = uc7.s1(sd5Var.a).X1(Long.valueOf(tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? r47.B1(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id));
            if (X1 != null) {
                lj6Var.setCustomImageVisible(sd5Var.Z1.contains(Long.valueOf(X1.id)));
                lj6Var.c(X1, null, null, i != i2 - 1);
                return;
            }
            return;
        }
        if (i3 == 1) {
            ij6 ij6Var = (ij6) view;
            if (i == sd5Var.c2) {
                if ((!sd5Var.W1 || sd5Var.X1) && sd5Var.j2 == -1 && !arrayList.isEmpty()) {
                    r2 = true;
                }
                ij6Var.b(R.drawable.msg_link, 7, ob6.M0(2131743042, null), r2);
                return;
            }
            return;
        }
        if (i3 == 2) {
            p55 p55Var = (p55) view;
            if (i == sd5Var.j2) {
                p55Var.setText(ob6.M0(2131752306, null));
            } else if (i == sd5Var.g2) {
                if (sd5Var.b2) {
                    p55Var.setText(ob6.M0(2131742456, null));
                } else {
                    p55Var.setText(ob6.M0(2131749210, null));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [ij6] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, p55] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v5, types: [tk4] */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        lj6 lj6Var;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                ?? ij6Var = new ij6(context);
                int i2 = aob.gh;
                ij6Var.a(i2, i2);
                ij6Var.setDividerColor(aob.Xg);
                lj6Var = ij6Var;
            } else if (i == 2) {
                ?? p55Var = new p55(context, null);
                yob.h(aob.ah, null, p55Var);
                p55Var.setTextColor(aob.Hh);
                lj6Var = p55Var;
            } else if (i == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new r79(-1, hl.L(56.0f)));
                lj6Var = view;
            } else if (i != 5) {
                lj6Var = new View(context);
            } else {
                ?? tk4Var = new tk4(context, null);
                tk4Var.setViewType(6);
                tk4Var.setIsSingleCell(true);
                tk4Var.e(aob.Wg, aob.Ih, aob.ah);
                lj6Var = tk4Var;
            }
        } else {
            lj6 lj6Var2 = new lj6(this.c, 6, 2, false, null);
            lj6Var2.setCustomRightImage(R.drawable.msg_invited);
            lj6Var2.setNameColor(aob.w0(null, aob.eh, false));
            int w0 = aob.w0(null, aob.ch, false);
            int w02 = aob.w0(null, aob.gh, false);
            lj6Var2.P = true;
            lj6Var2.I = w0;
            lj6Var2.J = w02;
            lj6Var2.setDividerColor(aob.Xg);
            lj6Var = lj6Var2;
        }
        return new n69(lj6Var);
    }
}
