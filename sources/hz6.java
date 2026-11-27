// default package

import android.app.NotificationChannel;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.telegram.messenger.voip.CallAudioDevice;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.NativeLifecycleLock;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class hz6 implements ot2, pz6, NativeLifecycleLock.NativePointerCallable, Vector.TLDeserializer, y2c, yj0, tl5, CallAudioDevice.SamplesCallback, fd, qd3, zla, ama {
    public final /* synthetic */ byte a;

    public static /* bridge */ /* synthetic */ NotificationChannel c(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ void e(Object obj) {
        throw new AssertionError(obj);
    }

    @Override // yj0
    public final Object a(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // ot2
    public final void accept(Object obj) {
        og8 og8Var = (og8) obj;
        switch (this.a) {
            case 1:
                og8Var.K0();
                break;
            case 2:
                og8Var.J0();
                break;
            default:
                og8Var.stop();
                break;
        }
    }

    @Override // y2c
    public final Object apply(Object obj) {
        of7 of7Var = (of7) obj;
        of7Var.getClass();
        rw8 rw8Var = jw8.a;
        rw8Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            rw8Var.b(of7Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // tl5
    public final boolean b(int i, int i2, int i3, int i4, int i5) {
        if (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) {
            return true;
        }
        if (i2 == 77 && i3 == 76 && i4 == 76) {
            return i5 == 84 || i == 2;
        }
        return false;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        MediaSource.State lambda$state$1;
        String lambda$getId$11;
        Boolean lambda$enabled$2;
        MediaStreamTrack.State lambda$state$4;
        String lambda$kind$1;
        String lambda$id$0;
        switch (this.a) {
            case 5:
                lambda$state$1 = MediaSource.lambda$state$1(j);
                return lambda$state$1;
            case 6:
                lambda$getId$11 = MediaStream.lambda$getId$11(j);
                return lambda$getId$11;
            case 7:
                lambda$enabled$2 = MediaStreamTrack.lambda$enabled$2(j);
                return lambda$enabled$2;
            case 8:
                lambda$state$4 = MediaStreamTrack.lambda$state$4(j);
                return lambda$state$4;
            case 9:
                lambda$kind$1 = MediaStreamTrack.lambda$kind$1(j);
                return lambda$kind$1;
            default:
                lambda$id$0 = MediaStreamTrack.lambda$id$0(j);
                return lambda$id$0;
        }
    }

    @Override // ama
    public final void d(Object obj, float f) {
        lu7 lu7Var = (lu7) obj;
        switch (this.a) {
            case 26:
                lu7Var.f = f;
                if (!lu7Var.E || lu7Var.G) {
                    lu7Var.c.setStrokeWidth(hl.R1(lu7Var.w, lu7Var.x, f));
                    lu7Var.f();
                }
                lu7Var.invalidate();
                break;
            default:
                lu7Var.n = f;
                if (!lu7Var.E || lu7Var.G) {
                    lu7Var.f();
                }
                lu7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 11:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i, z);
            case 12:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i, z);
            case 13:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i, z);
            default:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i, z);
        }
    }

    @Override // zla
    public final float get(Object obj) {
        lu7 lu7Var = (lu7) obj;
        switch (this.a) {
            case 25:
                return lu7Var.f;
            case 26:
            default:
                return lu7Var.s;
            case 27:
                return lu7Var.n;
        }
    }

    @Override // pz6
    public final Object j(yx6 yx6Var, xw6 xw6Var, int i) {
        sjf sjfVar = yx6Var.e;
        yx6Var.q(xw6Var);
        sjfVar.getClass();
        return fne.c(new gaa(-6));
    }

    @Override // org.telegram.messenger.voip.CallAudioDevice.SamplesCallback
    public final void onSamples(byte[] bArr, int i, int i2) {
        NativeInstance.onRecordedSamples(bArr, i, i2);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 22:
                idVar.dismiss();
                break;
            default:
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new uqc());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ hz6(byte b) {
        this.a = b;
    }

    @Override // qd3
    public final void f(vw8 vw8Var) {
    }
}
