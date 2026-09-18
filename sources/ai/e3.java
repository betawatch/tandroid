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
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.oq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ e3(f6 f6Var, int i10) {
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
        k9 k9Var;
        int i10 = this.a;
        f6 f6Var = this.b;
        switch (i10) {
            case 0:
                jc jcVar = f6Var.J0;
                jcVar.p();
                AndroidUtilities.runOnUIThread(new e5(jcVar, 1), 30L);
                break;
            case 1:
                f6Var.L0.q(!r1.f0, true);
                break;
            case 2:
                a5 a5Var = f6Var.c1;
                TL_stories.StoryItem storyItem = f6Var.O1.a;
                if (storyItem != null) {
                    if (f6Var.C1) {
                        f6Var.F0(storyItem.privacy.isEmpty() ? new ci.ga(3, f6Var.C2, new ArrayList()) : new ci.ga(f6Var.C2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (f6Var.F0 == null) {
                            ci.f4 f4Var = new ci.f4(f6Var.getContext(), 1);
                            f4Var.p(true);
                            f4Var.K = Layout.Alignment.ALIGN_CENTER;
                            f4Var.l0 = new c3(f6Var, 9);
                            f6Var.F0 = f4Var;
                            f4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            a5Var.addView(f6Var.F0, w7.y5.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
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
                                ci.f4 f4Var2 = f6Var.F0;
                                f4Var2.h = !z10 ? ci.f4.a(replaceEmoji, f4Var2.getTextPaint()) : a5Var.getMeasuredWidth();
                                f6Var.F0.s(replaceEmoji);
                                f6Var.F0.l(1.0f, (-(a5Var.getWidth() - f6Var.C0.getCenterX())) / AndroidUtilities.density);
                                jc jcVar2 = ((ac) f6Var.Q1).d;
                                jcVar2.i1 = true;
                                jcVar2.P();
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
                            ci.f4 f4Var22 = f6Var.F0;
                            f4Var22.h = !z10 ? ci.f4.a(replaceEmoji2, f4Var22.getTextPaint()) : a5Var.getMeasuredWidth();
                            f6Var.F0.s(replaceEmoji2);
                            f6Var.F0.l(1.0f, (-(a5Var.getWidth() - f6Var.C0.getCenterX())) / AndroidUtilities.density);
                            jc jcVar22 = ((ac) f6Var.Q1).d;
                            jcVar22.i1 = true;
                            jcVar22.P();
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
                        nf.f.s(f6Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        nf.f.s(f6Var.getContext(), BuildVars.HUAWEI_STORE_URL);
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
                if (d6Var != null && (k9Var = d6Var.b) != null) {
                    k9Var.I = false;
                    k9Var.d = false;
                    k9Var.h = 0.0f;
                    k9Var.r = 0.0f;
                    k9Var.n = 0.0f;
                    if (k9Var.e != null) {
                        try {
                            new File(k9Var.e).delete();
                            k9Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    k9Var.d();
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
                r3 r3Var = f6Var.L0;
                if (!f6Var.D0(false)) {
                    yh.t5 y3 = yh.t5.y(f6Var.C2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        r3Var.k(f6Var.D0(false));
                        break;
                    } else {
                        r3Var.p();
                        break;
                    }
                } else {
                    r3Var.k(f6Var.D0(false));
                    break;
                }
            case 7:
                Context context = f6Var.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = f6Var.B0;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, e6Var, false);
                f3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, e6Var));
                LinearLayout linearLayout = new LinearLayout(f6Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(f6Var.getContext());
                w9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(f6Var.C2).setPlaceholderImage(w9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(w9Var, w7.y5.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(f6Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                wh.m(org.telegram.ui.ActionBar.j6.j5, e6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, w7.y5.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(f6Var.getContext());
                textView2.setGravity(17);
                wh.m(org.telegram.ui.ActionBar.j6.r5, e6Var, textView2, 1, 14.0f);
                org.telegram.messenger.q.n(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, w7.y5.t(-1, -2, 1, 32, 9, 32, 19));
                ci.d dVar = new ci.d(f6Var.getContext(), e6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                oq oqVar = new oq(R.drawable.mini_switch_lock, 0);
                oqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, w7.y5.q(-1, 48, 1));
                dVar.setOnClickListener(new f2(2, f6Var, f3Var));
                f3Var.setCustomView(linearLayout);
                ((ac) f6Var.Q1).h(f3Var);
                w5 w5Var = f6Var.t1;
                if (w5Var != null) {
                    w5Var.a();
                    break;
                }
                break;
            case 8:
                if (f6Var.k3) {
                    w7.p();
                } else {
                    ((ac) f6Var.Q1).h(new w7(f6Var.getContext(), f6Var.c1.getY() + f6Var.getY(), 0, f6Var.B0));
                }
                w5 w5Var2 = f6Var.t1;
                if (w5Var2 != null) {
                    w5Var2.a();
                    break;
                }
                break;
            case 9:
                ((ac) f6Var.Q1).h(new w7(f6Var.getContext(), f6Var.c1.getY() + f6Var.getY(), 0, f6Var.B0));
                w5 w5Var3 = f6Var.t1;
                if (w5Var3 != null) {
                    w5Var3.a();
                    break;
                }
                break;
            case 10:
                h5 h5Var = f6Var.K0;
                boolean z12 = h5Var.v0;
                org.telegram.ui.Cells.aa aaVar = h5Var.W;
                if (!z12) {
                    f6Var.h3 = true;
                    h5Var.D(false);
                    break;
                } else if (!aaVar.y()) {
                    h5Var.C();
                    break;
                } else if (aaVar.y() && Math.abs(h5Var.g0 - h5Var.i0) < AndroidUtilities.touchSlop && Math.abs(h5Var.h0 - h5Var.j0) < AndroidUtilities.touchSlop) {
                    org.telegram.ui.Cells.da daVar = aaVar.o(h5Var.getContext()).r;
                    daVar.m();
                    if (!daVar.i && daVar.e) {
                        daVar.f(false);
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
                    f6Var.n0(new c3(f6Var, 10));
                    break;
                } else {
                    f6Var.L0(null);
                    break;
                }
                break;
        }
    }
}
