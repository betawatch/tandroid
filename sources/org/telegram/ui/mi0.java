package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class mi0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 c;

    public /* synthetic */ mi0(org.telegram.ui.ActionBar.g2 g2Var, Object obj, int i7) {
        this.a = i7;
        this.c = g2Var;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10 = this.a;
        Object obj = this.b;
        int i11 = 0;
        org.telegram.ui.ActionBar.g2 g2Var = this.c;
        switch (i10) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) g2Var;
                if (i7 != -1) {
                    if (i7 == 1) {
                        passcodeActivity.E = passcodeActivity.E != 0 ? 0 : 1;
                        org.telegram.messenger.g0.h3(new fe0(10, this, (org.telegram.ui.ActionBar.y0) obj), 150L);
                        passcodeActivity.h.setText("");
                        er[] erVarArr = passcodeActivity.n.f;
                        int length = erVarArr.length;
                        while (i11 < length) {
                            erVarArr[i11].setText("");
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
                ProxyListActivity proxyListActivity = (ProxyListActivity) g2Var;
                ArrayList arrayList = proxyListActivity.F;
                if (i7 == -1) {
                    if (!arrayList.isEmpty()) {
                        proxyListActivity.a.F();
                        break;
                    } else {
                        proxyListActivity.finishFragment();
                        break;
                    }
                } else if (i7 == 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    String N0 = org.telegram.messenger.gd.N0(arrayList.size() > 1 ? 2131751498 : 2131751499, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.U = N0;
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    t1Var.S = org.telegram.messenger.gd.N0(2131751497, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new qi0(this, 13));
                    proxyListActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.q7, null);
                        break;
                    }
                } else if (i7 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        org.telegram.messenger.az azVar = (org.telegram.messenger.az) obj2;
                        if (sb2.length() > 0) {
                            sb2.append("\n\n");
                        }
                        sb2.append(azVar.a.e());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.gd.N0(arrayList.size() > 1 ? 2131745261 : 2131745262, null));
                    createChooser.setFlags(TLObject.FLAG_28);
                    ((Context) obj).startActivity(createChooser);
                    l4 l4Var = proxyListActivity.a;
                    if (l4Var != null) {
                        l4Var.F();
                        break;
                    }
                }
                break;
        }
    }
}
