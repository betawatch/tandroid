package bi;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class n4 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n4(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        KeyEvent.Callback callback = this.b;
        switch (i10) {
            case 0:
                s4 s4Var = (s4) callback;
                z9 z9Var = (z9) obj4;
                pb pbVar = (pb) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    qc Q = new yc(s4Var.z0.c1, f6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = z9Var.b.longValue();
                        pb createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(s4Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new p4(pbVar, 0);
                        pbVar.P();
                        break;
                    }
                }
                break;
            default:
                ((ug.t0) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
