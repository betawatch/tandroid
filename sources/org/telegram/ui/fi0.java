package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fi0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 c;

    public /* synthetic */ fi0(org.telegram.ui.ActionBar.d2 d2Var, Object obj, int i3) {
        this.a = i3;
        this.c = d2Var;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i3) {
        int i10 = this.a;
        Object obj = this.b;
        int i11 = 0;
        org.telegram.ui.ActionBar.d2 d2Var = this.c;
        switch (i10) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) d2Var;
                if (i3 != -1) {
                    if (i3 == 1) {
                        passcodeActivity.E = passcodeActivity.E != 0 ? 0 : 1;
                        org.telegram.messenger.g0.i3(new tb0(21, this, (org.telegram.ui.ActionBar.y0) obj), 150L);
                        passcodeActivity.h.setText("");
                        zq[] zqVarArr = passcodeActivity.n.f;
                        int length = zqVarArr.length;
                        while (i11 < length) {
                            zqVarArr[i11].setText("");
                            i11++;
                        }
                        passcodeActivity.z0();
                        break;
                    }
                } else {
                    passcodeActivity.finishFragment();
                    break;
                }
                break;
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) d2Var;
                ArrayList arrayList = proxyListActivity.F;
                if (i3 == -1) {
                    if (!arrayList.isEmpty()) {
                        proxyListActivity.a.F();
                        break;
                    } else {
                        proxyListActivity.finishFragment();
                        break;
                    }
                } else if (i3 == 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(arrayList.size() > 1 ? 2131751511 : 2131751512, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.U = M0;
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    s1Var.S = org.telegram.messenger.bd.M0(2131751510, null);
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new ci0(this, 14));
                    proxyListActivity.showDialog(s1Var);
                    TextView textView = (TextView) s1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                        break;
                    }
                } else if (i3 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) obj2;
                        if (sb2.length() > 0) {
                            sb2.append("\n\n");
                        }
                        sb2.append(zyVar.a.e());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.bd.M0(arrayList.size() > 1 ? 2131745467 : 2131745468, null));
                    createChooser.setFlags(TLObject.FLAG_28);
                    ((Context) obj).startActivity(createChooser);
                    n4 n4Var = proxyListActivity.a;
                    if (n4Var != null) {
                        n4Var.F();
                        break;
                    }
                }
                break;
        }
    }
}
