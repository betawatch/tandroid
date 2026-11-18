package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class h0 implements k0 {
    public final String a;
    public final boolean b;
    public boolean c;

    public h0(String str, boolean z10) {
        this.a = str;
        this.b = z10;
    }

    @Override // org.telegram.messenger.k0
    public final boolean a(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z10;
        if (!(jSONValue instanceof TLRPC.TL_jsonBool) || (z10 = ((TLRPC.TL_jsonBool) jSONValue).value) == this.c) {
            return false;
        }
        this.c = z10;
        editor.putBoolean(this.a, z10);
        return true;
    }

    @Override // org.telegram.messenger.k0
    public final void b(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences.getBoolean(this.a, this.b);
    }
}
