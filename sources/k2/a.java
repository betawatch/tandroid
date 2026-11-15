package k2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class a {
    private int flags;

    public final void addFlag(int i7) {
        this.flags = i7 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i7) {
        this.flags = (~i7) & this.flags;
    }

    public final boolean getFlag(int i7) {
        return (this.flags & i7) == i7;
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

    public final void setFlags(int i7) {
        this.flags = i7;
    }
}
