package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.ue;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements e2.h {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    @Override // e2.h
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
                ((u) ((View) obj)).invalidate();
                break;
            case 3:
                View view2 = (View) obj;
                if (view2 instanceof ig.x1) {
                    ((ig.x1) view2).c.invalidate();
                    break;
                }
                break;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof ig.x1) {
                    ((ig.x1) view3).d.a(false, true);
                    break;
                }
                break;
            case 5:
                ((m4.j1) obj).e();
                break;
            case 6:
                ((m4.j1) obj).e0();
                break;
            case 7:
                ((m4.j1) obj).z0();
                break;
            case 8:
                ((m4.j1) obj).G0();
                break;
            case 9:
                ((m4.j1) obj).V();
                break;
            case 10:
                ((m4.j1) obj).F();
                break;
            case 11:
                ((m4.j1) obj).F0();
                break;
            case 12:
                ((m4.j1) obj).E0();
                break;
            case 13:
                ((m4.j1) obj).L();
                break;
            case 14:
                ((m4.j1) obj).stop();
                break;
            case 15:
                ((m4.j1) obj).b();
                break;
            case 16:
                ((m4.j1) obj).H();
                break;
            case 17:
                ((m4.j1) obj).v();
                break;
            case 18:
                ((n2.j) obj).a();
                break;
            case 19:
                ((View) obj).invalidate();
                break;
            case 20:
                bd.Y0((View) obj);
                break;
            case 21:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view4).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    break;
                }
                break;
            case 22:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = ((org.telegram.ui.Cells.t1) view5).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    break;
                }
                break;
            case 23:
                View view6 = (View) obj;
                if (!(view6 instanceof org.telegram.ui.ActionBar.y2)) {
                    view6.invalidate();
                    break;
                } else {
                    ((org.telegram.ui.ActionBar.y2) view6).getTextView().invalidate();
                    break;
                }
            case 24:
                View view7 = (View) obj;
                if (!(view7 instanceof org.telegram.ui.Cells.g5)) {
                    if (!(view7 instanceof ig.x1)) {
                        view7.invalidate();
                        break;
                    } else {
                        ((ig.x1) view7).c.invalidate();
                        break;
                    }
                } else {
                    org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view7;
                    g5Var.b.invalidate();
                    g5Var.c.invalidate();
                    break;
                }
            case 25:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.f8) {
                    ((org.telegram.ui.Cells.f8) view8).a(true);
                    break;
                }
                break;
            case 26:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.f8) {
                    ((org.telegram.ui.Cells.f8) view9).c(true);
                    break;
                }
                break;
            case 27:
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l4.longValue()));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new ue(26));
                    break;
                }
                break;
            case 28:
                break;
            default:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                break;
        }
    }

    public /* synthetic */ f(bd bdVar) {
        this.a = 20;
    }
}
