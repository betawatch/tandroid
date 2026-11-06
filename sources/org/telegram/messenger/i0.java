package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i0 implements k0 {
    public double a;

    @Override // org.telegram.messenger.k0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
            return false;
        }
        double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
        if (d == this.a) {
            return false;
        }
        this.a = d;
        editor.putFloat("ton_usd_rate", (float) d);
        return true;
    }

    @Override // org.telegram.messenger.k0
    public final void b(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences.getFloat("ton_usd_rate", (float) 3.0d);
    }
}
