package ci;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4 b;

    public /* synthetic */ e2(p4 p4Var, int i10) {
        this.a = i10;
        this.b = p4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a9  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder replaceTags;
        boolean z10;
        g7 g7Var;
        int i10 = this.a;
        p4 p4Var = this.b;
        switch (i10) {
            case 0:
                z9 z9Var = p4Var.J0;
                z9Var.p();
                AndroidUtilities.runOnUIThread(new s3(z9Var, 1), 30L);
                break;
            case 1:
                p4Var.L0.q(!r1.f0, true);
                break;
            case 2:
                q3 q3Var = p4Var.c1;
                TL_stories.StoryItem storyItem = p4Var.O1.a;
                if (storyItem != null) {
                    if (p4Var.C1) {
                        p4Var.E0(storyItem.privacy.isEmpty() ? new ei.p9(3, p4Var.C2, new ArrayList()) : new ei.p9(p4Var.C2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (p4Var.F0 == null) {
                            ei.x3 x3Var = new ei.x3(p4Var.getContext(), 1);
                            x3Var.p(true);
                            x3Var.K = Layout.Alignment.ALIGN_CENTER;
                            x3Var.l0 = new c2(p4Var, 9);
                            p4Var.F0 = x3Var;
                            x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            q3Var.addView(p4Var.F0, w7.z5.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(p4Var.C2).getUser(Long.valueOf(p4Var.B1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                p4Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                p4Var.F0.k(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, p4Var.F0.getTextPaint().getFontMetricsInt(), false);
                                ei.x3 x3Var2 = p4Var.F0;
                                x3Var2.h = !z10 ? ei.x3.a(replaceEmoji, x3Var2.getTextPaint()) : q3Var.getMeasuredWidth();
                                p4Var.F0.s(replaceEmoji);
                                p4Var.F0.l(1.0f, (-(q3Var.getWidth() - p4Var.C0.getCenterX())) / AndroidUtilities.density);
                                z9 z9Var2 = ((q9) p4Var.Q1).d;
                                z9Var2.i1 = true;
                                z9Var2.P();
                                if (p4Var.F0.V) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                p4Var.F0.u();
                                break;
                            } else if (storyItem.selected_contacts) {
                                p4Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, p4Var.F0.getTextPaint().getFontMetricsInt(), false);
                            ei.x3 x3Var22 = p4Var.F0;
                            x3Var22.h = !z10 ? ei.x3.a(replaceEmoji2, x3Var22.getTextPaint()) : q3Var.getMeasuredWidth();
                            p4Var.F0.s(replaceEmoji2);
                            p4Var.F0.l(1.0f, (-(q3Var.getWidth() - p4Var.C0.getCenterX())) / AndroidUtilities.density);
                            z9 z9Var22 = ((q9) p4Var.Q1).d;
                            z9Var22.i1 = true;
                            z9Var22.P();
                            if (p4Var.F0.V) {
                            }
                            p4Var.F0.u();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        pf.d.r(p4Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        pf.d.r(p4Var.getContext(), BuildVars.HUAWEI_STORE_URL);
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = LaunchActivity.J1;
                    if (launchActivity != null) {
                        launchActivity.z(true);
                        break;
                    }
                }
                break;
            case 4:
                n4 n4Var = p4Var.O1;
                if (n4Var != null && (g7Var = n4Var.b) != null) {
                    g7Var.I = false;
                    g7Var.d = false;
                    g7Var.h = 0.0f;
                    g7Var.r = 0.0f;
                    g7Var.n = 0.0f;
                    if (g7Var.e != null) {
                        try {
                            new File(g7Var.e).delete();
                            g7Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    g7Var.d();
                    p4Var.e1(false);
                    break;
                }
                break;
            case 5:
                h1 h1Var = h1.W;
                if (h1Var != null) {
                    boolean o10 = h1Var.o();
                    h1 h1Var2 = h1.W;
                    boolean z11 = !o10;
                    if (h1Var2.n && h1Var2.r != z11) {
                        h1Var2.r = z11;
                        NativeInstance nativeInstance = h1Var2.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                    p4Var.a2.b(z11, true);
                    break;
                }
                break;
            case 6:
                m2 m2Var = p4Var.L0;
                if (!p4Var.C0(false)) {
                    ai.ha y3 = ai.ha.y(p4Var.C2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        m2Var.k(p4Var.C0(false));
                        break;
                    } else {
                        m2Var.p();
                        break;
                    }
                } else {
                    m2Var.k(p4Var.C0(false));
                    break;
                }
                break;
            case 7:
                Context context = p4Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var = p4Var.B0;
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, context, g6Var, false);
                h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, g6Var));
                LinearLayout linearLayout = new LinearLayout(p4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(p4Var.getContext());
                w9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(p4Var.C2).setPlaceholderImage(w9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(w9Var, w7.z5.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(p4Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, g6Var);
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(p4Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.r5, g6Var);
                textView2.setTextSize(1, 14.0f);
                org.telegram.messenger.v0.m(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 32, 9, 32, 19));
                ei.d dVar = new ei.d(p4Var.getContext(), g6Var, true);
                dVar.i(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                xq xqVar = new xq(R.drawable.mini_switch_lock, 0);
                xqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(xqVar, 0, 1, 33);
                dVar.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, w7.z5.q(-1, 48, 1));
                dVar.setOnClickListener(new ai.p(12, p4Var, h3Var));
                h3Var.setCustomView(linearLayout);
                ((q9) p4Var.Q1).h(h3Var);
                g4 g4Var = p4Var.t1;
                if (g4Var != null) {
                    g4Var.a();
                    break;
                }
                break;
            case 8:
                if (p4Var.k3) {
                    f6.q();
                } else {
                    ((q9) p4Var.Q1).h(new f6(p4Var.getContext(), p4Var.c1.getY() + p4Var.getY(), 0, p4Var.B0));
                }
                g4 g4Var2 = p4Var.t1;
                if (g4Var2 != null) {
                    g4Var2.a();
                    break;
                }
                break;
            case 9:
                ((q9) p4Var.Q1).h(new f6(p4Var.getContext(), p4Var.c1.getY() + p4Var.getY(), 0, p4Var.B0));
                g4 g4Var3 = p4Var.t1;
                if (g4Var3 != null) {
                    g4Var3.a();
                    break;
                }
                break;
            case 10:
                u3 u3Var = p4Var.K0;
                boolean z12 = u3Var.v0;
                org.telegram.ui.Cells.y9 y9Var = u3Var.W;
                if (!z12) {
                    p4Var.h3 = true;
                    u3Var.E(false);
                    break;
                } else if (!y9Var.x()) {
                    u3Var.C();
                    break;
                } else if (y9Var.x() && Math.abs(u3Var.g0 - u3Var.i0) < AndroidUtilities.touchSlop && Math.abs(u3Var.h0 - u3Var.j0) < AndroidUtilities.touchSlop) {
                    org.telegram.ui.Cells.ba baVar = y9Var.n(u3Var.getContext()).r;
                    baVar.l();
                    if (!baVar.i && baVar.e) {
                        baVar.f(false);
                        break;
                    }
                }
                break;
            case 11:
                p4Var.X0(true);
                break;
            case 12:
                p4Var.d1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = p4Var.O1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    p4Var.m0(new c2(p4Var, 10));
                    break;
                } else {
                    p4Var.K0(null);
                    break;
                }
                break;
        }
    }
}
