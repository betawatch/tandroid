package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class n0 implements k0 {
    public final String a;
    public final String b;
    public String c;

    public n0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // org.telegram.messenger.k0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonString)) {
            return false;
        }
        TLRPC.TL_jsonString tL_jsonString = (TLRPC.TL_jsonString) jSONValue;
        if (TextUtils.equals(tL_jsonString.value, this.c)) {
            return false;
        }
        String str = tL_jsonString.value;
        this.c = str;
        editor.putString(this.a, str);
        return true;
    }

    @Override // org.telegram.messenger.k0
    public final void b(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences.getString(this.a, this.b);
    }
}
