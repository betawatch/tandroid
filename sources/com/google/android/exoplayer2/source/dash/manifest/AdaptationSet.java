package com.google.android.exoplayer2.source.dash.manifest;

import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes.dex */
public class AdaptationSet {
    public final List accessibilityDescriptors;
    public final List essentialProperties;
    public final int id;
    public final List representations;
    public final List supplementalProperties;
    public final int type;

    public AdaptationSet(int i, int i2, List list, List list2, List list3, List list4) {
        this.id = i;
        this.type = i2;
        this.representations = DesugarCollections.unmodifiableList(list);
        this.accessibilityDescriptors = DesugarCollections.unmodifiableList(list2);
        this.essentialProperties = DesugarCollections.unmodifiableList(list3);
        this.supplementalProperties = DesugarCollections.unmodifiableList(list4);
    }
}
