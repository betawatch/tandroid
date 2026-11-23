package ai;

import fi.y6;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y0(z0 z0Var, boolean z10, float[] fArr, long j3, int i7) {
        this.e = z0Var;
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
        y6 a10 = null;
        boolean z10 = this.d;
        long j3 = this.c;
        int i10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i7) {
            case 0:
                z0 z0Var = (z0) obj2;
                float[] fArr = (float[]) obj;
                ExecutorService executorService = DictationLid.a;
                z0Var.a(z10 ? fArr : null, j3, i10);
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
                        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                        if (Q != null) {
                            if (Q instanceof bx) {
                                try {
                                    a10 = y6.a(((bx) Q).F0.h);
                                } catch (Exception unused) {
                                }
                            }
                            y6 y6Var = a10;
                            Q.getOrCreateStoryViewer().B();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(Long.valueOf(j3));
                            if (z10) {
                                Q.getOrCreateStoryViewer().w1 = true;
                            }
                            Q.getOrCreateStoryViewer().M(launchActivity, storyItem, arrayList, 0, null, null, y6Var, false);
                            break;
                        }
                    }
                }
                kc.Y().Q(R.raw.error, 36, gd.N0(2131744362, null)).k(false);
                break;
        }
    }

    public /* synthetic */ y0(LaunchActivity launchActivity, TLObject tLObject, int i7, long j3, boolean z10) {
        this.e = launchActivity;
        this.f = tLObject;
        this.b = i7;
        this.c = j3;
        this.d = z10;
    }
}
