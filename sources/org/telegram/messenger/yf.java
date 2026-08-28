package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class yf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yf(BaseController baseController, long j10, List list, boolean z10, int i9, int i10) {
        this.a = i10;
        this.e = baseController;
        this.b = j10;
        this.f = list;
        this.c = z10;
        this.d = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ih.e7 e7Var;
        TL_stories.StoryItem storyItem;
        int i9 = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i9) {
            case 0:
                ((MessagesStorage) obj2).lambda$saveTopics$47(this.b, (List) obj, this.c, this.d);
                break;
            case 1:
                ((TopicsController) obj2).lambda$loadTopics$0(this.b, (ArrayList) obj, this.c, this.d);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.x1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i10 = 0;
                    while (true) {
                        e7Var = null;
                        if (i10 >= tL_stories_stories.stories.size()) {
                            storyItem = null;
                        } else if (tL_stories_stories.stories.get(i10).id == this.d) {
                            storyItem = tL_stories_stories.stories.get(i10);
                        } else {
                            i10++;
                        }
                    }
                    if (storyItem != null) {
                        long j10 = this.b;
                        storyItem.dialogId = j10;
                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof dy) {
                                try {
                                    e7Var = ih.e7.a(((dy) R).A0.h);
                                } catch (Exception unused) {
                                }
                            }
                            ih.e7 e7Var2 = e7Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j10));
                            if (this.c) {
                                R.getOrCreateStoryViewer().s1 = true;
                            }
                            R.getOrCreateStoryViewer().G(launchActivity, storyItem, arrayList, 0, null, null, e7Var2, false);
                            break;
                        }
                    }
                }
                org.telegram.ui.Components.oc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                break;
        }
    }

    public /* synthetic */ yf(LaunchActivity launchActivity, TLObject tLObject, int i9, long j10, boolean z10) {
        this.a = 2;
        this.e = launchActivity;
        this.f = tLObject;
        this.d = i9;
        this.b = j10;
        this.c = z10;
    }
}
