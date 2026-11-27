// default package

import android.content.SharedPreferences;
import java.util.function.IntSupplier;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ds2 extends yr2 {
    public final IntSupplier d;
    public final int e;
    public final int f;
    public final Integer g;
    public final int h;
    public volatile boolean i;
    public volatile int j;

    public ds2(String str, IntSupplier intSupplier, int i, int i2, Integer num, int i3) {
        super(str);
        this.d = intSupplier;
        this.e = i;
        this.f = i2;
        this.g = num;
        this.h = i3;
    }

    @Override // yr2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        double d;
        if (jSONValue instanceof TLRPC.TL_jsonNumber) {
            d = ((TLRPC.TL_jsonNumber) jSONValue).value;
        } else {
            if (this.g == null) {
                return false;
            }
            if (!(jSONValue instanceof TLRPC.TL_jsonBool)) {
                return c(editor);
            }
            d = ((TLRPC.TL_jsonBool) jSONValue).value ? r0.intValue() : 0.0d;
        }
        if (d != Math.rint(d) || d < -2.147483648E9d || d > 2.147483647E9d) {
            return false;
        }
        int max = Math.max(this.e, Math.min(this.f, (int) d));
        if (max == f()) {
            return false;
        }
        this.j = max;
        this.i = true;
        editor.putInt(e(), max);
        return true;
    }

    @Override // yr2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.h == 2 && this.i) {
            int i = this.j;
            this.i = false;
            editor.remove(e());
            if (i != f()) {
                return true;
            }
        }
        return false;
    }

    @Override // yr2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            if (!sharedPreferences.contains(e())) {
                this.i = false;
                return;
            }
            this.j = Math.max(this.e, Math.min(this.f, sharedPreferences.getInt(e(), 0)));
            this.i = true;
        } catch (ClassCastException e) {
            cc4.g(e, true);
            this.i = false;
        }
    }

    public final int f() {
        if (this.i) {
            return this.j;
        }
        return Math.max(this.e, Math.min(this.f, this.d.getAsInt()));
    }

    public final String toString() {
        return this.a + "=" + f();
    }
}
