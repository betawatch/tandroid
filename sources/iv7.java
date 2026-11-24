// default package

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProxyListActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iv7 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ d c;

    public /* synthetic */ iv7(d dVar, Object obj, byte b) {
        this.a = b;
        this.c = dVar;
        this.b = obj;
    }

    @Override // c6
    public final void b(int i) {
        byte b = this.a;
        Object obj = this.b;
        int i2 = 0;
        d dVar = this.c;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                if (i != -1) {
                    if (i == 1) {
                        passcodeActivity.E = !passcodeActivity.E;
                        gl.d3(new bj7(this, (a8) obj, (byte) 18), 150L);
                        passcodeActivity.h.setText("");
                        sj2[] sj2VarArr = passcodeActivity.n.f;
                        int length = sj2VarArr.length;
                        while (i2 < length) {
                            sj2VarArr[i2].setText("");
                            i2++;
                        }
                        passcodeActivity.x0();
                        break;
                    }
                } else {
                    passcodeActivity.finishFragment();
                    break;
                }
                break;
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) dVar;
                ArrayList arrayList = proxyListActivity.F;
                if (i == -1) {
                    if (!arrayList.isEmpty()) {
                        proxyListActivity.a.F();
                        break;
                    } else {
                        proxyListActivity.finishFragment();
                        break;
                    }
                } else if (i == 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    String M0 = k96.M0(arrayList.size() > 1 ? 2131751498 : 2131751499, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.U = M0;
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    hdVar.S = k96.M0(2131751497, null);
                    alertDialog$Builder.j(k96.M0(2131751586, null), new k88(this, (byte) 15));
                    proxyListActivity.showDialog(hdVar);
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                        break;
                    }
                } else if (i == 1) {
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        fba fbaVar = (fba) obj2;
                        if (sb.length() > 0) {
                            sb.append("\n\n");
                        }
                        sb.append(fbaVar.a.e());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb.toString());
                    Intent createChooser = Intent.createChooser(intent, k96.M0(arrayList.size() > 1 ? 2131745265 : 2131745266, null));
                    createChooser.setFlags(TLObject.FLAG_28);
                    ((Context) obj).startActivity(createChooser);
                    s20 s20Var = proxyListActivity.a;
                    if (s20Var != null) {
                        s20Var.F();
                        break;
                    }
                }
                break;
        }
    }
}
