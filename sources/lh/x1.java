package lh;

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
import org.telegram.ui.Cells.u9;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d4 b;

    public /* synthetic */ x1(d4 d4Var, int i10) {
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
        boolean z10;
        r6 r6Var;
        int i10 = this.a;
        d4 d4Var = this.b;
        switch (i10) {
            case 0:
                i9 i9Var = d4Var.F0;
                i9Var.p();
                AndroidUtilities.runOnUIThread(new j3(i9Var, 1), 30L);
                break;
            case 1:
                d4Var.H0.q(!r1.b0, true);
                break;
            case 2:
                h3 h3Var = d4Var.Y0;
                TL_stories.StoryItem storyItem = d4Var.K1.a;
                if (storyItem != null) {
                    if (d4Var.y1) {
                        d4Var.F0(storyItem.privacy.isEmpty() ? new nh.c9(3, d4Var.y2, new ArrayList()) : new nh.c9(d4Var.y2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (d4Var.B0 == null) {
                            nh.t3 t3Var = new nh.t3(d4Var.getContext(), 1);
                            t3Var.q(true);
                            t3Var.G = Layout.Alignment.ALIGN_CENTER;
                            t3Var.h0 = new v1(d4Var, 9);
                            d4Var.B0 = t3Var;
                            t3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            h3Var.addView(d4Var.B0, i7.f6.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(d4Var.y2).getUser(Long.valueOf(d4Var.x1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                d4Var.B0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                d4Var.B0.l(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, d4Var.B0.getTextPaint().getFontMetricsInt(), false);
                                nh.t3 t3Var2 = d4Var.B0;
                                t3Var2.h = !z10 ? nh.t3.a(replaceEmoji, t3Var2.getTextPaint()) : h3Var.getMeasuredWidth();
                                d4Var.B0.t(replaceEmoji);
                                d4Var.B0.m(1.0f, (-(h3Var.getWidth() - d4Var.y0.getCenterX())) / AndroidUtilities.density);
                                i9 i9Var2 = ((z8) d4Var.M1).d;
                                i9Var2.e1 = true;
                                i9Var2.P();
                                if (d4Var.B0.R) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                d4Var.B0.v();
                                break;
                            } else if (storyItem.selected_contacts) {
                                d4Var.B0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, d4Var.B0.getTextPaint().getFontMetricsInt(), false);
                            nh.t3 t3Var22 = d4Var.B0;
                            t3Var22.h = !z10 ? nh.t3.a(replaceEmoji2, t3Var22.getTextPaint()) : h3Var.getMeasuredWidth();
                            d4Var.B0.t(replaceEmoji2);
                            d4Var.B0.m(1.0f, (-(h3Var.getWidth() - d4Var.y0.getCenterX())) / AndroidUtilities.density);
                            i9 i9Var22 = ((z8) d4Var.M1).d;
                            i9Var22.e1 = true;
                            i9Var22.P();
                            if (d4Var.B0.R) {
                            }
                            d4Var.B0.v();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        ye.d.s(d4Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        ye.d.s(d4Var.getContext(), BuildVars.HUAWEI_STORE_URL);
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
                b4 b4Var = d4Var.K1;
                if (b4Var != null && (r6Var = b4Var.b) != null) {
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
                    d4Var.f1(false);
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
                    d4Var.W1.b(z11, true);
                    break;
                }
                break;
            case 6:
                f2 f2Var = d4Var.H0;
                if (!d4Var.D0(false)) {
                    jh.s7 y8 = jh.s7.y(d4Var.y2, false);
                    if (y8.e && y8.f.amount <= 0) {
                        f2Var.k(d4Var.D0(false));
                        break;
                    } else {
                        f2Var.p();
                        break;
                    }
                } else {
                    f2Var.k(d4Var.D0(false));
                    break;
                }
            case 7:
                Context context = d4Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = d4Var.x0;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, c6Var, false, false);
                f3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
                LinearLayout linearLayout = new LinearLayout(d4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                t9 t9Var = new t9(d4Var.getContext());
                t9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(d4Var.y2).setPlaceholderImage(t9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(t9Var, i7.f6.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(d4Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, i7.f6.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(d4Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.r5, c6Var, textView2, 1, 14.0f);
                org.telegram.messenger.x3.r(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, i7.f6.t(-1, -2, 1, 32, 9, 32, 19));
                nh.d dVar = new nh.d(d4Var.getContext(), c6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                iq iqVar = new iq(R.drawable.mini_switch_lock, 0);
                iqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, i7.f6.q(-1, 48, 1));
                dVar.setOnClickListener(new ag.n(27, d4Var, f3Var));
                f3Var.setCustomView(linearLayout);
                ((z8) d4Var.M1).h(f3Var);
                w3 w3Var = d4Var.p1;
                if (w3Var != null) {
                    w3Var.a();
                    break;
                }
                break;
            case 8:
                if (d4Var.g3) {
                    q5.p();
                } else {
                    ((z8) d4Var.M1).h(new q5(d4Var.getContext(), d4Var.Y0.getY() + d4Var.getY(), 0, d4Var.x0));
                }
                w3 w3Var2 = d4Var.p1;
                if (w3Var2 != null) {
                    w3Var2.a();
                    break;
                }
                break;
            case 9:
                ((z8) d4Var.M1).h(new q5(d4Var.getContext(), d4Var.Y0.getY() + d4Var.getY(), 0, d4Var.x0));
                w3 w3Var3 = d4Var.p1;
                if (w3Var3 != null) {
                    w3Var3.a();
                    break;
                }
                break;
            case 10:
                l3 l3Var = d4Var.G0;
                boolean z12 = l3Var.r0;
                u9 u9Var = l3Var.S;
                if (!z12) {
                    d4Var.d3 = true;
                    l3Var.D(false);
                    break;
                } else if (!u9Var.y()) {
                    l3Var.C();
                    break;
                } else if (u9Var.y() && Math.abs(l3Var.c0 - l3Var.e0) < AndroidUtilities.touchSlop && Math.abs(l3Var.d0 - l3Var.f0) < AndroidUtilities.touchSlop) {
                    x9 x9Var = u9Var.o(l3Var.getContext()).r;
                    x9Var.m();
                    if (!x9Var.i && x9Var.e) {
                        x9Var.f(false);
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
                TL_stories.StoryItem storyItem2 = d4Var.K1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    d4Var.n0(new v1(d4Var, 10));
                    break;
                } else {
                    d4Var.L0(null);
                    break;
                }
                break;
        }
    }
}
