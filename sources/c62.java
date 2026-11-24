// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class c62 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ c62(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, byte b) {
        this.a = b;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (b) {
            case 0:
                ImageView imageView = chatAttachAlertPhotoLayout.s0;
                m62 m62Var = chatAttachAlertPhotoLayout.Q;
                imageView.setImageResource((m62Var == null || !m62Var.isFrontface()) ? R.drawable.camera_revert2 : R.drawable.camera_revert1);
                ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.SCALE_X, 1.0f).setDuration(100L).start();
                break;
            case 1:
                chatAttachAlertPhotoLayout.n0 = null;
                break;
            case 2:
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.e0 = false;
                m62 m62Var2 = chatAttachAlertPhotoLayout.Q;
                if (m62Var2 != null) {
                    m62Var2.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                if (chatAttachAlertPhotoLayout.c0) {
                    chatAttachAlertPhotoLayout.b.W3.b0();
                }
                m62 m62Var3 = chatAttachAlertPhotoLayout.Q;
                if (m62Var3 != null) {
                    m62Var3.setSystemUiVisibility(1028);
                }
                d62 d62Var = chatAttachAlertPhotoLayout.F;
                if (d62Var != null) {
                    d62Var.invalidate();
                    break;
                }
                break;
            default:
                b1d b1dVar = chatAttachAlertPhotoLayout.m0;
                chatAttachAlertPhotoLayout.g1.e();
                chatAttachAlertPhotoLayout.j1 = false;
                chatAttachAlertPhotoLayout.setAlertKeepScreenOn(false);
                chatAttachAlertPhotoLayout.setCameraOpenProgress(0.0f);
                chatAttachAlertPhotoLayout.e0 = false;
                d62 d62Var2 = chatAttachAlertPhotoLayout.F;
                if (d62Var2 != null) {
                    d62Var2.invalidate();
                }
                m62 m62Var4 = chatAttachAlertPhotoLayout.Q;
                if (m62Var4 != null) {
                    m62Var4.invalidateOutline();
                    chatAttachAlertPhotoLayout.Q.invalidate();
                }
                chatAttachAlertPhotoLayout.c0 = false;
                yd ydVar = chatAttachAlertPhotoLayout.k0;
                if (ydVar != null) {
                    ydVar.setVisibility(8);
                }
                if (b1dVar != null) {
                    b1dVar.setVisibility(8);
                    b1dVar.setTag(null);
                }
                d62 d62Var3 = chatAttachAlertPhotoLayout.r;
                if (d62Var3 != null) {
                    d62Var3.setVisibility(8);
                }
                m62 m62Var5 = chatAttachAlertPhotoLayout.Q;
                if (m62Var5 != null) {
                    m62Var5.setFpsLimit(30);
                    chatAttachAlertPhotoLayout.Q.setSystemUiVisibility(1024);
                    break;
                }
                break;
        }
    }
}
