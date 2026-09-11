package di;

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
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.rv;
import org.telegram.ui.Components.vm;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.a20;
import org.telegram.ui.az;
import org.telegram.ui.dz;
import org.telegram.ui.e20;
import org.telegram.ui.pn0;
import org.telegram.ui.st;
import org.telegram.ui.z10;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                bi.d dVar = (bi.d) this.c;
                st q6 = st.q();
                bi.o0 o0Var = z1Var.b;
                s1 s1Var = z1Var.f;
                f6Var = ((org.telegram.ui.ActionBar.f3) z1Var.r).resourcesProvider;
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
                org.telegram.ui.Components.j8 j8Var = (org.telegram.ui.Components.j8) this.b;
                org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) this.c;
                if (motionEvent.getAction() == 0) {
                    org.telegram.ui.Components.k8 k8Var = j8Var.n;
                    k8Var.H.r(k8Var.n.T(xVar));
                    break;
                }
                break;
            case 3:
                s10 = st.q().s(motionEvent, r0.h, (vm) this.c, r0.N, ((rv) this.b).resourcesProvider);
                break;
            case 4:
                s11 = st.q().s(motionEvent, r0.e, (org.telegram.ui.Components.k) this.c, r0.getPreviewDelegate(), ((my0) this.b).b);
                break;
            case 5:
                az azVar = (az) this.b;
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) this.c;
                azVar.getClass();
                if (motionEvent.getAction() == 0) {
                    dz dzVar = azVar.d;
                    dzVar.c.r(dzVar.b.T(f4Var));
                    break;
                }
                break;
            case 6:
                e20 e20Var = (e20) this.b;
                a20 a20Var = (a20) this.c;
                if (motionEvent.getAction() == 0) {
                    FiltersSetupActivity filtersSetupActivity = e20Var.e;
                    filtersSetupActivity.c.r(filtersSetupActivity.a.T(a20Var));
                    break;
                }
                break;
            default:
                pn0 pn0Var = (pn0) this.b;
                Context context = (Context) this.c;
                int i15 = 0;
                if (pn0Var.getParentActivity() != null) {
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
                            AlertDialog$Builder x10 = org.telegram.ui.Components.e5.x(context, i10, i15, i11, i12, i14, i13, string, intValue == 8, new hg.c2(pn0Var, intValue, editTextBoldCursor, 14));
                            if (intValue == 8) {
                                x10.h(LocaleController.getString(R.string.PassportSelectNotExpire), new z10(22, pn0Var, editTextBoldCursor));
                            }
                            pn0Var.showDialog(x10.a);
                            break;
                        } catch (Exception e7) {
                            FileLog.e(e7);
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
