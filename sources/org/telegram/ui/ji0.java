package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ji0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 c;

    public /* synthetic */ ji0(org.telegram.ui.ActionBar.e2 e2Var, Object obj, int i7) {
        this.a = i7;
        this.c = e2Var;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10 = this.a;
        int i11 = 13;
        Object obj = this.b;
        int i12 = 0;
        org.telegram.ui.ActionBar.e2 e2Var = this.c;
        switch (i10) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) e2Var;
                if (i7 != -1) {
                    if (i7 == 1) {
                        passcodeActivity.E = passcodeActivity.E != 0 ? 0 : 1;
                        org.telegram.messenger.g0.i3(new jd0(i11, this, (org.telegram.ui.ActionBar.z0) obj), 150L);
                        passcodeActivity.h.setText("");
                        dr[] drVarArr = passcodeActivity.n.f;
                        int length = drVarArr.length;
                        while (i12 < length) {
                            drVarArr[i12].setText("");
                            i12++;
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
                ProxyListActivity proxyListActivity = (ProxyListActivity) e2Var;
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
                    String M0 = org.telegram.messenger.hd.M0(arrayList.size() > 1 ? 2131751510 : 2131751511, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.U = M0;
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    t1Var.S = org.telegram.messenger.hd.M0(2131751509, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ni0(this, i11));
                    proxyListActivity.showDialog(t1Var);
                    TextView textView = (TextView) t1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.q7, null);
                        break;
                    }
                } else if (i7 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList.size();
                    while (i12 < size) {
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) obj2;
                        if (sb2.length() > 0) {
                            sb2.append("\n\n");
                        }
                        sb2.append(fzVar.a.e());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.hd.M0(arrayList.size() > 1 ? 2131745457 : 2131745458, null));
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
