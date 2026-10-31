package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.om;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.w7;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.b10;
import org.telegram.ui.f10;
import org.telegram.ui.fy;
import org.telegram.ui.iy;
import org.telegram.ui.ll0;
import org.telegram.ui.lt;
import org.telegram.ui.nb0;
import org.telegram.ui.rv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean r10;
        int i10;
        int i11;
        String L0;
        String str;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.a;
        boolean z10 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i16) {
            case 0:
                k1 k1Var = (k1) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = org.telegram.messenger.i0.P;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        k1Var.dismiss();
                        return true;
                    }
                }
                return false;
            case 1:
                v7 v7Var = (v7) obj2;
                org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) obj;
                if (motionEvent.getAction() == 0) {
                    w7 w7Var = v7Var.n;
                    w7Var.x1.t(w7Var.o1.T(wVar));
                }
                return false;
            case 2:
                cv cvVar = (cv) obj2;
                return lt.p().r(motionEvent, cvVar.n1, (om) obj, cvVar.E1, cvVar.I0);
            case 3:
                r10 = lt.p().r(motionEvent, r5.e, (org.telegram.ui.Components.k) obj, r5.getPreviewDelegate(), ((sx0) obj2).b);
                return r10;
            case 4:
                fy fyVar = (fy) obj2;
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) obj;
                fyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    iy iyVar = fyVar.f;
                    iyVar.c.t(iyVar.b.T(j4Var));
                }
                return false;
            case 5:
                f10 f10Var = (f10) obj2;
                b10 b10Var = (b10) obj;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = f10Var.e;
                    filtersSetupActivity.c.t(filtersSetupActivity.a.T(b10Var));
                }
                return false;
            case 6:
                ll0 ll0Var = (ll0) obj2;
                Context context = (Context) obj;
                if (ll0Var.getParentActivity() == null) {
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
                            L0 = cd.L0(2131747483, null);
                            i11 = 0;
                            str = null;
                            i12 = 20;
                            i10 = 0;
                        } catch (Exception e) {
                            e = e;
                            f8.g(e, z10);
                            return z10;
                        }
                    } else {
                        i10 = -120;
                        i11 = -18;
                        L0 = cd.L0(2131747484, null);
                        str = null;
                        i12 = 0;
                    }
                    String[] split = editTextBoldCursor.getText().toString().split("\\.");
                    if (split.length == 3) {
                        i13 = Utilities.z(split[0]).intValue();
                        i15 = Utilities.z(split[1]).intValue();
                        i14 = Utilities.z(split[2]).intValue();
                    } else {
                        i13 = -1;
                        i14 = -1;
                        i15 = -1;
                    }
                    int i17 = i11;
                    int i18 = i14;
                    String str2 = str;
                    AlertDialog$Builder w9 = org.telegram.ui.Components.s4.w(context, i10, i12, i17, i13, i15, i18, L0, intValue == 8, new ag.b0(ll0Var, intValue, editTextBoldCursor, 14));
                    if (intValue == 8) {
                        w9.h(cd.L0(2131747481, str2), new rv(26, ll0Var, editTextBoldCursor));
                    }
                    ll0Var.showDialog(w9.a);
                    return true;
                } catch (Exception e7) {
                    e = e7;
                    z10 = true;
                }
            default:
                vh.g1 g1Var = (vh.g1) obj2;
                lt p5 = lt.p();
                nb0 nb0Var = g1Var.b;
                vh.c1 c1Var = g1Var.f;
                vh.u1 u1Var = g1Var.r;
                int i19 = vh.u1.y1;
                return p5.r(motionEvent, nb0Var, (ag.y0) obj, c1Var, u1Var.I0);
        }
    }
}
