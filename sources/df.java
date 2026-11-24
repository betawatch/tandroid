// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class df implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ df(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        s49 T;
        int b;
        int b2;
        byte b3 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        byte b4 = 1;
        switch (b3) {
            case 0:
                hd hdVar = (hd) obj2;
                bf bfVar = (bf) obj;
                if ((i == 6 || keyEvent.getKeyCode() == 66) && hdVar.isShowing()) {
                    bfVar.u(hdVar, 0);
                    break;
                }
                break;
            case 1:
                zi1 zi1Var = (zi1) obj2;
                uxa uxaVar = (uxa) obj;
                if (i == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    gi1 gi1Var = new gi1(zi1Var, twoStepVerificationActivity, b4);
                    twoStepVerificationActivity.a0 = (byte) 1;
                    twoStepVerificationActivity.c0 = gi1Var;
                    zi1Var.G0.setLoading(true);
                    twoStepVerificationActivity.w0(new hi1(zi1Var, uxaVar, twoStepVerificationActivity, b4));
                    break;
                }
                break;
            case 2:
                i62 i62Var = (i62) obj;
                k62 k62Var = (k62) ((s20) obj2).e;
                rkb rkbVar = k62Var.s;
                if (i == 5) {
                    View F = rkbVar.F(i62Var);
                    T = F != null ? rkbVar.T(F) : null;
                    if (T != null && (b = T.b()) != -1) {
                        int i2 = b - k62Var.u0;
                        int i3 = k62Var.N;
                        if (i2 != i3 - 1) {
                            s49 K = rkbVar.K(b + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof le8) {
                                    ((le8) view).getTextView().requestFocus();
                                }
                            }
                        } else if (i3 < k62Var.K) {
                            k62Var.P();
                        } else {
                            gl.t1(i62Var.getTextView());
                        }
                    }
                    break;
                }
                break;
            default:
                fe8 fe8Var = (fe8) obj;
                ie8 ie8Var = ((ge8) obj2).d;
                if (i == 5) {
                    rkb rkbVar2 = ie8Var.c;
                    View F2 = rkbVar2.F(fe8Var);
                    T = F2 != null ? rkbVar2.T(F2) : null;
                    if (T != null && (b2 = T.b()) != -1) {
                        int i4 = b2 - ie8Var.o0;
                        int i5 = ie8Var.E;
                        if (i4 != i5 - 1) {
                            s49 K2 = ie8Var.c.K(b2 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof le8) {
                                    ((le8) view2).getTextView().requestFocus();
                                }
                            }
                        } else if (i5 < ie8Var.n) {
                            ie8Var.g0();
                        } else {
                            gl.t1(fe8Var.getTextView());
                        }
                    }
                    break;
                }
                break;
        }
        return false;
    }
}
