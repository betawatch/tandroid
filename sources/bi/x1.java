package bi;

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
import org.telegram.ui.Components.cn;
import org.telegram.ui.Components.wv;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.b20;
import org.telegram.ui.cz;
import org.telegram.ui.f20;
import org.telegram.ui.fz;
import org.telegram.ui.l80;
import org.telegram.ui.on0;
import org.telegram.ui.tt;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x1(int i10, Object obj, Object obj2) {
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
                k2 k2Var = (k2) this.b;
                ai.g gVar = (ai.g) this.c;
                tt q6 = tt.q();
                y1 y1Var = k2Var.b;
                b2 b2Var = k2Var.f;
                f6Var = ((org.telegram.ui.ActionBar.h3) k2Var.r).resourcesProvider;
                break;
            case 1:
                org.telegram.ui.ActionBar.p1 p1Var = (org.telegram.ui.ActionBar.p1) this.b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.c;
                if (motionEvent.getAction() == 0) {
                    Drawable backgroundDrawable = actionBarPopupWindow$ActionBarPopupWindowLayout.getBackgroundDrawable();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(backgroundDrawable.getBounds());
                    rectF.offset(actionBarPopupWindow$ActionBarPopupWindowLayout.getX(), actionBarPopupWindow$ActionBarPopupWindowLayout.getY());
                    if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        p1Var.dismiss();
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
                s10 = tt.q().s(motionEvent, r0.h, (cn) this.c, r0.N, ((wv) this.b).resourcesProvider);
                break;
            case 4:
                s11 = tt.q().s(motionEvent, r0.e, (org.telegram.ui.Components.k) this.c, r0.getPreviewDelegate(), ((zy0) this.b).b);
                break;
            case 5:
                cz czVar = (cz) this.b;
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) this.c;
                czVar.getClass();
                if (motionEvent.getAction() == 0) {
                    fz fzVar = czVar.d;
                    fzVar.c.r(fzVar.b.T(g4Var));
                    break;
                }
                break;
            case 6:
                f20 f20Var = (f20) this.b;
                b20 b20Var = (b20) this.c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = f20Var.e;
                    filtersSetupActivity.c.r(filtersSetupActivity.a.T(b20Var));
                    break;
                }
                break;
            default:
                on0 on0Var = (on0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (on0Var.getParentActivity() != null) {
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
                            AlertDialog$Builder x10 = org.telegram.ui.Components.d5.x(context, i10, i15, i11, i12, i14, i13, string, intValue == 8, new fg.e2(on0Var, intValue, editTextBoldCursor, 14));
                            if (intValue == 8) {
                                x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new l80(17, on0Var, editTextBoldCursor));
                            }
                            on0Var.showDialog(x10.a);
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
