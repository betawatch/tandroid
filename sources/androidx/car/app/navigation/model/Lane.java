package androidx.car.app.navigation.model;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class Lane {
    private final List<LaneDirection> mDirections;

    public Lane(List<LaneDirection> list) {
        this.mDirections = androidx.car.app.utils.g.g(list);
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
        StringBuilder sb2 = new StringBuilder("[direction count: ");
        List<LaneDirection> list = this.mDirections;
        return a4.a.n(list != null ? list.size() : 0, "]", sb2);
    }

    private Lane() {
        this.mDirections = Collections.EMPTY_LIST;
    }
}
