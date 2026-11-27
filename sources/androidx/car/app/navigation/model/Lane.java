package androidx.car.app.navigation.model;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class Lane {
    private final List<LaneDirection> mDirections;

    public Lane(List<LaneDirection> list) {
        this.mDirections = gwd.a(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lane) {
            return Objects.equals(this.mDirections, ((Lane) obj).mDirections);
        }
        return false;
    }

    public List<LaneDirection> getDirections() {
        List<LaneDirection> list = this.mDirections;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hashCode(this.mDirections);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[direction count: ");
        List<LaneDirection> list = this.mDirections;
        return uh9.l(sb, list != null ? list.size() : 0, "]");
    }

    private Lane() {
        this.mDirections = Collections.EMPTY_LIST;
    }
}
