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
import org.telegram.messenger.ok;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ e3(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
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
        e6 e6Var = this.b;
        switch (i10) {
            case 0:
                jc jcVar = e6Var.J0;
                jcVar.p();
                AndroidUtilities.runOnUIThread(new d5(jcVar, 1), 30L);
                break;
            case 1:
                e6Var.L0.q(!r1.f0, true);
                break;
            case 2:
                a5 a5Var = e6Var.c1;
                TL_stories.StoryItem storyItem = e6Var.O1.a;
                if (storyItem != null) {
                    if (e6Var.C1) {
                        e6Var.F0(storyItem.privacy.isEmpty() ? new ci.da(3, e6Var.C2, new ArrayList()) : new ci.da(e6Var.C2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (e6Var.F0 == null) {
                            ci.e4 e4Var = new ci.e4(e6Var.getContext(), 1);
                            e4Var.p(true);
                            e4Var.K = Layout.Alignment.ALIGN_CENTER;
                            e4Var.l0 = new c3(e6Var, 9);
                            e6Var.F0 = e4Var;
                            e4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            a5Var.addView(e6Var.F0, w7.y5.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(e6Var.C2).getUser(Long.valueOf(e6Var.B1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                e6Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                e6Var.F0.k(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, e6Var.F0.getTextPaint().getFontMetricsInt(), false);
                                ci.e4 e4Var2 = e6Var.F0;
                                e4Var2.h = !z10 ? ci.e4.a(replaceEmoji, e4Var2.getTextPaint()) : a5Var.getMeasuredWidth();
                                e6Var.F0.s(replaceEmoji);
                                e6Var.F0.l(1.0f, (-(a5Var.getWidth() - e6Var.C0.getCenterX())) / AndroidUtilities.density);
                                jc jcVar2 = ((ac) e6Var.Q1).d;
                                jcVar2.i1 = true;
                                jcVar2.P();
                                if (e6Var.F0.V) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                e6Var.F0.u();
                                break;
                            } else if (storyItem.selected_contacts) {
                                e6Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, e6Var.F0.getTextPaint().getFontMetricsInt(), false);
                            ci.e4 e4Var22 = e6Var.F0;
                            e4Var22.h = !z10 ? ci.e4.a(replaceEmoji2, e4Var22.getTextPaint()) : a5Var.getMeasuredWidth();
                            e6Var.F0.s(replaceEmoji2);
                            e6Var.F0.l(1.0f, (-(a5Var.getWidth() - e6Var.C0.getCenterX())) / AndroidUtilities.density);
                            jc jcVar22 = ((ac) e6Var.Q1).d;
                            jcVar22.i1 = true;
                            jcVar22.P();
                            if (e6Var.F0.V) {
                            }
                            e6Var.F0.u();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        nf.f.s(e6Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        nf.f.s(e6Var.getContext(), BuildVars.HUAWEI_STORE_URL);
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
                c6 c6Var = e6Var.O1;
                if (c6Var != null && (k9Var = c6Var.b) != null) {
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
                    e6Var.f1(false);
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
                    e6Var.a2.b(z11, true);
                    break;
                }
                break;
            case 6:
                r3 r3Var = e6Var.L0;
                if (!e6Var.D0(false)) {
                    yh.s5 y3 = yh.s5.y(e6Var.C2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        r3Var.k(e6Var.D0(false));
                        break;
                    } else {
                        r3Var.p();
                        break;
                    }
                } else {
                    r3Var.k(e6Var.D0(false));
                    break;
                }
            case 7:
                Context context = e6Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var = e6Var.B0;
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, d6Var, false);
                e3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, d6Var));
                LinearLayout linearLayout = new LinearLayout(e6Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(e6Var.getContext());
                w9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(e6Var.C2).setPlaceholderImage(w9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(w9Var, w7.y5.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(e6Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                ok.n(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, w7.y5.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(e6Var.getContext());
                textView2.setGravity(17);
                ok.n(org.telegram.ui.ActionBar.h6.r5, d6Var, textView2, 1, 14.0f);
                org.telegram.messenger.f0.m(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, w7.y5.t(-1, -2, 1, 32, 9, 32, 19));
                ci.d dVar = new ci.d(e6Var.getContext(), d6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                pq pqVar = new pq(R.drawable.mini_switch_lock, 0);
                pqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(pqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, w7.y5.q(-1, 48, 1));
                dVar.setOnClickListener(new f2(2, e6Var, e3Var));
                e3Var.setCustomView(linearLayout);
                ((ac) e6Var.Q1).h(e3Var);
                v5 v5Var = e6Var.t1;
                if (v5Var != null) {
                    v5Var.a();
                    break;
                }
                break;
            case 8:
                if (e6Var.k3) {
                    x7.p();
                } else {
                    ((ac) e6Var.Q1).h(new x7(e6Var.getContext(), e6Var.c1.getY() + e6Var.getY(), 0, e6Var.B0));
                }
                v5 v5Var2 = e6Var.t1;
                if (v5Var2 != null) {
                    v5Var2.a();
                    break;
                }
                break;
            case 9:
                ((ac) e6Var.Q1).h(new x7(e6Var.getContext(), e6Var.c1.getY() + e6Var.getY(), 0, e6Var.B0));
                v5 v5Var3 = e6Var.t1;
                if (v5Var3 != null) {
                    v5Var3.a();
                    break;
                }
                break;
            case 10:
                g5 g5Var = e6Var.K0;
                boolean z12 = g5Var.v0;
                org.telegram.ui.Cells.aa aaVar = g5Var.W;
                if (!z12) {
                    e6Var.h3 = true;
                    g5Var.D(false);
                    break;
                } else if (!aaVar.y()) {
                    g5Var.C();
                    break;
                } else if (aaVar.y() && Math.abs(g5Var.g0 - g5Var.i0) < AndroidUtilities.touchSlop && Math.abs(g5Var.h0 - g5Var.j0) < AndroidUtilities.touchSlop) {
                    org.telegram.ui.Cells.da daVar = aaVar.o(g5Var.getContext()).r;
                    daVar.m();
                    if (!daVar.i && daVar.e) {
                        daVar.f(false);
                        break;
                    }
                }
                break;
            case 11:
                e6Var.Y0(true);
                break;
            case 12:
                e6Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = e6Var.O1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    e6Var.n0(new c3(e6Var, 10));
                    break;
                } else {
                    e6Var.L0(null);
                    break;
                }
                break;
        }
    }
}
