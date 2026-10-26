package c2;

import a8.me;
import aa.g2;
import android.content.pm.ShortcutManager;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import di.o1;
import fi.o3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.ow0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Continuation, s9.d, j5.e, e9.k, NativeInstance.AudioLevelsCallback, nw0, ow0, b2, GenericProvider, Utilities.Callback2Return, fh.d {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ ShortcutManager c(Object obj) {
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
            case 1:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(c3.o.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(c3.o.class).getConstructor(null);
        }
    }

    @Override // j5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 8:
                ya.e eVar = (ya.e) obj;
                eVar.getClass();
                k6.c cVar = com.google.firebase.messaging.n.a;
                cVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cVar.s(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 9:
                return Integer.valueOf(((d2.b) obj).r);
            default:
                ea.a.b.getClass();
                return ba.a.a.c((g2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public void b(Object obj, float f7) {
        o1 o1Var = (o1) obj;
        switch (this.a) {
            case 12:
                WindowManager.LayoutParams layoutParams = o1Var.c;
                o1Var.N = f7;
                layoutParams.x = (int) f7;
                AndroidUtilities.updateViewLayout(o1Var.b, o1Var.d, layoutParams);
                break;
            default:
                WindowManager.LayoutParams layoutParams2 = o1Var.c;
                o1Var.O = f7;
                layoutParams2.y = (int) f7;
                AndroidUtilities.updateViewLayout(o1Var.b, o1Var.d, layoutParams2);
                break;
        }
    }

    @Override // s9.d
    public Object d1(me meVar) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(meVar);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.ui.Components.nw0
    public float get(Object obj) {
        o1 o1Var = (o1) obj;
        switch (this.a) {
            case 11:
                return o1Var.N;
            default:
                return o1Var.O;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(e2 e2Var, int i10) {
        switch (this.a) {
            case 15:
                e2Var.dismiss();
                break;
            default:
                e2Var.dismiss();
                break;
        }
    }

    @Override // fh.d
    public int i(u6 u6Var, boolean z10) {
        switch (this.a) {
            case 26:
                return gh.c.n(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, y6.w0(y6.d6, u6Var), y6.w0(y6.Sd, u6Var));
            case 27:
                return y6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, y6.w0(y6.d6, u6Var));
            case 28:
                if (!LiteMode.isEnabled(256)) {
                    return y6.x0(null, y6.G8, false);
                }
                return y6.o1(z10 ? 0.85f : 0.825f, y6.x0(null, y6.G8, false));
            default:
                return gh.c.n(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, y6.w0(y6.d6, u6Var), y6.w0(y6.Zk, u6Var));
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = o3.j0;
        return 0;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.a) {
            case 4:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return num.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }
}
