package ii;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.cu;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4 implements cu, j4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;

    public /* synthetic */ h4(w3 w3Var, int i10) {
        this.a = i10;
        this.b = w3Var;
    }

    @Override // org.telegram.ui.Components.cu
    public void run(String str) {
        switch (this.a) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                    tL_inlineButtonTypeUrl.url = str;
                    this.b.a(tL_inlineButtonTypeUrl);
                    break;
                }
                break;
            default:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                    tL_inlineButtonTypeCopy.copy_text = str;
                    this.b.a(tL_inlineButtonTypeCopy);
                    break;
                }
                break;
        }
    }

    @Override // ii.j4
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        this.b.a(tL_inlineButtonTypeUserProfile);
    }
}
