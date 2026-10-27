package di;

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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ q4 b;

    public /* synthetic */ e2(q4 q4Var, int i10) {
        this.a = i10;
        this.b = q4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a9  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        SpannableStringBuilder replaceTags;
        boolean z10;
        g7 g7Var;
        int i10 = this.a;
        q4 q4Var = this.b;
        switch (i10) {
            case 0:
                y9 y9Var = q4Var.y0;
                y9Var.p();
                AndroidUtilities.runOnUIThread(new s3(y9Var, 1), 30L);
                break;
            case 1:
                q4Var.A0.q(!r1.f0, true);
                break;
            case 2:
                q3 q3Var = q4Var.R0;
                TL_stories.StoryItem storyItem = q4Var.D1.a;
                if (storyItem != null) {
                    if (q4Var.r1) {
                        q4Var.D0(storyItem.privacy.isEmpty() ? new fi.l9(3, q4Var.r2, new ArrayList()) : new fi.l9(q4Var.r2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (q4Var.u0 == null) {
                            fi.v3 v3Var = new fi.v3(q4Var.getContext(), 1);
                            v3Var.p(true);
                            v3Var.K = Layout.Alignment.ALIGN_CENTER;
                            v3Var.l0 = new c2(q4Var, 9);
                            q4Var.u0 = v3Var;
                            v3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            q3Var.addView(q4Var.u0, kb1.h(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(q4Var.r2).getUser(Long.valueOf(q4Var.q1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                q4Var.u0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                q4Var.u0.k(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, q4Var.u0.getTextPaint().getFontMetricsInt(), false);
                                fi.v3 v3Var2 = q4Var.u0;
                                v3Var2.h = !z10 ? fi.v3.a(replaceEmoji, v3Var2.getTextPaint()) : q3Var.getMeasuredWidth();
                                q4Var.u0.s(replaceEmoji);
                                q4Var.u0.l(1.0f, (-(q3Var.getWidth() - q4Var.r0.getCenterX())) / AndroidUtilities.density);
                                y9 y9Var2 = ((p9) q4Var.F1).d;
                                y9Var2.i1 = true;
                                y9Var2.Q();
                                if (q4Var.u0.V) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                q4Var.u0.u();
                                break;
                            } else if (storyItem.selected_contacts) {
                                q4Var.u0.k(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, q4Var.u0.getTextPaint().getFontMetricsInt(), false);
                            fi.v3 v3Var22 = q4Var.u0;
                            v3Var22.h = !z10 ? fi.v3.a(replaceEmoji2, v3Var22.getTextPaint()) : q3Var.getMeasuredWidth();
                            q4Var.u0.s(replaceEmoji2);
                            q4Var.u0.l(1.0f, (-(q3Var.getWidth() - q4Var.r0.getCenterX())) / AndroidUtilities.density);
                            y9 y9Var22 = ((p9) q4Var.F1).d;
                            y9Var22.i1 = true;
                            y9Var22.Q();
                            if (q4Var.u0.V) {
                            }
                            q4Var.u0.u();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        qf.d.r(q4Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        qf.d.r(q4Var.getContext(), BuildVars.HUAWEI_STORE_URL);
                        break;
                    }
                } else {
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null) {
                        launchActivity.z(true);
                        break;
                    }
                }
                break;
            case 4:
                o4 o4Var = q4Var.D1;
                if (o4Var != null && (g7Var = o4Var.b) != null) {
                    g7Var.I = false;
                    g7Var.d = false;
                    g7Var.h = 0.0f;
                    g7Var.r = 0.0f;
                    g7Var.n = 0.0f;
                    if (g7Var.e != null) {
                        try {
                            new File(g7Var.e).delete();
                            g7Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    g7Var.d();
                    q4Var.d1(false);
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
                    q4Var.P1.b(z11, true);
                    break;
                }
                break;
            case 6:
                m2 m2Var = q4Var.A0;
                if (!q4Var.B0(false)) {
                    bi.ca y3 = bi.ca.y(q4Var.r2, false);
                    if (y3.e && y3.f.amount <= 0) {
                        m2Var.k(q4Var.B0(false));
                        break;
                    } else {
                        m2Var.p();
                        break;
                    }
                } else {
                    m2Var.k(q4Var.B0(false));
                    break;
                }
                break;
            case 7:
                Context context = q4Var.getContext();
                org.telegram.ui.ActionBar.u6 u6Var = q4Var.q0;
                org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, u6Var, false);
                k3Var.fixNavigationBar(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.h5, u6Var));
                LinearLayout linearLayout = new LinearLayout(q4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.y9 y9Var3 = new org.telegram.ui.Components.y9(q4Var.getContext());
                y9Var3.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(q4Var.r2).setPlaceholderImage(y9Var3, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(y9Var3, kb1.x(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(q4Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.j5, u6Var);
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, kb1.x(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(q4Var.getContext());
                textView2.setGravity(17);
                org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.r5, u6Var);
                textView2.setTextSize(1, 14.0f);
                org.telegram.messenger.t.n(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, kb1.x(-1, -2, 1, 32, 9, 32, 19));
                fi.d dVar = new fi.d(q4Var.getContext(), u6Var, true);
                dVar.i(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                zq zqVar = new zq(R.drawable.mini_switch_lock, 0);
                zqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
                dVar.g(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, kb1.u(-1, 48, 1));
                dVar.setOnClickListener(new bi.q(12, q4Var, k3Var));
                k3Var.setCustomView(linearLayout);
                ((p9) q4Var.F1).h(k3Var);
                h4 h4Var = q4Var.i1;
                if (h4Var != null) {
                    h4Var.a();
                    break;
                }
                break;
            case 8:
                if (q4Var.Z2) {
                    f6.p();
                } else {
                    ((p9) q4Var.F1).h(new f6(q4Var.getContext(), q4Var.R0.getY() + q4Var.getY(), 0, q4Var.q0));
                }
                h4 h4Var2 = q4Var.i1;
                if (h4Var2 != null) {
                    h4Var2.a();
                    break;
                }
                break;
            case 9:
                ((p9) q4Var.F1).h(new f6(q4Var.getContext(), q4Var.R0.getY() + q4Var.getY(), 0, q4Var.q0));
                h4 h4Var3 = q4Var.i1;
                if (h4Var3 != null) {
                    h4Var3.a();
                    break;
                }
                break;
            case 10:
                u3 u3Var = q4Var.z0;
                boolean z12 = u3Var.v0;
                org.telegram.ui.Cells.ca caVar = u3Var.W;
                if (!z12) {
                    q4Var.W2 = true;
                    u3Var.E(false);
                    break;
                } else if (!caVar.x()) {
                    u3Var.D();
                    break;
                } else if (caVar.x() && Math.abs(u3Var.g0 - u3Var.i0) < AndroidUtilities.touchSlop && Math.abs(u3Var.h0 - u3Var.j0) < AndroidUtilities.touchSlop) {
                    org.telegram.ui.Cells.fa faVar = caVar.n(u3Var.getContext()).r;
                    faVar.l();
                    if (!faVar.i && faVar.e) {
                        faVar.f(false);
                        break;
                    }
                }
                break;
            case 11:
                q4Var.W0(true);
                break;
            case 12:
                q4Var.c1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = q4Var.D1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    q4Var.l0(new c2(q4Var, 10));
                    break;
                } else {
                    q4Var.J0(null);
                    break;
                }
                break;
        }
    }
}
