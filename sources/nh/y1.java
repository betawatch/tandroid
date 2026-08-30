package nh;

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
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.mq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ y1(d4 d4Var, int i10) {
        this.a = i10;
        this.b = d4Var;
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
        boolean z4;
        s6 s6Var;
        int i10 = this.a;
        d4 d4Var = this.b;
        switch (i10) {
            case 0:
                i9 i9Var = d4Var.G0;
                i9Var.p();
                AndroidUtilities.runOnUIThread(new k3(i9Var, 1), 30L);
                break;
            case 1:
                d4Var.I0.q(!r1.c0, true);
                break;
            case 2:
                i3 i3Var = d4Var.Z0;
                TL_stories.StoryItem storyItem = d4Var.L1.a;
                if (storyItem != null) {
                    if (d4Var.z1) {
                        d4Var.F0(storyItem.privacy.isEmpty() ? new ph.d8(3, d4Var.z2, new ArrayList()) : new ph.d8(d4Var.z2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (d4Var.C0 == null) {
                            ph.f3 f3Var = new ph.f3(d4Var.getContext(), 1);
                            f3Var.q(true);
                            f3Var.H = Layout.Alignment.ALIGN_CENTER;
                            f3Var.i0 = new w1(d4Var, 9);
                            d4Var.C0 = f3Var;
                            f3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            i3Var.addView(d4Var.C0, k7.b6.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(d4Var.z2).getUser(Long.valueOf(d4Var.y1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                d4Var.C0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                d4Var.C0.l(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z4 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, d4Var.C0.getTextPaint().getFontMetricsInt(), false);
                                ph.f3 f3Var2 = d4Var.C0;
                                f3Var2.h = !z4 ? ph.f3.a(replaceEmoji, f3Var2.getTextPaint()) : i3Var.getMeasuredWidth();
                                d4Var.C0.t(replaceEmoji);
                                d4Var.C0.m(1.0f, (-(i3Var.getWidth() - d4Var.z0.getCenterX())) / AndroidUtilities.density);
                                i9 i9Var2 = ((z8) d4Var.N1).d;
                                i9Var2.f1 = true;
                                i9Var2.P();
                                if (d4Var.C0.S) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                d4Var.C0.v();
                                break;
                            } else if (storyItem.selected_contacts) {
                                d4Var.C0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z4 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, d4Var.C0.getTextPaint().getFontMetricsInt(), false);
                            ph.f3 f3Var22 = d4Var.C0;
                            f3Var22.h = !z4 ? ph.f3.a(replaceEmoji2, f3Var22.getTextPaint()) : i3Var.getMeasuredWidth();
                            d4Var.C0.t(replaceEmoji2);
                            d4Var.C0.m(1.0f, (-(i3Var.getWidth() - d4Var.z0.getCenterX())) / AndroidUtilities.density);
                            i9 i9Var22 = ((z8) d4Var.N1).d;
                            i9Var22.f1 = true;
                            i9Var22.P();
                            if (d4Var.C0.S) {
                            }
                            d4Var.C0.v();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        af.g.s(d4Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        af.g.s(d4Var.getContext(), BuildVars.HUAWEI_STORE_URL);
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = LaunchActivity.D1;
                    if (launchActivity != null) {
                        launchActivity.z(true);
                        break;
                    }
                }
                break;
            case 4:
                b4 b4Var = d4Var.L1;
                if (b4Var != null && (s6Var = b4Var.b) != null) {
                    s6Var.F = false;
                    s6Var.d = false;
                    s6Var.h = 0.0f;
                    s6Var.r = 0.0f;
                    s6Var.n = 0.0f;
                    if (s6Var.e != null) {
                        try {
                            new File(s6Var.e).delete();
                            s6Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    s6Var.d();
                    d4Var.f1(false);
                    break;
                }
                break;
            case 5:
                e1 e1Var = e1.T;
                if (e1Var != null) {
                    boolean o10 = e1Var.o();
                    e1 e1Var2 = e1.T;
                    boolean z10 = !o10;
                    if (e1Var2.n && e1Var2.r != z10) {
                        e1Var2.r = z10;
                        NativeInstance nativeInstance = e1Var2.B;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z10);
                        }
                    }
                    d4Var.X1.b(z10, true);
                    break;
                }
                break;
            case 6:
                g2 g2Var = d4Var.I0;
                if (!d4Var.D0(false)) {
                    lh.t7 y10 = lh.t7.y(d4Var.z2, false);
                    if (y10.e && y10.f.amount <= 0) {
                        g2Var.k(d4Var.D0(false));
                        break;
                    } else {
                        g2Var.p();
                        break;
                    }
                } else {
                    g2Var.k(d4Var.D0(false));
                    break;
                }
            case 7:
                Context context = d4Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = d4Var.y0;
                org.telegram.ui.ActionBar.g3 g3Var = new org.telegram.ui.ActionBar.g3(context, f6Var, false, false);
                g3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
                LinearLayout linearLayout = new LinearLayout(d4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(d4Var.getContext());
                p9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(d4Var.z2).setPlaceholderImage(p9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(p9Var, k7.b6.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(d4Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, k7.b6.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(d4Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.r5, f6Var, textView2, 1, 14.0f);
                org.telegram.messenger.y3.q(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, k7.b6.t(-1, -2, 1, 32, 9, 32, 19));
                ph.d dVar = new ph.d(d4Var.getContext(), f6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                mq mqVar = new mq(R.drawable.mini_switch_lock, 0);
                mqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(mqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, k7.b6.q(-1, 48, 1));
                dVar.setOnClickListener(new cg.n(27, d4Var, g3Var));
                g3Var.setCustomView(linearLayout);
                ((z8) d4Var.N1).h(g3Var);
                w3 w3Var = d4Var.q1;
                if (w3Var != null) {
                    w3Var.a();
                    break;
                }
                break;
            case 8:
                if (d4Var.h3) {
                    r5.p();
                } else {
                    ((z8) d4Var.N1).h(new r5(d4Var.getContext(), d4Var.Z0.getY() + d4Var.getY(), 0, d4Var.y0));
                }
                w3 w3Var2 = d4Var.q1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    break;
                }
                break;
            case 9:
                ((z8) d4Var.N1).h(new r5(d4Var.getContext(), d4Var.Z0.getY() + d4Var.getY(), 0, d4Var.y0));
                w3 w3Var3 = d4Var.q1;
                if (w3Var3 != null) {
                    w3Var3.a();
                    break;
                }
                break;
            case 10:
                m3 m3Var = d4Var.H0;
                boolean z11 = m3Var.s0;
                w9 w9Var = m3Var.T;
                if (!z11) {
                    d4Var.e3 = true;
                    m3Var.D(false);
                    break;
                } else if (!w9Var.y()) {
                    m3Var.C();
                    break;
                } else if (w9Var.y() && Math.abs(m3Var.d0 - m3Var.f0) < AndroidUtilities.touchSlop && Math.abs(m3Var.e0 - m3Var.g0) < AndroidUtilities.touchSlop) {
                    z9 z9Var = w9Var.o(m3Var.getContext()).r;
                    z9Var.m();
                    if (!z9Var.i && z9Var.e) {
                        z9Var.f(false);
                        break;
                    }
                }
                break;
            case 11:
                d4Var.Y0(true);
                break;
            case 12:
                d4Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = d4Var.L1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    d4Var.n0(new w1(d4Var, 10));
                    break;
                } else {
                    d4Var.L0(null);
                    break;
                }
                break;
        }
    }
}
