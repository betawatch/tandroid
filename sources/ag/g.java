package ag;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k5;
import org.telegram.ui.l5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ g(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p2 R = LaunchActivity.R();
                l5 l5Var = new l5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof pv0) {
                    l5Var.b = (pv0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout h = l.d.h(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (l5.c * 5.0f));
                int i10 = k6.n5;
                org.telegram.ui.b.q(textView, k6.w0(null, i10, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                h.addView(textView, c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ko0 ko0Var = new ko0(parentActivity);
                ko0Var.setDelegate(new k5(l5Var, textView, 0));
                ko0Var.setReportChanges(true);
                h.addView(ko0Var, c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + l5.e);
                org.telegram.ui.b.q(textView2, k6.w0(null, i10, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                h.addView(textView2, c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ko0 ko0Var2 = new ko0(parentActivity);
                ko0Var2.setDelegate(new k5(l5Var, textView2, 1));
                ko0Var2.setReportChanges(true);
                h.addView(ko0Var2, c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                org.telegram.ui.b.q(textView3, k6.w0(null, i10, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                h.addView(textView3, c6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                ko0 ko0Var3 = new ko0(parentActivity);
                ko0Var3.setDelegate(new org.telegram.ui.h(l5Var, 5));
                ko0Var3.setReportChanges(true);
                h.addView(ko0Var3, c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                h.addOnLayoutChangeListener(new m4(ko0Var, ko0Var3, ko0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(h);
                l5Var.setCustomView(scrollView);
                l5Var.show();
                this.b.c(false);
                break;
            case 1:
                o oVar = this.b;
                oVar.getClass();
                SharedConfig.toggleDebugWebView();
                Toast.makeText(oVar.getContext(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                break;
            case 2:
                ProfileActivity.H4((Activity) this.b.getContext(), false);
                break;
            default:
                o oVar2 = this.b;
                oVar2.n = true;
                try {
                    oVar2.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
