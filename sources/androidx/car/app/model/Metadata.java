package androidx.car.app.model;

import j$.util.Objects;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
