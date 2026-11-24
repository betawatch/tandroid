package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends b4 implements vn, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final Scope E;
    public static final Scope F;
    public static final is6 G;
    public static final GoogleSignInOptions w;
    public static final Scope x;
    public static final Scope y;
    public final int a;
    public final ArrayList b;
    public final Account c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String h;
    public final String n;
    public final ArrayList r;
    public final String s;

    static {
        Scope scope = new Scope(1, "profile");
        x = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        y = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        E = scope3;
        F = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(F)) {
            Scope scope4 = E;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        w = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(F)) {
            Scope scope5 = E;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new b1d((byte) 8);
        G = new is6((byte) 14);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, HashMap hashMap, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.h = str;
        this.n = str2;
        this.r = new ArrayList(hashMap.values());
        this.s = str3;
    }

    public static GoogleSignInOptions b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                az4 az4Var = (az4) obj;
                hashMap.put(Integer.valueOf(az4Var.b), az4Var);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.h;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList = googleSignInOptions.b;
            String str2 = googleSignInOptions.h;
            Account account = googleSignInOptions.c;
            if (!this.r.isEmpty() || !googleSignInOptions.r.isEmpty()) {
                return false;
            }
            ArrayList arrayList2 = this.b;
            if (arrayList2.size() != new ArrayList(arrayList).size() || !arrayList2.containsAll(new ArrayList(arrayList))) {
                return false;
            }
            Account account2 = this.c;
            if (account2 == null) {
                if (account != null) {
                    return false;
                }
            } else if (!account2.equals(account)) {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.f == googleSignInOptions.f && this.d == googleSignInOptions.d && this.e == googleSignInOptions.e) {
                return TextUtils.equals(this.s, googleSignInOptions.s);
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).b);
        }
        Collections.sort(arrayList);
        int hashCode = (arrayList.hashCode() + (1 * 31)) * 31;
        Account account = this.c;
        int hashCode2 = (hashCode + (account == null ? 0 : account.hashCode())) * 31;
        String str = this.h;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + (this.f ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        String str2 = this.s;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.q(parcel, 1, 4);
        parcel.writeInt(this.a);
        jte.p(parcel, 2, new ArrayList(this.b));
        jte.k(parcel, 3, this.c, i);
        jte.q(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        jte.q(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        jte.q(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        jte.l(parcel, 7, this.h);
        jte.l(parcel, 8, this.n);
        jte.p(parcel, 9, this.r);
        jte.l(parcel, 10, this.s);
        jte.s(parcel, r);
    }
}
