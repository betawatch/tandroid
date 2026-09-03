package nh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dd;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements h5.d {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // h5.d
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
                ((p) ((View) obj)).invalidate();
                break;
            case 3:
                ((o3.m) obj).a();
                break;
            case 4:
                ((o4.i0) obj).b.release();
                break;
            case 5:
                dd.Y0((View) obj);
                break;
            case 6:
                View view2 = (View) obj;
                if ((view2 instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view2).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    break;
                }
                break;
            case 7:
                View view3 = (View) obj;
                if ((view3 instanceof org.telegram.ui.Cells.s1) && (messageObject2 = ((org.telegram.ui.Cells.s1) view3).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    break;
                }
                break;
            case 8:
                View view4 = (View) obj;
                if (!(view4 instanceof org.telegram.ui.ActionBar.z2)) {
                    view4.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.ActionBar.z2) view4).getTextView().invalidate();
                    break;
                }
            case 9:
                View view5 = (View) obj;
                if (!(view5 instanceof org.telegram.ui.Cells.g5)) {
                    if (!(view5 instanceof uf.l1)) {
                        view5.invalidate();
                        break;
                    } else {
                        ((uf.l1) view5).c.invalidate();
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view5;
                    g5Var.b.invalidate();
                    g5Var.c.invalidate();
                    break;
                }
            case 10:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.Cells.c8) {
                    ((org.telegram.ui.Cells.c8) view6).a(true);
                    break;
                }
                break;
            case 11:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.c8) {
                    ((org.telegram.ui.Cells.c8) view7).c(true);
                    break;
                }
                break;
            case 12:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l10.longValue()));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new mc(28));
                    break;
                }
                break;
            case 13:
                break;
            case 14:
                View view8 = (View) obj;
                view8.setScaleX(1.0f);
                view8.setScaleY(1.0f);
                break;
            case 15:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view9).setChecked(false);
                    break;
                }
                break;
            case 16:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view10).setChecked(false);
                    break;
                }
                break;
            case 17:
                View view11 = (View) obj;
                if (view11 instanceof uf.l1) {
                    ((uf.l1) view11).c.invalidate();
                    break;
                }
                break;
            case 18:
                View view12 = (View) obj;
                if (view12 instanceof uf.l1) {
                    ((uf.l1) view12).d.a(false, true);
                    break;
                }
                break;
            default:
                ((View) obj).invalidate();
                break;
        }
    }

    public /* synthetic */ e(dd ddVar) {
        this.a = 5;
    }
}
