package androidx.car.app.navigation.model;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class Lane {
    private final List<LaneDirection> mDirections;

    public Lane(List<LaneDirection> list) {
        this.mDirections = androidx.car.app.utils.j.g(list);
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
        return android.support.v4.media.a.m(list != null ? list.size() : 0, "]", sb);
    }

    private Lane() {
        this.mDirections = Collections.EMPTY_LIST;
    }
}
