// default package

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fr7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fr7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b;
        dbb dbbVar;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        p8c p8cVar;
        byte b2 = this.a;
        nfd nfdVar = null;
        int i = 0;
        final byte b3 = 1;
        Object obj = this.b;
        switch (b2) {
            case 0:
                ((gr7) obj).onBackPressed();
                break;
            case 1:
                ((j45) obj).run();
                break;
            case 2:
                Pattern pattern = ij.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj);
                alertDialog$Builder.a.S = k96.M0(2131750576, null);
                alertDialog$Builder.a.U = k96.M0(2131750575, null);
                alertDialog$Builder.j(k96.M0(2131752029, null), null);
                alertDialog$Builder.a.show();
                break;
            case 3:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                byte b4 = passcodeActivity.y;
                if (b4 != 1) {
                    if (b4 == 2) {
                        passcodeActivity.t0();
                        break;
                    }
                } else if (!passcodeActivity.F) {
                    passcodeActivity.u0();
                    break;
                } else {
                    passcodeActivity.t0();
                    break;
                }
                break;
            case 4:
                lv7 lv7Var = (lv7) obj;
                if (!lv7Var.a.getAnimatedDrawable().l0) {
                    lv7Var.a.getAnimatedDrawable().I(0, false, false);
                    lv7Var.a.d();
                    break;
                }
                break;
            case 5:
                ((PasskeysActivity) obj).d0(view);
                break;
            case 6:
                rx7 rx7Var = (rx7) obj;
                if (!rx7Var.K) {
                    int i2 = rx7Var.N;
                    if ((i2 != 4 || rx7Var.M != 2) && i2 != 0) {
                        rx7Var.s();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str + " " + rx7Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + rx7Var.a + "\nApp version: " + str + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + rx7Var.L);
                            rx7Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            ij.r0(rx7Var.R, null, k96.M0(2131748007, null), null);
                            return;
                        }
                    }
                }
                break;
            case 7:
                ((m8b) obj).S();
                break;
            case 8:
                ((g38) obj).dismiss();
                break;
            case 9:
                g48 g48Var = (g48) obj;
                mu1 mu1Var = g48Var.G;
                if (mu1Var != null && mu1Var.N7()) {
                    ij.I(g48Var.getParentActivity(), mu1Var.a(), new c48(g48Var, null == true ? 1 : 0));
                    break;
                } else {
                    g48Var.Z(g48Var.b, g48Var.c, true, 0);
                    g48Var.finishFragment();
                    break;
                }
            case 10:
                w48 w48Var = (w48) obj;
                w48Var.d = w48Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                w48Var.b(true);
                w48Var.c.onClick(w48Var);
                break;
            case 11:
                w48 w48Var2 = (w48) view;
                int intValue = ((Integer) w48Var2.getTag()).intValue();
                l58 l58Var = (l58) ((s20) obj).e;
                if (intValue == l58Var.E) {
                    l58Var.O = w48Var2.getCurrentColor();
                } else {
                    l58Var.P = w48Var2.getCurrentColor();
                }
                td4 td4Var = l58Var.m0;
                if (td4Var != null) {
                    td4Var.b(false, false, false);
                }
                l58Var.e();
                break;
            case 12:
                u58 u58Var = (u58) obj;
                mu1 mu1Var2 = u58Var.V;
                if (mu1Var2 != null && mu1Var2.N7()) {
                    ij.I(u58Var.getParentActivity(), mu1Var2.a(), new m58(u58Var, b3));
                    break;
                } else {
                    u58Var.i0(0, true);
                    break;
                }
            case 13:
                x58 x58Var = (x58) obj;
                w58 w58Var = x58Var.d;
                if (w58Var != null) {
                    ((g48) ((s20) ((im6) w58Var).b).e).Y(x58Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 14:
                d98 d98Var = (d98) obj;
                if (d98Var != null) {
                    d98Var.z(0, gl.L(64.0f), false);
                    break;
                }
                break;
            case 15:
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = (PhotoViewer) ((s20) obj).e;
                int indexOf = photoViewer.g7.indexOf(tag);
                o98 o98Var = photoViewer.d;
                if (indexOf < 0) {
                    int R = o98Var.R(tag);
                    if (R >= 0) {
                        photoViewer.q1.r(R);
                        if (R == 0) {
                            photoViewer.q1.g(0);
                        }
                        photoViewer.N2();
                        break;
                    }
                } else {
                    int D = o98Var.D(indexOf, photoViewer.l0());
                    boolean w = photoViewer.d.w(indexOf);
                    if (indexOf == photoViewer.P4) {
                        photoViewer.O0.b(w, true);
                    }
                    if (D >= 0) {
                        photoViewer.q1.r(D);
                        if (D == 0) {
                            photoViewer.q1.g(0);
                        }
                    }
                    photoViewer.N2();
                    break;
                }
                break;
            case 16:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((z98) obj).a.E.url)));
                break;
            case 17:
                ((ja8) obj).s.getSwipeBack().b(true);
                break;
            case 18:
                ((wl1) obj).run();
                break;
            case 19:
                ie8 ie8Var = (ie8) obj;
                boolean[] zArr = ie8Var.x;
                CharSequence[] charSequenceArr = ie8Var.w;
                if (view.getTag() == null) {
                    view.setTag(1);
                    le8 le8Var = (le8) view.getParent();
                    s49 G = ie8Var.c.G(le8Var);
                    if (G != null && (b = G.b()) != -1) {
                        int i3 = b - ie8Var.o0;
                        if (ie8Var.J && i3 < ie8Var.y) {
                            int i4 = -ie8Var.P;
                            ie8Var.P = i4;
                            gl.B3(i4, le8Var, null);
                            pw0.E.a();
                            break;
                        } else {
                            ie8Var.b.r(b);
                            int i5 = i3 + 1;
                            System.arraycopy(charSequenceArr, i5, charSequenceArr, i3, (charSequenceArr.length - 1) - i3);
                            System.arraycopy(zArr, i5, zArr, i3, (zArr.length - 1) - i3);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i6 = ie8Var.E - 1;
                            ie8Var.E = i6;
                            if (ie8Var.r != null) {
                                int[] iArr = new int[i6];
                                while (i < i6) {
                                    iArr[i] = ie8Var.r[i >= i3 ? i + 1 : i];
                                    i++;
                                }
                                ie8Var.r = iArr;
                            }
                            if (ie8Var.E == charSequenceArr.length - 1) {
                                ie8Var.b.i((ie8Var.o0 + charSequenceArr.length) - 1);
                            }
                            s49 K = ie8Var.c.K(b - 1);
                            EditTextBoldCursor textView = le8Var.getTextView();
                            if (K != null) {
                                View view2 = K.a;
                                if (view2 instanceof le8) {
                                    ((le8) view2).getTextView().requestFocus();
                                    textView.clearFocus();
                                    ie8Var.j0();
                                    ie8Var.u0();
                                    dbbVar = ie8Var.R;
                                    if (dbbVar != null) {
                                        dbbVar.e();
                                        ie8Var.R.setDelegate(null);
                                    }
                                    ie8Var.b.g(ie8Var.q0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                gl.t1(textView);
                                ie8Var.l0(true);
                            } else if (ie8Var.C0) {
                                ie8Var.l0(true);
                            }
                            textView.clearFocus();
                            ie8Var.j0();
                            ie8Var.u0();
                            dbbVar = ie8Var.R;
                            if (dbbVar != null) {
                            }
                            ie8Var.b.g(ie8Var.q0);
                        }
                    }
                }
                break;
            case 20:
                ((ve8) obj).b(true);
                break;
            case 21:
                ((ve8) ((bn0) obj).c).b(true);
                break;
            case 22:
                bf8 bf8Var = (bf8) ((ef8) obj);
                gf8 gf8Var = bf8Var.e.s;
                ff8 ff8Var = (ff8) bf8Var.getTag(R.id.object_tag);
                if (ff8Var.b.size() > 15) {
                    boolean z = ff8Var.e;
                    ff8Var.e = !z;
                    if (!z) {
                        ff8Var.f = 10;
                    }
                    gf8Var.D0(bf8Var);
                    gf8Var.m1.X(true);
                    break;
                }
                break;
            case 23:
                PremiumPreviewFragment.t0();
                PremiumPreviewFragment.n0(((xh8) obj).o2, null, "profile", null);
                break;
            case 24:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                gi8 gi8Var = (gi8) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                gi8 gi8Var2 = premiumPreviewFragment.f;
                if (gi8Var2 != null && (tL_premiumSubscriptionOption = gi8Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                    String str2 = ci0.h().f;
                    if (TextUtils.isEmpty(str2)) {
                        w26.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                        break;
                    } else {
                        nfdVar = new nfd();
                        nfdVar.b = str2;
                        nfdVar.a = (byte) 5;
                    }
                }
                PremiumPreviewFragment.n0(premiumPreviewFragment, gi8Var, "settings", nfdVar);
                break;
            case 25:
                final ji8 ji8Var = (ji8) obj;
                n8 n8Var = ji8Var.L2;
                if (!n8Var.a.R) {
                    n8Var.b(true);
                    String str3 = ji8Var.M2;
                    final Object[] objArr = null == true ? 1 : 0;
                    p8c p8cVar2 = new p8c() { // from class: ii8
                        @Override // p8c
                        public final void a(Object obj2) {
                            byte b5 = objArr;
                            ji8 ji8Var2 = ji8Var;
                            byte b6 = 0;
                            switch (b5) {
                                case 0:
                                    ji8Var2.L2.b(false);
                                    ji8Var2.dismiss();
                                    gl.e3(new hi8(ji8Var2, (byte) 1), 200L);
                                    break;
                                default:
                                    ji8Var2.L2.b(false);
                                    ym0.c((TLRPC.TL_error) obj2, (FrameLayout) ji8Var2.b, ji8Var2.J0, new hi8(ji8Var2, b6));
                                    break;
                            }
                        }
                    };
                    p8c p8cVar3 = new p8c() { // from class: ii8
                        @Override // p8c
                        public final void a(Object obj2) {
                            byte b5 = b3;
                            ji8 ji8Var2 = ji8Var;
                            byte b6 = 0;
                            switch (b5) {
                                case 0:
                                    ji8Var2.L2.b(false);
                                    ji8Var2.dismiss();
                                    gl.e3(new hi8(ji8Var2, (byte) 1), 200L);
                                    break;
                                default:
                                    ji8Var2.L2.b(false);
                                    ym0.c((TLRPC.TL_error) obj2, (FrameLayout) ji8Var2.b, ji8Var2.J0, new hi8(ji8Var2, b6));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str3;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new hn0(p8cVar3, p8cVar2, null == true ? 1 : 0), 2);
                    break;
                }
                break;
            case 26:
                ((mi8) obj).dismiss();
                break;
            case 27:
                vi8 vi8Var = ((ui8) obj).y;
                if (vi8Var.r && (p8cVar = vi8Var.f) != null) {
                    p8cVar.a(5);
                    break;
                }
                break;
            case 28:
                PrivacyControlActivity privacyControlActivity = ((yj8) obj).d;
                privacyControlActivity.showDialog(new jh8((d) privacyControlActivity, 27, false));
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj;
                privacySettingsActivity.getClass();
                ag2 ag2Var = (ag2) view;
                int intValue2 = ((Integer) ag2Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.a0;
                boolean z2 = !zArr2[intValue2];
                zArr2[intValue2] = z2;
                ag2Var.c(z2, true);
                break;
        }
    }
}
