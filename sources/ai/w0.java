package ai;

import fi.b7;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w0(b1 b1Var, boolean z10, float[] fArr, long j3, int i7) {
        this.e = b1Var;
        this.d = z10;
        this.f = fArr;
        this.c = j3;
        this.b = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_stories.StoryItem storyItem;
        int i7 = this.a;
        r2 = null;
        b7 a10 = null;
        boolean z10 = this.d;
        long j3 = this.c;
        int i10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i7) {
            case 0:
                b1 b1Var = (b1) obj2;
                float[] fArr = (float[]) obj;
                ExecutorService executorService = DictationLid.a;
                b1Var.a(z10 ? fArr : null, j3, i10);
                break;
            default:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLObject tLObject = (TLObject) obj;
                String str = LaunchActivity.C1;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= tL_stories_stories.stories.size()) {
                            storyItem = null;
                        } else if (tL_stories_stories.stories.get(i11).id == i10) {
                            storyItem = tL_stories_stories.stories.get(i11);
                        } else {
                            i11++;
                        }
                    }
                    if (storyItem != null) {
                        storyItem.dialogId = j3;
                        org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            if (Q instanceof yw) {
                                try {
                                    a10 = b7.a(((yw) Q).F0.h);
                                } catch (Exception unused) {
                                }
                            }
                            b7 b7Var = a10;
                            Q.getOrCreateStoryViewer().B();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (z10) {
                                Q.getOrCreateStoryViewer().w1 = true;
                            }
                            Q.getOrCreateStoryViewer().M(launchActivity, storyItem, arrayList, 0, null, null, b7Var, false);
                            break;
                        }
                    }
                }
                cc.X().Q(R.raw.error, 36, hd.M0(2131744606, null)).k(false);
                break;
        }
    }

    public /* synthetic */ w0(LaunchActivity launchActivity, TLObject tLObject, int i7, long j3, boolean z10) {
        this.e = launchActivity;
        this.f = tLObject;
        this.b = i7;
        this.c = j3;
        this.d = z10;
    }
}
