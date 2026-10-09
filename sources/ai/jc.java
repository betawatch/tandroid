package ai;

import android.view.SurfaceView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class jc extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ kc b;

    public jc(kc kcVar, SurfaceView surfaceView, cc ccVar) {
        this.b = kcVar;
        if (kcVar.a) {
            with(surfaceView);
        } else {
            with(ccVar);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        kc kcVar = this.b;
        e6 e6Var = kcVar.G0;
        if (e6Var == null) {
            return;
        }
        e6Var.a = true;
        this.firstFrameRendered = true;
        e6Var.b();
        if (!this.paused || kcVar.C0 == null) {
            return;
        }
        prepareStub();
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z10, int i10) {
        if (i10 == 3 || i10 == 2) {
            if (this.firstFrameRendered && i10 == 2) {
                this.a = true;
                final int i11 = 0;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ai.ic
                    public final /* synthetic */ jc b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                f6 t10 = this.b.b.t();
                                if (t10 != null) {
                                    d6 d6Var = t10.O1;
                                    if (d6Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.q.o(d6Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                f6 t11 = this.b.b.t();
                                if (t11 != null) {
                                    d6 d6Var2 = t11.O1;
                                    if (d6Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.q.o(d6Var2.a.id, sb3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.a && i10 == 3) {
                this.a = false;
                final int i12 = 1;
                AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: ai.ic
                    public final /* synthetic */ jc b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                f6 t10 = this.b.b.t();
                                if (t10 != null) {
                                    d6 d6Var = t10.O1;
                                    if (d6Var.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb2.append(t10.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        org.telegram.messenger.q.o(d6Var.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                            default:
                                f6 t11 = this.b.b.t();
                                if (t11 != null) {
                                    d6 d6Var2 = t11.O1;
                                    if (d6Var2.a != null) {
                                        StringBuilder sb3 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb3.append(t11.getCurrentPeer());
                                        sb3.append(" storyId=");
                                        org.telegram.messenger.q.o(d6Var2.a.id, sb3);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
        }
    }
}
