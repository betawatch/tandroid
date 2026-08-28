package k3;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class a {
    private int flags;

    public final void addFlag(int i9) {
        this.flags = i9 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i9) {
        this.flags = (~i9) & this.flags;
    }

    public final boolean getFlag(int i9) {
        return (this.flags & i9) == i9;
    }

    public final boolean hasSupplementalData() {
        return getFlag(TLObject.FLAG_28);
    }

    public final boolean isDecodeOnly() {
        return getFlag(TLObject.FLAG_31);
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

    public final void setFlags(int i9) {
        this.flags = i9;
    }
}
