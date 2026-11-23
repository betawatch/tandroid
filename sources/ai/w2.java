package ai;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import di.f6;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a3 b;

    public /* synthetic */ w2(a3 a3Var, int i7) {
        this.a = i7;
        this.b = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        a3 a3Var = this.b;
        switch (i7) {
            case 0:
                if (!Arrays.equals(a3Var.h, DictationAsr.E()) && a3Var.getParentActivity() != null && a3Var.a != null) {
                    a3Var.d0(a3Var.getParentActivity());
                    a3Var.a.g3.O(true);
                    break;
                } else {
                    a3Var.e0();
                    break;
                }
            default:
                Activity parentActivity = a3Var.getParentActivity();
                h6 resourceProvider = a3Var.getResourceProvider();
                u2 u2Var = new u2(parentActivity, 0);
                u2Var.setOrientation(1);
                u2Var.addView(new v2(parentActivity, resourceProvider), ma.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(m6.w0(m6.j5, resourceProvider));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(1);
                textView.setText(hd.N0(2131745037, null));
                u2Var.addView(textView, ma.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(m6.w0(m6.z6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText(hd.N0(2131745038, null));
                u2Var.addView(textView2, ma.t(-1, -2, 1, 32, 0, 32, 25));
                u2Var.addView(a8.i1.a(parentActivity, resourceProvider, R.drawable.msg2_devices, hd.N0(2131745040, null), hd.N0(2131745039, null)), ma.t(-1, -2, 7, 32, 0, 32, 16));
                u2Var.addView(a8.i1.a(parentActivity, resourceProvider, R.drawable.menu_privacy, hd.N0(2131745042, null), hd.N0(2131745041, null)), ma.t(-1, -2, 7, 32, 0, 32, 16));
                u2Var.addView(a8.i1.a(parentActivity, resourceProvider, R.drawable.msg2_data, hd.N0(2131745045, null), hd.N0(2131745044, null)), ma.t(-1, -2, 7, 32, 0, 32, 16));
                hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
                eVar.setRoundRadius(24);
                eVar.i(f6.t2("👌 " + hd.N0(2131749355, null)), false, true);
                eVar.setOnClickListener(new t2(r4, 0));
                u2Var.addView(eVar, ma.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(u2Var, ma.e(-1, -2, 1));
                org.telegram.ui.ActionBar.w2 j3 = o10.j(parentActivity, false, 1, resourceProvider);
                j3.O = frameLayout;
                j3.V0 = 49;
                j3.show();
                org.telegram.ui.ActionBar.w2[] w2VarArr = {j3};
                j3.Q(m6.h5);
                break;
        }
    }
}
