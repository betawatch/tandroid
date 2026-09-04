package di;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.vi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.co;
import org.telegram.ui.mk;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.h2 h2Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.b;
        Activity activity = (Activity) this.c;
        Integer num = (Integer) obj;
        org.telegram.ui.v3 v3Var = i4Var.K;
        org.telegram.ui.j0[] j0VarArr = i4Var.S0;
        if ((i4Var.u0[0].c() && i4Var.u0[0].c.E == null) || i4Var.L == null) {
            return;
        }
        if (num.intValue() == 1) {
            org.telegram.ui.k0 k0Var = i4Var.h0;
            int dp = AndroidUtilities.dp(56.0f);
            i4Var.I0 = dp;
            k0Var.setHeight(dp);
            i4Var.h0.h(true);
            return;
        }
        if (num.intValue() == 2) {
            if (!i4Var.u0[0].f()) {
                TLRPC.WebPage webPage = i4Var.u0[0].c.E;
                if (webPage == null) {
                    return;
                } else {
                    str4 = webPage.url;
                }
            } else if (i4Var.u0[0].getWebView() == null) {
                return;
            } else {
                str4 = i4Var.u0[0].getWebView().getUrl();
            }
            String v = org.telegram.ui.web.d1.v(str4);
            i4Var.a0(new hq0(i4Var.L, null, v, false, v, false, AndroidUtilities.computePerceivedBrightness(i4Var.h0.getBackgroundColor()) < 0.721f ? new bi.b() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (!i4Var.u0[0].f()) {
                org.telegram.ui.m3 m3Var = i4Var.u0[0];
                TLRPC.WebPage webPage2 = m3Var.c.E;
                if (webPage2 == null) {
                    return;
                }
                str3 = webPage2.url;
                frameLayout = m3Var;
            } else {
                if (i4Var.u0[0].getWebView() == null) {
                    return;
                }
                str3 = i4Var.u0[0].getWebView().getUrl();
                frameLayout = i4Var.u0[0].f;
            }
            org.telegram.ui.i4.f(str3, i4Var.X, frameLayout, v3Var, null);
            return;
        }
        if (num.intValue() == 7) {
            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
            l2Var.a = true;
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.showAsSheet(new org.telegram.ui.web.q(v3Var != null ? new org.telegram.ui.a0(i4Var, 5) : null, new org.telegram.ui.r(i4Var, 2)), l2Var);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
            l2Var2.a = true;
            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
            if (U2 != null) {
                U2.showAsSheet(new org.telegram.ui.web.i1(v3Var != null ? new org.telegram.ui.a0(i4Var, 6) : null, new org.telegram.ui.r(i4Var, 3)), l2Var2);
                return;
            }
            return;
        }
        if (num.intValue() == 9) {
            if (i4Var.u0[0].getWebView() != null) {
                i4Var.u0[0].getWebView().goForward();
                return;
            }
            return;
        }
        if (num.intValue() == 3) {
            if (!i4Var.u0[0].f()) {
                TLRPC.WebPage webPage3 = i4Var.u0[0].c.E;
                if (webPage3 == null) {
                    return;
                }
                String str5 = webPage3.url;
                TL_iv.Page page = webPage3.cached_page;
                if (page != null) {
                    file = page.local;
                    str = str5;
                    str2 = null;
                } else {
                    str = str5;
                    str2 = null;
                    file = null;
                }
            } else {
                if (i4Var.u0[0].getWebView() == null) {
                    return;
                }
                str = i4Var.u0[0].getWebView().getUrl();
                str2 = i4Var.u0[0].getWebView().getOpenURL();
                file = null;
            }
            Activity activity2 = i4Var.L;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            if (file != null) {
                AndroidUtilities.openForView(file, null, "text/markdown", i4Var.L, null, true);
                return;
            }
            if (str == null) {
                return;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
            String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
            org.telegram.ui.x xVar = new org.telegram.ui.x(i4Var, str, 1);
            org.telegram.ui.y yVar = new org.telegram.ui.y(i4Var, hostAuthority2, hostAuthority, 1);
            if (i4Var.u0[0].f() && MessagesController.getInstance(i4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(i4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                org.telegram.ui.Components.e5.o0(activity, null, str, true, new bi.f0(4, yVar, xVar));
                return;
            } else {
                xVar.run();
                return;
            }
        }
        if (num.intValue() != 4) {
            if (num.intValue() == 5) {
                if (!i4Var.u0[0].f() || i4Var.u0[0].getWebView() == null) {
                    return;
                }
                i4Var.u0[0].getWebView().reload();
                return;
            }
            if (num.intValue() != 10 || (h2Var = i4Var.u0[0].y) == null || h2Var.b() == null) {
                return;
            }
            i4Var.h(h2Var.b(), null, 1);
            return;
        }
        if (i4Var.u0[0].f()) {
            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
            if (U3 != null) {
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.a = true;
                U3.showAsSheet(new org.telegram.ui.web.a2(new org.telegram.ui.r(i4Var, 3)), l2Var3);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) i4Var.L, (org.telegram.ui.ActionBar.f6) null, false);
        f3Var.fixNavigationBar();
        f3Var.applyTopPadding = false;
        LinearLayout linearLayout = new LinearLayout(i4Var.L);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(i4Var.L, (org.telegram.ui.ActionBar.f6) null);
        l4Var.setText(LocaleController.getString(R.string.FontSize));
        linearLayout.addView(l4Var, w7.x5.t(-2, -2, 51, 3, 1, 3, 0));
        linearLayout.addView(new org.telegram.ui.e4(i4Var, i4Var.L), w7.x5.t(-1, -2, 51, 3, 0, 3, 0));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(i4Var.L, (org.telegram.ui.ActionBar.f6) null);
        l4Var2.setText(LocaleController.getString(R.string.FontType));
        linearLayout.addView(l4Var2, w7.x5.t(-2, -2, 51, 3, 4, 3, 2));
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            Activity activity3 = i4Var.L;
            org.telegram.ui.j0 j0Var = new org.telegram.ui.j0(activity3);
            j0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), i11, -1));
            RadioButton radioButton = new RadioButton(activity3);
            j0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
            boolean z10 = LocaleController.isRTL;
            j0Var.addView(radioButton, w7.x5.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 22, 13.0f, z10 ? 22 : 0, 0.0f));
            TextView textView = new TextView(activity3);
            wl.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z11 = LocaleController.isRTL;
            j0Var.addView(textView, w7.x5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 17 : 62, 0.0f, z11 ? 62 : 17, 0.0f));
            j0VarArr[i10] = j0Var;
            if (i10 == 0) {
                String string = LocaleController.getString(R.string.Default);
                Typeface typeface = Typeface.DEFAULT;
                textView.setText(string);
                textView.setTypeface(typeface);
                j0Var.setContentDescription(string);
                j0Var.invalidate();
            } else if (i10 == 1) {
                Typeface typeface2 = Typeface.SERIF;
                textView.setText("Serif");
                textView.setTypeface(typeface2);
                j0Var.setContentDescription("Serif");
                j0Var.invalidate();
            }
            ((RadioButton) j0VarArr[i10].b).a(i10 == i4Var.a, false);
            j0VarArr[i10].setTag(Integer.valueOf(i10));
            j0VarArr[i10].setOnClickListener(new org.telegram.ui.s(i4Var, 4));
            linearLayout.addView(j0VarArr[i10], w7.x5.n(-1, 50));
            i10++;
        }
        f3Var.customView = linearLayout;
        i4Var.I = f3Var;
        i4Var.a0(f3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:277:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0866  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x079b  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        boolean z10;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        BitmapFactory.Options options;
        ji.t a2;
        int i13;
        co coVar;
        mk mkVar;
        int i14 = this.a;
        String str = null;
        int i15 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i14) {
            case 0:
                r2 r2Var = (r2) obj3;
                nd ndVar = (nd) obj;
                r2Var.getClass();
                o2 o2Var = ((o2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(ndVar == null ? "🌤" : ndVar.c);
                sb2.append(" ");
                sb2.append(ndVar == null ? od.b() ? "24°C" : "72°F" : ndVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), r2Var.b.getFontMetricsInt(), false);
                r2 r2Var2 = o2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, r2Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), r2Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                o2Var.k = staticLayout;
                o2Var.l = staticLayout.getLineCount() > 0 ? o2Var.k.getLineWidth(0) : 0.0f;
                o2Var.m = o2Var.k.getLineCount() > 0 ? o2Var.k.getLineLeft(0) : 0.0f;
                o2Var.b = AndroidUtilities.dpf2(17.6f) + o2Var.l;
                o2Var.c = AndroidUtilities.dpf2(36.0f);
                r2Var.invalidate();
                r2Var.requestLayout();
                break;
            case 1:
                rb rbVar = (rb) obj3;
                oc ocVar = (oc) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - ocVar.getBottomPadding2(), rbVar.t2 - ocVar.getPaddingUnderContainer()));
                rbVar.S();
                if (max > 0) {
                    rg.k kVar = rbVar.J0;
                    if ((kVar instanceof rg.x2) && ((rg.x2) kVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = rbVar.N1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        rbVar.N1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        rg.y1 y1Var = rbVar.d1;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(y1Var, (Property<rg.y1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(rbVar.T0, (Property<m6, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        x5 x5Var = rbVar.W0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(x5Var, (Property<x5, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(rbVar.B0, (Property<rg.l1, Float>) property2, (z10 || rbVar.B1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(rbVar.A0, (Property<rg.h1, Float>) property2, (z10 || rbVar.B1) ? 1.0f : 0.0f));
                        rbVar.T0();
                        rbVar.N1.playTogether(arrayList);
                        if (z10) {
                            rbVar.N1.setDuration(350L);
                            rbVar.N1.setInterpolator(pr.h);
                        } else {
                            rbVar.N1.setDuration(250L);
                            rbVar.N1.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                        }
                        rbVar.N1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z10 ? pr.h : org.telegram.ui.ActionBar.p1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z10) {
                            rbVar.P0(false);
                        }
                        if (rbVar.h2 != z10) {
                            rbVar.g0();
                        }
                        rbVar.h2 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = rbVar.N1;
                if (animatorSet != null) {
                }
                rbVar.N1 = new AnimatorSet();
                arrayList = new ArrayList();
                rg.y1 y1Var2 = rbVar.d1;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(y1Var2, (Property<rg.y1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(rbVar.T0, (Property<m6, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                x5 x5Var2 = rbVar.W0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(x5Var2, (Property<x5, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(rbVar.B0, (Property<rg.l1, Float>) property22, (z10 || rbVar.B1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(rbVar.A0, (Property<rg.h1, Float>) property22, (z10 || rbVar.B1) ? 1.0f : 0.0f));
                rbVar.T0();
                rbVar.N1.playTogether(arrayList);
                if (z10) {
                }
                rbVar.N1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (rbVar.h2 != z10) {
                }
                rbVar.h2 = z10;
                break;
            case 2:
                q6 q6Var = (q6) obj3;
                z5 z5Var = (z5) obj2;
                nd ndVar2 = (nd) obj;
                if (ndVar2 != null) {
                    z5Var.dismiss();
                    q6Var.z0(false);
                    q6Var.d0(q6Var.p0(ndVar2));
                    break;
                }
                break;
            case 3:
                q6 q6Var2 = (q6) obj3;
                rg.s0 s0Var = (rg.s0) obj2;
                rg.p0 p0Var = (rg.p0) obj;
                if (s0Var != null) {
                    int i16 = q6Var2.F1;
                    s0Var.u0 = p0Var;
                    s0Var.q0.b(i16, p0Var, false);
                    s0Var.m();
                    q6Var2.d0(s0Var);
                    break;
                } else {
                    q6Var2.d0(q6Var2.i0(p0Var));
                    break;
                }
            case 4:
                ba baVar = (ba) obj3;
                ((n70) obj2).u();
                baVar.g(true);
                ia iaVar = baVar.W;
                la laVar = iaVar.X;
                if (laVar != null) {
                    laVar.run(new HashSet(iaVar.v));
                    break;
                }
                break;
            case 5:
                ba baVar2 = (ba) obj3;
                baVar2.W.G = true;
                ((lr[]) obj2)[0].dismiss();
                baVar2.g(true);
                break;
            case 6:
                jb jbVar = (jb) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                pc pcVar = jbVar.a;
                boolean q02 = pcVar.q0();
                int i17 = pcVar.c;
                if (q02) {
                    try {
                        pcVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                pcVar.P1 = false;
                h7 h7Var = pcVar.C0;
                if (h7Var != null) {
                    h7Var.c(false);
                }
                if (pcVar.G1 != null) {
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(pcVar.G1.getAbsolutePath(), options);
                        i11 = options.outWidth;
                    } catch (Exception unused2) {
                        i11 = -1;
                    }
                    try {
                        i12 = options.outHeight;
                    } catch (Exception unused3) {
                        i12 = -1;
                        if (num.intValue() != -1) {
                        }
                        if (num.intValue() != -1) {
                        }
                        o8 m10 = o8.m(r11, pcVar.G1);
                        m10.J0 = pcVar.v0;
                        m10.K0 = pcVar.w0;
                        if (pcVar.A0.j()) {
                        }
                    }
                    int i18 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i11 > i12) {
                            i18 = 270;
                        }
                    } else if (i12 > i11 && i18 != 0) {
                        i18 = 0;
                    }
                    o8 m102 = o8.m(i18, pcVar.G1);
                    m102.J0 = pcVar.v0;
                    m102.K0 = pcVar.w0;
                    if (pcVar.A0.j()) {
                        pcVar.K1 = m102;
                        ja.a(i17, m102);
                        pcVar.L1 = false;
                        if (callback != null) {
                            callback.run(new hb(jbVar, 2));
                            break;
                        } else {
                            pcVar.K(1, true);
                            break;
                        }
                    } else {
                        pcVar.G1 = null;
                        if (pcVar.A0.l(m102)) {
                            o8 a10 = o8.a(pcVar.A0.getLayout(), pcVar.A0.getContent());
                            pcVar.K1 = a10;
                            ja.a(i17, a10);
                            pcVar.L1 = false;
                            if (callback != null) {
                                callback.run(null);
                            }
                        } else if (callback != null) {
                            callback.run(null);
                        }
                        pcVar.m0(true);
                        break;
                    }
                }
                break;
            case 7:
                uc ucVar = (uc) obj2;
                Float f7 = (Float) obj;
                ucVar.i = f7.floatValue();
                tc tcVar = ((zc) obj3).a;
                if (tcVar != null) {
                    tcVar.t(f7.floatValue(), ucVar.a);
                    break;
                }
                break;
            case 8:
                fi.w0 w0Var = (fi.w0) obj3;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj2;
                int[] iArr = (int[]) obj;
                w0Var.getClass();
                boolean z11 = false;
                while (i15 < iArr.length) {
                    if (iArr[i15] == 0) {
                        z11 = true;
                    }
                    i15++;
                }
                w0Var.d = true;
                w0Var.e = true;
                w0Var.l();
                Iterator it = w0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                sVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 9:
                fi.w0 w0Var2 = (fi.w0) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                w0Var2.getClass();
                boolean z12 = false;
                while (i15 < iArr2.length) {
                    if (iArr2[i15] == 0) {
                        z12 = true;
                    }
                    i15++;
                }
                w0Var2.d = z12;
                w0Var2.e = z12;
                w0Var2.l();
                Iterator it2 = w0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 10:
                ((File[]) obj3)[0] = (File) obj;
                ((fi.g1) obj2).run();
                break;
            case 11:
                ((fi.f3) obj3).d.x.G((String) obj2, (String) obj, false);
                break;
            case 12:
                gi.f fVar = (gi.f) obj3;
                fVar.getClass();
                fVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 13:
                gi.f fVar2 = (gi.f) obj3;
                fVar2.getClass();
                fVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 14:
                gi.k0 k0Var = (gi.k0) obj3;
                k0Var.V((TLRPC.Chat) obj2, k0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 15:
                View view = (View) obj3;
                ig.s sVar2 = (ig.s) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(sVar2);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 16:
                ig.a2 a2Var = (ig.a2) obj2;
                ig.b2 f10 = ig.b2.f(UserConfig.selectedAccount);
                vi viVar = ((ig.i0) obj3).b;
                long n12 = viVar.n1();
                int i19 = f10.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i19).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = a2Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                    messagesStorage.getStorageQueue().postRunnable(new androidx.car.app.utils.b(f10, messagesStorage, a2Var, tL_messages_sendQuickReplyMessages, 17));
                }
                viVar.dismiss();
                break;
            case 17:
                ig.g1.W((ig.g1) obj3, (View) obj2, (String) obj);
                break;
            case 18:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                ji.v3 v3Var = ((ji.r) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    v3Var.Y2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str2;
                    v3Var.Q1(pageblockmath2);
                    break;
                }
            case 19:
                ji.h1 h1Var = (ji.h1) obj3;
                ji.t tVar = (ji.t) obj2;
                String str3 = (String) obj;
                h1Var.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    Editable text = h1Var.getText();
                    int spanStart = text.getSpanStart(tVar);
                    int spanEnd = text.getSpanEnd(tVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = ji.t.a(str3, h1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z13 = h1Var.v;
                        if (z13) {
                            h1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, h1Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, h1Var.length())), spannableString);
                        h1Var.setSelection(Math.min(max2 + 1, h1Var.length()));
                        if (z13) {
                            h1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 20:
                ji.c2 c2Var = (ji.c2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                c2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str4;
                    c2Var.P.Y2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str4;
                    c2Var.P.Q1(pageblockmath4);
                    break;
                }
            case 21:
                ji.v3 v3Var2 = (ji.v3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str5 = (String) obj;
                v3Var2.getClass();
                if (!TextUtils.equals(str5, pageblockmath5.source)) {
                    ji.g2 g2Var = v3Var2.J3;
                    if (g2Var != null) {
                        g2Var.d();
                    }
                    pageblockmath5.source = str5;
                    v3Var2.Y2.N(false);
                    ji.g2 g2Var2 = v3Var2.J3;
                    if (g2Var2 != null) {
                        g2Var2.h();
                    }
                    v3Var2.h3.onContentChanged();
                    break;
                }
                break;
            case 22:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 23:
                org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) obj3;
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (n2Var != null) {
                    if ((n2Var instanceof co) && (mkVar = (coVar = (co) n2Var).Y) != null) {
                        mkVar.P();
                        coVar.Y.n0(true, false, true);
                    }
                    if (n2Var.getContext() != null && n2Var.getParentActivity() != null) {
                        fi.k3 k3Var = new fi.k3(n2Var.getContext(), n2Var.getResourceProvider());
                        k3Var.k0 = n2Var.getParentActivity();
                        if (n3Var != null && n3Var.a != null) {
                            k3Var.E0 = true;
                            boolean z14 = n3Var.o;
                            k3Var.V = z14;
                            if (z14) {
                                k3Var.v(n3Var.r, false);
                            }
                            if (n3Var.n) {
                                i13 = n3Var.q;
                            } else {
                                int i20 = n3Var.p;
                                if (i20 < 0) {
                                    i20 = org.telegram.ui.ActionBar.j6.d6;
                                }
                                i13 = org.telegram.ui.ActionBar.j6.v0(i20, k3Var.E);
                            }
                            k3Var.t(i13, n3Var.n, false);
                            k3Var.y(n3Var.s, false);
                            k3Var.F0 = n3Var.j;
                            k3Var.G0 = n3Var.k;
                            boolean z15 = n3Var.u;
                            k3Var.w0 = z15;
                            fi.b3 b3Var = k3Var.x;
                            b3Var.setIsBackButtonVisible(z15);
                            k3Var.v.setAllowSwipes(n3Var.l);
                            AndroidUtilities.updateImageViewImageAnimated(k3Var.W.getBackButton(), k3Var.w0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = k3Var.m0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(k3Var.w0, false);
                            }
                            k3Var.r0 = n3Var.y;
                            k3Var.z0 = Boolean.valueOf(n3Var.B);
                            k3Var.A0 = n3Var.C;
                            fi.a1 a1Var = n3Var.K;
                            k3Var.B0 = a1Var;
                            if (a1Var != null) {
                                fi.y0 y0Var = a1Var.r;
                                SensorManager sensorManager = a1Var.a;
                                if (a1Var.l) {
                                    a1Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = a1Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(a1Var.n, sensor, fi.a1.a(a1Var.c));
                                        }
                                        Sensor sensor2 = a1Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(a1Var.p, sensor2, fi.a1.a(a1Var.e));
                                        }
                                        Sensor sensor3 = a1Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(y0Var, sensor3, fi.a1.a(a1Var.h));
                                        }
                                        Sensor sensor4 = a1Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(y0Var, sensor4, fi.a1.a(a1Var.h));
                                        }
                                        Sensor sensor5 = a1Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(a1Var.t, sensor5, fi.a1.a(a1Var.j));
                                        }
                                    }
                                }
                            }
                            a5.a aVar = n3Var.w;
                            if (aVar != null) {
                                fi.g3 g3Var = k3Var.l0;
                                int totalHeight = g3Var.getTotalHeight();
                                g3Var.e = aVar;
                                fi.v[] vVarArr = g3Var.f;
                                fi.x.b(vVarArr[0].l, (fi.w) aVar.c, false);
                                fi.x.b(vVarArr[1].l, (fi.w) aVar.d, false);
                                g3Var.invalidate();
                                if (totalHeight != g3Var.getTotalHeight() && g3Var.r != null) {
                                    if (totalHeight < g3Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(g3Var.r, 200L);
                                    } else {
                                        g3Var.r.run();
                                    }
                                }
                                int i21 = aVar.b;
                                Paint paint = g3Var.a;
                                g3Var.e.b = i21;
                                paint.setColor(i21);
                                g3Var.d.a(i21, true);
                            }
                            k3Var.x(n3Var.z, false, n3Var.A);
                            fi.f5 f5Var = n3Var.a;
                            k3Var.G = f5Var != null ? f5Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.z0 z0Var = n3Var.b;
                            if (z0Var != null) {
                                z0Var.onResume();
                                b3Var.O(k3Var.G, n3Var.b, n3Var.d, n3Var.f, n3Var.e);
                                boolean z16 = n3Var.t || n3Var.b.b;
                                String str6 = n3Var.x;
                                b3Var.h("setState(" + z16 + ", " + str6 + ")");
                                b3Var.N = z16;
                                b3Var.b = str6;
                                if (org.telegram.ui.ActionBar.j6.I.q() != n3Var.D) {
                                    b3Var.A();
                                }
                            } else {
                                f5Var.q = null;
                                f5Var.r = 0L;
                            }
                            k3Var.s(n2Var, n3Var.a);
                            k3Var.b0 = n3Var.v;
                            if (n3Var.G) {
                                k3Var.S0 = true;
                                k3Var.i();
                                org.telegram.ui.d3 d3Var = k3Var.U0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H)));
                                String str7 = n3Var.H;
                                k3Var.T0 = str7;
                                d3Var.a(userName, str7);
                                org.telegram.ui.d3 d3Var2 = k3Var.U0;
                                Paint paint2 = k3Var.P;
                                d3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                k3Var.U0.setBackgroundColor(paint2.getColor());
                                k3Var.U0.setVisibility(0);
                                k3Var.U0.setAlpha(1.0f);
                            }
                            k3Var.o(n3Var.L);
                            o3Var.h(o3Var.w, n3Var, false);
                            k3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 24:
                org.telegram.ui.ActionBar.u3 u3Var = (org.telegram.ui.ActionBar.u3) obj2;
                ((org.telegram.ui.ActionBar.n3) obj3).m = (Bitmap) obj;
                u3Var.getWindowView().setDrawingFromOverlay(false);
                u3Var.release();
                break;
            case 25:
                org.telegram.ui.ActionBar.w3 w3Var = (org.telegram.ui.ActionBar.w3) obj2;
                org.telegram.ui.ActionBar.x3 x3Var = ((org.telegram.ui.ActionBar.t3) obj3).p;
                if (((Boolean) obj).booleanValue()) {
                    w3Var.a(1.0f);
                    if (x3Var.a.getTabs().isEmpty()) {
                        x3Var.a(false);
                        break;
                    }
                } else {
                    w3Var.a(0.0f);
                    break;
                }
                break;
            case 26:
                a(obj);
                break;
            case 27:
                org.telegram.ui.m3 m3Var = (org.telegram.ui.m3) obj3;
                Activity activity = (Activity) obj2;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && m3Var.getWebView() != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str8.trim());
                    AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
                    URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                    int length = spannableStringBuilder.length();
                    int i22 = 0;
                    while (i15 < uRLSpanArr.length) {
                        length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i15]), length);
                        i22 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i15]), i22);
                        i15++;
                    }
                    Uri uriParseSafe = Utilities.uriParseSafe(str8);
                    if (uriParseSafe == null || !TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                        if ((uRLSpanArr.length <= 0 || length != 0 || i22 <= 0) && (uriParseSafe == null || uriParseSafe.getScheme() == null)) {
                            org.telegram.ui.web.l.b(activity, str8);
                            org.telegram.ui.web.z0 webView = m3Var.getWebView();
                            String str9 = org.telegram.ui.web.p1.a().b;
                            if (str9 != null) {
                                StringBuilder u10 = a4.a.u(str9);
                                u10.append(URLEncoder.encode(str8));
                                str = u10.toString();
                            }
                            webView.loadUrl(str);
                            break;
                        } else {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str8 = of.f.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            m3Var.getWebView().loadUrl(str8);
                            break;
                        }
                    }
                }
                break;
            case 28:
                co coVar2 = (co) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages2.peer = coVar2.getMessagesController().getInputPeer(coVar2.T5);
                tL_messages_sendQuickReplyMessages2.shortcut_id = ((ig.a2) obj2).a;
                coVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages2, null);
                mk mkVar2 = coVar2.Y;
                if (mkVar2 != null) {
                    mkVar2.setFieldText(null);
                    break;
                }
                break;
            default:
                co coVar3 = (co) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, coVar3.T5, coVar3.n5, coVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = coVar3.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = coVar3.N8();
                of2.suggestionParams = coVar3.g5;
                coVar3.getSendMessagesHelper().sendMessage(of2);
                coVar3.Y.setFieldText("");
                coVar3.e9(false);
                break;
        }
    }
}
