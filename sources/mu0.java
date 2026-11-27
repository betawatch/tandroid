// default package

import android.content.DialogInterface;
import java.util.Arrays;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mu0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mu0(rv0 rv0Var, boolean[] zArr, pv0 pv0Var, String str) {
        this.a = (byte) 0;
        this.c = rv0Var;
        this.b = zArr;
        this.d = pv0Var;
        this.e = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        boolean[] zArr = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                rv0 rv0Var = (rv0) obj3;
                pv0 pv0Var = (pv0) obj2;
                String str = (String) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    rv0Var.u(pv0Var, "requested_chat_failed", rv0.x(str, "req_id"));
                    break;
                }
                break;
            case 1:
                TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr = (TL_wallet.inputTonConnectOauthSession[]) obj3;
                nx0[] nx0VarArr = (nx0[]) obj2;
                nx0[] nx0VarArr2 = (nx0[]) obj;
                zArr[0] = true;
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession = inputtonconnectoauthsessionArr[0];
                if (inputtonconnectoauthsession != null) {
                    Arrays.fill(inputtonconnectoauthsession.challenge_answer, (byte) 0);
                    inputtonconnectoauthsessionArr[0] = null;
                }
                nx0 nx0Var = nx0VarArr[0];
                if (nx0Var != null) {
                    nx0Var.dismiss();
                    nx0VarArr[0] = null;
                }
                uq7.a = null;
                nx0 nx0Var2 = nx0VarArr2[0];
                if (nx0Var2 != null) {
                    nx0Var2.dismiss();
                    nx0VarArr2[0] = null;
                    break;
                }
                break;
            case 2:
                pcc pccVar = (pcc) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                icc iccVar = (icc) obj;
                if (pccVar != null && !zArr[0]) {
                    pccVar.a(Boolean.FALSE);
                    if (!zArr2[0]) {
                        iccVar.a("cancelled", 0L);
                        zArr2[0] = true;
                        break;
                    }
                }
                break;
            default:
                pcc pccVar2 = (pcc) obj3;
                boolean[] zArr3 = (boolean[]) obj2;
                pcc pccVar3 = (pcc) obj;
                if (pccVar2 != null && !zArr[0]) {
                    pccVar2.a(Boolean.FALSE);
                    if (!zArr3[0] && pccVar3 != null) {
                        pccVar3.a("cancelled");
                        zArr3[0] = true;
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ mu0(jxa jxaVar, pcc pccVar, boolean[] zArr, boolean[] zArr2, Object obj, byte b) {
        this.a = b;
        this.c = pccVar;
        this.b = zArr;
        this.d = zArr2;
        this.e = obj;
    }

    public /* synthetic */ mu0(boolean[] zArr, TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr, nx0[] nx0VarArr, nx0[] nx0VarArr2) {
        this.a = (byte) 1;
        this.b = zArr;
        this.c = inputtonconnectoauthsessionArr;
        this.d = nx0VarArr;
        this.e = nx0VarArr2;
    }
}
