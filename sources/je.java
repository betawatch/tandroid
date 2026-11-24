// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hj b;
    public final /* synthetic */ hd c;
    public final /* synthetic */ d d;

    public /* synthetic */ je(hj hjVar, hd hdVar, d dVar, byte b) {
        this.a = b;
        this.b = hjVar;
        this.c = hdVar;
        this.d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        d dVar = this.d;
        hd hdVar = this.c;
        hj hjVar = this.b;
        switch (b) {
            case 0:
                gl.d3(new je(hjVar, hdVar, dVar, (byte) 1));
                break;
            default:
                ij.b0(hjVar, hdVar, dVar);
                break;
        }
    }
}
