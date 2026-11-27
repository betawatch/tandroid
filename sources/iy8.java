// default package

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpParameters;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iy8 implements OnCompleteListener, fd, qd3, occ, nu4, Vector.TLDeserializer, NativeInstance.AudioLevelsCallback, h84, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativePointerRunnable {
    public final /* synthetic */ byte a;

    public /* synthetic */ iy8(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void d() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new zp2(str + obj + obj2);
    }

    @Override // h84
    public final e84[] b(Uri uri, Map map) {
        return new e84[]{new ic3()};
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        RtpParameters lambda$getParameters$0;
        String lambda$id$1;
        String lambda$id$6;
        RtpParameters lambda$getParameters$5;
        List lambda$getStreams$3;
        RtpTransceiver.RtpTransceiverDirection lambda$getCurrentDirection$4;
        String lambda$getMid$1;
        Boolean lambda$isStopped$2;
        switch (this.a) {
            case 20:
                lambda$getParameters$0 = RtpReceiver.lambda$getParameters$0(j);
                return lambda$getParameters$0;
            case 21:
                lambda$id$1 = RtpReceiver.lambda$id$1(j);
                return lambda$id$1;
            case 22:
                lambda$id$6 = RtpSender.lambda$id$6(j);
                return lambda$id$6;
            case 23:
                lambda$getParameters$5 = RtpSender.lambda$getParameters$5(j);
                return lambda$getParameters$5;
            case 24:
                lambda$getStreams$3 = RtpSender.lambda$getStreams$3(j);
                return lambda$getStreams$3;
            case 25:
                lambda$getCurrentDirection$4 = RtpTransceiver.lambda$getCurrentDirection$4(j);
                return lambda$getCurrentDirection$4;
            case 26:
            default:
                lambda$isStopped$2 = RtpTransceiver.lambda$isStopped$2(j);
                return lambda$isStopped$2;
            case 27:
                lambda$getMid$1 = RtpTransceiver.lambda$getMid$1(j);
                return lambda$getMid$1;
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_iv.RichText.TLdeserialize(inputSerializedData, i, z);
    }

    @Override // occ
    public final Boolean e(b8c b8cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.FALSE;
    }

    @Override // qd3
    public final void f(vw8 vw8Var) {
        vw8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override // nu4
    public final Object h(Object obj) {
        int i = md9.f2;
        return 0;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        xea.i = SystemClock.elapsedRealtime();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PushListenerController.sendRegistrationToServer(2, str);
            return;
        }
        if (f11.a) {
            cc4.b("Failed to get regid");
        }
        xea.g = "__FIREBASE_FAILED__";
        PushListenerController.sendRegistrationToServer(2, null);
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerRunnable
    public final void run(long j) {
        switch (this.a) {
            case 26:
                RtpTransceiver.lambda$stop$6(j);
                break;
            default:
                RtpTransceiver.lambda$stopInternal$8(j);
                break;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        idVar.dismiss();
    }

    public /* synthetic */ iy8(Object obj, byte b) {
        this.a = b;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
