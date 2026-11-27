// default package

import java.util.concurrent.Executor;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class i01 {
    public final int a;
    public final TLRPC.InputGroupCall b;
    public final int c;
    public final boolean d;
    public final Executor e;
    public final ye9 f;

    public i01(int i, TLRPC.InputGroupCall inputGroupCall, int i2, boolean z, Executor executor, ye9 ye9Var) {
        this.a = i;
        this.b = inputGroupCall;
        this.c = i2;
        this.d = z;
        this.e = executor;
        this.f = ye9Var;
    }

    public final wg a(qz0 qz0Var, pz0 pz0Var) {
        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
        TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
        tL_inputGroupCallStream.call = this.b;
        tL_inputGroupCallStream.time_ms = qz0Var.c;
        tL_inputGroupCallStream.scale = 0;
        int i = qz0Var.b;
        if (i != 0) {
            tL_inputGroupCallStream.flags |= 1;
            tL_inputGroupCallStream.video_channel = i;
            tL_inputGroupCallStream.video_quality = qz0Var.d;
        }
        tL_upload_getFile.location = tL_inputGroupCallStream;
        tL_upload_getFile.offset = 0L;
        tL_upload_getFile.limit = i != 0 ? TLObject.FLAG_19 : 131072;
        return new wg(this, ConnectionsManager.getInstance(this.a).sendRequest(tL_upload_getFile, new h01(this, pz0Var, (byte) 0), 2, 2, this.c), (byte) 2);
    }

    public final void b(dz0 dz0Var) {
        boolean z = this.d;
        int i = this.a;
        if (!z) {
            this.e.execute(new kt(dz0Var, ConnectionsManager.getInstance(i).getCurrentTimeMillis(), (byte) 4));
        } else {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = this.b;
            ConnectionsManager.getInstance(i).sendRequest(getgroupcallstreamchannels, new o(this, dz0Var, (byte) 29), 2, 2, this.c);
        }
    }
}
