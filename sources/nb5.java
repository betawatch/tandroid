// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nb5 extends n39 {
    public final Context c;
    public final /* synthetic */ rb5 d;

    public nb5(rb5 rb5Var, Context context) {
        this.d = rb5Var;
        this.c = context;
    }

    @Override // w39
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        View view = s49Var.a;
        if ((view instanceof gh6) && this.d.Z1.contains(Long.valueOf(((gh6) view).getUserId()))) {
            return false;
        }
        int i = s49Var.f;
        return i == 0 || i == 1;
    }

    @Override // w39
    public final int b() {
        return this.d.l2;
    }

    @Override // w39
    public final int d(int i) {
        rb5 rb5Var = this.d;
        if (i >= rb5Var.e2 && i < rb5Var.f2) {
            return 0;
        }
        if (i >= rb5Var.h2 && i < rb5Var.i2) {
            return 0;
        }
        if (i == rb5Var.c2) {
            return 1;
        }
        if (i == rb5Var.j2 || i == rb5Var.g2) {
            return 2;
        }
        if (i == 0) {
            return 3;
        }
        if (i == rb5Var.d2) {
            return 4;
        }
        return i == rb5Var.k2 ? 5 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        TLObject tLObject;
        int i2;
        rb5 rb5Var = this.d;
        ArrayList arrayList = rb5Var.R1;
        int i3 = s49Var.f;
        View view = s49Var.a;
        if (i3 == 0) {
            gh6 gh6Var = (gh6) view;
            gh6Var.setTag(Integer.valueOf(i));
            int i4 = rb5Var.e2;
            if (i < i4 || i >= rb5Var.f2) {
                int i5 = rb5Var.h2;
                tLObject = (i < i5 || i >= rb5Var.i2) ? null : (TLObject) rb5Var.S1.get(i - i5);
            } else {
                tLObject = (TLObject) arrayList.get(i - i4);
            }
            if (i < rb5Var.e2 || i >= (i2 = rb5Var.f2)) {
                i2 = rb5Var.i2;
            }
            TLRPC.User V1 = na7.q1(rb5Var.a).V1(Long.valueOf(tLObject instanceof TLRPC.TL_contact ? ((TLRPC.TL_contact) tLObject).user_id : tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.ChannelParticipant ? k27.B1(((TLRPC.ChannelParticipant) tLObject).peer) : ((TLRPC.ChatParticipant) tLObject).user_id));
            if (V1 != null) {
                gh6Var.setCustomImageVisible(rb5Var.Z1.contains(Long.valueOf(V1.id)));
                gh6Var.c(V1, null, null, i != i2 - 1);
                return;
            }
            return;
        }
        if (i3 == 1) {
            dh6 dh6Var = (dh6) view;
            if (i == rb5Var.c2) {
                if ((!rb5Var.W1 || rb5Var.X1) && rb5Var.j2 == -1 && !arrayList.isEmpty()) {
                    r2 = true;
                }
                dh6Var.b(R.drawable.msg_link, 7, k96.M0(2131743148, null), r2);
                return;
            }
            return;
        }
        if (i3 == 2) {
            l35 l35Var = (l35) view;
            if (i == rb5Var.j2) {
                l35Var.setText(k96.M0(2131752324, null));
            } else if (i == rb5Var.g2) {
                if (rb5Var.b2) {
                    l35Var.setText(k96.M0(2131742562, null));
                } else {
                    l35Var.setText(k96.M0(2131749264, null));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [dh6] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, l35] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v5, types: [pi4] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        gh6 gh6Var;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                ?? dh6Var = new dh6(context);
                int i2 = bkb.fh;
                dh6Var.a(i2, i2);
                dh6Var.setDividerColor(bkb.Wg);
                gh6Var = dh6Var;
            } else if (i == 2) {
                ?? l35Var = new l35(context, null);
                zkb.h(bkb.Zg, null, l35Var);
                l35Var.setTextColor(bkb.Gh);
                gh6Var = l35Var;
            } else if (i == 3) {
                ?? view = new View(context);
                view.setLayoutParams(new e49(-1, gl.L(56.0f)));
                gh6Var = view;
            } else if (i != 5) {
                gh6Var = new View(context);
            } else {
                ?? pi4Var = new pi4(context, null);
                pi4Var.setViewType(6);
                pi4Var.setIsSingleCell(true);
                pi4Var.e(bkb.Vg, bkb.Hh, bkb.Zg);
                gh6Var = pi4Var;
            }
        } else {
            gh6 gh6Var2 = new gh6(this.c, 6, 2, false, null);
            gh6Var2.setCustomRightImage(R.drawable.msg_invited);
            gh6Var2.setNameColor(bkb.w0(null, bkb.dh, false));
            int w0 = bkb.w0(null, bkb.bh, false);
            int w02 = bkb.w0(null, bkb.fh, false);
            gh6Var2.P = true;
            gh6Var2.I = w0;
            gh6Var2.J = w02;
            gh6Var2.setDividerColor(bkb.Wg);
            gh6Var = gh6Var2;
        }
        return new y29(gh6Var);
    }
}
