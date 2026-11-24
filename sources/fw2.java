// default package

import android.accounts.Account;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
import org.telegram.messenger.ContactsSyncAdapterService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class fw2 extends AbstractThreadedSyncAdapter {
    @Override // android.content.AbstractThreadedSyncAdapter
    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        try {
            fw2 fw2Var = ContactsSyncAdapterService.a;
            if (e21.a) {
                fc4.b("performSync: " + account.toString());
            }
        } catch (OperationCanceledException e) {
            fc4.g(e, true);
        }
    }
}
