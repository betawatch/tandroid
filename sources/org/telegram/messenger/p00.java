package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class p00 implements oc, nc {
    public final /* synthetic */ c10 a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ a10 c;

    public /* synthetic */ p00(c10 c10Var, TL_stories.StoryItem storyItem, a10 a10Var) {
        this.a = c10Var;
        this.b = storyItem;
        this.c = a10Var;
    }

    @Override // org.telegram.messenger.oc
    public void a(String str) {
        g0.h3(new bm(this.a, this.b, str, this.c, 28));
    }

    @Override // org.telegram.messenger.nc
    public void r(Exception exc) {
        g0.h3(new sz(this.a, this.b, this.c, 1));
    }
}
