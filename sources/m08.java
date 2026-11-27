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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m08 extends d6 {
    public final /* synthetic */ b18 a;

    public m08(b18 b18Var) {
        this.a = b18Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e  */
    @Override // d6
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
        b18 b18Var = this.a;
        int i6 = b18Var.b;
        if (i == -1) {
            if (b18Var.O0(true)) {
                return;
            }
            if (i6 == 0 || i6 == 5) {
                b18Var.N0(false);
            }
            b18Var.finishFragment();
            return;
        }
        if (i == 1) {
            if (b18Var.getParentActivity() != null) {
                p66 p66Var = new p66(b18Var.getParentActivity(), null);
                String M0 = ob6.M0(2131747286, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                int indexOf = M0.indexOf(42);
                int lastIndexOf = M0.lastIndexOf(42);
                if (indexOf != -1 && lastIndexOf != -1) {
                    spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new vi((byte) 2, this, ob6.M0(2131747284, null)), indexOf, lastIndexOf - 1, 33);
                }
                p66Var.setText(spannableStringBuilder);
                p66Var.setTextSize(1, 16.0f);
                yob.G(p66Var, aob.k5, null);
                yob.C(p66Var, aob.l5, null);
                p66Var.setPadding(hl.L(23.0f), 0, hl.L(23.0f), 0);
                p66Var.setMovementMethod(new dl((byte) 0));
                yob.X(p66Var, aob.j5, null);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b18Var.getParentActivity());
                alertDialog$Builder.n(p66Var);
                String M02 = ob6.M0(2131747285, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M02;
                alertDialog$Builder.g(ob6.M0(2131752006, null), null);
                b18Var.showDialog(idVar);
                return;
            }
            return;
        }
        if (i == 2) {
            if (i6 == 5) {
                b18Var.E1(false);
                return;
            }
            if (i6 == 7) {
                b18Var.K1[b18Var.J1].h(null);
                return;
            }
            fe7 fe7Var = new fe7(this, (byte) 22);
            um4 um4Var = new um4(this, fe7Var, false, (byte) 17);
            if (i6 == 4) {
                if (b18Var.f) {
                    obj = b18Var.e1;
                } else if (b18Var.Q0()) {
                    return;
                } else {
                    obj = b18Var.Z[0].getText().toString();
                }
                b18Var.C1.c(b18Var.F, obj, null, null, null, null, null, null, null, null, fe7Var, um4Var);
            } else if (i6 == 3) {
                if (b18Var.f) {
                    i5 = ((e) b18Var).currentAccount;
                    str = yac.h(i5).f().phone;
                } else {
                    if (b18Var.Q0()) {
                        return;
                    }
                    str = b18Var.Z[1].getText().toString() + b18Var.Z[2].getText().toString();
                }
                b18Var.C1.c(b18Var.F, str, null, null, null, null, null, null, null, null, fe7Var, um4Var);
            } else if (i6 == 2) {
                if (!b18Var.p1.isEmpty() || b18Var.Q0()) {
                    return;
                }
                String str2 = b18Var.a;
                if (str2 == null || str2.equals(b18Var.f1())) {
                    b18Var.finishFragment();
                    return;
                }
                if (!b18Var.w0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", b18Var.Z[0].getText().toString());
                        jSONObject.put("street_line2", b18Var.Z[1].getText().toString());
                        jSONObject.put("post_code", b18Var.Z[2].getText().toString());
                        jSONObject.put("city", b18Var.Z[3].getText().toString());
                        jSONObject.put("state", b18Var.Z[4].getText().toString());
                        jSONObject.put("country_code", b18Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = b18Var.x1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = b18Var.y1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    b18Var.C1.c(b18Var.F, null, jSONObject != null ? jSONObject.toString() : null, b18Var.G, null, b18Var.j1, b18Var.k1, b18Var.l1, null, null, fe7Var, um4Var);
                }
                jSONObject = null;
                hashMap = b18Var.x1;
                if (hashMap != null) {
                }
                hashMap2 = b18Var.y1;
                if (hashMap2 != null) {
                }
                b18Var.C1.c(b18Var.F, null, jSONObject != null ? jSONObject.toString() : null, b18Var.G, null, b18Var.j1, b18Var.k1, b18Var.l1, null, null, fe7Var, um4Var);
            } else if (i6 == 1) {
                if (!c(fe7Var, um4Var)) {
                    return;
                }
            } else if (i6 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = b18Var.Z[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i2 = ((e) b18Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(verifyemail, new au0(this, fe7Var, um4Var, verifyemail, (byte) 13));
                i3 = ((e) b18Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                i4 = ((e) b18Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i4);
            }
            b18Var.Q1(true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0304  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(fe7 fe7Var, um4 um4Var) {
        ?? r16;
        int i;
        char c;
        ?? r17;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        HashMap hashMap;
        HashMap hashMap2;
        LinearLayout linearLayout;
        char c2;
        int i2;
        char c3;
        boolean z;
        int i3;
        b18 b18Var = this.a;
        int[] iArr = b18Var.y;
        boolean[] zArr = b18Var.u0;
        char c4 = 0;
        if (!b18Var.p1.isEmpty() || b18Var.Q0()) {
            return false;
        }
        int i4 = 3;
        char c5 = 2;
        oy9 oy9Var = null;
        ?? r15 = 1;
        if (b18Var.v0) {
            b18Var.v0 = false;
            int i5 = 0;
            boolean z2 = false;
            while (i5 < zArr.length) {
                if (zArr[i5]) {
                    b18Var.Z[i5].setErrorText(ob6.M0(2131747176, null));
                    if (!z2) {
                        String S0 = zArr[c4] ? ob6.D0().S0(b18Var.b0[c4].getText().toString(), r15, r15) : b18Var.Z[c4].getText().toString();
                        String S02 = zArr[r15] ? ob6.D0().S0(b18Var.b0[r15].getText().toString(), r15, r15) : b18Var.Z[r15].getText().toString();
                        String S03 = zArr[c5] ? ob6.D0().S0(b18Var.b0[c5].getText().toString(), r15, r15) : b18Var.Z[c5].getText().toString();
                        if (TextUtils.isEmpty(S0) || TextUtils.isEmpty(S02) || TextUtils.isEmpty(S03)) {
                            c2 = c4;
                            i2 = i4;
                            c3 = c5;
                            z = r15;
                            i3 = i5;
                            b18Var.C1(b18Var.Z[i3]);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b18Var.getParentActivity());
                            Object[] objArr = new Object[i4];
                            objArr[c4] = S0;
                            objArr[r15] = S02;
                            objArr[c5] = S03;
                            c2 = c4;
                            String a0 = ob6.a0("PassportNameCheckAlert", null, 2131747230, objArr);
                            id idVar = alertDialog$Builder.a;
                            idVar.U = a0;
                            idVar.S = ob6.M0(R.string.AppName, null);
                            i2 = i4;
                            c3 = c5;
                            i3 = i5;
                            z = r15;
                            alertDialog$Builder.j(ob6.M0(2131751319, null), new kh(this, S0, S02, S03, fe7Var, um4Var, (byte) 4));
                            alertDialog$Builder.g(ob6.M0(2131751300, null), new wg(this, i3, (byte) 17));
                            b18Var.showDialog(idVar);
                        }
                        z2 = z;
                        i5 = i3 + 1;
                        c4 = c2;
                        r15 = z;
                        c5 = c3;
                        i4 = i2;
                        z2 = z2;
                    }
                }
                c2 = c4;
                i2 = i4;
                c3 = c5;
                z = r15;
                i3 = i5;
                i5 = i3 + 1;
                c4 = c2;
                r15 = z;
                c5 = c3;
                i4 = i2;
                z2 = z2;
            }
            boolean z3 = c4;
            i = i4;
            c = c5;
            r17 = r15;
            r16 = z3;
            if (z2) {
                return z3;
            }
        } else {
            r16 = 0;
            i = 3;
            c = 2;
            r17 = 1;
        }
        String str = b18Var.a;
        if (str == null || str.equals(b18Var.f1())) {
            b18Var.finishFragment();
            return r16;
        }
        try {
            if (b18Var.w0) {
                jSONObject = null;
            } else {
                HashMap hashMap3 = new HashMap(b18Var.t1);
                if (b18Var.F.native_names) {
                    if (b18Var.r0.getVisibility() == 0) {
                        hashMap3.put("first_name_native", b18Var.b0[r16].getText().toString());
                        hashMap3.put("middle_name_native", b18Var.b0[r17].getText().toString());
                        hashMap3.put("last_name_native", b18Var.b0[c].getText().toString());
                    } else {
                        hashMap3.put("first_name_native", b18Var.Z[r16].getText().toString());
                        hashMap3.put("middle_name_native", b18Var.Z[r17].getText().toString());
                        hashMap3.put("last_name_native", b18Var.Z[c].getText().toString());
                    }
                }
                hashMap3.put("first_name", b18Var.Z[r16].getText().toString());
                hashMap3.put("middle_name", b18Var.Z[r17].getText().toString());
                hashMap3.put("last_name", b18Var.Z[c].getText().toString());
                hashMap3.put("birth_date", b18Var.Z[i].getText().toString());
                hashMap3.put("gender", b18Var.x);
                hashMap3.put("country_code", b18Var.s);
                hashMap3.put("residence_country_code", b18Var.w);
                jSONObject = new JSONObject();
                try {
                    ArrayList arrayList = new ArrayList(hashMap3.keySet());
                    Collections.sort(arrayList, new qq7(this, i == true ? (byte) 1 : (byte) 0));
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
        if (b18Var.G != null) {
            HashMap hashMap4 = new HashMap(b18Var.u1);
            hashMap4.put("document_no", b18Var.Z[7].getText().toString());
            if (iArr[r16] != 0) {
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(iArr[c]);
                Integer valueOf2 = Integer.valueOf(iArr[r17]);
                Integer valueOf3 = Integer.valueOf(iArr[r16]);
                Object[] objArr2 = new Object[3];
                objArr2[r16] = valueOf;
                objArr2[r17] = valueOf2;
                objArr2[c] = valueOf3;
                hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
            } else {
                hashMap4.put("expiry_date", "");
            }
            jSONObject2 = new JSONObject();
            try {
                ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                Collections.sort(arrayList2, new qq7(this, (byte) 4));
                int size2 = arrayList2.size();
                for (int i7 = r16; i7 < size2; i7++) {
                    String str3 = (String) arrayList2.get(i7);
                    jSONObject2.put(str3, hashMap4.get(str3));
                }
            } catch (Exception unused3) {
            }
            hashMap = b18Var.x1;
            if (hashMap != null) {
                hashMap.clear();
            }
            hashMap2 = b18Var.y1;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            j08 j08Var = b18Var.C1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType = b18Var.F;
            String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = b18Var.G;
            String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
            oy9 oy9Var2 = b18Var.k1;
            ArrayList arrayList3 = b18Var.l1;
            oy9 oy9Var3 = b18Var.m1;
            linearLayout = b18Var.g0;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                oy9Var = b18Var.n1;
            }
            j08Var.c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, oy9Var2, arrayList3, oy9Var3, oy9Var, fe7Var, um4Var);
            return r17;
        }
        jSONObject2 = null;
        hashMap = b18Var.x1;
        if (hashMap != null) {
        }
        hashMap2 = b18Var.y1;
        if (hashMap2 != null) {
        }
        j08 j08Var2 = b18Var.C1;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = b18Var.F;
        if (jSONObject == null) {
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType22 = b18Var.G;
        if (jSONObject2 == null) {
        }
        oy9 oy9Var22 = b18Var.k1;
        ArrayList arrayList32 = b18Var.l1;
        oy9 oy9Var32 = b18Var.m1;
        linearLayout = b18Var.g0;
        if (linearLayout != null) {
            oy9Var = b18Var.n1;
        }
        j08Var2.c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, oy9Var22, arrayList32, oy9Var32, oy9Var, fe7Var, um4Var);
        return r17;
    }
}
