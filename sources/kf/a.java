package kf;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public abstract class a extends p {
    @Override // kf.p
    public final void e(p pVar) {
        if (!(pVar instanceof a)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.b = pVar;
    }
}
