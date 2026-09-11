package org.telegram.messenger.video;

import java.util.Comparator;
import org.telegram.messenger.video.Track;
import org.telegram.messenger.video.VideoFramesRewinder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$prepare$0;
        int lambda$new$0;
        switch (this.a) {
            case 0:
                lambda$prepare$0 = Track.lambda$prepare$0((Track.SamplePresentationTime) obj, (Track.SamplePresentationTime) obj2);
                return lambda$prepare$0;
            default:
                lambda$new$0 = VideoFramesRewinder.lambda$new$0((VideoFramesRewinder.Frame) obj, (VideoFramesRewinder.Frame) obj2);
                return lambda$new$0;
        }
    }
}
