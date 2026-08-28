package gh;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
import org.telegram.ui.bi1;
import org.telegram.ui.jh0;
import org.telegram.ui.rl;
import org.telegram.ui.z90;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1(int i9, z90 z90Var) {
        this.a = 2;
        this.b = i9;
        this.c = z90Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.a;
        int i10 = 17;
        int i11 = 0;
        int i12 = this.b;
        Object obj = this.c;
        switch (i9) {
            case 0:
                k5.T((k5) obj, i12, tLObject);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new d5.i((v7) obj, i12, tLObject, 5));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new d5.i(tLObject, i12, (z90) obj, 9));
                break;
            case 3:
                ih.n6 n6Var = (ih.n6) obj;
                if (!(tLObject instanceof TL_stories.TL_stories_stories)) {
                    AndroidUtilities.runOnUIThread(new ih.k6(n6Var, 1));
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    while (i11 < tL_stories_stories.stories.size()) {
                        arrayList.add(n6Var.y(tL_stories_stories.stories.get(i11)));
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(new c3.d(n6Var, arrayList, tL_stories_stories, this.b, 2));
                    break;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new d5.i((mh.g4) obj, tLObject, i12, 17));
                break;
            case 5:
                ((VoIPService) obj).lambda$startScreenCapture$60(i12, tLObject, tL_error);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new rl((pt0) obj, tLObject, i12, i10));
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.x1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (!(tLObject instanceof TLRPC.TL_help_appUpdate)) {
                    if (!(tLObject instanceof TLRPC.TL_help_noAppUpdate)) {
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new hc(tL_error, 24));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new hc(23));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new rl(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i12, 29));
                    break;
                }
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new jh0((ai) obj, tLObject, i12, i11));
                break;
            default:
                AndroidUtilities.runOnUIThread(new jh0((bi1) obj, i12, tLObject, 11));
                break;
        }
    }

    public /* synthetic */ u1(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }
}
