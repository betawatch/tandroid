// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class eg implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eg(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        u69 T;
        int b;
        int b2;
        byte b3 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        byte b4 = 1;
        switch (b3) {
            case 0:
                he heVar = (he) obj2;
                cg cgVar = (cg) obj;
                if ((i == 6 || keyEvent.getKeyCode() == 66) && heVar.isShowing()) {
                    cgVar.r(heVar, 0);
                    break;
                }
                break;
            case 1:
                ik1 ik1Var = (ik1) obj2;
                xza xzaVar = (xza) obj;
                if (i == 5) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    oj1 oj1Var = new oj1(ik1Var, twoStepVerificationActivity, b4);
                    twoStepVerificationActivity.a0 = (byte) 1;
                    twoStepVerificationActivity.c0 = oj1Var;
                    ik1Var.G0.setLoading(true);
                    twoStepVerificationActivity.x0(new pj1(ik1Var, xzaVar, twoStepVerificationActivity, b4));
                    break;
                }
                break;
            case 2:
                t72 t72Var = (t72) obj;
                v72 v72Var = (v72) ((s30) obj2).e;
                smb smbVar = v72Var.s;
                if (i == 5) {
                    View F = smbVar.F(t72Var);
                    T = F != null ? smbVar.T(F) : null;
                    if (T != null && (b = T.b()) != -1) {
                        int i2 = b - v72Var.u0;
                        int i3 = v72Var.N;
                        if (i2 != i3 - 1) {
                            u69 K = smbVar.K(b + 1);
                            if (K != null) {
                                View view = K.a;
                                if (view instanceof ng8) {
                                    ((ng8) view).getTextView().requestFocus();
                                }
                            }
                        } else if (i3 < v72Var.K) {
                            v72Var.O();
                        } else {
                            gm.t1(t72Var.getTextView());
                        }
                    }
                    break;
                }
                break;
            default:
                hg8 hg8Var = (hg8) obj;
                kg8 kg8Var = ((ig8) obj2).d;
                if (i == 5) {
                    smb smbVar2 = kg8Var.c;
                    View F2 = smbVar2.F(hg8Var);
                    T = F2 != null ? smbVar2.T(F2) : null;
                    if (T != null && (b2 = T.b()) != -1) {
                        int i4 = b2 - kg8Var.o0;
                        int i5 = kg8Var.E;
                        if (i4 != i5 - 1) {
                            u69 K2 = kg8Var.c.K(b2 + 1);
                            if (K2 != null) {
                                View view2 = K2.a;
                                if (view2 instanceof ng8) {
                                    ((ng8) view2).getTextView().requestFocus();
                                }
                            }
                        } else if (i5 < kg8Var.n) {
                            kg8Var.h0();
                        } else {
                            gm.t1(hg8Var.getTextView());
                        }
                    }
                    break;
                }
                break;
        }
        return false;
    }
}
