package ag;

import android.view.View;
import o4.i0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.d8;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.sj0;
import vf.l1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements h5.d {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i10) {
        this.a = i10;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                ((View) obj).invalidate();
                break;
            case 1:
                ((o3.l) obj).a();
                break;
            case 2:
                ((i0) obj).b.release();
                break;
            case 3:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                break;
            case 4:
                ((View) obj).setTranslationY(0.0f);
                break;
            case 5:
                ((oh.o) ((View) obj)).invalidate();
                break;
            case 6:
                bd.Y0((View) obj);
                break;
            case 7:
                View view2 = (View) obj;
                if ((view2 instanceof t1) && (messageObject = ((t1) view2).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    break;
                }
                break;
            case 8:
                View view3 = (View) obj;
                if ((view3 instanceof t1) && (messageObject2 = ((t1) view3).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    break;
                }
                break;
            case 9:
                View view4 = (View) obj;
                if (!(view4 instanceof a3)) {
                    view4.invalidate();
                    break;
                } else {
                    ((a3) view4).getTextView().invalidate();
                    break;
                }
            case 10:
                View view5 = (View) obj;
                if (!(view5 instanceof h5)) {
                    if (!(view5 instanceof l1)) {
                        view5.invalidate();
                        break;
                    } else {
                        ((l1) view5).c.invalidate();
                        break;
                    }
                } else {
                    h5 h5Var = (h5) view5;
                    h5Var.b.invalidate();
                    h5Var.c.invalidate();
                    break;
                }
            case 11:
                View view6 = (View) obj;
                if (view6 instanceof d8) {
                    ((d8) view6).a(true);
                    break;
                }
                break;
            case 12:
                View view7 = (View) obj;
                if (view7 instanceof d8) {
                    ((d8) view7).c(true);
                    break;
                }
                break;
            case 13:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l10.longValue()));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new sj0(0));
                    break;
                }
                break;
            case 14:
                break;
            case 15:
                View view8 = (View) obj;
                view8.setScaleX(1.0f);
                view8.setScaleY(1.0f);
                break;
            case 16:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view9).setChecked(false);
                    break;
                }
                break;
            case 17:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view10).setChecked(false);
                    break;
                }
                break;
            case 18:
                View view11 = (View) obj;
                if (view11 instanceof l1) {
                    ((l1) view11).c.invalidate();
                    break;
                }
                break;
            default:
                View view12 = (View) obj;
                if (view12 instanceof l1) {
                    ((l1) view12).d.a(false, true);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(bd bdVar) {
        this.a = 6;
    }
}
