package bi;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ei;
import org.telegram.ui.ei1;
import org.telegram.ui.yx;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l2(int i10, ua uaVar) {
        this.a = 2;
        this.b = i10;
        this.c = uaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 20;
        int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                h7.e0((h7) obj, i12, tLObject);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ai.h0((ca) obj, i12, tLObject, 4));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ai.h0(tLObject, i12, (ua) obj, 7));
                break;
            case 3:
                di.z6 z6Var = (di.z6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i13 = 0; i13 < tL_stories_stories.stories.size(); i13++) {
                        arrayList.add(z6Var.y(tL_stories_stories.stories.get(i13)));
                    }
                    AndroidUtilities.runOnUIThread(new ai.h1(z6Var, arrayList, tL_stories_stories, this.b, 3));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new di.w6(z6Var, 1));
                    break;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new ai.h0((hi.o4) obj, tLObject, i12, 16));
                break;
            case 5:
                ((VoIPService) obj).lambda$startScreenCapture$60(i12, tLObject, tL_error);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.g4((mv0) obj, tLObject, i12, i11));
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.D1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new yx(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i12, 2));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(28));
                    break;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k5(tL_error));
                    break;
                }
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new yx((ei) obj, tLObject, i12, 3));
                break;
            default:
                AndroidUtilities.runOnUIThread(new yx((ei1) obj, i12, tLObject, i11));
                break;
        }
    }

    public /* synthetic */ l2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
