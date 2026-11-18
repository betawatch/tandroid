package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import di.pb;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.s00;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e8 extends z41 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8(KeyEvent.Callback callback, ck0 ck0Var, Context context, int i7, q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(ck0Var, context, i7, 0, false, q10Var, i6Var);
        this.Q = i10;
        this.R = callback;
    }

    @Override // org.telegram.ui.Components.z41, v4.i0
    public void t(v4.f1 f1Var, int i7) {
        fi.m0 m0Var;
        fi.r0 r0Var;
        switch (this.Q) {
            case 2:
                super.t(f1Var, i7);
                fi.a2 a2Var = (fi.a2) this.R;
                if (a2Var.E) {
                    View view = f1Var.a;
                    if ((view instanceof fi.m0) && (r0Var = (m0Var = (fi.m0) view).L) != null && r0Var.a == a2Var.y) {
                        m0Var.a();
                        a2Var.E = false;
                        break;
                    }
                }
                break;
            default:
                super.t(f1Var, i7);
                break;
        }
    }

    @Override // org.telegram.ui.Components.z41, v4.i0
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        org.telegram.ui.ActionBar.i6 i6Var4;
        switch (this.Q) {
            case 0:
                g8 g8Var = (g8) this.R;
                if (i7 != 0) {
                    if (i7 != 42) {
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            case 1:
                pb pbVar = (pb) this.R;
                if (i7 != 42) {
                    break;
                } else {
                    Activity parentActivity = pbVar.getParentActivity();
                    int i10 = org.telegram.ui.ActionBar.n6.L6;
                    i6Var = ((org.telegram.ui.ActionBar.h2) pbVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i10, 21, 0, false, i6Var);
                    n4Var.setHeight(25);
                    break;
                }
            case 3:
                ii.t tVar = (ii.t) this.R;
                if (i7 != 42) {
                    break;
                } else {
                    Activity parentActivity2 = tVar.getParentActivity();
                    int i11 = org.telegram.ui.ActionBar.n6.L6;
                    i6Var2 = ((org.telegram.ui.ActionBar.h2) tVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(parentActivity2, i11, 21, 0, false, i6Var2);
                    n4Var2.setHeight(25);
                    break;
                }
            case 4:
                ki.k kVar = (ki.k) this.R;
                if (i7 != 42) {
                    break;
                } else {
                    Activity parentActivity3 = kVar.getParentActivity();
                    int i12 = org.telegram.ui.ActionBar.n6.L6;
                    i6Var3 = ((org.telegram.ui.ActionBar.h2) kVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(parentActivity3, i12, 21, 0, false, i6Var3);
                    n4Var3.setHeight(25);
                    break;
                }
            case 5:
                ki.i3 i3Var = (ki.i3) this.R;
                if (i7 != 42) {
                    break;
                } else {
                    Activity parentActivity4 = i3Var.getParentActivity();
                    int i13 = org.telegram.ui.ActionBar.n6.L6;
                    i6Var4 = ((org.telegram.ui.ActionBar.h2) i3Var).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(parentActivity4, i13, 21, 0, false, i6Var4);
                    n4Var4.setHeight(25);
                    break;
                }
        }
        return super.x(viewGroup, i7);
    }

    @Override // org.telegram.ui.Components.z41, v4.i0
    public void y(v4.f1 f1Var) {
        fi.m0 m0Var;
        fi.r0 r0Var;
        switch (this.Q) {
            case 2:
                super.y(f1Var);
                fi.a2 a2Var = (fi.a2) this.R;
                if (a2Var.E) {
                    View view = f1Var.a;
                    if ((view instanceof fi.m0) && (r0Var = (m0Var = (fi.m0) view).L) != null && r0Var.a == a2Var.y) {
                        m0Var.a();
                        a2Var.E = false;
                        break;
                    }
                }
                break;
            default:
                super.y(f1Var);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8(s00 s00Var, ck0 ck0Var, Activity activity, int i7, int i10, q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11) {
        super(ck0Var, activity, i7, i10, true, q10Var, i6Var);
        this.Q = i11;
        this.R = s00Var;
    }
}
