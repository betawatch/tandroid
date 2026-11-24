// default package

import android.content.SharedPreferences;
import java.util.function.IntSupplier;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class kr2 extends fr2 {
    public final IntSupplier d;
    public final int e;
    public final int f;
    public final int g;
    public volatile boolean h;
    public volatile int i;

    public kr2(String str, IntSupplier intSupplier, int i, int i2, int i3) {
        super(str);
        this.d = intSupplier;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // fr2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
            return false;
        }
        double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
        if (d != Math.rint(d) || d < -2.147483648E9d || d > 2.147483647E9d) {
            return false;
        }
        int max = Math.max(this.e, Math.min(this.f, (int) d));
        if (max == f()) {
            return false;
        }
        this.i = max;
        this.h = true;
        editor.putInt(e(), max);
        return true;
    }

    @Override // fr2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.g == 2 && this.h) {
            int i = this.i;
            this.h = false;
            editor.remove(e());
            if (i != f()) {
                return true;
            }
        }
        return false;
    }

    @Override // fr2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            if (!sharedPreferences.contains(e())) {
                this.h = false;
                return;
            }
            this.i = Math.max(this.e, Math.min(this.f, sharedPreferences.getInt(e(), 0)));
            this.h = true;
        } catch (ClassCastException e) {
            fa4.g(e, true);
            this.h = false;
        }
    }

    public final int f() {
        if (this.h) {
            return this.i;
        }
        return Math.max(this.e, Math.min(this.f, this.d.getAsInt()));
    }

    public final String toString() {
        return this.a + "=" + f();
    }
}
