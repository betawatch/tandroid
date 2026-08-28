package bg;

import android.view.KeyEvent;
import ih.m9;
import ih.n3;
import ih.p3;
import ih.z7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v1(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = callback;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        int i9 = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        KeyEvent.Callback callback = this.b;
        switch (i9) {
            case 0:
                ((g2) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
            default:
                p3 p3Var = (p3) callback;
                z7 z7Var = (z7) obj4;
                m9 m9Var = (m9) obj3;
                b6 b6Var = (b6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    gc Q = new oc(p3Var.v0.Y0, b6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = z7Var.b.longValue();
                        m9 createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(p3Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.k1 = new n3(m9Var, 0);
                        m9Var.P();
                        break;
                    }
                }
                break;
        }
    }
}
