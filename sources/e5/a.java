package e5;

import h5.w;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a extends v4.e {
    public final /* synthetic */ int n = 0;
    public final Object o;

    public a(List list) {
        super("DvbDecoder");
        w wVar = new w((byte[]) list.get(0));
        this.o = new x4.h(wVar.z(), wVar.z());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // v4.e
    public final v4.f k(int r50, boolean r51, byte[] r52) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.a.k(int, boolean, byte[]):v4.f");
    }

    public a() {
        super("Mp4WebvttDecoder");
        this.o = new w();
    }
}
