package ei;

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
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.gn;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.gt;
import org.telegram.ui.j10;
import org.telegram.ui.ky;
import org.telegram.ui.n10;
import org.telegram.ui.ny;
import org.telegram.ui.xm0;
import org.telegram.ui.zu;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        org.telegram.ui.ActionBar.d6 d6Var;
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
                v1 v1Var = (v1) this.b;
                ai.wa waVar = (ai.wa) this.c;
                gt q6 = gt.q();
                ai.u1 u1Var = v1Var.b;
                r1 r1Var = v1Var.f;
                d6Var = ((org.telegram.ui.ActionBar.f3) v1Var.r).resourcesProvider;
                return q6.s(motionEvent, u1Var, waVar, r1Var, d6Var);
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        m1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                org.telegram.ui.Components.k8 k8Var = j8Var.n;
                k8Var.H.r(k8Var.n.T(xVar));
                return false;
            case 3:
                s10 = gt.q().s(motionEvent, r0.h, (gn) this.c, r0.N, ((aw) this.b).resourcesProvider);
                return s10;
            case 4:
                s11 = gt.q().s(motionEvent, r0.e, (org.telegram.ui.Components.j) this.c, r0.getPreviewDelegate(), ((gz0) this.b).b);
                return s11;
            case 5:
                ky kyVar = (ky) this.b;
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.c;
                kyVar.getClass();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                ny nyVar = kyVar.d;
                nyVar.c.r(nyVar.b.T(f4Var));
                return false;
            case 6:
                n10 n10Var = (n10) this.b;
                j10 j10Var = (j10) this.c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FiltersSetupActivity filtersSetupActivity = n10Var.e;
                filtersSetupActivity.c.r(filtersSetupActivity.a.T(j10Var));
                return false;
            default:
                xm0 xm0Var = (xm0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (xm0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder w9 = org.telegram.ui.Components.f5.w(context, i10, i15, i11, i12, i14, i13, string, z10, new hg.b2(xm0Var, intValue, editTextBoldCursor, 15));
                        if (intValue == 8) {
                            w9.h(LocaleController.getString(R.string.PassportSelectNotExpire), new zu(27, xm0Var, editTextBoldCursor));
                        }
                        xm0Var.showDialog(w9.a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
        }
    }
}
