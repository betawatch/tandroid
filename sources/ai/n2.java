package ai;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.di;
import org.telegram.ui.vh1;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class n2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n2(int i10, ua uaVar) {
        this.a = 2;
        this.b = i10;
        this.c = uaVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 22;
        int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                l7.f0((l7) obj, i12, tLObject);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ah.o((ga) obj, i12, tLObject, 3));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new ah.o(tLObject, i12, (ua) obj, 6));
                break;
            case 3:
                ci.a7 a7Var = (ci.a7) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i13 = 0; i13 < tL_stories_stories.stories.size(); i13++) {
                        arrayList.add(a7Var.y(tL_stories_stories.stories.get(i13)));
                    }
                    AndroidUtilities.runOnUIThread(new cb(a7Var, arrayList, tL_stories_stories, this.b, 1));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ci.x6(a7Var, 1));
                    break;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new ah.o((gi.f4) obj, tLObject, i12, 15));
                break;
            case 5:
                ((VoIPService) obj).lambda$startScreenCapture$60(i12, tLObject, tL_error);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.i4((ev0) obj, tLObject, i12, i11));
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.C1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new x31(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i12, 4));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(25));
                    break;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(tL_error, 26));
                    break;
                }
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new x31((di) obj, tLObject, i12, 5));
                break;
            default:
                AndroidUtilities.runOnUIThread(new x31((vh1) obj, i12, tLObject, i11));
                break;
        }
    }

    public /* synthetic */ n2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
