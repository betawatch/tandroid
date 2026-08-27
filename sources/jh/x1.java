package jh;

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
import org.telegram.messenger.rl;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.cq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;

    public /* synthetic */ x1(e4 e4Var, int i10) {
        this.a = i10;
        this.b = e4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a3  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder replaceTags;
        boolean z10;
        r6 r6Var;
        int i10 = this.a;
        e4 e4Var = this.b;
        switch (i10) {
            case 0:
                i9 i9Var = e4Var.F0;
                i9Var.p();
                AndroidUtilities.runOnUIThread(new l3(i9Var, 1), 30L);
                break;
            case 1:
                e4Var.H0.q(!r1.b0, true);
                break;
            case 2:
                j3 j3Var = e4Var.Y0;
                TL_stories.StoryItem storyItem = e4Var.K1.a;
                if (storyItem != null) {
                    if (e4Var.y1) {
                        e4Var.F0(storyItem.privacy.isEmpty() ? new lh.o9(3, e4Var.y2, new ArrayList()) : new lh.o9(e4Var.y2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (e4Var.B0 == null) {
                            lh.w3 w3Var = new lh.w3(e4Var.getContext(), 1);
                            w3Var.q(true);
                            w3Var.G = Layout.Alignment.ALIGN_CENTER;
                            w3Var.h0 = new v1(e4Var, 9);
                            e4Var.B0 = w3Var;
                            w3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            j3Var.addView(e4Var.B0, h7.z5.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(e4Var.y2).getUser(Long.valueOf(e4Var.x1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                e4Var.B0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                e4Var.B0.l(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, e4Var.B0.getTextPaint().getFontMetricsInt(), false);
                                lh.w3 w3Var2 = e4Var.B0;
                                w3Var2.h = !z10 ? lh.w3.a(replaceEmoji, w3Var2.getTextPaint()) : j3Var.getMeasuredWidth();
                                e4Var.B0.t(replaceEmoji);
                                e4Var.B0.m(1.0f, (-(j3Var.getWidth() - e4Var.y0.getCenterX())) / AndroidUtilities.density);
                                i9 i9Var2 = ((z8) e4Var.M1).d;
                                i9Var2.e1 = true;
                                i9Var2.P();
                                if (e4Var.B0.R) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                e4Var.B0.v();
                                break;
                            } else if (storyItem.selected_contacts) {
                                e4Var.B0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, e4Var.B0.getTextPaint().getFontMetricsInt(), false);
                            lh.w3 w3Var22 = e4Var.B0;
                            w3Var22.h = !z10 ? lh.w3.a(replaceEmoji2, w3Var22.getTextPaint()) : j3Var.getMeasuredWidth();
                            e4Var.B0.t(replaceEmoji2);
                            e4Var.B0.m(1.0f, (-(j3Var.getWidth() - e4Var.y0.getCenterX())) / AndroidUtilities.density);
                            i9 i9Var22 = ((z8) e4Var.M1).d;
                            i9Var22.e1 = true;
                            i9Var22.P();
                            if (e4Var.B0.R) {
                            }
                            e4Var.B0.v();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        we.e.s(e4Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        we.e.s(e4Var.getContext(), BuildVars.HUAWEI_STORE_URL);
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity != null) {
                        launchActivity.z(true);
                        break;
                    }
                }
                break;
            case 4:
                c4 c4Var = e4Var.K1;
                if (c4Var != null && (r6Var = c4Var.b) != null) {
                    r6Var.E = false;
                    r6Var.d = false;
                    r6Var.h = 0.0f;
                    r6Var.r = 0.0f;
                    r6Var.n = 0.0f;
                    if (r6Var.e != null) {
                        try {
                            new File(r6Var.e).delete();
                            r6Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    r6Var.d();
                    e4Var.f1(false);
                    break;
                }
                break;
            case 5:
                d1 d1Var = d1.S;
                if (d1Var != null) {
                    boolean o10 = d1Var.o();
                    d1 d1Var2 = d1.S;
                    boolean z11 = !o10;
                    if (d1Var2.n && d1Var2.r != z11) {
                        d1Var2.r = z11;
                        NativeInstance nativeInstance = d1Var2.A;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                    e4Var.W1.b(z11, true);
                    break;
                }
                break;
            case 6:
                g2 g2Var = e4Var.H0;
                if (!e4Var.D0(false)) {
                    hh.u7 y10 = hh.u7.y(e4Var.y2, false);
                    if (y10.e && y10.f.amount <= 0) {
                        g2Var.k(e4Var.D0(false));
                        break;
                    } else {
                        g2Var.p();
                        break;
                    }
                } else {
                    g2Var.k(e4Var.D0(false));
                    break;
                }
            case 7:
                Context context = e4Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = e4Var.x0;
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(context, c6Var, false, false);
                e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
                LinearLayout linearLayout = new LinearLayout(e4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(e4Var.getContext());
                n9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(e4Var.y2).setPlaceholderImage(n9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(n9Var, h7.z5.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(e4Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                rl.l(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, h7.z5.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(e4Var.getContext());
                textView2.setGravity(17);
                rl.l(org.telegram.ui.ActionBar.g6.r5, c6Var, textView2, 1, 14.0f);
                org.telegram.messenger.y1.p(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, h7.z5.t(-1, -2, 1, 32, 9, 32, 19));
                lh.d dVar = new lh.d(e4Var.getContext(), c6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                cq cqVar = new cq(R.drawable.mini_switch_lock, 0);
                cqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(cqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, h7.z5.q(-1, 48, 1));
                dVar.setOnClickListener(new ag.q0(24, e4Var, e3Var));
                e3Var.setCustomView(linearLayout);
                ((z8) e4Var.M1).h(e3Var);
                x3 x3Var = e4Var.p1;
                if (x3Var != null) {
                    x3Var.a();
                    break;
                }
                break;
            case 8:
                if (e4Var.g3) {
                    o5.q();
                } else {
                    ((z8) e4Var.M1).h(new o5(e4Var.getContext(), e4Var.Y0.getY() + e4Var.getY(), 0, e4Var.x0));
                }
                x3 x3Var2 = e4Var.p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                    break;
                }
                break;
            case 9:
                ((z8) e4Var.M1).h(new o5(e4Var.getContext(), e4Var.Y0.getY() + e4Var.getY(), 0, e4Var.x0));
                x3 x3Var3 = e4Var.p1;
                if (x3Var3 != null) {
                    x3Var3.a();
                    break;
                }
                break;
            case 10:
                n3 n3Var = e4Var.G0;
                boolean z12 = n3Var.r0;
                t9 t9Var = n3Var.S;
                if (!z12) {
                    e4Var.d3 = true;
                    n3Var.D(false);
                    break;
                } else if (!t9Var.y()) {
                    n3Var.C();
                    break;
                } else if (t9Var.y() && Math.abs(n3Var.c0 - n3Var.e0) < AndroidUtilities.touchSlop && Math.abs(n3Var.d0 - n3Var.f0) < AndroidUtilities.touchSlop) {
                    w9 w9Var = t9Var.o(n3Var.getContext()).r;
                    w9Var.m();
                    if (!w9Var.i && w9Var.e) {
                        w9Var.f(false);
                        break;
                    }
                }
                break;
            case 11:
                e4Var.Y0(true);
                break;
            case 12:
                e4Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = e4Var.K1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    e4Var.n0(new v1(e4Var, 10));
                    break;
                } else {
                    e4Var.L0(null);
                    break;
                }
                break;
        }
    }
}
