package c3;

import android.view.WindowManager;
import ci.o1;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import ei.q3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gw0;
import z9.e2;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements n, NativeInstance.AudioLevelsCallback, fw0, gw0, z1, Continuation, r9.d, i5.e, d9.k, GenericProvider, Utilities.Callback2Return, eh.d {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i10) {
        this.a = i10;
    }

    @Override // c3.n
    public Constructor a() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(q.class).getConstructor(null);
    }

    @Override // i5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 13:
                xa.e eVar = (xa.e) obj;
                eVar.getClass();
                g3 g3Var = com.google.firebase.messaging.o.a;
                g3Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    g3Var.z(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 14:
                return Integer.valueOf(((d2.b) obj).r);
            default:
                da.a.b.getClass();
                return aa.b.a.M((e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // org.telegram.ui.Components.gw0
    public void b(Object obj, float f7) {
        o1 o1Var = (o1) obj;
        switch (this.a) {
            case 3:
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

    @Override // org.telegram.ui.ActionBar.z1
    public void g(c2 c2Var, int i10) {
        switch (this.a) {
            case 6:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public float get(Object obj) {
        o1 o1Var = (o1) obj;
        switch (this.a) {
            case 2:
                return o1Var.N;
            default:
                return o1Var.O;
        }
    }

    @Override // eh.d
    public int i(g6 g6Var, boolean z10) {
        switch (this.a) {
            case 19:
                return fh.c.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, g6Var), k6.w0(k6.Sd, g6Var));
            case 20:
                if (!LiteMode.isEnabled(256)) {
                    return k6.x0(null, k6.G8, false);
                }
                return k6.o1(z10 ? 0.85f : 0.825f, k6.x0(null, k6.G8, false));
            case 21:
                return fh.c.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, g6Var), k6.w0(k6.Zk, g6Var));
            case 22:
                return k6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.w0(k6.Fi, g6Var));
            case 23:
                return 855638016;
            case 24:
                return TLObject.FLAG_30;
            case 25:
                return k6.o1(0.075f, -16777216);
            case 26:
                return k6.o1(0.88f, k6.w0(k6.d6, g6Var));
            case 27:
                return k6.o1(z10 ? 0.85f : 0.825f, k6.x0(null, k6.G8, false));
            case 28:
                return fh.c.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, g6Var), k6.w0(k6.Yk, g6Var));
            default:
                return k6.o1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, k6.w0(k6.d6, g6Var));
        }
    }

    @Override // r9.d
    public Object j2(z5 z5Var) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(z5Var);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = q3.j0;
        return 0;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.a) {
            case 9:
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
