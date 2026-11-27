// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class la2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ma2 b;
    public final /* synthetic */ String c;

    public /* synthetic */ la2(ma2 ma2Var, String str, byte b) {
        this.a = b;
        this.b = ma2Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ma2 ma2Var = this.b;
                String str = this.c;
                ma2Var.getClass();
                hl.c3(new la2(ma2Var, str, (byte) 1));
                break;
            default:
                ma2 ma2Var2 = this.b;
                String str2 = this.c;
                ma2Var2.f = null;
                Utilities.g.c(new on1(ma2Var2, str2, new ArrayList(ma2Var2.h.w), (byte) 18));
                break;
        }
    }
}
