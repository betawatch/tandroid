package ai;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.lk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ b2(k7 k7Var, int i10) {
        this.a = i10;
        this.b = k7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        n6 n6Var;
        String str;
        int i10 = this.a;
        int i11 = 0;
        k7 k7Var = this.b;
        switch (i10) {
            case 0:
                k7.G0(k7Var);
                break;
            case 1:
                k7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 2:
                k7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 3:
                k7Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.n2) new z4(k7Var, 0), 12, false).show();
                break;
            case 4:
                k7.v0(k7Var);
                break;
            case 5:
                k7Var.dismiss();
                break;
            case 6:
                new o0(k7Var.getContext()).show();
                break;
            case 7:
                k7.b0(k7Var);
                break;
            case 8:
                k7.c0(k7Var);
                break;
            case 9:
                k7Var.k0.setLoading(false);
                k7Var.O2(0, true, null);
                break;
            case 10:
                new o0(k7Var.getContext()).show();
                break;
            case 11:
                k7.A0(k7Var);
                break;
            case 12:
                k7Var.onBackPressed();
                break;
            case 13:
                k7.V(k7Var);
                break;
            case 14:
                long O1 = k7Var.O1();
                if (O1 != 0) {
                    k7Var.o2(O1);
                    break;
                }
                break;
            case 15:
                k7Var.n2(true);
                break;
            case 16:
                k7Var.j2();
                break;
            case 17:
                k7Var.g2();
                break;
            case 18:
                k7.s0(k7Var);
                break;
            case 19:
                k7Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique Y1 = k7Var.Y1();
                if (U != null && Y1 != null) {
                    ey eyVar = new ey(lk.d(4, "onlySelect", "dialogsType", true));
                    eyVar.C2 = new r2(k7Var, Y1, eyVar, i11);
                    U.presentFragment(eyVar);
                    break;
                }
                break;
            case 20:
                k7Var.q2();
                break;
            case 21:
                k7Var.v2();
                break;
            case 22:
                k7Var.onBackPressed();
                break;
            case 23:
                e7 e7Var = k7Var.f0;
                ei.d dVar = k7Var.k0;
                o6 o6Var = k7Var.P0.h;
                ImageReceiver imageReceiver = (o6Var == null || (n6Var = o6Var.c) == null) ? null : ((q6) n6Var).d;
                org.telegram.ui.Components.w9 w9Var = e7Var.d[0];
                if (imageReceiver != null && w9Var != null && w9Var.getImageReceiver() != null) {
                    uj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    uj0 lottieAnimation2 = w9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        w9Var.setImageDrawable(lottieAnimation);
                    }
                }
                e7Var.b.setAlpha(1.0f);
                e7Var.c.setAlpha(0.0f);
                if (k7Var.r0 && k7Var.Z != null && k7Var.G0 != null && k7Var.U1() >= 0 && k7Var.G0.b(k7Var.U1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = k7Var.G0.b(k7Var.U1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = k7Var.G0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new z2(k7Var, b10, 0));
                    break;
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(k7Var, 6));
                    break;
                }
                break;
            case 24:
                if (k7Var.P1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(k7Var.P1().title);
                    sb2.append(" #");
                    str = org.telegram.messenger.g0.h(k7Var.P1().num, ',', sb2);
                } else {
                    str = "";
                }
                org.telegram.ui.Components.qc M = k7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.j = 5000;
                M.t = true;
                M.j();
                z00 z00Var = k7Var.a0;
                if (z00Var != null) {
                    z00Var.c(true);
                    break;
                }
                break;
            default:
                k7Var.d.u0(((k7) k7Var.T0.d).S0.length - 1);
                break;
        }
    }
}
