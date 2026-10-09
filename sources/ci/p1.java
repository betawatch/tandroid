package ci;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.iw;
import org.telegram.ui.Components.mn;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.c20;
import org.telegram.ui.cz;
import org.telegram.ui.nn0;
import org.telegram.ui.rt;
import org.telegram.ui.rw;
import org.telegram.ui.y10;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean s10;
        boolean s11;
        int i10;
        String string;
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                y1 y1Var = (y1) this.b;
                ai.g gVar = (ai.g) this.c;
                rt q6 = rt.q();
                ai.w0 w0Var = y1Var.b;
                r1 r1Var = y1Var.f;
                e6Var = ((org.telegram.ui.ActionBar.f3) y1Var.r).resourcesProvider;
                return q6.s(motionEvent, w0Var, gVar, r1Var, e6Var);
            case 1:
                org.telegram.ui.ActionBar.n1 n1Var = (org.telegram.ui.ActionBar.n1) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        n1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                org.telegram.ui.Components.k8 k8Var = (org.telegram.ui.Components.k8) this.b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                org.telegram.ui.Components.l8 l8Var = k8Var.n;
                l8Var.H.r(l8Var.n.T(xVar));
                return false;
            case 3:
                s10 = rt.q().s(motionEvent, r0.h, (mn) this.c, r0.N, ((iw) this.b).resourcesProvider);
                return s10;
            case 4:
                s11 = rt.q().s(motionEvent, r0.e, (org.telegram.ui.Components.j) this.c, r0.getPreviewDelegate(), ((oz0) this.b).b);
                return s11;
            case 5:
                zy zyVar = (zy) this.b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.c;
                zyVar.getClass();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                cz czVar = zyVar.d;
                czVar.c.r(czVar.b.T(g4Var));
                return false;
            case 6:
                c20 c20Var = (c20) this.b;
                y10 y10Var = (y10) this.c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FiltersSetupActivity filtersSetupActivity = c20Var.e;
                filtersSetupActivity.c.r(filtersSetupActivity.a.T(y10Var));
                return false;
            default:
                nn0 nn0Var = (nn0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (nn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.get(1);
                    calendar.get(2);
                    calendar.get(5);
                    try {
                        EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                        int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                        if (intValue == 8) {
                            z10 = false;
                            string = LocaleController.getString(R.string.PassportSelectExpiredDate);
                            i11 = 0;
                            i15 = 20;
                            i10 = 0;
                        } else {
                            i10 = -120;
                            string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                            i11 = -18;
                            z10 = false;
                        }
                        String[] split = editTextBoldCursor.getText().toString().split("\\.");
                        if (split.length == 3) {
                            i12 = Utilities.parseInt((CharSequence) split[z10 ? 1 : 0]).intValue();
                            i14 = Utilities.parseInt((CharSequence) split[1]).intValue();
                            i13 = Utilities.parseInt((CharSequence) split[2]).intValue();
                        } else {
                            i12 = -1;
                            i13 = -1;
                            i14 = -1;
                        }
                        if (intValue == 8) {
                            z10 = true;
                        }
                        AlertDialog$Builder w10 = org.telegram.ui.Components.g5.w(context, i10, i15, i11, i12, i14, i13, string, z10, new gg.c2(nn0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            w10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new rw(23, nn0Var, editTextBoldCursor));
                        }
                        nn0Var.showDialog(w10.a);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                return true;
        }
    }
}
