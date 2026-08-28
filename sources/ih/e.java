package ih;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lj0;
import org.telegram.ui.xc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements d5.d {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i9) {
        this.a = i9;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                break;
            case 1:
                ((View) obj).setTranslationY(0.0f);
                break;
            case 2:
                ((q) ((View) obj)).invalidate();
                break;
            case 3:
                ((j4.y0) obj).b.getClass();
                break;
            case 4:
                xc.Y0((View) obj);
                break;
            case 5:
                View view2 = (View) obj;
                if ((view2 instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view2).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    break;
                }
                break;
            case 6:
                View view3 = (View) obj;
                if ((view3 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = ((org.telegram.ui.Cells.t1) view3).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    break;
                }
                break;
            case 7:
                View view4 = (View) obj;
                if (!(view4 instanceof org.telegram.ui.ActionBar.y2)) {
                    view4.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.ActionBar.y2) view4).getTextView().invalidate();
                    break;
                }
            case 8:
                View view5 = (View) obj;
                if (!(view5 instanceof org.telegram.ui.Cells.h5)) {
                    if (!(view5 instanceof pf.m1)) {
                        view5.invalidate();
                        break;
                    } else {
                        ((pf.m1) view5).c.invalidate();
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view5;
                    h5Var.b.invalidate();
                    h5Var.c.invalidate();
                    break;
                }
            case 9:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.Cells.d8) {
                    ((org.telegram.ui.Cells.d8) view6).a(true);
                    break;
                }
                break;
            case 10:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.d8) {
                    ((org.telegram.ui.Cells.d8) view7).c(true);
                    break;
                }
                break;
            case 11:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l10.longValue()));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new lj0(0));
                    break;
                }
                break;
            case 12:
                break;
            case 13:
                View view8 = (View) obj;
                view8.setScaleX(1.0f);
                view8.setScaleY(1.0f);
                break;
            case 14:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view9).setChecked(false);
                    break;
                }
                break;
            case 15:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view10).setChecked(false);
                    break;
                }
                break;
            case 16:
                View view11 = (View) obj;
                if (view11 instanceof pf.m1) {
                    ((pf.m1) view11).c.invalidate();
                    break;
                }
                break;
            case 17:
                View view12 = (View) obj;
                if (view12 instanceof pf.m1) {
                    ((pf.m1) view12).d.a(false, true);
                    break;
                }
                break;
            default:
                ((View) obj).invalidate();
                break;
        }
    }

    public /* synthetic */ e(xc xcVar) {
        this.a = 4;
    }
}
