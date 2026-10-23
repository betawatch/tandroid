package ai;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.nk;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cy;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ d2(l7 l7Var, int i10) {
        this.a = i10;
        this.b = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        o6 o6Var;
        String str;
        int i10 = this.a;
        int i11 = 0;
        l7 l7Var = this.b;
        switch (i10) {
            case 0:
                l7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 1:
                l7Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 2:
                l7Var.getClass();
                new sg.y0((org.telegram.ui.ActionBar.n2) new a5(l7Var, 0), 12, false).show();
                break;
            case 3:
                l7.u0(l7Var);
                break;
            case 4:
                l7Var.dismiss();
                break;
            case 5:
                new o0(l7Var.getContext()).show();
                break;
            case 6:
                l7.Z(l7Var);
                break;
            case 7:
                l7.a0(l7Var);
                break;
            case 8:
                l7.h1(l7Var);
                break;
            case 9:
                l7Var.k0.setLoading(false);
                l7Var.V2(0, true, null);
                break;
            case 10:
                new o0(l7Var.getContext()).show();
                break;
            case 11:
                l7.C0(l7Var);
                break;
            case 12:
                l7Var.onBackPressed();
                break;
            case 13:
                l7.V(l7Var);
                break;
            case 14:
                long V1 = l7Var.V1();
                if (V1 != 0) {
                    l7Var.v2(V1);
                    break;
                }
                break;
            case 15:
                l7.d0(l7Var);
                break;
            case 16:
                l7Var.u2(true);
                break;
            case 17:
                l7Var.q2();
                break;
            case 18:
                l7Var.n2();
                break;
            case 19:
                l7.r0(l7Var);
                break;
            case 20:
                l7Var.dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique f22 = l7Var.f2();
                if (U != null && f22 != null) {
                    cy cyVar = new cy(nk.d(4, "onlySelect", "dialogsType", true));
                    cyVar.C2 = new u2(l7Var, f22, cyVar, i11);
                    U.presentFragment(cyVar);
                    break;
                }
                break;
            case 21:
                l7Var.x2();
                break;
            case 22:
                l7Var.C2();
                break;
            case 23:
                l7Var.onBackPressed();
                break;
            case 24:
                f7 f7Var = l7Var.f0;
                ei.d dVar = l7Var.k0;
                p6 p6Var = l7Var.P0.h;
                ImageReceiver imageReceiver = (p6Var == null || (o6Var = p6Var.c) == null) ? null : ((r6) o6Var).d;
                org.telegram.ui.Components.w9 w9Var = f7Var.d[0];
                if (imageReceiver != null && w9Var != null && w9Var.getImageReceiver() != null) {
                    vj0 lottieAnimation = imageReceiver.getLottieAnimation();
                    vj0 lottieAnimation2 = w9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.T(lottieAnimation.t(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        w9Var.setImageDrawable(lottieAnimation);
                    }
                }
                f7Var.b.setAlpha(1.0f);
                f7Var.c.setAlpha(0.0f);
                if (l7Var.r0 && l7Var.Z != null && l7Var.G0 != null && l7Var.b2() >= 0 && l7Var.G0.b(l7Var.b2()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = l7Var.G0.b(l7Var.b2());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = l7Var.G0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new a3(l7Var, b10, 0));
                    break;
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new c2(l7Var, 7));
                    break;
                }
                break;
            case 25:
                if (l7Var.W1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(l7Var.W1().title);
                    sb2.append(" #");
                    str = org.telegram.messenger.g0.h(l7Var.W1().num, ',', sb2);
                } else {
                    str = "";
                }
                org.telegram.ui.Components.qc M = l7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.j = 5000;
                M.t = true;
                M.j();
                z00 z00Var = l7Var.a0;
                if (z00Var != null) {
                    z00Var.c(true);
                    break;
                }
                break;
            default:
                l7Var.d.u0(((l7) l7Var.T0.d).S0.length - 1);
                break;
        }
    }
}
