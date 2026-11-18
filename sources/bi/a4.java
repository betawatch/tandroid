package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SpannableStringBuilder b;

    public /* synthetic */ a4(SpannableStringBuilder spannableStringBuilder, int i7) {
        this.a = i7;
        this.b = spannableStringBuilder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        SpannableStringBuilder spannableStringBuilder = this.b;
        switch (i7) {
            case 0:
                gc I = f4.g().I(R.raw.contact_check, gd.M0(2131749566, null), spannableStringBuilder);
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
