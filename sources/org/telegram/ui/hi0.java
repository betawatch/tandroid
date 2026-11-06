package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class hi0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 c;

    public /* synthetic */ hi0(org.telegram.ui.ActionBar.f2 f2Var, Object obj, int i7) {
        this.a = i7;
        this.c = f2Var;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10 = this.a;
        Object obj = this.b;
        int i11 = 0;
        org.telegram.ui.ActionBar.f2 f2Var = this.c;
        switch (i10) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) f2Var;
                if (i7 != -1) {
                    if (i7 == 1) {
                        passcodeActivity.D = passcodeActivity.D != 0 ? 0 : 1;
                        org.telegram.messenger.g0.i3(new zc0(17, this, (org.telegram.ui.ActionBar.z0) obj), 150L);
                        passcodeActivity.h.setText("");
                        br[] brVarArr = passcodeActivity.n.f;
                        int length = brVarArr.length;
                        while (i11 < length) {
                            brVarArr[i11].setText("");
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
                ProxyListActivity proxyListActivity = (ProxyListActivity) f2Var;
                ArrayList arrayList = proxyListActivity.E;
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
                    String M0 = org.telegram.messenger.hd.M0(arrayList.size() > 1 ? 2131751511 : 2131751512, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.T = M0;
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    u1Var.R = org.telegram.messenger.hd.M0(2131751510, null);
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new li0(this, 13));
                    proxyListActivity.showDialog(u1Var);
                    TextView textView = (TextView) u1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.q7, null);
                        break;
                    }
                } else if (i7 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList.size();
                    while (i11 < size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        org.telegram.messenger.hz hzVar = (org.telegram.messenger.hz) obj2;
                        if (sb2.length() > 0) {
                            sb2.append("\n\n");
                        }
                        sb2.append(hzVar.a.e());
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.hd.M0(arrayList.size() > 1 ? 2131745458 : 2131745459, null));
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
