// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iz7 extends c6 {
    public final /* synthetic */ xz7 a;

    public iz7(xz7 xz7Var) {
        this.a = xz7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e  */
    @Override // c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        JSONObject jSONObject;
        HashMap hashMap;
        HashMap hashMap2;
        String str;
        int i5;
        String obj;
        xz7 xz7Var = this.a;
        int i6 = xz7Var.b;
        if (i == -1) {
            if (xz7Var.O0(true)) {
                return;
            }
            if (i6 == 0 || i6 == 5) {
                xz7Var.N0(false);
            }
            xz7Var.finishFragment();
            return;
        }
        if (i == 1) {
            if (xz7Var.getParentActivity() != null) {
                l66 l66Var = new l66(xz7Var.getParentActivity(), null);
                String M0 = jb6.M0(2131747292, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                int indexOf = M0.indexOf(42);
                int lastIndexOf = M0.lastIndexOf(42);
                if (indexOf != -1 && lastIndexOf != -1) {
                    spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new uj((byte) 2, this, jb6.M0(2131747290, null)), indexOf, lastIndexOf - 1, 33);
                }
                l66Var.setText(spannableStringBuilder);
                l66Var.setTextSize(1, 16.0f);
                anb.G(l66Var, cmb.j5, null);
                anb.C(l66Var, cmb.k5, null);
                l66Var.setPadding(gm.L(23.0f), 0, gm.L(23.0f), 0);
                l66Var.setMovementMethod(new cm((byte) 0));
                anb.X(l66Var, cmb.i5, null);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xz7Var.getParentActivity());
                alertDialog$Builder.n(l66Var);
                String M02 = jb6.M0(2131747291, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M02;
                alertDialog$Builder.g(jb6.M0(2131751978, null), null);
                xz7Var.showDialog(heVar);
                return;
            }
            return;
        }
        if (i == 2) {
            if (i6 == 5) {
                xz7Var.E1(false);
                return;
            }
            if (i6 == 7) {
                xz7Var.K1[xz7Var.J1].h(null);
                return;
            }
            kl7 kl7Var = new kl7(this, (byte) 14);
            wm4 wm4Var = new wm4(this, kl7Var, false, (byte) 16);
            if (i6 == 4) {
                if (xz7Var.f) {
                    obj = xz7Var.e1;
                } else if (xz7Var.Q0()) {
                    return;
                } else {
                    obj = xz7Var.Z[0].getText().toString();
                }
                xz7Var.C1.c(xz7Var.F, obj, null, null, null, null, null, null, null, null, kl7Var, wm4Var);
            } else if (i6 == 3) {
                if (xz7Var.f) {
                    i5 = ((d) xz7Var).currentAccount;
                    str = z8c.h(i5).f().phone;
                } else {
                    if (xz7Var.Q0()) {
                        return;
                    }
                    str = xz7Var.Z[1].getText().toString() + xz7Var.Z[2].getText().toString();
                }
                xz7Var.C1.c(xz7Var.F, str, null, null, null, null, null, null, null, null, kl7Var, wm4Var);
            } else if (i6 == 2) {
                if (!xz7Var.p1.isEmpty() || xz7Var.Q0()) {
                    return;
                }
                String str2 = xz7Var.a;
                if (str2 == null || str2.equals(xz7Var.f1())) {
                    xz7Var.finishFragment();
                    return;
                }
                if (!xz7Var.w0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", xz7Var.Z[0].getText().toString());
                        jSONObject.put("street_line2", xz7Var.Z[1].getText().toString());
                        jSONObject.put("post_code", xz7Var.Z[2].getText().toString());
                        jSONObject.put("city", xz7Var.Z[3].getText().toString());
                        jSONObject.put("state", xz7Var.Z[4].getText().toString());
                        jSONObject.put("country_code", xz7Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = xz7Var.x1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = xz7Var.y1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    xz7Var.C1.c(xz7Var.F, null, jSONObject != null ? jSONObject.toString() : null, xz7Var.G, null, xz7Var.j1, xz7Var.k1, xz7Var.l1, null, null, kl7Var, wm4Var);
                }
                jSONObject = null;
                hashMap = xz7Var.x1;
                if (hashMap != null) {
                }
                hashMap2 = xz7Var.y1;
                if (hashMap2 != null) {
                }
                xz7Var.C1.c(xz7Var.F, null, jSONObject != null ? jSONObject.toString() : null, xz7Var.G, null, xz7Var.j1, xz7Var.k1, xz7Var.l1, null, null, kl7Var, wm4Var);
            } else if (i6 == 1) {
                if (!c(kl7Var, wm4Var)) {
                    return;
                }
            } else if (i6 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = xz7Var.Z[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i2 = ((d) xz7Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(verifyemail, new av0(this, kl7Var, wm4Var, verifyemail, (byte) 13));
                i3 = ((d) xz7Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                i4 = ((d) xz7Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i4);
            }
            xz7Var.Q1(true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x030a  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(kl7 kl7Var, wm4 wm4Var) {
        ?? r16;
        int i;
        byte b;
        byte b2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        char c;
        int i2;
        byte b3;
        boolean z;
        int i3;
        xz7 xz7Var = this.a;
        int[] iArr = xz7Var.y;
        boolean[] zArr = xz7Var.u0;
        char c2 = 0;
        if (!xz7Var.p1.isEmpty() || xz7Var.Q0()) {
            return false;
        }
        int i4 = 3;
        byte b4 = 2;
        xw9 xw9Var = null;
        ?? r15 = 1;
        if (xz7Var.v0) {
            xz7Var.v0 = false;
            int i5 = 0;
            boolean z2 = false;
            while (i5 < zArr.length) {
                if (zArr[i5]) {
                    xz7Var.Z[i5].setErrorText(jb6.M0(2131747182, null));
                    if (!z2) {
                        String S0 = zArr[c2] ? jb6.D0().S0(xz7Var.b0[c2].getText().toString(), r15, r15) : xz7Var.Z[c2].getText().toString();
                        String S02 = zArr[r15] ? jb6.D0().S0(xz7Var.b0[r15].getText().toString(), r15, r15) : xz7Var.Z[r15].getText().toString();
                        String S03 = zArr[b4] ? jb6.D0().S0(xz7Var.b0[b4].getText().toString(), r15, r15) : xz7Var.Z[b4].getText().toString();
                        if (TextUtils.isEmpty(S0) || TextUtils.isEmpty(S02) || TextUtils.isEmpty(S03)) {
                            c = c2;
                            i2 = i4;
                            b3 = b4;
                            z = r15;
                            i3 = i5;
                            xz7Var.C1(xz7Var.Z[i3]);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xz7Var.getParentActivity());
                            Object[] objArr = new Object[i4];
                            objArr[c2] = S0;
                            objArr[r15] = S02;
                            objArr[b4] = S03;
                            c = c2;
                            String a0 = jb6.a0("PassportNameCheckAlert", null, 2131747236, objArr);
                            he heVar = alertDialog$Builder.a;
                            heVar.U = a0;
                            heVar.S = jb6.M0(R.string.AppName, null);
                            b3 = b4;
                            z = r15;
                            i3 = i5;
                            i2 = i4;
                            alertDialog$Builder.j(jb6.M0(2131751291, null), new ze(this, S0, S02, S03, kl7Var, wm4Var, (byte) 4));
                            alertDialog$Builder.g(jb6.M0(2131751272, null), new ji(this, i3, (byte) 16));
                            xz7Var.showDialog(heVar);
                        }
                        z2 = z;
                        i5 = i3 + 1;
                        c2 = c;
                        i4 = i2;
                        b4 = b3;
                        r15 = z;
                    }
                }
                c = c2;
                i2 = i4;
                b3 = b4;
                z = r15;
                i3 = i5;
                i5 = i3 + 1;
                c2 = c;
                i4 = i2;
                b4 = b3;
                r15 = z;
            }
            boolean z3 = c2;
            i = i4;
            b = b4;
            b2 = r15;
            r16 = z3;
            if (z2) {
                return z3;
            }
        } else {
            r16 = 0;
            i = 3;
            b = 2;
            b2 = 1;
        }
        String str = xz7Var.a;
        if (str == null || str.equals(xz7Var.f1())) {
            xz7Var.finishFragment();
            return r16;
        }
        try {
            if (xz7Var.w0) {
                jSONObject = null;
            } else {
                HashMap hashMap3 = new HashMap(xz7Var.t1);
                if (xz7Var.F.native_names) {
                    if (xz7Var.r0.getVisibility() == 0) {
                        hashMap3.put("first_name_native", xz7Var.b0[r16].getText().toString());
                        hashMap3.put("middle_name_native", xz7Var.b0[b2].getText().toString());
                        hashMap3.put("last_name_native", xz7Var.b0[b].getText().toString());
                    } else {
                        hashMap3.put("first_name_native", xz7Var.Z[r16].getText().toString());
                        hashMap3.put("middle_name_native", xz7Var.Z[b2].getText().toString());
                        hashMap3.put("last_name_native", xz7Var.Z[b].getText().toString());
                    }
                }
                hashMap3.put("first_name", xz7Var.Z[r16].getText().toString());
                hashMap3.put("middle_name", xz7Var.Z[b2].getText().toString());
                hashMap3.put("last_name", xz7Var.Z[b].getText().toString());
                hashMap3.put("birth_date", xz7Var.Z[i].getText().toString());
                hashMap3.put("gender", xz7Var.x);
                hashMap3.put("country_code", xz7Var.s);
                hashMap3.put("residence_country_code", xz7Var.w);
                jSONObject = new JSONObject();
                try {
                    ArrayList arrayList = new ArrayList(hashMap3.keySet());
                    Collections.sort(arrayList, new qx7(this, b2));
                    int size = arrayList.size();
                    for (int i6 = r16; i6 < size; i6++) {
                        String str2 = (String) arrayList.get(i6);
                        jSONObject.put(str2, hashMap3.get(str2));
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            jSONObject = null;
            jSONObject2 = null;
        }
        if (xz7Var.G != null) {
            HashMap hashMap4 = new HashMap(xz7Var.u1);
            hashMap4.put("document_no", xz7Var.Z[7].getText().toString());
            if (iArr[r16] != 0) {
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(iArr[b]);
                Integer valueOf2 = Integer.valueOf(iArr[1]);
                Integer valueOf3 = Integer.valueOf(iArr[r16]);
                Object[] objArr2 = new Object[i];
                objArr2[r16] = valueOf;
                objArr2[1] = valueOf2;
                objArr2[b] = valueOf3;
                hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
            } else {
                hashMap4.put("expiry_date", "");
            }
            jSONObject2 = new JSONObject();
            try {
                ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                Collections.sort(arrayList2, new qx7(this, b));
                int size2 = arrayList2.size();
                for (int i7 = r16; i7 < size2; i7++) {
                    String str3 = (String) arrayList2.get(i7);
                    jSONObject2.put(str3, hashMap4.get(str3));
                }
            } catch (Exception unused3) {
            }
            hashMap = xz7Var.x1;
            if (hashMap != null) {
                hashMap.clear();
            }
            hashMap2 = xz7Var.y1;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            ez7 ez7Var = xz7Var.C1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType = xz7Var.F;
            String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = xz7Var.G;
            String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
            xw9 xw9Var2 = xz7Var.k1;
            ArrayList arrayList3 = xz7Var.l1;
            xw9 xw9Var3 = xz7Var.m1;
            linearLayout = xz7Var.g0;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                xw9Var = xz7Var.n1;
            }
            ez7Var.c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, xw9Var2, arrayList3, xw9Var3, xw9Var, kl7Var, wm4Var);
            return true;
        }
        jSONObject2 = null;
        hashMap = xz7Var.x1;
        if (hashMap != null) {
        }
        hashMap2 = xz7Var.y1;
        if (hashMap2 != null) {
        }
        ez7 ez7Var2 = xz7Var.C1;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = xz7Var.F;
        if (jSONObject == null) {
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType22 = xz7Var.G;
        if (jSONObject2 == null) {
        }
        xw9 xw9Var22 = xz7Var.k1;
        ArrayList arrayList32 = xz7Var.l1;
        xw9 xw9Var32 = xz7Var.m1;
        linearLayout = xz7Var.g0;
        if (linearLayout != null) {
            xw9Var = xz7Var.n1;
        }
        ez7Var2.c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, xw9Var22, arrayList32, xw9Var32, xw9Var, kl7Var, wm4Var);
        return true;
    }
}
