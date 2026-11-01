package org.telegram.ui.Cells;

import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.dd;
import org.telegram.messenger.l20;
import org.telegram.messenger.q20;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.nu0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.wb0;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.bs;
import org.telegram.ui.fe;
import org.telegram.ui.le;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements l20, org.telegram.ui.ActionBar.u1, ju0, q20, zg.f, gk0, nu0, ou0, qc, yb0, wb0 {
    public final /* synthetic */ int a;

    public /* synthetic */ m5(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.messenger.q20
    public Boolean a(b51 b51Var, View view, Integer num, Float f7, Float f10) {
        return Boolean.FALSE;
    }

    @Override // org.telegram.ui.Components.ou0
    public void b(Object obj, float f7) {
        bs bsVar = (bs) obj;
        switch (this.a) {
            case 10:
                bsVar.G1 = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 11:
            case 13:
            default:
                bsVar.J1 = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 12:
                bsVar.H1 = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    break;
                }
                break;
            case 14:
                bsVar.I1 = f7;
                if (bsVar.getParent() != null) {
                    ((View) bsVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.messenger.l20
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        Integer num2 = (Integer) obj;
        switch (this.a) {
            case 1:
                if (num.intValue() == 0) {
                    return dd.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return dd.H(',', "Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override // org.telegram.ui.Components.wb0
    public String e(int i10) {
        switch (this.a) {
            case 21:
                if (i10 != 0) {
                    Calendar calendar = Calendar.getInstance();
                    int i11 = calendar.get(1);
                    calendar.add(6, i10);
                    long timeInMillis = calendar.getTimeInMillis();
                    if (calendar.get(1) != i11) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 22:
                if (i10 != 0) {
                    Calendar calendar2 = Calendar.getInstance();
                    int i12 = calendar2.get(1);
                    calendar2.add(6, i10);
                    long timeInMillis2 = calendar2.getTimeInMillis();
                    int i13 = calendar2.get(1);
                    if (i13 == i12 && i10 < 7) {
                        break;
                    } else if (i13 != i12) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 27:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i10);
                break;
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.Components.ju0
    public /* synthetic */ float f(RecyclerView recyclerView) {
        return f1.c(recyclerView);
    }

    @Override // org.telegram.ui.Components.nu0
    public float get(Object obj) {
        bs bsVar = (bs) obj;
        switch (this.a) {
            case 9:
                return bsVar.G1;
            case 10:
            case 12:
            default:
                return bsVar.J1;
            case 11:
                return bsVar.H1;
            case 13:
                return bsVar.I1;
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 2:
                x1Var.dismiss();
                break;
            case 7:
                x1Var.dismiss();
                break;
            default:
                x1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ju0
    public RecyclerView j(View view) {
        return ((fe) view).a;
    }

    @Override // zg.f
    public void l(RectF rectF, View view) {
        view.invalidate();
    }

    @Override // org.telegram.messenger.qc
    public void p(Exception exc) {
        switch (this.a) {
            case 17:
                org.telegram.messenger.f8.g(exc, true);
                break;
            default:
                org.telegram.messenger.f8.g(exc, true);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ju0
    public /* synthetic */ void q(RecyclerView recyclerView) {
        f1.b(recyclerView);
    }

    @Override // org.telegram.ui.Components.yb0
    public void t(ac0 ac0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.s4.a;
    }

    public /* synthetic */ m5(le leVar) {
        this.a = 4;
    }
}
