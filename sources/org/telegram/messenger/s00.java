package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class s00 implements pc, oc {
    public final /* synthetic */ f10 a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ d10 c;

    public /* synthetic */ s00(f10 f10Var, TL_stories.StoryItem storyItem, d10 d10Var) {
        this.a = f10Var;
        this.b = storyItem;
        this.c = d10Var;
    }

    @Override // org.telegram.messenger.pc
    public void a(String str) {
        g0.h3(new em(this.a, this.b, str, this.c, 28));
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        g0.h3(new uz(this.a, this.b, this.c, 1));
    }
}
