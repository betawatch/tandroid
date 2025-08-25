package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.offline.FilterableManifest;
import j$.util.DesugarCollections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HlsPlaylist implements FilterableManifest {
    public final String baseUri;
    public final boolean hasIndependentSegments;
    public final List tags;

    protected HlsPlaylist(String str, List list, boolean z) {
        this.baseUri = str;
        this.tags = DesugarCollections.unmodifiableList(list);
        this.hasIndependentSegments = z;
    }
}
