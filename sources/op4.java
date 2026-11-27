// default package

import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
