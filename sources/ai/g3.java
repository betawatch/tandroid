package ai;

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
import ci.kd;
import ci.ld;
import ci.wc;
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
import org.telegram.messenger.ul;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g3(int i10, Object obj, Object obj2) {
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
        org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.b;
        Activity activity = (Activity) this.c;
        Integer num = (Integer) obj;
        org.telegram.ui.v3 v3Var = i4Var.K;
        org.telegram.ui.k0[] k0VarArr = i4Var.S0;
        if ((i4Var.u0[0].c() && i4Var.u0[0].c.E == null) || i4Var.L == null) {
            return;
        }
        if (num.intValue() == 1) {
            org.telegram.ui.l0 l0Var = i4Var.h0;
            int dp = AndroidUtilities.dp(56.0f);
            i4Var.I0 = dp;
            l0Var.setHeight(dp);
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
            String v = org.telegram.ui.web.b1.v(str4);
            i4Var.a0(new hq0(i4Var.L, null, v, false, v, false, AndroidUtilities.computePerceivedBrightness(i4Var.h0.getBackgroundColor()) < 0.721f ? new d() : null));
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
                U.showAsSheet(new org.telegram.ui.web.o(v3Var != null ? new org.telegram.ui.b0(i4Var, 5) : null, new org.telegram.ui.r(i4Var, 2)), l2Var);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
            l2Var2.a = true;
            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
            if (U2 != null) {
                U2.showAsSheet(new org.telegram.ui.web.g1(v3Var != null ? new org.telegram.ui.b0(i4Var, 6) : null, new org.telegram.ui.r(i4Var, 3)), l2Var2);
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
            org.telegram.ui.y yVar = new org.telegram.ui.y(i4Var, str, 1);
            org.telegram.ui.z zVar = new org.telegram.ui.z(i4Var, hostAuthority2, hostAuthority, 1);
            if (i4Var.u0[0].f() && MessagesController.getInstance(i4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(i4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                org.telegram.ui.Components.e5.o0(activity, null, str, true, new m0(4, zVar, yVar));
                return;
            } else {
                yVar.run();
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
            if (num.intValue() != 10 || (f2Var = i4Var.u0[0].y) == null || f2Var.b() == null) {
                return;
            }
            i4Var.h(f2Var.b(), null, 1);
            return;
        }
        if (i4Var.u0[0].f()) {
            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
            if (U3 != null) {
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.a = true;
                U3.showAsSheet(new org.telegram.ui.web.y1(new org.telegram.ui.r(i4Var, 3)), l2Var3);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) i4Var.L, (org.telegram.ui.ActionBar.d6) null, false);
        f3Var.fixNavigationBar();
        f3Var.applyTopPadding = false;
        LinearLayout linearLayout = new LinearLayout(i4Var.L);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(i4Var.L, (org.telegram.ui.ActionBar.d6) null);
        m4Var.setText(LocaleController.getString(R.string.FontSize));
        linearLayout.addView(m4Var, w7.x5.t(-2, -2, 51, 3, 1, 3, 0));
        linearLayout.addView(new org.telegram.ui.e4(i4Var, i4Var.L), w7.x5.t(-1, -2, 51, 3, 0, 3, 0));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(i4Var.L, (org.telegram.ui.ActionBar.d6) null);
        m4Var2.setText(LocaleController.getString(R.string.FontType));
        linearLayout.addView(m4Var2, w7.x5.t(-2, -2, 51, 3, 4, 3, 2));
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            Activity activity3 = i4Var.L;
            org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity3);
            k0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.i6, false), i11, -1));
            RadioButton radioButton = new RadioButton(activity3);
            k0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.D5, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E5, false));
            boolean z10 = LocaleController.isRTL;
            k0Var.addView(radioButton, w7.x5.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 22, 13.0f, z10 ? 22 : 0, 0.0f));
            TextView textView = new TextView(activity3);
            ul.s(textView, org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z11 = LocaleController.isRTL;
            k0Var.addView(textView, w7.x5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 17 : 62, 0.0f, z11 ? 62 : 17, 0.0f));
            k0VarArr[i10] = k0Var;
            if (i10 == 0) {
                String string = LocaleController.getString(R.string.Default);
                Typeface typeface = Typeface.DEFAULT;
                textView.setText(string);
                textView.setTypeface(typeface);
                k0Var.setContentDescription(string);
                k0Var.invalidate();
            } else if (i10 == 1) {
                Typeface typeface2 = Typeface.SERIF;
                textView.setText("Serif");
                textView.setTypeface(typeface2);
                k0Var.setContentDescription("Serif");
                k0Var.invalidate();
            }
            ((RadioButton) k0VarArr[i10].b).a(i10 == i4Var.a, false);
            k0VarArr[i10].setTag(Integer.valueOf(i10));
            k0VarArr[i10].setOnClickListener(new org.telegram.ui.s(i4Var, 4));
            linearLayout.addView(k0VarArr[i10], w7.x5.n(-1, 50));
            i10++;
        }
        f3Var.customView = linearLayout;
        i4Var.I = f3Var;
        i4Var.a0(f3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:269:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0721  */
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
        ii.t a2;
        int i13;
        xn xnVar;
        jk jkVar;
        int i14 = this.a;
        String str = null;
        int i15 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i14) {
            case 0:
                e6 e6Var = (e6) obj3;
                ChannelBoostsController.CanApplyBoost canApplyBoost = (ChannelBoostsController.CanApplyBoost) obj;
                e6Var.K3 = canApplyBoost;
                rg.j0.C1(new y3(e6Var, i15), (TL_stories.TL_premium_boostsStatus) obj2, canApplyBoost, e6Var.B1, true);
                jc jcVar = e6Var.J0;
                if (jcVar != null) {
                    jcVar.k1 = false;
                    jcVar.P();
                    break;
                }
                break;
            case 1:
                ci.q2 q2Var = (ci.q2) obj3;
                kd kdVar = (kd) obj;
                q2Var.getClass();
                ci.n2 n2Var = ((ci.n2[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(kdVar == null ? "🌤" : kdVar.c);
                sb2.append(" ");
                sb2.append(kdVar == null ? ld.b() ? "24°C" : "72°F" : kdVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), q2Var.b.getFontMetricsInt(), false);
                ci.q2 q2Var2 = n2Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, q2Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), q2Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                n2Var.k = staticLayout;
                n2Var.l = staticLayout.getLineCount() > 0 ? n2Var.k.getLineWidth(0) : 0.0f;
                n2Var.m = n2Var.k.getLineCount() > 0 ? n2Var.k.getLineLeft(0) : 0.0f;
                n2Var.b = AndroidUtilities.dpf2(17.6f) + n2Var.l;
                n2Var.c = AndroidUtilities.dpf2(36.0f);
                q2Var.invalidate();
                q2Var.requestLayout();
                break;
            case 2:
                ci.nb nbVar = (ci.nb) obj3;
                ci.kc kcVar = (ci.kc) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - kcVar.getBottomPadding2(), nbVar.t2 - kcVar.getPaddingUnderContainer()));
                nbVar.S();
                if (max > 0) {
                    qg.j jVar = nbVar.J0;
                    if ((jVar instanceof qg.x2) && ((qg.x2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = nbVar.N1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        nbVar.N1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        qg.z1 z1Var = nbVar.d1;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(z1Var, (Property<qg.z1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(nbVar.T0, (Property<ci.l6, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        ci.w5 w5Var = nbVar.W0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(w5Var, (Property<ci.w5, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(nbVar.B0, (Property<qg.m1, Float>) property2, (z10 || nbVar.B1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(nbVar.A0, (Property<qg.i1, Float>) property2, (z10 || nbVar.B1) ? 1.0f : 0.0f));
                        nbVar.T0();
                        nbVar.N1.playTogether(arrayList);
                        if (z10) {
                            nbVar.N1.setDuration(350L);
                            nbVar.N1.setInterpolator(rr.h);
                        } else {
                            nbVar.N1.setDuration(250L);
                            nbVar.N1.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                        }
                        nbVar.N1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z10 ? rr.h : org.telegram.ui.ActionBar.p1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z10) {
                            nbVar.P0(false);
                        }
                        if (nbVar.h2 != z10) {
                            nbVar.g0();
                        }
                        nbVar.h2 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = nbVar.N1;
                if (animatorSet != null) {
                }
                nbVar.N1 = new AnimatorSet();
                arrayList = new ArrayList();
                qg.z1 z1Var2 = nbVar.d1;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(z1Var2, (Property<qg.z1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(nbVar.T0, (Property<ci.l6, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                ci.w5 w5Var2 = nbVar.W0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w5Var2, (Property<ci.w5, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(nbVar.B0, (Property<qg.m1, Float>) property22, (z10 || nbVar.B1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(nbVar.A0, (Property<qg.i1, Float>) property22, (z10 || nbVar.B1) ? 1.0f : 0.0f));
                nbVar.T0();
                nbVar.N1.playTogether(arrayList);
                if (z10) {
                }
                nbVar.N1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (nbVar.h2 != z10) {
                }
                nbVar.h2 = z10;
                break;
            case 3:
                ci.q6 q6Var = (ci.q6) obj3;
                ci.y5 y5Var = (ci.y5) obj2;
                kd kdVar2 = (kd) obj;
                if (kdVar2 != null) {
                    y5Var.dismiss();
                    q6Var.z0(false);
                    q6Var.d0(q6Var.p0(kdVar2));
                    break;
                }
                break;
            case 4:
                ci.q6 q6Var2 = (ci.q6) obj3;
                qg.t0 t0Var = (qg.t0) obj2;
                qg.q0 q0Var = (qg.q0) obj;
                if (t0Var != null) {
                    int i16 = q6Var2.F1;
                    t0Var.u0 = q0Var;
                    t0Var.q0.b(i16, q0Var, false);
                    t0Var.m();
                    q6Var2.d0(t0Var);
                    break;
                } else {
                    q6Var2.d0(q6Var2.i0(q0Var));
                    break;
                }
            case 5:
                ci.y9 y9Var = (ci.y9) obj3;
                ((o70) obj2).u();
                y9Var.g(true);
                ci.fa faVar = y9Var.W;
                ci.ia iaVar = faVar.X;
                if (iaVar != null) {
                    iaVar.run(new HashSet(faVar.v));
                    break;
                }
                break;
            case 6:
                ci.y9 y9Var2 = (ci.y9) obj3;
                y9Var2.W.G = true;
                ((nr[]) obj2)[0].dismiss();
                y9Var2.g(true);
                break;
            case 7:
                ci.gb gbVar = (ci.gb) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                ci.lc lcVar = gbVar.a;
                boolean q02 = lcVar.q0();
                int i17 = lcVar.c;
                if (q02) {
                    try {
                        lcVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                lcVar.P1 = false;
                ci.f7 f7Var = lcVar.C0;
                if (f7Var != null) {
                    f7Var.c(false);
                }
                if (lcVar.G1 != null) {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(lcVar.G1.getAbsolutePath(), options);
                        i11 = options.outWidth;
                        try {
                            i12 = options.outHeight;
                        } catch (Exception unused2) {
                            i12 = -1;
                            if (num.intValue() != -1) {
                            }
                            if (num.intValue() != -1) {
                            }
                            ci.l8 m10 = ci.l8.m(r11, lcVar.G1);
                            m10.J0 = lcVar.v0;
                            m10.K0 = lcVar.w0;
                            if (lcVar.A0.j()) {
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
                    ci.l8 m102 = ci.l8.m(i18, lcVar.G1);
                    m102.J0 = lcVar.v0;
                    m102.K0 = lcVar.w0;
                    if (lcVar.A0.j()) {
                        lcVar.K1 = m102;
                        ci.ga.a(i17, m102);
                        lcVar.L1 = false;
                        if (callback != null) {
                            callback.run(new ci.eb(gbVar, 2));
                            break;
                        } else {
                            lcVar.K(1, true);
                            break;
                        }
                    } else {
                        lcVar.G1 = null;
                        if (lcVar.A0.l(m102)) {
                            ci.l8 a10 = ci.l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
                            lcVar.K1 = a10;
                            ci.ga.a(i17, a10);
                            lcVar.L1 = false;
                            if (callback != null) {
                                callback.run(null);
                            }
                        } else if (callback != null) {
                            callback.run(null);
                        }
                        lcVar.m0(true);
                        break;
                    }
                }
                break;
            case 8:
                ci.qc qcVar = (ci.qc) obj2;
                Float f7 = (Float) obj;
                qcVar.i = f7.floatValue();
                ci.pc pcVar = ((wc) obj3).a;
                if (pcVar != null) {
                    pcVar.C(f7.floatValue(), qcVar.a);
                    break;
                }
                break;
            case 9:
                ei.w0 w0Var = (ei.w0) obj3;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) obj2;
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
                qVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 10:
                ei.w0 w0Var2 = (ei.w0) obj3;
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
            case 11:
                ((File[]) obj3)[0] = (File) obj;
                ((ei.g1) obj2).run();
                break;
            case 12:
                ((ei.f3) obj3).d.x.G((String) obj2, (String) obj, false);
                break;
            case 13:
                fi.f fVar = (fi.f) obj3;
                fVar.getClass();
                fVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 14:
                fi.f fVar2 = (fi.f) obj3;
                fVar2.getClass();
                fVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 15:
                fi.k0 k0Var = (fi.k0) obj3;
                k0Var.V((TLRPC.Chat) obj2, k0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 16:
                View view = (View) obj3;
                hg.u uVar = (hg.u) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(uVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 17:
                hg.b2 b2Var = (hg.b2) obj2;
                hg.c2 f10 = hg.c2.f(UserConfig.selectedAccount);
                wi wiVar = ((hg.k0) obj3).b;
                long n12 = wiVar.n1();
                int i19 = f10.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i19).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = b2Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                    messagesStorage.getStorageQueue().postRunnable(new h5(f10, messagesStorage, b2Var, tL_messages_sendQuickReplyMessages, 16));
                }
                wiVar.dismiss();
                break;
            case 18:
                hg.h1.W((hg.h1) obj3, (View) obj2, (String) obj);
                break;
            case 19:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                ii.x3 x3Var = ((ii.r) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    x3Var.Y2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str2;
                    x3Var.R1(pageblockmath2);
                    break;
                }
            case 20:
                ii.i1 i1Var = (ii.i1) obj3;
                ii.t tVar = (ii.t) obj2;
                String str3 = (String) obj;
                i1Var.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    Editable text = i1Var.getText();
                    int spanStart = text.getSpanStart(tVar);
                    int spanEnd = text.getSpanEnd(tVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = ii.t.a(str3, i1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z13 = i1Var.v;
                        if (z13) {
                            i1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, i1Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, i1Var.length())), spannableString);
                        i1Var.setSelection(Math.min(max2 + 1, i1Var.length()));
                        if (z13) {
                            i1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 21:
                ii.e2 e2Var = (ii.e2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                e2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str4;
                    e2Var.P.Y2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str4;
                    e2Var.P.R1(pageblockmath4);
                    break;
                }
            case 22:
                ii.x3 x3Var2 = (ii.x3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str5 = (String) obj;
                x3Var2.getClass();
                if (!TextUtils.equals(str5, pageblockmath5.source)) {
                    ii.i2 i2Var = x3Var2.J3;
                    if (i2Var != null) {
                        i2Var.d();
                    }
                    pageblockmath5.source = str5;
                    x3Var2.Y2.N(false);
                    ii.i2 i2Var2 = x3Var2.J3;
                    if (i2Var2 != null) {
                        i2Var2.h();
                    }
                    x3Var2.h3.onContentChanged();
                    break;
                }
                break;
            case 23:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 24:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj3;
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) obj2;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj;
                if (n2Var2 != null) {
                    if ((n2Var2 instanceof xn) && (jkVar = (xnVar = (xn) n2Var2).Y) != null) {
                        jkVar.Q();
                        xnVar.Y.o0(true, false, true);
                    }
                    if (n2Var2.getContext() != null && n2Var2.getParentActivity() != null) {
                        ei.k3 k3Var = new ei.k3(n2Var2.getContext(), n2Var2.getResourceProvider());
                        k3Var.k0 = n2Var2.getParentActivity();
                        if (m3Var != null && m3Var.a != null) {
                            k3Var.E0 = true;
                            boolean z14 = m3Var.o;
                            k3Var.V = z14;
                            if (z14) {
                                k3Var.v(m3Var.r, false);
                            }
                            if (m3Var.n) {
                                i13 = m3Var.q;
                            } else {
                                int i20 = m3Var.p;
                                if (i20 < 0) {
                                    i20 = org.telegram.ui.ActionBar.h6.d6;
                                }
                                i13 = org.telegram.ui.ActionBar.h6.v0(i20, k3Var.E);
                            }
                            k3Var.t(i13, m3Var.n, false);
                            k3Var.y(m3Var.s, false);
                            k3Var.F0 = m3Var.j;
                            k3Var.G0 = m3Var.k;
                            boolean z15 = m3Var.u;
                            k3Var.w0 = z15;
                            ei.b3 b3Var = k3Var.x;
                            b3Var.setIsBackButtonVisible(z15);
                            k3Var.v.setAllowSwipes(m3Var.l);
                            AndroidUtilities.updateImageViewImageAnimated(k3Var.W.getBackButton(), k3Var.w0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = k3Var.m0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(k3Var.w0, false);
                            }
                            k3Var.r0 = m3Var.y;
                            k3Var.z0 = Boolean.valueOf(m3Var.B);
                            k3Var.A0 = m3Var.C;
                            ei.a1 a1Var = m3Var.K;
                            k3Var.B0 = a1Var;
                            if (a1Var != null) {
                                ei.y0 y0Var = a1Var.r;
                                SensorManager sensorManager = a1Var.a;
                                if (a1Var.l) {
                                    a1Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = a1Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(a1Var.n, sensor, ei.a1.a(a1Var.c));
                                        }
                                        Sensor sensor2 = a1Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(a1Var.p, sensor2, ei.a1.a(a1Var.e));
                                        }
                                        Sensor sensor3 = a1Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(y0Var, sensor3, ei.a1.a(a1Var.h));
                                        }
                                        Sensor sensor4 = a1Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(y0Var, sensor4, ei.a1.a(a1Var.h));
                                        }
                                        Sensor sensor5 = a1Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(a1Var.t, sensor5, ei.a1.a(a1Var.j));
                                        }
                                    }
                                }
                            }
                            a5.a aVar = m3Var.w;
                            if (aVar != null) {
                                ei.g3 g3Var = k3Var.l0;
                                int totalHeight = g3Var.getTotalHeight();
                                g3Var.e = aVar;
                                ei.v[] vVarArr = g3Var.f;
                                ei.x.b(vVarArr[0].l, (ei.w) aVar.c, false);
                                ei.x.b(vVarArr[1].l, (ei.w) aVar.d, false);
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
                            k3Var.x(m3Var.z, false, m3Var.A);
                            ei.f5 f5Var = m3Var.a;
                            k3Var.G = f5Var != null ? f5Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.y0 y0Var2 = m3Var.b;
                            if (y0Var2 != null) {
                                y0Var2.onResume();
                                b3Var.O(k3Var.G, m3Var.b, m3Var.d, m3Var.f, m3Var.e);
                                boolean z16 = m3Var.t || m3Var.b.b;
                                String str6 = m3Var.x;
                                b3Var.h("setState(" + z16 + ", " + str6 + ")");
                                b3Var.N = z16;
                                b3Var.b = str6;
                                if (org.telegram.ui.ActionBar.h6.I.q() != m3Var.D) {
                                    b3Var.A();
                                }
                            } else {
                                f5Var.q = null;
                                f5Var.r = 0L;
                            }
                            k3Var.s(n2Var2, m3Var.a);
                            k3Var.b0 = m3Var.v;
                            if (m3Var.G) {
                                k3Var.S0 = true;
                                k3Var.i();
                                org.telegram.ui.d3 d3Var = k3Var.U0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H)));
                                String str7 = m3Var.H;
                                k3Var.T0 = str7;
                                d3Var.a(userName, str7);
                                org.telegram.ui.d3 d3Var2 = k3Var.U0;
                                Paint paint2 = k3Var.P;
                                d3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                k3Var.U0.setBackgroundColor(paint2.getColor());
                                k3Var.U0.setVisibility(0);
                                k3Var.U0.setAlpha(1.0f);
                            }
                            k3Var.o(m3Var.L);
                            n3Var.h(n3Var.w, m3Var, false);
                            k3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 25:
                org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) obj2;
                ((org.telegram.ui.ActionBar.m3) obj3).m = (Bitmap) obj;
                t3Var.getWindowView().setDrawingFromOverlay(false);
                t3Var.release();
                break;
            case 26:
                org.telegram.ui.ActionBar.v3 v3Var = (org.telegram.ui.ActionBar.v3) obj2;
                org.telegram.ui.ActionBar.w3 w3Var = ((org.telegram.ui.ActionBar.s3) obj3).p;
                if (((Boolean) obj).booleanValue()) {
                    v3Var.a(1.0f);
                    if (w3Var.a.getTabs().isEmpty()) {
                        w3Var.a(false);
                        break;
                    }
                } else {
                    v3Var.a(0.0f);
                    break;
                }
                break;
            case 27:
                a(obj);
                break;
            default:
                org.telegram.ui.m3 m3Var2 = (org.telegram.ui.m3) obj3;
                Activity activity = (Activity) obj2;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && m3Var2.getWebView() != null) {
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
                            org.telegram.ui.web.y0 webView = m3Var2.getWebView();
                            String str9 = org.telegram.ui.web.n1.a().b;
                            if (str9 != null) {
                                StringBuilder v = a4.a.v(str9);
                                v.append(URLEncoder.encode(str8));
                                str = v.toString();
                            }
                            webView.loadUrl(str);
                            break;
                        } else {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str8 = nf.f.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            m3Var2.getWebView().loadUrl(str8);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
