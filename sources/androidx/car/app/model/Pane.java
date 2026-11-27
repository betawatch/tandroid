package androidx.car.app.model;

import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class Pane {
    private final List<Action> mActionList;
    private final CarIcon mImage;
    private final boolean mIsLoading;
    private final List<Row> mRows;

    private Pane() {
        List list = Collections.EMPTY_LIST;
        this.mRows = list;
        this.mActionList = list;
        this.mIsLoading = false;
        this.mImage = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pane)) {
            return false;
        }
        Pane pane = (Pane) obj;
        return this.mIsLoading == pane.mIsLoading && Objects.equals(this.mActionList, pane.mActionList) && Objects.equals(this.mRows, pane.mRows) && Objects.equals(this.mImage, pane.mImage);
    }

    public List<Action> getActions() {
        List<Action> list = this.mActionList;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public CarIcon getImage() {
        return this.mImage;
    }

    public List<Row> getRows() {
        List<Row> list = this.mRows;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public int hashCode() {
        return Objects.hash(this.mRows, this.mActionList, Boolean.valueOf(this.mIsLoading), this.mImage);
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ rows: ");
        List<Row> list = this.mRows;
        sb.append(list != null ? list.toString() : null);
        sb.append(", action list: ");
        sb.append(this.mActionList);
        sb.append("]");
        return sb.toString();
    }

    public Pane(yx7 yx7Var) {
        throw null;
    }
}
