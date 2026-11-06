package fi;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gm;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.qu;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a00;
import org.telegram.ui.bk0;
import org.telegram.ui.bx;
import org.telegram.ui.e00;
import org.telegram.ui.ex;
import org.telegram.ui.ks;
import org.telegram.ui.pu;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
                ks p10 = ks.p();
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
                qu quVar = (qu) obj2;
                return ks.p().r(motionEvent, quVar.n1, (gm) obj, quVar.E1, quVar.I0);
            case 4:
                r10 = ks.p().r(motionEvent, r5.e, (org.telegram.ui.Components.k) obj, r5.getPreviewDelegate(), ((ow0) obj2).b);
                return r10;
            case 5:
                bx bxVar = (bx) obj2;
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) obj;
                bxVar.getClass();
                if (motionEvent.getAction() == 0) {
                    ex exVar = bxVar.f;
                    exVar.c.t(exVar.b.T(h4Var));
                }
                return false;
            case 6:
                e00 e00Var = (e00) obj2;
                a00 a00Var = (a00) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = e00Var.e;
                    filtersSetupActivity.c.t(filtersSetupActivity.a.T(a00Var));
                }
                return false;
            default:
                bk0 bk0Var = (bk0) obj2;
                Context context = (Context) obj;
                if (bk0Var.getParentActivity() == null) {
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
                            M0 = hd.M0(2131747466, null);
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
                        M0 = hd.M0(2131747467, null);
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
                    AlertDialog$Builder w10 = org.telegram.ui.Components.v4.w(context, i7, i11, i17, i12, i14, i18, M0, intValue == 8, new jg.a2(bk0Var, intValue, editTextBoldCursor, 13));
                    if (intValue == 8) {
                        w10.h(hd.M0(2131747464, str2), new pu(27, bk0Var, editTextBoldCursor));
                    }
                    bk0Var.showDialog(w10.a);
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    z9 = true;
                }
        }
    }
}
