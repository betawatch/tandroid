// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ct2 extends qs2 {
    public final String d;
    public final int e;
    public volatile String f;

    public ct2(int i, String str, String str2) {
        super(str);
        this.d = str2;
        this.e = i;
        this.f = str2;
    }

    @Override // qs2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonString)) {
            return false;
        }
        String str = ((TLRPC.TL_jsonString) jSONValue).value;
        if (TextUtils.equals(str, this.f)) {
            return false;
        }
        this.f = str;
        editor.putString(e(), str);
        return true;
    }

    @Override // qs2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e != 2 || TextUtils.equals(this.f, this.d)) {
            return false;
        }
        this.f = this.d;
        editor.remove(e());
        return true;
    }

    @Override // qs2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            this.f = sharedPreferences.getString(e(), this.d);
        } catch (ClassCastException e) {
            fc4.g(e, true);
            this.f = this.d;
        }
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}
