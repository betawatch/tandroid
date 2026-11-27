// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ft5 extends c79 {
    public final /* synthetic */ lt5 c;

    public ft5(lt5 lt5Var) {
        this.c = lt5Var;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 3 || i == 1;
    }

    public final TLObject E(int i) {
        lt5 lt5Var = this.c;
        if (lt5Var.g2 == null) {
            return (TLObject) lt5Var.Y1.get(i - lt5Var.S1);
        }
        TLRPC.Dialog dialog = (TLRPC.Dialog) lt5Var.h2.get(i - lt5Var.S1);
        boolean D = wf3.D(dialog.id);
        int i2 = lt5Var.a;
        return D ? uc7.s1(i2).X1(Long.valueOf(dialog.id)) : uc7.s1(i2).M0(Long.valueOf(-dialog.id));
    }

    @Override // j79
    public final int b() {
        return this.c.W1;
    }

    @Override // j79
    public final int d(int i) {
        lt5 lt5Var = this.c;
        if (i == lt5Var.R1) {
            return 1;
        }
        if (i == 0) {
            return 2;
        }
        if (i >= lt5Var.S1 && i < lt5Var.T1) {
            return 3;
        }
        if (i == lt5Var.V1) {
            return 4;
        }
        return i == lt5Var.U1 ? 5 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 2) {
            view.requestLayout();
            return;
        }
        if (i2 == 3) {
            bd5 bd5Var = (bd5) view;
            TLObject E = E(i);
            Object object = bd5Var.getObject();
            long j = object instanceof TLRPC.User ? ((TLRPC.User) object).id : object instanceof TLRPC.Chat ? -((TLRPC.Chat) object).id : 0L;
            lt5 lt5Var = this.c;
            bd5Var.e(E, null, null, i != lt5Var.T1);
            long j2 = E instanceof TLRPC.User ? ((TLRPC.User) E).id : E instanceof TLRPC.Chat ? -((TLRPC.Chat) E).id : 0L;
            if (j2 != 0) {
                zh6 zh6Var = lt5Var.N1;
                if (zh6Var == null || zh6Var.h(j2) < 0) {
                    bd5Var.c(lt5Var.Z1.h(j2) >= 0, j == j2);
                    bd5Var.setCheckBoxEnabled(true);
                } else {
                    bd5Var.c(true, false);
                    bd5Var.setCheckBoxEnabled(false);
                }
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        Context context = viewGroup.getContext();
        if (i != 2) {
            lt5 lt5Var = this.c;
            int i2 = 0;
            if (i != 3) {
                if (i != 4) {
                    View view3 = null;
                    boolean z = false;
                    if (i != 5) {
                        ij6 ij6Var = new ij6(context);
                        ij6Var.b(R.drawable.msg_link, 7, ob6.M0(2131743042, null), true);
                        int i3 = aob.n5;
                        ij6Var.a(i3, i3);
                        view2 = ij6Var;
                    } else {
                        oc5 oc5Var = new oc5(context, view3, i2, z ? 1 : 0, (byte) 1);
                        oc5Var.setLayoutParams(new r79(-1, -1));
                        oc5Var.e.setVisibility(8);
                        lu3 lu3Var = lt5Var.g2;
                        tpa tpaVar = oc5Var.d;
                        if (lu3Var != null) {
                            tpaVar.setText(ob6.M0(2131750691, null));
                        } else {
                            tpaVar.setText(ob6.M0(2131747954, null));
                        }
                        oc5Var.setAnimateLayoutChange(true);
                        view2 = oc5Var;
                    }
                } else {
                    view2 = new View(context);
                }
                return new n69(view2);
            }
            view = new bd5(context, 1, 0, lt5Var.g2 != null);
        } else {
            view = new tb((byte) 17, context, this);
        }
        view2 = view;
        return new n69(view2);
    }
}
