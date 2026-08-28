package ih;

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
import org.telegram.messenger.ll;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Components.eq;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ z1(i4 i4Var, int i9) {
        this.a = i9;
        this.b = i4Var;
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
        u6 u6Var;
        int i9 = this.a;
        i4 i4Var = this.b;
        switch (i9) {
            case 0:
                m9 m9Var = i4Var.F0;
                m9Var.p();
                AndroidUtilities.runOnUIThread(new n3(m9Var, 1), 30L);
                break;
            case 1:
                i4Var.H0.q(!r1.b0, true);
                break;
            case 2:
                l3 l3Var = i4Var.Y0;
                TL_stories.StoryItem storyItem = i4Var.K1.a;
                if (storyItem != null) {
                    if (i4Var.y1) {
                        i4Var.F0(storyItem.privacy.isEmpty() ? new kh.r9(3, i4Var.y2, new ArrayList()) : new kh.r9(i4Var.y2, storyItem.privacy), storyItem);
                        break;
                    } else {
                        if (i4Var.B0 == null) {
                            kh.x3 x3Var = new kh.x3(i4Var.getContext(), 1);
                            x3Var.q(true);
                            x3Var.G = Layout.Alignment.ALIGN_CENTER;
                            x3Var.h0 = new x1(i4Var, 9);
                            i4Var.B0 = x3Var;
                            x3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
                            l3Var.addView(i4Var.B0, g7.e6.d(-1, 60.0f, 55, 0.0f, 52.0f, 0.0f, 0.0f));
                        }
                        TLRPC.User user = MessagesController.getInstance(i4Var.y2).getUser(Long.valueOf(i4Var.x1));
                        if (user != null) {
                            String str = user.first_name;
                            int indexOf = str.indexOf(32);
                            if (indexOf > 0) {
                                str = str.substring(0, indexOf);
                            }
                            if (storyItem.close_friends) {
                                i4Var.B0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryCloseFriendsHint", R.string.StoryCloseFriendsHint, str));
                            } else if (storyItem.contacts) {
                                i4Var.B0.l(11.0f, 6.0f, 11.0f, 7.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContactsHint", R.string.StoryContactsHint, str));
                                z10 = false;
                                CharSequence replaceEmoji = Emoji.replaceEmoji(replaceTags, i4Var.B0.getTextPaint().getFontMetricsInt(), false);
                                kh.x3 x3Var2 = i4Var.B0;
                                x3Var2.h = !z10 ? kh.x3.a(replaceEmoji, x3Var2.getTextPaint()) : l3Var.getMeasuredWidth();
                                i4Var.B0.t(replaceEmoji);
                                i4Var.B0.m(1.0f, (-(l3Var.getWidth() - i4Var.y0.getCenterX())) / AndroidUtilities.density);
                                m9 m9Var2 = ((d9) i4Var.M1).d;
                                m9Var2.e1 = true;
                                m9Var2.P();
                                if (i4Var.B0.R) {
                                    BotWebViewVibrationEffect.IMPACT_LIGHT.vibrate();
                                }
                                i4Var.B0.v();
                                break;
                            } else if (storyItem.selected_contacts) {
                                i4Var.B0.l(15.0f, 8.0f, 15.0f, 8.0f);
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StorySelectedContactsHint", R.string.StorySelectedContactsHint, str));
                            }
                            z10 = true;
                            CharSequence replaceEmoji2 = Emoji.replaceEmoji(replaceTags, i4Var.B0.getTextPaint().getFontMetricsInt(), false);
                            kh.x3 x3Var22 = i4Var.B0;
                            x3Var22.h = !z10 ? kh.x3.a(replaceEmoji2, x3Var22.getTextPaint()) : l3Var.getMeasuredWidth();
                            i4Var.B0.t(replaceEmoji2);
                            i4Var.B0.m(1.0f, (-(l3Var.getWidth() - i4Var.y0.getCenterX())) / AndroidUtilities.density);
                            m9 m9Var22 = ((d9) i4Var.M1).d;
                            m9Var22.e1 = true;
                            m9Var22.P();
                            if (i4Var.B0.R) {
                            }
                            i4Var.B0.v();
                        }
                    }
                }
                break;
            case 3:
                if (!ApplicationLoader.isStandaloneBuild()) {
                    if (!BuildVars.isHuaweiStoreApp()) {
                        ve.e.s(i4Var.getContext(), BuildVars.PLAYSTORE_APP_URL);
                        break;
                    } else {
                        ve.e.s(i4Var.getContext(), BuildVars.HUAWEI_STORE_URL);
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
                g4 g4Var = i4Var.K1;
                if (g4Var != null && (u6Var = g4Var.b) != null) {
                    u6Var.E = false;
                    u6Var.d = false;
                    u6Var.h = 0.0f;
                    u6Var.r = 0.0f;
                    u6Var.n = 0.0f;
                    if (u6Var.e != null) {
                        try {
                            new File(u6Var.e).delete();
                            u6Var.e = null;
                        } catch (Exception unused) {
                        }
                    }
                    u6Var.d();
                    i4Var.f1(false);
                    break;
                }
                break;
            case 5:
                f1 f1Var = f1.S;
                if (f1Var != null) {
                    boolean o6 = f1Var.o();
                    f1 f1Var2 = f1.S;
                    boolean z11 = !o6;
                    if (f1Var2.n && f1Var2.r != z11) {
                        f1Var2.r = z11;
                        NativeInstance nativeInstance = f1Var2.A;
                        if (nativeInstance != null) {
                            nativeInstance.setMuteMicrophone(z11);
                        }
                    }
                    i4Var.W1.b(z11, true);
                    break;
                }
                break;
            case 6:
                h2 h2Var = i4Var.H0;
                if (!i4Var.D0(false)) {
                    gh.v7 y10 = gh.v7.y(i4Var.y2, false);
                    if (y10.e && y10.f.amount <= 0) {
                        h2Var.k(i4Var.D0(false));
                        break;
                    } else {
                        h2Var.p();
                        break;
                    }
                } else {
                    h2Var.k(i4Var.D0(false));
                    break;
                }
            case 7:
                Context context = i4Var.getContext();
                org.telegram.ui.ActionBar.b6 b6Var = i4Var.x0;
                org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(context, b6Var, false, false);
                f3Var.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.h5, b6Var));
                LinearLayout linearLayout = new LinearLayout(i4Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(i4Var.getContext());
                o9Var.getImageReceiver().setAutoRepeat(1);
                MediaDataController.getInstance(i4Var.y2).setPlaceholderImage(o9Var, AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME_2, "😎", "150_150");
                linearLayout.addView(o9Var, g7.e6.t(ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 1, 0, 16, 0, 16));
                TextView textView = new TextView(i4Var.getContext());
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(17);
                ll.n(org.telegram.ui.ActionBar.f6.j5, b6Var, textView, 1, 20.0f);
                textView.setText(LocaleController.getString(R.string.StoryQualityPremium));
                linearLayout.addView(textView, g7.e6.t(-1, -2, 1, 12, 0, 12, 0));
                TextView textView2 = new TextView(i4Var.getContext());
                textView2.setGravity(17);
                ll.n(org.telegram.ui.ActionBar.f6.r5, b6Var, textView2, 1, 14.0f);
                org.telegram.messenger.l0.m(R.string.StoryQualityPremiumText, textView2);
                linearLayout.addView(textView2, g7.e6.t(-1, -2, 1, 32, 9, 32, 19));
                kh.d dVar = new kh.d(i4Var.getContext(), b6Var, true);
                dVar.g(LocaleController.getString(R.string.StoryQualityIncrease), false, true);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                eq eqVar = new eq(R.drawable.mini_switch_lock, 0);
                eqVar.setTopOffset(1);
                spannableStringBuilder.setSpan(eqVar, 0, 1, 33);
                dVar.f(new SpannableStringBuilder().append((CharSequence) spannableStringBuilder).append((CharSequence) LocaleController.getString(R.string.OptionPremiumRequiredTitle)), false);
                linearLayout.addView(dVar, g7.e6.q(-1, 48, 1));
                dVar.setOnClickListener(new bg.u1(23, i4Var, f3Var));
                f3Var.setCustomView(linearLayout);
                ((d9) i4Var.M1).h(f3Var);
                b4 b4Var = i4Var.p1;
                if (b4Var != null) {
                    b4Var.a();
                    break;
                }
                break;
            case 8:
                if (i4Var.g3) {
                    s5.p();
                } else {
                    ((d9) i4Var.M1).h(new s5(i4Var.getContext(), i4Var.Y0.getY() + i4Var.getY(), 0, i4Var.x0));
                }
                b4 b4Var2 = i4Var.p1;
                if (b4Var2 != null) {
                    b4Var2.a();
                    break;
                }
                break;
            case 9:
                ((d9) i4Var.M1).h(new s5(i4Var.getContext(), i4Var.Y0.getY() + i4Var.getY(), 0, i4Var.x0));
                b4 b4Var3 = i4Var.p1;
                if (b4Var3 != null) {
                    b4Var3.a();
                    break;
                }
                break;
            case 10:
                p3 p3Var = i4Var.G0;
                boolean z12 = p3Var.r0;
                x9 x9Var = p3Var.S;
                if (!z12) {
                    i4Var.d3 = true;
                    p3Var.D(false);
                    break;
                } else if (!x9Var.y()) {
                    p3Var.C();
                    break;
                } else if (x9Var.y() && Math.abs(p3Var.c0 - p3Var.e0) < AndroidUtilities.touchSlop && Math.abs(p3Var.d0 - p3Var.f0) < AndroidUtilities.touchSlop) {
                    aa aaVar = x9Var.o(p3Var.getContext()).r;
                    aaVar.m();
                    if (!aaVar.i && aaVar.e) {
                        aaVar.f(false);
                        break;
                    }
                }
                break;
            case 11:
                i4Var.Y0(true);
                break;
            case 12:
                i4Var.e1();
                break;
            default:
                TL_stories.StoryItem storyItem2 = i4Var.K1.a;
                if (storyItem2 != null && storyItem2.sent_reaction == null) {
                    i4Var.n0(new x1(i4Var, 10));
                    break;
                } else {
                    i4Var.L0(null);
                    break;
                }
                break;
        }
    }
}
