package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class m00 implements nc, mc {
    public final /* synthetic */ z00 a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ x00 c;

    public /* synthetic */ m00(z00 z00Var, TL_stories.StoryItem storyItem, x00 x00Var) {
        this.a = z00Var;
        this.b = storyItem;
        this.c = x00Var;
    }

    @Override // org.telegram.messenger.nc
    public void a(String str) {
        g0.g3(new tl(this.a, this.b, str, this.c, 28));
    }

    @Override // org.telegram.messenger.mc
    public void q(Exception exc) {
        g0.g3(new oz(this.a, this.b, this.c, 1));
    }
}
