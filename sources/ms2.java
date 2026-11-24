// default package

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ms2 extends qs2 {
    public final boolean d;
    public final int e;
    public volatile boolean f;

    public ms2(int i, String str, boolean z) {
        super(str);
        this.d = z;
        this.e = i;
        this.f = z;
    }

    @Override // qs2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        boolean z;
        if (!(jSONValue instanceof TLRPC.TL_jsonBool) || (z = ((TLRPC.TL_jsonBool) jSONValue).value) == this.f) {
            return false;
        }
        this.f = z;
        editor.putBoolean(e(), z);
        return true;
    }

    @Override // qs2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e != 2) {
            return false;
        }
        boolean z = this.f;
        boolean z2 = this.d;
        if (z == z2) {
            return false;
        }
        this.f = z2;
        editor.remove(e());
        return true;
    }

    @Override // qs2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            this.f = sharedPreferences.getBoolean(e(), this.d);
        } catch (ClassCastException e) {
            fc4.g(e, true);
            this.f = this.d;
        }
    }

    public final boolean f() {
        return this.f;
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}
