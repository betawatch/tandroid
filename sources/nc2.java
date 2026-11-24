// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nc2 extends w39 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ oc2 d;

    public nc2(oc2 oc2Var, Context context) {
        this.d = oc2Var;
        this.c = context;
    }

    @Override // w39
    public final int b() {
        oc2 oc2Var = this.d;
        return (!oc2Var.d.isEmpty() ? oc2Var.n.size() + 1 : 0) + 2;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 0;
        }
        return i == 2 ? 1 : 2;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        View view = s49Var.a;
        int d = d(i);
        oc2 oc2Var = this.d;
        if (d != 0) {
            if (d == 1) {
                ((ld5) view).setText(k96.M0(2131747629, null));
                return;
            } else {
                if (d == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) oc2Var.n.get(i - 3);
                    boolean contains = oc2Var.d.contains(tL_availableReaction.reaction);
                    i2 = ((d) oc2Var).currentAccount;
                    ((va0) view).a(tL_availableReaction, contains, i2);
                    return;
                }
                return;
            }
        }
        mhb mhbVar = (mhb) view;
        zkb.X(mhbVar.getTextView(), bkb.A6, null);
        int i3 = oc2Var.s;
        if (i3 == 1) {
            mhbVar.setText(k96.M0(2131751135, null));
        } else if (i3 == 0) {
            mhbVar.setText(k96.M0(2131751147, null));
        } else if (i3 == 2) {
            mhbVar.setText(k96.M0(2131751417, null));
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        if (i == 0) {
            return new y29(new mhb(context));
        }
        if (i == 1) {
            return new y29(new ld5(context, 23));
        }
        if (i != 3) {
            return new y29(new va0(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        oc2 oc2Var = this.d;
        gl.B2(oc2Var.r);
        frameLayout.addView(oc2Var.r);
        frameLayout.setLayoutParams(new e49(-1, -2));
        return new y29(frameLayout);
    }
}
