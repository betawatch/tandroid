// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class if9 implements ft3, kf9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xe9 b;

    public /* synthetic */ if9(xe9 xe9Var, byte b) {
        this.a = b;
        this.b = xe9Var;
    }

    @Override // ft3
    public final void a(String str) {
        byte b = this.a;
        xe9 xe9Var = this.b;
        switch (b) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                    tL_inlineButtonTypeUrl.url = str;
                    xe9Var.a(tL_inlineButtonTypeUrl);
                    break;
                }
                break;
            default:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                    tL_inlineButtonTypeCopy.copy_text = str;
                    xe9Var.a(tL_inlineButtonTypeCopy);
                    break;
                }
                break;
        }
    }

    @Override // kf9
    public final void run(long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        this.b.a(tL_inlineButtonTypeUserProfile);
    }
}
