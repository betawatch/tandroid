package bi;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class w2 implements org.telegram.ui.ActionBar.z1, Continuation, r9.d, i5.e, d9.k, GenericProvider, Utilities.Callback2Return, eh.d {
    public final /* synthetic */ int a;

    public /* synthetic */ w2(int i10) {
        this.a = i10;
    }

    public Constructor a() {
        switch (this.a) {
            case 2:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(c3.o.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(c3.o.class).getConstructor(null);
        }
    }

    @Override // i5.e
    public Object apply(Object obj) {
        switch (this.a) {
            case 9:
                xa.e eVar = (xa.e) obj;
                eVar.getClass();
                li.k kVar = com.google.firebase.messaging.p.a;
                kVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    kVar.x(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 10:
                return Integer.valueOf(((d2.b) obj).r);
            default:
                da.a.b.getClass();
                return aa.b.a.N((z9.e2) obj).getBytes(Charset.forName("UTF-8"));
        }
    }

    @Override // eh.d
    public int f(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        switch (this.a) {
            case 15:
                return fh.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Sd, c6Var));
            case 16:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false);
                }
                return org.telegram.ui.ActionBar.g6.m1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false));
            case 17:
                return fh.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Zk, c6Var));
            case 18:
                return org.telegram.ui.ActionBar.g6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Fi, c6Var));
            case 19:
                return 855638016;
            case 20:
                return TLObject.FLAG_30;
            case 21:
                return org.telegram.ui.ActionBar.g6.m1(0.075f, -16777216);
            case 22:
                return org.telegram.ui.ActionBar.g6.m1(0.88f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            case 23:
                return org.telegram.ui.ActionBar.g6.m1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G8, false));
            case 24:
                return fh.b.m(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Yk, c6Var));
            case 25:
                return org.telegram.ui.ActionBar.g6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            case 26:
                return org.telegram.ui.ActionBar.g6.m1(0.78f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var));
            case 27:
                return org.telegram.ui.ActionBar.g6.m1(0.7f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            case 28:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return org.telegram.ui.ActionBar.g6.m1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, c6Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        a2Var.dismiss();
    }

    @Override // r9.d
    public Object j2(com.google.android.gms.internal.cast.z5 z5Var) {
        FirebaseMessaging lambda$getComponents$0;
        lambda$getComponents$0 = FirebaseMessagingRegistrar.lambda$getComponents$0(z5Var);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        MediaController.AlbumEntry albumEntry = di.v3.j0;
        return 0;
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        if (((Integer) obj).intValue() == 0) {
            return num.intValue() == 0 ? LocaleController.getString(R.string.LiveStoryPricePerCommentFree) : LocaleController.formatPluralStringComma("Stars", num.intValue());
        }
        return "" + num;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        int i10;
        switch (this.a) {
            case 5:
                i10 = 403;
                break;
            default:
                i10 = -1;
                break;
        }
        return Integer.valueOf(i10);
    }
}
