package ci;

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
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.vm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.b20;
import org.telegram.ui.cz;
import org.telegram.ui.f20;
import org.telegram.ui.fz;
import org.telegram.ui.g20;
import org.telegram.ui.qn0;
import org.telegram.ui.ut;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.f6 f6Var;
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
                z1 z1Var = (z1) this.b;
                ai.g gVar = (ai.g) this.c;
                ut q6 = ut.q();
                ai.w0 w0Var = z1Var.b;
                s1 s1Var = z1Var.f;
                f6Var = ((org.telegram.ui.ActionBar.g3) z1Var.r).resourcesProvider;
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
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.h8 h8Var = g8Var.n;
                    h8Var.H.r(h8Var.n.U(xVar));
                    break;
                }
                break;
            case 3:
                s10 = ut.q().s(motionEvent, r0.h, (vm) this.c, r0.N, ((sv) this.b).resourcesProvider);
                break;
            case 4:
                s11 = ut.q().s(motionEvent, r0.e, (org.telegram.ui.Components.j) this.c, r0.getPreviewDelegate(), ((oy0) this.b).b);
                break;
            case 5:
                cz czVar = (cz) this.b;
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.c;
                czVar.getClass();
                if (motionEvent.getAction() == 0) {
                    fz fzVar = czVar.d;
                    fzVar.c.r(fzVar.b.U(f4Var));
                    break;
                }
                break;
            case 6:
                g20 g20Var = (g20) this.b;
                b20 b20Var = (b20) this.c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = g20Var.e;
                    filtersSetupActivity.c.r(filtersSetupActivity.a.U(b20Var));
                    break;
                }
                break;
            default:
                qn0 qn0Var = (qn0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (qn0Var.getParentActivity() != null) {
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
                            AlertDialog$Builder x10 = org.telegram.ui.Components.c5.x(context, i10, i15, i11, i12, i14, i13, string, intValue == 8, new gg.d2(qn0Var, intValue, editTextBoldCursor, 14));
                            if (intValue == 8) {
                                x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new f20(21, qn0Var, editTextBoldCursor));
                            }
                            qn0Var.showDialog(x10.a);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
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
