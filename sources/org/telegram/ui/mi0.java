package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mi0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 c;

    public /* synthetic */ mi0(org.telegram.ui.ActionBar.h2 h2Var, Object obj, int i7) {
        this.a = i7;
        this.c = h2Var;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10 = this.a;
        Object obj = this.b;
        int i11 = 0;
        org.telegram.ui.ActionBar.h2 h2Var = this.c;
        switch (i10) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) h2Var;
                if (i7 != -1) {
                    if (i7 == 1) {
                        passcodeActivity.E = passcodeActivity.E != 0 ? 0 : 1;
                        org.telegram.messenger.g0.h3(new ve0(8, this, (org.telegram.ui.ActionBar.z0) obj), 150L);
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
                ProxyListActivity proxyListActivity = (ProxyListActivity) h2Var;
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
                    String M0 = org.telegram.messenger.gd.M0(arrayList.size() > 1 ? 2131751499 : 2131751500, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.U = M0;
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    u1Var.S = org.telegram.messenger.gd.M0(2131751498, null);
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new qi0(this, 13));
                    proxyListActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
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
                    Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.gd.M0(arrayList.size() > 1 ? 2131745262 : 2131745263, null));
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
