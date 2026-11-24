// default package

import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class i98 implements ee, kac, gla, OnCompleteListener, ke3, pac, ku4, Vector.TLDeserializer, NativeInstance.AudioLevelsCallback, v84 {
    public final /* synthetic */ byte a;

    public /* synthetic */ i98(byte b) {
        this.a = b;
    }

    public static /* synthetic */ void g() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new rq2(str + obj + obj2);
    }

    @Override // pac
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.FALSE;
    }

    @Override // org.telegram.tgnet.Vector.TLDeserializer
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_iv.RichText.TLdeserialize(inputSerializedData, i, z);
    }

    @Override // v84
    public final s84[] e(Uri uri, Map map) {
        return new s84[]{new bd3()};
    }

    @Override // ke3
    public final void f(nv8 nv8Var) {
        nv8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override // gla
    public final void i(int i) {
        gda.X0 = i;
        gda.x();
    }

    @Override // kac
    public final Object j(Integer num, Object obj) {
        return num.intValue() == 0 ? nxa.b1(false, jb6.H(',', "Stars", ((Integer) obj).intValue()), 0.66f, null) : jb6.E(r4.intValue(), ',');
    }

    @Override // ku4
    public final Object l(Object obj) {
        int i = yb9.f2;
        return 0;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        gda.i = SystemClock.elapsedRealtime();
        if (task.isSuccessful()) {
            String str = (String) task.getResult();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PushListenerController.sendRegistrationToServer(2, str);
            return;
        }
        if (e21.a) {
            fc4.b("Failed to get regid");
        }
        gda.g = "__FIREBASE_FAILED__";
        PushListenerController.sendRegistrationToServer(2, null);
    }

    @Override // ee
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                heVar.dismiss();
                break;
            case 1:
                heVar.dismiss();
                break;
            case 2:
            case 3:
            case 6:
            default:
                heVar.dismiss();
                break;
            case 4:
                RectF rectF = ProfileActivity.e7;
                heVar.dismiss();
                break;
            case 5:
                heVar.dismiss();
                break;
            case 7:
                heVar.dismiss();
                break;
        }
    }

    public /* synthetic */ i98(Object obj, byte b) {
        this.a = b;
    }

    @Override // gla
    public final void m() {
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
