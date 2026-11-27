// default package

import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
