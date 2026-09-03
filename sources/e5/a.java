package e5;

import h5.w;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class a extends v4.e {
    public final /* synthetic */ int n = 0;
    public final Object o;

    public a(List list) {
        super("DvbDecoder");
        w wVar = new w((byte[]) list.get(0));
        this.o = new x4.h(wVar.z(), wVar.z());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v9 org.telegram.ui.Components.zz, still in use, count: 2, list:
          (r3v9 org.telegram.ui.Components.zz) from 0x0282: PHI (r3v10 org.telegram.ui.Components.zz) = (r3v9 org.telegram.ui.Components.zz), (r3v14 org.telegram.ui.Components.zz) binds: [B:94:0x0278, B:135:0x03ad] A[DONT_GENERATE, DONT_INLINE]
          (r3v9 org.telegram.ui.Components.zz) from 0x0241: MOVE (r51v8 org.telegram.ui.Components.zz) = (r3v9 org.telegram.ui.Components.zz) (LINE:578)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // v4.e
    public final v4.f k(int r50, boolean r51, byte[] r52) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.k(int, boolean, byte[]):v4.f");
    }

    public a() {
        super("Mp4WebvttDecoder");
        this.o = new w();
    }
}
