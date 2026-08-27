package com.google.android.exoplayer2.ext.mediasession;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.p;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import d5.g0;
import h3.c2;
import h3.f1;
import java.util.ArrayList;
import java.util.List;
import p8.z;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class TimelineQueueEditor implements MediaSessionConnector.QueueEditor, MediaSessionConnector.CommandReceiver {
    public static final String COMMAND_MOVE_QUEUE_ITEM = "exo_move_window";
    public static final String EXTRA_FROM_INDEX = "from_index";
    public static final String EXTRA_TO_INDEX = "to_index";
    private final MediaDescriptionEqualityChecker equalityChecker;
    private final p mediaController;
    private final MediaDescriptionConverter mediaDescriptionConverter;
    private final QueueDataAdapter queueDataAdapter;

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface MediaDescriptionConverter {
        f1 convert(MediaDescriptionCompat mediaDescriptionCompat);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface MediaDescriptionEqualityChecker {
        boolean equals(MediaDescriptionCompat mediaDescriptionCompat, MediaDescriptionCompat mediaDescriptionCompat2);
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public static final class MediaIdEqualityChecker implements MediaDescriptionEqualityChecker {
        @Override // com.google.android.exoplayer2.ext.mediasession.TimelineQueueEditor.MediaDescriptionEqualityChecker
        public boolean equals(MediaDescriptionCompat mediaDescriptionCompat, MediaDescriptionCompat mediaDescriptionCompat2) {
            return g0.a(mediaDescriptionCompat.a, mediaDescriptionCompat2.a);
        }
    }

    /* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
    public interface QueueDataAdapter {
        void add(int i10, MediaDescriptionCompat mediaDescriptionCompat);

        void move(int i10, int i11);

        void remove(int i10);
    }

    public TimelineQueueEditor(p pVar, QueueDataAdapter queueDataAdapter, MediaDescriptionConverter mediaDescriptionConverter) {
        this(pVar, queueDataAdapter, mediaDescriptionConverter, new MediaIdEqualityChecker());
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueEditor
    public void onAddQueueItem(c2 c2Var, MediaDescriptionCompat mediaDescriptionCompat) {
        onAddQueueItem(c2Var, mediaDescriptionCompat, c2Var.A().o());
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.CommandReceiver
    public boolean onCommand(c2 c2Var, String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!COMMAND_MOVE_QUEUE_ITEM.equals(str) || bundle == null) {
            return false;
        }
        int i10 = bundle.getInt(EXTRA_FROM_INDEX, -1);
        int i11 = bundle.getInt(EXTRA_TO_INDEX, -1);
        if (i10 != -1 && i11 != -1) {
            this.queueDataAdapter.move(i10, i11);
            b8.a aVar = (b8.a) c2Var;
            if (i10 != i11) {
                aVar.y(i10, i10 + 1, i11);
                return true;
            }
            aVar.getClass();
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueEditor
    public void onRemoveQueueItem(c2 c2Var, MediaDescriptionCompat mediaDescriptionCompat) {
        List<MediaSession.QueueItem> queue = this.mediaController.a.a.getQueue();
        ArrayList a2 = queue != null ? MediaSessionCompat$QueueItem.a(queue) : null;
        for (int i10 = 0; i10 < a2.size(); i10++) {
            if (this.equalityChecker.equals(((MediaSessionCompat$QueueItem) a2.get(i10)).a, mediaDescriptionCompat)) {
                this.queueDataAdapter.remove(i10);
                ((b8.a) c2Var).n(i10, i10 + 1);
                return;
            }
        }
    }

    public TimelineQueueEditor(p pVar, QueueDataAdapter queueDataAdapter, MediaDescriptionConverter mediaDescriptionConverter, MediaDescriptionEqualityChecker mediaDescriptionEqualityChecker) {
        this.mediaController = pVar;
        this.queueDataAdapter = queueDataAdapter;
        this.mediaDescriptionConverter = mediaDescriptionConverter;
        this.equalityChecker = mediaDescriptionEqualityChecker;
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueEditor
    public void onAddQueueItem(c2 c2Var, MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        f1 convert = this.mediaDescriptionConverter.convert(mediaDescriptionCompat);
        if (convert != null) {
            this.queueDataAdapter.add(i10, mediaDescriptionCompat);
            b8.a aVar = (b8.a) c2Var;
            aVar.getClass();
            aVar.s(i10, z.y(convert));
        }
    }
}
