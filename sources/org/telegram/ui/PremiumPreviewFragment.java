package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.e implements fn7 {
    public mr0 A0;
    public final ArrayList B0;
    public final RectF C0;
    public Drawable D0;
    public int E;
    public int E0;
    public int F;
    public int G;
    public int H;
    public int I;
    public Drawable J;
    public FrameLayout K;
    public FrameLayout L;
    public yk8 M;
    public em8 N;
    public int O;
    public int P;
    public td4 Q;
    public final Paint R;
    public LinearGradient S;
    public final Matrix T;
    public final Paint U;
    public rl8 V;
    public eva W;
    public boolean X;
    public int Y;
    public int Z;
    public d79 a;
    public boolean a0;
    public final ArrayList b;
    public boolean b0;
    public final ArrayList c;
    public float c0;
    public final ArrayList d;
    public int d0;
    public int e;
    public ml8 e0;
    public tl8 f;
    public ok8 f0;
    public float g0;
    public int h;
    public final boolean h0;
    public final boolean i0;
    public final String j0;
    public boolean k0;
    public final Bitmap l0;
    public final Canvas m0;
    public boolean n;
    public final al8 n0;
    public final al8 o0;
    public mq5 p0;
    public boolean q0;
    public int r;
    public float r0;
    public int s;
    public i94 s0;
    int showAdsRow;
    public int t0;
    public int u0;
    public ol8 v0;
    public int w;
    public rl0 w0;
    public int x;
    public final tq3 x0;
    public int y;
    public final ll0 y0;
    public final ll0 z0;

    /* JADX WARN: Multi-variable type inference failed */
    public PremiumPreviewFragment(int i, String str) {
        super(null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        boolean z = false;
        this.e = 0;
        this.R = new Paint(1);
        this.T = new Matrix();
        this.U = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.l0 = createBitmap;
        this.m0 = new Canvas(createBitmap);
        this.n0 = new al8(aob.Gk, aob.Hk, aob.Ik, aob.Jk, null);
        this.p0 = mq5.e;
        al8 al8Var = new al8(aob.Ck, aob.Dk, -1, -1, null);
        this.o0 = al8Var;
        al8Var.m = true;
        al8Var.o = 0.0f;
        al8Var.p = 0.0f;
        al8Var.q = 1.0f;
        al8Var.b = 0.0f;
        al8Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.B0 = arrayList;
        RectF rectF = new RectF();
        this.C0 = rectF;
        arrayList.add(rectF);
        this.h0 = i;
        if (!aob.I.o() && i == 1) {
            z = true;
        }
        this.i0 = z;
        this.j0 = str;
        ym4 ym4Var = new ym4(this);
        if (Build.VERSION.SDK_INT >= 31) {
            tq3 tq3Var = new tq3(true);
            this.x0 = tq3Var;
            rz4 rz4Var = new rz4(null);
            rz4Var.d = tq3Var;
            rz4Var.e = -3;
            rz4Var.f = ym4Var;
            this.y0 = new ll0(rz4Var, rz4Var, rz4Var);
        } else {
            this.x0 = null;
            this.y0 = new ll0(ym4Var, ym4Var, ym4Var);
        }
        this.z0 = new ll0(ym4Var, ym4Var, ym4Var);
    }

    public static void n0(org.telegram.ui.ActionBar.e eVar, tl8 tl8Var, String str, ekd ekdVar) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z = f11.a;
        int currentAccount = eVar == null ? yac.t0 : eVar.getCurrentAccount();
        if (uc7.s1(currentAccount).x2()) {
            i5.b(currentAccount);
            return;
        }
        if (tl8Var == null && (tL_help_premiumPromo = ls6.d0(currentAccount).E) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i);
                i++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i2 = tL_premiumSubscriptionOption3.months;
                if (i2 == 1) {
                    tl8Var = new tl8(tL_premiumSubscriptionOption3);
                } else if (i2 == 12) {
                    tl8Var = new tl8(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        tl8 tl8Var2 = tl8Var;
        t0();
        if (!f11.b()) {
            wo8 wo8Var = di0.l;
            if (wo8Var == null || wo8Var.h.isEmpty()) {
                return;
            }
            if (tl8Var2.f == null) {
                tl8Var2.f = di0.l;
            }
            tl8Var2.a();
            if (tl8Var2.g == null) {
                return;
            }
            di0.h().p("subs", new an((Object) eVar, currentAccount, (Object) ekdVar, (Object) tl8Var2, (byte) 8));
            return;
        }
        Activity parentActivity = eVar != null ? eVar.getParentActivity() : LaunchActivity.H1;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (tl8Var2 != null && (tL_premiumSubscriptionOption = tl8Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.X0 = true;
                }
                m01.u(launchActivity, tl8Var2.a.bot_url);
                return;
            }
            uc7 s1 = uc7.s1(currentAccount);
            if (TextUtils.isEmpty(s1.k4.M0.f)) {
                if (TextUtils.isEmpty(s1.k4.O0.f)) {
                    return;
                }
                launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + s1.k4.O0.f)), null);
                return;
            }
            launchActivity.X0 = true;
            launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + s1.k4.M0.f + "?start=" + str)), null);
        }
    }

    public static String o0(int i) {
        switch (i) {
            case 0:
                return "double_limits";
            case 1:
                return "more_upload";
            case 2:
                return "faster_download";
            case 3:
                return "no_ads";
            case 4:
                return "infinite_reactions";
            case 5:
                return "premium_stickers";
            case 6:
                return "profile_badge";
            case 7:
                return "animated_userpics";
            case 8:
                return "voice_to_text";
            case 9:
                return "advanced_chat_management";
            case 10:
                return "app_icons";
            case 11:
                return "animated_emoji";
            case 12:
                return "emoji_status";
            case 13:
                return "translations";
            case 14:
                return "stories";
            case 15:
                return "stories__stealth_mode";
            case 16:
                return "stories__permanent_views_history";
            case 17:
                return "stories__expiration_durations";
            case 18:
                return "stories__save_stories_to_gallery";
            case 19:
                return "stories__links_and_formatting";
            case 20:
                return "stories__priority_order";
            case 21:
                return "stories__caption";
            case 22:
                return "wallpapers";
            case 23:
                return "peer_colors";
            case 24:
                return "saved_tags";
            case 25:
                return "stories__quality";
            case 26:
                return "last_seen";
            case 27:
                return "message_privacy";
            case 28:
                return "business";
            case 29:
                return "business_location";
            case jn7.S /* 30 */:
                return "business_hours";
            case 31:
                return "quick_replies";
            case 32:
                return "greeting_message";
            case 33:
                return "away_message";
            case 34:
                return "business_bots";
            case 35:
                return "folder_tags";
            case 36:
                return "business_intro";
            case 37:
                return "business_links";
            case 38:
                return "effects";
            case 39:
                return "todo";
            case 40:
                return "gifts";
            case 41:
                return "pm_noforwards";
            case 42:
                return "ai_compose";
            case 43:
                return "rich_formatting";
            default:
                return null;
        }
    }

    public static void p0(int i, ArrayList arrayList, boolean z) {
        uc7 s1 = uc7.s1(i);
        SparseIntArray sparseIntArray = s1.F0;
        if (z) {
            arrayList.add(new sl8(12, R.drawable.filled_premium_status2, ob6.M0(2131746745, null), ob6.M0(2131746744, null)));
            arrayList.add(new sl8(35, R.drawable.premium_tags, ob6.M0(2131746731, null), ob6.M0(2131746730, null)));
            arrayList.add(new sl8(14, R.drawable.filled_premium_camera, ob6.M0(2131746743, null), ob6.M0(2131746742, null)));
        } else {
            arrayList.add(new sl8(29, R.drawable.filled_location, ob6.M0(2131746782, null), ob6.M0(2131746781, null)));
            arrayList.add(new sl8(30, R.drawable.filled_premium_hours, ob6.M0(2131746780, null), ob6.M0(2131746779, null)));
            arrayList.add(new sl8(31, R.drawable.filled_open_message, ob6.M0(2131746778, null), ob6.M0(2131746777, null)));
            arrayList.add(new sl8(32, R.drawable.premium_status, ob6.M0(2131746786, null), ob6.M0(2131746785, null)));
            arrayList.add(new sl8(33, R.drawable.filled_premium_away, ob6.M0(2131746793, null), ob6.M0(2131746792, null)));
            arrayList.add(new sl8(34, R.drawable.filled_premium_bots, ob6.M0(2131746788, null), ob6.M0(2131746787, null)));
            arrayList.add(new sl8(37, R.drawable.filled_premium_chatlink, ob6.M0(2131746791, null), ob6.M0(2131746790, null)));
            arrayList.add(new sl8(36, R.drawable.filled_premium_intro, ob6.M0(2131746784, null), ob6.M0(2131746783, null)));
        }
        if (sparseIntArray.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (sparseIntArray.get(((sl8) arrayList.get(i2)).a, -1) == -1) {
                    boolean z2 = f11.a;
                }
            }
        }
        Collections.sort(arrayList, new j97(s1, (byte) 3));
    }

    public static void q0(int i, ArrayList arrayList) {
        uc7 s1 = uc7.s1(i);
        String M0 = ob6.M0(2131746727, null);
        hr hrVar = s1.k4;
        byte b = 4;
        arrayList.add(new sl8(0, R.drawable.msg_premium_limits, M0, ob6.a0(null, null, 2131746726, Integer.valueOf(hrVar.u3.f()), Integer.valueOf(hrVar.i1.f()), Integer.valueOf(hrVar.m1.f()), Integer.valueOf(hrVar.n1.f()), 4)));
        arrayList.add(new sl8(14, R.drawable.msg_filled_stories, ob6.M0(2131746703, null), ob6.a0(null, null, 2131746702, new Object[0])));
        arrayList.add(new sl8(1, R.drawable.msg_premium_uploads, ob6.M0(2131746693, null), ob6.M0(2131746692, null)));
        arrayList.add(new sl8(2, R.drawable.msg_premium_speed, ob6.M0(2131746741, null), ob6.M0(2131746740, null)));
        arrayList.add(new sl8(8, R.drawable.msg_premium_voice, ob6.M0(2131746691, null), ob6.M0(2131746690, null)));
        arrayList.add(new sl8(3, R.drawable.msg_premium_ads, ob6.M0(2131746721, null), ob6.M0(2131746720, null)));
        arrayList.add(new sl8(4, R.drawable.msg_premium_reactions, ob6.M0(2131746711, null), ob6.M0(2131746710, null)));
        arrayList.add(new sl8(5, R.drawable.msg_premium_stickers, ob6.M0(2131746705, null), ob6.M0(2131746704, null)));
        arrayList.add(new sl8(11, R.drawable.msg_premium_emoji, ob6.M0(2131746736, null), ob6.M0(2131746735, null)));
        arrayList.add(new sl8(9, R.drawable.menu_premium_tools, ob6.M0(2131746754, null), ob6.M0(2131746753, null)));
        arrayList.add(new sl8(6, R.drawable.msg_premium_badge, ob6.M0(2131746716, null), ob6.M0(2131746715, null)));
        arrayList.add(new sl8(27, R.drawable.filled_messages_paid, ob6.M0(2131746718, null), ob6.M0(2131746717, null)));
        arrayList.add(new sl8(7, R.drawable.msg_premium_avatar, ob6.M0(2131746751, null), ob6.M0(2131746750, null)));
        arrayList.add(new sl8(24, R.drawable.premium_tags, ob6.M0(2131746700, null), ob6.M0(2131746698, null)));
        arrayList.add(new sl8(10, R.drawable.msg_premium_icons, ob6.M0(2131746749, null), ob6.M0(2131746748, null)));
        arrayList.add(new sl8(12, R.drawable.premium_status, ob6.M0(2131746733, null), ob6.M0(2131746732, null)));
        arrayList.add(new sl8(13, R.drawable.msg_premium_translate, ob6.M0(2131746695, null), ob6.M0(2131746694, null)));
        arrayList.add(new sl8(22, R.drawable.premium_wallpaper, ob6.M0(2131746688, null), ob6.M0(2131746687, null)));
        arrayList.add(new sl8(23, R.drawable.premium_colors, ob6.M0(2131746714, null), ob6.M0(2131746713, null)));
        arrayList.add(new sl8(26, R.drawable.menu_premium_seen, ob6.M0(2131746729, null), ob6.M0(2131746728, null)));
        arrayList.add(new sl8(28, R.drawable.filled_premium_business, ob6.M0(2131743905, null), ob6.M0(2131746746, null)));
        arrayList.add(new sl8(38, R.drawable.menu_premium_effects, ob6.M0(2131746738, null), ob6.M0(2131746737, null)));
        arrayList.add(new sl8(39, R.drawable.msg_premium_icons, ob6.M0(2131746697, null), ob6.M0(2131746696, null)));
        arrayList.add(new sl8(41, R.drawable.filled_sharing_off2_24, ob6.M0(2131746707, null), ob6.M0(2131746706, null)));
        arrayList.add(new sl8(42, R.drawable.premium_ai_editor, ob6.M0(2131746756, null), ob6.M0(2131746755, null)));
        arrayList.add(new sl8(43, R.drawable.premium_rich_editor, ob6.M0(2131746709, null), ob6.M0(2131746708, null)));
        SparseIntArray sparseIntArray = s1.E0;
        if (sparseIntArray.size() > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (sparseIntArray.get(((sl8) arrayList.get(i2)).a, -1) == -1) {
                    boolean z = f11.a;
                }
            }
        }
        Collections.sort(arrayList, new j97(s1, b));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String r0(int i, tl8 tl8Var) {
        String str;
        String e;
        boolean z = f11.a;
        int i2 = 2131744082;
        if (tl8Var != null) {
            if (!f11.b()) {
                tl8Var.a();
                if (tl8Var.g == null) {
                    return ob6.M0(2131748533, null);
                }
            }
            boolean p = yac.h(i).p();
            int i3 = tl8Var.a.months;
            boolean z2 = i3 > 12 && i3 % 12 == 0;
            boolean z3 = i3 == 12;
            String f = z3 ? tl8Var.f() : tl8Var.e();
            if (p) {
                i2 = z3 ? 2131743462 : 2131743463;
            } else {
                if (z3) {
                    if (uc7.s1(i).k4.c3.f) {
                        f = tl8Var.e();
                    } else {
                        f = tl8Var.d();
                    }
                } else if (!z2) {
                    f = tl8Var.e();
                } else {
                    if (!uc7.s1(i).k4.c3.f) {
                        return ob6.a0(null, null, 2131744083, tl8Var.d(), ob6.G(tl8Var.a.months / 12, "Years", new Object[0]));
                    }
                    f = tl8Var.e();
                }
                i2 = 2131744088;
            }
            return ob6.a0(null, null, i2, f);
        }
        if (f11.b()) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = ls6.d0(i).E;
            if (tL_help_premiumPromo == null) {
                return ob6.M0(2131744087, null);
            }
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i4 = 0;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = null;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i4);
                i4++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i5 = tL_premiumSubscriptionOption3.months;
                if (i5 == 12) {
                    tL_premiumSubscriptionOption = tL_premiumSubscriptionOption3;
                    break;
                }
                if (tL_premiumSubscriptionOption == null && i5 == 1) {
                    tL_premiumSubscriptionOption = tL_premiumSubscriptionOption3;
                }
            }
            if (tL_premiumSubscriptionOption == null) {
                return ob6.M0(2131744087, null);
            }
            if (tL_premiumSubscriptionOption.months != 12) {
                e = di0.h().e(tL_premiumSubscriptionOption.amount, tL_premiumSubscriptionOption.currency);
            } else {
                if (!uc7.s1(i).k4.c3.f) {
                    e = di0.h().e(tL_premiumSubscriptionOption.amount, tL_premiumSubscriptionOption.currency);
                    return ob6.a0(null, null, i2, e);
                }
                e = di0.h().e(tL_premiumSubscriptionOption.amount / 12, tL_premiumSubscriptionOption.currency);
            }
            i2 = 2131744088;
            return ob6.a0(null, null, i2, e);
        }
        wo8 wo8Var = di0.l;
        if (wo8Var != null) {
            ArrayList arrayList2 = wo8Var.h;
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = ((vo8) arrayList2.get(0)).b.a;
                int size2 = arrayList3.size();
                int i6 = 0;
                str = null;
                while (true) {
                    if (i6 >= size2) {
                        break;
                    }
                    Object obj = arrayList3.get(i6);
                    i6++;
                    uo8 uo8Var = (uo8) obj;
                    if (uo8Var.d.equals("P1M")) {
                        str = uo8Var.a;
                    } else if (uo8Var.d.equals("P1Y")) {
                        if (uc7.s1(i).k4.c3.f) {
                            di0.h();
                            str = di0.f(uo8Var.c, 6, uo8Var.b / 12, false);
                        } else {
                            di0.h();
                            str = di0.f(uo8Var.c, 6, uo8Var.b, false);
                        }
                    }
                }
                i2 = 2131744088;
                return str != null ? ob6.M0(2131748533, null) : ob6.a0(null, null, i2, str);
            }
        }
        str = null;
        i2 = 2131744088;
        if (str != null) {
        }
    }

    public static void t0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(yac.t0).sendRequest(tL_help_saveAppLog, new xe2((byte) 0));
    }

    public static void u0(int i, int i2) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String o0 = o0(i2);
        if (o0 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = o0;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i).sendRequest(tL_help_saveAppLog, new xe2((byte) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = connectionsManager.getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_show";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        if (str != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = str;
            tL_jsonNull = tL_jsonString;
        } else {
            tL_jsonNull = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "source";
        tL_jsonObjectValue.value = tL_jsonNull;
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        connectionsManager.sendRequest(tL_help_saveAppLog, new xe2((byte) 0));
    }

    public final void A0(boolean z) {
        i94 i94Var;
        if (z != this.a0) {
            this.a0 = z;
            rl8 rl8Var = this.V;
            if (rl8Var != null && (i94Var = rl8Var.d) != null) {
                i94Var.setDialogVisible(z);
            }
            this.W.setPaused(z);
            this.e0.invalidate();
        }
    }

    public final void B0() {
        tl8 tl8Var;
        this.y = -1;
        this.F = -1;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.H = -1;
        this.showAdsRow = -1;
        this.I = -1;
        this.h = 1;
        this.n = true;
        int size = this.b.size() + 1;
        this.h = size;
        this.r = size;
        boolean z = this.h0;
        if (z && getUserConfig().p()) {
            int i = this.h;
            int i2 = i + 1;
            this.y = i;
            int i3 = i + 2;
            this.h = i3;
            this.s = i2;
            this.w = i3;
            int size2 = this.c.size() + i3;
            this.h = size2;
            this.x = size2;
        }
        int i4 = this.h;
        this.E = i4;
        this.h = i4 + 2;
        this.G = i4 + 1;
        if (z && getUserConfig().p()) {
            int i5 = this.h;
            this.H = i5;
            this.showAdsRow = i5 + 1;
            this.h = i5 + 3;
            this.I = i5 + 2;
        }
        hl.T3(this.K, (getUserConfig().p() && ((tl8Var = this.f) == null || tl8Var.a.months >= ((tl8) this.d.get(this.e)).a.months || this.q0)) ? false : true, 1.0f, true, false);
        int L = this.K.getVisibility() == 0 ? hl.L(64.0f) : 0;
        td4 td4Var = this.Q;
        td4Var.M = (this.Y + L) - hl.L(16.0f);
        td4Var.o1();
        this.Q.S = L;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        i94 i94Var;
        rl8 rl8Var = this.V;
        return rl8Var == null || (i94Var = rl8Var.d) == null || !i94Var.a;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        this.A0 = new mr0(this, (byte) 6);
        byte b = 1;
        this.hasOwnBackground = true;
        byte b2 = 0;
        byte b3 = 3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.R;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int w0 = aob.w0(null, aob.Fk, false);
        int w02 = aob.w0(null, aob.Ek, false);
        int i = aob.Dk;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{w0, w02, aob.w0(null, i, false), aob.w0(null, aob.Ck, false), aob.w0(null, aob.Bk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.S = linearGradient2;
        linearGradient2.setLocalMatrix(this.T);
        this.U.setShader(this.S);
        this.M = new yk8(context, null);
        this.N = new em8(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i2 = this.currentAccount;
        boolean z = this.h0;
        if (z) {
            p0(i2, arrayList, false);
            p0(this.currentAccount, arrayList2, true);
            b19.f(this.currentAccount).h();
            if (getUserConfig().p()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                ls6.d0(this.currentAccount).n0(tL_inputStickerSetShortName, false);
                y31.a(this.currentAccount).c(null);
                if (getMessagesController().M0.isEmpty()) {
                    getMessagesController().l3();
                }
                r41 d = r41.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        } else {
            q0(i2, arrayList);
        }
        Rect rect = new Rect();
        Drawable e = c00.e(context, R.drawable.sheet_shadow_round);
        this.J = e;
        e.setColorFilter(new PorterDuffColorFilter(getThemedColor(aob.h5), PorterDuff.Mode.MULTIPLY));
        this.J.getPadding(rect);
        this.Y = hl.m;
        this.e0 = new ml8(this, context);
        yic yicVar = new yic(this.e0);
        ml8 ml8Var = this.e0;
        ll0 ll0Var = this.y0;
        ll0Var.h = yicVar;
        ll0Var.i = ml8Var;
        yic yicVar2 = new yic(this.e0);
        ml8 ml8Var2 = this.e0;
        ll0 ll0Var2 = this.z0;
        ll0Var2.h = yicVar2;
        ll0Var2.i = ml8Var2;
        d79 d79Var = new d79(context, null);
        this.a = d79Var;
        d79Var.setClipToOutline(true);
        this.a.setOutlineProvider(new dl0(this, (byte) 7));
        this.a.F0(new ll8(this, b2));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setLegacySections(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        d79 d79Var2 = this.a;
        td4 td4Var = new td4((hl.L(68.0f) + this.Y) - hl.L(16.0f), this.a);
        this.Q = td4Var;
        d79Var2.setLayoutManager(td4Var);
        this.Q.R = true;
        this.a.setAdapter(new b0(this));
        this.a.j(new e98(this, b3));
        this.V = new rl8(this, context);
        eva evaVar = new eva(context);
        this.W = evaVar;
        evaVar.c();
        byte b4 = 28;
        if (z) {
            eva evaVar2 = this.W;
            if (this.i0) {
                dva dvaVar = evaVar2.a;
                dvaVar.q = true;
                dvaVar.J = false;
                dvaVar.H = true;
                dvaVar.I = true;
                dvaVar.k = hl.L(-14.0f);
                dva dvaVar2 = this.W.a;
                dvaVar2.x = (short) 2000;
                dvaVar2.y = (short) 3000;
                dvaVar2.r = (byte) 16;
                dvaVar2.G = false;
                dvaVar2.N = 28;
                dvaVar2.P = i;
            } else {
                dva dvaVar3 = evaVar2.a;
                dvaVar3.I = true;
                dvaVar3.k = hl.L(28.0f);
                dva dvaVar4 = this.W.a;
                dvaVar4.x = (short) 2000;
                dvaVar4.y = (short) 3000;
                dvaVar4.r = (byte) 16;
                dvaVar4.G = false;
                dvaVar4.N = 28;
            }
        }
        this.V.d.setStarParticlesView(this.W);
        this.e0.addView(this.W, tre.c(-2.0f, -1));
        this.e0.addView(this.V, tre.c(-2.0f, -1));
        this.a.setOnItemClickListener(new zg4(this, (byte) 21));
        this.e0.addView(this.a, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 0.0f, -48.0f));
        this.L = new FrameLayout(context);
        ok8 ok8Var = new ok8(getResourceProvider(), context, false);
        this.f0 = ok8Var;
        ok8Var.L = true;
        ok8Var.setClickable(false);
        ok8Var.w.setClickable(false);
        ok8Var.setStateListAnimator(null);
        y0(false);
        this.K = new FrameLayout(context);
        this.L.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
        this.L.addView(this.f0, tre.c(-1.0f, -1));
        FrameLayout frameLayout = this.L;
        jl0 c = ll0Var.c(frameLayout, null, false);
        c.p(dtd.j(this.resourceProvider));
        c.r(hl.L(28.0f));
        c.q(hl.L(5.0f));
        frameLayout.setBackground(c);
        iye.b(this.L, 0.02f, 1.5f);
        this.K.addView(this.L, tre.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        rl0 rl0Var = new rl0(ll0Var.c(this.K, null, false));
        rl0Var.b(hl.L(40.0f), false);
        this.w0 = new rl0(ll0Var.c(this.e0, null, false));
        this.K.setBackground(rl0Var);
        if (getUserConfig().o()) {
            this.e0.addView(this.K, tre.e(-1, -2, 80));
        }
        this.fragmentView = this.e0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        wk5 wk5Var = this.parentLayout;
        if (wk5Var == null || !((ActionBarLayout) wk5Var).U0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, b4));
        this.actionBar.setForceSkipTouches(true);
        this.e0.addView(this.actionBar, tre.e(-1, -2, 48));
        z0();
        B0();
        this.V.d.m(200L);
        if (this.q0) {
            hl.d3(new ll8(this, b), 400L);
        }
        ls6.d0(this.currentAccount).p1();
        w0(this.j0);
        View view = this.fragmentView;
        jz7 jz7Var = new jz7((Object) this, (byte) 14);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(view, jz7Var);
        return this.fragmentView;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.m5;
        int i4 = jn7.j5;
        if (i == i3 || i == i4) {
            y0(false);
            this.V.a();
        }
        if (i == jn7.i5 || i == i4) {
            this.V.b();
            this.V.a();
            B0();
            this.a.getAdapter().f();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final jt3 getEdgeToEdgeSupportMode() {
        return jt3.c;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        return zye.a(new u00(this, (byte) 14), aob.Ck, aob.Dk, aob.Ek, aob.Fk, aob.Gk, aob.Hk, aob.Ik, aob.Jk, aob.Kk, aob.Mk, aob.Nk, aob.Lk, aob.Qk);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return this.i0;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void m0() {
        tq3 tq3Var;
        if (Build.VERSION.SDK_INT < 31 || (tq3Var = this.x0) == null) {
            return;
        }
        this.C0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.p0.d) - hl.L(132.0f), this.fragmentView.getMeasuredWidth(), hl.L(48.0f) + this.fragmentView.getMeasuredHeight());
        tq3Var.g(1, this.B0);
        tq3Var.e(this.A0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        A0(false);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        if (getMessagesController().M3()) {
            return false;
        }
        jn7.e().b(this, jn7.m5);
        jn7.e().b(this, jn7.i5);
        getNotificationCenter().b(this, jn7.j5);
        if (getMediaDataController().E != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().E.videos;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                TLRPC.Document document = arrayList.get(i);
                i++;
                xb4.G(this.currentAccount).X(document, getMediaDataController().E, 3, 0);
            }
        }
        if (this.h0) {
            wsb.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        jn7.e().n(this, jn7.m5);
        jn7.e().n(this, jn7.i5);
        getNotificationCenter().n(this, jn7.j5);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        i94 i94Var;
        super.onPause();
        rl8 rl8Var = this.V;
        if (rl8Var != null && (i94Var = rl8Var.d) != null) {
            i94Var.setDialogVisible(true);
        }
        eva evaVar = this.W;
        if (evaVar != null) {
            evaVar.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        i94 i94Var;
        super.onResume();
        rl8 rl8Var = this.V;
        if (rl8Var != null && (i94Var = rl8Var.d) != null) {
            i94Var.setPaused(false);
            this.V.d.setDialogVisible(false);
        }
        this.W.setPaused(false);
        setBulletinDelegate(new t10(this, (byte) 16));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(aob.h5);
        Drawable drawable = this.J;
        if (drawable != null && (drawable != this.D0 || themedColor != this.E0)) {
            this.D0 = drawable;
            this.E0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            eva evaVar = this.W;
            if (evaVar == null || evaVar.a == null || this.e0 == null) {
                return;
            }
            z0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s0(int i, View view) {
        tl8 tl8Var;
        ul ulVar;
        yk8 yk8Var;
        int i2;
        int i3;
        if (getUserConfig().o()) {
            if (i == this.showAdsRow) {
                TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
                if (Y1 != null) {
                    skb skbVar = (skb) view;
                    skbVar.setChecked(!skbVar.d());
                    Y1.sponsored_enabled = skbVar.d();
                    TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                    togglesponsoredmessages.enabled = Y1.sponsored_enabled;
                    getConnectionsManager().sendRequest(togglesponsoredmessages, new w15(this, (byte) 19));
                    getMessagesStorage().g2(Y1, false);
                    return;
                }
                return;
            }
            if (view instanceof yk8) {
                yk8 yk8Var2 = (yk8) view;
                boolean z = this.h0;
                if (!z || !getUserConfig().p()) {
                    u0(this.currentAccount, yk8Var2.f.a);
                    int i4 = this.e;
                    if (i4 >= 0) {
                        ArrayList arrayList = this.d;
                        if (i4 < arrayList.size()) {
                            tl8Var = (tl8) arrayList.get(this.e);
                            showDialog(new xk8(this, getParentActivity(), this.currentAccount, z, yk8Var2.f.a, false, tl8Var));
                            return;
                        }
                    }
                    tl8Var = null;
                    showDialog(new xk8(this, getParentActivity(), this.currentAccount, z, yk8Var2.f.a, false, tl8Var));
                    return;
                }
                byte b = yk8Var2.f.a;
                if (b == 29) {
                    presentFragment(new tc6());
                    return;
                }
                if (b == 32) {
                    presentFragment(new r55());
                    return;
                }
                if (b == 33) {
                    dd0 dd0Var = new dd0(null);
                    dd0Var.f = -4;
                    presentFragment(dd0Var);
                    return;
                }
                if (b == 30) {
                    presentFragment(new vt7());
                    return;
                }
                if (b == 34) {
                    presentFragment(new mg2());
                    return;
                }
                if (b == 31) {
                    presentFragment(new w09());
                    return;
                }
                if (b == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", yac.h(this.currentAccount).e());
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    presentFragment(new em6(bundle, null));
                    return;
                }
                if (b != 12) {
                    if (b == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f = true;
                        presentFragment(filtersSetupActivity);
                        return;
                    } else if (b == 36) {
                        presentFragment(new g41());
                        return;
                    } else {
                        if (b == 37) {
                            presentFragment(new n41());
                            return;
                        }
                        return;
                    }
                }
                Long i5 = lbc.i(getUserConfig().f());
                ia7 ia7Var = new ia7(this, yk8Var2, (byte) 7);
                if (this.v0 == null) {
                    d1a[] d1aVarArr = new d1a[1];
                    boolean z2 = ((float) (yk8Var2.getHeight() + yk8Var2.getTop())) > ((float) this.a.getMeasuredHeight()) / 2.0f;
                    float L = hl.L(330.0f);
                    Point point = hl.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(hl.L(324.0f), point.x * 0.95f);
                    ul ulVar2 = yk8Var2.h;
                    if (ulVar2 != null) {
                        Drawable[] drawableArr = ulVar2.f;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof wl) {
                                ((wl) drawable).n(ulVar2);
                            }
                            drawableArr[1] = null;
                        }
                        ul ulVar3 = yk8Var2.h;
                        if (ulVar3 != null) {
                            ulVar3.f();
                            yk8Var2.c();
                            Rect rect = hl.Q;
                            rect.set(yk8Var2.h.getBounds());
                            int L2 = z2 ? (hl.L(12.0f) + (-rect.centerY())) - min : (-(yk8Var2.getHeight() - rect.centerY())) - hl.L(16.0f);
                            i3 = rect.centerX() - (point.x - min2);
                            ulVar = ulVar3;
                            i2 = L2;
                        } else {
                            ulVar = ulVar3;
                            i2 = 0;
                            i3 = 0;
                        }
                        yk8Var = yk8Var2;
                    } else {
                        ulVar = null;
                        yk8Var = null;
                        i2 = 0;
                        i3 = 0;
                    }
                    int i6 = i2;
                    nl8 nl8Var = new nl8(this, this, getParentActivity(), Integer.valueOf(i3), z2 ? 12 : 0, getResourceProvider(), z2 ? 24 : 16, ia7Var, d1aVarArr);
                    nl8Var.h1 = true;
                    nl8Var.setSelected(i5);
                    nl8Var.setSaveState(3);
                    nl8Var.y(ulVar, yk8Var);
                    ol8 ol8Var = new ol8(this, nl8Var);
                    this.v0 = ol8Var;
                    d1aVarArr[0] = ol8Var;
                    ol8Var.showAsDropDown(yk8Var2, 0, i6, 53);
                    d1aVarArr[0].a();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        A0(showDialog != null);
        return showDialog;
    }

    public final void x0() {
        rl8 rl8Var;
        if (this.e0.getMeasuredWidth() == 0 || this.e0.getMeasuredHeight() == 0 || (rl8Var = this.V) == null || rl8Var.d == null) {
            return;
        }
        if (!this.i0) {
            int measuredWidth = this.e0.getMeasuredWidth();
            int measuredHeight = this.e0.getMeasuredHeight();
            al8 al8Var = this.n0;
            al8Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.m0;
            canvas.save();
            canvas.scale(100.0f / this.e0.getMeasuredWidth(), 100.0f / this.e0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.e0.getMeasuredWidth(), this.e0.getMeasuredHeight(), al8Var.f);
            canvas.restore();
            this.V.d.setBackgroundBitmap(this.l0);
            return;
        }
        int f = vm2.f(0.5f, getThemedColor(aob.Dk), getThemedColor(aob.h5));
        i94 i94Var = this.s0;
        i94 i94Var2 = this.V.d;
        if (i94Var == i94Var2 && this.t0 == f) {
            return;
        }
        this.s0 = i94Var2;
        this.t0 = f;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(f);
        this.V.d.setBackgroundBitmap(createBitmap);
    }

    public final void y0(boolean z) {
        if (this.f0 != null) {
            boolean p = getUserConfig().p();
            ArrayList arrayList = this.d;
            if (!p || this.f == null || this.e >= arrayList.size() || ((tl8) arrayList.get(this.e)).a.months >= this.f.a.months) {
                if (ob6.a0) {
                    z = false;
                }
                if (!f11.b() && (!di0.h().j() || arrayList.isEmpty() || this.e >= arrayList.size() || ((tl8) arrayList.get(this.e)).f == null)) {
                    this.f0.b(ob6.M0(2131748533, null), null, z);
                    this.L.setOnClickListener(new y00((byte) 1));
                    this.f0.setFlickerDisabled(true);
                } else {
                    if (arrayList.isEmpty() || this.e >= arrayList.size()) {
                        return;
                    }
                    this.f0.b(r0(this.currentAccount, (tl8) arrayList.get(this.e)), null, z);
                    this.L.setOnClickListener(new am7(this, (byte) 26));
                    this.f0.setFlickerDisabled(false);
                }
            }
        }
    }

    public final void z0() {
        ys4 ys4Var;
        if (this.V == null || this.actionBar == null) {
            return;
        }
        boolean z = this.i0;
        int w0 = aob.w0(null, z ? aob.G6 : aob.Kk, false);
        if (w0 != this.u0) {
            this.u0 = w0;
            this.actionBar.H(w0, true);
            this.actionBar.H(w0, false);
        }
        int i = aob.Kk;
        int o = vm2.o(aob.w0(null, i, false), 60);
        org.telegram.ui.ActionBar.a aVar = this.actionBar;
        if (aVar.q0 != o) {
            aVar.G(o, false);
        }
        this.W.a.g();
        rl8 rl8Var = this.V;
        if (rl8Var != null) {
            rl8Var.a.setTextColor(aob.w0(null, z ? aob.G6 : i, false));
            TextView textView = this.V.b;
            if (z) {
                i = aob.G6;
            }
            textView.setTextColor(aob.w0(null, i, false));
            i94 i94Var = this.V.d;
            if (i94Var != null && (ys4Var = i94Var.b) != null) {
                if (z) {
                    ys4Var.z = aob.Ok;
                    ys4Var.A = aob.Pk;
                }
                ys4Var.b();
            }
        }
        x0();
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
