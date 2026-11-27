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
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.PasskeysActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class am7 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ am7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b;
        zeb zebVar;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        pcc pccVar;
        byte b2 = this.a;
        ekd ekdVar = null;
        int i = 0;
        final byte b3 = 1;
        Object obj = this.b;
        switch (b2) {
            case 0:
                ((lm7) obj).G0();
                break;
            case 1:
                ((wkb) obj).setChecked(!r10.e.h);
                break;
            case 2:
                ((mu7) obj).onBackPressed();
                break;
            case 3:
                ((l65) obj).run();
                break;
            case 4:
                Pattern pattern = jj.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj);
                alertDialog$Builder.a.S = ob6.M0(2131750553, null);
                alertDialog$Builder.a.U = ob6.M0(2131750552, null);
                alertDialog$Builder.j(ob6.M0(2131752006, null), null);
                alertDialog$Builder.a.show();
                break;
            case 5:
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
            case 6:
                sy7 sy7Var = (sy7) obj;
                if (!sy7Var.a.getAnimatedDrawable().l0) {
                    sy7Var.a.getAnimatedDrawable().I(0, false, false);
                    sy7Var.a.d();
                    break;
                }
                break;
            case 7:
                ((PasskeysActivity) obj).d0(view);
                break;
            case 8:
                x08 x08Var = (x08) obj;
                if (!x08Var.K) {
                    int i2 = x08Var.N;
                    if ((i2 != 4 || x08Var.M != 2) && i2 != 0) {
                        x08Var.s();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str + " " + x08Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + x08Var.a + "\nApp version: " + str + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + x08Var.L);
                            x08Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            jj.r0(x08Var.R, null, ob6.M0(2131747930, null), null);
                            return;
                        }
                    }
                }
                break;
            case 9:
                ((lcb) obj).S();
                break;
            case 10:
                ((w68) obj).dismiss();
                break;
            case 11:
                w78 w78Var = (w78) obj;
                zu1 zu1Var = w78Var.G;
                if (zu1Var != null && zu1Var.X7()) {
                    jj.I(w78Var.getParentActivity(), zu1Var.a(), new s78(w78Var, null == true ? 1 : 0));
                    break;
                } else {
                    w78Var.Z(w78Var.b, w78Var.c, true, 0);
                    w78Var.finishFragment();
                    break;
                }
            case 12:
                l88 l88Var = (l88) obj;
                l88Var.d = l88Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                l88Var.b(true);
                l88Var.c.onClick(l88Var);
                break;
            case 13:
                l88 l88Var2 = (l88) view;
                int intValue = ((Integer) l88Var2.getTag()).intValue();
                c98 c98Var = (c98) ((t20) obj).e;
                if (intValue == c98Var.E) {
                    c98Var.O = l88Var2.getCurrentColor();
                } else {
                    c98Var.P = l88Var2.getCurrentColor();
                }
                rf4 rf4Var = c98Var.m0;
                if (rf4Var != null) {
                    rf4Var.b(false, false, false);
                }
                c98Var.e();
                break;
            case 14:
                l98 l98Var = (l98) obj;
                zu1 zu1Var2 = l98Var.V;
                if (zu1Var2 != null && zu1Var2.X7()) {
                    jj.I(l98Var.getParentActivity(), zu1Var2.a(), new d98(l98Var, b3));
                    break;
                } else {
                    l98Var.i0(0, true);
                    break;
                }
                break;
            case 15:
                o98 o98Var = (o98) obj;
                n98 n98Var = o98Var.d;
                if (n98Var != null) {
                    ((w78) ((t20) ((jz7) n98Var).b).e).Y(o98Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 16:
                tc8 tc8Var = (tc8) obj;
                if (tc8Var != null) {
                    tc8Var.z(0, hl.L(64.0f), false);
                    break;
                }
                break;
            case 17:
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = (PhotoViewer) ((t20) obj).e;
                int indexOf = photoViewer.f7.indexOf(tag);
                ed8 ed8Var = photoViewer.d;
                if (indexOf < 0) {
                    int R = ed8Var.R(tag);
                    if (R >= 0) {
                        photoViewer.q1.s(R);
                        if (R == 0) {
                            photoViewer.q1.g(0);
                        }
                        photoViewer.O2();
                        break;
                    }
                } else {
                    int D = ed8Var.D(indexOf, photoViewer.k0());
                    boolean w = photoViewer.d.w(indexOf);
                    if (indexOf == photoViewer.O4) {
                        photoViewer.O0.b(w, true);
                    }
                    if (D >= 0) {
                        photoViewer.q1.s(D);
                        if (D == 0) {
                            photoViewer.q1.g(0);
                        }
                    }
                    photoViewer.O2();
                    break;
                }
                break;
            case 18:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((pd8) obj).a.E.url)));
                break;
            case 19:
                ((ae8) obj).s.getSwipeBack().b(true);
                break;
            case 20:
                ((gn1) obj).run();
                break;
            case 21:
                wh8 wh8Var = (wh8) obj;
                boolean[] zArr = wh8Var.x;
                CharSequence[] charSequenceArr = wh8Var.w;
                if (view.getTag() == null) {
                    view.setTag(1);
                    zh8 zh8Var = (zh8) view.getParent();
                    f89 H = wh8Var.c.H(zh8Var);
                    if (H != null && (b = H.b()) != -1) {
                        int i3 = b - wh8Var.o0;
                        if (wh8Var.J && i3 < wh8Var.y) {
                            int i4 = -wh8Var.P;
                            wh8Var.P = i4;
                            hl.A3(i4, zh8Var, null);
                            yw0.E.a();
                            break;
                        } else {
                            wh8Var.b.s(b);
                            int i5 = i3 + 1;
                            System.arraycopy(charSequenceArr, i5, charSequenceArr, i3, (charSequenceArr.length - 1) - i3);
                            System.arraycopy(zArr, i5, zArr, i3, (zArr.length - 1) - i3);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i6 = wh8Var.E - 1;
                            wh8Var.E = i6;
                            if (wh8Var.r != null) {
                                int[] iArr = new int[i6];
                                while (i < i6) {
                                    iArr[i] = wh8Var.r[i >= i3 ? i + 1 : i];
                                    i++;
                                }
                                wh8Var.r = iArr;
                            }
                            if (wh8Var.E == charSequenceArr.length - 1) {
                                wh8Var.b.i((wh8Var.o0 + charSequenceArr.length) - 1);
                            }
                            f89 L = wh8Var.c.L(b - 1);
                            EditTextBoldCursor textView = zh8Var.getTextView();
                            if (L != null) {
                                View view2 = L.a;
                                if (view2 instanceof zh8) {
                                    ((zh8) view2).getTextView().requestFocus();
                                    textView.clearFocus();
                                    wh8Var.j0();
                                    wh8Var.u0();
                                    zebVar = wh8Var.R;
                                    if (zebVar != null) {
                                        zebVar.e();
                                        wh8Var.R.setDelegate(null);
                                    }
                                    wh8Var.b.g(wh8Var.q0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                hl.t1(textView);
                                wh8Var.l0(true);
                            } else if (wh8Var.C0) {
                                wh8Var.l0(true);
                            }
                            textView.clearFocus();
                            wh8Var.j0();
                            wh8Var.u0();
                            zebVar = wh8Var.R;
                            if (zebVar != null) {
                            }
                            wh8Var.b.g(wh8Var.q0);
                        }
                    }
                }
                break;
            case 22:
                ((ji8) obj).b(true);
                break;
            case 23:
                ((ji8) ((bn0) obj).c).b(true);
                break;
            case 24:
                pi8 pi8Var = (pi8) ((si8) obj);
                ui8 ui8Var = pi8Var.e.s;
                ti8 ti8Var = (ti8) pi8Var.getTag(R.id.object_tag);
                if (ti8Var.b.size() > 15) {
                    boolean z = ti8Var.e;
                    ti8Var.e = !z;
                    if (!z) {
                        ti8Var.f = 10;
                    }
                    ui8Var.E0(pi8Var);
                    ui8Var.m1.X(true);
                    break;
                }
                break;
            case 25:
                PremiumPreviewFragment.t0();
                PremiumPreviewFragment.n0(((kl8) obj).o2, null, "profile", null);
                break;
            case 26:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                tl8 tl8Var = (tl8) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                tl8 tl8Var2 = premiumPreviewFragment.f;
                if (tl8Var2 != null && (tL_premiumSubscriptionOption = tl8Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                    String str2 = di0.h().f;
                    if (TextUtils.isEmpty(str2)) {
                        lq5.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                        break;
                    } else {
                        ekdVar = new ekd();
                        ekdVar.b = str2;
                        ekdVar.a = (byte) 5;
                    }
                }
                PremiumPreviewFragment.n0(premiumPreviewFragment, tl8Var, "settings", ekdVar);
                break;
            case 27:
                final wl8 wl8Var = (wl8) obj;
                o8 o8Var = wl8Var.L2;
                if (!o8Var.a.R) {
                    o8Var.b(true);
                    String str3 = wl8Var.M2;
                    final Object[] objArr = null == true ? 1 : 0;
                    pcc pccVar2 = new pcc() { // from class: vl8
                        @Override // pcc
                        public final void a(Object obj2) {
                            byte b5 = objArr;
                            wl8 wl8Var2 = wl8Var;
                            byte b6 = 0;
                            switch (b5) {
                                case 0:
                                    wl8Var2.L2.b(false);
                                    wl8Var2.dismiss();
                                    hl.d3(new ul8(wl8Var2, (byte) 1), 200L);
                                    break;
                                default:
                                    wl8Var2.L2.b(false);
                                    ym0.c((TLRPC.TL_error) obj2, (FrameLayout) wl8Var2.b, wl8Var2.J0, new ul8(wl8Var2, b6));
                                    break;
                            }
                        }
                    };
                    pcc pccVar3 = new pcc() { // from class: vl8
                        @Override // pcc
                        public final void a(Object obj2) {
                            byte b5 = b3;
                            wl8 wl8Var2 = wl8Var;
                            byte b6 = 0;
                            switch (b5) {
                                case 0:
                                    wl8Var2.L2.b(false);
                                    wl8Var2.dismiss();
                                    hl.d3(new ul8(wl8Var2, (byte) 1), 200L);
                                    break;
                                default:
                                    wl8Var2.L2.b(false);
                                    ym0.c((TLRPC.TL_error) obj2, (FrameLayout) wl8Var2.b, wl8Var2.J0, new ul8(wl8Var2, b6));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str3;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new hn0(pccVar3, pccVar2, null == true ? 1 : 0), 2);
                    break;
                }
                break;
            case 28:
                ((zl8) obj).dismiss();
                break;
            default:
                im8 im8Var = ((hm8) obj).y;
                if (im8Var.r && (pccVar = im8Var.f) != null) {
                    pccVar.a(5);
                    break;
                }
                break;
        }
    }
}
