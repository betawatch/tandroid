package d2;

import android.content.pm.ShortcutManager;
import android.os.Bundle;
import android.util.Log;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import b8.ke;
import ca.u2;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import gi.d3;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import org.telegram.messenger.e9;
import org.telegram.messenger.pe;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class t1 implements f9.k, k5.e, t9.d, NativeInstance.AudioLevelsCallback, it0, jt0, org.telegram.ui.ActionBar.p1, e9 {
    public final /* synthetic */ int a;

    public /* synthetic */ t1(int i3) {
        this.a = i3;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager b(Object obj) {
        return (ShortcutManager) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher d(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return ShortcutManager.class;
    }

    public Constructor a() {
        switch (this.a) {
            case 12:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(e3.o.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(e3.o.class).getConstructor(null);
        }
    }

    @Override // f9.k
    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                u1 u1Var = (u1) obj;
                u1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putBundle(u1.f, u1Var.b.c());
                bundle.putIntArray(u1.g, u1Var.d);
                bundle.putBooleanArray(u1.h, u1Var.e);
                bundle.putBoolean(u1.i, u1Var.c);
                return bundle;
            case 7:
                db.o0 o0Var = (db.o0) obj;
                String d22 = db.p0.b.d2(o0Var);
                kotlin.jvm.internal.j.d(d22, "encode(...)");
                o0Var.getClass();
                db.m mVar = db.m.b;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = d22.getBytes(ud.a.a);
                kotlin.jvm.internal.j.d(bytes, "getBytes(...)");
                return bytes;
            case 21:
                return Integer.valueOf(((f2.b) obj).r);
            default:
                ga.a.b.getClass();
                return da.a.a.d2((u2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public void c(Object obj, float f10) {
        ei.n1 n1Var = (ei.n1) obj;
        switch (this.a) {
            case 16:
                WindowManager.LayoutParams layoutParams = n1Var.c;
                n1Var.O = f10;
                layoutParams.x = (int) f10;
                org.telegram.messenger.g0.T3(n1Var.b, n1Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = n1Var.c;
                n1Var.P = f10;
                layoutParams2.y = (int) f10;
                org.telegram.messenger.g0.T3(n1Var.b, n1Var.d, layoutParams2);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 19:
                s1Var.dismiss();
                break;
            default:
                s1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.it0
    public float get(Object obj) {
        ei.n1 n1Var = (ei.n1) obj;
        switch (this.a) {
            case 15:
                return n1Var.O;
            default:
                return n1Var.P;
        }
    }

    @Override // org.telegram.messenger.e9
    public Object k(Object obj) {
        pe peVar = d3.k0;
        return 0;
    }

    @Override // t9.d
    public Object q1(ke keVar) {
        db.n components$lambda$0;
        db.r components$lambda$1;
        switch (this.a) {
            case 9:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(keVar);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(keVar);
                return components$lambda$1;
        }
    }

    public /* synthetic */ t1(db.l lVar) {
        this.a = 7;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
