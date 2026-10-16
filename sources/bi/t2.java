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
import org.telegram.messenger.sk;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.br;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q5 b;

    public /* synthetic */ t2(q5 q5Var, int i10) {
        this.a = i10;
        this.b = q5Var;
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
        w8 w8Var;
        int i10 = this.a;
        q5 q5Var = this.b;
        switch (i10) {
            case 0:
                sb sbVar = q5Var.J0;
                sbVar.p();
                AndroidUtilities.runOnUIThread(new r4(sbVar, 1), 30L);
                break;
            case 1:
                q5Var.L0.q(!r1.f0, true);
                break;
            case 2:
                o4 o4Var = q5Var.c1;
                TL_stories.StoryItem storyItem = q5Var.O1.a;
                if (storyItem != null) {
                    if (q5Var.C1) {
                        q5Var.F0(storyItem.privacy.isEmpty() ? new di.ca(3, q5Var.C2, new ArrayList()) : new di.ca(q5Var.C2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (q5Var.F0 == null) {
                            di.d4 d4Var = new di.d4(q5Var.getContext(), 1);
                            d4Var.p(true);
                            d4Var.K = Layout.Alignment.ALIGN_CENTER;
                            d4Var.l0 = new r2(q5Var, 9);
                            q5Var.F0 = d4Var;
                            d4Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            o4Var.addView(q5Var.F0, w7.z5.a(60.0f, 0.0f, 52.0f, 0.0f, 0.0f, -1, 55));
                        }
                        TLRPC.User user = MessagesController.getInstance(q5Var.C2).getUser(Long.valueOf(q5Var.B1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                q5Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                q5Var.F0.k(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, q5Var.F0.getTextPaint().getFontMetricsInt(), false);
                                di.d4 d4Var2 = q5Var.F0;
                                d4Var2.h = !z10 ? di.d4.a(replaceEmoji, d4Var2.getTextPaint()) : o4Var.getMeasuredWidth();
                                q5Var.F0.s(replaceEmoji);
                                q5Var.F0.l(1.0f, (-(o4Var.getWidth() - q5Var.C0.getCenterX())) / AndroidUtilities.density);
                                sb sbVar2 = ((jb) q5Var.Q1).d;
                                sbVar2.i1 = true;
                                sbVar2.P();
                                if (q5Var.F0.V) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                q5Var.F0.u();
                                break;
                            } else if (storyItem.selected_contacts) {
                                q5Var.F0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, q5Var.F0.getTextPaint().getFontMetricsInt(), false);
                            di.d4 d4Var22 = q5Var.F0;
                            d4Var22.h = !z10 ? di.d4.a(replaceEmoji2, d4Var22.getTextPaint()) : o4Var.getMeasuredWidth();
                            q5Var.F0.s(replaceEmoji2);
                            q5Var.F0.l(1.0f, (-(o4Var.getWidth() - q5Var.C0.getCenterX())) / AndroidUtilities.density);
                            sb sbVar22 = ((jb) q5Var.Q1).d;
                            sbVar22.i1 = true;
                            sbVar22.P();
                            if (q5Var.F0.V) {
                            }
                            q5Var.F0.u();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        pf.d.r(q5Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        pf.d.r(q5Var.getContext(), BuildVars.HUAWEI_STORE_URL);
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
                o5 o5Var = q5Var.O1;
                if (o5Var != null && (w8Var = o5Var.b) != null) {
                    w8Var.I = false;
                    w8Var.d = false;
                    w8Var.h = 0.0f;
                    w8Var.r = 0.0f;
                    w8Var.n = 0.0f;
                    if (w8Var.e != null) {
                        try {
                            new File(w8Var.e).delete();
                            w8Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    w8Var.d();
                    q5Var.f1(false);
                    break;
                }
                break;
            case 5:
                t1 t1Var = t1.W;
                if (t1Var != null) {
                    boolean o10 = t1Var.o();
                    t1 t1Var2 = t1.W;
                    boolean z11 = !o10;
                    if (t1Var2.n && t1Var2.r != z11) {
                        t1Var2.r = z11;
                        NativeInstance nativeInstance = t1Var2.E;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                    q5Var.a2.b(z11, true);
                    break;
                }
                break;
            case 6:
                h3 h3Var = q5Var.L0;
                if (!q5Var.D0(false)) {
                    zh.n5 y3 = zh.n5.y(q5Var.C2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        h3Var.k(q5Var.D0(false));
                        break;
                    } else {
                        h3Var.p();
                        break;
                    }
                } else {
                    h3Var.k(q5Var.D0(false));
                    break;
                }
            case 7:
                Context context = q5Var.getContext();
                org.telegram.ui.ActionBar.c6 c6Var = q5Var.B0;
                org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, context, c6Var, false);
                e3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var));
                LinearLayout linearLayout = new LinearLayout(q5Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(q5Var.getContext());
                z9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(q5Var.C2).setPlaceholderImage(z9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(z9Var, w7.z5.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(q5Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                sk.o(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(q5Var.getContext());
                textView2.setGravity(17);
                sk.o(org.telegram.ui.ActionBar.g6.r5, c6Var, textView2, 1, 14.0f);
                org.telegram.messenger.g0.n(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 32, 9, 32, 19));
                di.d dVar = new di.d(q5Var.getContext(), c6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                br brVar = new br(R.drawable.mini_switch_lock, 0);
                brVar.setTopOffset(1);
                spannableStringBuilder.setSpan(brVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, w7.z5.q(-1, 48, 1));
                dVar.setOnClickListener(new u1(2, q5Var, e3Var));
                e3Var.setCustomView(linearLayout);
                ((jb) q5Var.Q1).h(e3Var);
                h5 h5Var = q5Var.t1;
                if (h5Var != null) {
                    h5Var.a();
                    break;
                }
                break;
            case 8:
                if (q5Var.k3) {
                    j7.r();
                } else {
                    ((jb) q5Var.Q1).h(new j7(q5Var.getContext(), q5Var.c1.getY() + q5Var.getY(), 0, q5Var.B0));
                }
                h5 h5Var2 = q5Var.t1;
                if (h5Var2 != null) {
                    h5Var2.a();
                    break;
                }
                break;
            case 9:
                ((jb) q5Var.Q1).h(new j7(q5Var.getContext(), q5Var.c1.getY() + q5Var.getY(), 0, q5Var.B0));
                h5 h5Var3 = q5Var.t1;
                if (h5Var3 != null) {
                    h5Var3.a();
                    break;
                }
                break;
            case 10:
                u4 u4Var = q5Var.K0;
                boolean z12 = u4Var.v0;
                org.telegram.ui.Cells.y9 y9Var = u4Var.W;
                if (!z12) {
                    q5Var.h3 = true;
                    u4Var.D(false);
                    break;
                } else if (!y9Var.x()) {
                    u4Var.C();
                    break;
                } else if (y9Var.x() && Math.abs(u4Var.g0 - u4Var.i0) < AndroidUtilities.touchSlop && Math.abs(u4Var.h0 - u4Var.j0) < AndroidUtilities.touchSlop) {
                    org.telegram.ui.Cells.ba baVar = y9Var.n(u4Var.getContext()).r;
                    baVar.l();
                    if (!baVar.i && baVar.e) {
                        baVar.f(false);
                        break;
                    }
                }
                break;
            case 11:
                q5Var.Y0(true);
                break;
            case 12:
                q5Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = q5Var.O1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    q5Var.n0(new r2(q5Var, 10));
                    break;
                } else {
                    q5Var.L0(null);
                    break;
                }
                break;
        }
    }
}
