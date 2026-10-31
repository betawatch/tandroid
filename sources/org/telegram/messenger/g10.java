package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class g10 implements qc, pc {
    public final /* synthetic */ t10 a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ r10 c;

    public /* synthetic */ g10(t10 t10Var, TL_stories.StoryItem storyItem, r10 r10Var) {
        this.a = t10Var;
        this.b = storyItem;
        this.c = r10Var;
    }

    @Override // org.telegram.messenger.qc
    public void a(String str) {
        i0.g3(new ul(this.a, this.b, str, this.c, 28));
    }

    @Override // org.telegram.messenger.pc
    public void q(Exception exc) {
        i0.g3(new e00(this.a, this.b, this.c, 2));
    }
}
