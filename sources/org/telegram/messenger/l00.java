package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class l00 implements nc, mc {
    public final /* synthetic */ y00 a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ w00 c;

    public /* synthetic */ l00(y00 y00Var, TL_stories.StoryItem storyItem, w00 w00Var) {
        this.a = y00Var;
        this.b = storyItem;
        this.c = w00Var;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        g0.g3(new tl(this.a, this.b, str, this.c, 28));
    }

    @Override // org.telegram.messenger.mc
    public void s(Exception exc) {
        g0.g3(new nz(this.a, this.b, this.c, 1));
    }
}
