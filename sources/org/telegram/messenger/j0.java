package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class j0 implements m0 {
    public final String a;
    public final boolean b;
    public boolean c;

    public j0(String str, boolean z10) {
        this.a = str;
        this.b = z10;
    }

    @Override // org.telegram.messenger.m0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if (!(jSONValue instanceof TLRPC.TL_jsonBool) || (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) == this.c) {
            return false;
        }
        this.c = z10;
        editor.putBoolean(this.a, z10);
        return true;
    }

    @Override // org.telegram.messenger.m0
    public final void b(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences.getBoolean(this.a, this.b);
    }
}
