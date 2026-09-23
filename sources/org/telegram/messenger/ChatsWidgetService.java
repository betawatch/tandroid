package org.telegram.messenger;

import android.content.Intent;
import android.widget.RemoteViewsService;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public class ChatsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new ChatsRemoteViewsFactory(getApplicationContext(), intent);
    }
}
