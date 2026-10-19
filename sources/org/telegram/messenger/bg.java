package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class bg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bg(BaseController baseController, long j10, List list, boolean z10, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j10;
        this.f = list;
        this.c = z10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ci.r7 r7Var;
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
                Pattern pattern = LaunchActivity.C1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        r7Var = null;
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
                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof cy) {
                                try {
                                    r7Var = ci.r7.a(((cy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            ci.r7 r7Var2 = r7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.c) {
                                R.getOrCreateStoryViewer().w1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, r7Var2, false);
                            break;
                        }
                    }
                }
                org.telegram.ui.Components.xc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                break;
        }
    }

    public /* synthetic */ bg(LaunchActivity launchActivity, TLObject tLObject, int i10, long j10, boolean z10) {
        this.a = 2;
        this.e = launchActivity;
        this.f = tLObject;
        this.d = i10;
        this.b = j10;
        this.c = z10;
    }
}
