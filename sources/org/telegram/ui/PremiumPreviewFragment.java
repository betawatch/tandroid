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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public class PremiumPreviewFragment extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public final ArrayList A0;
    public final RectF B0;
    public Drawable C0;
    public int D;
    public int D0;
    public int E;
    public int F;
    public int G;
    public int H;
    public Drawable I;
    public FrameLayout J;
    public FrameLayout K;
    public hs0 L;
    public ug.k1 M;
    public int N;
    public int O;
    public org.telegram.ui.Components.ly P;
    public final Paint Q;
    public LinearGradient R;
    public final Matrix S;
    public final Paint T;
    public ts0 U;
    public ug.q1 V;
    public boolean W;
    public int X;
    public int Y;
    public boolean Z;
    public org.telegram.ui.Components.pj0 a;
    public boolean a0;
    public final ArrayList b;
    public float b0;
    public final ArrayList c;
    public int c0;
    public final ArrayList d;
    public ks0 d0;
    public int e;
    public ug.p0 e0;
    public vs0 f;
    public float f0;
    public final int g0;
    public int h;
    public final boolean h0;
    public final String i0;
    public boolean j0;
    public final Bitmap k0;
    public final Canvas l0;
    public final ug.y0 m0;
    public int n;
    public final ug.y0 n0;
    public i0.b o0;
    public boolean p0;
    public float q0;
    public int r;
    public bi.qd r0;
    public int s;
    public int s0;
    int showAdsRow;
    public int t0;
    public ms0 u0;
    public dh.d v0;
    public int w;
    public final dh.g w0;
    public int x;
    public final dh.c x0;
    public int y;
    public final dh.c y0;
    public oa z0;

    public PremiumPreviewFragment(int i7, String str) {
        super(null);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        boolean z9 = false;
        this.e = 0;
        this.Q = new Paint(1);
        this.S = new Matrix();
        this.T = new Paint(1);
        Bitmap createBitmap = Bitmap.createBitmap(100, 100, Bitmap.Config.ARGB_8888);
        this.k0 = createBitmap;
        this.l0 = new Canvas(createBitmap);
        this.m0 = new ug.y0(org.telegram.ui.ActionBar.k6.Dk, org.telegram.ui.ActionBar.k6.Ek, org.telegram.ui.ActionBar.k6.Fk, org.telegram.ui.ActionBar.k6.Gk, null);
        this.o0 = i0.b.e;
        ug.y0 y0Var = new ug.y0(org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, -1, -1, null);
        this.n0 = y0Var;
        y0Var.m = true;
        y0Var.o = 0.0f;
        y0Var.p = 0.0f;
        y0Var.q = 1.0f;
        y0Var.b = 0.0f;
        y0Var.c = 0.0f;
        ArrayList arrayList = new ArrayList();
        this.A0 = arrayList;
        RectF rectF = new RectF();
        this.B0 = rectF;
        arrayList.add(rectF);
        this.g0 = i7;
        if (!org.telegram.ui.ActionBar.k6.I.q() && i7 == 1) {
            z9 = true;
        }
        this.h0 = z9;
        this.i0 = str;
        m4.d0 d0Var = new m4.d0();
        d0Var.b = this;
        d0Var.a = new Paint();
        if (Build.VERSION.SDK_INT >= 31) {
            dh.g gVar = new dh.g(true);
            this.w0 = gVar;
            ri.f fVar = new ri.f(null);
            fVar.d = gVar;
            fVar.e = -3;
            fVar.f = d0Var;
            this.x0 = new dh.c(fVar, fVar, fVar);
        } else {
            this.w0 = null;
            this.x0 = new dh.c(d0Var, d0Var, d0Var);
        }
        this.y0 = new dh.c(d0Var, d0Var, d0Var);
    }

    public static void Z(PremiumPreviewFragment premiumPreviewFragment, View view, int i7) {
        org.telegram.ui.Components.g5 g5Var;
        hs0 hs0Var;
        int i10;
        int i11;
        ArrayList arrayList = premiumPreviewFragment.d;
        int i12 = premiumPreviewFragment.g0;
        if (premiumPreviewFragment.getUserConfig().p()) {
            if (i7 == premiumPreviewFragment.showAdsRow) {
                TLRPC.UserFull b22 = premiumPreviewFragment.getMessagesController().b2(premiumPreviewFragment.getUserConfig().e());
                if (b22 == null) {
                    return;
                }
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                m8Var.setChecked(!m8Var.d());
                b22.sponsored_enabled = m8Var.d();
                TL_account.toggleSponsoredMessages togglesponsoredmessages = new TL_account.toggleSponsoredMessages();
                togglesponsoredmessages.enabled = b22.sponsored_enabled;
                premiumPreviewFragment.getConnectionsManager().sendRequest(togglesponsoredmessages, new l(premiumPreviewFragment, 17));
                premiumPreviewFragment.getMessagesStorage().j2(b22, false);
                return;
            }
            if (view instanceof hs0) {
                hs0 hs0Var2 = (hs0) view;
                if (i12 != 1 || !premiumPreviewFragment.getUserConfig().q()) {
                    v0(premiumPreviewFragment.currentAccount, hs0Var2.f.a);
                    int i13 = premiumPreviewFragment.e;
                    premiumPreviewFragment.showDialog(new ug.w0(premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), premiumPreviewFragment.currentAccount, i12 == 1, hs0Var2.f.a, false, (i13 < 0 || i13 >= arrayList.size()) ? null : (vs0) arrayList.get(premiumPreviewFragment.e)));
                    return;
                }
                int i14 = hs0Var2.f.a;
                if (i14 == 29) {
                    premiumPreviewFragment.presentFragment(new kg.a1());
                    return;
                }
                if (i14 == 32) {
                    premiumPreviewFragment.presentFragment(new kg.s0());
                    return;
                }
                if (i14 == 33) {
                    kg.c cVar = new kg.c(null);
                    cVar.f = -4;
                    premiumPreviewFragment.presentFragment(cVar);
                    return;
                }
                if (i14 == 30) {
                    premiumPreviewFragment.presentFragment(new kg.c1());
                    return;
                }
                if (i14 == 34) {
                    premiumPreviewFragment.presentFragment(new kg.q0());
                    return;
                }
                if (i14 == 31) {
                    premiumPreviewFragment.presentFragment(new kg.q1());
                    return;
                }
                if (i14 == 14) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", org.telegram.messenger.p10.i(premiumPreviewFragment.currentAccount).e());
                    bundle.putInt(TeXSymbolParser.TYPE_ATTR, 1);
                    premiumPreviewFragment.presentFragment(new org.telegram.ui.Components.u80(bundle, null));
                    return;
                }
                if (i14 != 12) {
                    if (i14 == 35) {
                        FiltersSetupActivity filtersSetupActivity = new FiltersSetupActivity();
                        filtersSetupActivity.f = true;
                        premiumPreviewFragment.presentFragment(filtersSetupActivity);
                        return;
                    } else if (i14 == 36) {
                        premiumPreviewFragment.presentFragment(new kg.m());
                        return;
                    } else {
                        if (i14 == 37) {
                            premiumPreviewFragment.presentFragment(new kg.v());
                            return;
                        }
                        return;
                    }
                }
                Long h = org.telegram.messenger.t10.h(premiumPreviewFragment.getUserConfig().f());
                bi.p5 p5Var = new bi.p5(21, premiumPreviewFragment, hs0Var2);
                if (premiumPreviewFragment.u0 == null) {
                    h11[] h11VarArr = new h11[1];
                    boolean z9 = ((float) (hs0Var2.getHeight() + hs0Var2.getTop())) > ((float) premiumPreviewFragment.a.getMeasuredHeight()) / 2.0f;
                    float L = org.telegram.messenger.g0.L(330.0f);
                    Point point = org.telegram.messenger.g0.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                    org.telegram.ui.Components.g5 g5Var2 = hs0Var2.h;
                    if (g5Var2 != null) {
                        Drawable[] drawableArr = g5Var2.f;
                        Drawable drawable = drawableArr[1];
                        if (drawable != null) {
                            if (drawable instanceof org.telegram.ui.Components.i5) {
                                ((org.telegram.ui.Components.i5) drawable).o(g5Var2);
                            }
                            drawableArr[1] = null;
                        }
                        org.telegram.ui.Components.g5 g5Var3 = hs0Var2.h;
                        if (g5Var3 != null) {
                            g5Var3.f();
                            hs0Var2.c();
                            Rect rect = org.telegram.messenger.g0.Q;
                            rect.set(hs0Var2.h.getBounds());
                            int L2 = z9 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(hs0Var2.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                            i11 = rect.centerX() - (point.x - min2);
                            g5Var = g5Var3;
                            i10 = L2;
                        } else {
                            g5Var = g5Var3;
                            i10 = 0;
                            i11 = 0;
                        }
                        hs0Var = hs0Var2;
                    } else {
                        g5Var = null;
                        hs0Var = null;
                        i10 = 0;
                        i11 = 0;
                    }
                    int i15 = i10;
                    ls0 ls0Var = new ls0(premiumPreviewFragment, premiumPreviewFragment, premiumPreviewFragment.getParentActivity(), Integer.valueOf(i11), z9 ? 12 : 0, premiumPreviewFragment.getResourceProvider(), z9 ? 24 : 16, p5Var, h11VarArr);
                    ls0Var.g1 = true;
                    ls0Var.setSelected(h);
                    ls0Var.setSaveState(3);
                    ls0Var.y(g5Var, hs0Var);
                    ms0 ms0Var = new ms0(premiumPreviewFragment, ls0Var);
                    premiumPreviewFragment.u0 = ms0Var;
                    h11VarArr[0] = ms0Var;
                    ms0Var.showAsDropDown(hs0Var2, 0, i15, 53);
                    h11VarArr[0].b();
                }
            }
        }
    }

    public static void p0(org.telegram.ui.ActionBar.f2 f2Var, vs0 vs0Var, String str, com.google.android.gms.internal.clearcut.z0 z0Var) {
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        String str2;
        TLRPC.TL_help_premiumPromo tL_help_premiumPromo;
        boolean z9 = org.telegram.messenger.r2.a;
        int currentAccount = f2Var == null ? org.telegram.messenger.p10.s0 : f2Var.getCurrentAccount();
        if (org.telegram.messenger.qp.s1(currentAccount).v2()) {
            b.b(currentAccount);
            return;
        }
        if (vs0Var == null && (tL_help_premiumPromo = org.telegram.messenger.ui.b0(currentAccount).D) != null) {
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = arrayList.get(i7);
                i7++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = tL_premiumSubscriptionOption2;
                int i10 = tL_premiumSubscriptionOption3.months;
                if (i10 == 1) {
                    vs0Var = new vs0(tL_premiumSubscriptionOption3);
                } else if (i10 == 12) {
                    vs0Var = new vs0(tL_premiumSubscriptionOption3);
                    break;
                }
            }
        }
        vs0 vs0Var2 = vs0Var;
        u0();
        if (!org.telegram.messenger.r2.b()) {
            f5.l lVar = org.telegram.messenger.r1.l;
            if (lVar == null || lVar.h.isEmpty()) {
                return;
            }
            if (vs0Var2.f == null) {
                vs0Var2.f = org.telegram.messenger.r1.l;
            }
            vs0Var2.a();
            if (vs0Var2.g == null) {
                return;
            }
            org.telegram.messenger.r1.i().p("subs", new bg.f0(f2Var, currentAccount, z0Var, vs0Var2, 8));
            return;
        }
        Activity parentActivity = f2Var != null ? f2Var.getParentActivity() : LaunchActivity.G1;
        if (parentActivity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) parentActivity;
            if (vs0Var2 != null && (tL_premiumSubscriptionOption = vs0Var2.a) != null && (str2 = tL_premiumSubscriptionOption.bot_url) != null) {
                Uri parse = Uri.parse(str2);
                if (parse.getHost().equals("t.me") && !parse.getPath().startsWith("/$") && !parse.getPath().startsWith("/invoice/")) {
                    launchActivity.W0 = true;
                }
                vf.c.t(launchActivity, tL_premiumSubscriptionOption.bot_url);
                return;
            }
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(currentAccount);
            if (TextUtils.isEmpty(s12.s6)) {
                if (TextUtils.isEmpty(s12.t6)) {
                    return;
                }
                launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/$" + s12.t6)), null);
                return;
            }
            launchActivity.W0 = true;
            launchActivity.f0(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/" + s12.s6 + "?start=" + str)), null);
        }
    }

    public static String q0(int i7) {
        switch (i7) {
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
            case org.telegram.messenger.qs.T /* 30 */:
                return "business_hours";
            case org.telegram.messenger.qs.U /* 31 */:
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

    public static void r0(int i7, ArrayList arrayList, boolean z9) {
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        SparseIntArray sparseIntArray = s12.O0;
        if (z9) {
            arrayList.add(new us0(12, R.drawable.filled_premium_status2, org.telegram.messenger.hd.M0(2131747015, null), org.telegram.messenger.hd.M0(2131747014, null)));
            arrayList.add(new us0(35, R.drawable.premium_tags, org.telegram.messenger.hd.M0(2131747001, null), org.telegram.messenger.hd.M0(2131747000, null)));
            arrayList.add(new us0(14, R.drawable.filled_premium_camera, org.telegram.messenger.hd.M0(2131747013, null), org.telegram.messenger.hd.M0(2131747012, null)));
        } else {
            arrayList.add(new us0(29, R.drawable.filled_location, org.telegram.messenger.hd.M0(2131747052, null), org.telegram.messenger.hd.M0(2131747051, null)));
            arrayList.add(new us0(30, R.drawable.filled_premium_hours, org.telegram.messenger.hd.M0(2131747050, null), org.telegram.messenger.hd.M0(2131747049, null)));
            arrayList.add(new us0(31, R.drawable.filled_open_message, org.telegram.messenger.hd.M0(2131747048, null), org.telegram.messenger.hd.M0(2131747047, null)));
            arrayList.add(new us0(32, R.drawable.premium_status, org.telegram.messenger.hd.M0(2131747056, null), org.telegram.messenger.hd.M0(2131747055, null)));
            arrayList.add(new us0(33, R.drawable.filled_premium_away, org.telegram.messenger.hd.M0(2131747063, null), org.telegram.messenger.hd.M0(2131747062, null)));
            arrayList.add(new us0(34, R.drawable.filled_premium_bots, org.telegram.messenger.hd.M0(2131747058, null), org.telegram.messenger.hd.M0(2131747057, null)));
            arrayList.add(new us0(37, R.drawable.filled_premium_chatlink, org.telegram.messenger.hd.M0(2131747061, null), org.telegram.messenger.hd.M0(2131747060, null)));
            arrayList.add(new us0(36, R.drawable.filled_premium_intro, org.telegram.messenger.hd.M0(2131747054, null), org.telegram.messenger.hd.M0(2131747053, null)));
        }
        int i10 = 0;
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((us0) arrayList.get(i11)).a, -1) == -1) {
                    boolean z10 = org.telegram.messenger.r2.a;
                }
            }
        }
        Collections.sort(arrayList, new js0(s12, i10));
    }

    public static void s0(int i7, ArrayList arrayList) {
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
        int i10 = 1;
        arrayList.add(new us0(0, R.drawable.msg_premium_limits, org.telegram.messenger.hd.M0(2131746997, null), org.telegram.messenger.hd.a0(null, null, 2131746996, Integer.valueOf(s12.E4), Integer.valueOf(s12.M4), Integer.valueOf(s12.Q4), Integer.valueOf(s12.S4), 4)));
        arrayList.add(new us0(14, R.drawable.msg_filled_stories, org.telegram.messenger.hd.M0(2131746973, null), org.telegram.messenger.hd.a0(null, null, 2131746972, new Object[0])));
        arrayList.add(new us0(1, R.drawable.msg_premium_uploads, org.telegram.messenger.hd.M0(2131746963, null), org.telegram.messenger.hd.M0(2131746962, null)));
        arrayList.add(new us0(2, R.drawable.msg_premium_speed, org.telegram.messenger.hd.M0(2131747011, null), org.telegram.messenger.hd.M0(2131747010, null)));
        arrayList.add(new us0(8, R.drawable.msg_premium_voice, org.telegram.messenger.hd.M0(2131746961, null), org.telegram.messenger.hd.M0(2131746960, null)));
        arrayList.add(new us0(3, R.drawable.msg_premium_ads, org.telegram.messenger.hd.M0(2131746991, null), org.telegram.messenger.hd.M0(2131746990, null)));
        arrayList.add(new us0(4, R.drawable.msg_premium_reactions, org.telegram.messenger.hd.M0(2131746981, null), org.telegram.messenger.hd.M0(2131746980, null)));
        arrayList.add(new us0(5, R.drawable.msg_premium_stickers, org.telegram.messenger.hd.M0(2131746975, null), org.telegram.messenger.hd.M0(2131746974, null)));
        arrayList.add(new us0(11, R.drawable.msg_premium_emoji, org.telegram.messenger.hd.M0(2131747006, null), org.telegram.messenger.hd.M0(2131747005, null)));
        arrayList.add(new us0(9, R.drawable.menu_premium_tools, org.telegram.messenger.hd.M0(2131747024, null), org.telegram.messenger.hd.M0(2131747023, null)));
        arrayList.add(new us0(6, R.drawable.msg_premium_badge, org.telegram.messenger.hd.M0(2131746986, null), org.telegram.messenger.hd.M0(2131746985, null)));
        arrayList.add(new us0(27, R.drawable.filled_messages_paid, org.telegram.messenger.hd.M0(2131746988, null), org.telegram.messenger.hd.M0(2131746987, null)));
        arrayList.add(new us0(7, R.drawable.msg_premium_avatar, org.telegram.messenger.hd.M0(2131747021, null), org.telegram.messenger.hd.M0(2131747020, null)));
        arrayList.add(new us0(24, R.drawable.premium_tags, org.telegram.messenger.hd.M0(2131746970, null), org.telegram.messenger.hd.M0(2131746968, null)));
        arrayList.add(new us0(10, R.drawable.msg_premium_icons, org.telegram.messenger.hd.M0(2131747019, null), org.telegram.messenger.hd.M0(2131747018, null)));
        arrayList.add(new us0(12, R.drawable.premium_status, org.telegram.messenger.hd.M0(2131747003, null), org.telegram.messenger.hd.M0(2131747002, null)));
        arrayList.add(new us0(13, R.drawable.msg_premium_translate, org.telegram.messenger.hd.M0(2131746965, null), org.telegram.messenger.hd.M0(2131746964, null)));
        arrayList.add(new us0(22, R.drawable.premium_wallpaper, org.telegram.messenger.hd.M0(2131746958, null), org.telegram.messenger.hd.M0(2131746957, null)));
        arrayList.add(new us0(23, R.drawable.premium_colors, org.telegram.messenger.hd.M0(2131746984, null), org.telegram.messenger.hd.M0(2131746983, null)));
        arrayList.add(new us0(26, R.drawable.menu_premium_seen, org.telegram.messenger.hd.M0(2131746999, null), org.telegram.messenger.hd.M0(2131746998, null)));
        arrayList.add(new us0(28, R.drawable.filled_premium_business, org.telegram.messenger.hd.M0(2131744253, null), org.telegram.messenger.hd.M0(2131747016, null)));
        arrayList.add(new us0(38, R.drawable.menu_premium_effects, org.telegram.messenger.hd.M0(2131747008, null), org.telegram.messenger.hd.M0(2131747007, null)));
        arrayList.add(new us0(39, R.drawable.msg_premium_icons, org.telegram.messenger.hd.M0(2131746967, null), org.telegram.messenger.hd.M0(2131746966, null)));
        arrayList.add(new us0(41, R.drawable.filled_sharing_off2_24, org.telegram.messenger.hd.M0(2131746977, null), org.telegram.messenger.hd.M0(2131746976, null)));
        arrayList.add(new us0(42, R.drawable.premium_ai_editor, org.telegram.messenger.hd.M0(2131747026, null), org.telegram.messenger.hd.M0(2131747025, null)));
        arrayList.add(new us0(43, R.drawable.premium_rich_editor, org.telegram.messenger.hd.M0(2131746979, null), org.telegram.messenger.hd.M0(2131746978, null)));
        SparseIntArray sparseIntArray = s12.N0;
        if (sparseIntArray.size() > 0) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (sparseIntArray.get(((us0) arrayList.get(i11)).a, -1) == -1) {
                    boolean z9 = org.telegram.messenger.r2.a;
                }
            }
        }
        Collections.sort(arrayList, new js0(s12, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String t0(int i7, vs0 vs0Var) {
        int i10;
        String str;
        int i11;
        String f10;
        int i12;
        boolean z9 = org.telegram.messenger.r2.a;
        if (vs0Var != null) {
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption = vs0Var.a;
            if (!org.telegram.messenger.r2.b()) {
                vs0Var.a();
                if (vs0Var.g == null) {
                    return org.telegram.messenger.hd.M0(2131748778, null);
                }
            }
            boolean q10 = org.telegram.messenger.p10.i(i7).q();
            int i13 = tL_premiumSubscriptionOption.months;
            boolean z10 = i13 > 12 && i13 % 12 == 0;
            boolean z11 = i13 == 12;
            String f11 = z11 ? vs0Var.f() : vs0Var.e();
            if (q10) {
                i10 = z11 ? 2131743808 : 2131743809;
            } else {
                if (z11) {
                    if (org.telegram.messenger.qp.s1(i7).O5) {
                        f11 = vs0Var.e();
                    } else {
                        f11 = vs0Var.d();
                        i10 = 2131744430;
                    }
                } else if (!z10) {
                    f11 = vs0Var.e();
                } else {
                    if (!org.telegram.messenger.qp.s1(i7).O5) {
                        return org.telegram.messenger.hd.a0(null, null, 2131744431, vs0Var.d(), org.telegram.messenger.hd.G(tL_premiumSubscriptionOption.months / 12, "Years", new Object[0]));
                    }
                    f11 = vs0Var.e();
                }
                i10 = 2131744436;
            }
            return org.telegram.messenger.hd.a0(null, null, i10, f11);
        }
        long j3 = 12;
        if (org.telegram.messenger.r2.b()) {
            TLRPC.TL_help_premiumPromo tL_help_premiumPromo = org.telegram.messenger.ui.b0(i7).D;
            if (tL_help_premiumPromo == null) {
                return org.telegram.messenger.hd.M0(2131744435, null);
            }
            ArrayList<TLRPC.TL_premiumSubscriptionOption> arrayList = tL_help_premiumPromo.period_options;
            int size = arrayList.size();
            int i14 = 0;
            TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption2 = null;
            while (true) {
                if (i14 >= size) {
                    break;
                }
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption3 = arrayList.get(i14);
                i14++;
                TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption4 = tL_premiumSubscriptionOption3;
                int i15 = tL_premiumSubscriptionOption4.months;
                if (i15 == 12) {
                    tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
                    break;
                }
                if (tL_premiumSubscriptionOption2 == null && i15 == 1) {
                    tL_premiumSubscriptionOption2 = tL_premiumSubscriptionOption4;
                }
            }
            if (tL_premiumSubscriptionOption2 == null) {
                return org.telegram.messenger.hd.M0(2131744435, null);
            }
            if (tL_premiumSubscriptionOption2.months != 12) {
                f10 = org.telegram.messenger.r1.i().f(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
            } else {
                if (!org.telegram.messenger.qp.s1(i7).O5) {
                    f10 = org.telegram.messenger.r1.i().f(tL_premiumSubscriptionOption2.amount, tL_premiumSubscriptionOption2.currency);
                    i12 = 2131744430;
                    return org.telegram.messenger.hd.a0(null, null, i12, f10);
                }
                f10 = org.telegram.messenger.r1.i().f(tL_premiumSubscriptionOption2.amount / 12, tL_premiumSubscriptionOption2.currency);
            }
            i12 = 2131744436;
            return org.telegram.messenger.hd.a0(null, null, i12, f10);
        }
        f5.l lVar = org.telegram.messenger.r1.l;
        if (lVar != null) {
            ArrayList arrayList2 = lVar.h;
            if (!arrayList2.isEmpty()) {
                ArrayList arrayList3 = ((f5.k) arrayList2.get(0)).b.a;
                int size2 = arrayList3.size();
                int i16 = 0;
                str = null;
                while (true) {
                    if (i16 >= size2) {
                        break;
                    }
                    Object obj = arrayList3.get(i16);
                    i16++;
                    f5.i iVar = (f5.i) obj;
                    String str2 = iVar.d;
                    String str3 = iVar.c;
                    long j10 = j3;
                    long j11 = iVar.b;
                    if (str2.equals("P1M")) {
                        str = iVar.a;
                    } else if (iVar.d.equals("P1Y")) {
                        if (org.telegram.messenger.qp.s1(i7).O5) {
                            org.telegram.messenger.r1.i().getClass();
                            str = org.telegram.messenger.r1.g(str3, 6, j11 / j10, false);
                        } else {
                            org.telegram.messenger.r1.i().getClass();
                            str = org.telegram.messenger.r1.g(str3, 6, j11, false);
                            i11 = 2131744430;
                        }
                    }
                    j3 = j10;
                }
                return str != null ? org.telegram.messenger.hd.M0(2131748778, null) : org.telegram.messenger.hd.a0(null, null, i11, str);
            }
        }
        str = null;
        i11 = 2131744436;
        if (str != null) {
        }
    }

    public static void u0() {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_accept";
        tL_inputAppEvent.data = new TLRPC.TL_jsonNull();
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(org.telegram.messenger.p10.s0).sendRequest(tL_help_saveAppLog, new di.u5(9));
    }

    public static void v0(int i7, int i10) {
        TLRPC.TL_help_saveAppLog tL_help_saveAppLog = new TLRPC.TL_help_saveAppLog();
        TLRPC.TL_inputAppEvent tL_inputAppEvent = new TLRPC.TL_inputAppEvent();
        tL_inputAppEvent.time = ConnectionsManager.getInstance(i7).getCurrentTime();
        tL_inputAppEvent.type = "premium.promo_screen_tap";
        TLRPC.TL_jsonObject tL_jsonObject = new TLRPC.TL_jsonObject();
        tL_inputAppEvent.data = tL_jsonObject;
        TLRPC.TL_jsonObjectValue tL_jsonObjectValue = new TLRPC.TL_jsonObjectValue();
        String q02 = q0(i10);
        if (q02 != null) {
            TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
            tL_jsonString.value = q02;
            tL_jsonObjectValue.value = tL_jsonString;
        } else {
            tL_jsonObjectValue.value = new TLRPC.TL_jsonNull();
        }
        tL_jsonObjectValue.key = "item";
        tL_jsonObject.value.add(tL_jsonObjectValue);
        tL_help_saveAppLog.events.add(tL_inputAppEvent);
        ConnectionsManager.getInstance(i7).sendRequest(tL_help_saveAppLog, new di.u5(9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void w0(String str) {
        TLRPC.TL_jsonNull tL_jsonNull;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(org.telegram.messenger.p10.s0);
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
        connectionsManager.sendRequest(tL_help_saveAppLog, new di.u5(9));
    }

    public final void A0(boolean z9) {
        bi.qd qdVar;
        if (z9 != this.Z) {
            this.Z = z9;
            ts0 ts0Var = this.U;
            if (ts0Var != null && (qdVar = ts0Var.d) != null) {
                qdVar.setDialogVisible(z9);
            }
            this.V.setPaused(z9);
            this.d0.invalidate();
        }
    }

    public final void B0() {
        vs0 vs0Var;
        this.y = -1;
        this.E = -1;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.G = -1;
        this.showAdsRow = -1;
        this.H = -1;
        this.h = 1;
        this.n = 1;
        int size = this.b.size() + 1;
        this.h = size;
        this.r = size;
        int i7 = this.g0;
        if (i7 == 1 && getUserConfig().q()) {
            int i10 = this.h;
            int i11 = i10 + 1;
            this.y = i10;
            int i12 = i10 + 2;
            this.h = i12;
            this.s = i11;
            this.w = i12;
            int size2 = this.c.size() + i12;
            this.h = size2;
            this.x = size2;
        }
        int i13 = this.h;
        this.D = i13;
        this.h = i13 + 2;
        this.F = i13 + 1;
        if (i7 == 1 && getUserConfig().q()) {
            int i14 = this.h;
            this.G = i14;
            this.showAdsRow = i14 + 1;
            this.h = i14 + 3;
            this.H = i14 + 2;
        }
        org.telegram.messenger.g0.Z3(this.J, (getUserConfig().q() && ((vs0Var = this.f) == null || vs0Var.a.months >= ((vs0) this.d.get(this.e)).a.months || this.p0)) ? false : true, 1.0f, true, false);
        int L = this.J.getVisibility() == 0 ? org.telegram.messenger.g0.L(64.0f) : 0;
        org.telegram.ui.Components.ly lyVar = this.P;
        lyVar.M = (this.X + L) - org.telegram.messenger.g0.L(16.0f);
        lyVar.p1();
        this.P.S = L;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean canBeginSlide() {
        bi.qd qdVar;
        ts0 ts0Var = this.U;
        return ts0Var == null || (qdVar = ts0Var.d) == null || !qdVar.a;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 2;
        this.z0 = new oa(this, i7);
        int i10 = 1;
        this.hasOwnBackground = true;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(28.0f), new int[]{1308622847, 0, 452984831}, new float[]{0.0f, 0.5f, 1.0f}, tileMode);
        Paint paint = this.Q;
        paint.setShader(linearGradient);
        paint.setStyle(Paint.Style.STROKE);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ck, false);
        int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bk, false);
        int i11 = org.telegram.ui.ActionBar.k6.Ak;
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, 100.0f, new int[]{x02, x03, org.telegram.ui.ActionBar.k6.x0(null, i11, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.zk, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.yk, false)}, new float[]{0.0f, 0.32f, 0.5f, 0.7f, 1.0f}, tileMode);
        this.R = linearGradient2;
        linearGradient2.setLocalMatrix(this.S);
        this.T.setShader(this.R);
        this.L = new hs0(context, null);
        this.M = new ug.k1(context);
        ArrayList arrayList = this.b;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        int i12 = this.g0;
        if (i12 == 0) {
            s0(this.currentAccount, arrayList);
        } else {
            r0(this.currentAccount, arrayList, false);
            r0(this.currentAccount, arrayList2, true);
            kg.t1.f(this.currentAccount).h();
            if (getUserConfig().q()) {
                TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
                org.telegram.messenger.ui.b0(this.currentAccount).m0(tL_inputStickerSetShortName, false);
                kg.f.a(this.currentAccount).c(null);
                if (getMessagesController().V0.isEmpty()) {
                    getMessagesController().d3();
                }
                kg.y d = kg.y.d(this.currentAccount);
                if (!d.d) {
                    d.e(true, false);
                }
            }
        }
        Rect rect = new Rect();
        Drawable h = jg.g.h(context, R.drawable.sheet_shadow_round);
        this.I = h;
        h.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.h5), PorterDuff.Mode.MULTIPLY));
        this.I.getPadding(rect);
        this.X = org.telegram.messenger.g0.m;
        this.d0 = new ks0(this, context);
        jh.k kVar = new jh.k(this.d0);
        ks0 ks0Var = this.d0;
        dh.c cVar = this.x0;
        cVar.h = kVar;
        cVar.i = ks0Var;
        jh.k kVar2 = new jh.k(this.d0);
        ks0 ks0Var2 = this.d0;
        dh.c cVar2 = this.y0;
        cVar2.h = kVar2;
        cVar2.i = ks0Var2;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.a = pj0Var;
        pj0Var.setClipToOutline(true);
        this.a.setOutlineProvider(new fh.a(this, 9));
        this.a.D0(new is0(this, i10));
        this.a.setCaptureSectionsDecoratorAllowed(true);
        this.a.setLegacySections(true);
        this.a.setSections(true);
        this.a.setClipToPadding(false);
        org.telegram.ui.Components.pj0 pj0Var2 = this.a;
        org.telegram.ui.Components.ly lyVar = new org.telegram.ui.Components.ly((org.telegram.messenger.g0.L(68.0f) + this.X) - org.telegram.messenger.g0.L(16.0f), this.a);
        this.P = lyVar;
        pj0Var2.setLayoutManager(lyVar);
        this.P.R = true;
        this.a.setAdapter(new os0(this));
        this.a.j(new g3(this, 25));
        this.U = new ts0(this, context);
        ug.q1 q1Var = new ug.q1(context);
        this.V = q1Var;
        q1Var.c();
        int i13 = 28;
        if (i12 == 1) {
            if (this.h0) {
                ug.p1 p1Var = this.V.a;
                p1Var.q = true;
                p1Var.K = false;
                p1Var.H = true;
                p1Var.J = true;
                p1Var.k = org.telegram.messenger.g0.L(-14.0f);
                ug.p1 p1Var2 = this.V.a;
                p1Var2.x = 2000L;
                p1Var2.y = 3000;
                p1Var2.r = 16;
                p1Var2.G = false;
                p1Var2.O = 28;
                p1Var2.Q = i11;
            } else {
                ug.p1 p1Var3 = this.V.a;
                p1Var3.J = true;
                p1Var3.k = org.telegram.messenger.g0.L(28.0f);
                ug.p1 p1Var4 = this.V.a;
                p1Var4.x = 2000L;
                p1Var4.y = 3000;
                p1Var4.r = 16;
                p1Var4.G = false;
                p1Var4.O = 28;
            }
        }
        this.U.d.setStarParticlesView(this.V);
        this.d0.addView(this.V, c8.ha.c(-2.0f, -1));
        this.d0.addView(this.U, c8.ha.c(-2.0f, -1));
        this.a.setOnItemClickListener(new h(this, 24));
        this.d0.addView(this.a, c8.ha.d(-1, -1.0f, org.telegram.messenger.qs.E1, 0.0f, 0.0f, 0.0f, -48.0f));
        this.K = new FrameLayout(context);
        ug.p0 p0Var = new ug.p0(context, getResourceProvider(), false);
        this.e0 = p0Var;
        p0Var.K = true;
        p0Var.setClickable(false);
        p0Var.w.setClickable(false);
        p0Var.setStateListAnimator(null);
        y0(false);
        this.J = new FrameLayout(context);
        this.K.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
        this.K.addView(this.e0, c8.ha.c(-1.0f, -1));
        FrameLayout frameLayout = this.K;
        fh.g c10 = cVar.c(frameLayout, null, false);
        c10.p(c8.g0.j(this.resourceProvider));
        c10.r(org.telegram.messenger.g0.L(28.0f));
        c10.q(org.telegram.messenger.g0.L(5.0f));
        frameLayout.setBackground(c10);
        c8.ka.b(this.K, 0.02f, 1.5f);
        this.J.addView(this.K, c8.ha.d(-1, 64.0f, 80, 4.0f, 0.0f, 4.0f, 0.0f));
        dh.d dVar = new dh.d(cVar.c(this.J, null, false));
        dVar.b(org.telegram.messenger.g0.L(40.0f), false);
        this.v0 = new dh.d(cVar.c(this.d0, null, false));
        this.J.setBackground(dVar);
        if (getUserConfig().p()) {
            this.d0.addView(this.J, c8.ha.e(-1, -2, 80));
        }
        this.fragmentView = this.d0;
        this.actionBar.setBackground(null);
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var == null || !((ActionBarLayout) q4Var).T0) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ux(this, i13));
        this.actionBar.setForceSkipTouches(true);
        this.d0.addView(this.actionBar, c8.ha.e(-1, -2, 48));
        z0();
        B0();
        this.U.d.m(200L);
        if (this.p0) {
            org.telegram.messenger.g0.i3(new is0(this, i7), 400L);
        }
        org.telegram.messenger.ui.b0(this.currentAccount).o1();
        w0(this.i0);
        View view = this.fragmentView;
        li0 li0Var = new li0(this, 7);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(view, li0Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.j5;
        int i12 = org.telegram.messenger.qs.g5;
        if (i7 == i11 || i7 == i12) {
            y0(false);
            this.U.a();
        }
        if (i7 == org.telegram.messenger.qs.f5 || i7 == i12) {
            this.U.b();
            this.U.a();
            B0();
            this.a.getAdapter().f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.ActionBar.o3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.o3.c;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        return c8.ma.a(new f6(16, this), org.telegram.ui.ActionBar.k6.zk, org.telegram.ui.ActionBar.k6.Ak, org.telegram.ui.ActionBar.k6.Bk, org.telegram.ui.ActionBar.k6.Ck, org.telegram.ui.ActionBar.k6.Dk, org.telegram.ui.ActionBar.k6.Ek, org.telegram.ui.ActionBar.k6.Fk, org.telegram.ui.ActionBar.k6.Gk, org.telegram.ui.ActionBar.k6.Hk, org.telegram.ui.ActionBar.k6.Jk, org.telegram.ui.ActionBar.k6.Kk, org.telegram.ui.ActionBar.k6.Ik, org.telegram.ui.ActionBar.k6.Nk);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isActionBarCrossfadeEnabled() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isLightStatusBar() {
        return this.h0;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return true;
    }

    public final void o0() {
        dh.g gVar;
        if (Build.VERSION.SDK_INT < 31 || (gVar = this.w0) == null) {
            return;
        }
        this.B0.set(0.0f, (this.fragmentView.getMeasuredHeight() - this.o0.d) - org.telegram.messenger.g0.L(132.0f), this.fragmentView.getMeasuredWidth(), org.telegram.messenger.g0.L(48.0f) + this.fragmentView.getMeasuredHeight());
        gVar.g(1, this.A0);
        gVar.e(this.z0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        A0(false);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        if (getMessagesController().D3()) {
            return false;
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.j5);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f5);
        getNotificationCenter().c(this, org.telegram.messenger.qs.g5);
        if (getMediaDataController().D != null) {
            ArrayList<TLRPC.Document> arrayList = getMediaDataController().D.videos;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                TLRPC.Document document = arrayList.get(i7);
                i7++;
                org.telegram.messenger.w7.G(this.currentAccount).X(document, getMediaDataController().D, 3, 0);
            }
        }
        if (this.g0 == 1) {
            kg.x1.b(this.currentAccount).g();
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.j5);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f5);
        getNotificationCenter().n(this, org.telegram.messenger.qs.g5);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        bi.qd qdVar;
        super.onPause();
        ts0 ts0Var = this.U;
        if (ts0Var != null && (qdVar = ts0Var.d) != null) {
            qdVar.setDialogVisible(true);
        }
        ug.q1 q1Var = this.V;
        if (q1Var != null) {
            q1Var.setPaused(true);
        }
        setBulletinDelegate(null);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        bi.qd qdVar;
        super.onResume();
        ts0 ts0Var = this.U;
        if (ts0Var != null && (qdVar = ts0Var.d) != null) {
            qdVar.setPaused(false);
            this.U.d.setDialogVisible(false);
        }
        this.V.setPaused(false);
        setBulletinDelegate(new y8(this, 7));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.h5);
        Drawable drawable = this.I;
        if (drawable != null && (drawable != this.C0 || themedColor != this.D0)) {
            this.C0 = drawable;
            this.D0 = themedColor;
            drawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        }
        try {
            ug.q1 q1Var = this.V;
            if (q1Var == null || q1Var.a == null || this.d0 == null) {
                return;
            }
            z0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final Dialog showDialog(Dialog dialog) {
        Dialog showDialog = super.showDialog(dialog);
        A0(showDialog != null);
        return showDialog;
    }

    public final void x0() {
        ts0 ts0Var;
        if (this.d0.getMeasuredWidth() == 0 || this.d0.getMeasuredHeight() == 0 || (ts0Var = this.U) == null || ts0Var.d == null) {
            return;
        }
        if (!this.h0) {
            int measuredWidth = this.d0.getMeasuredWidth();
            int measuredHeight = this.d0.getMeasuredHeight();
            ug.y0 y0Var = this.m0;
            y0Var.d(0, 0.0f, 0, measuredWidth, 0.0f, measuredHeight);
            Canvas canvas = this.l0;
            canvas.save();
            canvas.scale(100.0f / this.d0.getMeasuredWidth(), 100.0f / this.d0.getMeasuredHeight());
            canvas.drawRect(0.0f, 0.0f, this.d0.getMeasuredWidth(), this.d0.getMeasuredHeight(), y0Var.f);
            canvas.restore();
            this.U.d.setBackgroundBitmap(this.k0);
            return;
        }
        int f10 = i0.a.f(0.5f, getThemedColor(org.telegram.ui.ActionBar.k6.Ak), getThemedColor(org.telegram.ui.ActionBar.k6.h5));
        bi.qd qdVar = this.r0;
        bi.qd qdVar2 = this.U.d;
        if (qdVar == qdVar2 && this.s0 == f10) {
            return;
        }
        this.r0 = qdVar2;
        this.s0 = f10;
        Bitmap createBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawColor(f10);
        this.U.d.setBackgroundBitmap(createBitmap);
    }

    public final void y0(boolean z9) {
        if (this.e0 == null) {
            return;
        }
        boolean q10 = getUserConfig().q();
        ArrayList arrayList = this.d;
        if (!q10 || this.f == null || this.e >= arrayList.size() || ((vs0) arrayList.get(this.e)).a.months >= this.f.a.months) {
            if (org.telegram.messenger.hd.a0) {
                z9 = false;
            }
            if (!org.telegram.messenger.r2.b() && (!org.telegram.messenger.r1.i().k() || arrayList.isEmpty() || this.e >= arrayList.size() || ((vs0) arrayList.get(this.e)).f == null)) {
                this.e0.b(org.telegram.messenger.hd.M0(2131748778, null), null, z9);
                this.K.setOnClickListener(new bi.l1(19));
                this.e0.setFlickerDisabled(true);
            } else {
                if (arrayList.isEmpty() || this.e >= arrayList.size()) {
                    return;
                }
                this.e0.b(t0(this.currentAccount, (vs0) arrayList.get(this.e)), null, z9);
                this.K.setOnClickListener(new g40(this, 25));
                this.e0.setFlickerDisabled(false);
            }
        }
    }

    public final void z0() {
        vg.f fVar;
        if (this.U == null || this.actionBar == null) {
            return;
        }
        boolean z9 = this.h0;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, z9 ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.Hk, false);
        if (x02 != this.t0) {
            this.t0 = x02;
            this.actionBar.D(x02, true);
            this.actionBar.D(x02, false);
        }
        int i7 = org.telegram.ui.ActionBar.k6.Hk;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i7, false), 60);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar.p0 != o4) {
            kVar.C(o4, false);
        }
        this.V.a.g();
        ts0 ts0Var = this.U;
        if (ts0Var != null) {
            ts0Var.a.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, z9 ? org.telegram.ui.ActionBar.k6.G6 : i7, false));
            TextView textView = this.U.b;
            if (z9) {
                i7 = org.telegram.ui.ActionBar.k6.G6;
            }
            textView.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i7, false));
            bi.qd qdVar = this.U.d;
            if (qdVar != null && (fVar = qdVar.b) != null) {
                if (z9) {
                    fVar.z = org.telegram.ui.ActionBar.k6.Lk;
                    fVar.A = org.telegram.ui.ActionBar.k6.Mk;
                }
                fVar.b();
            }
        }
        x0();
    }

    public PremiumPreviewFragment() {
        this(0, "link");
    }
}
