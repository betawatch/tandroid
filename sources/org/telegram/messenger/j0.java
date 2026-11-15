package org.telegram.messenger;

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class j0 implements k0 {
    public final String a;
    public final int b;
    public int c;

    public j0(String str, int i7) {
        this.a = str;
        this.b = i7;
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
        int i7 = (int) d;
        this.c = i7;
        editor.putInt(this.a, i7);
        return true;
    }

    @Override // org.telegram.messenger.k0
    public final void b(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences.getInt(this.a, this.b);
    }
}
