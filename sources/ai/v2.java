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
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yi0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class v2 {
    public final long a;
    public final float b;
    public final float c;
    public final yi0 d;
    public final Paint e;
    public final ImageReceiver f;
    public final h01 g;
    public boolean h;
    public final org.telegram.ui.Components.c6 i;
    public final org.telegram.ui.Components.c6 j;

    public v2(w2 w2Var, View view, int i10, long j3, int i11, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = j3;
        this.b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = w2Var.f;
            yi0 yi0Var = new yi0(iArr[Utilities.fastRandom.nextInt(iArr.length)], AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
            this.d = yi0Var;
            yi0Var.R(view);
            yi0Var.J(true);
            yi0Var.K(0);
            yi0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j3);
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
        f9Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, f9Var);
        view.addOnAttachStateChangeListener(new u2(this, 0));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        oq oqVar = new oq(R.drawable.star, 0);
        oqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(oqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i11, ','));
        this.g = new h01(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(view, 2000L, new LinearInterpolator());
        this.i = c6Var;
        c6Var.d(0.0f, true);
        c6Var.d(1.0f, false);
        this.j = new org.telegram.ui.Components.c6(view, 350L, 240L, qr.h);
    }
}
