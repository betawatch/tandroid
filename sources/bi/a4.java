package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                gc I = e4.h().I(R.raw.contact_check, gd.M0(2131749566, null), spannableStringBuilder);
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
