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
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.xm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bj1;
import org.telegram.ui.ji;
import org.telegram.ui.wl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i8(int i10, fi.m0 m0Var) {
        this.a = 0;
        this.b = i10;
        this.c = m0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 10;
        int i12 = 1;
        int i13 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(tLObject, i13, (fi.m0) obj, i12));
                break;
            case 1:
                d9 d9Var = (d9) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i14 = 0; i14 < tL_stories_stories.stories.size(); i14++) {
                        arrayList.add(d9Var.y(tL_stories_stories.stories.get(i14)));
                    }
                    AndroidUtilities.runOnUIThread(new c9(d9Var, arrayList, tL_stories_stories, this.b, 0));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new y8(d9Var, 1));
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new s1((ei.q4) obj, tLObject, i13, i11));
                break;
            case 3:
                ((VoIPService) obj).lambda$startScreenCapture$60(i13, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new xm((uu0) obj, tLObject, i13, 16));
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new xm(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i13, 28));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new th(20));
                    break;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new th(tL_error, 21));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new xm((ji) obj, tLObject, i13, 29));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new wl0((bj1) obj, i13, tLObject, i11));
                break;
            case 8:
                yh.x3.U((yh.x3) obj, i13, tLObject);
                break;
            default:
                AndroidUtilities.runOnUIThread(new wl0((yh.s5) obj, i13, tLObject, 17));
                break;
        }
    }

    public /* synthetic */ i8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
