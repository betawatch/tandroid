package n2;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class w extends Exception {
    public final int a;
    public final boolean b;
    public final e2.u c;

    public w(int i7, e2.u uVar, boolean z9) {
        super(jg.g.j(i7, "AudioTrack write failed: "));
        this.b = z9;
        this.a = i7;
        this.c = uVar;
    }
}
