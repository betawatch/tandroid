// default package

import android.content.SharedPreferences;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class hr2 extends fr2 {
    public final float d;
    public final int e;
    public volatile float f;

    public hr2(String str, int i, float f) {
        super(str);
        this.d = f;
        this.e = i;
        this.f = f;
    }

    @Override // fr2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
            return false;
        }
        float f = (float) ((TLRPC.TL_jsonNumber) jSONValue).value;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return false;
        }
        float max = Math.max(-3.4028235E38f, Math.min(Float.MAX_VALUE, f));
        if (max == this.f) {
            return false;
        }
        this.f = max;
        editor.putFloat(e(), max);
        return true;
    }

    @Override // fr2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.e != 2) {
            return false;
        }
        float f = this.f;
        float f2 = this.d;
        if (f == f2) {
            return false;
        }
        this.f = f2;
        editor.remove(e());
        return true;
    }

    @Override // fr2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            this.f = Math.max(-3.4028235E38f, Math.min(Float.MAX_VALUE, sharedPreferences.getFloat(e(), this.d)));
        } catch (ClassCastException e) {
            fa4.g(e, true);
            this.f = this.d;
        }
    }

    public final float f() {
        return this.f;
    }

    public final String toString() {
        return this.a + "=" + this.f;
    }
}
