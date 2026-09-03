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
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.b20;
import org.telegram.ui.d81;
import org.telegram.ui.fn0;
import org.telegram.ui.rt;
import org.telegram.ui.vl0;
import org.telegram.ui.wy;
import org.telegram.ui.x10;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                s6 = rt.q().s(motionEvent, r0.h, (sm) this.c, r0.K, ((lv) this.b).resourcesProvider);
                return s6;
            case 3:
                s9 = rt.q().s(motionEvent, r0.e, (org.telegram.ui.Components.k) this.c, r0.getPreviewDelegate(), ((qy0) this.b).b);
                return s9;
            case 4:
                wy wyVar = (wy) this.b;
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.c;
                wyVar.getClass();
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                zy zyVar = wyVar.d;
                zyVar.c.r(zyVar.b.T(f4Var));
                return false;
            case 5:
                b20 b20Var = (b20) this.b;
                x10 x10Var = (x10) this.c;
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                FiltersSetupActivity filtersSetupActivity = b20Var.e;
                filtersSetupActivity.c.r(filtersSetupActivity.a.T(x10Var));
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                return true;
            default:
                ph.h1 h1Var = (ph.h1) this.b;
                dg.n nVar = (dg.n) this.c;
                rt q10 = rt.q();
                d81 d81Var = h1Var.b;
                ph.e1 e1Var = h1Var.f;
                f6Var = h1Var.r.resourcesProvider;
                return q10.s(motionEvent, d81Var, nVar, e1Var, f6Var);
        }
    }
}
