package oi;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.nt;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class e4 implements nt, g4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ e4(s3 s3Var, int i7) {
        this.a = i7;
        this.b = s3Var;
    }

    @Override // org.telegram.ui.Components.nt
    public void a(String str) {
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

    @Override // oi.g4
    public void run(long j3) {
        TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
        tL_inlineButtonTypeUserProfile.user_id = j3;
        this.b.a(tL_inlineButtonTypeUserProfile);
    }
}
