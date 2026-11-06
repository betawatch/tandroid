package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class Metadata {
    public static final Metadata EMPTY_METADATA = new Metadata(new y());
    private final Place mPlace;

    public Metadata(y yVar) {
        yVar.getClass();
        this.mPlace = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metadata) {
            return Objects.equals(this.mPlace, ((Metadata) obj).mPlace);
        }
        return false;
    }

    public Place getPlace() {
        return this.mPlace;
    }

    public int hashCode() {
        return Objects.hashCode(this.mPlace);
    }

    private Metadata() {
        this.mPlace = null;
    }
}
