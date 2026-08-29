package nh;

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
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.jv;
import org.telegram.ui.Components.qm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.ht;
import org.telegram.ui.j10;
import org.telegram.ui.kl0;
import org.telegram.ui.ly;
import org.telegram.ui.n10;
import org.telegram.ui.oy;
import org.telegram.ui.vm0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1(int i10, Object obj, Object obj2) {
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
                t1 t1Var = (t1) this.b;
                bg.o oVar = (bg.o) this.c;
                ht q6 = ht.q();
                jh.e1 e1Var = t1Var.b;
                p1 p1Var = t1Var.f;
                c6Var = ((org.telegram.ui.ActionBar.f3) t1Var.r).resourcesProvider;
                break;
            case 1:
                org.telegram.ui.ActionBar.o1 o1Var = (org.telegram.ui.ActionBar.o1) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        o1Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) this.b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.g8 g8Var = f8Var.n;
                    g8Var.D.r(g8Var.n.T(xVar));
                    break;
                }
                break;
            case 3:
                s10 = ht.q().s(motionEvent, r0.h, (qm) this.c, r0.J, ((jv) this.b).resourcesProvider);
                break;
            case 4:
                s11 = ht.q().s(motionEvent, r0.e, (org.telegram.ui.Components.k) this.c, r0.getPreviewDelegate(), ((fy0) this.b).b);
                break;
            case 5:
                ly lyVar = (ly) this.b;
                org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) this.c;
                lyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    oy oyVar = lyVar.d;
                    oyVar.c.r(oyVar.b.T(e4Var));
                    break;
                }
                break;
            case 6:
                n10 n10Var = (n10) this.b;
                j10 j10Var = (j10) this.c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = n10Var.e;
                    filtersSetupActivity.c.r(filtersSetupActivity.a.T(j10Var));
                    break;
                }
                break;
            default:
                vm0 vm0Var = (vm0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (vm0Var.getParentActivity() != null) {
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
                            AlertDialog$Builder x4 = org.telegram.ui.Components.c5.x(context, i10, i15, i11, i12, i14, i13, string, intValue == 8, new e3.d(vm0Var, intValue, editTextBoldCursor, 12));
                            if (intValue == 8) {
                                x4.h(LocaleController.getString(R.string.PassportSelectNotExpire), new kl0(1, vm0Var, editTextBoldCursor));
                            }
                            vm0Var.showDialog(x4.a);
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
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
