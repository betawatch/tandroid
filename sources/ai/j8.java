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
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bi0;
import org.telegram.ui.lj1;
import org.telegram.ui.mi;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j8 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j8(int i10, fi.m0 m0Var) {
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
                AndroidUtilities.runOnUIThread(new s1(tLObject, i13, (fi.m0) obj, i12));
                break;
            case 1:
                e9 e9Var = (e9) obj;
                if (!(tLObject instanceof TL_stories.TL_stories_stories)) {
                    AndroidUtilities.runOnUIThread(new z8(e9Var, 1));
                    break;
                } else {
                    ArrayList arrayList = new ArrayList();
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    while (i11 < tL_stories_stories.stories.size()) {
                        arrayList.add(e9Var.y(tL_stories_stories.stories.get(i11)));
                        i11++;
                    }
                    AndroidUtilities.runOnUIThread(new d9(e9Var, arrayList, tL_stories_stories, this.b, 0));
                    break;
                }
            case 2:
                AndroidUtilities.runOnUIThread(new s1((ei.p4) obj, tLObject, i13, 10));
                break;
            case 3:
                ((VoIPService) obj).lambda$startScreenCapture$60(i13, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new zk((mv0) obj, tLObject, i13, 17));
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                Pattern pattern = LaunchActivity.B1;
                SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
                SharedConfig.saveConfig();
                if (!(tLObject instanceof TLRPC.TL_help_appUpdate)) {
                    if (!(tLObject instanceof TLRPC.TL_help_noAppUpdate)) {
                        if (tL_error != null) {
                            AndroidUtilities.runOnUIThread(new vh(tL_error, 21));
                            break;
                        }
                    } else {
                        AndroidUtilities.runOnUIThread(new vh(20));
                        break;
                    }
                } else {
                    AndroidUtilities.runOnUIThread(new zk(launchActivity, (TLRPC.TL_help_appUpdate) tLObject, i13, 29));
                    break;
                }
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new bi0((mi) obj, tLObject, i13, i11));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new bi0((lj1) obj, i13, tLObject, 16));
                break;
            case 8:
                yh.s3.V((yh.s3) obj, i13, tLObject);
                break;
            default:
                AndroidUtilities.runOnUIThread(new bi0((yh.m5) obj, i13, tLObject, 23));
                break;
        }
    }

    public /* synthetic */ j8(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }
}
