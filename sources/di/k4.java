package di;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.nj1;
import org.telegram.ui.oi;
import org.telegram.ui.ta0;
import org.telegram.ui.uu0;
import xh.v5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class k4 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k4(int i10, ta0 ta0Var) {
        this.a = 8;
        this.b = i10;
        this.c = ta0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = 14;
        int i12 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new bi.g3((u4) obj, tLObject, i12, 6));
                break;
            case 1:
                ((VoIPService) obj).lambda$startScreenCapture$60(i12, tLObject, tL_error);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new my((tu0) obj, tLObject, i12, i11));
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new my(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i12, 26));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new c30(13));
                    break;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new c30(tL_error, i11));
                    break;
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new my((oi) obj, tLObject, i12, 27));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new uu0((nj1) obj, i12, tLObject, 8));
                break;
            case 6:
                xh.x3.U((xh.x3) obj, i12, tLObject);
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new uu0((v5) obj, i12, tLObject, 14));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new uu0(tLObject, i12, (ta0) obj, 18));
                break;
            default:
                zh.a5 a5Var = (zh.a5) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i13 = 0; i13 < tL_stories_stories.stories.size(); i13++) {
                        arrayList.add(a5Var.y(tL_stories_stories.stories.get(i13)));
                    }
                    AndroidUtilities.runOnUIThread(new g21(a5Var, arrayList, tL_stories_stories, this.b, 18));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new zh.x4(a5Var, 1));
                    break;
                }
        }
    }

    public /* synthetic */ k4(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
