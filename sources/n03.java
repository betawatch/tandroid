// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class n03 extends n39 {
    public final /* synthetic */ o03 c;

    public n03(o03 o03Var) {
        this.c = o03Var;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 3;
    }

    @Override // w39
    public final int b() {
        o03 o03Var = this.c;
        return o03Var.U1 ? o03Var.T1.size() + 3 : o03Var.V1 ? 2 : 1;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            return i != 2 ? 3 : 2;
        }
        return 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        TLObject K0;
        String str;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 3) {
            if (i2 != 2) {
                if (i2 == 1) {
                    ((mhb) view).setText(gl.F2(gl.O2(k96.M0(2131743188, null), bkb.K6, 0, new mk2(this, (byte) 13), null), true, gl.L(1.0f), gl.L(1.0f)));
                    return;
                }
                return;
            } else {
                ld5 ld5Var = (ld5) view;
                ld5Var.setTextSize(15.0f);
                ld5Var.setPadding(0, 0, 0, gl.L(2.0f));
                ld5Var.setText(k96.M0(2131743201, null).replace(":", ""));
                return;
            }
        }
        o03 o03Var = this.c;
        TLRPC.Peer peer = (TLRPC.Peer) o03Var.T1.get(i - 3);
        long B1 = k27.B1(peer);
        int i3 = o03Var.a;
        if (B1 > 0) {
            K0 = na7.q1(i3).V1(Long.valueOf(B1));
            str = k96.M0(2131743107, null);
        } else {
            K0 = na7.q1(i3).K0(Long.valueOf(-B1));
            str = null;
        }
        za5 za5Var = (za5) view;
        za5Var.e(K0, null, str, i != b() - 1);
        za5Var.c(peer == o03Var.Y1, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.view.ViewGroup, android.widget.LinearLayout, t1] */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        Context context = viewGroup.getContext();
        o03 o03Var = this.c;
        if (i == 1) {
            mhb mhbVar = new mhb(context);
            zkb.h(bkb.Z6, o03Var.J0, mhbVar);
            mhbVar.setTopPadding(17);
            mhbVar.setBottomPadding(17);
            frameLayout = mhbVar;
        } else if (i == 2) {
            frameLayout = new ld5(context, 22);
        } else if (i != 3) {
            boolean z = o03Var.W1;
            ?? t1Var = new t1((byte) 5, context, false);
            t1Var.setOrientation(1);
            ry8 ry8Var = new ry8(context);
            ry8Var.setAutoRepeat(true);
            ry8Var.f(R.raw.utyan_schedule, kk7.w1, kk7.w1, null);
            ry8Var.d();
            t1Var.addView(ry8Var, nme.t(kk7.w1, kk7.w1, 49, 0, 24, 0, 0));
            TextView textView = new TextView(context);
            textView.setTypeface(gl.o());
            textView.setText(z ? k96.a0(null, null, 2131744666, new Object[0]) : k96.a0(null, null, 2131744663, new Object[0]));
            textView.setTextSize(1, 20.0f);
            zkb.X(textView, bkb.F6, null);
            t1Var.addView(textView, nme.t(-2, -2, 1, 0, 14, 0, 7));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            zkb.X(textView2, bkb.i5, null);
            textView2.setText(z ? k96.a0(null, null, 2131743216, new Object[0]) : k96.a0(null, null, 2131743091, new Object[0]));
            textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
            t1Var.addView(textView2, nme.t(-2, -2, 1, 28, 0, 28, 17));
            frameLayout = t1Var;
        } else {
            frameLayout = new za5(context, 1, 0, false);
        }
        frameLayout.setLayoutParams(new e49(-1, -2));
        return new y29(frameLayout);
    }
}
