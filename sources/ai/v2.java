package ai;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.v01;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class v2 {
    public final long a;
    public final float b;
    public final float c;
    public final kj0 d;
    public final Paint e;
    public final ImageReceiver f;
    public final v01 g;
    public boolean h;
    public final org.telegram.ui.Components.e6 i;
    public final org.telegram.ui.Components.e6 j;

    public v2(w2 w2Var, View view, int i10, long j3, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = j3;
        this.b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = w2Var.f;
            kj0 kj0Var = new kj0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = kj0Var;
            kj0Var.R(view);
            kj0Var.J(true);
            kj0Var.K(0);
            kj0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        h9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, h9Var);
        view.addOnAttachStateChangeListener(new u2(this, 0));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        qq qqVar = new qq(R.drawable.star, 0);
        qqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(qqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.g = new v01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(view, 2000L, new LinearInterpolator());
        this.i = e6Var;
        e6Var.d(0.0f, true);
        e6Var.d(1.0f, false);
        this.j = new org.telegram.ui.Components.e6(view, 350L, 240L, sr.h);
    }
}
