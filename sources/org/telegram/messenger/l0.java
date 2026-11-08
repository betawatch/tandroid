package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class l0 implements k0 {
    public final String a;
    public final long b;
    public long c;

    public l0(String str, long j3) {
        this.a = str;
        this.b = j3;
    }

    @Override // org.telegram.messenger.k0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
            return false;
        }
        double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
        if (d == this.c) {
            return false;
        }
        long j3 = (long) d;
        this.c = j3;
        editor.putLong(this.a, j3);
        return true;
    }

    @Override // org.telegram.messenger.k0
    public final void b(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences.getLong(this.a, this.b);
    }
}
