package bi;

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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.nq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ s2(o5 o5Var, int i10) {
        this.a = i10;
        this.b = o5Var;
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
        t8 t8Var;
        int i10 = this.a;
        o5 o5Var = this.b;
        switch (i10) {
            case 0:
                pb pbVar = o5Var.J0;
                pbVar.p();
                AndroidUtilities.runOnUIThread(new p4(pbVar, 1), 30L);
                break;
            case 1:
                o5Var.L0.q(!r1.f0, true);
                break;
            case 2:
                l4 l4Var = o5Var.c1;
                TL_stories.StoryItem storyItem = o5Var.O1.a;
                if (storyItem != null) {
                    if (o5Var.C1) {
                        o5Var.F0(storyItem.privacy.isEmpty() ? new di.ga(3, o5Var.C2, new ArrayList()) : new di.ga(o5Var.C2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (o5Var.F0 == null) {
                            di.f4 f4Var = new di.f4(o5Var.getContext(), 1);
                            f4Var.p(true);
                            f4Var.K = Layout.Alignment.ALIGN_CENTER;
                            f4Var.l0 = new q2(o5Var, 9);
                            o5Var.F0 = f4Var;
                            f4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            l4Var.addView(o5Var.F0, w7.x5.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(o5Var.C2).getUser(Long.valueOf(o5Var.B1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                o5Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                o5Var.F0.k(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, o5Var.F0.getTextPaint().getFontMetricsInt(), false);
                                di.f4 f4Var2 = o5Var.F0;
                                f4Var2.h = !z10 ? di.f4.a(replaceEmoji, f4Var2.getTextPaint()) : l4Var.getMeasuredWidth();
                                o5Var.F0.s(replaceEmoji);
                                o5Var.F0.l(1.0f, (-(l4Var.getWidth() - o5Var.C0.getCenterX())) / AndroidUtilities.density);
                                pb pbVar2 = ((gb) o5Var.Q1).d;
                                pbVar2.i1 = true;
                                pbVar2.P();
                                if (o5Var.F0.V) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                o5Var.F0.u();
                                break;
                            } else if (storyItem.selected_contacts) {
                                o5Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, o5Var.F0.getTextPaint().getFontMetricsInt(), false);
                            di.f4 f4Var22 = o5Var.F0;
                            f4Var22.h = !z10 ? di.f4.a(replaceEmoji2, f4Var22.getTextPaint()) : l4Var.getMeasuredWidth();
                            o5Var.F0.s(replaceEmoji2);
                            o5Var.F0.l(1.0f, (-(l4Var.getWidth() - o5Var.C0.getCenterX())) / AndroidUtilities.density);
                            pb pbVar22 = ((gb) o5Var.Q1).d;
                            pbVar22.i1 = true;
                            pbVar22.P();
                            if (o5Var.F0.V) {
                            }
                            o5Var.F0.u();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        of.f.s(o5Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        of.f.s(o5Var.getContext(), BuildVars.HUAWEI_STORE_URL);
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
                m5 m5Var = o5Var.O1;
                if (m5Var != null && (t8Var = m5Var.b) != null) {
                    t8Var.I = false;
                    t8Var.d = false;
                    t8Var.h = 0.0f;
                    t8Var.r = 0.0f;
                    t8Var.n = 0.0f;
                    if (t8Var.e != null) {
                        try {
                            new File(t8Var.e).delete();
                            t8Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    t8Var.d();
                    o5Var.f1(false);
                    break;
                }
                break;
            case 5:
                t1 t1Var = t1.W;
                if (t1Var != null) {
                    boolean o9 = t1Var.o();
                    t1 t1Var2 = t1.W;
                    boolean z11 = !o9;
                    if (t1Var2.n && t1Var2.r != z11) {
                        t1Var2.r = z11;
                        NativeInstance nativeInstance = t1Var2.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                    o5Var.a2.b(z11, true);
                    break;
                }
                break;
            case 6:
                e3 e3Var = o5Var.L0;
                if (!o5Var.D0(false)) {
                    zh.s5 y3 = zh.s5.y(o5Var.C2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        e3Var.k(o5Var.D0(false));
                        break;
                    } else {
                        e3Var.p();
                        break;
                    }
                } else {
                    e3Var.k(o5Var.D0(false));
                    break;
                }
            case 7:
                Context context = o5Var.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = o5Var.B0;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, f6Var, false);
                f3Var.fixNavigationBar(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
                LinearLayout linearLayout = new LinearLayout(o5Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(o5Var.getContext());
                x9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(o5Var.C2).setPlaceholderImage(x9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(x9Var, w7.x5.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(o5Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                wl.n(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, w7.x5.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(o5Var.getContext());
                textView2.setGravity(17);
                wl.n(org.telegram.ui.ActionBar.j6.r5, f6Var, textView2, 1, 14.0f);
                org.telegram.messenger.w1.n(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, w7.x5.t(-1, -2, 1, 32, 9, 32, 19));
                di.d dVar = new di.d(o5Var.getContext(), f6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                nq nqVar = new nq(R.drawable.mini_switch_lock, 0);
                nqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(nqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, w7.x5.q(-1, 48, 1));
                dVar.setOnClickListener(new u1(2, o5Var, f3Var));
                f3Var.setCustomView(linearLayout);
                ((gb) o5Var.Q1).h(f3Var);
                f5 f5Var = o5Var.t1;
                if (f5Var != null) {
                    f5Var.a();
                    break;
                }
                break;
            case 8:
                if (o5Var.k3) {
                    f7.p();
                } else {
                    ((gb) o5Var.Q1).h(new f7(o5Var.getContext(), o5Var.c1.getY() + o5Var.getY(), 0, o5Var.B0));
                }
                f5 f5Var2 = o5Var.t1;
                if (f5Var2 != null) {
                    f5Var2.a();
                    break;
                }
                break;
            case 9:
                ((gb) o5Var.Q1).h(new f7(o5Var.getContext(), o5Var.c1.getY() + o5Var.getY(), 0, o5Var.B0));
                f5 f5Var3 = o5Var.t1;
                if (f5Var3 != null) {
                    f5Var3.a();
                    break;
                }
                break;
            case 10:
                s4 s4Var = o5Var.K0;
                boolean z12 = s4Var.v0;
                org.telegram.ui.Cells.aa aaVar = s4Var.W;
                if (!z12) {
                    o5Var.h3 = true;
                    s4Var.D(false);
                    break;
                } else if (!aaVar.y()) {
                    s4Var.C();
                    break;
                } else if (aaVar.y() && Math.abs(s4Var.g0 - s4Var.i0) < AndroidUtilities.touchSlop && Math.abs(s4Var.h0 - s4Var.j0) < AndroidUtilities.touchSlop) {
                    org.telegram.ui.Cells.da daVar = aaVar.o(s4Var.getContext()).r;
                    daVar.m();
                    if (!daVar.i && daVar.e) {
                        daVar.f(false);
                        break;
                    }
                }
                break;
            case 11:
                o5Var.Y0(true);
                break;
            case 12:
                o5Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = o5Var.O1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    o5Var.n0(new q2(o5Var, 10));
                    break;
                } else {
                    o5Var.L0(null);
                    break;
                }
                break;
        }
    }
}
