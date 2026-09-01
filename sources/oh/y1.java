package oh;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4 b;

    public /* synthetic */ y1(f4 f4Var, int i10) {
        this.a = i10;
        this.b = f4Var;
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
        f4 f4Var = this.b;
        switch (i10) {
            case 0:
                i9 i9Var = f4Var.G0;
                i9Var.p();
                AndroidUtilities.runOnUIThread(new l3(i9Var, 1), 30L);
                break;
            case 1:
                f4Var.I0.q(!r1.c0, true);
                break;
            case 2:
                j3 j3Var = f4Var.Z0;
                TL_stories.StoryItem storyItem = f4Var.L1.a;
                if (storyItem != null) {
                    if (f4Var.z1) {
                        f4Var.F0(storyItem.privacy.isEmpty() ? new qh.b8(3, f4Var.z2, new ArrayList()) : new qh.b8(f4Var.z2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (f4Var.C0 == null) {
                            qh.f3 f3Var = new qh.f3(f4Var.getContext(), 1);
                            f3Var.q(true);
                            f3Var.H = Layout.Alignment.ALIGN_CENTER;
                            f3Var.i0 = new w1(f4Var, 9);
                            f4Var.C0 = f3Var;
                            f3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            j3Var.addView(f4Var.C0, k7.c6.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(f4Var.z2).getUser(Long.valueOf(f4Var.y1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                f4Var.C0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                f4Var.C0.l(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z4 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, f4Var.C0.getTextPaint().getFontMetricsInt(), false);
                                qh.f3 f3Var2 = f4Var.C0;
                                f3Var2.h = !z4 ? qh.f3.a(replaceEmoji, f3Var2.getTextPaint()) : j3Var.getMeasuredWidth();
                                f4Var.C0.t(replaceEmoji);
                                f4Var.C0.m(1.0f, (-(j3Var.getWidth() - f4Var.z0.getCenterX())) / AndroidUtilities.density);
                                i9 i9Var2 = ((z8) f4Var.N1).d;
                                i9Var2.f1 = true;
                                i9Var2.P();
                                if (f4Var.C0.S) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                f4Var.C0.v();
                                break;
                            } else if (storyItem.selected_contacts) {
                                f4Var.C0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z4 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, f4Var.C0.getTextPaint().getFontMetricsInt(), false);
                            qh.f3 f3Var22 = f4Var.C0;
                            f3Var22.h = !z4 ? qh.f3.a(replaceEmoji2, f3Var22.getTextPaint()) : j3Var.getMeasuredWidth();
                            f4Var.C0.t(replaceEmoji2);
                            f4Var.C0.m(1.0f, (-(j3Var.getWidth() - f4Var.z0.getCenterX())) / AndroidUtilities.density);
                            i9 i9Var22 = ((z8) f4Var.N1).d;
                            i9Var22.f1 = true;
                            i9Var22.P();
                            if (f4Var.C0.S) {
                            }
                            f4Var.C0.v();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        af.g.s(f4Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        af.g.s(f4Var.getContext(), BuildVars.HUAWEI_STORE_URL);
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
                d4 d4Var = f4Var.L1;
                if (d4Var != null && (s6Var = d4Var.b) != null) {
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
                    f4Var.f1(false);
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
                    f4Var.X1.b(z10, true);
                    break;
                }
                break;
            case 6:
                h2 h2Var = f4Var.I0;
                if (!f4Var.D0(false)) {
                    mh.t7 y10 = mh.t7.y(f4Var.z2, false);
                    if (y10.e && y10.f.amount <= 0) {
                        h2Var.k(f4Var.D0(false));
                        break;
                    } else {
                        h2Var.p();
                        break;
                    }
                } else {
                    h2Var.k(f4Var.D0(false));
                    break;
                }
            case 7:
                Context context = f4Var.getContext();
                org.telegram.ui.ActionBar.g6 g6Var = f4Var.y0;
                org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(context, g6Var, false, false);
                h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
                LinearLayout linearLayout = new LinearLayout(f4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(f4Var.getContext());
                p9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(f4Var.z2).setPlaceholderImage(p9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(p9Var, k7.c6.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(f4Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.j5, g6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, k7.c6.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(f4Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.r5, g6Var, textView2, 1, 14.0f);
                org.telegram.messenger.y3.q(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, k7.c6.t(-1, -2, 1, 32, 9, 32, 19));
                qh.d dVar = new qh.d(f4Var.getContext(), g6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                oq oqVar = new oq(R.drawable.mini_switch_lock, 0);
                oqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, k7.c6.q(-1, 48, 1));
                dVar.setOnClickListener(new dg.n(27, f4Var, h3Var));
                h3Var.setCustomView(linearLayout);
                ((z8) f4Var.N1).h(h3Var);
                y3 y3Var = f4Var.q1;
                if (y3Var != null) {
                    y3Var.a();
                    break;
                }
                break;
            case 8:
                if (f4Var.h3) {
                    r5.p();
                } else {
                    ((z8) f4Var.N1).h(new r5(f4Var.getContext(), f4Var.Z0.getY() + f4Var.getY(), 0, f4Var.y0));
                }
                y3 y3Var2 = f4Var.q1;
                if (y3Var2 != null) {
                    y3Var2.a();
                    break;
                }
                break;
            case 9:
                ((z8) f4Var.N1).h(new r5(f4Var.getContext(), f4Var.Z0.getY() + f4Var.getY(), 0, f4Var.y0));
                y3 y3Var3 = f4Var.q1;
                if (y3Var3 != null) {
                    y3Var3.a();
                    break;
                }
                break;
            case 10:
                n3 n3Var = f4Var.H0;
                boolean z11 = n3Var.s0;
                w9 w9Var = n3Var.T;
                if (!z11) {
                    f4Var.e3 = true;
                    n3Var.D(false);
                    break;
                } else if (!w9Var.y()) {
                    n3Var.C();
                    break;
                } else if (w9Var.y() && Math.abs(n3Var.d0 - n3Var.f0) < AndroidUtilities.touchSlop && Math.abs(n3Var.e0 - n3Var.g0) < AndroidUtilities.touchSlop) {
                    z9 z9Var = w9Var.o(n3Var.getContext()).r;
                    z9Var.m();
                    if (!z9Var.i && z9Var.e) {
                        z9Var.f(false);
                        break;
                    }
                }
                break;
            case 11:
                f4Var.Y0(true);
                break;
            case 12:
                f4Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = f4Var.L1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    f4Var.n0(new w1(f4Var, 10));
                    break;
                } else {
                    f4Var.L0(null);
                    break;
                }
                break;
        }
    }
}
