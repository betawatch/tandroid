package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wy;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class og implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ og(BaseController baseController, long j3, List list, boolean z10, int i10, int i11) {
        this.a = i11;
        this.e = baseController;
        this.b = j3;
        this.f = list;
        this.c = z10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zh.s5 s5Var;
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
                Pattern pattern = LaunchActivity.B1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        s5Var = null;
                        if (i11 >= tL_stories_stories.stories.size()) {
                            storyItem = null;
                        } else if (tL_stories_stories.stories.get(i11).id == this.d) {
                            storyItem = tL_stories_stories.stories.get(i11);
                        } else {
                            i11++;
                        }
                    }
                    if (storyItem != null) {
                        long j3 = this.b;
                        storyItem.dialogId = j3;
                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                        if (R != null) {
                            if (R instanceof wy) {
                                try {
                                    s5Var = zh.s5.a(((wy) R).E0.h);
                                } catch (Exception unused) {
                                }
                            }
                            zh.s5 s5Var2 = s5Var;
                            R.getOrCreateStoryViewer().v();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (this.c) {
                                R.getOrCreateStoryViewer().w1 = true;
                            }
                            R.getOrCreateStoryViewer().F(launchActivity, storyItem, arrayList, 0, null, null, s5Var2, false);
                            break;
                        }
                    }
                }
                org.telegram.ui.Components.wc.X().Q(R.raw.error, 36, LocaleController.getString(R.string.StoryNotFound)).k(false);
                break;
        }
    }

    public /* synthetic */ og(LaunchActivity launchActivity, TLObject tLObject, int i10, long j3, boolean z10) {
        this.a = 2;
        this.e = launchActivity;
        this.f = tLObject;
        this.d = i10;
        this.b = j3;
        this.c = z10;
    }
}
