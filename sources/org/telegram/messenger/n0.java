package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n0 implements m0 {
    public final String a;
    public final long b;
    public long c;

    public n0(String str, long j10) {
        this.a = str;
        this.b = j10;
    }

    @Override // org.telegram.messenger.m0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
            return false;
        }
        double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
        if (d == this.c) {
            return false;
        }
        long j10 = (long) d;
        this.c = j10;
        editor.putLong(this.a, j10);
        return true;
    }

    @Override // org.telegram.messenger.m0
    public final void b(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences.getLong(this.a, this.b);
    }
}
