package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SpannableStringBuilder b;

    public /* synthetic */ e4(SpannableStringBuilder spannableStringBuilder, int i7) {
        this.a = i7;
        this.b = spannableStringBuilder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        SpannableStringBuilder spannableStringBuilder = this.b;
        switch (i7) {
            case 0:
                gc I = i4.h().I(R.raw.contact_check, gd.N0(2131749565, null), spannableStringBuilder);
                I.t = true;
                I.j();
                break;
            default:
                lc Y = lc.Y();
                if (Y != null) {
                    Y.Q(R.raw.forward, 30, spannableStringBuilder).j();
                    break;
                }
                break;
        }
    }
}
