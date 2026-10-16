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
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ve;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c90;
import org.telegram.ui.gm;
import org.telegram.ui.qi;
import org.telegram.ui.rj1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u7 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u7(int i10, gi.m0 m0Var) {
        this.a = 0;
        this.b = i10;
        this.c = m0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        int i13 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ah.o(tLObject, i13, (gi.m0) obj, 2));
                break;
            case 1:
                o8 o8Var = (o8) obj;
                if (!(tLObject instanceof TL_stories.TL_stories_stories)) {
                    AndroidUtilities.runOnUIThread(new j8(o8Var, 1));
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    while (i11 < tL_stories_stories.stories.size()) {
                        arrayList.add(o8Var.y(tL_stories_stories.stories.get(i11)));
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(new n8(o8Var, arrayList, tL_stories_stories, this.b, 0));
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new ah.o((fi.q4) obj, tLObject, i13, 11));
                break;
            case 3:
                ((VoIPService) obj).lambda$startScreenCapture$60(i13, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new gm((iv0) obj, tLObject, i13, 18));
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (!(tLObject instanceof TLRPC.TL_help_appUpdate)) {
                    if (!(tLObject instanceof TLRPC.TL_help_noAppUpdate)) {
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new ve(tL_error, 22));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new ve(21));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new c90(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i13, i11));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new c90((qi) obj, tLObject, i13, i12));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new c90((rj1) obj, i13, tLObject, 17));
                break;
            case 8:
                zh.r3.V((zh.r3) obj, i13, tLObject);
                break;
            default:
                AndroidUtilities.runOnUIThread(new c90((zh.n5) obj, i13, tLObject, 24));
                break;
        }
    }

    public /* synthetic */ u7(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
