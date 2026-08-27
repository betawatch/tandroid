package org.telegram.messenger;

import android.content.Intent;
import android.widget.RemoteViewsService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class FeedWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new FeedRemoteViewsFactory(getApplicationContext(), intent);
    }
}
