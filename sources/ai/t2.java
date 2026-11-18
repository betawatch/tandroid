package ai;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x2 b;

    public /* synthetic */ t2(x2 x2Var, int i7) {
        this.a = i7;
        this.b = x2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        x2 x2Var = this.b;
        switch (i7) {
            case 0:
                if (!Arrays.equals(x2Var.h, DictationAsr.C()) && x2Var.getParentActivity() != null && x2Var.a != null) {
                    x2Var.d0(x2Var.getParentActivity());
                    x2Var.a.g3.O(true);
                    break;
                } else {
                    x2Var.e0();
                    break;
                }
            default:
                Activity parentActivity = x2Var.getParentActivity();
                i6 resourceProvider = x2Var.getResourceProvider();
                r2 r2Var = new r2(parentActivity, 0);
                r2Var.setOrientation(1);
                r2Var.addView(new s2(parentActivity, resourceProvider), ma.t(-1, 120, 1, 0, 16, 0, 10));
                TextView textView = new TextView(parentActivity);
                textView.setTextSize(1, 20.0f);
                textView.setTextColor(n6.w0(n6.j5, resourceProvider));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setGravity(1);
                textView.setText(gd.M0(2131745045, null));
                r2Var.addView(textView, ma.t(-1, -2, 1, 32, 0, 32, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(n6.w0(n6.z6, resourceProvider));
                textView2.setGravity(1);
                textView2.setText(gd.M0(2131745046, null));
                r2Var.addView(textView2, ma.t(-1, -2, 1, 32, 0, 32, 25));
                r2Var.addView(a8.i1.a(parentActivity, resourceProvider, R.drawable.msg2_devices, gd.M0(2131745048, null), gd.M0(2131745047, null)), ma.t(-1, -2, 7, 32, 0, 32, 16));
                r2Var.addView(a8.i1.a(parentActivity, resourceProvider, R.drawable.menu_privacy, gd.M0(2131745050, null), gd.M0(2131745049, null)), ma.t(-1, -2, 7, 32, 0, 32, 16));
                r2Var.addView(a8.i1.a(parentActivity, resourceProvider, R.drawable.msg2_data, gd.M0(2131745053, null), gd.M0(2131745052, null)), ma.t(-1, -2, 7, 32, 0, 32, 16));
                hi.d dVar = new hi.d(parentActivity, resourceProvider, true);
                dVar.setRoundRadius(24);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("👌  Got it");
                spannableStringBuilder.setSpan(new lq(R.drawable.filled_understood, 0), 0, 2, 33);
                dVar.i(spannableStringBuilder, false, true);
                dVar.setOnClickListener(new q2(r4, 0));
                r2Var.addView(dVar, ma.k(14.0f, 18.0f, 14.0f, 0.0f, -1, 48));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.addView(r2Var, ma.e(-1, -2, 1));
                org.telegram.ui.ActionBar.x2 j3 = n10.j(parentActivity, false, 1, resourceProvider);
                j3.O = frameLayout;
                j3.V0 = 49;
                j3.show();
                org.telegram.ui.ActionBar.x2[] x2VarArr = {j3};
                j3.Q(n6.h5);
                break;
        }
    }
}
