package gh;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class f9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Chat d;

    public /* synthetic */ f9(qn qnVar, long j10, TLRPC.Chat chat, int i9) {
        this.a = i9;
        this.b = qnVar;
        this.c = j10;
        this.d = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        TLRPC.Chat chat = this.d;
        long j10 = this.c;
        qn qnVar = this.b;
        switch (i9) {
            case 0:
                oc.a0(qnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                oc.a0(qnVar).M(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j10, chat.title)), R.raw.stars_send).k(true);
                break;
        }
    }
}
