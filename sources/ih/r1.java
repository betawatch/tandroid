package ih;

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
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class r1 {
    public final long a;
    public final float b;
    public final float c;
    public final mi0 d;
    public final Paint e;
    public final ImageReceiver f;
    public final nz0 g;
    public boolean h;
    public final org.telegram.ui.Components.y5 i;
    public final org.telegram.ui.Components.y5 j;

    public r1(s1 s1Var, View view, int i9, long j10, int i10, boolean z10) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.a = j10;
        this.b = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        this.c = Utilities.clamp01(Utilities.fastRandom.nextFloat());
        if (z10) {
            int[] iArr = s1Var.f;
            int i11 = iArr[Utilities.fastRandom.nextInt(iArr.length)];
            mi0 mi0Var = new mi0(i11, AndroidUtilities.dp(70.0f), j3.r0.l(i11, ""), AndroidUtilities.dp(70.0f));
            this.d = mi0Var;
            mi0Var.r0 = view;
            mi0Var.H(true);
            mi0Var.I(0);
            mi0Var.start();
        }
        TLObject userOrChat = MessagesController.getInstance(i9).getUserOrChat(j10);
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        z8Var.p(userOrChat);
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f = imageReceiver;
        imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        imageReceiver.setForUserOrChat(userOrChat, z8Var);
        view.addOnAttachStateChangeListener(new af.b(this, 5));
        if (view.isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        paint.setColor(-1135603);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("⭐️");
        eq eqVar = new eq(R.drawable.star, 0);
        eqVar.spaceScaleX = 0.875f;
        spannableStringBuilder.setSpan(eqVar, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i10, ','));
        this.g = new nz0(spannableStringBuilder, 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(view, 2000L, new LinearInterpolator());
        this.i = y5Var;
        y5Var.d(0.0f, true);
        y5Var.d(1.0f, false);
        this.j = new org.telegram.ui.Components.y5(view, 350L, 240L, gr.h);
    }
}
