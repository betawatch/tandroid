package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k00 implements jc, ic {
    public final /* synthetic */ x00 a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ v00 c;

    public /* synthetic */ k00(x00 x00Var, TL_stories.StoryItem storyItem, v00 v00Var) {
        this.a = x00Var;
        this.b = storyItem;
        this.c = v00Var;
    }

    @Override // org.telegram.messenger.jc
    public void a(String str) {
        g0.h3(new ul(this.a, this.b, str, this.c, 28));
    }

    @Override // org.telegram.messenger.ic
    public void s(Exception exc) {
        g0.h3(new mz(this.a, this.b, this.c, 1));
    }
}
