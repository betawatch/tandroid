// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jm8 extends q59 {
    public final Context c;
    public final /* synthetic */ km8 d;

    public jm8(km8 km8Var, Context context) {
        this.d = km8Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 0 || i == 2 || i == 4;
    }

    @Override // y59
    public final int b() {
        return this.d.e;
    }

    @Override // y59
    public final int d(int i) {
        km8 km8Var = this.d;
        if (i == km8Var.x) {
            return 4;
        }
        if (i == km8Var.n) {
            return 3;
        }
        if (i == km8Var.f) {
            return 2;
        }
        return (i == km8Var.h || i == km8Var.w) ? 1 : 0;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        String M0;
        km8 km8Var = this.d;
        boolean z = km8Var.E;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            ij6 ij6Var = (ij6) view;
            if (!z) {
                throw null;
            }
            long keyAt = km8Var.getMessagesController().x0.keyAt(i - km8Var.r);
            ij6Var.setTag(Long.valueOf(keyAt));
            if (keyAt <= 0) {
                TLRPC.Chat L0 = km8Var.getMessagesController().L0(Long.valueOf(-keyAt));
                if (L0 != null) {
                    int i3 = L0.participants_count;
                    ij6Var.c(L0, null, i3 != 0 ? jb6.G(i3, "Members", new Object[0]) : L0.has_geo ? jb6.M0(2131748399, null) : !sd2.t0(L0) ? jb6.M0(2131748398, null) : jb6.M0(2131748395, null), i != km8Var.s - 1);
                    return;
                }
                return;
            }
            TLRPC.User W1 = km8Var.getMessagesController().W1(Long.valueOf(keyAt));
            if (W1 != null) {
                if (W1.bot) {
                    M0 = jb6.M0(2131753121, null).substring(0, 1).toUpperCase() + jb6.M0(2131753121, null).substring(1);
                } else {
                    String str = W1.phone;
                    M0 = (str == null || str.length() == 0) ? jb6.M0(2131747565, null) : mlb.l(new StringBuilder("+"), W1.phone, r58.f());
                }
                ij6Var.c(W1, null, M0, i != km8Var.s - 1);
                return;
            }
            return;
        }
        if (i2 == 1) {
            njb njbVar = (njb) view;
            if (i != km8Var.h) {
                if (i == km8Var.w) {
                    njbVar.setFixedSize(12);
                    njbVar.setText("");
                    return;
                }
                return;
            }
            if (z) {
                njbVar.setFixedSize(0);
                njbVar.setText(jb6.M0(2131753642, null));
                return;
            } else {
                njbVar.setFixedSize(8);
                njbVar.setText(null);
                return;
            }
        }
        if (i2 == 2) {
            fj6 fj6Var = (fj6) view;
            fj6Var.a(cmb.u6, cmb.t6);
            if (z) {
                fj6Var.b(R.drawable.msg_contact_add, 5, jb6.M0(2131753657, null), false);
                return;
            } else {
                jb6.M0(2131746603, null);
                throw null;
            }
        }
        if (i2 == 3) {
            jf5 jf5Var = (jf5) view;
            if (i == km8Var.n) {
                if (z) {
                    jf5Var.setText(jb6.G(km8Var.getMessagesController().y0, "BlockedUsersCount", new Object[0]));
                } else {
                    jf5Var.setText(jb6.M0(2131746575, null));
                }
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        FrameLayout njbVar;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                njbVar = new njb(context);
            } else if (i == 2) {
                njbVar = new fj6(context);
            } else if (i != 4) {
                jf5 jf5Var = new jf5(this.c, cmb.K6, 21, 11, false, null);
                jf5Var.setHeight(43);
                frameLayout = jf5Var;
            } else {
                xib xibVar = new xib(viewGroup.getContext());
                xibVar.k(jb6.M0(2131747648, null), false);
                xibVar.g(-1, cmb.o7);
                frameLayout = xibVar;
            }
            frameLayout = njbVar;
        } else {
            ij6 ij6Var = new ij6(this.c, 7, 6, true, null);
            ij6Var.setDelegate(new h68(this, (byte) 13));
            frameLayout = ij6Var;
        }
        return new b59(frameLayout);
    }
}
