// default package

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class mh9 implements pu3, oh9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bh9 b;

    public /* synthetic */ mh9(bh9 bh9Var, byte b) {
        this.a = b;
        this.b = bh9Var;
    }

    @Override // pu3
    public final void a(String str) {
        byte b = this.a;
        bh9 bh9Var = this.b;
        switch (b) {
            case 0:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                    tL_inlineButtonTypeUrl.url = str;
                    bh9Var.a(tL_inlineButtonTypeUrl);
                    break;
                }
                break;
            default:
                if (!TextUtils.isEmpty(str)) {
                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                    tL_inlineButtonTypeCopy.copy_text = str;
                    bh9Var.a(tL_inlineButtonTypeCopy);
                    break;
                }
                break;
        }
    }

    @Override // oh9
    public final void run(long j) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j;
        this.b.a(tL_inlineButtonTypeUserProfile);
    }
}
