package bi;

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
import di.id;
import di.jc;
import di.jd;
import di.kc;
import di.oc;
import di.pc;
import di.uc;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.jr0;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.vi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.hd;
import org.telegram.ui.sk;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.f2 f2Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        org.telegram.ui.k4 k4Var = (org.telegram.ui.k4) this.b;
        Activity activity = (Activity) this.c;
        Integer num = (Integer) obj;
        org.telegram.ui.x3 x3Var = k4Var.K;
        org.telegram.ui.l0[] l0VarArr = k4Var.S0;
        if ((k4Var.u0[0].c() && k4Var.u0[0].c.E == null) || k4Var.L == null) {
            return;
        }
        if (num.intValue() == 1) {
            org.telegram.ui.m0 m0Var = k4Var.h0;
            int dp = AndroidUtilities.dp(56.0f);
            k4Var.I0 = dp;
            m0Var.setHeight(dp);
            k4Var.h0.h(true);
            return;
        }
        if (num.intValue() == 2) {
            if (!k4Var.u0[0].f()) {
                TLRPC.WebPage webPage = k4Var.u0[0].c.E;
                if (webPage == null) {
                    return;
                } else {
                    str4 = webPage.url;
                }
            } else if (k4Var.u0[0].getWebView() == null) {
                return;
            } else {
                str4 = k4Var.u0[0].getWebView().getUrl();
            }
            String u10 = org.telegram.ui.web.b1.u(str4);
            k4Var.a0(new jr0(k4Var.L, null, u10, false, u10, false, AndroidUtilities.computePerceivedBrightness(k4Var.h0.getBackgroundColor()) < 0.721f ? new b() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (!k4Var.u0[0].f()) {
                org.telegram.ui.o3 o3Var = k4Var.u0[0];
                TLRPC.WebPage webPage2 = o3Var.c.E;
                if (webPage2 == null) {
                    return;
                }
                str3 = webPage2.url;
                frameLayout = o3Var;
            } else {
                if (k4Var.u0[0].getWebView() == null) {
                    return;
                }
                str3 = k4Var.u0[0].getWebView().getUrl();
                frameLayout = k4Var.u0[0].f;
            }
            org.telegram.ui.k4.f(str3, k4Var.X, frameLayout, x3Var, null);
            return;
        }
        if (num.intValue() == 7) {
            org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2();
            k2Var.a = true;
            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
            if (U != null) {
                U.showAsSheet(new org.telegram.ui.web.o(x3Var != null ? new org.telegram.ui.b0(k4Var, 5) : null, new org.telegram.ui.r(k4Var, 2)), k2Var);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            org.telegram.ui.ActionBar.k2 k2Var2 = new org.telegram.ui.ActionBar.k2();
            k2Var2.a = true;
            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
            if (U2 != null) {
                U2.showAsSheet(new org.telegram.ui.web.g1(x3Var != null ? new org.telegram.ui.b0(k4Var, 6) : null, new org.telegram.ui.r(k4Var, 3)), k2Var2);
                return;
            }
            return;
        }
        if (num.intValue() == 9) {
            if (k4Var.u0[0].getWebView() != null) {
                k4Var.u0[0].getWebView().goForward();
                return;
            }
            return;
        }
        if (num.intValue() == 3) {
            if (!k4Var.u0[0].f()) {
                TLRPC.WebPage webPage3 = k4Var.u0[0].c.E;
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
                if (k4Var.u0[0].getWebView() == null) {
                    return;
                }
                str = k4Var.u0[0].getWebView().getUrl();
                str2 = k4Var.u0[0].getWebView().getOpenURL();
                file = null;
            }
            Activity activity2 = k4Var.L;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            if (file != null) {
                AndroidUtilities.openForView(file, null, "text/markdown", k4Var.L, null, true);
                return;
            }
            if (str == null) {
                return;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
            String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
            org.telegram.ui.y yVar = new org.telegram.ui.y(k4Var, str, 1);
            org.telegram.ui.z zVar = new org.telegram.ui.z(k4Var, hostAuthority2, hostAuthority, 1);
            if (k4Var.u0[0].f() && MessagesController.getInstance(k4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(k4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                org.telegram.ui.Components.g5.n0(activity, null, str, true, new f0(4, zVar, yVar));
                return;
            } else {
                yVar.run();
                return;
            }
        }
        if (num.intValue() != 4) {
            if (num.intValue() == 5) {
                if (!k4Var.u0[0].f() || k4Var.u0[0].getWebView() == null) {
                    return;
                }
                k4Var.u0[0].getWebView().reload();
                return;
            }
            if (num.intValue() != 10 || (f2Var = k4Var.u0[0].y) == null || f2Var.b() == null) {
                return;
            }
            k4Var.h(f2Var.b(), null, 1);
            return;
        }
        if (k4Var.u0[0].f()) {
            org.telegram.ui.ActionBar.m2 U3 = LaunchActivity.U();
            if (U3 != null) {
                org.telegram.ui.ActionBar.k2 k2Var3 = new org.telegram.ui.ActionBar.k2();
                k2Var3.a = true;
                U3.showAsSheet(new org.telegram.ui.web.y1(new org.telegram.ui.r(k4Var, 3)), k2Var3);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) k4Var.L, (org.telegram.ui.ActionBar.c6) null, false);
        e3Var.fixNavigationBar();
        e3Var.applyTopPadding = false;
        LinearLayout linearLayout = new LinearLayout(k4Var.L);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(k4Var.L, (org.telegram.ui.ActionBar.c6) null);
        m4Var.setText(LocaleController.getString(R.string.FontSize));
        linearLayout.addView(m4Var, w7.a6.t(-2, -2, 51, 3, 1, 3, 0));
        linearLayout.addView(new org.telegram.ui.g4(k4Var, k4Var.L), w7.a6.t(-1, -2, 51, 3, 0, 3, 0));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(k4Var.L, (org.telegram.ui.ActionBar.c6) null);
        m4Var2.setText(LocaleController.getString(R.string.FontType));
        linearLayout.addView(m4Var2, w7.a6.t(-2, -2, 51, 3, 4, 3, 2));
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            Activity activity3 = k4Var.L;
            org.telegram.ui.l0 l0Var = new org.telegram.ui.l0(activity3);
            l0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false), i11, -1));
            RadioButton radioButton = new RadioButton(activity3);
            l0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.D5, false), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.E5, false));
            boolean z10 = LocaleController.isRTL;
            l0Var.addView(radioButton, w7.a6.a(22.0f, z10 ? 0 : 22, 13.0f, z10 ? 22 : 0, 0.0f, 22, (z10 ? 5 : 3) | 48));
            TextView textView = new TextView(activity3);
            yh.t(textView, org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z11 = LocaleController.isRTL;
            l0Var.addView(textView, w7.a6.a(-1.0f, z11 ? 17 : 62, 0.0f, z11 ? 62 : 17, 0.0f, -1, (z11 ? 5 : 3) | 48));
            l0VarArr[i10] = l0Var;
            if (i10 == 0) {
                String string = LocaleController.getString(R.string.Default);
                Typeface typeface = Typeface.DEFAULT;
                textView.setText(string);
                textView.setTypeface(typeface);
                l0Var.setContentDescription(string);
                l0Var.invalidate();
            } else if (i10 == 1) {
                Typeface typeface2 = Typeface.SERIF;
                textView.setText("Serif");
                textView.setTypeface(typeface2);
                l0Var.setContentDescription("Serif");
                l0Var.invalidate();
            }
            ((RadioButton) l0VarArr[i10].b).a(i10 == k4Var.a, false);
            l0VarArr[i10].setTag(Integer.valueOf(i10));
            l0VarArr[i10].setOnClickListener(new org.telegram.ui.s(k4Var, 4));
            linearLayout.addView(l0VarArr[i10], w7.a6.n(-1, 50));
            i10++;
        }
        e3Var.customView = linearLayout;
        k4Var.I = e3Var;
        k4Var.a0(e3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:283:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x081b  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x074c  */
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
        ji.t a2;
        int i13;
        fo foVar;
        sk skVar;
        int i14 = this.a;
        String str = null;
        int i15 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i14) {
            case 0:
                q5 q5Var = (q5) obj3;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                q5Var.K3 = canApplyBoost;
                sg.j0.D1(new o3(q5Var, i15), (TL_stories.TL_premium_boostsStatus) obj2, canApplyBoost, q5Var.B1, true);
                sb sbVar = q5Var.J0;
                if (sbVar != null) {
                    sbVar.k1 = false;
                    sbVar.P();
                    break;
                }
                break;
            case 1:
                di.p2 p2Var = (di.p2) obj3;
                id idVar = (id) obj;
                p2Var.getClass();
                di.m2 m2Var = ((di.m2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(idVar == null ? "🌤" : idVar.c);
                sb2.append(" ");
                sb2.append(idVar == null ? jd.b() ? "24°C" : "72°F" : idVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), p2Var.b.getFontMetricsInt(), false);
                di.p2 p2Var2 = m2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, p2Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), p2Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                m2Var.k = staticLayout;
                m2Var.l = staticLayout.getLineCount() > 0 ? m2Var.k.getLineWidth(0) : 0.0f;
                m2Var.m = m2Var.k.getLineCount() > 0 ? m2Var.k.getLineLeft(0) : 0.0f;
                m2Var.b = AndroidUtilities.dpf2(17.6f) + m2Var.l;
                m2Var.c = AndroidUtilities.dpf2(36.0f);
                p2Var.invalidate();
                p2Var.requestLayout();
                break;
            case 2:
                di.mb mbVar = (di.mb) obj3;
                jc jcVar = (jc) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - jcVar.getBottomPadding2(), mbVar.t2 - jcVar.getPaddingUnderContainer()));
                mbVar.S();
                if (max > 0) {
                    rg.j jVar = mbVar.J0;
                    if ((jVar instanceof rg.x2) && ((rg.x2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = mbVar.N1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        mbVar.N1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        rg.y1 y1Var = mbVar.d1;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(y1Var, (Property<rg.y1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(mbVar.T0, (Property<di.k6, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        di.v5 v5Var = mbVar.W0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(v5Var, (Property<di.v5, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(mbVar.B0, (Property<rg.l1, Float>) property2, (z10 || mbVar.B1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(mbVar.A0, (Property<rg.h1, Float>) property2, (z10 || mbVar.B1) ? 1.0f : 0.0f));
                        mbVar.S0();
                        mbVar.N1.playTogether(arrayList);
                        if (z10) {
                            mbVar.N1.setDuration(350L);
                            mbVar.N1.setInterpolator(es.h);
                        } else {
                            mbVar.N1.setDuration(250L);
                            mbVar.N1.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                        }
                        mbVar.N1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z10 ? es.h : org.telegram.ui.ActionBar.o1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z10) {
                            mbVar.O0(false);
                        }
                        if (mbVar.h2 != z10) {
                            mbVar.f0();
                        }
                        mbVar.h2 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = mbVar.N1;
                if (animatorSet != null) {
                }
                mbVar.N1 = new AnimatorSet();
                arrayList = new ArrayList();
                rg.y1 y1Var2 = mbVar.d1;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(y1Var2, (Property<rg.y1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(mbVar.T0, (Property<di.k6, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                di.v5 v5Var2 = mbVar.W0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(v5Var2, (Property<di.v5, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(mbVar.B0, (Property<rg.l1, Float>) property22, (z10 || mbVar.B1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(mbVar.A0, (Property<rg.h1, Float>) property22, (z10 || mbVar.B1) ? 1.0f : 0.0f));
                mbVar.S0();
                mbVar.N1.playTogether(arrayList);
                if (z10) {
                }
                mbVar.N1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (mbVar.h2 != z10) {
                }
                mbVar.h2 = z10;
                break;
            case 3:
                di.o6 o6Var = (di.o6) obj3;
                di.x5 x5Var = (di.x5) obj2;
                id idVar2 = (id) obj;
                if (idVar2 != null) {
                    x5Var.dismiss();
                    o6Var.y0(false);
                    o6Var.d0(o6Var.o0(idVar2));
                    break;
                }
                break;
            case 4:
                di.o6 o6Var2 = (di.o6) obj3;
                rg.s0 s0Var = (rg.s0) obj2;
                rg.p0 p0Var = (rg.p0) obj;
                if (s0Var != null) {
                    int i16 = o6Var2.F1;
                    s0Var.u0 = p0Var;
                    s0Var.q0.b(i16, p0Var, false);
                    s0Var.m();
                    o6Var2.d0(s0Var);
                    break;
                } else {
                    o6Var2.d0(o6Var2.h0(p0Var));
                    break;
                }
            case 5:
                di.x9 x9Var = (di.x9) obj3;
                ((m80) obj2).u();
                x9Var.g(true);
                di.ea eaVar = x9Var.W;
                di.ha haVar = eaVar.X;
                if (haVar != null) {
                    haVar.run(new HashSet(eaVar.v));
                    break;
                }
                break;
            case 6:
                di.x9 x9Var2 = (di.x9) obj3;
                x9Var2.W.G = true;
                ((as[]) obj2)[0].dismiss();
                x9Var2.g(true);
                break;
            case 7:
                di.fb fbVar = (di.fb) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                kc kcVar = fbVar.a;
                boolean p02 = kcVar.p0();
                int i17 = kcVar.c;
                if (p02) {
                    try {
                        kcVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                kcVar.P1 = false;
                di.e7 e7Var = kcVar.C0;
                if (e7Var != null) {
                    e7Var.c(false);
                }
                if (kcVar.G1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(kcVar.G1.getAbsolutePath(), options);
                        i11 = options.outWidth;
                        try {
                            i12 = options.outHeight;
                        } catch (Exception unused2) {
                            i12 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            di.k8 m10 = di.k8.m(r11, kcVar.G1);
                            m10.J0 = kcVar.v0;
                            m10.K0 = kcVar.w0;
                            if (kcVar.A0.j()) {
                            }
                        }
                    } catch (Exception unused3) {
                        i11 = -1;
                    }
                    int i18 = num.intValue() != -1 ? 0 : 90;
                    if (num.intValue() != -1) {
                        if (i11 > i12) {
                            i18 = 270;
                        }
                    } else if (i12 > i11 && i18 != 0) {
                        i18 = 0;
                    }
                    di.k8 m102 = di.k8.m(i18, kcVar.G1);
                    m102.J0 = kcVar.v0;
                    m102.K0 = kcVar.w0;
                    if (kcVar.A0.j()) {
                        kcVar.K1 = m102;
                        di.fa.a(i17, m102);
                        kcVar.L1 = false;
                        if (callback != null) {
                            callback.run(new di.db(fbVar, 2));
                            break;
                        } else {
                            kcVar.J(1, true);
                            break;
                        }
                    } else {
                        kcVar.G1 = null;
                        if (kcVar.A0.l(m102)) {
                            di.k8 a10 = di.k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
                            kcVar.K1 = a10;
                            di.fa.a(i17, a10);
                            kcVar.L1 = false;
                            if (callback != null) {
                                callback.run(null);
                            }
                        } else if (callback != null) {
                            callback.run(null);
                        }
                        kcVar.l0(true);
                        break;
                    }
                }
                break;
            case 8:
                pc pcVar = (pc) obj2;
                Float f7 = (Float) obj;
                pcVar.i = f7.floatValue();
                oc ocVar = ((uc) obj3).a;
                if (ocVar != null) {
                    ocVar.B(f7.floatValue(), pcVar.a);
                    break;
                }
                break;
            case 9:
                fi.v0 v0Var = (fi.v0) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj2;
                int[] iArr = (int[]) obj;
                v0Var.getClass();
                boolean z11 = false;
                while (i15 < iArr.length) {
                    if (iArr[i15] == 0) {
                        z11 = true;
                    }
                    i15++;
                }
                v0Var.d = true;
                v0Var.e = true;
                v0Var.k();
                Iterator it = v0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                qVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 10:
                fi.v0 v0Var2 = (fi.v0) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                v0Var2.getClass();
                boolean z12 = false;
                while (i15 < iArr2.length) {
                    if (iArr2[i15] == 0) {
                        z12 = true;
                    }
                    i15++;
                }
                v0Var2.d = z12;
                v0Var2.e = z12;
                v0Var2.k();
                Iterator it2 = v0Var2.f.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 11:
                ((File[]) obj3)[0] = (File) obj;
                ((fi.f1) obj2).run();
                break;
            case 12:
                ((fi.f3) obj3).d.x.F((String) obj2, (String) obj, false);
                break;
            case 13:
                gi.f fVar = (gi.f) obj3;
                fVar.getClass();
                fVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 14:
                gi.f fVar2 = (gi.f) obj3;
                fVar2.getClass();
                fVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 15:
                gi.k0 k0Var = (gi.k0) obj3;
                k0Var.W((TLRPC.Chat) obj2, k0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 16:
                View view = (View) obj3;
                ig.s sVar = (ig.s) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(sVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 17:
                ig.a2 a2Var = (ig.a2) obj2;
                ig.b2 f10 = ig.b2.f(UserConfig.selectedAccount);
                vi viVar = ((ig.i0) obj3).b;
                long p12 = viVar.p1();
                int i19 = f10.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i19).getInputPeer(p12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = a2Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                    messagesStorage.getStorageQueue().postRunnable(new androidx.car.app.utils.b(f10, messagesStorage, a2Var, tL_messages_sendQuickReplyMessages, 16));
                }
                viVar.dismiss();
                break;
            case 18:
                ig.g1.W((ig.g1) obj3, (View) obj2, (String) obj);
                break;
            case 19:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                ji.x3 x3Var = ((ji.r) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    x3Var.W2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str2;
                    x3Var.S1(pageblockmath2);
                    break;
                }
            case 20:
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
            case 21:
                ji.d2 d2Var = (ji.d2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                d2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str4;
                    d2Var.P.W2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str4;
                    d2Var.P.S1(pageblockmath4);
                    break;
                }
            case 22:
                ji.x3 x3Var2 = (ji.x3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str5 = (String) obj;
                x3Var2.getClass();
                if (!TextUtils.equals(str5, pageblockmath5.source)) {
                    ji.h2 h2Var = x3Var2.H3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    pageblockmath5.source = str5;
                    x3Var2.W2.N(false);
                    ji.h2 h2Var2 = x3Var2.H3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    x3Var2.f3.onContentChanged();
                    break;
                }
                break;
            case 23:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 24:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj3;
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj2;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj;
                if (m2Var2 != null) {
                    if ((m2Var2 instanceof fo) && (skVar = (foVar = (fo) m2Var2).Y) != null) {
                        skVar.N();
                        foVar.Y.l0(true, false, true);
                    }
                    if (m2Var2.getContext() != null && m2Var2.getParentActivity() != null) {
                        fi.k3 k3Var = new fi.k3(m2Var2.getContext(), m2Var2.getResourceProvider());
                        k3Var.k0 = m2Var2.getParentActivity();
                        if (l3Var != null && l3Var.a != null) {
                            k3Var.E0 = true;
                            boolean z14 = l3Var.o;
                            k3Var.V = z14;
                            if (z14) {
                                k3Var.w(l3Var.r, false);
                            }
                            if (l3Var.n) {
                                i13 = l3Var.q;
                            } else {
                                int i20 = l3Var.p;
                                if (i20 < 0) {
                                    i20 = org.telegram.ui.ActionBar.g6.d6;
                                }
                                i13 = org.telegram.ui.ActionBar.g6.w0(i20, k3Var.E);
                            }
                            k3Var.u(i13, l3Var.n, false);
                            k3Var.z(l3Var.s, false);
                            k3Var.F0 = l3Var.j;
                            k3Var.G0 = l3Var.k;
                            boolean z15 = l3Var.u;
                            k3Var.w0 = z15;
                            fi.b3 b3Var = k3Var.x;
                            b3Var.setIsBackButtonVisible(z15);
                            k3Var.v.setAllowSwipes(l3Var.l);
                            AndroidUtilities.updateImageViewImageAnimated(k3Var.W.getBackButton(), k3Var.w0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = k3Var.m0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(k3Var.w0, false);
                            }
                            k3Var.r0 = l3Var.y;
                            k3Var.z0 = Boolean.valueOf(l3Var.B);
                            k3Var.A0 = l3Var.C;
                            fi.z0 z0Var = l3Var.K;
                            k3Var.B0 = z0Var;
                            if (z0Var != null) {
                                fi.x0 x0Var = z0Var.r;
                                SensorManager sensorManager = z0Var.a;
                                if (z0Var.l) {
                                    z0Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = z0Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(z0Var.n, sensor, fi.z0.a(z0Var.c));
                                        }
                                        Sensor sensor2 = z0Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(z0Var.p, sensor2, fi.z0.a(z0Var.e));
                                        }
                                        Sensor sensor3 = z0Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(x0Var, sensor3, fi.z0.a(z0Var.h));
                                        }
                                        Sensor sensor4 = z0Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(x0Var, sensor4, fi.z0.a(z0Var.h));
                                        }
                                        Sensor sensor5 = z0Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(z0Var.t, sensor5, fi.z0.a(z0Var.j));
                                        }
                                    }
                                }
                            }
                            a5.a aVar = l3Var.w;
                            if (aVar != null) {
                                fi.g3 g3Var = k3Var.l0;
                                int totalHeight = g3Var.getTotalHeight();
                                g3Var.e = aVar;
                                fi.u[] uVarArr = g3Var.f;
                                fi.w.b(uVarArr[0].l, (fi.v) aVar.c, false);
                                fi.w.b(uVarArr[1].l, (fi.v) aVar.d, false);
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
                            k3Var.y(l3Var.z, false, l3Var.A);
                            fi.e5 e5Var = l3Var.a;
                            k3Var.G = e5Var != null ? e5Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.y0 y0Var = l3Var.b;
                            if (y0Var != null) {
                                y0Var.onResume();
                                b3Var.N(k3Var.G, l3Var.b, l3Var.d, l3Var.f, l3Var.e);
                                boolean z16 = l3Var.t || l3Var.b.b;
                                String str6 = l3Var.x;
                                b3Var.g("setState(" + z16 + ", " + str6 + ")");
                                b3Var.N = z16;
                                b3Var.b = str6;
                                if (org.telegram.ui.ActionBar.g6.I.q() != l3Var.D) {
                                    b3Var.z();
                                }
                            } else {
                                e5Var.q = null;
                                e5Var.r = 0L;
                            }
                            k3Var.t(m2Var2, l3Var.a);
                            k3Var.b0 = l3Var.v;
                            if (l3Var.G) {
                                k3Var.S0 = true;
                                k3Var.i();
                                org.telegram.ui.f3 f3Var = k3Var.U0;
                                String userName = k3Var.m() ? k3Var.v0.e : UserObject.getUserName(MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H)));
                                String str7 = l3Var.H;
                                k3Var.T0 = str7;
                                f3Var.a(userName, str7);
                                org.telegram.ui.f3 f3Var2 = k3Var.U0;
                                Paint paint2 = k3Var.P;
                                f3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                k3Var.U0.setBackgroundColor(paint2.getColor());
                                k3Var.U0.setVisibility(0);
                                k3Var.U0.setAlpha(1.0f);
                            }
                            k3Var.p(l3Var.L);
                            m3Var.h(m3Var.w, l3Var, false);
                            k3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.ActionBar.s3 s3Var = (org.telegram.ui.ActionBar.s3) obj2;
                ((org.telegram.ui.ActionBar.l3) obj3).m = (Bitmap) obj;
                s3Var.getWindowView().setDrawingFromOverlay(false);
                s3Var.release();
                break;
            case 26:
                org.telegram.ui.ActionBar.u3 u3Var = (org.telegram.ui.ActionBar.u3) obj2;
                org.telegram.ui.ActionBar.v3 v3Var = ((org.telegram.ui.ActionBar.r3) obj3).p;
                if (((Boolean) obj).booleanValue()) {
                    u3Var.a(1.0f);
                    if (v3Var.a.getTabs().isEmpty()) {
                        v3Var.a(false);
                        break;
                    }
                } else {
                    u3Var.a(0.0f);
                    break;
                }
                break;
            case 27:
                a(obj);
                break;
            case 28:
                org.telegram.ui.o3 o3Var = (org.telegram.ui.o3) obj3;
                Activity activity = (Activity) obj2;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && o3Var.getWebView() != null) {
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
                            org.telegram.ui.web.k.b(activity, str8);
                            org.telegram.ui.web.y0 webView = o3Var.getWebView();
                            String str9 = org.telegram.ui.web.n1.a().b;
                            if (str9 != null) {
                                StringBuilder u10 = a1.g.u(str9);
                                u10.append(URLEncoder.encode(str8));
                                str = u10.toString();
                            }
                            webView.loadUrl(str);
                            break;
                        } else {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str8 = pf.d.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            o3Var.getWebView().loadUrl(str8);
                            break;
                        }
                    }
                }
                break;
            default:
                hd hdVar = (hd) obj3;
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                hdVar.c = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    int i23 = tL_premium_boostsStatus.level;
                    hdVar.b = i23;
                    if (chat != null) {
                        chat.flags |= 1024;
                        chat.level = i23;
                    }
                }
                hdVar.X0(true);
                di.d dVar = hdVar.P;
                if (dVar != null) {
                    dVar.setLoading(false);
                    break;
                }
                break;
        }
    }
}
