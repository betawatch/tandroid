package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b6.m;
import c6.a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.f5;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import n5.d;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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

    public GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, ArrayList arrayList, String str7, String str8) {
        this.a = i10;
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

    public static GoogleSignInAccount e(String str) {
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
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(1, jSONArray.getString(i10)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        m.f(string);
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
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        f5.l(parcel, 2, this.b);
        f5.l(parcel, 3, this.c);
        f5.l(parcel, 4, this.d);
        f5.l(parcel, 5, this.e);
        f5.k(parcel, 6, this.f, i10);
        f5.l(parcel, 7, this.h);
        f5.s(parcel, 8, 8);
        parcel.writeLong(this.n);
        f5.l(parcel, 9, this.r);
        f5.p(parcel, 10, this.s);
        f5.l(parcel, 11, this.v);
        f5.l(parcel, 12, this.w);
        f5.r(parcel, q10);
    }
}
