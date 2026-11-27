// default package

import android.content.Context;
import org.telegram.ui.PasscodeActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bf6 extends bk2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bf6(byte b, Context context, Object obj) {
        super(context);
        this.h = b;
        this.n = obj;
    }

    @Override // bk2
    public final void a() {
        byte b = this.h;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((df6) obj).h(null);
                break;
            case 1:
                ((vf6) obj).h(null);
                break;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (!passcodeActivity.F) {
                    postDelayed(new fe7(this, (byte) 19), 260L);
                    break;
                } else {
                    passcodeActivity.t0();
                    break;
                }
            default:
                ((o7c) obj).H0();
                break;
        }
    }
}
