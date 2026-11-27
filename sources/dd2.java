// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dd2 extends j79 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ ed2 d;

    public dd2(ed2 ed2Var, Context context) {
        this.d = ed2Var;
        this.c = context;
    }

    @Override // j79
    public final int b() {
        ed2 ed2Var = this.d;
        return (!ed2Var.d.isEmpty() ? ed2Var.n.size() + 1 : 0) + 2;
    }

    @Override // j79
    public final int d(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 0;
        }
        return i == 2 ? 1 : 2;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        View view = f89Var.a;
        int d = d(i);
        ed2 ed2Var = this.d;
        if (d != 0) {
            if (d == 1) {
                ((mf5) view).setText(ob6.M0(2131747549, null));
                return;
            } else {
                if (d == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ed2Var.n.get(i - 3);
                    boolean contains = ed2Var.d.contains(tL_availableReaction.reaction);
                    i2 = ((e) ed2Var).currentAccount;
                    ((xa0) view).a(tL_availableReaction, contains, i2);
                    return;
                }
                return;
            }
        }
        ilb ilbVar = (ilb) view;
        yob.X(ilbVar.getTextView(), aob.B6, null);
        int i3 = ed2Var.s;
        if (i3 == 1) {
            ilbVar.setText(ob6.M0(2131751112, null));
        } else if (i3 == 0) {
            ilbVar.setText(ob6.M0(2131751124, null));
        } else if (i3 == 2) {
            ilbVar.setText(ob6.M0(2131751394, null));
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        if (i == 0) {
            return new n69(new ilb(context));
        }
        if (i == 1) {
            return new n69(new mf5(context, 23));
        }
        if (i != 3) {
            return new n69(new xa0(context, false, false));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        ed2 ed2Var = this.d;
        hl.B2(ed2Var.r);
        frameLayout.addView(ed2Var.r);
        frameLayout.setLayoutParams(new r79(-1, -2));
        return new n69(frameLayout);
    }
}
