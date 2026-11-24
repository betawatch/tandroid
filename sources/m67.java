// default package

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class m67 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m67(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b;
        fdb fdbVar;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        byte b2 = this.a;
        ohd ohdVar = null;
        int i = 0;
        final byte b3 = 1;
        Object obj = this.b;
        switch (b2) {
            case 0:
                t67 t67Var = (t67) obj;
                long j = t67Var.b;
                if (!t67Var.n.w4()) {
                    if (t67Var.getParentLayout().getFragmentStack().size() > 1) {
                        d dVar = (d) t67Var.getParentLayout().getFragmentStack().get(t67Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((dVar instanceof yv1) && ((yv1) dVar).e.id == j) {
                            t67Var.finishFragment();
                            break;
                        }
                    }
                    Bundle k = kt6.k(j, "chat_id");
                    k.putInt("message_id", t67Var.c);
                    k.putBoolean("need_remove_previous_same_chat_activity", false);
                    t67Var.presentFragment(new yv1(k));
                    break;
                }
                break;
            case 1:
                ((u67) obj).dismiss();
                break;
            case 2:
                ((bjb) obj).setChecked(!r10.e.h);
                break;
            case 3:
                ((ht7) obj).onBackPressed();
                break;
            case 4:
                ((h65) obj).run();
                break;
            case 5:
                Pattern pattern = ik.a;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj);
                alertDialog$Builder.a.S = jb6.M0(2131750525, null);
                alertDialog$Builder.a.U = jb6.M0(2131750524, null);
                alertDialog$Builder.j(jb6.M0(2131751978, null), null);
                alertDialog$Builder.a.show();
                break;
            case 6:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                byte b4 = passcodeActivity.y;
                if (b4 != 1) {
                    if (b4 == 2) {
                        passcodeActivity.u0();
                        break;
                    }
                } else if (!passcodeActivity.F) {
                    passcodeActivity.v0();
                    break;
                } else {
                    passcodeActivity.u0();
                    break;
                }
                break;
            case 7:
                nx7 nx7Var = (nx7) obj;
                if (!nx7Var.a.getAnimatedDrawable().l0) {
                    nx7Var.a.getAnimatedDrawable().I(0, false, false);
                    nx7Var.a.d();
                    break;
                }
                break;
            case 8:
                ((PasskeysActivity) obj).e0(view);
                break;
            case 9:
                tz7 tz7Var = (tz7) obj;
                if (!tz7Var.K) {
                    int i2 = tz7Var.N;
                    if ((i2 != 4 || tz7Var.M != 2) && i2 != 0) {
                        tz7Var.s();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str + " " + tz7Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + tz7Var.a + "\nApp version: " + str + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + tz7Var.L);
                            tz7Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            ik.r0(tz7Var.R, null, jb6.M0(2131747933, null), null);
                            return;
                        }
                    }
                }
                break;
            case 10:
                ((oab) obj).S();
                break;
            case 11:
                ((i58) obj).dismiss();
                break;
            case 12:
                j68 j68Var = (j68) obj;
                yv1 yv1Var = j68Var.G;
                if (yv1Var != null && yv1Var.X7()) {
                    ik.I(j68Var.getParentActivity(), yv1Var.a(), new e68(j68Var, null == true ? 1 : 0));
                    break;
                } else {
                    j68Var.a0(j68Var.b, j68Var.c, true, 0);
                    j68Var.finishFragment();
                    break;
                }
            case 13:
                y68 y68Var = (y68) obj;
                y68Var.d = y68Var.e[((Integer) ((RadioButton) view).getTag()).intValue()];
                y68Var.b(true);
                y68Var.c.onClick(y68Var);
                break;
            case 14:
                y68 y68Var2 = (y68) view;
                int intValue = ((Integer) y68Var2.getTag()).intValue();
                n78 n78Var = (n78) ((s30) obj).e;
                if (intValue == n78Var.E) {
                    n78Var.O = y68Var2.getCurrentColor();
                } else {
                    n78Var.P = y68Var2.getCurrentColor();
                }
                uf4 uf4Var = n78Var.m0;
                if (uf4Var != null) {
                    uf4Var.b(false, false, false);
                }
                n78Var.g();
                break;
            case 15:
                w78 w78Var = (w78) obj;
                yv1 yv1Var2 = w78Var.V;
                if (yv1Var2 != null && yv1Var2.X7()) {
                    ik.I(w78Var.getParentActivity(), yv1Var2.a(), new o78(w78Var, b3));
                    break;
                } else {
                    w78Var.j0(0, true);
                    break;
                }
            case 16:
                z78 z78Var = (z78) obj;
                y78 y78Var = z78Var.d;
                if (y78Var != null) {
                    ((j68) ((s30) ((h68) y78Var).b).e).Z(z78Var.b[((Integer) view.getTag()).intValue()]);
                    break;
                }
                break;
            case 17:
                eb8 eb8Var = (eb8) obj;
                if (eb8Var != null) {
                    eb8Var.z(0, gm.L(64.0f), false);
                    break;
                }
                break;
            case 18:
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = (PhotoViewer) ((s30) obj).e;
                int indexOf = photoViewer.f7.indexOf(tag);
                pb8 pb8Var = photoViewer.d;
                if (indexOf < 0) {
                    int S = pb8Var.S(tag);
                    if (S >= 0) {
                        photoViewer.q1.s(S);
                        if (S == 0) {
                            photoViewer.q1.g(0);
                        }
                        photoViewer.O2();
                        break;
                    }
                } else {
                    int E = pb8Var.E(indexOf, photoViewer.l0());
                    boolean w = photoViewer.d.w(indexOf);
                    if (indexOf == photoViewer.O4) {
                        photoViewer.O0.b(w, true);
                    }
                    if (E >= 0) {
                        photoViewer.q1.s(E);
                        if (E == 0) {
                            photoViewer.q1.g(0);
                        }
                    }
                    photoViewer.O2();
                    break;
                }
                break;
            case 19:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((ac8) obj).a.E.url)));
                break;
            case 20:
                ((mc8) obj).s.getSwipeBack().b(true);
                break;
            case 21:
                ((ho1) obj).run();
                break;
            case 22:
                kg8 kg8Var = (kg8) obj;
                boolean[] zArr = kg8Var.x;
                CharSequence[] charSequenceArr = kg8Var.w;
                if (view.getTag() == null) {
                    view.setTag(1);
                    ng8 ng8Var = (ng8) view.getParent();
                    u69 G = kg8Var.c.G(ng8Var);
                    if (G != null && (b = G.b()) != -1) {
                        int i3 = b - kg8Var.o0;
                        if (kg8Var.J && i3 < kg8Var.y) {
                            int i4 = -kg8Var.P;
                            kg8Var.P = i4;
                            gm.A3(i4, ng8Var, null);
                            xx0.E.a();
                            break;
                        } else {
                            kg8Var.b.s(b);
                            int i5 = i3 + 1;
                            System.arraycopy(charSequenceArr, i5, charSequenceArr, i3, (charSequenceArr.length - 1) - i3);
                            System.arraycopy(zArr, i5, zArr, i3, (zArr.length - 1) - i3);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i6 = kg8Var.E - 1;
                            kg8Var.E = i6;
                            if (kg8Var.r != null) {
                                int[] iArr = new int[i6];
                                while (i < i6) {
                                    iArr[i] = kg8Var.r[i >= i3 ? i + 1 : i];
                                    i++;
                                }
                                kg8Var.r = iArr;
                            }
                            if (kg8Var.E == charSequenceArr.length - 1) {
                                kg8Var.b.i((kg8Var.o0 + charSequenceArr.length) - 1);
                            }
                            u69 K = kg8Var.c.K(b - 1);
                            EditTextBoldCursor textView = ng8Var.getTextView();
                            if (K != null) {
                                View view2 = K.a;
                                if (view2 instanceof ng8) {
                                    ((ng8) view2).getTextView().requestFocus();
                                    textView.clearFocus();
                                    kg8Var.k0();
                                    kg8Var.v0();
                                    fdbVar = kg8Var.R;
                                    if (fdbVar != null) {
                                        fdbVar.e();
                                        kg8Var.R.setDelegate(null);
                                    }
                                    kg8Var.b.g(kg8Var.q0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                gm.t1(textView);
                                kg8Var.m0(true);
                            } else if (kg8Var.C0) {
                                kg8Var.m0(true);
                            }
                            textView.clearFocus();
                            kg8Var.k0();
                            kg8Var.v0();
                            fdbVar = kg8Var.R;
                            if (fdbVar != null) {
                            }
                            kg8Var.b.g(kg8Var.q0);
                        }
                    }
                }
                break;
            case 23:
                ((xg8) obj).b(true);
                break;
            case 24:
                ((xg8) ((bo0) obj).c).b(true);
                break;
            case 25:
                dh8 dh8Var = (dh8) ((gh8) obj);
                ih8 ih8Var = dh8Var.e.s;
                hh8 hh8Var = (hh8) dh8Var.getTag(R.id.object_tag);
                if (hh8Var.b.size() > 15) {
                    boolean z = hh8Var.e;
                    hh8Var.e = !z;
                    if (!z) {
                        hh8Var.f = 10;
                    }
                    ih8Var.D0(dh8Var);
                    ih8Var.m1.X(true);
                    break;
                }
                break;
            case 26:
                PremiumPreviewFragment.u0();
                PremiumPreviewFragment.o0(((yj8) obj).o2, null, "profile", null);
                break;
            case 27:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                ik8 ik8Var = (ik8) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                ik8 ik8Var2 = premiumPreviewFragment.f;
                if (ik8Var2 != null && (tL_premiumSubscriptionOption = ik8Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                    String str2 = cj0.h().f;
                    if (TextUtils.isEmpty(str2)) {
                        u36.j("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                        break;
                    } else {
                        ohdVar = new ohd();
                        ohdVar.b = str2;
                        ohdVar.a = (byte) 5;
                    }
                }
                PremiumPreviewFragment.o0(premiumPreviewFragment, ik8Var, "settings", ohdVar);
                break;
            case 28:
                final lk8 lk8Var = (lk8) obj;
                n8 n8Var = lk8Var.L2;
                if (!n8Var.a.R) {
                    n8Var.b(true);
                    String str3 = lk8Var.M2;
                    final Object[] objArr = null == true ? 1 : 0;
                    qac qacVar = new qac() { // from class: kk8
                        @Override // qac
                        public final void a(Object obj2) {
                            byte b5 = objArr;
                            lk8 lk8Var2 = lk8Var;
                            byte b6 = 0;
                            switch (b5) {
                                case 0:
                                    lk8Var2.L2.b(false);
                                    lk8Var2.dismiss();
                                    gm.d3(new jk8(lk8Var2, (byte) 1), 200L);
                                    break;
                                default:
                                    lk8Var2.L2.b(false);
                                    yn0.c((TLRPC.TL_error) obj2, (FrameLayout) lk8Var2.b, lk8Var2.J0, new jk8(lk8Var2, b6));
                                    break;
                            }
                        }
                    };
                    qac qacVar2 = new qac() { // from class: kk8
                        @Override // qac
                        public final void a(Object obj2) {
                            byte b5 = b3;
                            lk8 lk8Var2 = lk8Var;
                            byte b6 = 0;
                            switch (b5) {
                                case 0:
                                    lk8Var2.L2.b(false);
                                    lk8Var2.dismiss();
                                    gm.d3(new jk8(lk8Var2, (byte) 1), 200L);
                                    break;
                                default:
                                    lk8Var2.L2.b(false);
                                    yn0.c((TLRPC.TL_error) obj2, (FrameLayout) lk8Var2.b, lk8Var2.J0, new jk8(lk8Var2, b6));
                                    break;
                            }
                        }
                    };
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
                    TLRPC.TL_payments_applyGiftCode tL_payments_applyGiftCode = new TLRPC.TL_payments_applyGiftCode();
                    tL_payments_applyGiftCode.slug = str3;
                    connectionsManager.sendRequest(tL_payments_applyGiftCode, new ho0(qacVar2, qacVar, null == true ? 1 : 0), 2);
                    break;
                }
                break;
            default:
                ((ok8) obj).dismiss();
                break;
        }
    }
}
