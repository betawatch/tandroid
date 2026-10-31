package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pj0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 c;

    public /* synthetic */ pj0(org.telegram.ui.ActionBar.k2 k2Var, Object obj, int i10) {
        this.a = i10;
        this.c = k2Var;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11 = this.a;
        Object obj = this.b;
        org.telegram.ui.ActionBar.k2 k2Var = this.c;
        int i12 = 1;
        switch (i11) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) k2Var;
                if (i10 == -1) {
                    passcodeActivity.finishFragment();
                    break;
                } else if (i10 == 1) {
                    passcodeActivity.D = passcodeActivity.D == 0 ? 1 : 0;
                    org.telegram.messenger.i0.h3(new uf0(9, this, (org.telegram.ui.ActionBar.b1) obj), 150L);
                    passcodeActivity.h.setText("");
                    for (bs bsVar : passcodeActivity.n.f) {
                        bsVar.setText("");
                    }
                    passcodeActivity.y0();
                    break;
                }
                break;
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) k2Var;
                ArrayList arrayList = proxyListActivity.E;
                if (i10 == -1) {
                    if (arrayList.isEmpty()) {
                        proxyListActivity.finishFragment();
                        break;
                    } else {
                        proxyListActivity.a.F();
                        break;
                    }
                } else if (i10 == 0) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(arrayList.size() > 1 ? 2131751511 : 2131751512, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.T = L0;
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    x1Var.R = org.telegram.messenger.cd.L0(2131751510, null);
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new tj0(this, 14));
                    proxyListActivity.showDialog(x1Var);
                    TextView textView = (TextView) x1Var.d(-1);
                    if (textView != null) {
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                        break;
                    }
                } else if (i10 == 1) {
                    StringBuilder sb2 = new StringBuilder();
                    int size = arrayList.size();
                    int i13 = 0;
                    while (i13 < size) {
                        Object obj2 = arrayList.get(i13);
                        i13++;
                        org.telegram.messenger.sz szVar = (org.telegram.messenger.sz) obj2;
                        if (sb2.length() > 0) {
                            sb2.append("\n\n");
                        }
                        ji.b bVar = szVar.a;
                        String str = bVar.e;
                        String str2 = bVar.d;
                        String str3 = bVar.b;
                        String str4 = bVar.f;
                        int i14 = bVar.a;
                        int c10 = m1.j.c(i14);
                        ArrayList arrayList2 = arrayList;
                        StringBuilder sb3 = c10 != i12 ? c10 != 2 ? new StringBuilder("https://t.me/socks?") : new StringBuilder("https://t.me/webproxy?") : new StringBuilder("https://t.me/proxy?");
                        try {
                            sb3.append("server=");
                            sb3.append(URLEncoder.encode(str3, "UTF-8"));
                            if (i14 != 3) {
                                sb3.append("&port=");
                                sb3.append(bVar.c);
                            }
                            if (!TextUtils.isEmpty(str2)) {
                                sb3.append("&user=");
                                sb3.append(URLEncoder.encode(str2, "UTF-8"));
                            }
                            if (!TextUtils.isEmpty(str)) {
                                sb3.append("&pass=");
                                sb3.append(URLEncoder.encode(str, "UTF-8"));
                            }
                        } catch (UnsupportedEncodingException unused) {
                        }
                        if (!TextUtils.isEmpty(str4)) {
                            if (i14 == 3) {
                                if ((str3 != null && str3.indexOf(47) >= 0) && ji.b.g(str4)) {
                                    int length = str4.length() / 2;
                                    byte[] bArr = new byte[length];
                                    for (int i15 = 0; i15 < length; i15++) {
                                        int i16 = i15 * 2;
                                        bArr[i15] = (byte) (Character.digit(str4.charAt(i16 + 1), 16) | (Character.digit(str4.charAt(i16), 16) << 4));
                                    }
                                    byte[] bArr2 = new byte[length + 1];
                                    bArr2[0] = 112;
                                    try {
                                        System.arraycopy(bArr, 0, bArr2, 1, length);
                                        str4 = Base64.encodeToString(bArr2, 11);
                                        sb3.append("&secret=");
                                        sb3.append(URLEncoder.encode(str4, "UTF-8"));
                                    } catch (UnsupportedEncodingException unused2) {
                                    }
                                    sb2.append(sb3.toString());
                                    arrayList = arrayList2;
                                    i12 = 1;
                                }
                            }
                            sb3.append("&secret=");
                            sb3.append(URLEncoder.encode(str4, "UTF-8"));
                            sb2.append(sb3.toString());
                            arrayList = arrayList2;
                            i12 = 1;
                        }
                        sb2.append(sb3.toString());
                        arrayList = arrayList2;
                        i12 = 1;
                    }
                    ArrayList arrayList3 = arrayList;
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                    Intent createChooser = Intent.createChooser(intent, org.telegram.messenger.cd.L0(arrayList3.size() > 1 ? 2131745475 : 2131745476, null));
                    createChooser.setFlags(TLObject.FLAG_28);
                    ((Context) obj).startActivity(createChooser);
                    fg.j jVar = proxyListActivity.a;
                    if (jVar != null) {
                        jVar.F();
                        break;
                    }
                }
                break;
        }
    }
}
