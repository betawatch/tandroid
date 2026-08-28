package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import j5.c;
import j5.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInOptions extends a implements b, ReflectedParcelable {
    public static final Scope A;
    public static final c B;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final GoogleSignInOptions v;
    public static final Scope w;
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
        w = new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        x = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        y = scope3;
        A = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(A)) {
            Scope scope4 = y;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        v = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(A)) {
            Scope scope5 = y;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new d(1);
        B = new c(1);
    }

    public GoogleSignInOptions(int i9, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, HashMap hashMap, String str3) {
        this.a = i9;
        this.b = arrayList;
        this.c = account;
        this.d = z10;
        this.e = z11;
        this.f = z12;
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
        for (int i9 = 0; i9 < length; i9++) {
            hashSet.add(new Scope(1, jSONArray.getString(i9)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap c(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                k5.a aVar = (k5.a) obj;
                hashMap.put(Integer.valueOf(aVar.b), aVar);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        String str = this.h;
        ArrayList arrayList = this.b;
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            ArrayList arrayList2 = googleSignInOptions.b;
            String str2 = googleSignInOptions.h;
            Account account = googleSignInOptions.c;
            if (this.r.isEmpty() && googleSignInOptions.r.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
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
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(((Scope) arrayList2.get(i9)).b);
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
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.p(parcel, 2, new ArrayList(this.b));
        p8.k(parcel, 3, this.c, i9);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        p8.s(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        p8.l(parcel, 7, this.h);
        p8.l(parcel, 8, this.n);
        p8.p(parcel, 9, this.r);
        p8.l(parcel, 10, this.s);
        p8.r(parcel, q10);
    }
}
