package ai;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class c5 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c5(KeyEvent.Callback callback, Object obj, Object obj2, Object obj3, int i10) {
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
                h5 h5Var = (h5) callback;
                sa saVar = (sa) obj4;
                jc jcVar = (jc) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                if (storyItem == null) {
                    org.telegram.ui.Components.pc Q = new xc(h5Var.z0.c1, f6Var).Q(R.raw.story_bomb2, 36, LocaleController.getString(R.string.StoryNotFound));
                    Q.a = 3;
                    Q.k(true);
                    break;
                } else {
                    org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                    if (R != null) {
                        storyItem.dialogId = saVar.b.longValue();
                        jc createOverlayStoryViewer = R.createOverlayStoryViewer();
                        createOverlayStoryViewer.F(h5Var.getContext(), storyItem, null);
                        createOverlayStoryViewer.o1 = new e5(jcVar, 0);
                        jcVar.P();
                        break;
                    }
                }
                break;
            default:
                ((tg.s0) callback).dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.boostedChannelByUser, (TL_stories.TL_premium_myBoosts) obj4, Integer.valueOf(((ArrayList) obj3).size()), Integer.valueOf(((HashSet) obj2).size()), (TL_stories.TL_premium_boostsStatus) obj);
                break;
        }
    }
}
