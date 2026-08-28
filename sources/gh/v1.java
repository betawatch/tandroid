package gh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k5 b;

    public /* synthetic */ v1(k5 k5Var, int i9) {
        this.a = i9;
        this.b = k5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        q4 q4Var;
        int i9 = this.a;
        int i10 = 2;
        k5 k5Var = this.b;
        switch (i9) {
            case 0:
                k5.o0(k5Var);
                break;
            case 1:
                new g0(k5Var.getContext()).show();
                break;
            case 2:
                k5Var.dismiss();
                break;
            case 3:
                k5.V(k5Var);
                break;
            case 4:
                k5.X(k5Var);
                break;
            case 5:
                k5Var.f0.setLoading(false);
                k5Var.q2(0, true, null);
                break;
            case 6:
                new g0(k5Var.getContext()).show();
                break;
            case 7:
                k5.u0(k5Var);
                break;
            case 8:
                k5.a0(k5Var);
                break;
            case 9:
                k5Var.onBackPressed();
                break;
            case 10:
                k5.g1(k5Var);
                break;
            case 11:
                k5Var.W1(true);
                break;
            case 12:
                k5Var.U1();
                break;
            case 13:
                k5Var.S1();
                break;
            case 14:
                k5.m0(k5Var);
                break;
            case 15:
                k5Var.dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                TL_stars.TL_starGiftUnique K1 = k5Var.K1();
                if (U != null && K1 != null) {
                    dy dyVar = new dy(org.telegram.messenger.l0.e(4, "onlySelect", "dialogsType", true));
                    dyVar.y2 = new androidx.car.app.utils.a(k5Var, K1, dyVar, 7);
                    U.presentFragment(dyVar);
                    break;
                }
                break;
            case 16:
                k5Var.Y1();
                break;
            case 17:
                long A1 = k5Var.A1();
                if (A1 != 0) {
                    k5Var.X1(A1);
                    break;
                }
                break;
            case 18:
                k5Var.onBackPressed();
                break;
            case 19:
                k5Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 20:
                if (k5Var.B1() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(k5Var.B1().title);
                    sb2.append(" #");
                    str = j3.r0.n(k5Var.B1().num, ',', sb2);
                } else {
                    str = "";
                }
                gc M = k5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2UpgradedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2UpgradedText, str)), R.raw.gift_upgrade);
                M.j = 5000;
                M.t = true;
                M.j();
                c00 c00Var = k5Var.W;
                if (c00Var != null) {
                    c00Var.c(true);
                    break;
                }
                break;
            case 21:
                k5Var.d.u0(((k5) k5Var.M0.d).L0.length - 1);
                break;
            case 22:
                k5Var.getBulletinFactory().Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopied)).k(false);
                break;
            case 23:
                g5 g5Var = k5Var.a0;
                kh.d dVar = k5Var.f0;
                r4 r4Var = k5Var.I0.h;
                ImageReceiver imageReceiver = (r4Var == null || (q4Var = r4Var.c) == null) ? null : ((t4) q4Var).d;
                org.telegram.ui.Components.o9 o9Var = g5Var.d[0];
                if (imageReceiver != null && o9Var != null && o9Var.getImageReceiver() != null) {
                    mi0 lottieAnimation = imageReceiver.getLottieAnimation();
                    mi0 lottieAnimation2 = o9Var.getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.Q(lottieAnimation.r(), false);
                    } else if (lottieAnimation2 == null && lottieAnimation != null) {
                        imageReceiver.clearImage();
                        o9Var.setImageDrawable(lottieAnimation);
                    }
                }
                g5Var.b.setAlpha(1.0f);
                g5Var.c.setAlpha(0.0f);
                if (k5Var.m0 && k5Var.V != null && k5Var.z0 != null && k5Var.G1() >= 0 && k5Var.z0.b(k5Var.G1()) >= 0) {
                    dVar.setFilled(false);
                    int b10 = k5Var.z0.b(k5Var.G1());
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                    Object obj = k5Var.z0.get(b10);
                    if ((obj instanceof TL_stars.SavedStarGift) && (starGift = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift.getDocument()) != null) {
                        spannableStringBuilder.append((CharSequence) " e");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                    }
                    dVar.g(spannableStringBuilder, true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new z1(k5Var, b10, 0));
                    break;
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), true, true);
                    dVar.f(null, true);
                    dVar.setOnClickListener(new n1(k5Var, i10));
                    break;
                }
                break;
            default:
                k5Var.getClass();
                new zf.x0((org.telegram.ui.ActionBar.o2) new bg.i1(k5Var, 2), 12, false).show();
                break;
        }
    }
}
