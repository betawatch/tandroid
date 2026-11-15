package kf;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
