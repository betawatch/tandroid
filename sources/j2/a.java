package j2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class a {
    private int flags;

    public final void addFlag(int i3) {
        this.flags = i3 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i3) {
        this.flags = (~i3) & this.flags;
    }

    public final boolean getFlag(int i3) {
        return (this.flags & i3) == i3;
    }

    public final boolean hasSupplementalData() {
        return getFlag(TLObject.FLAG_28);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isFirstSample() {
        return getFlag(TLObject.FLAG_27);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final boolean isLastSample() {
        return getFlag(TLObject.FLAG_29);
    }

    public final boolean notDependedOn() {
        return getFlag(67108864);
    }

    public final void setFlags(int i3) {
        this.flags = i3;
    }
}
