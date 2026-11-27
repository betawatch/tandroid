package org.telegram.messenger.video;

import java.util.Comparator;
import org.telegram.messenger.video.Track;
import org.telegram.messenger.video.VideoFramesRewinder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {
    public final /* synthetic */ byte a;

    public /* synthetic */ a(byte b) {
        this.a = b;
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
