package org.telegram.messenger;

import android.content.Intent;
import android.widget.RemoteViewsService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class FeedWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new FeedRemoteViewsFactory(getApplicationContext(), intent);
    }
}
