package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import j5.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import x5.l;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new d(0);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public String h;
    public final long n;
    public final String r;
    public final List s;
    public final String v;
    public final String w;
    public final HashSet x = new HashSet();

    public GoogleSignInAccount(int i9, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = i9;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.h = str5;
        this.n = j10;
        this.r = str6;
        this.s = arrayList;
        this.v = str7;
        this.w = str8;
    }

    public static GoogleSignInAccount b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            hashSet.add(new Scope(1, jSONArray.getString(i9)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        l.f(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.h = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.r.equals(this.r)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.s);
        hashSet.addAll(googleSignInAccount.x);
        HashSet hashSet2 = new HashSet(this.s);
        hashSet2.addAll(this.x);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() + 527;
        HashSet hashSet = new HashSet(this.s);
        hashSet.addAll(this.x);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        p8.l(parcel, 2, this.b);
        p8.l(parcel, 3, this.c);
        p8.l(parcel, 4, this.d);
        p8.l(parcel, 5, this.e);
        p8.k(parcel, 6, this.f, i9);
        p8.l(parcel, 7, this.h);
        p8.s(parcel, 8, 8);
        parcel.writeLong(this.n);
        p8.l(parcel, 9, this.r);
        p8.p(parcel, 10, this.s);
        p8.l(parcel, 11, this.v);
        p8.l(parcel, 12, this.w);
        p8.r(parcel, q10);
    }
}
