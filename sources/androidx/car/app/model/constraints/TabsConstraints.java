package androidx.car.app.model.constraints;

import androidx.car.app.model.Tab;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;

/* loaded from: classes.dex */
public class TabsConstraints {
    public static final TabsConstraints DEFAULT = new Builder().setMaxTabs(4).setMinTabs(2).build();
    private final int mMaxTabs;
    private final int mMinTabs;

    public void validateOrThrow(List list, String str) {
        if (list.size() < this.mMinTabs) {
            throw new IllegalArgumentException("There must be at least " + this.mMinTabs + " tab(s) added, but only found " + list.size());
        }
        if (list.size() > this.mMaxTabs) {
            throw new IllegalArgumentException("There cannot be more than " + this.mMaxTabs + " tabs added, found " + list.size());
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Tab tab = (Tab) it.next();
            if (str.equals(tab.getContentId())) {
                z = true;
            }
            if (!hashSet.add(tab.getContentId())) {
                throw new IllegalArgumentException("Found duplicate tab ID: " + tab.getContentId() + ". Each tab must have a unique ID.");
            }
        }
        if (!z) {
            throw new IllegalArgumentException("There is no tab with content ID matching the active tab content ID set on the template");
        }
    }

    TabsConstraints(Builder builder) {
        this.mMaxTabs = builder.mMaxTabs;
        this.mMinTabs = builder.mMinTabs;
    }

    public static final class Builder {
        int mMaxTabs = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int mMinTabs = 0;

        public Builder setMaxTabs(int i) {
            this.mMaxTabs = i;
            return this;
        }

        public Builder setMinTabs(int i) {
            this.mMinTabs = i;
            return this;
        }

        public TabsConstraints build() {
            return new TabsConstraints(this);
        }
    }
}
