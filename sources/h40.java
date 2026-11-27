// default package

import org.webrtc.MediaStream;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.RtpSender;
import org.webrtc.TimestampAligner;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class h40 implements b86, ot2, NativeLifecycleLock.NativePointerCallable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ h40(byte b, long j) {
        this.a = b;
        this.b = j;
    }

    @Override // ot2
    public final void accept(Object obj) {
        ((og8) obj).g(this.b);
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$removeMediaStreamTrack$12;
        Boolean lambda$removeTrack$8;
        Boolean lambda$removeTrack$6;
        Boolean lambda$setTrack$0;
        Long lambda$translateTimestamp$0;
        switch (this.a) {
            case 2:
                lambda$removeMediaStreamTrack$12 = MediaStream.lambda$removeMediaStreamTrack$12(this.b, j);
                return lambda$removeMediaStreamTrack$12;
            case 3:
                lambda$removeTrack$8 = MediaStream.lambda$removeTrack$8(this.b, j);
                return lambda$removeTrack$8;
            case 4:
                lambda$removeTrack$6 = MediaStream.lambda$removeTrack$6(this.b, j);
                return lambda$removeTrack$6;
            case 5:
                lambda$setTrack$0 = RtpSender.lambda$setTrack$0(this.b, j);
                return lambda$setTrack$0;
            default:
                lambda$translateTimestamp$0 = TimestampAligner.lambda$translateTimestamp$0(this.b, j);
                return lambda$translateTimestamp$0;
        }
    }

    @Override // b86
    public final void invoke(Object obj) {
        v30 v30Var;
        ha3 ha3Var = (ha3) obj;
        ja3 ja3Var = ha3Var.a;
        if (ha3Var != ja3Var.j || (v30Var = ja3Var.n) == null) {
            return;
        }
        v30Var.n(this.b);
    }
}
