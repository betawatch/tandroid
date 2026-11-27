// default package

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class om0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SpannableStringBuilder b;

    public /* synthetic */ om0(SpannableStringBuilder spannableStringBuilder, byte b) {
        this.a = b;
        this.b = spannableStringBuilder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SpannableStringBuilder spannableStringBuilder = this.b;
        switch (b) {
            case 0:
                d31 Y = d31.Y();
                if (Y != null) {
                    Y.Q(R.raw.forward, 30, spannableStringBuilder).j();
                    break;
                }
                break;
            default:
                v21 I = vs7.h().I(R.raw.contact_check, ob6.M0(2131749527, null), spannableStringBuilder);
                I.u = true;
                I.j();
                break;
        }
    }
}
