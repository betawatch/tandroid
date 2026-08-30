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
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.dn0;
import org.telegram.ui.pt;
import org.telegram.ui.tl0;
import org.telegram.ui.uy;
import org.telegram.ui.v10;
import org.telegram.ui.xy;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        f6 f6Var;
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
                s6 = pt.q().s(motionEvent, r0.h, (tm) this.c, r0.K, ((mv) this.b).resourcesProvider);
                return s6;
            case 3:
                s9 = pt.q().s(motionEvent, r0.e, (org.telegram.ui.Components.k) this.c, r0.getPreviewDelegate(), ((qy0) this.b).b);
                return s9;
            case 4:
                uy uyVar = (uy) this.b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.c;
                uyVar.getClass();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                xy xyVar = uyVar.d;
                xyVar.c.r(xyVar.b.T(g4Var));
                return false;
            case 5:
                z10 z10Var = (z10) this.b;
                v10 v10Var = (v10) this.c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FiltersSetupActivity filtersSetupActivity = z10Var.e;
                filtersSetupActivity.c.r(filtersSetupActivity.a.T(v10Var));
                return false;
            case 6:
                dn0 dn0Var = (dn0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (dn0Var.getParentActivity() == null) {
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
                        AlertDialog$Builder x10 = org.telegram.ui.Components.z4.x(context, i10, i15, i11, i12, i14, i13, string, intValue == 8, new e3.d(dn0Var, intValue, editTextBoldCursor, 12));
                        if (intValue == 8) {
                            x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new tl0(0, dn0Var, editTextBoldCursor));
                        }
                        dn0Var.showDialog(x10.a);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
            default:
                ph.i1 i1Var = (ph.i1) this.b;
                dg.n nVar = (dg.n) this.c;
                pt q10 = pt.q();
                ph.e1 e1Var = i1Var.b;
                ph.f1 f1Var = i1Var.f;
                f6Var = i1Var.r.resourcesProvider;
                return q10.s(motionEvent, e1Var, nVar, f1Var, f6Var);
        }
    }
}
