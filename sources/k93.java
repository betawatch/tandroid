// default package

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.scilab.forge.jlatexmath.XMLResourceParseException;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class k93 implements x56, aq2, ed, wkb, xkb, xq3, nq4, js4, Vector.TLDeserializer, yyb {
    public final /* synthetic */ byte a;

    public /* synthetic */ k93(c44 c44Var) {
        this.a = (byte) 28;
    }

    public static /* synthetic */ void c(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void f(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void g(String str, String str2, String str3, String str4) {
        throw new XMLResourceParseException(str, str2, str3, str4);
    }

    public static /* synthetic */ void h(String str, Throwable th) {
        throw new IllegalStateException(str, th);
    }

    public static /* synthetic */ void i(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    @Override // aq2
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 8:
                Set O = gl2Var.O(y90.class);
                qx4 qx4Var = qx4.b;
                if (qx4Var == null) {
                    synchronized (qx4.class) {
                        qx4Var = qx4.b;
                        if (qx4Var == null) {
                            qx4Var = new qx4((byte) 0);
                            qx4.b = qx4Var;
                        }
                    }
                }
                return new tc3(O, qx4Var);
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
        }
    }

    @Override // nq4
    public final m21 a(u21 u21Var) {
        return u21Var.k(false);
    }

    @Override // yyb
    public final Object apply(Object obj) {
        c6a c6aVar = (c6a) obj;
        String q = d6a.b.q(c6aVar);
        q.getClass();
        c6aVar.getClass();
        Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
        byte[] bytes = q.getBytes(bk1.a);
        bytes.getClass();
        return bytes;
    }

    public final Constructor b() {
        switch (this.a) {
            case 4:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(j74.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(j74.class).getConstructor(null);
        }
    }

    @Override // xkb
    public final void d(int i, View view) {
        Drawable background = view.getBackground();
        if (background instanceof fm2) {
            Drawable drawable = ((fm2) background).a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(i);
                view.invalidate();
            }
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i, z);
    }

    @Override // wkb
    public final int e(View view) {
        Drawable background = view.getBackground();
        if (!(background instanceof fm2)) {
            return 0;
        }
        Drawable drawable = ((fm2) background).a;
        if (drawable instanceof ColorDrawable) {
            return ((ColorDrawable) drawable).getColor();
        }
        return 0;
    }

    @Override // x56
    public final void invoke(Object obj) {
        uj ujVar = (uj) obj;
        switch (this.a) {
            case 0:
                ujVar.getClass();
                break;
            case 1:
                ujVar.getClass();
                break;
            case 2:
                ujVar.getClass();
                break;
            default:
                ujVar.getClass();
                break;
        }
    }

    @Override // js4
    public final Object m(Object obj) {
        int i = t14.U2;
        return 0;
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 9:
                na7.d1().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            default:
                na7.d1().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
        }
    }

    public /* synthetic */ k93(byte b) {
        this.a = b;
    }

    @Override // xq3
    public final void release() {
    }
}
