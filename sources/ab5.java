// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ab5 extends n39 {
    public final Context c;
    public final /* synthetic */ bb5 d;

    public ab5(bb5 bb5Var, Context context) {
        this.d = bb5Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int b = s49Var.b();
        bb5 bb5Var = this.d;
        return b == bb5Var.r || b == bb5Var.n || b == bb5Var.s || b == 0;
    }

    @Override // w39
    public final int b() {
        bb5 bb5Var = this.d;
        if (bb5Var.e) {
            return 0;
        }
        return bb5Var.x;
    }

    @Override // w39
    public final int d(int i) {
        bb5 bb5Var = this.d;
        if (i == bb5Var.n || i == bb5Var.s || i == bb5Var.r) {
            return 0;
        }
        if (i == bb5Var.w || i == bb5Var.h) {
            return 1;
        }
        return i == 0 ? 2 : 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2 = s49Var.f;
        View view = s49Var.a;
        bb5 bb5Var = this.d;
        if (i2 == 0) {
            uib uibVar = (uib) view;
            if (i == bb5Var.n) {
                uibVar.b(k96.M0(2131751750, null), true);
                return;
            } else if (i == bb5Var.s) {
                uibVar.b(k96.M0(2131745266, null), false);
                return;
            } else {
                if (i == bb5Var.r) {
                    uibVar.b(k96.M0(2131745830, null), true);
                    return;
                }
                return;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                vgb vgbVar = (vgb) view;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = bb5Var.f;
                vgbVar.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
                vgbVar.setWillNotDraw(true);
                return;
            }
            return;
        }
        mhb mhbVar = (mhb) view;
        if (i == bb5Var.w) {
            mhbVar.setText("");
            return;
        }
        if (i == bb5Var.h) {
            TLRPC.Chat K0 = bb5Var.getMessagesController().K0(Long.valueOf(bb5Var.d));
            if (!hc2.T(K0) || K0.megagroup) {
                mhbVar.setText(k96.M0(2131748719, null));
            } else {
                mhbVar.setText(k96.M0(2131752374, null));
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i == 0) {
            FrameLayout uibVar = new uib(context);
            zkb.h(bkb.c6, null, uibVar);
            frameLayout = uibVar;
        } else if (i != 1) {
            vgb vgbVar = new vgb(context);
            TextView textView = new TextView(context);
            vgbVar.a = textView;
            zkb.X(textView, bkb.F6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((k96.a0 ? 5 : 3) | 16);
            vgbVar.addView(textView, nme.d(-1, -2.0f, (k96.a0 ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            zkb.h(bkb.c6, null, vgbVar);
            frameLayout = vgbVar;
        } else {
            frameLayout = new mhb(context);
        }
        return new y29(frameLayout);
    }
}
