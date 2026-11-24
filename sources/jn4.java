// default package

import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jn4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FragmentContextView b;

    public /* synthetic */ jn4(FragmentContextView fragmentContextView, byte b) {
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
