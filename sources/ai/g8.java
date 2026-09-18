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
import org.telegram.ui.Components.sh;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.Components.wm;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fm0;
import org.telegram.ui.hj1;
import org.telegram.ui.li;
import org.telegram.ui.va0;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class g8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g8(int i10, va0 va0Var) {
        this.a = 0;
        this.b = i10;
        this.c = va0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.a;
        int i11 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new s1(tLObject, i11, (va0) obj, 1));
                break;
            case 1:
                d9 d9Var = (d9) obj;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        arrayList.add(d9Var.y(tL_stories_stories.stories.get(i12)));
                    }
                    AndroidUtilities.runOnUIThread(new c9(d9Var, arrayList, tL_stories_stories, this.b, 0));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new y8(d9Var, 1));
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new s1((ei.q4) obj, tLObject, i11, 10));
                break;
            case 3:
                ((VoIPService) obj).lambda$startScreenCapture$60(i11, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new wm((vu0) obj, tLObject, i11, 16));
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (tLObject instanceof TLRPC.TL_help_appUpdate) {
                    AndroidUtilities.runOnUIThread(new wm(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i11, 28));
                    break;
                } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
                    AndroidUtilities.runOnUIThread(new sh(18));
                    break;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new sh(tL_error, 19));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new wm((li) obj, tLObject, i11, 29));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new fm0((hj1) obj, i11, tLObject, 10));
                break;
            case 8:
                yh.y3.U((yh.y3) obj, i11, tLObject);
                break;
            default:
                AndroidUtilities.runOnUIThread(new fm0((yh.t5) obj, i11, tLObject, 17));
                break;
        }
    }

    public /* synthetic */ g8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
