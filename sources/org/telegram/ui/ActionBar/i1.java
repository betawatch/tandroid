package org.telegram.ui.ActionBar;

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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.ov;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.vm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a20;
import org.telegram.ui.fn0;
import org.telegram.ui.qt;
import org.telegram.ui.vl0;
import org.telegram.ui.vy;
import org.telegram.ui.w10;
import org.telegram.ui.yy;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean s6;
        boolean s9;
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        g6 g6Var;
        switch (this.a) {
            case 0:
                p1 p1Var = (p1) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        p1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 1:
                b8 b8Var = (b8) this.b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                c8 c8Var = b8Var.n;
                c8Var.E.r(c8Var.n.T(xVar));
                return false;
            case 2:
                s6 = qt.q().s(motionEvent, r0.h, (vm) this.c, r0.K, ((ov) this.b).resourcesProvider);
                return s6;
            case 3:
                s9 = qt.q().s(motionEvent, r0.e, (org.telegram.ui.Components.k) this.c, r0.getPreviewDelegate(), ((ry0) this.b).b);
                return s9;
            case 4:
                vy vyVar = (vy) this.b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.c;
                vyVar.getClass();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                yy yyVar = vyVar.d;
                yyVar.c.r(yyVar.b.T(g4Var));
                return false;
            case 5:
                a20 a20Var = (a20) this.b;
                w10 w10Var = (w10) this.c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FiltersSetupActivity filtersSetupActivity = a20Var.e;
                filtersSetupActivity.c.r(filtersSetupActivity.a.T(w10Var));
                return false;
            case 6:
                fn0 fn0Var = (fn0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (fn0Var.getParentActivity() == null) {
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
                            string = LocaleController.getString(R.string.PassportSelectExpiredDate);
                            i15 = 20;
                            i11 = 0;
                            i10 = 0;
                        } else {
                            i10 = -120;
                            string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                            i11 = -18;
                        }
                        String[] split = editTextBoldCursor.getText().toString().split("\\.");
                        if (split.length == 3) {
                            i12 = Utilities.parseInt((CharSequence) split[0]).intValue();
                            i14 = Utilities.parseInt((CharSequence) split[1]).intValue();
                            i13 = Utilities.parseInt((CharSequence) split[2]).intValue();
                        } else {
                            i12 = -1;
                            i13 = -1;
                            i14 = -1;
                        }
                        AlertDialog$Builder x10 = org.telegram.ui.Components.z4.x(context, i10, i15, i11, i12, i14, i13, string, intValue == 8, new e3.d(fn0Var, intValue, editTextBoldCursor, 12));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new vl0(0, fn0Var, editTextBoldCursor));
                        }
                        fn0Var.showDialog(x10.a);
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                return true;
            default:
                qh.i1 i1Var = (qh.i1) this.b;
                ag.h hVar = (ag.h) this.c;
                qt q10 = qt.q();
                qh.e1 e1Var = i1Var.b;
                qh.f1 f1Var = i1Var.f;
                g6Var = i1Var.r.resourcesProvider;
                return q10.s(motionEvent, e1Var, hVar, f1Var, g6Var);
        }
    }
}
