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
import org.telegram.messenger.em;
import org.telegram.messenger.voip.VoIPDebugToSend;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.yi;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eo;
import org.telegram.ui.ok;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.web.i2 i2Var;
        String str;
        String str2;
        File file;
        String str3;
        FrameLayout frameLayout;
        String str4;
        org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.b;
        Activity activity = (Activity) this.c;
        Integer num = (Integer) obj;
        org.telegram.ui.w3 w3Var = j4Var.K;
        org.telegram.ui.k0[] k0VarArr = j4Var.S0;
        if ((j4Var.u0[0].c() && j4Var.u0[0].c.E == null) || j4Var.L == null) {
            return;
        }
        if (num.intValue() == 1) {
            org.telegram.ui.l0 l0Var = j4Var.h0;
            int dp = AndroidUtilities.dp(56.0f);
            j4Var.I0 = dp;
            l0Var.setHeight(dp);
            j4Var.h0.h(true);
            return;
        }
        if (num.intValue() == 2) {
            if (!j4Var.u0[0].f()) {
                TLRPC.WebPage webPage = j4Var.u0[0].c.E;
                if (webPage == null) {
                    return;
                } else {
                    str4 = webPage.url;
                }
            } else if (j4Var.u0[0].getWebView() == null) {
                return;
            } else {
                str4 = j4Var.u0[0].getWebView().getUrl();
            }
            String v = org.telegram.ui.web.c1.v(str4);
            j4Var.a0(new sq0(j4Var.L, null, v, false, v, false, AndroidUtilities.computePerceivedBrightness(j4Var.h0.getBackgroundColor()) < 0.721f ? new zh.b() : null));
            return;
        }
        if (num.intValue() == 6) {
            if (!j4Var.u0[0].f()) {
                org.telegram.ui.n3 n3Var = j4Var.u0[0];
                TLRPC.WebPage webPage2 = n3Var.c.E;
                if (webPage2 == null) {
                    return;
                }
                str3 = webPage2.url;
                frameLayout = n3Var;
            } else {
                if (j4Var.u0[0].getWebView() == null) {
                    return;
                }
                str3 = j4Var.u0[0].getWebView().getUrl();
                frameLayout = j4Var.u0[0].f;
            }
            org.telegram.ui.j4.f(str3, j4Var.X, frameLayout, w3Var, null);
            return;
        }
        if (num.intValue() == 7) {
            org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
            n2Var.a = true;
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                U.showAsSheet(new org.telegram.ui.web.p(w3Var != null ? new org.telegram.ui.b0(j4Var, 5) : null, new org.telegram.ui.s(j4Var, 2)), n2Var);
                return;
            }
            return;
        }
        if (num.intValue() == 8) {
            org.telegram.ui.ActionBar.n2 n2Var2 = new org.telegram.ui.ActionBar.n2();
            n2Var2.a = true;
            org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
            if (U2 != null) {
                U2.showAsSheet(new org.telegram.ui.web.h1(w3Var != null ? new org.telegram.ui.b0(j4Var, 6) : null, new org.telegram.ui.s(j4Var, 3)), n2Var2);
                return;
            }
            return;
        }
        if (num.intValue() == 9) {
            if (j4Var.u0[0].getWebView() != null) {
                j4Var.u0[0].getWebView().goForward();
                return;
            }
            return;
        }
        if (num.intValue() == 3) {
            if (!j4Var.u0[0].f()) {
                TLRPC.WebPage webPage3 = j4Var.u0[0].c.E;
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
                if (j4Var.u0[0].getWebView() == null) {
                    return;
                }
                str = j4Var.u0[0].getWebView().getUrl();
                str2 = j4Var.u0[0].getWebView().getOpenURL();
                file = null;
            }
            Activity activity2 = j4Var.L;
            if (activity2 == null || activity2.isFinishing()) {
                return;
            }
            if (file != null) {
                AndroidUtilities.openForView(file, null, "text/markdown", j4Var.L, null, true);
                return;
            }
            if (str == null) {
                return;
            }
            String hostAuthority = AndroidUtilities.getHostAuthority(str2, true);
            String hostAuthority2 = AndroidUtilities.getHostAuthority(str, true);
            org.telegram.ui.y yVar = new org.telegram.ui.y(j4Var, str, 1);
            org.telegram.ui.z zVar = new org.telegram.ui.z(j4Var, hostAuthority2, hostAuthority, 1);
            if (j4Var.u0[0].f() && MessagesController.getInstance(j4Var.X).isWebBrowserOpenInApp(hostAuthority2) && !MessagesController.getInstance(j4Var.X).isWebBrowserExceptionsLimitReached(true)) {
                org.telegram.ui.Components.d5.o0(activity, null, str, true, new k6(2, zVar, yVar));
                return;
            } else {
                yVar.run();
                return;
            }
        }
        if (num.intValue() != 4) {
            if (num.intValue() == 5) {
                if (!j4Var.u0[0].f() || j4Var.u0[0].getWebView() == null) {
                    return;
                }
                j4Var.u0[0].getWebView().reload();
                return;
            }
            if (num.intValue() != 10 || (i2Var = j4Var.u0[0].y) == null || i2Var.b() == null) {
                return;
            }
            j4Var.h(i2Var.b(), null, 1);
            return;
        }
        if (j4Var.u0[0].f()) {
            org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
            if (U3 != null) {
                org.telegram.ui.ActionBar.n2 n2Var3 = new org.telegram.ui.ActionBar.n2();
                n2Var3.a = true;
                U3.showAsSheet(new org.telegram.ui.web.b2(new org.telegram.ui.s(j4Var, 3)), n2Var3);
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) j4Var.L, (org.telegram.ui.ActionBar.f6) null, false);
        h3Var.fixNavigationBar();
        h3Var.applyTopPadding = false;
        LinearLayout linearLayout = new LinearLayout(j4Var.L);
        linearLayout.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
        linearLayout.setOrientation(1);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(j4Var.L, (org.telegram.ui.ActionBar.f6) null);
        m4Var.setText(LocaleController.getString(R.string.FontSize));
        linearLayout.addView(m4Var, w7.a6.t(-2, -2, 51, 3, 1, 3, 0));
        linearLayout.addView(new org.telegram.ui.f4(j4Var, j4Var.L), w7.a6.t(-1, -2, 51, 3, 0, 3, 0));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(j4Var.L, (org.telegram.ui.ActionBar.f6) null);
        m4Var2.setText(LocaleController.getString(R.string.FontType));
        linearLayout.addView(m4Var2, w7.a6.t(-2, -2, 51, 3, 4, 3, 2));
        int i10 = 0;
        for (int i11 = 2; i10 < i11; i11 = 2) {
            Activity activity3 = j4Var.L;
            org.telegram.ui.k0 k0Var = new org.telegram.ui.k0(activity3);
            k0Var.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), i11, -1));
            RadioButton radioButton = new RadioButton(activity3);
            k0Var.b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.D5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E5, false));
            boolean z10 = LocaleController.isRTL;
            k0Var.addView(radioButton, w7.a6.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 22, 13.0f, z10 ? 22 : 0, 0.0f));
            TextView textView = new TextView(activity3);
            em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z11 = LocaleController.isRTL;
            k0Var.addView(textView, w7.a6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 17 : 62, 0.0f, z11 ? 62 : 17, 0.0f));
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
            ((RadioButton) k0VarArr[i10].b).a(i10 == j4Var.a, false);
            k0VarArr[i10].setTag(Integer.valueOf(i10));
            k0VarArr[i10].setOnClickListener(new org.telegram.ui.t(j4Var, 4));
            linearLayout.addView(k0VarArr[i10], w7.a6.n(-1, 50));
            i10++;
        }
        h3Var.customView = linearLayout;
        j4Var.I = h3Var;
        j4Var.a0(h3Var);
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
        hi.u a2;
        int i13;
        eo eoVar;
        ok okVar;
        int i14 = this.a;
        String str = null;
        int i15 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i14) {
            case 0:
                d3 d3Var = (d3) obj3;
                df dfVar = (df) obj;
                d3Var.getClass();
                a3 a3Var = ((a3[]) obj2)[0];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dfVar == null ? "🌤" : dfVar.c);
                sb2.append(" ");
                sb2.append(dfVar == null ? ef.b() ? "24°C" : "72°F" : dfVar.a());
                CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString(), d3Var.b.getFontMetricsInt(), false);
                d3 d3Var2 = a3Var.o;
                StaticLayout staticLayout = new StaticLayout(TextUtils.ellipsize(replaceEmoji, d3Var2.b, AndroidUtilities.displaySize.x * 0.8f, TextUtils.TruncateAt.END), d3Var2.b, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                a3Var.k = staticLayout;
                a3Var.l = staticLayout.getLineCount() > 0 ? a3Var.k.getLineWidth(0) : 0.0f;
                a3Var.m = a3Var.k.getLineCount() > 0 ? a3Var.k.getLineLeft(0) : 0.0f;
                a3Var.b = AndroidUtilities.dpf2(17.6f) + a3Var.l;
                a3Var.c = AndroidUtilities.dpf2(36.0f);
                d3Var.invalidate();
                d3Var.requestLayout();
                break;
            case 1:
                ad adVar = (ad) obj3;
                be beVar = (be) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - beVar.getBottomPadding2(), adVar.t2 - beVar.getPaddingUnderContainer()));
                adVar.S();
                if (max > 0) {
                    pg.j jVar = adVar.J0;
                    if ((jVar instanceof pg.v2) && ((pg.v2) jVar).getEditText().isFocused()) {
                        z10 = true;
                        animatorSet = adVar.N1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        adVar.N1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        pg.w1 w1Var = adVar.d1;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(w1Var, (Property<pg.w1, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(adVar.T0, (Property<l7, Float>) property, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                        w6 w6Var = adVar.W0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(w6Var, (Property<w6, Float>) property2, !z10 ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(adVar.B0, (Property<pg.j1, Float>) property2, (z10 || adVar.B1) ? 1.0f : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(adVar.A0, (Property<pg.f1, Float>) property2, (z10 || adVar.B1) ? 1.0f : 0.0f));
                        adVar.T0();
                        adVar.N1.playTogether(arrayList);
                        if (z10) {
                            adVar.N1.setDuration(350L);
                            adVar.N1.setInterpolator(wr.h);
                        } else {
                            adVar.N1.setDuration(250L);
                            adVar.N1.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                        }
                        adVar.N1.start();
                        for (i10 = 0; i10 < arrayList.size(); i10++) {
                            ((Animator) arrayList.get(i10)).setDuration(z10 ? 350L : 250L);
                            ((Animator) arrayList.get(i10)).setInterpolator(z10 ? wr.h : org.telegram.ui.ActionBar.r1.w);
                            ((Animator) arrayList.get(i10)).start();
                        }
                        if (!z10) {
                            adVar.P0(false);
                        }
                        if (adVar.h2 != z10) {
                            adVar.g0();
                        }
                        adVar.h2 = z10;
                        break;
                    }
                }
                z10 = false;
                animatorSet = adVar.N1;
                if (animatorSet != null) {
                }
                adVar.N1 = new AnimatorSet();
                arrayList = new ArrayList();
                pg.w1 w1Var2 = adVar.d1;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(w1Var2, (Property<pg.w1, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(adVar.T0, (Property<l7, Float>) property3, max <= 0 ? Math.min(0, AndroidUtilities.dp(40.0f) + (-max)) : 0));
                w6 w6Var2 = adVar.W0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w6Var2, (Property<w6, Float>) property22, !z10 ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(adVar.B0, (Property<pg.j1, Float>) property22, (z10 || adVar.B1) ? 1.0f : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(adVar.A0, (Property<pg.f1, Float>) property22, (z10 || adVar.B1) ? 1.0f : 0.0f));
                adVar.T0();
                adVar.N1.playTogether(arrayList);
                if (z10) {
                }
                adVar.N1.start();
                while (i10 < arrayList.size()) {
                }
                if (!z10) {
                }
                if (adVar.h2 != z10) {
                }
                adVar.h2 = z10;
                break;
            case 2:
                r7 r7Var = (r7) obj3;
                y6 y6Var = (y6) obj2;
                df dfVar2 = (df) obj;
                if (dfVar2 != null) {
                    y6Var.dismiss();
                    r7Var.z0(false);
                    r7Var.d0(r7Var.p0(dfVar2));
                    break;
                }
                break;
            case 3:
                r7 r7Var2 = (r7) obj3;
                pg.q0 q0Var = (pg.q0) obj2;
                pg.n0 n0Var = (pg.n0) obj;
                if (q0Var != null) {
                    int i16 = r7Var2.F1;
                    q0Var.u0 = n0Var;
                    q0Var.q0.b(i16, n0Var, false);
                    q0Var.m();
                    r7Var2.d0(q0Var);
                    break;
                } else {
                    r7Var2.d0(r7Var2.i0(n0Var));
                    break;
                }
            case 4:
                kb kbVar = (kb) obj3;
                ((w70) obj2).u();
                kbVar.g(true);
                rb rbVar = kbVar.W;
                ub ubVar = rbVar.X;
                if (ubVar != null) {
                    ubVar.run(new HashSet(rbVar.v));
                    break;
                }
                break;
            case 5:
                kb kbVar2 = (kb) obj3;
                kbVar2.W.G = true;
                ((sr[]) obj2)[0].dismiss();
                kbVar2.g(true);
                break;
            case 6:
                sc scVar = (sc) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Integer num = (Integer) obj;
                ce ceVar = scVar.a;
                boolean q02 = ceVar.q0();
                int i17 = ceVar.c;
                if (q02) {
                    try {
                        ceVar.n.performHapticFeedback(3, 1);
                    } catch (Exception unused) {
                    }
                }
                ceVar.P1 = false;
                i8 i8Var = ceVar.C0;
                if (i8Var != null) {
                    i8Var.c(false);
                }
                if (ceVar.G1 != null) {
                    try {
                        options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(ceVar.G1.getAbsolutePath(), options);
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
                        r9 m10 = r9.m(r11, ceVar.G1);
                        m10.J0 = ceVar.v0;
                        m10.K0 = ceVar.w0;
                        if (ceVar.A0.j()) {
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
                    r9 m102 = r9.m(i18, ceVar.G1);
                    m102.J0 = ceVar.v0;
                    m102.K0 = ceVar.w0;
                    if (ceVar.A0.j()) {
                        ceVar.K1 = m102;
                        sb.a(i17, m102);
                        ceVar.L1 = false;
                        if (callback != null) {
                            callback.run(new qc(scVar, 2));
                            break;
                        } else {
                            ceVar.K(1, true);
                            break;
                        }
                    } else {
                        ceVar.G1 = null;
                        if (ceVar.A0.l(m102)) {
                            r9 a10 = r9.a(ceVar.A0.getLayout(), ceVar.A0.getContent());
                            ceVar.K1 = a10;
                            sb.a(i17, a10);
                            ceVar.L1 = false;
                            if (callback != null) {
                                callback.run(null);
                            }
                        } else if (callback != null) {
                            callback.run(null);
                        }
                        ceVar.m0(true);
                        break;
                    }
                }
                break;
            case 7:
                he heVar = (he) obj2;
                Float f7 = (Float) obj;
                heVar.i = f7.floatValue();
                ge geVar = ((me) obj3).a;
                if (geVar != null) {
                    geVar.B(f7.floatValue(), heVar.a);
                    break;
                }
                break;
            case 8:
                di.z0 z0Var = (di.z0) obj3;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) obj2;
                int[] iArr = (int[]) obj;
                z0Var.getClass();
                boolean z11 = false;
                while (i15 < iArr.length) {
                    if (iArr[i15] == 0) {
                        z11 = true;
                    }
                    i15++;
                }
                z0Var.d = true;
                z0Var.e = true;
                z0Var.l();
                Iterator it = z0Var.f.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                rVar.run(Boolean.TRUE, Boolean.valueOf(z11));
                break;
            case 9:
                di.z0 z0Var2 = (di.z0) obj3;
                Runnable runnable = (Runnable) obj2;
                int[] iArr2 = (int[]) obj;
                z0Var2.getClass();
                boolean z12 = false;
                while (i15 < iArr2.length) {
                    if (iArr2[i15] == 0) {
                        z12 = true;
                    }
                    i15++;
                }
                z0Var2.d = z12;
                z0Var2.e = z12;
                z0Var2.l();
                Iterator it2 = z0Var2.f.iterator();
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
                ((di.j1) obj2).run();
                break;
            case 11:
                ((di.i3) obj3).d.x.G((String) obj2, (String) obj, false);
                break;
            case 12:
                ei.f fVar = (ei.f) obj3;
                fVar.getClass();
                fVar.W(((TLRPC.Chat) obj2).id, ((Boolean) obj).booleanValue());
                break;
            case 13:
                ei.f fVar2 = (ei.f) obj3;
                fVar2.getClass();
                fVar2.V((String) obj2, ((Boolean) obj).booleanValue());
                break;
            case 14:
                ei.k0 k0Var = (ei.k0) obj3;
                k0Var.V((TLRPC.Chat) obj2, k0Var.e, ((Boolean) obj).booleanValue());
                break;
            case 15:
                View view = (View) obj3;
                gg.u uVar = (gg.u) obj2;
                Runnable runnable2 = (Runnable) obj;
                if (view != null) {
                    view.requestFocus();
                }
                AndroidUtilities.hideKeyboard(uVar);
                AndroidUtilities.runOnUIThread(runnable2, 80L);
                break;
            case 16:
                gg.j2 j2Var = (gg.j2) obj2;
                gg.k2 f10 = gg.k2.f(UserConfig.selectedAccount);
                yi yiVar = ((gg.n0) obj3).b;
                long n12 = yiVar.n1();
                int i19 = f10.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i19).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = j2Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i19);
                    messagesStorage.getStorageQueue().postRunnable(new androidx.car.app.utils.b(f10, messagesStorage, j2Var, tL_messages_sendQuickReplyMessages, 12));
                }
                yiVar.dismiss();
                break;
            case 17:
                gg.m1.W((gg.m1) obj3, (View) obj2, (String) obj);
                break;
            case 18:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str2 = (String) obj;
                hi.z3 z3Var = ((hi.s) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str2;
                    z3Var.Y2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str2;
                    z3Var.Q1(pageblockmath2);
                    break;
                }
            case 19:
                hi.k1 k1Var = (hi.k1) obj3;
                hi.u uVar2 = (hi.u) obj2;
                String str3 = (String) obj;
                k1Var.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    Editable text = k1Var.getText();
                    int spanStart = text.getSpanStart(uVar2);
                    int spanEnd = text.getSpanEnd(uVar2);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = hi.u.a(str3, k1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z13 = k1Var.v;
                        if (z13) {
                            k1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, k1Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, k1Var.length())), spannableString);
                        k1Var.setSelection(Math.min(max2 + 1, k1Var.length()));
                        if (z13) {
                            k1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 20:
                hi.g2 g2Var = (hi.g2) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str4 = (String) obj;
                g2Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str4;
                    g2Var.P.Y2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str4;
                    g2Var.P.Q1(pageblockmath4);
                    break;
                }
            case 21:
                hi.z3 z3Var2 = (hi.z3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str5 = (String) obj;
                z3Var2.getClass();
                if (!TextUtils.equals(str5, pageblockmath5.source)) {
                    hi.k2 k2Var = z3Var2.J3;
                    if (k2Var != null) {
                        k2Var.d();
                    }
                    pageblockmath5.source = str5;
                    z3Var2.Y2.N(false);
                    hi.k2 k2Var2 = z3Var2.J3;
                    if (k2Var2 != null) {
                        k2Var2.h();
                    }
                    z3Var2.h3.onContentChanged();
                    break;
                }
                break;
            case 22:
                ((VoIPDebugToSend) obj3).lambda$done$0((TL_phone.saveCallDebug) obj2, (TLRPC.InputFile) obj);
                break;
            case 23:
                org.telegram.ui.ActionBar.q3 q3Var = (org.telegram.ui.ActionBar.q3) obj3;
                org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (p2Var != null) {
                    if ((p2Var instanceof eo) && (okVar = (eoVar = (eo) p2Var).Y) != null) {
                        okVar.P();
                        eoVar.Y.n0(true, false, true);
                    }
                    if (p2Var.getContext() != null && p2Var.getParentActivity() != null) {
                        di.n3 n3Var = new di.n3(p2Var.getContext(), p2Var.getResourceProvider());
                        n3Var.k0 = p2Var.getParentActivity();
                        if (p3Var != null && p3Var.a != null) {
                            n3Var.E0 = true;
                            boolean z14 = p3Var.o;
                            n3Var.V = z14;
                            if (z14) {
                                n3Var.v(p3Var.r, false);
                            }
                            if (p3Var.n) {
                                i13 = p3Var.q;
                            } else {
                                int i20 = p3Var.p;
                                if (i20 < 0) {
                                    i20 = org.telegram.ui.ActionBar.j6.d6;
                                }
                                i13 = org.telegram.ui.ActionBar.j6.v0(i20, n3Var.E);
                            }
                            n3Var.t(i13, p3Var.n, false);
                            n3Var.y(p3Var.s, false);
                            n3Var.F0 = p3Var.j;
                            n3Var.G0 = p3Var.k;
                            boolean z15 = p3Var.u;
                            n3Var.w0 = z15;
                            di.e3 e3Var = n3Var.x;
                            e3Var.setIsBackButtonVisible(z15);
                            n3Var.v.setAllowSwipes(p3Var.l);
                            AndroidUtilities.updateImageViewImageAnimated(n3Var.W.getBackButton(), n3Var.w0 ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
                            BotFullscreenButtons botFullscreenButtons = n3Var.m0;
                            if (botFullscreenButtons != null) {
                                botFullscreenButtons.setBack(n3Var.w0, false);
                            }
                            n3Var.r0 = p3Var.y;
                            n3Var.z0 = Boolean.valueOf(p3Var.B);
                            n3Var.A0 = p3Var.C;
                            di.d1 d1Var = p3Var.K;
                            n3Var.B0 = d1Var;
                            if (d1Var != null) {
                                di.b1 b1Var = d1Var.r;
                                SensorManager sensorManager = d1Var.a;
                                if (d1Var.l) {
                                    d1Var.l = false;
                                    if (sensorManager != null) {
                                        Sensor sensor = d1Var.b;
                                        if (sensor != null) {
                                            sensorManager.registerListener(d1Var.n, sensor, di.d1.a(d1Var.c));
                                        }
                                        Sensor sensor2 = d1Var.d;
                                        if (sensor2 != null) {
                                            sensorManager.registerListener(d1Var.p, sensor2, di.d1.a(d1Var.e));
                                        }
                                        Sensor sensor3 = d1Var.g;
                                        if (sensor3 != null) {
                                            sensorManager.registerListener(b1Var, sensor3, di.d1.a(d1Var.h));
                                        }
                                        Sensor sensor4 = d1Var.f;
                                        if (sensor4 != null) {
                                            sensorManager.registerListener(b1Var, sensor4, di.d1.a(d1Var.h));
                                        }
                                        Sensor sensor5 = d1Var.i;
                                        if (sensor5 != null) {
                                            sensorManager.registerListener(d1Var.t, sensor5, di.d1.a(d1Var.j));
                                        }
                                    }
                                }
                            }
                            a5.a aVar = p3Var.w;
                            if (aVar != null) {
                                di.j3 j3Var = n3Var.l0;
                                int totalHeight = j3Var.getTotalHeight();
                                j3Var.e = aVar;
                                di.y[] yVarArr = j3Var.f;
                                di.a0.b(yVarArr[0].l, (di.z) aVar.c, false);
                                di.a0.b(yVarArr[1].l, (di.z) aVar.d, false);
                                j3Var.invalidate();
                                if (totalHeight != j3Var.getTotalHeight() && j3Var.r != null) {
                                    if (totalHeight < j3Var.getTotalHeight()) {
                                        AndroidUtilities.runOnUIThread(j3Var.r, 200L);
                                    } else {
                                        j3Var.r.run();
                                    }
                                }
                                int i21 = aVar.b;
                                Paint paint = j3Var.a;
                                j3Var.e.b = i21;
                                paint.setColor(i21);
                                j3Var.d.a(i21, true);
                            }
                            n3Var.x(p3Var.z, false, p3Var.A);
                            di.j5 j5Var = p3Var.a;
                            n3Var.G = j5Var != null ? j5Var.a : UserConfig.selectedAccount;
                            org.telegram.ui.web.y0 y0Var = p3Var.b;
                            if (y0Var != null) {
                                y0Var.onResume();
                                e3Var.O(n3Var.G, p3Var.b, p3Var.d, p3Var.f, p3Var.e);
                                boolean z16 = p3Var.t || p3Var.b.b;
                                String str6 = p3Var.x;
                                e3Var.h("setState(" + z16 + ", " + str6 + ")");
                                e3Var.N = z16;
                                e3Var.b = str6;
                                if (org.telegram.ui.ActionBar.j6.I.q() != p3Var.D) {
                                    e3Var.A();
                                }
                            } else {
                                j5Var.q = null;
                                j5Var.r = 0L;
                            }
                            n3Var.s(p2Var, p3Var.a);
                            n3Var.b0 = p3Var.v;
                            if (p3Var.G) {
                                n3Var.S0 = true;
                                n3Var.i();
                                org.telegram.ui.e3 e3Var2 = n3Var.U0;
                                String userName = UserObject.getUserName(MessagesController.getInstance(n3Var.G).getUser(Long.valueOf(n3Var.H)));
                                String str7 = p3Var.H;
                                n3Var.T0 = str7;
                                e3Var2.a(userName, str7);
                                org.telegram.ui.e3 e3Var3 = n3Var.U0;
                                Paint paint2 = n3Var.P;
                                e3Var3.b(AndroidUtilities.computePerceivedBrightness(paint2.getColor()) <= 0.721f, false);
                                n3Var.U0.setBackgroundColor(paint2.getColor());
                                n3Var.U0.setVisibility(0);
                                n3Var.U0.setAlpha(1.0f);
                            }
                            n3Var.o(p3Var.L);
                            q3Var.h(q3Var.w, p3Var, false);
                            n3Var.show();
                            break;
                        }
                    }
                }
                break;
            case 24:
                org.telegram.ui.ActionBar.w3 w3Var = (org.telegram.ui.ActionBar.w3) obj2;
                ((org.telegram.ui.ActionBar.p3) obj3).m = (Bitmap) obj;
                w3Var.getWindowView().setDrawingFromOverlay(false);
                w3Var.release();
                break;
            case 25:
                org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) obj2;
                org.telegram.ui.ActionBar.z3 z3Var3 = ((org.telegram.ui.ActionBar.v3) obj3).p;
                if (((Boolean) obj).booleanValue()) {
                    y3Var.a(1.0f);
                    if (z3Var3.a.getTabs().isEmpty()) {
                        z3Var3.a(false);
                        break;
                    }
                } else {
                    y3Var.a(0.0f);
                    break;
                }
                break;
            case 26:
                a(obj);
                break;
            case 27:
                org.telegram.ui.n3 n3Var2 = (org.telegram.ui.n3) obj3;
                Activity activity = (Activity) obj2;
                String str8 = (String) obj;
                if (!TextUtils.isEmpty(str8) && n3Var2.getWebView() != null) {
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
                            org.telegram.ui.web.y0 webView = n3Var2.getWebView();
                            String str9 = org.telegram.ui.web.o1.a().b;
                            if (str9 != null) {
                                StringBuilder u10 = a4.a.u(str9);
                                u10.append(URLEncoder.encode(str8));
                                str = u10.toString();
                            }
                            webView.loadUrl(str);
                            break;
                        } else {
                            if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                                str8 = nf.f.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                            }
                            n3Var2.getWebView().loadUrl(str8);
                            break;
                        }
                    }
                }
                break;
            case 28:
                eo eoVar2 = (eo) obj3;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = new TLRPC.TL_messages_sendQuickReplyMessages();
                tL_messages_sendQuickReplyMessages2.peer = eoVar2.getMessagesController().getInputPeer(eoVar2.T5);
                tL_messages_sendQuickReplyMessages2.shortcut_id = ((gg.j2) obj2).a;
                eoVar2.getConnectionsManager().sendRequest(tL_messages_sendQuickReplyMessages2, null);
                ok okVar2 = eoVar2.Y;
                if (okVar2 != null) {
                    okVar2.setFieldText(null);
                    break;
                }
                break;
            default:
                eo eoVar3 = (eo) obj3;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) obj2, eoVar3.T5, eoVar3.n5, eoVar3.X3, null, false, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = eoVar3.C8();
                of2.payStars = ((Long) obj).longValue();
                of2.monoForumPeer = eoVar3.N8();
                of2.suggestionParams = eoVar3.g5;
                eoVar3.getSendMessagesHelper().sendMessage(of2);
                eoVar3.Y.setFieldText("");
                eoVar3.e9(false);
                break;
        }
    }
}
