// default package

import android.content.SharedPreferences;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class fr2 {
    public final String a;
    public String b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    public fr2(String str) {
        this.a = str;
    }

    public final void a(Runnable runnable) {
        this.c.addIfAbsent(runnable);
    }

    public abstract boolean b(SharedPreferences.Editor editor, TLRPC.JSONValue jSONValue);

    public abstract boolean c(SharedPreferences.Editor editor);

    public abstract void d(SharedPreferences sharedPreferences);

    public final String e() {
        String str = this.b;
        return str != null ? str : this.a;
    }
}
