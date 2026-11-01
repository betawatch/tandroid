package org.telegram.messenger;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class h10 implements rc, qc {
    public final /* synthetic */ u10 a;
    public final /* synthetic */ TL_stories.StoryItem b;
    public final /* synthetic */ s10 c;

    public /* synthetic */ h10(u10 u10Var, TL_stories.StoryItem storyItem, s10 s10Var) {
        this.a = u10Var;
        this.b = storyItem;
        this.c = s10Var;
    }

    @Override // org.telegram.messenger.rc
    public void a(String str) {
        i0.g3(new vl(this.a, this.b, str, this.c, 28));
    }

    @Override // org.telegram.messenger.qc
    public void p(Exception exc) {
        i0.g3(new f00(this.a, this.b, this.c, 2));
    }
}
