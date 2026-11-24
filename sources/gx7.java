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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gx7 extends c6 {
    public final /* synthetic */ vx7 a;

    public gx7(vx7 vx7Var) {
        this.a = vx7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020c  */
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
        vx7 vx7Var = this.a;
        int i6 = vx7Var.b;
        if (i == -1) {
            if (vx7Var.N0(true)) {
                return;
            }
            if (i6 == 0 || i6 == 5) {
                vx7Var.M0(false);
            }
            vx7Var.finishFragment();
            return;
        }
        if (i == 1) {
            if (vx7Var.getParentActivity() != null) {
                l46 l46Var = new l46(vx7Var.getParentActivity(), null);
                String M0 = k96.M0(2131747366, null);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                int indexOf = M0.indexOf(42);
                int lastIndexOf = M0.lastIndexOf(42);
                if (indexOf != -1 && lastIndexOf != -1) {
                    spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new ui((byte) 2, this, k96.M0(2131747364, null)), indexOf, lastIndexOf - 1, 33);
                }
                l46Var.setText(spannableStringBuilder);
                l46Var.setTextSize(1, 16.0f);
                zkb.G(l46Var, bkb.j5, null);
                zkb.C(l46Var, bkb.k5, null);
                l46Var.setPadding(gl.L(23.0f), 0, gl.L(23.0f), 0);
                l46Var.setMovementMethod(new cl((byte) 0));
                zkb.X(l46Var, bkb.i5, null);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vx7Var.getParentActivity());
                alertDialog$Builder.n(l46Var);
                String M02 = k96.M0(2131747365, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M02;
                alertDialog$Builder.g(k96.M0(2131752029, null), null);
                vx7Var.showDialog(hdVar);
                return;
            }
            return;
        }
        if (i == 2) {
            if (i6 == 5) {
                vx7Var.D1(false);
                return;
            }
            if (i6 == 7) {
                vx7Var.K1[vx7Var.J1].h(null);
                return;
            }
            oq7 oq7Var = new oq7(this, (byte) 7);
            wk4 wk4Var = new wk4(this, oq7Var, false, (byte) 16);
            if (i6 == 4) {
                if (vx7Var.f) {
                    obj = vx7Var.e1;
                } else if (vx7Var.P0()) {
                    return;
                } else {
                    obj = vx7Var.Z[0].getText().toString();
                }
                vx7Var.C1.c(vx7Var.F, obj, null, null, null, null, null, null, null, null, oq7Var, wk4Var);
            } else if (i6 == 3) {
                if (vx7Var.f) {
                    i5 = ((d) vx7Var).currentAccount;
                    str = y6c.h(i5).f().phone;
                } else {
                    if (vx7Var.P0()) {
                        return;
                    }
                    str = vx7Var.Z[1].getText().toString() + vx7Var.Z[2].getText().toString();
                }
                vx7Var.C1.c(vx7Var.F, str, null, null, null, null, null, null, null, null, oq7Var, wk4Var);
            } else if (i6 == 2) {
                if (!vx7Var.p1.isEmpty() || vx7Var.P0()) {
                    return;
                }
                String str2 = vx7Var.a;
                if (str2 == null || str2.equals(vx7Var.e1())) {
                    vx7Var.finishFragment();
                    return;
                }
                if (!vx7Var.w0) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("street_line1", vx7Var.Z[0].getText().toString());
                        jSONObject.put("street_line2", vx7Var.Z[1].getText().toString());
                        jSONObject.put("post_code", vx7Var.Z[2].getText().toString());
                        jSONObject.put("city", vx7Var.Z[3].getText().toString());
                        jSONObject.put("state", vx7Var.Z[4].getText().toString());
                        jSONObject.put("country_code", vx7Var.s);
                    } catch (Exception unused) {
                    }
                    hashMap = vx7Var.x1;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    hashMap2 = vx7Var.y1;
                    if (hashMap2 != null) {
                        hashMap2.clear();
                    }
                    vx7Var.C1.c(vx7Var.F, null, jSONObject != null ? jSONObject.toString() : null, vx7Var.G, null, vx7Var.j1, vx7Var.k1, vx7Var.l1, null, null, oq7Var, wk4Var);
                }
                jSONObject = null;
                hashMap = vx7Var.x1;
                if (hashMap != null) {
                }
                hashMap2 = vx7Var.y1;
                if (hashMap2 != null) {
                }
                vx7Var.C1.c(vx7Var.F, null, jSONObject != null ? jSONObject.toString() : null, vx7Var.G, null, vx7Var.j1, vx7Var.k1, vx7Var.l1, null, null, oq7Var, wk4Var);
            } else if (i6 == 1) {
                if (!c(oq7Var, wk4Var)) {
                    return;
                }
            } else if (i6 == 6) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = vx7Var.Z[0].getText().toString();
                verifyemail.verification = tL_emailVerificationCode;
                i2 = ((d) vx7Var).currentAccount;
                int sendRequest = ConnectionsManager.getInstance(i2).sendRequest(verifyemail, new rt0(this, oq7Var, wk4Var, verifyemail, (byte) 13));
                i3 = ((d) vx7Var).currentAccount;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                i4 = ((d) vx7Var).classGuid;
                connectionsManager.bindRequestToGuid(sendRequest, i4);
            }
            vx7Var.P1(true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0308  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(oq7 oq7Var, wk4 wk4Var) {
        byte b;
        int i;
        char c;
        byte b2;
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
        vx7 vx7Var = this.a;
        int[] iArr = vx7Var.y;
        boolean[] zArr = vx7Var.u0;
        char c4 = 0;
        if (!vx7Var.p1.isEmpty() || vx7Var.P0()) {
            return false;
        }
        int i4 = 3;
        char c5 = 2;
        uu9 uu9Var = null;
        ?? r15 = 1;
        if (vx7Var.v0) {
            vx7Var.v0 = false;
            int i5 = 0;
            boolean z2 = false;
            while (i5 < zArr.length) {
                if (zArr[i5]) {
                    vx7Var.Z[i5].setErrorText(k96.M0(2131747256, null));
                    if (!z2) {
                        String S0 = zArr[c4] ? k96.D0().S0(vx7Var.b0[c4].getText().toString(), r15, r15) : vx7Var.Z[c4].getText().toString();
                        String S02 = zArr[r15] ? k96.D0().S0(vx7Var.b0[r15].getText().toString(), r15, r15) : vx7Var.Z[r15].getText().toString();
                        String S03 = zArr[c5] ? k96.D0().S0(vx7Var.b0[c5].getText().toString(), r15, r15) : vx7Var.Z[c5].getText().toString();
                        if (TextUtils.isEmpty(S0) || TextUtils.isEmpty(S02) || TextUtils.isEmpty(S03)) {
                            c2 = c4;
                            i2 = i4;
                            c3 = c5;
                            z = r15;
                            i3 = i5;
                            vx7Var.B1(vx7Var.Z[i3]);
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vx7Var.getParentActivity());
                            Object[] objArr = new Object[i4];
                            objArr[c4] = S0;
                            objArr[r15] = S02;
                            objArr[c5] = S03;
                            c3 = c5;
                            String a0 = k96.a0("PassportNameCheckAlert", null, 2131747310, objArr);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.U = a0;
                            hdVar.S = k96.M0(R.string.AppName, null);
                            c2 = c4;
                            z = r15;
                            i3 = i5;
                            i2 = i4;
                            alertDialog$Builder.j(k96.M0(2131751342, null), new zd(this, S0, S02, S03, oq7Var, wk4Var, (byte) 4));
                            alertDialog$Builder.g(k96.M0(2131751323, null), new jh(this, i3, (byte) 16));
                            vx7Var.showDialog(hdVar);
                        }
                        z2 = z;
                        i5 = i3 + 1;
                        c5 = c3;
                        i4 = i2;
                        r15 = z;
                        c4 = c2;
                    }
                }
                c2 = c4;
                i2 = i4;
                c3 = c5;
                z = r15;
                i3 = i5;
                i5 = i3 + 1;
                c5 = c3;
                i4 = i2;
                r15 = z;
                c4 = c2;
            }
            boolean z3 = c4;
            i = i4;
            c = c5;
            b2 = r15;
            b = z3;
            if (z2) {
                return z3;
            }
        } else {
            b = 0;
            i = 3;
            c = 2;
            b2 = 1;
        }
        String str = vx7Var.a;
        if (str == null || str.equals(vx7Var.e1())) {
            vx7Var.finishFragment();
            return false;
        }
        try {
            if (vx7Var.w0) {
                jSONObject = null;
            } else {
                HashMap hashMap3 = new HashMap(vx7Var.t1);
                if (vx7Var.F.native_names) {
                    if (vx7Var.r0.getVisibility() == 0) {
                        hashMap3.put("first_name_native", vx7Var.b0[b].getText().toString());
                        hashMap3.put("middle_name_native", vx7Var.b0[b2].getText().toString());
                        hashMap3.put("last_name_native", vx7Var.b0[c].getText().toString());
                    } else {
                        hashMap3.put("first_name_native", vx7Var.Z[b].getText().toString());
                        hashMap3.put("middle_name_native", vx7Var.Z[b2].getText().toString());
                        hashMap3.put("last_name_native", vx7Var.Z[c].getText().toString());
                    }
                }
                hashMap3.put("first_name", vx7Var.Z[b].getText().toString());
                hashMap3.put("middle_name", vx7Var.Z[b2].getText().toString());
                hashMap3.put("last_name", vx7Var.Z[c].getText().toString());
                hashMap3.put("birth_date", vx7Var.Z[i].getText().toString());
                hashMap3.put("gender", vx7Var.x);
                hashMap3.put("country_code", vx7Var.s);
                hashMap3.put("residence_country_code", vx7Var.w);
                jSONObject = new JSONObject();
                try {
                    ArrayList arrayList = new ArrayList(hashMap3.keySet());
                    Collections.sort(arrayList, new fx7(this, b));
                    int size = arrayList.size();
                    for (int i6 = 0; i6 < size; i6++) {
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
        if (vx7Var.G != null) {
            HashMap hashMap4 = new HashMap(vx7Var.u1);
            hashMap4.put("document_no", vx7Var.Z[7].getText().toString());
            if (iArr[0] != 0) {
                Locale locale = Locale.US;
                Integer valueOf = Integer.valueOf(iArr[c]);
                Integer valueOf2 = Integer.valueOf(iArr[b2]);
                Integer valueOf3 = Integer.valueOf(iArr[0]);
                Object[] objArr2 = new Object[i];
                objArr2[0] = valueOf;
                objArr2[b2] = valueOf2;
                objArr2[c] = valueOf3;
                hashMap4.put("expiry_date", String.format(locale, "%02d.%02d.%d", objArr2));
            } else {
                hashMap4.put("expiry_date", "");
            }
            jSONObject2 = new JSONObject();
            try {
                ArrayList arrayList2 = new ArrayList(hashMap4.keySet());
                Collections.sort(arrayList2, new fx7(this, b2));
                int size2 = arrayList2.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    String str3 = (String) arrayList2.get(i7);
                    jSONObject2.put(str3, hashMap4.get(str3));
                }
            } catch (Exception unused3) {
            }
            hashMap = vx7Var.x1;
            if (hashMap != null) {
                hashMap.clear();
            }
            hashMap2 = vx7Var.y1;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            bx7 bx7Var = vx7Var.C1;
            TLRPC.TL_secureRequiredType tL_secureRequiredType = vx7Var.F;
            String jSONObject3 = jSONObject == null ? jSONObject.toString() : null;
            TLRPC.TL_secureRequiredType tL_secureRequiredType2 = vx7Var.G;
            String jSONObject4 = jSONObject2 == null ? jSONObject2.toString() : null;
            uu9 uu9Var2 = vx7Var.k1;
            ArrayList arrayList3 = vx7Var.l1;
            uu9 uu9Var3 = vx7Var.m1;
            linearLayout = vx7Var.g0;
            if (linearLayout != null && linearLayout.getVisibility() == 0) {
                uu9Var = vx7Var.n1;
            }
            bx7Var.c(tL_secureRequiredType, null, jSONObject3, tL_secureRequiredType2, jSONObject4, null, uu9Var2, arrayList3, uu9Var3, uu9Var, oq7Var, wk4Var);
            return true;
        }
        jSONObject2 = null;
        hashMap = vx7Var.x1;
        if (hashMap != null) {
        }
        hashMap2 = vx7Var.y1;
        if (hashMap2 != null) {
        }
        bx7 bx7Var2 = vx7Var.C1;
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = vx7Var.F;
        if (jSONObject == null) {
        }
        TLRPC.TL_secureRequiredType tL_secureRequiredType22 = vx7Var.G;
        if (jSONObject2 == null) {
        }
        uu9 uu9Var22 = vx7Var.k1;
        ArrayList arrayList32 = vx7Var.l1;
        uu9 uu9Var32 = vx7Var.m1;
        linearLayout = vx7Var.g0;
        if (linearLayout != null) {
            uu9Var = vx7Var.n1;
        }
        bx7Var2.c(tL_secureRequiredType3, null, jSONObject3, tL_secureRequiredType22, jSONObject4, null, uu9Var22, arrayList32, uu9Var32, uu9Var, oq7Var, wk4Var);
        return true;
    }
}
