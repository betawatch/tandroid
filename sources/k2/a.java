package k2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
