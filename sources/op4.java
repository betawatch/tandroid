// default package

import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class op4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ op4(FragmentContextView fragmentContextView, byte b) {
        this.a = b;
        this.b = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        FragmentContextView fragmentContextView = this.b;
        switch (b) {
            case 0:
                float[] fArr = FragmentContextView.W0;
                fragmentContextView.O.g = 0.0f;
                fragmentContextView.M.invalidate();
                break;
            default:
                float[] fArr2 = FragmentContextView.W0;
                fragmentContextView.o(true);
                break;
        }
    }
}
