// default package

import android.view.SurfaceView;
import org.telegram.messenger.video.VideoPlayerHolderBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class nab extends VideoPlayerHolderBase {
    public boolean a;
    public final /* synthetic */ oab b;

    public nab(oab oabVar, SurfaceView surfaceView, gab gabVar) {
        this.b = oabVar;
        if (oabVar.a) {
            with(surfaceView);
        } else {
            with(gabVar);
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final boolean needRepeat() {
        return this.b.m1;
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onRenderedFirstFrame() {
        oab oabVar = this.b;
        c40 c40Var = oabVar.G0;
        if (c40Var != null) {
            c40Var.a = true;
            this.firstFrameRendered = true;
            c40Var.m();
            if (!this.paused || oabVar.D0 == null) {
                return;
            }
            prepareStub();
        }
    }

    @Override // org.telegram.messenger.video.VideoPlayerHolderBase
    public final void onStateChanged(boolean z, int i) {
        if (i == 3 || i == 2) {
            if (this.firstFrameRendered && i == 2) {
                this.a = true;
                final byte b = 0;
                gm.c3(new Runnable(this) { // from class: mab
                    public final /* synthetic */ nab b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        nab nabVar = this.b;
                        switch (b2) {
                            case 0:
                                a58 w = nabVar.b.w();
                                if (w != null) {
                                    z48 z48Var = w.E1;
                                    if (z48Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        b10.p(z48Var.a.id, sb);
                                        break;
                                    }
                                }
                                break;
                            default:
                                a58 w2 = nabVar.b.w();
                                if (w2 != null) {
                                    z48 z48Var2 = w2.E1;
                                    if (z48Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        b10.p(z48Var2.a.id, sb2);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
            }
            if (this.a && i == 3) {
                this.a = false;
                final byte b2 = 1;
                gm.c3(new Runnable(this) { // from class: mab
                    public final /* synthetic */ nab b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        nab nabVar = this.b;
                        switch (b22) {
                            case 0:
                                a58 w = nabVar.b.w();
                                if (w != null) {
                                    z48 z48Var = w.E1;
                                    if (z48Var.a != null) {
                                        StringBuilder sb = new StringBuilder("StoryViewer displayed story buffering dialogId=");
                                        sb.append(w.getCurrentPeer());
                                        sb.append(" storyId=");
                                        b10.p(z48Var.a.id, sb);
                                        break;
                                    }
                                }
                                break;
                            default:
                                a58 w2 = nabVar.b.w();
                                if (w2 != null) {
                                    z48 z48Var2 = w2.E1;
                                    if (z48Var2.a != null) {
                                        StringBuilder sb2 = new StringBuilder("StoryViewer displayed story playing dialogId=");
                                        sb2.append(w2.getCurrentPeer());
                                        sb2.append(" storyId=");
                                        b10.p(z48Var2.a.id, sb2);
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
