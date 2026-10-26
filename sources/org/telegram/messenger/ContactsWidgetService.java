package org.telegram.messenger;

import android.content.Intent;
import android.widget.RemoteViewsService;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class ContactsWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new ContactsRemoteViewsFactory(getApplicationContext(), intent);
    }
}
