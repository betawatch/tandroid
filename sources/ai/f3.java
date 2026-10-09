package ai;

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
import org.telegram.messenger.bi;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.er;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ f3(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a2  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder replaceTags;
        boolean z10;
        l9 l9Var;
        int i10 = this.a;
        f6 f6Var = this.b;
        switch (i10) {
            case 0:
                kc kcVar = f6Var.J0;
                kcVar.p();
                AndroidUtilities.runOnUIThread(new e5(kcVar, 1), 30L);
                break;
            case 1:
                f6Var.L0.q(!r1.f0, true);
                break;
            case 2:
                b5 b5Var = f6Var.c1;
                TL_stories.StoryItem storyItem = f6Var.O1.a;
                if (storyItem != null) {
                    if (f6Var.C1) {
                        f6Var.F0(storyItem.privacy.isEmpty() ? new ci.da(3, f6Var.C2, new ArrayList()) : new ci.da(f6Var.C2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (f6Var.F0 == null) {
                            ci.d4 d4Var = new ci.d4(f6Var.getContext(), 1);
                            d4Var.p(true);
                            d4Var.K = Layout.Alignment.ALIGN_CENTER;
                            d4Var.l0 = new d3(f6Var, 9);
                            f6Var.F0 = d4Var;
                            d4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            b5Var.addView(f6Var.F0, w7.x5.a(60.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 55));
                        }
                        TLRPC.User user = MessagesController.getInstance(f6Var.C2).getUser(Long.valueOf(f6Var.B1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                f6Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                f6Var.F0.k(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, f6Var.F0.getTextPaint().getFontMetricsInt(), false);
                                ci.d4 d4Var2 = f6Var.F0;
                                d4Var2.h = !z10 ? ci.d4.a(replaceEmoji, d4Var2.getTextPaint()) : b5Var.getMeasuredWidth();
                                f6Var.F0.s(replaceEmoji);
                                f6Var.F0.l(1.0f, (-(b5Var.getWidth() - f6Var.C0.getCenterX())) / AndroidUtilities.density);
                                kc kcVar2 = ((bc) f6Var.Q1).d;
                                kcVar2.i1 = true;
                                kcVar2.P();
                                if (f6Var.F0.V) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                f6Var.F0.u();
                                break;
                            } else if (storyItem.selected_contacts) {
                                f6Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, f6Var.F0.getTextPaint().getFontMetricsInt(), false);
                            ci.d4 d4Var22 = f6Var.F0;
                            d4Var22.h = !z10 ? ci.d4.a(replaceEmoji2, d4Var22.getTextPaint()) : b5Var.getMeasuredWidth();
                            f6Var.F0.s(replaceEmoji2);
                            f6Var.F0.l(1.0f, (-(b5Var.getWidth() - f6Var.C0.getCenterX())) / AndroidUtilities.density);
                            kc kcVar22 = ((bc) f6Var.Q1).d;
                            kcVar22.i1 = true;
                            kcVar22.P();
                            if (f6Var.F0.V) {
                            }
                            f6Var.F0.u();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        of.f.s(f6Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        of.f.s(f6Var.getContext(), BuildVars.HUAWEI_STORE_URL);
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.z(true);
                        break;
                    }
                }
                break;
            case 4:
                d6 d6Var = f6Var.O1;
                if (d6Var != null && (l9Var = d6Var.b) != null) {
                    l9Var.I = false;
                    l9Var.d = false;
                    l9Var.h = 0.0f;
                    l9Var.r = 0.0f;
                    l9Var.n = 0.0f;
                    if (l9Var.e != null) {
                        try {
                            new File(l9Var.e).delete();
                            l9Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    l9Var.d();
                    f6Var.f1(false);
                    break;
                }
                break;
            case 5:
                d2 d2Var = d2.W;
                if (d2Var != null) {
                    boolean o9 = d2Var.o();
                    d2 d2Var2 = d2.W;
                    boolean z11 = !o9;
                    if (d2Var2.n && d2Var2.r != z11) {
                        d2Var2.r = z11;
                        NativeInstance nativeInstance = d2Var2.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                    f6Var.a2.b(z11, true);
                    break;
                }
                break;
            case 6:
                s3 s3Var = f6Var.L0;
                if (!f6Var.D0(false)) {
                    yh.m5 y3 = yh.m5.y(f6Var.C2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        s3Var.k(f6Var.D0(false));
                        break;
                    } else {
                        s3Var.p();
                        break;
                    }
                } else {
                    s3Var.k(f6Var.D0(false));
                    break;
                }
            case 7:
                Context context = f6Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = f6Var.B0;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
                f3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.h5, e6Var));
                LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(f6Var.getContext());
                y9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(f6Var.C2).setPlaceholderImage(y9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(y9Var, w7.x5.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(f6Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                bi.o(org.telegram.ui.ActionBar.i6.j5, e6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, w7.x5.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(f6Var.getContext());
                textView2.setGravity(17);
                bi.o(org.telegram.ui.ActionBar.i6.r5, e6Var, textView2, 1, 14.0f);
                org.telegram.messenger.q.n(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, w7.x5.t(-1, -2, 1, 32, 9, 32, 19));
                ci.d dVar = new ci.d(f6Var.getContext(), e6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                er erVar = new er(R.drawable.mini_switch_lock, 0);
                erVar.setTopOffset(1);
                spannableStringBuilder.setSpan(erVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, w7.x5.q(-1, 48, 1));
                dVar.setOnClickListener(new f2(2, f6Var, f3Var));
                f3Var.setCustomView(linearLayout);
                ((bc) f6Var.Q1).h(f3Var);
                w5 w5Var = f6Var.t1;
                if (w5Var != null) {
                    w5Var.a();
                    break;
                }
                break;
            case 8:
                if (f6Var.k3) {
                    y7.r();
                } else {
                    ((bc) f6Var.Q1).h(new y7(f6Var.getContext(), f6Var.c1.getY() + f6Var.getY(), 0, f6Var.B0));
                }
                w5 w5Var2 = f6Var.t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    break;
                }
                break;
            case 9:
                ((bc) f6Var.Q1).h(new y7(f6Var.getContext(), f6Var.c1.getY() + f6Var.getY(), 0, f6Var.B0));
                w5 w5Var3 = f6Var.t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    break;
                }
                break;
            case 10:
                h5 h5Var = f6Var.K0;
                boolean z12 = h5Var.v0;
                org.telegram.ui.Cells.y9 y9Var2 = h5Var.W;
                if (!z12) {
                    f6Var.h3 = true;
                    h5Var.D(false);
                    break;
                } else if (!y9Var2.x()) {
                    h5Var.C();
                    break;
                } else if (y9Var2.x() && Math.abs(h5Var.g0 - h5Var.i0) < AndroidUtilities.touchSlop && Math.abs(h5Var.h0 - h5Var.j0) < AndroidUtilities.touchSlop) {
                    org.telegram.ui.Cells.ba baVar = y9Var2.n(h5Var.getContext()).r;
                    baVar.l();
                    if (!baVar.i && baVar.e) {
                        baVar.f(false);
                        break;
                    }
                }
                break;
            case 11:
                f6Var.Y0(true);
                break;
            case 12:
                f6Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = f6Var.O1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    f6Var.n0(new d3(f6Var, 10));
                    break;
                } else {
                    f6Var.L0(null);
                    break;
                }
                break;
        }
    }
}
