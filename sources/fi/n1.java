package fi;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.c00;
import org.telegram.ui.dk0;
import org.telegram.ui.dx;
import org.telegram.ui.g00;
import org.telegram.ui.gx;
import org.telegram.ui.ms;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean r10;
        int i7;
        int i10;
        String M0;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = this.a;
        boolean z9 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i15) {
            case 0:
                t1 t1Var = (t1) obj2;
                ms p10 = ms.p();
                bi.q1 q1Var = t1Var.b;
                p1 p1Var = t1Var.f;
                k2 k2Var = t1Var.r;
                int i16 = k2.y1;
                return p10.r(motionEvent, q1Var, (ai.k) obj, p1Var, k2Var.I0);
            case 1:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        g1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                org.telegram.ui.Components.a8 a8Var = (org.telegram.ui.Components.a8) obj2;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) obj;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.b8 b8Var = a8Var.n;
                    b8Var.x1.t(b8Var.o1.T(wVar));
                }
                return false;
            case 3:
                ru ruVar = (ru) obj2;
                return ms.p().r(motionEvent, ruVar.n1, (gm) obj, ruVar.E1, ruVar.I0);
            case 4:
                r10 = ms.p().r(motionEvent, r5.e, (org.telegram.ui.Components.k) obj, r5.getPreviewDelegate(), ((pw0) obj2).b);
                return r10;
            case 5:
                dx dxVar = (dx) obj2;
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) obj;
                dxVar.getClass();
                if (motionEvent.getAction() == 0) {
                    gx gxVar = dxVar.f;
                    gxVar.c.t(gxVar.b.T(h4Var));
                }
                return false;
            case 6:
                g00 g00Var = (g00) obj2;
                c00 c00Var = (c00) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = g00Var.e;
                    filtersSetupActivity.c.t(filtersSetupActivity.a.T(c00Var));
                }
                return false;
            default:
                dk0 dk0Var = (dk0) obj2;
                Context context = (Context) obj;
                if (dk0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() != 1) {
                    return true;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.get(1);
                calendar.get(2);
                calendar.get(5);
                try {
                    EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                    int intValue = ((Integer) editTextBoldCursor.getTag()).intValue();
                    if (intValue == 8) {
                        try {
                            M0 = id.M0(2131747467, null);
                            i10 = 0;
                            str = null;
                            i11 = 20;
                            i7 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            org.telegram.messenger.a8.g(e, z9);
                            return z9;
                        }
                    } else {
                        i7 = -120;
                        i10 = -18;
                        M0 = id.M0(2131747468, null);
                        str = null;
                        i11 = 0;
                    }
                    String[] split = editTextBoldCursor.getText().toString().split("\\.");
                    if (split.length == 3) {
                        i12 = Utilities.z(split[0]).intValue();
                        i14 = Utilities.z(split[1]).intValue();
                        i13 = Utilities.z(split[2]).intValue();
                    } else {
                        i12 = -1;
                        i13 = -1;
                        i14 = -1;
                    }
                    int i17 = i10;
                    int i18 = i13;
                    String str2 = str;
                    AlertDialog$Builder w10 = org.telegram.ui.Components.v4.w(context, i7, i11, i17, i12, i14, i18, M0, intValue == 8, new jg.a2(dk0Var, intValue, editTextBoldCursor, 13));
                    if (intValue == 8) {
                        w10.h(id.M0(2131747465, str2), new org.telegram.ui.ru(27, dk0Var, editTextBoldCursor));
                    }
                    dk0Var.showDialog(w10.a);
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    z9 = true;
                }
        }
    }
}
