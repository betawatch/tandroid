package gg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g8;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Components.c30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cd;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements e2.h {
    public final /* synthetic */ int a;

    public /* synthetic */ g0(int i10) {
        this.a = i10;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                if (view instanceof g2) {
                    ((g2) view).c.invalidate();
                    break;
                }
                break;
            case 1:
                View view2 = (View) obj;
                if (view2 instanceof g2) {
                    ((g2) view2).d.a(false, true);
                    break;
                }
                break;
            case 2:
                ((View) obj).invalidate();
                break;
            case 3:
                ((m4.l1) obj).e();
                break;
            case 4:
                ((m4.l1) obj).e0();
                break;
            case 5:
                ((m4.l1) obj).z0();
                break;
            case 6:
                ((m4.l1) obj).G0();
                break;
            case 7:
                ((m4.l1) obj).V();
                break;
            case 8:
                ((m4.l1) obj).F();
                break;
            case 9:
                ((m4.l1) obj).F0();
                break;
            case 10:
                ((m4.l1) obj).E0();
                break;
            case 11:
                ((m4.l1) obj).L();
                break;
            case 12:
                ((m4.l1) obj).stop();
                break;
            case 13:
                ((m4.l1) obj).b();
                break;
            case 14:
                ((m4.l1) obj).H();
                break;
            case 15:
                ((m4.l1) obj).v();
                break;
            case 16:
                ((n2.j) obj).a();
                break;
            case 17:
                cd.Y0((View) obj);
                break;
            case 18:
                View view3 = (View) obj;
                if ((view3 instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view3).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    break;
                }
                break;
            case 19:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = ((org.telegram.ui.Cells.t1) view4).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    break;
                }
                break;
            case 20:
                View view5 = (View) obj;
                if (!(view5 instanceof a3)) {
                    view5.invalidate();
                    break;
                } else {
                    ((a3) view5).getTextView().invalidate();
                    break;
                }
            case 21:
                View view6 = (View) obj;
                if (!(view6 instanceof h5)) {
                    if (!(view6 instanceof g2)) {
                        view6.invalidate();
                        break;
                    } else {
                        ((g2) view6).c.invalidate();
                        break;
                    }
                } else {
                    h5 h5Var = (h5) view6;
                    h5Var.b.invalidate();
                    h5Var.c.invalidate();
                    break;
                }
            case 22:
                View view7 = (View) obj;
                if (view7 instanceof g8) {
                    ((g8) view7).a(true);
                    break;
                }
                break;
            case 23:
                View view8 = (View) obj;
                if (view8 instanceof g8) {
                    ((g8) view8).c(true);
                    break;
                }
                break;
            case 24:
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                    p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l4.longValue()));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new c30(20));
                    break;
                }
                break;
            case 25:
                break;
            case 26:
                View view9 = (View) obj;
                view9.setScaleX(1.0f);
                view9.setScaleY(1.0f);
                break;
            case 27:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view10).setChecked(false);
                    break;
                }
                break;
            case 28:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view11).setChecked(false);
                    break;
                }
                break;
            default:
                ((u2.a1) obj).b.release();
                break;
        }
    }

    public /* synthetic */ g0(cd cdVar) {
        this.a = 17;
    }
}
