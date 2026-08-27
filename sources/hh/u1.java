package hh;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.st0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai1;
import org.telegram.ui.ci;
import org.telegram.ui.da0;
import org.telegram.ui.ol0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class u1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u1(int i10, da0 da0Var) {
        this.a = 2;
        this.b = i10;
        this.c = da0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                i5.U((i5) obj, i11, tLObject);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new d5.i((u7) obj, i11, tLObject, 5));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new d5.i(tLObject, i11, (da0) obj, 9));
                break;
            case 3:
                jh.j6 j6Var = (jh.j6) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(j6Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new ag.k0(j6Var, arrayList, tL_stories_stories, this.b, 3));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new jh.g6(j6Var, 1));
                    break;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new d5.i((nh.e4) obj, tLObject, i11, 17));
                break;
            case 5:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new km((st0) obj, tLObject, i11, 16));
                break;
            case 7:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.x1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new km(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 28));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new gc(22));
                    break;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new gc(tL_error, 23));
                    break;
                }
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new km((ci) obj, tLObject, i11, 29));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ol0((ai1) obj, i11, tLObject, 10));
                break;
        }
    }

    public /* synthetic */ u1(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
