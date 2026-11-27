// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cd5 extends c79 {
    public final Context c;
    public final /* synthetic */ dd5 d;

    public cd5(dd5 dd5Var, Context context) {
        this.d = dd5Var;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int b = f89Var.b();
        dd5 dd5Var = this.d;
        return b == dd5Var.r || b == dd5Var.n || b == dd5Var.s || b == 0;
    }

    @Override // j79
    public final int b() {
        dd5 dd5Var = this.d;
        if (dd5Var.e) {
            return 0;
        }
        return dd5Var.x;
    }

    @Override // j79
    public final int d(int i) {
        dd5 dd5Var = this.d;
        if (i == dd5Var.n || i == dd5Var.s || i == dd5Var.r) {
            return 0;
        }
        if (i == dd5Var.w || i == dd5Var.h) {
            return 1;
        }
        return i == 0 ? 2 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2 = f89Var.f;
        View view = f89Var.a;
        dd5 dd5Var = this.d;
        if (i2 == 0) {
            qmb qmbVar = (qmb) view;
            if (i == dd5Var.n) {
                qmbVar.b(ob6.M0(2131751727, null), true);
                return;
            } else if (i == dd5Var.s) {
                qmbVar.b(ob6.M0(2131745186, null), false);
                return;
            } else {
                if (i == dd5Var.r) {
                    qmbVar.b(ob6.M0(2131745750, null), true);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                rkb rkbVar = (rkb) view;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = dd5Var.f;
                rkbVar.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
                rkbVar.setWillNotDraw(true);
                return;
            }
            return;
        }
        ilb ilbVar = (ilb) view;
        if (i == dd5Var.w) {
            ilbVar.setText("");
            return;
        }
        if (i == dd5Var.h) {
            TLRPC.Chat M0 = dd5Var.getMessagesController().M0(Long.valueOf(dd5Var.d));
            if (!xc2.T(M0) || M0.megagroup) {
                ilbVar.setText(ob6.M0(2131748665, null));
            } else {
                ilbVar.setText(ob6.M0(2131752358, null));
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            FrameLayout qmbVar = new qmb(context);
            yob.h(aob.d6, null, qmbVar);
            frameLayout = qmbVar;
        } else if (i != 1) {
            rkb rkbVar = new rkb(context);
            TextView textView = new TextView(context);
            rkbVar.a = textView;
            yob.X(textView, aob.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((ob6.a0 ? 5 : 3) | 16);
            rkbVar.addView(textView, tre.d(-1, -2.0f, (ob6.a0 ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            yob.h(aob.d6, null, rkbVar);
            frameLayout = rkbVar;
        } else {
            frameLayout = new ilb(context);
        }
        return new n69(frameLayout);
    }
}
