package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
