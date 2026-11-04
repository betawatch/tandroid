package gi;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fm;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.c00;
import org.telegram.ui.cx;
import org.telegram.ui.is;
import org.telegram.ui.rb0;
import org.telegram.ui.yj0;
import org.telegram.ui.yz;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n1(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean r5;
        int i3;
        String str;
        int i10;
        String M0;
        int i11;
        int i12;
        int i13;
        int i14;
        String str2;
        boolean z10;
        int i15 = this.a;
        boolean z11 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i15) {
            case 0:
                t1 t1Var = (t1) obj2;
                is p10 = is.p();
                ci.j1 j1Var = t1Var.b;
                p1 p1Var = t1Var.f;
                i2 i2Var = t1Var.r;
                int i16 = i2.z1;
                return p10.r(motionEvent, j1Var, (ai.j6) obj, p1Var, i2Var.J0);
            case 1:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = org.telegram.messenger.g0.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        f1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 2:
                org.telegram.ui.Components.y7 y7Var = (org.telegram.ui.Components.y7) obj2;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) obj;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.z7 z7Var = y7Var.n;
                    z7Var.y1.t(z7Var.p1.T(wVar));
                }
                return false;
            case 3:
                pu puVar = (pu) obj2;
                return is.p().r(motionEvent, puVar.o1, (fm) obj, puVar.F1, puVar.J0);
            case 4:
                r5 = is.p().r(motionEvent, r5.e, (org.telegram.ui.Components.k) obj, r5.getPreviewDelegate(), ((ow0) obj2).b);
                return r5;
            case 5:
                zw zwVar = (zw) obj2;
                org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) obj;
                zwVar.getClass();
                if (motionEvent.getAction() == 0) {
                    cx cxVar = zwVar.f;
                    cxVar.c.t(cxVar.b.T(h4Var));
                }
                return false;
            case 6:
                c00 c00Var = (c00) obj2;
                yz yzVar = (yz) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = c00Var.e;
                    filtersSetupActivity.c.t(filtersSetupActivity.a.T(yzVar));
                }
                return false;
            default:
                yj0 yj0Var = (yj0) obj2;
                Context context = (Context) obj;
                if (yj0Var.getParentActivity() == null) {
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
                            str = null;
                            M0 = bd.M0(2131747475, null);
                            i11 = 20;
                            i10 = 0;
                            i3 = 0;
                        } catch (Exception e10) {
                            e = e10;
                            org.telegram.messenger.a8.g(e, z11);
                            return z11;
                        }
                    } else {
                        i3 = -120;
                        str = null;
                        i10 = -18;
                        M0 = bd.M0(2131747476, null);
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
                    if (intValue == 8) {
                        str2 = str;
                        z10 = true;
                    } else {
                        str2 = str;
                        z10 = false;
                    }
                    String str3 = str2;
                    AlertDialog$Builder w10 = org.telegram.ui.Components.t4.w(context, i3, i11, i10, i12, i14, i13, M0, z10, new k2.y(yj0Var, intValue, editTextBoldCursor, 15));
                    if (intValue == 8) {
                        w10.h(bd.M0(2131747473, str3), new rb0(5, yj0Var, editTextBoldCursor));
                    }
                    yj0Var.showDialog(w10.a);
                    return true;
                } catch (Exception e11) {
                    e = e11;
                    z11 = true;
                }
        }
    }
}
