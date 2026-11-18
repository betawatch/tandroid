package k2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
