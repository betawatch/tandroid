package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oy;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class hg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hg(BaseController baseController, long j10, List list, boolean z4, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j10;
        this.f = list;
        this.c = z4;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nh.c7 c7Var;
        TL_stories.StoryItem storyItem;
        int i10 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i10) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.b, (List) obj, this.c, this.d);
                break;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.b, (ArrayList) obj, this.c, this.d);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.y1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        c7Var = null;
                        if (i11 >= tL_stories_stories.stories.size()) {
                            storyItem = null;
                        } else if (tL_stories_stories.stories.get(i11).id == this.d) {
                            storyItem = tL_stories_stories.stories.get(i11);
                        } else {
                            i11++;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof oy) {
                                try {
                                    c7Var = nh.c7.a(((oy) R).B0.h);
                                } catch (Exception unused) {
                                }
                            }
                            nh.c7 c7Var2 = c7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.c) {
                                R.getOrCreateStoryViewer().t1 = true;
                            }
                            R.getOrCreateStoryViewer().F(launchActivity, storyItem, arrayList, 0, null, null, c7Var2, false);
                            break;
                        }
                    }
                }
                org.telegram.ui.Components.qc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                break;
        }
    }

    public /* synthetic */ hg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z4) {
        this.a = 2;
        this.e = launchActivity;
        this.f = tLObject;
        this.d = i10;
        this.b = j10;
        this.c = z4;
    }
}
