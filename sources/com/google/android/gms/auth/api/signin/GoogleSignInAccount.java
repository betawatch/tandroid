package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c8.xb;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import q6.m;
import r6.a;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
@Deprecated
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new w.a(23);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public String f;
    public final long h;
    public final String n;
    public final List r;
    public final String s;
    public final String w;
    public final HashSet x = new HashSet();

    public GoogleSignInAccount(String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.h = j3;
        this.n = str6;
        this.r = arrayList;
        this.s = str7;
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
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(1, jSONArray.getString(i7)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        m.e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(optString2, optString3, optString4, optString5, parse, null, parseLong, string, new ArrayList(hashSet), optString6, optString7);
        googleSignInAccount.f = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
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
        if (!googleSignInAccount.n.equals(this.n)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.r);
        hashSet.addAll(googleSignInAccount.x);
        HashSet hashSet2 = new HashSet(this.r);
        hashSet2.addAll(this.x);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int hashCode = this.n.hashCode() + 527;
        HashSet hashSet = new HashSet(this.r);
        hashSet.addAll(this.x);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.l(parcel, 4, this.c);
        xb.l(parcel, 5, this.d);
        xb.k(parcel, 6, this.e, i7);
        xb.l(parcel, 7, this.f);
        xb.q(parcel, 8, 8);
        parcel.writeLong(this.h);
        xb.l(parcel, 9, this.n);
        xb.p(parcel, 10, this.r);
        xb.l(parcel, 11, this.s);
        xb.l(parcel, 12, this.w);
        xb.s(parcel, r10);
    }
}
