package androidx.car.app.model;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class ActionStrip {
    private final List<Action> mActions;

    public ActionStrip(b bVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActionStrip) {
            return Objects.equals(this.mActions, ((ActionStrip) obj).mActions);
        }
        return false;
    }

    public List<Action> getActions() {
        List<Action> list = this.mActions;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Action getFirstActionOfType(int i7) {
        for (Action action : this.mActions) {
            if (action instanceof Action) {
                Action action2 = action;
                if (action2.getType() == i7) {
                    return action2;
                }
            }
        }
        return null;
    }

    public int hashCode() {
        return Objects.hashCode(this.mActions);
    }

    public String toString() {
        return "[action count: " + this.mActions.size() + "]";
    }

    private ActionStrip() {
        this.mActions = Collections.EMPTY_LIST;
    }
}
