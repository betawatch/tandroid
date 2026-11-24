// default package

import android.graphics.Bitmap;
import android.graphics.drawable.ShapeDrawable;
import android.media.AudioRecordingConfiguration;
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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class fyb implements xkb, yw5, Vector.TLDeserializer, j1c, aq2, ed, xj0, yqc {
    public final /* synthetic */ byte a;

    public /* synthetic */ fyb(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration c(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    public static /* synthetic */ void g() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void j(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void k(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }

    @Override // aq2
    public final Object K(gl2 gl2Var) {
        f1c lambda$getComponents$0;
        f1c lambda$getComponents$1;
        f1c lambda$getComponents$2;
        switch (this.a) {
            case 4:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(gl2Var);
                return lambda$getComponents$0;
            case 5:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(gl2Var);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(gl2Var);
                return lambda$getComponents$2;
        }
    }

    @Override // xj0
    public final Object a(Bitmap bitmap) {
        int i = 0;
        switch (this.a) {
            case 16:
                if (bitmap == null || bitmap.isRecycled()) {
                    return null;
                }
                Bitmap E = Utilities.E(Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f), bitmap);
                E.setHasAlpha(false);
                return E;
            case 17:
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

    @Override // yqc
    public final InputStream b() {
        return a.b.getResources().openRawResource(R.raw.default_pattern);
    }

    @Override // xkb
    public final void d(int i, View view) {
        lyb lybVar = (lyb) view;
        ShapeDrawable shapeDrawable = lybVar.f0;
        if (shapeDrawable != null) {
            shapeDrawable.getPaint().setColor(i);
            lybVar.f0.invalidateSelf();
        }
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        switch (this.a) {
            case 2:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i, z);
            default:
                return Vector.Int.TLDeserialize(inputSerializedData, i, z);
        }
    }

    @Override // yw5
    public final void n(Exception exc) {
        fa4.g(exc, true);
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 15:
                hdVar.dismiss();
                break;
            default:
                hdVar.dismiss();
                break;
        }
    }

    @Override // j1c
    public final void e(Exception exc) {
    }
}
