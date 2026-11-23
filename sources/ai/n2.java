package ai;

import android.app.Activity;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.na;
import di.f6;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r2 b;

    public /* synthetic */ n2(r2 r2Var, int i7) {
        this.a = i7;
        this.b = r2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        r2 r2Var = this.b;
        switch (i7) {
            case 0:
                if (!Arrays.equals(r2Var.h, DictationAsr.H()) && r2Var.getParentActivity() != null && r2Var.a != null) {
                    r2Var.d0(r2Var.getParentActivity());
                    r2Var.a.g3.O(true);
                    break;
                } else {
                    r2Var.e0();
                    break;
                }
            default:
                Activity parentActivity = r2Var.getParentActivity();
                i6 resourceProvider = r2Var.getResourceProvider();
                l2 l2Var = new l2(parentActivity, 0);
                l2Var.setOrientation(1);
                l2Var.addView(new m2(parentActivity, resourceProvider), na.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(n6.w0(n6.j5, resourceProvider));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(1);
                textView.setText(gd.N0(2131745039, null));
                l2Var.addView(textView, na.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(n6.w0(n6.z6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText(gd.N0(2131745040, null));
                l2Var.addView(textView2, na.t(-1, -2, 1, 32, 0, 32, 25));
                l2Var.addView(a8.j1.a(parentActivity, resourceProvider, R.drawable.msg2_devices, gd.N0(2131745042, null), gd.N0(2131745041, null)), na.t(-1, -2, 7, 32, 0, 32, 16));
                l2Var.addView(a8.j1.a(parentActivity, resourceProvider, R.drawable.menu_privacy, gd.N0(2131745044, null), gd.N0(2131745043, null)), na.t(-1, -2, 7, 32, 0, 32, 16));
                l2Var.addView(a8.j1.a(parentActivity, resourceProvider, R.drawable.msg2_data, gd.N0(2131745047, null), gd.N0(2131745046, null)), na.t(-1, -2, 7, 32, 0, 32, 16));
                hi.e eVar = new hi.e(parentActivity, resourceProvider, true);
                eVar.setRoundRadius(24);
                eVar.i(f6.t2("👌 " + gd.N0(2131749355, null)), false, true);
                eVar.setOnClickListener(new k2(r4, 0));
                l2Var.addView(eVar, na.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(l2Var, na.e(-1, -2, 1));
                w2 j3 = m10.j(parentActivity, false, 1, resourceProvider);
                j3.O = frameLayout;
                j3.V0 = 49;
                j3.show();
                w2[] w2VarArr = {j3};
                j3.Q(n6.h5);
                break;
        }
    }
}
