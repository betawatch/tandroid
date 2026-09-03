package d4;

import h5.d0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements x {
    public static final s b = new s(0);
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i10) {
        this.a = i10;
    }

    @Override // d4.x
    public int b(Object obj) {
        n nVar = (n) obj;
        switch (this.a) {
            case 2:
                String str = nVar.a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (d0.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            default:
                return nVar.a.startsWith("OMX.google") ? 1 : 0;
        }
    }
}
