package ci;

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
import org.telegram.messenger.vl;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.mk;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        org.telegram.ui.web.g2 g2Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.b;
        Activity activity = (Activity) this.c;
        Integer num = (Integer) obj;
        org.telegram.ui.u3 u3Var = h4Var.K;
        org.telegram.ui.j0[] j0VarArr = h4Var.S0;
        if ((h4Var.u0[0].c() && h4Var.u0[0].c.E == null) || h4Var.L == null) {
            return;
        }
        if (num.intValue() == 1) {
            org.telegram.ui.k0 k0Var = h4Var.h0;
            int dp = AndroidUtilities.dp(56.0f);
            h4Var.I0 = dp;
            k0Var.setHeight(dp);
            h4Var.h0.h(true);
            return;
        }
        if (num.intValue() == 2) {
            if (!h4Var.u0[0].f()) {
                TLRPC.WebPage webPage = h4Var.u0[0].c.E;
                if (webPage == null) {
                    return;
                } else {
                    str4 = webPage.url;
                }
            } else if (h4Var.u0[0].getWebView() == null) {
                return;
            } else {
                str4 = h4Var.u0[0].getWebView().getUrl();
            }
            String v = org.telegram.ui.web.d1.v(str4);
            h4Var.a0(new hq0(h4Var.L, null, v, false, v, false, AndroidUtilities.computePerceivedBrightness(h4Var.h0.getBackgroundColor()) < 0.721f ? new ai.d() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (!h4Var.u0[0].f()) {
                org.telegram.ui.l3 l3Var = h4Var.u0[0];
                TLRPC.WebPage webPage2 = l3Var.c.E;
                if (webPage2 == null) {
                    return;
                }
                str3 = webPage2.url;
                frameLayout = l3Var;
            } else {
                if (h4Var.u0[0].getWebView() == null) {
                    return;
                }
                str3 = h4Var.u0[0].getWebView().getUrl();
                frameLayout = h4Var.u0[0].f;
            }
            org.telegram.ui.h4.f(str3, h4Var.X, frameLayout, u3Var, null);
            return;
        }
        if (num.intValue() == 7) {
            org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
            l2Var.a = true;
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                U.showAsSheet(new org.telegram.ui.web.p(u3Var != null ? new org.telegram.ui.a0(h4Var, 5) : null, new org.telegram.ui.r(h4Var, 2)), l2Var);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            org.telegram.ui.ActionBar.l2 l2Var2 = new org.telegram.ui.ActionBar.l2();
            l2Var2.a = true;
            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
            if (U2 != null) {
                U2.showAsSheet(new org.telegram.ui.web.h1(u3Var != null ? new org.telegram.ui.a0(h4Var, 6) : null, new org.telegram.ui.r(h4Var, 3)), l2Var2);
                return;
            }
            return;
        }
        if (num.intValue() == 9) {
            if (h4Var.u0[0].getWebView() != null) {
                h4Var.u0[0].getWebView().goForward();
                return;
            }
            return;
        }
        if (num.intValue() == 3) {
            if (!h4Var.u0[0].f()) {
                TLRPC.WebPage webPage3 = h4Var.u0[0].c.E;
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
                if (h4Var.u0[0].getWebView() == null) {
                    return;
                }
                str = h4Var.u0[0].getWebView().getUrl();
                str2 = h4Var.u0[0].getWebView().getOpenURL();
                file = null;
            }
            Activity activity2 = h4Var.L;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            if (file != null) {
                AndroidUtilities.openForView(file, null, "text/markdown", h4Var.L, null, true);
                return;
            }
            if (str == null) {
                return;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
            String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
            org.telegram.ui.x xVar = new org.telegram.ui.x(h4Var, str, 1);
            org.telegram.ui.y yVar = new org.telegram.ui.y(h4Var, hostAuthority2, hostAuthority, 1);
            if (h4Var.u0[0].f() && MessagesController.getInstance(h4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(h4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                org.telegram.ui.Components.c5.o0(activity, null, str, true, new ai.m0(4, yVar, xVar));
                return;
            } else {
                xVar.run();
                return;
            }
        }
        if (num.intValue() != 4) {
            if (num.intValue() == 5) {
                if (!h4Var.u0[0].f() || h4Var.u0[0].getWebView() == null) {
                    return;
                }
                h4Var.u0[0].getWebView().reload();
                return;
            }
            if (num.intValue() != 10 || (g2Var = h4Var.u0[0].y) == null || g2Var.b() == null) {
                return;
            }
            h4Var.h(g2Var.b(), null, 1);
            return;
        }
        if (h4Var.u0[0].f()) {
            org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
            if (U3 != null) {
                org.telegram.ui.ActionBar.l2 l2Var3 = new org.telegram.ui.ActionBar.l2();
                l2Var3.a = true;
                U3.showAsSheet(new org.telegram.ui.web.z1(new org.telegram.ui.r(h4Var, 3)), l2Var3);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) h4Var.L, (org.telegram.ui.ActionBar.e6) null, false);
        f3Var.fixNavigationBar();
        f3Var.applyTopPadding = false;
        LinearLayout linearLayout = new LinearLayout(h4Var.L);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(h4Var.L, (org.telegram.ui.ActionBar.e6) null);
        m4Var.setText(LocaleController.getString(R.string.FontSize));
        linearLayout.addView(m4Var, w7.x5.t(-2, -2, 51, 3, 1, 3, 0));
        linearLayout.addView(new org.telegram.ui.d4(h4Var, h4Var.L), w7.x5.t(-1, -2, 51, 3, 0, 3, 0));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(h4Var.L, (org.telegram.ui.ActionBar.e6) null);
        m4Var2.setText(LocaleController.getString(R.string.FontType));
        linearLayout.addView(m4Var2, w7.x5.t(-2, -2, 51, 3, 4, 3, 2));
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            Activity activity3 = h4Var.L;
            org.telegram.ui.j0 j0Var = new org.telegram.ui.j0(activity3);
            j0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.i6, false), i11, -1));
            RadioButton radioButton = new RadioButton(activity3);
            j0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.D5, false), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E5, false));
            boolean z10 = LocaleController.isRTL;
            j0Var.addView(radioButton, w7.x5.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 22, 13.0f, z10 ? 22 : 0, 0.0f));
            TextView textView = new TextView(activity3);
            vl.s(textView, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false), 1, 16.0f, 1);
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
            ((RadioButton) j0VarArr[i10].b).a(i10 == h4Var.a, false);
            j0VarArr[i10].setTag(Integer.valueOf(i10));
            j0VarArr[i10].setOnClickListener(new org.telegram.ui.s(h4Var, 4));
            linearLayout.addView(j0VarArr[i10], w7.x5.n(-1, 50));
            i10++;
        }
        f3Var.customView = linearLayout;
        h4Var.I = f3Var;
        h4Var.a0(f3Var);
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
        ii.t a2;
        int i13;
        bo boVar;
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
                qb qbVar = (qb) obj3;
                nc ncVar = (nc) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - ncVar.getBottomPadding2(), qbVar.t2 - ncVar.getPaddingUnderContainer()));
                qbVar.S();
                if (max > 0) {
                    qg.j jVar = qbVar.J0;
                    if ((jVar instanceof qg.x2) && ((qg.x2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = qbVar.N1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        qbVar.N1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        qg.z1 z1Var = qbVar.d1;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(z1Var, (Property<qg.z1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(qbVar.T0, (Property<m6, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        x5 x5Var = qbVar.W0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(x5Var, (Property<x5, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(qbVar.B0, (Property<qg.m1, Float>) property2, (z10 || qbVar.B1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(qbVar.A0, (Property<qg.i1, Float>) property2, (z10 || qbVar.B1) ? 1.0f : 0.0f));
                        qbVar.T0();
                        qbVar.N1.playTogether(arrayList);
                        if (z10) {
                            qbVar.N1.setDuration(350L);
                            qbVar.N1.setInterpolator(qr.h);
                        } else {
                            qbVar.N1.setDuration(250L);
                            qbVar.N1.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                        }
                        qbVar.N1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z10 ? qr.h : org.telegram.ui.ActionBar.p1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z10) {
                            qbVar.P0(false);
                        }
                        if (qbVar.h2 != z10) {
                            qbVar.g0();
                        }
                        qbVar.h2 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = qbVar.N1;
                if (animatorSet != null) {
                }
                qbVar.N1 = new AnimatorSet();
                arrayList = new ArrayList();
                qg.z1 z1Var2 = qbVar.d1;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(z1Var2, (Property<qg.z1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(qbVar.T0, (Property<m6, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                x5 x5Var2 = qbVar.W0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(x5Var2, (Property<x5, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(qbVar.B0, (Property<qg.m1, Float>) property22, (z10 || qbVar.B1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(qbVar.A0, (Property<qg.i1, Float>) property22, (z10 || qbVar.B1) ? 1.0f : 0.0f));
                qbVar.T0();
                qbVar.N1.playTogether(arrayList);
                if (z10) {
                }
                qbVar.N1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (qbVar.h2 != z10) {
                }
                qbVar.h2 = z10;
                break;
            case 2:
                r6 r6Var = (r6) obj3;
                z5 z5Var = (z5) obj2;
                nd ndVar2 = (nd) obj;
                if (ndVar2 != null) {
                    z5Var.dismiss();
                    r6Var.z0(false);
                    r6Var.d0(r6Var.p0(ndVar2));
                    break;
                }
                break;
            case 3:
                r6 r6Var2 = (r6) obj3;
                qg.t0 t0Var = (qg.t0) obj2;
                qg.q0 q0Var = (qg.q0) obj;
                if (t0Var != null) {
                    int i16 = r6Var2.F1;
                    t0Var.u0 = q0Var;
                    t0Var.q0.b(i16, q0Var, false);
                    t0Var.m();
                    r6Var2.d0(t0Var);
                    break;
                } else {
                    r6Var2.d0(r6Var2.i0(q0Var));
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
                ((mr[]) obj2)[0].dismiss();
                baVar2.g(true);
                break;
            case 6:
                jb jbVar = (jb) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                oc ocVar = jbVar.a;
                boolean q02 = ocVar.q0();
                int i17 = ocVar.c;
                if (q02) {
                    try {
                        ocVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                ocVar.P1 = false;
                h7 h7Var = ocVar.C0;
                if (h7Var != null) {
                    h7Var.c(false);
                }
                if (ocVar.G1 != null) {
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(ocVar.G1.getAbsolutePath(), options);
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
                        o8 m10 = o8.m(r11, ocVar.G1);
                        m10.J0 = ocVar.v0;
                        m10.K0 = ocVar.w0;
                        if (ocVar.A0.j()) {
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
                    o8 m102 = o8.m(i18, ocVar.G1);
                    m102.J0 = ocVar.v0;
                    m102.K0 = ocVar.w0;
                    if (ocVar.A0.j()) {
                        ocVar.K1 = m102;
                        ja.a(i17, m102);
                        ocVar.L1 = false;
                        if (callback != null) {
                            callback.run(new hb(jbVar, 2));
                            break;
                        } else {
                            ocVar.K(1, true);
                            break;
                        }
                    } else {
                        ocVar.G1 = null;
                        if (ocVar.A0.l(m102)) {
                            o8 a10 = o8.a(ocVar.A0.getLayout(), ocVar.A0.getContent());
                            ocVar.K1 = a10;
                            ja.a(i17, a10);
                            ocVar.L1 = false;
                            if (callback != null) {
                                callback.run(null);
                            }
                        } else if (callback != null) {
                            callback.run(null);
                        }
                        ocVar.m0(true);
                        break;
                    }
                }
                break;
            case 7:
                tc tcVar = (tc) obj2;
                Float f7 = (Float) obj;
                tcVar.i = f7.floatValue();
                sc scVar = ((zc) obj3).a;
                if (scVar != null) {
                    scVar.C(f7.floatValue(), tcVar.a);
                    break;
                }
                break;
            case 8:
                ei.w0 w0Var = (ei.w0) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
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
                rVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 9:
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
            case 10:
                ((File[]) obj3)[0] = (File) obj;
                ((ei.g1) obj2).run();
                break;
            case 11:
                ((ei.f3) obj3).d.x.G((String) obj2, (String) obj, false);
                break;
            case 12:
                fi.f fVar = (fi.f) obj3;
                fVar.getClass();
                fVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 13:
                fi.f fVar2 = (fi.f) obj3;
                fVar2.getClass();
                fVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 14:
                fi.k0 k0Var = (fi.k0) obj3;
                k0Var.V((TLRPC.Chat) obj2, k0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 15:
                View view = (View) obj3;
                hg.u uVar = (hg.u) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(uVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 16:
                hg.b2 b2Var = (hg.b2) obj2;
                hg.c2 f10 = hg.c2.f(UserConfig.selectedAccount);
                vi viVar = ((hg.k0) obj3).b;
                long n12 = viVar.n1();
                int i19 = f10.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i19).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = b2Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                    messagesStorage.getStorageQueue().postRunnable(new ai.i5(f10, messagesStorage, b2Var, tL_messages_sendQuickReplyMessages, 16));
                }
                viVar.dismiss();
                break;
            case 17:
                hg.h1.W((hg.h1) obj3, (View) obj2, (String) obj);
                break;
            case 18:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                ii.w3 w3Var = ((ii.r) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    w3Var.Y2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str2;
                    w3Var.R1(pageblockmath2);
                    break;
                }
            case 19:
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
            case 20:
                ii.d2 d2Var = (ii.d2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                d2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str4;
                    d2Var.P.Y2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str4;
                    d2Var.P.R1(pageblockmath4);
                    break;
                }
            case 21:
                ii.w3 w3Var2 = (ii.w3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str5 = (String) obj;
                w3Var2.getClass();
                if (!TextUtils.equals(str5, pageblockmath5.source)) {
                    ii.h2 h2Var = w3Var2.J3;
                    if (h2Var != null) {
                        h2Var.d();
                    }
                    pageblockmath5.source = str5;
                    w3Var2.Y2.N(false);
                    ii.h2 h2Var2 = w3Var2.J3;
                    if (h2Var2 != null) {
                        h2Var2.h();
                    }
                    w3Var2.h3.onContentChanged();
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
                    if ((n2Var instanceof bo) && (mkVar = (boVar = (bo) n2Var).Y) != null) {
                        mkVar.Q();
                        boVar.Y.o0(true, false, true);
                    }
                    if (n2Var.getContext() != null && n2Var.getParentActivity() != null) {
                        ei.k3 k3Var = new ei.k3(n2Var.getContext(), n2Var.getResourceProvider());
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
                                    i20 = org.telegram.ui.ActionBar.i6.d6;
                                }
                                i13 = org.telegram.ui.ActionBar.i6.v0(i20, k3Var.E);
                            }
                            k3Var.t(i13, n3Var.n, false);
                            k3Var.y(n3Var.s, false);
                            k3Var.F0 = n3Var.j;
                            k3Var.G0 = n3Var.k;
                            boolean z15 = n3Var.u;
                            k3Var.w0 = z15;
                            ei.b3 b3Var = k3Var.x;
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
                            ei.a1 a1Var = n3Var.K;
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
                            a5.a aVar = n3Var.w;
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
                            k3Var.x(n3Var.z, false, n3Var.A);
                            ei.f5 f5Var = n3Var.a;
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
                                if (org.telegram.ui.ActionBar.i6.I.q() != n3Var.D) {
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
                                org.telegram.ui.c3 c3Var = k3Var.U0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(k3Var.G).getUser(Long.valueOf(k3Var.H)));
                                String str7 = n3Var.H;
                                k3Var.T0 = str7;
                                c3Var.a(userName, str7);
                                org.telegram.ui.c3 c3Var2 = k3Var.U0;
                                Paint paint2 = k3Var.P;
                                c3Var2.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
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
                org.telegram.ui.ActionBar.w3 w3Var3 = (org.telegram.ui.ActionBar.w3) obj2;
                org.telegram.ui.ActionBar.x3 x3Var = ((org.telegram.ui.ActionBar.t3) obj3).p;
                if (((Boolean) obj).booleanValue()) {
                    w3Var3.a(1.0f);
                    if (x3Var.a.getTabs().isEmpty()) {
                        x3Var.a(false);
                        break;
                    }
                } else {
                    w3Var3.a(0.0f);
                    break;
                }
                break;
            case 26:
                a(obj);
                break;
            case 27:
                org.telegram.ui.l3 l3Var = (org.telegram.ui.l3) obj3;
                Activity activity = (Activity) obj2;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && l3Var.getWebView() != null) {
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
                            org.telegram.ui.web.z0 webView = l3Var.getWebView();
                            String str9 = org.telegram.ui.web.o1.a().b;
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
                            l3Var.getWebView().loadUrl(str8);
                            break;
                        }
                    }
                }
                break;
            case 28:
                bo boVar2 = (bo) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages2.peer = boVar2.getMessagesController().getInputPeer(boVar2.T5);
                tL_messages_sendQuickReplyMessages2.shortcut_id = ((hg.b2) obj2).a;
                boVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages2, null);
                mk mkVar2 = boVar2.Y;
                if (mkVar2 != null) {
                    mkVar2.setFieldText(null);
                    break;
                }
                break;
            default:
                bo boVar3 = (bo) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, boVar3.T5, boVar3.n5, boVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = boVar3.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = boVar3.N8();
                of2.suggestionParams = boVar3.g5;
                boVar3.getSendMessagesHelper().sendMessage(of2);
                boVar3.Y.setFieldText("");
                boVar3.e9(false);
                break;
        }
    }
}
