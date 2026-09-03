package hg;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import oh.i9;
import oh.l3;
import oh.n3;
import oh.v7;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        int i10 = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        KeyEvent.Callback callback = this.b;
        switch (i10) {
            case 0:
                ((w1) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                n3 n3Var = (n3) callback;
                v7 v7Var = (v7) obj4;
                i9 i9Var = (i9) obj3;
                g6 g6Var = (g6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    ic Q = new qc(n3Var.w0.Z0, g6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = v7Var.b.longValue();
                        i9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.G(n3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.l1 = new l3(i9Var, 0);
                        i9Var.P();
                        break;
                    }
                }
                break;
        }
    }
}
