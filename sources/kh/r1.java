package kh;

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
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.mm;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.h10;
import org.telegram.ui.ht;
import org.telegram.ui.jy;
import org.telegram.ui.l10;
import org.telegram.ui.my;
import org.telegram.ui.nl0;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r1(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.b6 b6Var;
        boolean s10;
        boolean s11;
        int i9;
        String string;
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.a) {
            case 0:
                w1 w1Var = (w1) this.b;
                eh.j jVar = (eh.j) this.c;
                ht q10 = ht.q();
                gh.f1 f1Var = w1Var.b;
                s1 s1Var = w1Var.f;
                b6Var = ((org.telegram.ui.ActionBar.f3) w1Var.r).resourcesProvider;
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
                org.telegram.ui.Components.b8 b8Var = (org.telegram.ui.Components.b8) this.b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.c8 c8Var = b8Var.n;
                    c8Var.D.r(c8Var.n.T(xVar));
                    break;
                }
                break;
            case 3:
                s10 = ht.q().s(motionEvent, r0.h, (mm) this.c, r0.J, ((dv) this.b).resourcesProvider);
                break;
            case 4:
                s11 = ht.q().s(motionEvent, r0.e, (org.telegram.ui.Components.j) this.c, r0.getPreviewDelegate(), ((ux0) this.b).b);
                break;
            case 5:
                jy jyVar = (jy) this.b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.c;
                jyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    my myVar = jyVar.d;
                    myVar.c.r(myVar.b.T(g4Var));
                    break;
                }
                break;
            case 6:
                l10 l10Var = (l10) this.b;
                h10 h10Var = (h10) this.c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = l10Var.e;
                    filtersSetupActivity.c.r(filtersSetupActivity.a.T(h10Var));
                    break;
                }
                break;
            default:
                wm0 wm0Var = (wm0) this.b;
                Context context = (Context) this.c;
                int i14 = 0;
                if (wm0Var.getParentActivity() != null) {
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
                                i14 = 20;
                                i10 = 0;
                                i9 = 0;
                            } else {
                                i9 = -120;
                                string = LocaleController.getString(R.string.PassportSelectBithdayDate);
                                i10 = -18;
                            }
                            String[] split = editTextBoldCursor.getText().toString().split("\\.");
                            if (split.length == 3) {
                                i11 = Utilities.parseInt((CharSequence) split[0]).intValue();
                                i13 = Utilities.parseInt((CharSequence) split[1]).intValue();
                                i12 = Utilities.parseInt((CharSequence) split[2]).intValue();
                            } else {
                                i11 = -1;
                                i12 = -1;
                                i13 = -1;
                            }
                            AlertDialog$Builder x10 = org.telegram.ui.Components.y4.x(context, i9, i14, i10, i11, i13, i12, string, intValue == 8, new c3.e(wm0Var, intValue, editTextBoldCursor, 13));
                            if (intValue == 8) {
                                x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new nl0(1, wm0Var, editTextBoldCursor));
                            }
                            wm0Var.showDialog(x10.a);
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
