package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
