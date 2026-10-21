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
import org.telegram.messenger.mk;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ f2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
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
        h7 h7Var;
        int i10 = this.a;
        q4 q4Var = this.b;
        switch (i10) {
            case 0:
                aa aaVar = q4Var.J0;
                aaVar.p();
                AndroidUtilities.runOnUIThread(new t3(aaVar, 1), 30L);
                break;
            case 1:
                q4Var.L0.q(!r1.f0, true);
                break;
            case 2:
                r3 r3Var = q4Var.c1;
                TL_stories.StoryItem storyItem = q4Var.O1.a;
                if (storyItem != null) {
                    if (q4Var.C1) {
                        q4Var.F0(storyItem.privacy.isEmpty() ? new ei.p9(3, q4Var.C2, new ArrayList()) : new ei.p9(q4Var.C2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (q4Var.F0 == null) {
                            ei.x3 x3Var = new ei.x3(q4Var.getContext(), 1);
                            x3Var.p(true);
                            x3Var.K = Layout.Alignment.ALIGN_CENTER;
                            x3Var.l0 = new d2(q4Var, 9);
                            q4Var.F0 = x3Var;
                            x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            r3Var.addView(q4Var.F0, w7.z5.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(q4Var.C2).getUser(Long.valueOf(q4Var.B1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                q4Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                q4Var.F0.k(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, q4Var.F0.getTextPaint().getFontMetricsInt(), false);
                                ei.x3 x3Var2 = q4Var.F0;
                                x3Var2.h = !z10 ? ei.x3.a(replaceEmoji, x3Var2.getTextPaint()) : r3Var.getMeasuredWidth();
                                q4Var.F0.s(replaceEmoji);
                                q4Var.F0.l(1.0f, (-(r3Var.getWidth() - q4Var.C0.getCenterX())) / AndroidUtilities.density);
                                aa aaVar2 = ((r9) q4Var.Q1).d;
                                aaVar2.i1 = true;
                                aaVar2.P();
                                if (q4Var.F0.V) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                q4Var.F0.u();
                                break;
                            } else if (storyItem.selected_contacts) {
                                q4Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, q4Var.F0.getTextPaint().getFontMetricsInt(), false);
                            ei.x3 x3Var22 = q4Var.F0;
                            x3Var22.h = !z10 ? ei.x3.a(replaceEmoji2, x3Var22.getTextPaint()) : r3Var.getMeasuredWidth();
                            q4Var.F0.s(replaceEmoji2);
                            q4Var.F0.l(1.0f, (-(r3Var.getWidth() - q4Var.C0.getCenterX())) / AndroidUtilities.density);
                            aa aaVar22 = ((r9) q4Var.Q1).d;
                            aaVar22.i1 = true;
                            aaVar22.P();
                            if (q4Var.F0.V) {
                            }
                            q4Var.F0.u();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        pf.d.r(q4Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        pf.d.r(q4Var.getContext(), BuildVars.HUAWEI_STORE_URL);
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.z(true);
                        break;
                    }
                }
                break;
            case 4:
                o4 o4Var = q4Var.O1;
                if (o4Var != null && (h7Var = o4Var.b) != null) {
                    h7Var.I = false;
                    h7Var.d = false;
                    h7Var.h = 0.0f;
                    h7Var.r = 0.0f;
                    h7Var.n = 0.0f;
                    if (h7Var.e != null) {
                        try {
                            new File(h7Var.e).delete();
                            h7Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    h7Var.d();
                    q4Var.f1(false);
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
                    q4Var.a2.b(z11, true);
                    break;
                }
                break;
            case 6:
                n2 n2Var = q4Var.L0;
                if (!q4Var.D0(false)) {
                    ai.ga y3 = ai.ga.y(q4Var.C2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        n2Var.k(q4Var.D0(false));
                        break;
                    } else {
                        n2Var.p();
                        break;
                    }
                } else {
                    n2Var.k(q4Var.D0(false));
                    break;
                }
            case 7:
                Context context = q4Var.getContext();
                org.telegram.ui.ActionBar.d6 d6Var = q4Var.B0;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, d6Var, false);
                f3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, d6Var));
                LinearLayout linearLayout = new LinearLayout(q4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(q4Var.getContext());
                w9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(q4Var.C2).setPlaceholderImage(w9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(w9Var, w7.z5.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(q4Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                mk.o(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(q4Var.getContext());
                textView2.setGravity(17);
                mk.o(org.telegram.ui.ActionBar.h6.r5, d6Var, textView2, 1, 14.0f);
                org.telegram.messenger.g0.n(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 32, 9, 32, 19));
                ei.d dVar = new ei.d(q4Var.getContext(), d6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                yq yqVar = new yq(R.drawable.mini_switch_lock, 0);
                yqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, w7.z5.q(-1, 48, 1));
                dVar.setOnClickListener(new ai.p(12, q4Var, f3Var));
                f3Var.setCustomView(linearLayout);
                ((r9) q4Var.Q1).h(f3Var);
                h4 h4Var = q4Var.t1;
                if (h4Var != null) {
                    h4Var.a();
                    break;
                }
                break;
            case 8:
                if (q4Var.k3) {
                    g6.q();
                } else {
                    ((r9) q4Var.Q1).h(new g6(q4Var.getContext(), q4Var.c1.getY() + q4Var.getY(), 0, q4Var.B0));
                }
                h4 h4Var2 = q4Var.t1;
                if (h4Var2 != null) {
                    h4Var2.a();
                    break;
                }
                break;
            case 9:
                ((r9) q4Var.Q1).h(new g6(q4Var.getContext(), q4Var.c1.getY() + q4Var.getY(), 0, q4Var.B0));
                h4 h4Var3 = q4Var.t1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    break;
                }
                break;
            case 10:
                v3 v3Var = q4Var.K0;
                boolean z12 = v3Var.v0;
                org.telegram.ui.Cells.x9 x9Var = v3Var.W;
                if (!z12) {
                    q4Var.h3 = true;
                    v3Var.D(false);
                    break;
                } else if (!x9Var.x()) {
                    v3Var.C();
                    break;
                } else if (x9Var.x() && Math.abs(v3Var.g0 - v3Var.i0) < AndroidUtilities.touchSlop && Math.abs(v3Var.h0 - v3Var.j0) < AndroidUtilities.touchSlop) {
                    org.telegram.ui.Cells.aa aaVar3 = x9Var.n(v3Var.getContext()).r;
                    aaVar3.l();
                    if (!aaVar3.i && aaVar3.e) {
                        aaVar3.f(false);
                        break;
                    }
                }
                break;
            case 11:
                q4Var.Y0(true);
                break;
            case 12:
                q4Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = q4Var.O1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    q4Var.n0(new d2(q4Var, 10));
                    break;
                } else {
                    q4Var.L0(null);
                    break;
                }
                break;
        }
    }
}
