package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class n00 implements oc, nc {
    public final /* synthetic */ a10 a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ y00 c;

    public /* synthetic */ n00(a10 a10Var, TL_stories.StoryItem storyItem, y00 y00Var) {
        this.a = a10Var;
        this.b = storyItem;
        this.c = y00Var;
    }

    @Override // org.telegram.messenger.oc
    public void a(String str) {
        g0.g3(new ul(this.a, this.b, str, this.c, 28));
    }

    @Override // org.telegram.messenger.nc
    public void q(Exception exc) {
        g0.g3(new pz(this.a, this.b, this.c, 1));
    }
}
