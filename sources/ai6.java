// default package

import android.content.SharedPreferences;
import java.util.function.LongSupplier;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class ai6 extends yr2 {
    public final LongSupplier d;
    public final long e;
    public final long f;
    public final int g;
    public volatile boolean h;
    public volatile long i;

    public ai6(String str, LongSupplier longSupplier, long j, long j2, int i) {
        super(str);
        this.d = longSupplier;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override // yr2
    public final boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue) {
        if (!(jSONValue instanceof TLRPC.TL_jsonNumber)) {
            return false;
        }
        double d = ((TLRPC.TL_jsonNumber) jSONValue).value;
        if (d != Math.rint(d) || d < -9.223372036854776E18d || d >= 9.223372036854776E18d) {
            return false;
        }
        long max = Math.max(this.e, Math.min(this.f, (long) d));
        if (max == f()) {
            return false;
        }
        this.i = max;
        this.h = true;
        editor.putLong(e(), max);
        return true;
    }

    @Override // yr2
    public final boolean c(SharedPreferences.Editor editor) {
        if (this.g == 2 && this.h) {
            long j = this.i;
            this.h = false;
            editor.remove(e());
            if (j != f()) {
                return true;
            }
        }
        return false;
    }

    @Override // yr2
    public final void d(SharedPreferences sharedPreferences) {
        try {
            if (!sharedPreferences.contains(e())) {
                this.h = false;
                return;
            }
            this.i = Math.max(this.e, Math.min(this.f, sharedPreferences.getLong(e(), 0L)));
            this.h = true;
        } catch (ClassCastException e) {
            cc4.g(e, true);
            this.h = false;
        }
    }

    public final long f() {
        if (this.h) {
            return this.i;
        }
        return Math.max(this.e, Math.min(this.f, this.d.getAsLong()));
    }
}
