package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l0 implements m0 {
    public final String a;
    public final int b;
    public int c;

    public l0(String str, int i10) {
        this.a = str;
        this.b = i10;
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
        int i10 = (int) d;
        this.c = i10;
        editor.putInt(this.a, i10);
        return true;
    }

    @Override // org.telegram.messenger.m0
    public final void b(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences.getInt(this.a, this.b);
    }
}
