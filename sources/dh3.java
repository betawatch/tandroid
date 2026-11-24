// default package

import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dh3 extends vu8 {
    public final /* synthetic */ byte f0 = 0;
    public final /* synthetic */ Object g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh3(qvb qvbVar, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = qvbVar;
    }

    @Override // vu8
    public final float d() {
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                return ((bj3) obj).a.getViewOffset();
            default:
                return ((qvb) obj).O.m3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh3(String str, String str2, bj3 bj3Var) {
        super(str, str2);
        this.g0 = bj3Var;
    }
}
