// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class ks2 extends yr2 {
    public final String d;
    public final int e;
    public volatile String f;

    public ks2(int i, String str, String str2) {
        super(str);
        this.d = str2;
        this.e = i;
        this.f = str2;
    }

    @Override // yr2
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

    @Override // yr2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e != 2 || TextUtils.equals(this.f, this.d)) {
            return false;
        }
        this.f = this.d;
        editor.remove(e());
        return true;
    }

    @Override // yr2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            this.f = sharedPreferences.getString(e(), this.d);
        } catch (ClassCastException e) {
            cc4.g(e, true);
            this.f = this.d;
        }
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}
