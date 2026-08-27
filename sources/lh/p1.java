package lh;

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
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.k10;
import org.telegram.ui.kt;
import org.telegram.ui.my;
import org.telegram.ui.nl0;
import org.telegram.ui.o10;
import org.telegram.ui.py;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        org.telegram.ui.ActionBar.c6 c6Var;
        boolean s10;
        boolean s11;
        int i10;
        String string;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) this.b;
                ag.p0 p0Var = (ag.p0) this.c;
                kt q6 = kt.q();
                hh.f1 f1Var = u1Var.b;
                q1 q1Var = u1Var.f;
                c6Var = ((org.telegram.ui.ActionBar.e3) u1Var.r).resourcesProvider;
                break;
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
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.a8 a8Var = (org.telegram.ui.Components.a8) this.b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.b8 b8Var = a8Var.n;
                    b8Var.D.r(b8Var.n.T(xVar));
                    break;
                }
                break;
            case 3:
                s10 = kt.q().s(motionEvent, r0.h, (jm) this.c, r0.J, ((cv) this.b).resourcesProvider);
                break;
            case 4:
                s11 = kt.q().s(motionEvent, r0.e, (org.telegram.ui.Components.j) this.c, r0.getPreviewDelegate(), ((wx0) this.b).b);
                break;
            case 5:
                my myVar = (my) this.b;
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.c;
                myVar.getClass();
                if (motionEvent.getAction() == 0) {
                    py pyVar = myVar.d;
                    pyVar.c.r(pyVar.b.T(d4Var));
                    break;
                }
                break;
            case 6:
                o10 o10Var = (o10) this.b;
                k10 k10Var = (k10) this.c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = o10Var.e;
                    filtersSetupActivity.c.r(filtersSetupActivity.a.T(k10Var));
                    break;
                }
                break;
            default:
                xm0 xm0Var = (xm0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (xm0Var.getParentActivity() != null) {
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
                            AlertDialog$Builder x8 = org.telegram.ui.Components.y4.x(context, i10, i15, i11, i12, i14, i13, string, intValue == 8, new c3.d(xm0Var, intValue, editTextBoldCursor, 12));
                            if (intValue == 8) {
                                x8.h(LocaleController.getString(R.string.PassportSelectNotExpire), new nl0(1, xm0Var, editTextBoldCursor));
                            }
                            xm0Var.showDialog(x8.a);
                            break;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            break;
                        }
                    }
                }
                break;
        }
        return false;
        return true;
    }
}
