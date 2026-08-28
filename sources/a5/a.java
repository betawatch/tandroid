package a5;

import d5.y;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends r4.e {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public a(List list) {
        super("DvbDecoder");
        y yVar = new y((byte[]) list.get(0));
        this.c = new t4.h(yVar.w(), yVar.w());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // r4.e
    public final r4.f c(int r50, boolean r51, byte[] r52) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.a.c(int, boolean, byte[]):r4.f");
    }

    public a() {
        super("Mp4WebvttDecoder");
        this.c = new y();
    }
}
