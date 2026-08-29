package l4;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.y2;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ef0;
import org.telegram.ui.vc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements f5.d {
    public final /* synthetic */ int a;

    public /* synthetic */ x0(int i10) {
        this.a = i10;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                ((z0) obj).b.getClass();
                break;
            case 1:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                break;
            case 2:
                ((View) obj).setTranslationY(0.0f);
                break;
            case 3:
                ((lh.o) ((View) obj)).invalidate();
                break;
            case 4:
                vc.Y0((View) obj);
                break;
            case 5:
                View view2 = (View) obj;
                if ((view2 instanceof s1) && (messageObject = ((s1) view2).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    break;
                }
                break;
            case 6:
                View view3 = (View) obj;
                if ((view3 instanceof s1) && (messageObject2 = ((s1) view3).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    break;
                }
                break;
            case 7:
                View view4 = (View) obj;
                if (!(view4 instanceof y2)) {
                    view4.invalidate();
                    break;
                } else {
                    ((y2) view4).getTextView().invalidate();
                    break;
                }
            case 8:
                View view5 = (View) obj;
                if (!(view5 instanceof f5)) {
                    if (!(view5 instanceof sf.m1)) {
                        view5.invalidate();
                        break;
                    } else {
                        ((sf.m1) view5).c.invalidate();
                        break;
                    }
                } else {
                    f5 f5Var = (f5) view5;
                    f5Var.b.invalidate();
                    f5Var.c.invalidate();
                    break;
                }
            case 9:
                View view6 = (View) obj;
                if (view6 instanceof b8) {
                    ((b8) view6).a(true);
                    break;
                }
                break;
            case 10:
                View view7 = (View) obj;
                if (view7 instanceof b8) {
                    ((b8) view7).c(true);
                    break;
                }
                break;
            case 11:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l10.longValue()));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new ef0(2));
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
                if (view9 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view9).setChecked(false);
                    break;
                }
                break;
            case 15:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view10).setChecked(false);
                    break;
                }
                break;
            case 16:
                View view11 = (View) obj;
                if (view11 instanceof sf.m1) {
                    ((sf.m1) view11).c.invalidate();
                    break;
                }
                break;
            case 17:
                View view12 = (View) obj;
                if (view12 instanceof sf.m1) {
                    ((sf.m1) view12).d.a(false, true);
                    break;
                }
                break;
            default:
                ((View) obj).invalidate();
                break;
        }
    }

    public /* synthetic */ x0(vc vcVar) {
        this.a = 4;
    }
}
