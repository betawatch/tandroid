package n2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
