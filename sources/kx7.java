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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kx7 extends c6 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ d c;

    public /* synthetic */ kx7(d dVar, Object obj, byte b) {
        this.a = b;
        this.c = dVar;
        this.b = obj;
    }

    @Override // c6
    public final void b(int i) {
        byte b = this.a;
        byte b2 = 19;
        Object obj = this.b;
        int i2 = 0;
        d dVar = this.c;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                if (i != -1) {
                    if (i == 1) {
                        passcodeActivity.E = !passcodeActivity.E;
                        gm.d3(new bl7(this, (a8) obj, b2), 150L);
                        passcodeActivity.h.setText("");
                        gl2[] gl2VarArr = passcodeActivity.n.f;
                        int length = gl2VarArr.length;
                        while (i2 < length) {
                            gl2VarArr[i2].setText("");
                            i2++;
                        }
                        passcodeActivity.y0();
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
                    String M0 = jb6.M0(arrayList.size() > 1 ? 2131751447 : 2131751448, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.U = M0;
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    heVar.S = jb6.M0(2131751446, null);
                    alertDialog$Builder.j(jb6.M0(2131751535, null), new h68(this, (byte) 19));
                    proxyListActivity.showDialog(heVar);
                    TextView textView = (TextView) heVar.c(-1);
                    if (textView != null) {
                        anb.X(textView, cmb.p7, null);
                        break;
                    }
                } else if (i == 1) {
                    StringBuilder sb = new StringBuilder();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        fda fdaVar = (fda) obj2;
                        if (sb.length() > 0) {
                            sb.append("\n\n");
                        }
                        sb.append(fdaVar.a.e());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb.toString());
                    Intent createChooser = Intent.createChooser(intent, jb6.M0(arrayList.size() > 1 ? 2131745191 : 2131745192, null));
                    createChooser.setFlags(TLObject.FLAG_28);
                    ((Context) obj).startActivity(createChooser);
                    s30 s30Var = proxyListActivity.a;
                    if (s30Var != null) {
                        s30Var.F();
                        break;
                    }
                }
                break;
        }
    }
}
