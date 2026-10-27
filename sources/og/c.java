package og;

import android.app.Activity;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import m4.w1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.t;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mp0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ c(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r2 R = LaunchActivity.R();
                l5 l5Var = new l5(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof ww0) {
                    l5Var.b = (ww0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f7 = t.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (l5.c * 5.0f));
                int i10 = y6.n5;
                f7.V(textView, i10, null);
                wh.r(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f7.addView(textView, kb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                mp0 mp0Var = new mp0(parentActivity);
                mp0Var.setDelegate(new m4.c(l5Var, textView, false, 7));
                mp0Var.setReportChanges(true);
                f7.addView(mp0Var, kb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + l5.e);
                f7.V(textView2, i10, null);
                wh.r(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f7.addView(textView2, kb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                mp0 mp0Var2 = new mp0(parentActivity);
                mp0Var2.setDelegate(new w1(l5Var, textView2, false, 9));
                mp0Var2.setReportChanges(true);
                f7.addView(mp0Var2, kb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                f7.V(textView3, i10, null);
                wh.r(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                textView3.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
                f7.addView(textView3, kb1.h(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                mp0 mp0Var3 = new mp0(parentActivity);
                mp0Var3.setDelegate(new org.telegram.ui.f(l5Var, 5));
                mp0Var3.setReportChanges(true);
                f7.addView(mp0Var3, kb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f7.addOnLayoutChangeListener(new p4(mp0Var, mp0Var3, mp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f7);
                l5Var.setCustomView(scrollView);
                l5Var.show();
                this.b.c(false);
                break;
            case 1:
                i iVar = this.b;
                iVar.getClass();
                SharedConfig.toggleDebugWebView();
                Toast.makeText(iVar.getContext(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                break;
            case 2:
                ProfileActivity.P4((Activity) this.b.getContext(), false);
                break;
            default:
                i iVar2 = this.b;
                iVar2.n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    break;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
