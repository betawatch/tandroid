package com.google.firebase.abt;

import android.content.Context;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class FirebaseABTesting {
    private final Provider analyticsConnector;
    private Integer maxUserProperties = null;
    private final String originService;

    public FirebaseABTesting(Context context, Provider provider, String str) {
        this.analyticsConnector = provider;
        this.originService = str;
    }

    public void replaceAllExperiments(List list) {
        throwAbtExceptionIfAnalyticsIsNull();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        replaceAllExperimentsWith(convertMapsToExperimentInfos(list));
    }

    public void removeAllExperiments() {
        throwAbtExceptionIfAnalyticsIsNull();
        removeExperiments(getAllExperimentsInAnalytics());
    }

    public List getAllExperiments() {
        throwAbtExceptionIfAnalyticsIsNull();
        List allExperimentsInAnalytics = getAllExperimentsInAnalytics();
        ArrayList arrayList = new ArrayList();
        Iterator it = allExperimentsInAnalytics.iterator();
        while (it.hasNext()) {
            arrayList.add(AbtExperimentInfo.fromConditionalUserProperty((AnalyticsConnector.ConditionalUserProperty) it.next()));
        }
        return arrayList;
    }

    private void replaceAllExperimentsWith(List list) {
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        List allExperiments = getAllExperiments();
        removeExperiments(getExperimentsToRemove(allExperiments, list));
        addExperiments(getExperimentsToAdd(list, allExperiments));
    }

    private ArrayList getExperimentsToRemove(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!experimentsListContainsExperiment(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.toConditionalUserProperty(this.originService));
            }
        }
        return arrayList;
    }

    private ArrayList getExperimentsToAdd(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!experimentsListContainsExperiment(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    private boolean experimentsListContainsExperiment(List list, AbtExperimentInfo abtExperimentInfo) {
        String experimentId = abtExperimentInfo.getExperimentId();
        String variantId = abtExperimentInfo.getVariantId();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) it.next();
            if (abtExperimentInfo2.getExperimentId().equals(experimentId) && abtExperimentInfo2.getVariantId().equals(variantId)) {
                return true;
            }
        }
        return false;
    }

    private void addExperiments(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(getAllExperimentsInAnalytics());
        int maxUserPropertiesInAnalytics = getMaxUserPropertiesInAnalytics();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            while (arrayDeque.size() >= maxUserPropertiesInAnalytics) {
                removeExperimentFromAnalytics(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).name);
            }
            AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = abtExperimentInfo.toConditionalUserProperty(this.originService);
            addExperimentToAnalytics(conditionalUserProperty);
            arrayDeque.offer(conditionalUserProperty);
        }
    }

    private void removeExperiments(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            removeExperimentFromAnalytics(((AnalyticsConnector.ConditionalUserProperty) it.next()).name);
        }
    }

    private static List convertMapsToExperimentInfos(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbtExperimentInfo.fromMap((Map) it.next()));
        }
        return arrayList;
    }

    private void addExperimentToAnalytics(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(this.analyticsConnector.get());
        throw null;
    }

    private void throwAbtExceptionIfAnalyticsIsNull() {
        if (this.analyticsConnector.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    private void removeExperimentFromAnalytics(String str) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(this.analyticsConnector.get());
        throw null;
    }

    private int getMaxUserPropertiesInAnalytics() {
        Integer num = this.maxUserProperties;
        if (num == null) {
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(this.analyticsConnector.get());
            throw null;
        }
        return num.intValue();
    }

    private List getAllExperimentsInAnalytics() {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(this.analyticsConnector.get());
        throw null;
    }
}
