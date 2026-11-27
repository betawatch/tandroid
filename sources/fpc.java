// default package

import android.view.View;
import java.util.Locale;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fpc implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uqc b;

    public /* synthetic */ fpc(uqc uqcVar, byte b) {
        this.a = b;
        this.b = uqcVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        byte b2 = 3;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                uqcVar.E0.setClickable(!bool.booleanValue());
                uqcVar.F0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    uqcVar.f0 = 1;
                    uqcVar.s0.setPosition(1);
                    uqcVar.s0.post(new cpc(uqcVar, b2));
                    break;
                }
                break;
            case 1:
                uqcVar.l0 = ((String) obj).trim().toLowerCase(Locale.ROOT);
                q9c[] q9cVarArr = uqcVar.u0;
                q9c q9cVar = q9cVarArr[1];
                if (q9cVar != null) {
                    uqc.c1(q9cVar, true);
                    q9cVarArr[1].x0(0);
                    q9cVarArr[1].post(new cpc(uqcVar, b2));
                    break;
                }
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                if (uqcVar.D0 != floatValue) {
                    uqcVar.D0 = floatValue;
                    float x = bp1.x(floatValue, 0.6f, 1.0f, 0.0f);
                    int i = 0;
                    while (true) {
                        int childCount = uqcVar.C0.getChildCount();
                        oob oobVar = uqcVar.C0;
                        if (i >= childCount) {
                            oobVar.setImportantForAccessibility(floatValue != 0.0f ? 4 : 0);
                            uqcVar.C0.requestLayout();
                            break;
                        } else {
                            View childAt = oobVar.getChildAt(i);
                            childAt.setAlpha(x);
                            childAt.setPivotY(0.0f);
                            childAt.setScaleY(1.0f - floatValue);
                            i++;
                        }
                    }
                }
                break;
            case 3:
                uqcVar.F0((String) obj);
                break;
            default:
                TLRPC.User user = (TLRPC.User) obj;
                if (!uqcVar.isFinished) {
                    if (user != null) {
                        uqcVar.presentFragment(new euc(user));
                        break;
                    } else {
                        hl.c3(new cpc(uqcVar, (byte) 9));
                        break;
                    }
                }
                break;
        }
    }
}
