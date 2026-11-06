package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class h0 implements k0 {
    public final String a;
    public final boolean b;
    public boolean c;

    public h0(String str, boolean z9) {
        this.a = str;
        this.b = z9;
    }

    @Override // org.telegram.messenger.k0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z9;
        if (!(jSONValue instanceof TLRPC.TL_jsonBool) || (z9 = ((TLRPC.TL_jsonBool) jSONValue).value) == this.c) {
            return false;
        }
        this.c = z9;
        editor.putBoolean(this.a, z9);
        return true;
    }

    @Override // org.telegram.messenger.k0
    public final void b(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences.getBoolean(this.a, this.b);
    }
}
