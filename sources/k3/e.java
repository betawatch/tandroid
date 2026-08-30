package k3;

import android.hardware.fingerprint.FingerprintManager;
import android.media.AudioDeviceInfo;
import android.media.MediaDrmResetException;
import android.util.Base64;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import kh.q5;
import la.d0;
import la.j0;
import la.l;
import la.n0;
import la.s;
import lh.g5;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.og1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements h5.j, r8.i, c2, GenericProvider, c9.e, Vector.TLDeserializer {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ FingerprintManager a(Object obj) {
        return (FingerprintManager) obj;
    }

    public static /* bridge */ /* synthetic */ AudioDeviceInfo b(Object obj) {
        return (AudioDeviceInfo) obj;
    }

    public static /* bridge */ /* synthetic */ boolean c(Object obj) {
        return obj instanceof MediaDrmResetException;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z4) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z4);
    }

    @Override // c9.e
    public Object f0(c5.j jVar) {
        l lVar;
        j0 j0Var;
        d0 d0Var;
        na.h hVar;
        s sVar;
        n0 n0Var;
        switch (this.a) {
            case 20:
                lVar = FirebaseSessionsRegistrar.getComponents$lambda-0(jVar);
                return lVar;
            case 21:
                j0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(jVar);
                return j0Var;
            case 22:
                d0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(jVar);
                return d0Var;
            case 23:
                hVar = FirebaseSessionsRegistrar.getComponents$lambda-3(jVar);
                return hVar;
            case 24:
                sVar = FirebaseSessionsRegistrar.getComponents$lambda-4(jVar);
                return sVar;
            default:
                n0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(jVar);
                return n0Var;
        }
    }

    @Override // r8.i
    public Object get() {
        byte[] bArr = new byte[12];
        h.i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void i(d2 d2Var, int i10) {
        switch (this.a) {
            case 9:
                d2Var.dismiss();
                break;
            case 10:
                d2Var.dismiss();
                break;
            case 27:
                g5.d2(new og1(6, null));
                break;
            default:
                int i11 = g5.n1;
                break;
        }
    }

    @Override // h5.j
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.a) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                bVar.getClass();
                break;
            case 4:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        int i10 = q5.h0;
        return 0;
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
    }
}
