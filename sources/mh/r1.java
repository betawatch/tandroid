package mh;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.jc;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.ii;
import org.telegram.ui.la0;
import org.telegram.ui.si1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r1(int i10, la0 la0Var) {
        this.a = 2;
        this.b = i10;
        this.c = la0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 14;
        int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                g5.U((g5) obj, i12, tLObject);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new bh.a((t7) obj, i12, tLObject, 9));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new bh.a(tLObject, i12, (la0) obj, 14));
                break;
            case 3:
                oh.l6 l6Var = (oh.l6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i13 = 0; i13 < tL_stories_stories.stories.size(); i13++) {
                        arrayList.add(l6Var.y(tL_stories_stories.stories.get(i13)));
                    }
                    AndroidUtilities.runOnUIThread(new dg.u1(l6Var, arrayList, tL_stories_stories, this.b, 5));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new oh.i6(l6Var, 1));
                    break;
                }
            case 4:
                ((VoIPService) obj).lambda$startScreenCapture$60(i12, tLObject, tL_error);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new gy((ku0) obj, tLObject, i12, i11));
                break;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.y1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new gy(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i12, 26));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new jc(23));
                    break;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new jc(tL_error, 24));
                    break;
                }
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new gy((ii) obj, tLObject, i12, 27));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new bu0((si1) obj, i12, tLObject, 8));
                break;
            default:
                AndroidUtilities.runOnUIThread(new bu0((sh.n3) obj, tLObject, i12, 16));
                break;
        }
    }

    public /* synthetic */ r1(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
