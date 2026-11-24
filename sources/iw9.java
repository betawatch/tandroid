// default package

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class iw9 extends Fade {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SecretMediaViewer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw9(SecretMediaViewer secretMediaViewer, boolean z, boolean z2, byte b) {
        super(1);
        this.a = b;
        switch (b) {
            case 1:
                this.d = secretMediaViewer;
                this.b = z;
                this.c = z2;
                super(2);
                break;
            default:
                this.d = secretMediaViewer;
                this.b = z;
                this.c = z2;
                break;
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 0:
                Animator onAppear = super.onAppear(viewGroup, view, transitionValues, transitionValues2);
                if (this.b && !this.c && view == this.d.Y) {
                    onAppear.addListener(new c39((Object) this, (byte) 7));
                    ((ObjectAnimator) onAppear).addUpdateListener(new p29(this, (byte) 14));
                }
                return onAppear;
            default:
                return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
        }
    }

    @Override // android.transition.Fade, android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        switch (this.a) {
            case 1:
                Animator onDisappear = super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
                if (!this.b && this.c && view == this.d.Y) {
                    onDisappear.addListener(new c39((Object) this, (byte) 8));
                    ((ObjectAnimator) onDisappear).addUpdateListener(new p29(this, (byte) 15));
                }
                return onDisappear;
            default:
                return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
        }
    }
}
