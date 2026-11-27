// default package

import android.graphics.Bitmap;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.InputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.TimestampAligner;
import org.webrtc.TurnCustomizer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class grb implements NativeLifecycleLock.NativeDisposer, fd, vob, wob, dz5, Vector.TLDeserializer, i5c, tq2, yj0, mvc {
    public final /* synthetic */ byte a;

    public /* synthetic */ grb(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void g() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void j(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void m(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void o() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    @Override // yj0
    public final Object a(Bitmap bitmap) {
        int i = 0;
        switch (this.a) {
            case 25:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                E.setHasAlpha(false);
                return E;
            case 26:
                if (bitmap != null && !bitmap.isRecycled()) {
                    int height = bitmap.getHeight();
                    i = Utilities.averageBitmapColor(bitmap, 0, (height * 9) / 10, bitmap.getWidth(), height);
                    break;
                }
                break;
            default:
                if (bitmap != null && !bitmap.isRecycled()) {
                    i = Utilities.averageBitmapColor(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight() / 10);
                    break;
                }
                break;
        }
        return Integer.valueOf(i);
    }

    @Override // mvc
    public final InputStream b() {
        return a.b.getResources().openRawResource(R.raw.default_pattern);
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        e5c lambda$getComponents$0;
        e5c lambda$getComponents$1;
        e5c lambda$getComponents$2;
        switch (this.a) {
            case 11:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(am2Var);
                return lambda$getComponents$0;
            case 12:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(am2Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(am2Var);
                return lambda$getComponents$2;
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 9:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i, z);
            default:
                return Vector.Int.TLDeserialize(inputSerializedData, i, z);
        }
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeDisposer
    public final void dispose(long j) {
        switch (this.a) {
            case 2:
                TimestampAligner.lambda$dispose$1(j);
                break;
            default:
                TurnCustomizer.lambda$dispose$0(j);
                break;
        }
    }

    @Override // wob
    public final void e(int i, View view) {
        l2c l2cVar = (l2c) view;
        ShapeDrawable shapeDrawable = l2cVar.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i);
            l2cVar.f0.invalidateSelf();
        }
    }

    @Override // vob
    public final int f(View view) {
        ShapeDrawable shapeDrawable = ((l2c) view).f0;
        if (shapeDrawable != null) {
            return shapeDrawable.getPaint().getColor();
        }
        return 0;
    }

    @Override // dz5
    public final void l(Exception exc) {
        cc4.g(exc, true);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        switch (this.a) {
            case 3:
                idVar.dismiss();
                break;
            case 4:
                idVar.dismiss();
                break;
            case 24:
                idVar.dismiss();
                break;
            default:
                idVar.dismiss();
                break;
        }
    }

    @Override // i5c
    public final void d(Exception exc) {
    }
}
