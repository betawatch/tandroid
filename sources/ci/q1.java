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
import org.telegram.ui.Components.tv;
import org.telegram.ui.Components.wm;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.gn0;
import org.telegram.ui.nt;
import org.telegram.ui.ow;
import org.telegram.ui.v10;
import org.telegram.ui.wy;
import org.telegram.ui.z10;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        org.telegram.ui.ActionBar.d6 d6Var;
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
                nt q6 = nt.q();
                ai.w0 w0Var = z1Var.b;
                s1 s1Var = z1Var.f;
                d6Var = ((org.telegram.ui.ActionBar.e3) z1Var.r).resourcesProvider;
                break;
            case 1:
                org.telegram.ui.ActionBar.m1 m1Var = (org.telegram.ui.ActionBar.m1) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        m1Var.dismiss();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.i8 i8Var = (org.telegram.ui.Components.i8) this.b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.j8 j8Var = i8Var.n;
                    j8Var.H.r(j8Var.n.T(xVar));
                    break;
                }
                break;
            case 3:
                s10 = nt.q().s(motionEvent, r0.h, (wm) this.c, r0.N, ((tv) this.b).resourcesProvider);
                break;
            case 4:
                s11 = nt.q().s(motionEvent, r0.e, (org.telegram.ui.Components.j) this.c, r0.getPreviewDelegate(), ((xy0) this.b).b);
                break;
            case 5:
                wy wyVar = (wy) this.b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.c;
                wyVar.getClass();
                if (motionEvent.getAction() == 0) {
                    zy zyVar = wyVar.d;
                    zyVar.c.r(zyVar.b.T(g4Var));
                    break;
                }
                break;
            case 6:
                z10 z10Var = (z10) this.b;
                v10 v10Var = (v10) this.c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = z10Var.e;
                    filtersSetupActivity.c.r(filtersSetupActivity.a.T(v10Var));
                    break;
                }
                break;
            default:
                gn0 gn0Var = (gn0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (gn0Var.getParentActivity() != null) {
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
                            AlertDialog$Builder x10 = org.telegram.ui.Components.e5.x(context, i10, i15, i11, i12, i14, i13, string, intValue == 8, new gg.d2(gn0Var, intValue, editTextBoldCursor, 15));
                            if (intValue == 8) {
                                x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new ow(23, gn0Var, editTextBoldCursor));
                            }
                            gn0Var.showDialog(x10.a);
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
